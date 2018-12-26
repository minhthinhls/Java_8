package print;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        NhanVien nhanvien = new NhanVien();
        DanhSachNhanVien danhSach = new DanhSachNhanVien();
        String id;
        int ssp;
        int n;
        System.out.print("Nhap so nhan vien: ");
        n = input.nextInt();

        for (int i = 0; i < n; i++) {
            input.nextLine();
            System.out.print("Nhap ma nhan vien: ");
            id = input.nextLine();
            System.out.print("Nhap so san pham: ");
            ssp = input.nextInt();
            nhanvien = new NhanVien(id, ssp);
            danhSach.addNhanVien(nhanvien);
        }
        input.close();
        danhSach.printNV();
        danhSach.getTongNV();
        
    }
}
