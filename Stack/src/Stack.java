import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Stack {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int arrayNum = input.nextInt();
        push
    }
    public ArrayList numbersArray = new ArrayList();
    public void push(int number) {
        numbersArray.add(number);
    }
    public void pop(){
        numbersArray.remove(numbersArray.toArray().length-1);
    }
    public boolean empty(){
        return true;
    }
    public int peek(){
        int num=0;
        return num;
    }

    public void print(){
        System.out.println(Arrays.toString(numbersArray));
    }



    public boolean contains(int number){

        return true;
    }
}
