package com.example.jsonproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Gson gson = new Gson();
      // Object to JSON Conversion
        /*
        Student student = new Student("Mahesh",
                "mahesh@gmail.com",5);
        String json = gson.toJson(student);
        Log.d("TEST",json);
         */
        //  JSON to Object Conversion
        /*
        String json = "{\n" +
                "\"course_Count\":5,\n" +
                "\"email\":\"mahesh@gmail.com\",\n" +
                "\"name\":\"Mahesh\"\n" +
                "}";

        Student student = gson.fromJson(json,Student.class);
        Log.d("TEST",student.toString());

         */
 // Object Inside Object
        /*
        Course course = new Course("Android","Android Course Desscription");
        Student student = new Student("Mahesh","mahesh@gmail.com",10,course);

        String json = gson.toJson(student);
        Log.d("TEST",json);


        String json = "{\"course_Count\":10,\"email\":\"mahesh@gmail.com\",\"course\":{\"description\":\"Android Course Desscription\",\"name\":\"Android\"},\"name\":\"Mahesh\"}";
       Student student = gson.fromJson(json,Student.class);
        Log.d("TEST",student.toString());
        */

        // Array in Object
        /*
        Course course = new Course("Android","Android Course Desscription");
        List<Video> videoList = new ArrayList<>();
        videoList.add(new Video("Intro1",4));
        videoList.add(new Video("Intro2",14));
        videoList.add(new Video("Intro3",24));
        videoList.add(new Video("Intro4",34));
        videoList.add(new Video("Intro5",44));

        Student student = new Student("Mahesh","mahesh@gmail.com",10,course,videoList);

        String json = gson.toJson(student);
        Log.d("TEST",json);
*/
        String json = "{\"course_Count\":10,\"email\":\"mahesh@gmail.com\",\"course\":{\"description\":\"Android Course Desscription\",\"name\":\"Android\"},\"video\":[{\"duration\":4,\"name\":\"Intro1\"},{\"duration\":14,\"name\":\"Intro2\"},{\"duration\":24,\"name\":\"Intro3\"},{\"duration\":34,\"name\":\"Intro4\"},{\"duration\":44,\"name\":\"Intro5\"}],\"name\":\"Mahesh\"}";

        Student student = gson.fromJson(json,Student.class);
        Log.d("TEST",student.toString());
    }
}