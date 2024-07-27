package com.miguel.classes;

public class Intern extends Employee{
    private final int SALARY_LIMIT = 20000;

    //Constructor Clase com.miguel.classes.Intern
    public Intern (String name, String email, int age, int salary){
        super(name, email, age, salary);
        isIntern = true;
        validateInternSalary(salary);
    }

    public void validateInternSalary(int salary){

        if (salary > SALARY_LIMIT) {
            System.out.println("validate: El empleado: "+getName()+" esta en prácticas, su salario no puede ser superior a 20000€");
            this.salary = SALARY_LIMIT;

        }else {
            this.salary = salary;
        }

    }
}
