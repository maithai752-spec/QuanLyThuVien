public class Book {
    String maSach;
    String tenSach;
    String tacGia;

    public Book(String maSach, String tenSach, String tacGia) {
        this.maSach = maSach;
        this.tenSach = tenSach;
        this.tacGia = tacGia;
    }

    public void hienThi() {
        System.out.println("Ma sach: " + maSach);
        System.out.println("Ten sach: " + tenSach);
        System.out.println("Tac gia: " + tacGia);
    }
 
     public static Book timKiemSach(Book[] ds, String ma) {
    for (Book sach : ds) {
        if (sach.maSach.equals(ma)) {
            return sach;
        }
    }
    return null;
}
}