public class _01_Construct_Segment_Trees{
    static int tree[];

    public static void initialize(int n){
        tree =  new int[4*n];
        
    }
    public static int buildSegmentTree(int [] arr,int segment_tree_index, int start, int end){
        if(start == end){
            tree[segment_tree_index] = arr[start];
            return arr[start];
        }
        int mid = (start + end)/2;
        buildSegmentTree(arr, 2* segment_tree_index + 1, start, mid); //left Subtree
        buildSegmentTree(arr, 2* segment_tree_index + 2, mid+1, end);//right Subtree
        //Internal Node will have the sum of both of its children
        tree[segment_tree_index] = tree[2* segment_tree_index + 1] + tree[2* segment_tree_index + 2];
        return tree[segment_tree_index];
    }

    public static void main(String[] args) {
        int arr [] = {1,2,3,4,5,6,7,8};
        int n = arr.length;
        initialize(n);
        buildSegmentTree(arr, 0, 0, n-1);

        for(int i=0; i<tree.length; i++){
            System.out.print(tree[i]+ " ");
        }
    }
}