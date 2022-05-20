public abstract class Staff {
    private String tenNhanVien;
    private int maNhanVien;
    private int tuoiNhanVien;
    protected int heSoLuong;
    private String ngayVaoLam;
    private String boPhanLamViec;
    private int soNgayNghiPhep;

    public Staff(String tenNhanVien, int maNhanVien, int tuoiNhanVien, int heSoLuong, String ngayVaoLam,
            String boPhanLamViec, int soNgayNghiPhep) {
        this.tenNhanVien = tenNhanVien;
        this.maNhanVien = maNhanVien;
        this.tuoiNhanVien = tuoiNhanVien;
        this.heSoLuong = heSoLuong;
        this.ngayVaoLam = ngayVaoLam;
        this.boPhanLamViec = boPhanLamViec;
        this.soNgayNghiPhep = soNgayNghiPhep;
    }

    public void setTenNhanVien(String tenNhanVien) {
        this.tenNhanVien = tenNhanVien;
    }

    public String getTenNhanVien() {
        return tenNhanVien;
    }

    public void setMaNhanVien(int maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    public int getMaNhanVien() {
        return maNhanVien;
    }

    public void setTuoiNhanVien(int tuoiNhanVien) {
        this.tuoiNhanVien = tuoiNhanVien;
    }

    public int getTuoiNhanVien() {
        return tuoiNhanVien;
    }

    public void setHeSoLuong(int heSoLuong) {
        this.heSoLuong = heSoLuong;
    }

    public int getHeSoLuong() {
        return heSoLuong;
    }

    public void setNgayVaoLam(String ngayVaoLam) {
        this.ngayVaoLam = ngayVaoLam;
    }

    public String getNgayVaoLam() {
        return ngayVaoLam;
    }

    public void setBoPhanLamViec(String boPhanLamViec) {
        this.boPhanLamViec = boPhanLamViec;
    }

    public String getBoPhanLamViec() {
        return boPhanLamViec;
    }

    public void setSoNgayNghiPhep(int soNgayNghiPhep) {
        this.soNgayNghiPhep = soNgayNghiPhep;
    }

    public int getSoNgayNghiPhep() {
        return soNgayNghiPhep;
    }

    public double calculateSalary() {
        return 0;

    }

    public abstract void displayInfomation();
}