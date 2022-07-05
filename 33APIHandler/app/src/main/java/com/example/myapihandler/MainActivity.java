package com.example.myapihandler;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.android.volley.*;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

//http://myjson.dit.upm.es/api/bins/bzpf
public class MainActivity extends AppCompatActivity {

   private TextView textView;
   private Button button;
   private RequestQueue requestQueue;

   ArrayList<UserModel> arrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textView);
        button = findViewById(R.id.button);

        requestQueue = Volley.newRequestQueue(this);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sendAPIRequest();
            }
        });


    }

    public void  sendAPIRequest() {

        String url = "https://jsonplaceholder.typicode.com/todos";
        
        StringRequest request = new StringRequest(Request.Method.GET, url, new Response.Listener<String>() {

            @Override
            public void onResponse(String arg0) {
                // TODO Auto-generated method stub
               // Log.d("RESPONSE","Response Done"+arg0);
                arrayList = new ArrayList<UserModel>();
                try {
                    JSONArray jsonArray = new JSONArray(arg0);
                    for(int i=0;i<jsonArray.length();i++) {
                        JSONObject jsonObject = jsonArray.getJSONObject(i);
                        String title = jsonObject.getString("title");
                        int id = jsonObject.getInt("id");
                        int userId = jsonObject.getInt("userId");
                        UserModel userModel = new UserModel(userId,id,title);
                        arrayList.add(userModel);
                        Log.d("ArrayList",arrayList.toString());
                    }

                } catch (JSONException e) {
                    e.printStackTrace();
                }


            }
        }, new Response.ErrorListener() {

            @Override
            public void onErrorResponse(VolleyError arg0) {
                // TODO Auto-generated method stub

            }
        });
          requestQueue.add(request);


    }
}