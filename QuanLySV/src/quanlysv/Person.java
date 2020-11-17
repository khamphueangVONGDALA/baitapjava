
package quanlysv;

import java.awt.BorderLayout;
import java.util.Scanner;

public class Person {
    String name;
    String gender;
    String dob;
    String address;

    public Person() {
    }

    public Person(String name, String gender, String dob, String address) {
        this.name = name;
        this.gender = gender;
        this.dob = dob;
        this.address = address;
    }
    
    public void input(){
        Scanner sc=new Scanner(System.in);
        System.out.print("nhap ten: ");
        name=sc.nextLine();
        System.out.println("nhap gioi tinh: ");
        gender=sc.nextLine();
        System.out.println("nhap ngay sinh: ");
        dob=sc.nextLine();
        System.out.println("nhap dia chi: ");
        address=sc.nextLine();
        
        
    }
    
    public void showinfo(){
        System.out.print("ten: "+name+" gioi tinh: "+gender+" ngay sinh: "+dob+" dia chi: "+address);
    }





    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    
    
}
