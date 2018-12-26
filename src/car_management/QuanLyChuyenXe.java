package car_management;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class QuanLyChuyenXe {

    private ArrayList<ChuyenXe> dscx;

    public QuanLyChuyenXe() {
        dscx = new ArrayList<>();
    }

    //them chuyen xe
    public void themChuyenXe(ChuyenXe cx) {
        dscx.add(cx);
    }

    //xuat chuyen xe
    public String show() {
        String kq = "\t\t\tDANH SACH CHUYEN XE\n";
        double tongDoanhThu = 0.0;

        kq += String.format("%-10s%-10s%-25s%-25s%-25s", "STT", "Ma", "Ten Tai Xe", "Loai", "Doanh Thu");
        for (int i = 0; i < dscx.size(); i++) {
            ChuyenXe cx = dscx.get(i);
            String loai;
            if (cx instanceof ChuyenXeNgoaiThanh) {
                loai = "Ngoai Thanh";
            } else {
                loai = "Noi Thanh";
            }
            kq += String.format("\n%-10s%-10s%-25s%-25s%-25s", i + 1, cx.maSoChuyen, cx.hoTenTaiXe, loai, cx.doanhThu);
            tongDoanhThu += cx.doanhThu;
        }
        kq += "\nTong doanh thu: " + tongDoanhThu;
        return kq;
    }

    //xoa chuyen xe
    public void xoaChuyenXe(int ma) {
        for (int i = 0; i < dscx.size(); i++) {
            ChuyenXe cx = dscx.get(i);
            if (cx.maSoChuyen == ma) {
                dscx.remove(i);
            }
        }
    }

    //tong doanh thu xe ngoai thanh
    public double tongDoanhThuXeNgoaiThanh() {
        double tong = 0;
        for (int i = 0; i < dscx.size(); i++) {
            ChuyenXe cx = dscx.get(i);
            if (cx instanceof ChuyenXeNgoaiThanh) {
                tong += cx.doanhThu;
            }
        }
        return tong;
    }

    //tong doanh thu xe noi thanh
    public double tongDoanhThuXeNoiThanh() {
        double tong = 0;
        for (int i = 0; i < dscx.size(); i++) {
            ChuyenXe cx = dscx.get(i);
            if (cx instanceof ChuyenXeNoiThanh) {
                tong += cx.doanhThu;
            }
        }
        return tong;
    }

    public ArrayList<ChuyenXe> sapXepTheoDoanhThu() {
        Set<ChuyenXe> SortedCars = new TreeSet<>((car1, car2) -> {
            double income_1 = car1.getDoanhThu();
            double income_2 = car2.getDoanhThu();
            if (income_1 == income_2) {
                return 1;
            } else {
                return Double.valueOf(income_1).compareTo(income_2);
            }
        });
        SortedCars.addAll(this.dscx);
        List<ChuyenXe> targetList = new ArrayList<>(SortedCars);
        this.dscx = (ArrayList<ChuyenXe>) targetList;
        return this.dscx;
    }

}
