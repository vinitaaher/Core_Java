package com.demo;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

    public static void main(String[] args) {


        // Case : 1

        Integer i = new Integer(10);
        Integer i1 = new Integer(10);

        Map map1 = new HashMap();
        map1.put(i,"vinita");   // same keys (Integer) already override hashcodes and equals methods.
        map1.put(i1,"pawan");

        System.out.println(map1);


        //  Case : 2

        Employee emp = new Employee(2,"vinita");

        Employee emp1 = new Employee(2,"vinita");



        Map map = new HashMap();
        map.put(emp,"Vinita");
        map.put(emp1,"pawan");


        System.out.println(map);


    }
}
/*
Case 1 :
Output if we are not override hashcode and equals method in Employee Class  :

{10=pawan}
{Employee{id=2, name='vinita'}=pawan}

Case 2 :

Output if we are overrided hashcode and equals method in Employee Class :

{10=pawan}
{Employee{id=2, name='vinita'}=pawan, Employee{id=2, name='vinita'}=Vinita}


 */