package com.mycompany.csc229_211review_lab02hw;

/**
 *
 * @author MoaathAlrajab
 */
public class Student extends Person{
    
    //variable unique to student class
    private double GPA;
    
    //Constuctor with 3 params 
    public Student(String name, short age, double GPA) {
        super(name, age);
        this.GPA = GPA;
    }

    public Student(String name, short age) {
        super(name,age);
    }

    //returns current value for GPA
    public double getGPA() {
        return GPA;
    }
    
    //assigns new value to GPA 
    public void setGPA(double GPA) {
        this.GPA = GPA;
    }
    
    //implimentation of abstract methods
    @Override
    public String getAddress() {
        return this.address;
    }
    
    //implimentation of abstract methods
    @Override
    public void setAddress(String address) {
        this.address = address;
    }
	
    @Override
    public String toString() {
        return "Student{" + "GPA=" + GPA + '}';
    }
    
}