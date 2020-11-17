package quanlysv;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLySV {

    public static void main(String[] args) {
        ArrayList<SinhVien> listsinhvien = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        int choose;

        do {
            menu();
            choose = Integer.parseInt(sc.nextLine());

            switch (choose) {
                case 1:
                    int n;
                    System.out.println("nhap vao so sinh vien: ");
                    n=Integer.parseInt(sc.nextLine());
 

                    for (int i = 0; i < n; i++) {
                   SinhVien sv=new SinhVien();                        
                    sv.input();                        
                    listsinhvien.add(sv);                        
                    }

                    break;
                case 2:
                    for (int i = 0; i < listsinhvien.size(); i++) {
                        listsinhvien.get(i).showinfo();
                    }
                    
                    break;
                case 3:

                    break;
                default:
                    System.out.println("nhap sai");
                    break;

            }

        } while (choose != 3);
        {
            System.out.println("chuong trinh ket thuc");
        }

    }

    static void menu() {
        System.out.println("1.them sinh vien : ");
        System.out.println("2.hien thi thong tin sinh vien  ");
        System.out.println("3.thoat");
    }
}
