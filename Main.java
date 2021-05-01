import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] newspaper = scan.nextLine().split(" ");
        String[] notes = scan.nextLine().split(" ");

        Map<String, Integer> map = new HashMap<>();
        for (String item : newspaper) {
            if (map.containsKey(item)) {
                map.put(item, map.get(item) + 1);
            } else {
                map.put(item, 1);
            }
        }

        boolean flag = true;

        for (String item : notes) {
            if (map.containsKey(item)) {
                map.put(item, map.get(item) - 1);
                if (map.get(item) == 0) {
                    map.remove(item);
                }
            } else {
                flag = false;
                break;
            }
        }

        System.out.println(flag ? "You get money" : "You are busted");
    }
}
