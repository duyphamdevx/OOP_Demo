
public class AccessExsample {

    public void public_method(){
        System.out.println("Đây là phương thức công khai (truy cập từ bất cứ đâu)");
    }

    private void private_method(){
        System.out.println("Đây là phương thức bí mật (chỉ truy cập ở cùng một class)");
    }

    protected void protected_method(){
        System.out.println("Đây là phương thức được protected (chỉ truy cập khi cùng package hoặc subclass)");
    }


}