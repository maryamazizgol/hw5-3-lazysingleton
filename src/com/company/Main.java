package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("job form:");
        Scanner scanner = new Scanner(System.in);
        System.out.println("name:");
       Jobform.getInstance().setname(scanner.next());
        System.out.println("age:");
        Jobform.getInstance().setage(scanner.next());
        System.out.println("job:");
        Jobform.getInstance().setjob(scanner.next());
        System.out.println("education:");
        Jobform.getInstance().seteducation(scanner.next());


        System.out.println("name: " + Jobform.getInstance().getname());
        System.out.println("AGE : " + Jobform.getInstance().getage());
        System.out.println("job : " + Jobform.getInstance().getJob());
        System.out.println("education : " + Jobform.getInstance().geteducation());

    }
    }

