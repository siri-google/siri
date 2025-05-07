public class Armstrong {
    public static void main(String[] args) {
        int[] num = {1, 1, 1};
        int a, b, c;
        
        a = (num[0] * num[0]) * num[0];
        b = (num[1] * num[1]) * num[1];
        c = (num[2] * num[2]) * num[2];
        
        int result = a + b + c;
        
        if (num[0] == result || num[1] == result || num[2] == result) {
            System.out.print("ok");
        } else {
            System.out.print("not ok");
        }
    }
}

