import java.util.ArrayList;

public class _01_Heap{
    // note: Min Heap
    ArrayList<Integer> list = new ArrayList<>();

    public void add(int item){
        list.add(item);
        upHeapify(list.size()-1);
    }
    private void upHeapify(int child_index){
        int parent = (child_index - 1)/2;
        if(parent >= 0 && list.get(parent) > list.get(child_index)){
            swap(parent, child_index);
            // child_index = parent; - if done using loop;
            upHeapify(parent);
        }
    }

    public void swap(int ith, int jth){
        int ithELE = list.get(ith);
        int jthELE = list.get(jth);

        list.set(ith, jthELE);
        list.set(jth, ithELE);
    }


    public int remove(){
        swap(0,list.size()-1);
        int val = list.remove(list.size()-1);
        downHeapify(0);
        return val;
    }

    public void downHeapify(int pi){
        int lci = 2 * pi + 1;
        int rci = 2 * pi + 2;
        int mini = pi;
        if (lci < list.size() && list.get(lci) < list.get(mini)) {
            mini = lci;
        }
        if (rci < list.size() && list.get(rci) < list.get(mini)) {
            mini = rci;
        }        
        if (mini != pi) {
            swap(mini, pi);
            downHeapify(mini);
        }
    }

    public int size() {
        return list.size();
    }

    public int min() {
        return list.get(0);
    }

    public void Display() {
        System.out.println(list);
    }
}