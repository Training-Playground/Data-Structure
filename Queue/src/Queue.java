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
    //FIFO - First In First Out
    public void dequeue(){
        if(numQueue == null){
            System.out.println("No Dequeuing ---> Empty Array");
            return;
        }else if(numQueue.length==1){
            numQueue=null;
            return;
        }else{
            int temp[] = new int[numQueue.length-1];
            for (int i = 0; i < numQueue.length-1; i++) {
                temp[i] = numQueue[i+1];
            }
            numQueue = temp;
        }
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
