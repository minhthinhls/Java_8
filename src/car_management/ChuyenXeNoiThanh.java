package car_management;

public class ChuyenXeNoiThanh extends ChuyenXe {

    private int soTuyen;
    private double soKmDiDuoc;

    public ChuyenXeNoiThanh(int maSoChuyen, String hoTenTaiXe, String soXe,
            double doanhThu, int soTuyen, double soKmDiDuoc) {
        super(maSoChuyen, hoTenTaiXe, soXe, doanhThu);
        this.soTuyen = soTuyen;
        this.soKmDiDuoc = soKmDiDuoc;
    }

    public int getSoTuyen() {
        return soTuyen;
    }

    public void setSoTuyen(int soTuyen) {
        this.soTuyen = soTuyen;
    }

    public double getSoKmDiDuoc() {
        return soKmDiDuoc;
    }

    public void setSoKmDiDuoc(double soKmDiDuoc) {
        this.soKmDiDuoc = soKmDiDuoc;
    }

    public String show() {
        return "ChuyenXeNoiThanh [soTuyen = " + soTuyen + ", soKmDiDuoc = "
                + soKmDiDuoc + "]";
    }

}
