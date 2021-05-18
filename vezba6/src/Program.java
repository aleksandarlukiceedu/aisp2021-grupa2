import java.util.HashMap;

public class Program {

    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>(5);

        map.put("abc", "123");
        map.put("123", "abc");
        map.put("qwe", "456");

        System.out.println(map.get("abc"));
    }
}
