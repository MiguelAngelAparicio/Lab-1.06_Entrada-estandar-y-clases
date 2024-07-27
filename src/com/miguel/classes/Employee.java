package com.miguel.classes;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Employee {

    protected String name;
    protected String email;
    protected int age;
    protected int salary;
    protected boolean isIntern;

    //Constructor Clase com.miguel.classes.Employee
    public Employee(String name, String email, int age, int salary){
            this.name = name;
            this.email = email;
            this.age = age;
            this.salary = salary;
            this.isIntern = false;
    }

    //Metodos
    //Getters
    public String getName() { return name; }
    public String getEmail() { return email; }
    public int getAge() {return age;}
    public int getSalary() {return salary;}
    public boolean getIsIntern() { return isIntern; }

    public void getEmployeeDetails() { //Nos ofrece un resumen de los datos de un empleado
        System.out.println("====================");
        System.out.println("Nombre:        " + name);
        System.out.println("Email:         " + email);
        System.out.println("Edad:          " + age);
        System.out.println("Salario:       " + salary+"€");
        if (getIsIntern()) {
            System.out.println("Empleado en prácticas");
        }
        System.out.println("isIntern: "+ getIsIntern());
        System.out.println("====================");
    }

    //Imprime todos los detalles en formato String, generado automaticamente con toString
//    @Override
//    public String toString() {
//        return "Employee{" +
//                "name='" + name + '\'' +
//                ", email='" + email + '\'' +
//                ", age=" + age +
//                ", salary=" + salary +
//                ", isIntern=" + isIntern +
//                '}';
//    }

    //Setters
    public void setName(String name){
        this.name = name;
        System.out.println("El nombre del empleado "+getName()+" ha sido cambiado con exito a: "+ name);
    }
    public void setEmail(String email){
        this.email = email;
        System.out.println("El Email del empleado "+getName()+" ha sido cambiado con exito a: "+ email);
    }
    public void setAge(int age){
        this.age = age;
        System.out.println("La edad del empleado "+getName()+" ha sido cambiado con exito a: "+ age);
    }
    public void setSalary(int salary){

        if (getIsIntern() && salary > 20000) {
            System.out.println("setsalary: El empleado "+getName()+" esta en prácticas, su salario no puede ser superior a 20000€");
            this.salary = 20000;
        }else {
            this.salary = salary;
            System.out.println("setSalary: El salario del empleado " + getName() + " ha sido cambiado con exito a: " + salary);
        }
    }

    //Other methods
    public void addEmployee(File file) throws IOException { //Añade empleados al archivo employees.txt
        FileWriter writer = new FileWriter(file, true); //Para escribir en el archivo employees.txt
        writer.write(getName()+ " || " + getEmail()+ " || " + getAge()+ " || " + getSalary()+ " || " + getIsIntern()+"\n");
        writer.close();
    }

}
