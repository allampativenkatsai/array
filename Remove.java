public class Remove {

    public static int remove(int[] arr) {
        int i = 0;
        int j = 1;
        int r = 0; // Counter for elements to remove

        // Edge case: If the array has fewer than 2 elements, remove all
        if (arr.length < 2) {
            return arr.length;
        }

        while (i < arr.length - 1) {
            if (arr[i] != arr[j]) {
                // If arr[i] is not part of any common sequence, count it for removal

                if (j - i == 1) { // No duplicate for arr[i]

                    r++;
                }
                i = j; // Move i to the next unique element
                j++;
            } else {
                // Skip over all duplicates of the current element
                while (j < arr.length && arr[i] == arr[j]) {
                    j++;
                }
                i = j; // Move i to the end of the duplicates
            }
        }

        // Check the last element in the array
        if (i == arr.length - 1) {
            r++; // The last element is unique and needs to be removed
        }

        return r;
    }


    public static void main(String[] args) {
        int[] arr = {1,2,2,3,5,6,6};
int r =remove(arr);
System.out.println(r);
    }
}
