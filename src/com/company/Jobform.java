package com.company;

/**
 * Created by MM on 02/11/2019.
 */
public class Jobform {
    private  String name ;
    private  String age ;
    private  String job ;
    private  String education ;

    private Jobform(){}

    private static Jobform ourInstance = new Jobform();

    public  static Jobform getInstance() {
        return ourInstance;

    }

    public void setname(String jub) {

        this.name = name;
    }

    public String getname() {

        return name;
    }

    public void setage(String next) {

        this.age = age;
    }

    public  String getage() {

        return age;
    }

    public  void setjob(String age) {
        this.job = job;
    }

    public String getJob() {

        return job;
    }


    public void seteducation(String education) {

        this.education = education;
    }

    public String geteducation() {
        return education;
    }




}
