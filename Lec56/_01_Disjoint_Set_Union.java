
import java.util.HashMap;

public class _01_Disjoint_Set_Union{
    class Node{
        int val;
        int rank;
        Node parent;
    }

    @SuppressWarnings("FieldMayBeFinal") //vs code 
    private HashMap<Integer, Node> map = new HashMap<>();

    public void CreateSet(int v){
        Node nn = new Node();
        nn.val = v;
        nn.rank = 0;
        nn.parent = nn;
        map.put(v, nn);
    }

    public int find(int v){
        Node nn = map.get(v);
        return find(nn).val;
    }
    private Node find(Node nn){
        if(nn.parent == nn) return nn;
        Node rn = find(nn.parent);
        nn.parent = rn;// path compression
        return rn;
    }
    public void union(int v1, int v2){
        Node n1 = map.get(v1);
        Node n2 = map.get(v2);

        Node rn1 = find(n1); // representative node of v1 (parent)
        Node rn2 = find(n2); // representative node of v2 (parent)

        if(rn1.rank == rn2.rank){
            rn1.parent = rn2;
            rn2.rank++;
        }else if (rn1.rank > rn2.rank) {
            rn2.parent = rn1;
        }else{
            rn1.parent = rn2;
        }
    }
}