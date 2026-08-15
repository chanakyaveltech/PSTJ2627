import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class SecureAuthenticationStressTesting {
    public static boolean isValidLogin(String username, String password) {
        if (username == null || password == null) {
            return false;
        }
        int uLen = username.length();
        if (uLen < 3 || uLen > 20) {
            return false;
        }
        int pLen = password.length();
        if (pLen < 6 || pLen > 20) {
            return false;
        }
        if (!isAlphanumeric(username) || !isAlphanumeric(password)) {
            return false;
        }
        return true;
    }
    private static boolean isAlphanumeric(String str) {
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (!Character.isLetterOrDigit(c)) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();
        if (line == null || line.trim().isEmpty()) {
            return;
        }
        int n = Integer.parseInt(line.trim());
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < n; i++) {
            line = reader.readLine();
            if (line == null) break;

            StringTokenizer tokenizer = new StringTokenizer(line);
            if (tokenizer.countTokens() < 2) {
                output.append("FAILURE\n");
                continue;
            }

            String username = tokenizer.nextToken();
            String password = tokenizer.nextToken();

            if (isValidLogin(username, password)) {
                output.append("SUCCESS\n");
            } else {
                output.append("FAILURE\n");
            }
        }

        System.out.print(output);
    }
}