public class ReplaceElements {
    public static void main(String[] args) {
        ReplaceElements replaceElements = new ReplaceElements();
        int[] result = replaceElements.replaceElements(new int[]{17, 18, 5, 4, 6, 1});
        for (int j : result) {
            System.out.print(j + "\t");
        }
    }

    public int[] replaceElements(int[] arr) {
        if (arr.length == 1) {
            return new int[]{-1};
        }
        int max = 0;
        int temp = arr[arr.length - 1];
        int secondTemp;
        for (int i = arr.length - 1; i > -1; i--) {
            secondTemp = arr[i];
            arr[i] = max;
            if (secondTemp > max) {
                max = secondTemp;
            }
        }
        if (arr[arr.length - 2] < temp) {
            arr[arr.length - 2] = temp;
        }
        arr[arr.length - 1] = -1;
        return arr;
    }
}
