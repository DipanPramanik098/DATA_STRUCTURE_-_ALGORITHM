public class _02_Query_on_ST {
    static int tree[];

    public static void initialize(int n) {
        tree = new int[4 * n];

    }

    public static int buildSegmentTree(int[] arr, int segment_tree_index, int start, int end) {
        if (start == end) {
            tree[segment_tree_index] = arr[start];
            return arr[start];
        }
        int mid = (start + end) / 2;
        buildSegmentTree(arr, 2 * segment_tree_index + 1, start, mid); // left Subtree
        buildSegmentTree(arr, 2 * segment_tree_index + 2, mid + 1, end);// right Subtree
        // Internal Node will have the sum of both of its children
        tree[segment_tree_index] = tree[2 * segment_tree_index + 1] + tree[2 * segment_tree_index + 2];
        return tree[segment_tree_index];
    }

    public static int getSumUtil(int i, int si, int sj, int qi, int qj){
        //case 1 non-overlapping
        if(qj <= si || qi >= sj){
            return 0;
        }else if(si >= qi && sj <= qj){ //case 2 complete overlapping
            return tree[i];
        }else{ //case 3 partial overlapping 
            int mid = (si + sj)/2;
            int leftSum = getSumUtil(2*i + 1, si, mid, qi, qj);
            int rightSum = getSumUtil(2*i + 2, mid+1, sj, qi, qj);
            return leftSum + rightSum;
        }
    }
    public static int getSum(int arr[], int qi, int qj){
        int n = arr.length;
        return getSumUtil(0, 0, n-1, qi, qj);
    }
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
        int n = arr.length;
        initialize(n);
        buildSegmentTree(arr, 0, 0, n - 1);

        for (int i = 0; i < tree.length; i++) {
            System.out.print(tree[i] + " ");
        }
        System.out.println();
        System.out.println(getSum(arr, 2, 5));
    }    
}
