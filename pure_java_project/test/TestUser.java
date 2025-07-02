public class TestUser {
    public static void test(){
        User u = new User();
        u.setUser("Phạm Thế Duy", "Đại học Phenikaa");
        System.out.println("Tên: " + u.getUser());
        System.out.println("Địa chỉ: " + u.getAddress());
    }
}