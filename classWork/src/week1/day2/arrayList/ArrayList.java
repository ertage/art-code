package week1.day2.arrayList;

import java.util.Objects;

/**
 * Created by Nastia on 28.01.17.
 */
public class ArrayList {
    private int size;
    private Object[] objects;

    public ArrayList(Object[] objects){
        this.objects = objects;
    }

    public boolean add(Object object){
        ensureCapacity(size+1);
        objects[size + 1] = object;
        return true;
    }

    public void ensureCapacity(int minEnsureCapacity){

        int arraylength = objects.length;
        if(minEnsureCapacity<arraylength){
            Object[] tmp = new Object[arraylength];
            System.arraycopy(objects, 0, tmp, 0, arraylength);
            objects = new Object[arraylength];
            objects = tmp;
        }
    }

    public void add(int index, Object object){
       ensureCapacity(size+1);
        objects[index] = object;
        size++;
    }


}
