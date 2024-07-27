package com.miguel;

import com.miguel.classes.Employee;
import com.miguel.classes.Intern;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        File file= new File("employees.txt"); //Crea el archivo employees.txt
        FileWriter writer = new FileWriter(file, false); //Para escribir en el archivo employees.txt
        writer.write( "Nombre  ||         Email       ||Edad||Salario||En prácticas\n");
        writer.write( " ===========================================================\n");
        writer.close();

        Employee employee1 = new Employee("Antonio", "antonio@ironhack.es", 23, 25000);
        Employee employee2 = new Employee("Lucia  ", "lucia@ironhack.es  ", 34, 21000);
        Employee employee3 = new Employee("Mayte  ", "mayte@ironhack.es  ", 21, 22000);
        Employee employee4 = new Employee("Lucas  ", "lucas@ironhack.es  ", 37, 25600);
        Employee employee5 = new Employee("Miguel ", "miguel@ironhack.es ", 40, 18500);
        Employee employee6 = new Employee("Sandra ", "sandra@ironhack.es ", 47, 23300);
        Employee employee7 = new Employee("Maria  ", "maria@ironhack.es  ", 27, 22700);
        Employee employee8 = new Employee("Jose   ", "jose@ironhack.es   ", 54, 19900);
        Employee employee9 = new Employee("Marcos ", "marcos@ironhack.es ", 42, 35000);
        Employee employee10 = new Employee("Sara   ", "sara@ironhack.es   ", 33, 32000);

        Intern intern1 = new Intern("Pedro  ", "pedro@ironhack.es  ", 18, 30000);
        Intern intern2 = new Intern("Monica ", "monica@ironhack.es ", 19, 15000);
        Intern intern3 = new Intern("juan   ", "juan@ironhack.es   ", 22, 25000);

        employee1.setSalary(120000);
        intern3.setSalary(50000);
        employee5.setAge(44);
        intern1.setEmail("pedrote@ironhack.es");

        employee1.getEmployeeDetails();
        employee9.getEmployeeDetails();
        intern3.getEmployeeDetails();

        employee1.addEmployee(file);
        employee2.addEmployee(file);
        employee3.addEmployee(file);
        employee4.addEmployee(file);
        employee5.addEmployee(file);
        employee6.addEmployee(file);
        employee7.addEmployee(file);
        employee8.addEmployee(file);
        employee9.addEmployee(file);
        employee10.addEmployee(file);
        intern1.addEmployee(file);
        intern2.addEmployee(file);
        intern3.addEmployee(file);
    }
}