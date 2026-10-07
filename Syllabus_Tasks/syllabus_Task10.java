import java.util.*;
import java.util.function.*;

public class task10 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Predicate<String> validUsername =
                u -> u.length() >= 3 && u.length() <= 20;

        Predicate<String> validPassword =
                p -> p.length() >= 6 && p.length() <= 20;

        for (int i = 0; i < n; i++) {

            String username = sc.next();
            String password = sc.next();

            boolean valid = validUsername.test(username)
                    && validPassword.test(password);

            System.out.println(valid ? "SUCCESS" : "FAILURE");
        }

        sc.close();
    }
}
// output
// 2
// sai
// sai1392006
// SUCCESS