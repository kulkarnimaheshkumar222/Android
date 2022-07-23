package com.example.recyclerviewandintentpractice;

public class EmployeeModel {
    String NotificationID;
    String AssociationName;
    String Title;
    String Message;
    String Date;
    String Time;

    public EmployeeModel(String notificationID, String associationName,
                         String title, String message,
                         String date, String time) {
        NotificationID = notificationID;
        AssociationName = associationName;
        Title = title;
        Message = message;
        Date = date;
        Time = time;
    }

    public String getNotificationID() {
        return NotificationID;
    }

    public String getAssociationName() {
        return AssociationName;
    }

    public String getTitle() {
        return Title;
    }

    public String getMessage() {
        return Message;
    }

    public String getDate() {
        return Date;
    }

    public String getTime() {
        return Time;
    }

    public void setNotificationID(String notificationID) {
        NotificationID = notificationID;
    }

    public void setAssociationName(String associationName) {
        AssociationName = associationName;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public void setMessage(String message) {
        Message = message;
    }

    public void setDate(String date) {
        Date = date;
    }

    public void setTime(String time) {
        Time = time;
    }
}
