package com.example.jsonproject;

import com.google.gson.annotations.SerializedName;

public class Course {
    @SerializedName("name")
    private String mname;
    @SerializedName("description")
    private String mdescription;

    public Course(String mname, String mdescription) {
        this.mname = mname;
        this.mdescription = mdescription;
    }
}
