import java.util.Arrays;

public class RichestCustomerWealth {
    public int maximumWealth(int[][] accounts) {
        return Arrays.stream(accounts).mapToInt(acc -> Arrays.stream(acc).sum()).max().getAsInt();
    }
    public static void main(String[] args) {
        System.out.println(new RichestCustomerWealth().maximumWealth(new int[][]{{1,2,3}, {3,2,1}}));
    }
}