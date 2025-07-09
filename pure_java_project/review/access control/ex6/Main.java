// Lớp chứa dữ liệu protected
class ProtectedDataClass {
    protected int data = 42;  // Dữ liệu protected
}

// Lớp thao tác dữ liệu protected (cùng file)
class DataManipulator {
    void manipulate() {
        ProtectedDataClass obj = new ProtectedDataClass();
        System.out.println("Original data: " + obj.data);  // ✅ Truy cập được
        obj.data = 100;  // Thay đổi dữ liệu protected
        System.out.println("Modified data: " + obj.data);
    }
}

// Lớp chính để chạy chương trình
public class Main {
    public static void main(String[] args) {
        new DataManipulator().manipulate();
    }
}