public class ShuffleArray {
    public static void main(String[] args) {
        ShuffleArray shuffleArray = new ShuffleArray();
        int[] newArray = shuffleArray.shuffle(new int[]{2, 5, 1, 3, 4, 7}, 3);
        System.out.print(newArray.length + "\t");

        for (int num : newArray) {
            System.out.print(num + "\t");
        }
    }

    public int[] shuffle(int[] nums, int n) {
        int[] newArray = new int[nums.length];
        int j = 0;
        for (int i = 0; i < n; i++) {
            newArray[j] = nums[i];
            newArray[j + 1] = nums[n + i];
            j = j + 2;
        }
        return newArray;
    }
}
