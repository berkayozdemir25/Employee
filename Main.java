package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Employee berkay = new Employee("Berkay",999,39,2015);

        Employee kadir = new Employee("Kadir",2500,50,2002);

        kadir.info();

        //berkay.info();

        //System.out.println("Net maaş :"+ (berkay.salary-berkay.tax()+berkay.bonus()));
        //System.out.println(berkay.bonus());
    }
}
