package com.example.recyclerviewandintentpractice;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;


import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    public RecyclerView recyclerView;
    public RecyclerView.Adapter adapter;
    public RecyclerView.LayoutManager layoutManager;
    RequestQueue requestQueue;
    ArrayList<EmployeeModel> employeeModels;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        requestQueue = VolleySingletone.getInstance(this).getRequestQueue();
        getDigitalDiary("42251","125207","ShowNotification"
        );
        recyclerView = findViewById(R.id.recyclerView_id);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);


    }

    public void getDigitalDiary(String UserID, String NotificationID,
                                 String Command){
        String url = "http://173.254.193.9/VCard_Live_TestingAPI/api/Notification/GetNotification"; // <----enter your post url here
        StringRequest MyStringRequest = new StringRequest(Request.Method.POST, url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                //This code is executed if the server responds, whether or not the response contains data.
                //The String 'response' contains the server's response.
                employeeModels = new ArrayList<EmployeeModel>();
                try {
                    JSONObject jsonObj = new JSONObject(response);
                    JSONArray jsonArray = jsonObj.getJSONArray("Table");
                    for(int i=0;i<jsonArray.length();i++) {
                        JSONObject jsonObject = jsonArray.getJSONObject(i);
                        String NotificationID = jsonObject.getString("NotificationID");
                        String AssociationName = jsonObject.getString("AssociationName");
                        String Title = jsonObject.getString("Title");
                        String Message = jsonObject.getString("Message");
                        String Date = jsonObject.getString("Date");
                        String Time = jsonObject.getString("Time");

                        EmployeeModel employeeModel = new EmployeeModel(NotificationID,AssociationName,Title
                        ,Message,Date,Time);
                        employeeModels.add(employeeModel);

                    }
                    Log.d("Response",String.valueOf(employeeModels.toString()));
                    adapter = new RecyclerViewAdapter(employeeModels);
                    recyclerView.setAdapter(adapter);
                } catch (JSONException e) {
                    e.printStackTrace();
                }


            }
        }, new Response.ErrorListener() { //Create an error listener to handle errors appropriately.
            @Override
            public void onErrorResponse(VolleyError error) {
                //This code is executed if there is an error.
            }
        }) {

            @Override
            public byte[] getBody() {
                HashMap<String, String> params2 = new HashMap<String, String>();

                params2.put("NotificationID",NotificationID);
                // params2.put("UserID",String.valueOf(Util.CredentialId));
                params2.put("UserID",UserID);
                params2.put("Command","ShowNotification");



                Log.v("requestpar", String.valueOf(params2));
                return new JSONObject(params2).toString().getBytes();
            }

            @Override
            public String getBodyContentType() {
                return "application/json; charset=utf-8";
            }

        };
        requestQueue.add(MyStringRequest);
    }
}