package ds3;

import java.util.Arrays;

public class DynamicArray {
    int numArray[];
    public void add(int number){
        if(numArray==null){
            numArray = new int[1];
            numArray[0] = number;
        }else{
            int temp[] = new int[numArray.length+1];
            for (int i = 0; i < numArray.length; i++) {
                temp[i] = numArray[i];
            }
            temp[numArray.length] = number;
            numArray = temp;

        }
    }
    public void add(int index,int number){

    }
    public void remove(int index){

    }
    public int get(int index){
        return 0;
    }
    public void print(){
        System.out.println(Arrays.toString(numArray));
    }
    public void clear(){

    }
    public int size(){
        return 0;
    }
    public boolean contains(int number){
        return false;
    }
    public void empty(){

    }
}
