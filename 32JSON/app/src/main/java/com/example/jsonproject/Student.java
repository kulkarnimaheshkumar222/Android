package com.example.jsonproject;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Student {
    private String name;
    private String email;
    @SerializedName("course_Count")
    private int courseCount;
    @SerializedName("course")
    private Course mcourse;
    @SerializedName("video")
    private List<Video> mvideo;

    public Student(String name, String email, int course_Count,Course course,List<Video>video) {
        this.name = name;
        this.email = email;
        this.courseCount = course_Count;
        this.mcourse = course;
        this.mvideo = video;
    }
}
