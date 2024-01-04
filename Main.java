import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        TreeMap<String, Integer> accounts = new TreeMap<>();
        for (int i = 0; i < n; i++) {
            String act = sc.next();
            if (act.equals("add")) {
                String acc = sc.next();
                Integer amount = sc.nextInt();
                if (!accounts.containsKey(acc)) {
                    accounts.put(acc, 0);
                }
                accounts.put(acc, accounts.get(acc) + amount);
            } else if (act.equals("withdraw")) {
                String acc = sc.next();
                Integer amount = sc.nextInt();
                if (!accounts.containsKey(acc)) {
                    accounts.put(acc, 0);
                }
                accounts.put(acc, accounts.get(acc) - amount);
            } else {
                String acc = sc.next();
                accounts.remove(acc);
            }
        }
        for (Map.Entry e : accounts.entrySet()) {
            System.out.println(e.getKey() + " " + e.getValue());
        }
    }
}
