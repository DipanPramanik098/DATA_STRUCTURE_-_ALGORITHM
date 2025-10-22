

public class _06_Dynamic_Stack extends _01_MyStack{
    @Override
    public void push(int item) throws Exception {
        if (isFull()) {
            int[] newarr = new int[2 * arr.length];
            // for(int i = 0; i < arr.length; i++) {
            //     newarr[i] = arr[i];
            // }
            System.arraycopy(arr, 0, newarr, 0, arr.length);
            arr = newarr;
        }
        super.push(item);

    }

}
