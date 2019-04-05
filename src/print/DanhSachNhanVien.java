package print;

import java.util.ArrayList;

public class DanhSachNhanVien {

    private ArrayList<NhanVien> nhanvienList;

    public DanhSachNhanVien() {
        nhanvienList = new ArrayList<>();
    }

    public void addNhanVien(NhanVien nv) {
        nhanvienList.add(nv);
    }

    public void printNV() {
        System.out.println(String.format("%-20s%-20s%-20s%-20s", "MaNhanVien", "SoSanPham", "Luong", "TongKet"));
        for (NhanVien nv : nhanvienList) {
            System.out.println(String.format("%-20s%-20s%-20s%-20s", nv.getMaNV(), nv.getSoSanPham(), nv.getLuong(), nv.getTongKet()));
        }
    }

    public int getTongNV() {
        int tongNV = nhanvienList.size();
        return tongNV;
    }

    public NhanVien getNVCoSSPVuotChuan() {
        int index = 0;
        for (int i = 0; i < nhanvienList.size(); i++) {
            NhanVien nv = nhanvienList.get(i);
            if (nv.coVuotChuan()) {
                index = i;
            }
        }
        return nhanvienList.get(index);
    }

    public int soNVKhongVuotChuan() {
        int dem = 0;
        for (NhanVien nv : nhanvienList) {
            if (nv.coVuotChuan() == false) {
                dem++;
            }
        }
        return dem;
    }

    public double tongLuongNVVuotChuan() {
        double tongLuong = 0;
        for (NhanVien nv : nhanvienList) {
            if (nv.coVuotChuan()) {
                tongLuong += nv.getLuong();
            }
        }
        return tongLuong;
    }

    public NhanVien getNVCoSSPMin() {
        int index = 0;
        int min = nhanvienList.get(0).getSoSanPham();
        for (int i = 0; i < nhanvienList.size(); i++) {
            NhanVien nv = nhanvienList.get(i);
            if (nv.getSoSanPham() < min) {
                min = nv.getSoSanPham();
                index = i;
            }
        }
        return nhanvienList.get(index);
    }

    public NhanVien getNVCoLuongMax() {
        int index = 0;
        double max = nhanvienList.get(0).getLuong();
        for (int i = 0; i < nhanvienList.size(); i++) {
            NhanVien nv = nhanvienList.get(i);
            if (nv.getLuong() > max) {
                max = nv.getLuong();
                index = i;
            }
        }
        return nhanvienList.get(index);
    }

    public NhanVien getNVKhongVuotChuanCoLuongMax() {
        int index = 0;
        double max = nhanvienList.get(0).getLuong();
        for (int i = 0; i < nhanvienList.size(); i++) {
            NhanVien nv = nhanvienList.get(i);
            if (nv.coVuotChuan() == false) {
                if (nv.getLuong() > max) {
                    max = nv.getLuong();
                    index = i;
                }
            }
        }
        return nhanvienList.get(index);
    }

    public double tongLuongNV() {
        double tongLuong = 0;
        for (NhanVien nv : nhanvienList) {
            tongLuong += nv.getLuong();
        }
        return tongLuong;
    }

    public NhanVien searchByMaNV(String maNV) {
        int index = 0;
        for (int i = 0; i < nhanvienList.size(); i++) {
            NhanVien nv = nhanvienList.get(i);
            if (nv.getMaNV().equals(maNV)) {
                index = i;
            }
        }
        return nhanvienList.get(index);
    }

    public void insertOrderedList(NhanVien nv, ArrayList<NhanVien> list) {
        boolean b = false;
        for (int i = 0; i < list.size(); i++) {
            NhanVien nv1 = list.get(i);
            if (nv1.getSoSanPham() > nv.getSoSanPham()) {
                list.add(i, nv);
                b = true;
            }
        }
        if (b == false) {
            list.add(nv);
        }
    }

    public void sort() {
        ArrayList<NhanVien> kq = new ArrayList<>();
        for (NhanVien nv : nhanvienList) {
            insertOrderedList(nv, kq);
        }
        nhanvienList = kq;
    }

    public void removeNV(int index) {
        nhanvienList.remove(index);
    }

}
