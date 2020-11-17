package quanlysv;

import java.awt.BorderLayout;
import java.util.Scanner;

public class SinhVien extends Person {

    String id;
    float dtb;
    String email;

    @Override
    public void input() {
        super.input();
        Scanner sc = new Scanner(System.in);

        System.out.println("nhap id: ");
        id=sc.nextLine();
//        while (true) {
//            boolean check = setId(id = sc.nextLine());
//            if (check) {
//                break;
//            }
//        }

        System.out.println("nhapd diem trung binh: ");
        dtb = Float.parseFloat(sc.nextLine());

        System.out.println("nhap email: ");
        email = sc.nextLine();            
        
    }
        


    

    public SinhVien() {
    }

    @Override
    public void showinfo() {
        super.showinfo();
        System.out.print(" id: " + id + " dob: " + dtb + " email:" + email);
        System.out.println("");
    }

    public SinhVien(String id, float dtb, String email) {
        this.id = id;
        this.dtb = dtb;
        this.email = email;
    }

    public SinhVien(String id, float dtb, String email, String name, String gender, String dob, String address) {
        super(name, gender, dob, address);
        this.id = id;
        this.dtb = dtb;
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public boolean setId(String id) {
        if (id != null && id.length() == 8) {
            this.id = id;
            return true;
        } else {
            System.err.println("nhap lai id!!!!!");
            return false;
        }

    }

    public float getDtb() {
        return dtb;
    }

    public void setDtb(float dtb) {
        this.dtb = dtb;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email.contains("@") && !email.contains(" ") && email != null) {
            this.email = email;
        } else {
            System.out.println("nhap lai email!!!!!!!!!");
        }

    }

}
