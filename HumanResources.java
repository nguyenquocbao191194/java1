import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class HumanResources {
    static ArrayList<Staff> listNV = new ArrayList<>();
    public static Scanner sc = new Scanner(System.in);
    public static int luaChon;
    public static String tenNhanVien;
    public static int maNhanVien = 0;
    public static int tuoiNhanVien;
    public static int heSoLuong;
    public static String ngayVaoLam;
    public static String boPhanLamViec;
    public static int soNgayNghiPhep;
    public static int soGioLamThem;
    public static String chucDanh;

    public static void main(String[] args) {

        begin();
    }

    // MENU
    // ==================================================================
    public static void begin() {
        System.out.println("==================================");
        System.out.println("\nNhap 1 de hien danh sach cac nhan vien");
        System.out.println("Nhap 2 de hien danh sach cac bo phan");
        System.out.println("Nhap 3 de hien danh sach nhan vien theo tung bo phan");
        System.out.println("Nhap 4 de them nhan vien moi");
        System.out.println("Nhap 5 de tim kiem thong tin nhan vien");
        System.out.println("Nhap 6 de hien thi bang luong nhan vien toan cong ty");
        System.out.println("Nhap 7 de hien thi luong nhan vien theo thu tu tang dan");
        System.out.print("Vui long nhap lua chon cua ban: ");

        do {
            luaChon = sc.nextInt();
            if (luaChon < 1 || luaChon > 7) {
                System.out.println("Ban nen nhap cac so tu 1 - 7");
                System.out.print("Vui long nhap lua chon cua ban: ");
            } else {
                break;
            }
        } while (luaChon < 1 || luaChon > 7);

        switch (luaChon) {
            case 1:
                danhSachNhanVien();
                yeuCauKhac();
                break;
            case 2:
                danhSachBoPhan();
                yeuCauKhac();
                break;
            case 3:
                danhSachNhanVienTheoBoPhan();
                yeuCauKhac();
                break;
            case 4:
                themNhanVienMoi();
                yeuCauKhac();
                break;
            case 5:
                timKiemThongTinNhanVien();
                yeuCauKhac();
                break;
            case 6:
                bangLuongToanCongTy();
                yeuCauKhac();
                break;
            case 7:
                bangLuongTheoThuTuTangDan();
                yeuCauKhac();
                break;
        }
    }

    // Chuc nang so 1
    // ======================================================================
    public static void danhSachNhanVien() {
        System.out.println("==================================");
        System.out.println("\nDuoi day la danh sach toan bo nhan vien cong ty!");
        for (int i = 0; i < listNV.size(); i++) {
            System.out.print(i + 1 + ".\n");
            listNV.get(i).displayInfomation();
        }

    }

    // chuc nang so 2
    // =======================================================================
    public static void danhSachBoPhan() {
        System.out.println("==================================");
        System.out.println("\nDuoi day la danh sach cac bo phan!");
        System.out.print("1. Ke toan\n");
        System.out.print("2. Hanh chinh nhan su\n");
        System.out.print("3. Cham soc khach hang\n");
        System.out.print("4. Cong nghe thong tin\n");
        System.out.print("5. Nghien cuu va phat trien san pham\n");
        System.out.print("6. Marketing\n");
        System.out.print("7. Kinh doanh\n");
        System.out.print("8. Bao ve\n");
    }

    // chuc nang so 3
    // =========================================================================
    public static void danhSachNhanVienTheoBoPhan() {
        System.out.println("==================================");
        System.out.println("\nDuoi day la danh sach nhan vien theo tung bo phan cong ty!");
        System.out.print("1. Ke toan\n");
        for (int j = 0; j < listNV.size(); j++) {
            if (listNV.get(j).getBoPhanLamViec() == "Ke toan") {
                listNV.get(j).displayInfomation();
                System.out.println(" ");
            }
        }
        System.out.print("2. Hanh chinh nhan su\n");
        for (int j = 0; j < listNV.size(); j++) {
            if (listNV.get(j).getBoPhanLamViec() == "Hanh chinh nhan su") {
                listNV.get(j).displayInfomation();
                System.out.println(" ");
            }
        }
        System.out.print("3. Cham soc khach hang\n");
        for (int j = 0; j < listNV.size(); j++) {
            if (listNV.get(j).getBoPhanLamViec() == "Cham soc khach hang") {
                listNV.get(j).displayInfomation();
                System.out.println(" ");
            }
        }
        System.out.print("4. Cong nghe thong tin\n");
        for (int j = 0; j < listNV.size(); j++) {
            if (listNV.get(j).getBoPhanLamViec() == "Cong nghe thong tin") {
                listNV.get(j).displayInfomation();
                System.out.println(" ");
            }
        }
        System.out.print("5. Nghien cuu va phat trien san pham\n");
        for (int j = 0; j < listNV.size(); j++) {
            if (listNV.get(j).getBoPhanLamViec() == "Nghien cuu va phat trien san pham") {
                listNV.get(j).displayInfomation();
                System.out.println(" ");
            }
        }
        System.out.print("6. Marketing\n");
        for (int j = 0; j < listNV.size(); j++) {
            if (listNV.get(j).getBoPhanLamViec() == "Marketing") {
                listNV.get(j).displayInfomation();
                System.out.println(" ");
            }
        }
        System.out.print("7. Kinh doanh\n");
        for (int j = 0; j < listNV.size(); j++) {
            if (listNV.get(j).getBoPhanLamViec() == "Kinh doanh") {
                listNV.get(j).displayInfomation();
                System.out.println(" ");
            }
        }

        System.out.print("8. Bao ve\n");
        for (int j = 0; j < listNV.size(); j++) {
            if (listNV.get(j).getBoPhanLamViec() == "Bao ve") {
                listNV.get(j).displayInfomation();
                System.out.println(" ");
            }
        }
    }

    // chuc nang so 4
    // =========================================================================
    public static void themNhanVienMoi() {
        System.out.println("==================================");
        System.out.println("\nYeu cau cua ban la them nhan vien moi se duoc thuc hien!");
        System.out.println("Nhap 1 de them nhan vien, nhap 2 de them quan ly");
        System.out.print("Vui long nhap lua chon cua ban: ");
        do {
            luaChon = sc.nextInt();
            if (luaChon < 1 || luaChon > 2) {
                System.out.println("Nhap 1 de them nhan vien, nhap 2 de them quan ly");
                System.out.print("Vui long chi nhap 1 hoac 2: ");
            } else {
                break;
            }
        } while (luaChon < 1 || luaChon > 2);

        if (luaChon == 1) {
            System.out.println("==================================");
            System.out.println("\nBan vui long dien thong tin nhan vien moi theo thu tu sau:");
            System.out.print("Ten nhan vien: ");
            tenNhanVien = sc.next();
            System.out.print("Tuoi nhan vien: ");
            tuoiNhanVien = sc.nextInt();
            System.out.println("Bo phan lam viec: ");
            System.out.print("Chon 1 trong cac bo phan sau (1-8): \n");
            System.out.print("1. Ke toan\n");
            System.out.print("2. Hanh chinh nhan su\n");
            System.out.print("3. Cham soc khach hang\n");
            System.out.print("4. Cong nghe thong tin\n");
            System.out.print("5. Nghien cuu va phat trien san pham\n");
            System.out.print("6. Marketing\n");
            System.out.print("7. Kinh doanh\n");
            System.out.print("8. Bao ve\n");
            int luaChon1 = sc.nextInt();
            do {
                if (luaChon1 > 8 || luaChon1 < 1) {
                    System.out.println("Vui long nhap tu 1 den 8: ");
                    luaChon1 = sc.nextInt();
                } else {
                    break;
                }
            } while (luaChon1 > 8 || luaChon1 < 1);
            switch (luaChon1) {
                case 1:
                    boPhanLamViec = "Ke toan";
                    break;
                case 2:
                    boPhanLamViec = "Hanh chinh nhan su";
                    break;
                case 3:
                    boPhanLamViec = "Cham soc khach hang";
                    break;
                case 4:
                    boPhanLamViec = "Cong nghe thong tin";
                    break;
                case 5:
                    boPhanLamViec = "Nghien cuu va phat trien san pham";
                    break;
                case 6:
                    boPhanLamViec = "Marketing";
                    break;
                case 7:
                    boPhanLamViec = "Kinh doanh";
                    break;
                case 8:
                    boPhanLamViec = "Bao ve";
                    break;
            }
            System.out.print("He so luong: ");
            heSoLuong = sc.nextInt();
            System.out.print("Ngay vao lam: ");
            ngayVaoLam = sc.next();
            System.out.print("So ngay nghi phep: ");
            soNgayNghiPhep = sc.nextInt();
            System.out.print("So gio lam them: ");
            soGioLamThem = sc.nextInt();
            maNhanVien = maNhanVien + 1;
            Employee newStaff = new Employee(tenNhanVien, maNhanVien, tuoiNhanVien, heSoLuong, ngayVaoLam,
                    boPhanLamViec, soNgayNghiPhep, soGioLamThem);
            listNV.add(newStaff);
        } else { // quan ly =======
            System.out.println("==================================");
            System.out.println("\nBan vui long dien thong tin quan ly moi theo thu tu sau:");
            System.out.print("Ten quan ly: ");
            tenNhanVien = sc.next();
            System.out.print("Tuoi quan ly: ");
            tuoiNhanVien = sc.nextInt();
            System.out.println("Bo phan lam viec: ");
            System.out.print("Chon 1 trong cac bo phan sau (1-8): \n");
            System.out.print("1. Ke toan\n");
            System.out.print("2. Hanh chinh nhan su\n");
            System.out.print("3. Cham soc khach hang\n");
            System.out.print("4. Cong nghe thong tin\n");
            System.out.print("5. Nghien cuu va phat trien san pham\n");
            System.out.print("6. Marketing\n");
            System.out.print("7. Kinh doanh\n");
            System.out.print("8. Bao ve\n");
            int luaChon2 = sc.nextInt();
            do {
                if (luaChon2 > 8 || luaChon2 < 1) {
                    System.out.println("Vui long nhap tu 1 den 8: ");
                    luaChon2 = sc.nextInt();
                } else {
                    break;
                }
            } while (luaChon2 > 8 || luaChon2 < 1);
            switch (luaChon2) {
                case 1:
                    boPhanLamViec = "Ke toan";
                    break;
                case 2:
                    boPhanLamViec = "Hanh chinh nhan su";
                    break;
                case 3:
                    boPhanLamViec = "Cham soc khach hang";
                    break;
                case 4:
                    boPhanLamViec = "Cong nghe thong tin";
                    break;
                case 5:
                    boPhanLamViec = "Nghien cuu va phat trien san pham";
                    break;
                case 6:
                    boPhanLamViec = "Marketing";
                    break;
                case 7:
                    boPhanLamViec = "Kinh doanh";
                    break;
                case 8:
                    boPhanLamViec = "Bao ve";
                    break;
            }
            System.out.print("He so luong: ");
            heSoLuong = sc.nextInt();
            System.out.print("Ngay vao lam: ");
            ngayVaoLam = sc.next();
            System.out.print("So ngay nghi phep: ");
            soNgayNghiPhep = sc.nextInt();
            System.out.print("Vui long chon cac chuc danh sau: \n");
            System.out.print("1. Business Leader\n");
            System.out.print("2. Project Leader \n");
            System.out.print("3. Technical Leader \n");
            int luaChon3 = sc.nextInt();
            do {
                if (luaChon3 > 3 || luaChon3 < 1) {
                    System.out.println("Vui long nhap tu 1 den 3: ");
                    luaChon3 = sc.nextInt();
                    break;
                }
            } while (luaChon3 > 3 || luaChon3 < 1);
            if (luaChon3 == 1) {
                chucDanh = "Business Leader";
            } else if (luaChon3 == 2) {
                chucDanh = "Project Leader";
            } else {
                chucDanh = "Technical Leader";
            }
            maNhanVien = maNhanVien + 1;
            Manager newStaff = new Manager(tenNhanVien, maNhanVien, tuoiNhanVien, heSoLuong, ngayVaoLam,
                    boPhanLamViec, soNgayNghiPhep, chucDanh);
            listNV.add(newStaff);
        }
    }

    // chuc nang so 5
    // =======================================================================
    public static void timKiemThongTinNhanVien() {
        System.out.println("\nYeu cau tim kiem thong tin nhan vien cua ban se duoc thuc hien!");
        System.out.println("Nhap 1 de tim kiem theo ten, nhap 2 de tim kiem theo ma");
        System.out.println("Vui long nhap lua chon cua ban: ");
        do {
            luaChon = sc.nextInt();
            if (luaChon < 1 || luaChon > 2) {
                System.out.println("Nhap 1 de tim kiem theo ten, nhap 2 de tim kiem theo ma");
                System.out.print("Vui long chi nhap 1 hoac 2: ");
                luaChon = sc.nextInt();
            } else {
                break;
            }
        } while (luaChon < 1 || luaChon > 2);

        if (luaChon == 1) {
            System.out.println("Vui long nhap ten NV ban muon tim kiem: ");
            String tenNV = sc.next();
            int bienDem = 0;
            for (int i = 0; i < listNV.size(); i++) {
                if (listNV.get(i).getTenNhanVien().equalsIgnoreCase(tenNV)) {
                    bienDem++;
                    listNV.get(i).displayInfomation();
                    System.out.println(" ");
                }
            }
            if (bienDem > 0) {
                System.out.println("Tren la danh sach nhan vien co ten " + tenNV);
            }
            if (bienDem == 0) {
                System.out.println("Khong tim thay nhan vien ten " + tenNV);
            }
        } else {
            System.out.println("Vui long nhap ten ma NV ban muon tim kiem: ");
            int maNV = Integer.parseInt(sc.next());
            int bienDem = 0;
            for (int i = 0; i < listNV.size(); i++) {
                if (listNV.get(i).getMaNhanVien() == maNV) {
                    bienDem++;
                    listNV.get(i).displayInfomation();
                    System.out.println(" ");
                }
            }
            if (bienDem > 0) {
                System.out.println("Tren la danh sach nhan vien co ma NV la " + maNV);
            }
            if (bienDem == 0) {
                System.out.println("Khong tim thay nhan vien co ma " + maNV);
            }
        }
    }

    // chuc nang so 6
    // =======================================================================
    public static void bangLuongToanCongTy() {
        System.out.println("\nDuoi day la danh sach bang luong toan cong ty!");
        for (int i = 0; i < listNV.size(); i++) {
            System.out.println(listNV.get(i).getTenNhanVien() + " - " + listNV.get(i).calculateSalary());
        }
    }

    // chuc nang so 7
    // =======================================================================
    public static void bangLuongTheoThuTuTangDan() {
        System.out.println("\nBang luong da duoc sap xep theo thu tu tang dan!");
        for (int i = 0; i < listNV.size() - 1; i++) {
            for (int j = i + 1; j < listNV.size(); j++)
                if (listNV.get(i).calculateSalary() > listNV.get(j).calculateSalary()) {
                    Collections.swap(listNV, i, j);
                }
        }
        for (int i = 0; i < listNV.size(); i++) {
            System.out.print("\n");
            System.out.println(listNV.get(i).getTenNhanVien() + " - " + listNV.get(i).calculateSalary());

        }
    }

    // yeu cau khac
    // ========================================================================
    public static void yeuCauKhac() {
        System.out.println("==================================");
        System.out.println("\nYeu cau cua ban da duoc thuc hien! Ban co muon thuc hien yeu cau khac khong?");
        System.out.println("Nhap 1 de tiep tuc, nhap so bat ki khac 1 de ket thuc");
        System.out.print("Vui long nhap lua chon cua ban: ");
        Scanner sc = new Scanner(System.in);
        luaChon = sc.nextInt();
        switch (luaChon) {
            case 1:
                begin();
            default:
                break;
        }
    }
}
