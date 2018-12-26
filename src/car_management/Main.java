package car_management;

public class Main {

    public static void main(String[] args) {
        QuanLyChuyenXe qlcx = new QuanLyChuyenXe();
        qlcx.themChuyenXe(new ChuyenXeNgoaiThanh(571, "Nguyen A", "79N - 001.23", 15, "Nha Trang", 1));
        qlcx.themChuyenXe(new ChuyenXeNoiThanh(577, "Tran B", "asd1534", 20, 5, 20.5));
        qlcx.themChuyenXe(new ChuyenXeNgoaiThanh(578, "Vo Van Chuong", "73B- 121.15", 11, "Quang Binh", 2));
        qlcx.themChuyenXe(new ChuyenXeNoiThanh(579, "Do Thanh Dat", "as4545", 9, 8, 52));

        qlcx.sapXepTheoDoanhThu();
        System.out.println(qlcx.show());
        System.out.println("Tong doanh thu xe ngoai thanh: " + qlcx.tongDoanhThuXeNgoaiThanh());
        System.out.println("Tong doanh thu xe ngoai thanh: " + qlcx.tongDoanhThuXeNoiThanh());
    }
}
