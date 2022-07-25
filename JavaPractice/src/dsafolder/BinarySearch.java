package dsafolder;

public class BinarySearch {
    static class BinSearch {
        int binarySearch(int[] arr, int x){
            int l = 0, r = arr.length - 1;
            while (l <= r) {
                int m = l + (r - 1) / 2;
                if ( arr[m] == x)
                    return m;
                if(arr[m] < x)
                    l = m + 1;
                else
                    r = m-1;
            }
            return  -1;
        }
    }
    public static void main(String args[]){
        BinSearch ob = new BinSearch();
        int[] arr = {2,3,4,10,100};
        int n = arr.length;
        int x = 10;
        int result = ob.binarySearch(arr, x);
        if ( result == -1)
            System.out.println("Element was not found");
        else
            System.out.println("Element found at index " + result);
    }
}


