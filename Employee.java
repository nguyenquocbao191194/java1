public class Employee extends Staff implements ICalculator {
    private int soGioLamThem;

    public Employee(String tenNhanVien, int maNhanVien, int tuoiNhanVien, int heSoLuong, String ngayVaoLam,
            String boPhanLamViec, int soNgayNghiPhep, int soGioLamThem) {
        super(tenNhanVien, maNhanVien, tuoiNhanVien, heSoLuong, ngayVaoLam, boPhanLamViec, soNgayNghiPhep);
        this.soGioLamThem = soGioLamThem;
    }

    public int getSoGioLamThem() {
        return soGioLamThem;
    }

    public void setSoGioLamThem(int soGioLamThem) {
        this.soGioLamThem = soGioLamThem;
    }

    public void caculateSalary() {

    }

    public void displayInfomation() {
        System.out.println("Ma nhan vien: " + super.getMaNhanVien());
        System.out.println("Ten: " + super.getTenNhanVien());
        System.out.println("Tuoi: " + super.getTuoiNhanVien());
        System.out.println("He so luong: " + super.getHeSoLuong());
        System.out.println("Bo phan lam viec: " + super.getBoPhanLamViec());
        System.out.println("ngay vao lam: " + super.getNgayVaoLam());
        System.out.println("so ngay nghi phep: " + super.getSoNgayNghiPhep());
        System.out.println("so gio lam them: " + getSoGioLamThem());
        System.out.println("Luong NV: " + calculateSalary());
    }

    @Override
    public double calculateSalary() {
        return heSoLuong * 3000000 + soGioLamThem * 200000;
    }
}
