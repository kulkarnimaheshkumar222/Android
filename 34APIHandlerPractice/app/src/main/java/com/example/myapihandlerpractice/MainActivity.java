package com.example.myapihandlerpractice;

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

import java.io.StringReader;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    RecyclerView.LayoutManager layoutManager;
    RecyclerView.Adapter adapter;
    RequestQueue requestQueue;
    ArrayList<UserModel> userList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        requestQueue = VolleySingletone.getInstance(this).getRequestQueue();
        sendAPIRequest();
        recyclerView = findViewById(R.id.recyclerViewId);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);


    }

    public void sendAPIRequest() {
        String url = "https://jsonplaceholder.typicode.com/posts";
        StringRequest stringRequest = new StringRequest(Request.Method.GET, url,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        // Do something with the response
                        userList = new ArrayList<UserModel>();
                        try {
                            JSONArray jsonArray = new JSONArray(response);
                            Log.d("Response",jsonArray.toString());
                            for (int i=0;i<jsonArray.length();i++) {
                                JSONObject jsonObject = jsonArray.getJSONObject(i);
                                int userId = jsonObject.getInt("userId");
                                int id = jsonObject.getInt("id");
                                String title = jsonObject.getString("title");
                                String body = jsonObject.getString("body");
                                UserModel userModel = new UserModel(userId,id,title,body);
                                userList.add(userModel);
                                Log.d("Response",userList.toString());
                            }
                            Log.d("Response",userList.toString());
                            adapter = new MyRecyclerAdapter(userList);
                            recyclerView.setAdapter(adapter);
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }

                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        // Handle error
                    }
                });
        requestQueue.add(stringRequest);

    }
}