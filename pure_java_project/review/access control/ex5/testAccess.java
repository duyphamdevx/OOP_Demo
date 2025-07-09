
public class testAccess {
    public static void main(String[] args) {
        AccessExsample a = new AccessExsample();
        a.public_method();
        //a.private_method(); không chạy được vì là private
        a.protected_method(); //chạy được vì cùng package ex5
    }
}
