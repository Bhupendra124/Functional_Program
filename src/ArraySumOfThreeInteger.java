public class ArraySumOfThreeInteger {


    static void Triplet(int[] arr, int n) {

        boolean Found = false;
        for (int i = 1; i < n - 2; i++) {
            for (int j = 1; j < n - 1; j++) {
                for (int k = 1; k < n; k++) {
                    if (arr[i] + arr[j] + arr[k] == 0)
                    {
                        System.out.print(arr[i] + " ");
                        System.out.print(" ");
                        System.out.print(arr[j] + " ");
                        System.out.print(" ");
                        System.out.print(arr[k] + " ");
                        System.out.print("\n ");
                        Found = true;
                    }
                }
            }
        }
        // If no triplet with 0 sum found in array
        if (Found == false)
            System.out.println(" not exist ");
    }

    public static void main(String[] args){
            int[] arr = {1, 2, 1, 2};
            int n = arr.length;
            Triplet(arr ,n);
        }  }

