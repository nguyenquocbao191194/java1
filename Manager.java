public class Manager extends Staff implements ICalculator {
    private String chucDanh;

    public Manager(String tenNhanVien, int maNhanVien, int tuoiNhanVien, int heSoLuong, String ngayVaoLam,
            String boPhanLamViec, int soNgayNghiPhep, String chucDanh) {
        super(tenNhanVien, maNhanVien, tuoiNhanVien, heSoLuong, ngayVaoLam, boPhanLamViec, soNgayNghiPhep);
        this.chucDanh = chucDanh;
    }

    public String getChucDanh() {
        return chucDanh;
    }

    public void setChucDanh(String chucDanh) {
        this.chucDanh = chucDanh;
    }

    public void caculateSalary() {

    }

    public void displayInfomation() {
        System.out.println("Ma nhan vien: " + super.getMaNhanVien());
        System.out.println("Ten: " + super.getTenNhanVien());
        System.out.println("Chuc danh: " + getChucDanh());
        System.out.println("Tuoi: " + super.getTuoiNhanVien());
        System.out.println("He so luong: " + super.getHeSoLuong());
        System.out.println("Bo phan lam viec: " + super.getBoPhanLamViec());
        System.out.println("ngay vao lam: " + super.getNgayVaoLam());
        System.out.println("so ngay nghi phep: " + super.getSoNgayNghiPhep());
        System.out.println("Luong NV: " + calculateSalary());
    }

    @Override
    public double calculateSalary() {
        if (chucDanh == "Business Leader") {
            return heSoLuong * 5000000 + 8000000;
        } else if (chucDanh == "Project Leader") {
            return heSoLuong * 5000000 + 5000000;
        } else {
            return heSoLuong * 5000000 + 600000;
        }
    }
}
