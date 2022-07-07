package com.example.myweatherapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {
    Button getWeatherButton;
    TextView displayWeatherTextView;
    EditText getCityTextView;
    String baseURL = "https://api.openweathermap.org/data/2.5/weather?q=";
    String API = "&appid=3fada76bab031404be824b8037ffea5c";
    String myURL;
    RequestQueue requestQueue;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWeatherButton = (Button) findViewById(R.id.button);
        getCityTextView = (EditText) findViewById(R.id.getcitytextview);
        displayWeatherTextView = (TextView) findViewById(R.id.displayweathertext);
        requestQueue = VolleySingletone.getInstance(this).getRequestQueue();

        getWeatherButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (getCityTextView.getText().toString().equals("")) {
                    getCityTextView.setError("City Name should not be empty !!");
                } else {
                     myURL = baseURL + getCityTextView.getText().toString()+API;
                    Log.d("URL",myURL);
                    sendAPIRequest(myURL);
                }
            }
        });
    }

    public void sendAPIRequest(String myURL) {
        StringRequest stringRequest = new StringRequest(Request.Method.GET, myURL,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        // Display the first 500 characters of the response string.
                        try {
                            JSONObject jsonObject = new JSONObject(response);
                            Log.d("RESPONSE",jsonObject.toString());

                            JSONArray jsonArray =  jsonObject.getJSONArray("weather");
                            for (int i=0;i<jsonArray.length();i++){
                                JSONObject newjsonObject1 = jsonArray.getJSONObject(i);
                                String weather = newjsonObject1.getString("main");
                                displayWeatherTextView.setText("Weather at "+getCityTextView.getText().toString()+" is "+weather);
                            }

                        } catch (JSONException e) {
                            e.printStackTrace();
                        }

                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

            }
        });
        requestQueue.add(stringRequest);
    }
}