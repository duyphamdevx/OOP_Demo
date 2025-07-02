public class TestTime {
    public static void test(){
        Time t = new Time();
        t.setTime(2, 9, 30);
        System.out.println("Giờ: " + t.getHour());
        System.out.println("Phút: " + t.getMinute());
        System.out.println("Giây: " + t.getSecond());
    }
}