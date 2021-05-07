

public class Deque{
    private int[] numQueue;
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

        return numQueue == null;
    }

    public int peek(){
        if(numQueue==null){
            System.out.println("Empty Array");
            //can't return a null in a integer return expected method
        }
        //return numQueue[0]; //Wrong
        return numQueue[numQueue.length-1];
    }
    public void clear(){
        numQueue = null;
    }
    public void print(){
        System.out.print("[");
        if(numQueue==null){
            System.out.println("]");
            return;
        }
        for (int i = 0; i < numQueue.length; i++) {
            System.out.print(numQueue[(numQueue.length-1-i)]+", ");
        }
        System.out.println("\b\b]");
    }
    public boolean contains(int number){
        if(numQueue==null){
            return false;
        }else{
            for (int i = 0; i < numQueue.length; i++) {
                if(numQueue[i] == number)
                    return true;
            }
        }
        return false;
    }
    public int size(){
        return numQueue.length;
    }
}
