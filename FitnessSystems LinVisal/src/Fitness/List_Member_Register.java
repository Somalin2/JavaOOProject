package Fitness;

import java.util.ArrayList;

public class List_Member_Register {
private int id;
private String name,gender,subject,time;
private float payment;
public List_Member_Register (int id, String name, String gender, String subject, float payment, String time){
this. id = id;
this.name = name;
this.gender = gender;
this. subject = subject;
this.time = time;
this.payment= payment;
}
public int getId(){
return id;
}
public String getName () {
return name;
}
public String getGender(){
    return gender;
}
public String getSubject(){
    return subject;
}
public Float getPayment(){
    return payment;
}
public String getTime(){
    return time;
}
static ArrayList<List_Member_Register> list = new ArrayList<>();
}
