package print;

public class NhanVien {

    private String maNV;
    private int soSanPham;

    public NhanVien() {
    }

    public NhanVien(String ma, int sp) {
        this.maNV = ma;
        if (sp > 0) {
            this.soSanPham = sp;
        } else {
            this.soSanPham = 0;
        }
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String ma) {
        this.maNV = ma;
    }

    public int getSoSanPham() {
        return this.soSanPham;
    }

    public void setSoSanPham(int soSanPham) {
        if (soSanPham > 0) {
            this.soSanPham = soSanPham;
        } else {
            this.soSanPham = 0;
        }
    }

    public boolean coVuotChuan() {
        if (this.soSanPham > 500) {
            return true;
        }
        return false;
    }

    public String getTongKet() {
        String kq;
        if (coVuotChuan()) {
            kq = "Vuot";
        } else {
            kq = "";
        }
        return kq;
    }

    public double getLuong() {
        double kq;
        if (coVuotChuan()) {
            kq = 500 * 20000 + (this.soSanPham - 500) * 30000;
        } else {
            kq = 20000 * this.soSanPham;
        }
        return kq;
    }

    public static void xuatTieuDe() {
        System.out.println("Mã nhân viên\tSố sản phẩm\tLương\tTổng kết");
    }

    public String toString() {
        String kq;
        xuatTieuDe();
        kq = this.maNV + "\t\t" + this.soSanPham + "\t\t" + getLuong() + "\t\t" + getTongKet();
        return kq;
    }
}
