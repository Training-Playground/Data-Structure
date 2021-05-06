import java.util.Arrays;

public class Queue {

    int[] numQueue;
    public void enqueue(int number){
        if(numQueue==null){
            numQueue = new int[1];
            numQueue[0] = number;
        }else{
            int temp[] = new int[numQueue.length+1];
            for (int i = 0; i < numQueue.length; i++) {
                temp[i] = numQueue[i];
            }
            temp[numQueue.length] = number;
            numQueue = temp;

        }
    }
    public void dequeue(){

    }
    public boolean empty(){
        return false;
    }
    public int peek(){
        return 0;
    }
    public void clear(){

    }
    public void print(){
        System.out.println(Arrays.toString(numQueue));
    }
    public boolean contains(int number){
        return false;
    }
    public int size(){
        return 0;
    }
}
