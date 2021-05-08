package com.demo;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {

    public static void main(String[] args) {


        //  Case : 1
        Set s=new HashSet();
        s.add(12);
        s.add(12);


        System.out.println(s);

        //  Case : 2

        Employee emp = new Employee(1,"vinita");
        Employee emp1 = new Employee(1,"vinita");
        Set s3=new HashSet();
        s3.add(emp);
        s3.add(emp1);

        System.out.println(s3);

    }

}


/*
Case 1 :

Output if we are not override hashcode and equals method in Employee Class  :

[12]
[Employee{id=1, name='vinita'}, Employee{id=1, name='vinita'}]

Case 2 :

Output if we are overrided hashcode and equals method in Employee Class :

[12]
[Employee{id=1, name='vinita'}]


 */