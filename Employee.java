package com.company;

public class Employee {
    String name;
    double salary;
    double workHours;
    int hireYear;

    Employee(String name,double salary,double workHours,int hireYear){
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    void info () {
        System.out.println("Personel ismi : "+this.name);
        System.out.println("Brüt maaş : "+ this.salary);
        System.out.println("Fazla mesai ücreti : "+bonus());
        System.out.println("Vergi : "+tax());
        System.out.println("Kıdem zammı : "+raiseSalary());
        System.out.println("Net Maaş : "+ (this.salary-tax()+bonus()+raiseSalary()));
        System.out.println("Çalışma saati : "+this.workHours);
        System.out.println("İşe başlama tarihi : "+this.hireYear);
        System.out.println("--------------------");
    }

    public double tax(){
        double tax;
        if (this.salary<1000){
            tax = 0;
        }else {
            tax = (this.salary*3)/100;
        }
        return tax;
    }
    public double bonus(){
        double bonus = 0;
        if(this.workHours>40){
            bonus = (this.workHours-40)*30;
        }
        return bonus;
    }

    public double raiseSalary(){
        double raiseSalary=0;
        int year = 2021;
        if (year-this.hireYear<10){
            raiseSalary=this.salary*5/100;
        }else if(year-this.hireYear>9 && year-this.hireYear<20){
            raiseSalary = this.salary*10/100;
        }else if (year-this.hireYear>19){
            raiseSalary=this.salary*15/100;
        }
        return  raiseSalary;
    }
}
