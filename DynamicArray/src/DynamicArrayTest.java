import ds3.DynamicArray;

public class DynamicArrayTest {
    public static void main(String[] args) {
        DynamicArray dynamicArray = new DynamicArray();
        dynamicArray.print();
        dynamicArray.add(0,20);
        dynamicArray.print();
        dynamicArray.add(50);
        dynamicArray.print();
        dynamicArray.add(60);
        dynamicArray.print();
        //dynamicArray.add(1,50);
        dynamicArray.print();

        //dynamicArray.add(0,20);
        dynamicArray.print();
        dynamicArray.add(100);
        dynamicArray.print();
        dynamicArray.add(200);
        dynamicArray.print();
        //dynamicArray.add(1,50);
        dynamicArray.print();
        dynamicArray.remove(2);
        dynamicArray.print();
    }
}
