import java.util.HashMap;

public class hash {
    public static void main(String[] args) {
        HashMap <String,Integer> hm = new HashMap<>();
        hm.put("India", 120);
        hm.put("China", 190);
        hm.put("Aus", 19);

        System.out.println(hm);
        // Size
        System.out.println(hm.size());

        // Get --- O(1)
        System.out.println(hm.get("India"));

        // Contain Key --- O(1)
        System.out.println(hm.containsKey("Aus"));

        // Remove -- O(1)
        hm.remove("India");
        System.out.println(hm);

    }
}
