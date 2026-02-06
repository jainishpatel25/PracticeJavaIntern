package ArrayPractice;

public class SecondHighest {
    public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 34, 1};

        // Initialize first and second highest
        int first = Integer.MAX_VALUE;
        int second = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > first) {
                // Update both first and second
                second = first;
                first = num;
            } else if (num > second && num != first) {
                // Update only second
                second = num;
            }
        }

        if (second == Integer.MIN_VALUE) {
            System.out.println("No second highest element found.");
        } else {
            System.out.println("Second highest element is: " + second);
        }
    }
}

