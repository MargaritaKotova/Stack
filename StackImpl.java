/**
 * Created by 11007139 on 12.10.2017.
 */
import java.util.ArrayList;

public class StackImpl implements Stack  {
    private int mSize; //mSize - максимальный размер
    private Integer[] stackArray;
    private int count_of_elements;

    public StackImpl(int m) {
        this.mSize = m;
        this.stackArray = new Integer[mSize];
        this.count_of_elements = 0;
    }
    @Override
    public Integer get() {
        if (count_of_elements == 0) throw new IllegalArgumentException();
        Integer element = stackArray[count_of_elements - 1];
        stackArray[count_of_elements--] = null;
        return element;
    }

    @Override
    public void add(Integer i) {
        if (count_of_elements+1 >= mSize) throw new IllegalArgumentException();
        stackArray[count_of_elements] = i;
        count_of_elements++;
    }

    public void printstack() {
        for (int i = 0; i < count_of_elements; i++)
            System.out.print(stackArray[i] + " ");
        System.out.println("");
    }
}
