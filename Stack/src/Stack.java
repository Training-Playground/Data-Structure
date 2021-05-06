import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Stack {

    private int[] numbers;


    public void push(int number) {
        if(numbers == null){
            numbers = new int[1];
            numbers[0] = number;
        }else{
            int[] temp = new int[numbers.length+1];
            for (int i = 0; i <numbers.length ; i++) {
                temp[i] = numbers[i];
            }
            temp[temp.length-1] = number;
            numbers = temp;
        }
    }
    public void pop(){
        if(empty()){
            System.out.println("Cannot pop from empty array");
            return;
        }else if(numbers.length==1){
            numbers = null;
            return;
        }
        int[] temp = new int[numbers.length-1];
        for (int i = 0; i < numbers.length-1; i++) {
            temp[i] = numbers[i];
        }
        numbers = temp;
    }
    public boolean empty(){
        return numbers == null;
    }
    public int size(){
        return numbers == null ? 0 : numbers.length;
    }
    public int peek(){
        if (empty()){
            System.err.println("Stack is empty");
        }
        return numbers[numbers.length - 1];
    }
    public void clear(){
        numbers = null;
    }
    public void print(){
        if(empty()){
            System.out.println("[]");
            return;
        }
        System.out.print("[");
        for (int i = numbers.length-1; i >= 0 ; i--) {
            System.out.print(numbers[i]+", ");
        }
        System.out.println("\b\b]");
        //System.out.println(Arrays.toString(numbers));
    }

    public boolean contains(int number){
        if (empty()){
            return false;
        }
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == number){
                return true;
            }
        }
        return false;
    }
}
