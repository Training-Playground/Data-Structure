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
        if(empty()){
            /*if(index == 0){
                numArray[0]=number;
                return;

            }else{*/
                System.out.println("Error");


        }else{
            int temp[] = new int[numArray.length+1];
            for (int i = 0; i < numArray.length; i++) {
                for (int j = 0; j < index; j++) {
                    temp[j] =numArray[j];
                }
                for (int j = index; j < numArray.length; j++) {
                    temp[i+1] = numArray[i];
                }
            }
            temp[index] = number;
            numArray = temp;
        }
    }
    public void remove(int index){
        if(empty()){
            System.out.println("Empty Array");
        }
        int temp[] = new int[numArray.length-1];
        for (int i = 0; i < numArray.length-1; i++) {
            for (int j = 0; j < index; j++) {
                temp[j] = numArray[j];
            }
            for (int j = index; j < numArray.length-1; j++) {
                temp[j]=numArray[j+1];
            }
            numArray = temp;

        }
    }
    public int get(int index){
        return numArray[index];
    }
    public void print(){
        System.out.println(Arrays.toString(numArray));
    }
    public void clear(){
        numArray=null;
    }
    public int size(){
        return numArray.length;
    }
    public boolean contains(int number){
        if(numArray==null){
            return false;
        }else{
            for (int i = 0; i < numArray.length; i++) {
                if(numArray[i] == number)
                    return true;
            }
        }
        return false;
    }
    public boolean empty(){
        return numArray == null;
    }
}
