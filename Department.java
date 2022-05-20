public class Department {
    private int maBoPhan;
    private String tenBoPhan;
    private int soNhanVien;

    public int getMaBoPhan() {
        return maBoPhan;
    }

    public void setMaBoPhan(int maBoPhan) {
        this.maBoPhan = maBoPhan;
    }

    public String getTenBoPhan() {
        return tenBoPhan;
    }

    public void setTenBoPhan(String tenBoPhan) {
        this.tenBoPhan = tenBoPhan;
    }

    public int getSoNhanVien() {
        return soNhanVien;
    }

    public void setSoNhanVien(int soNhanVien) {
        this.soNhanVien = soNhanVien;
    }

    public void toString(int maBoPhan, int soNhanVien, String tenBoPhan) {
        System.out.println("Ma bo phan: " + maBoPhan);
        System.out.println("Ten bo phan: " + tenBoPhan);
        System.out.println("So nhan vien: " + soNhanVien);
    }
}
