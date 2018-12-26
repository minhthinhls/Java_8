package car_management;

public class ChuyenXeNgoaiThanh extends ChuyenXe {

    private String noiDen;
    private double soNgayDiDuoc;

    public ChuyenXeNgoaiThanh(int maSoChuyen, String hoTenTaiXe, String soXe,
            double doanhThu, String noiDen, double soNgayDiDuoc) {
        super(maSoChuyen, hoTenTaiXe, soXe, doanhThu);
        this.noiDen = noiDen;
        this.soNgayDiDuoc = soNgayDiDuoc;
    }

    public String getNoiDen() {
        return noiDen;
    }

    public void setNoiDen(String noiDen) {
        this.noiDen = noiDen;
    }

    public double getSoNgayDiDuoc() {
        return soNgayDiDuoc;
    }

    public void setSoNgayDiDuoc(double soNgayDiDuoc) {
        this.soNgayDiDuoc = soNgayDiDuoc;
    }

    public String show() {
        return "ChuyenXeNgoaiThanh [noiDen = " + noiDen + ", soNgayDiDuoc = "
                + soNgayDiDuoc + "]";
    }

}
