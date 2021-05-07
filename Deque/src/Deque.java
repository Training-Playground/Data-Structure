

public class Deque extends Queue{

    public void enqueueRear(int number){
        if(numQueue==null){
            numQueue = new int[1];
            numQueue[0] = number;}
        else{
            int temp[] = new int[numQueue.length+1];
            for (int i = 0; i < numQueue.length; i++) {
                temp[i+1] = numQueue[i];
            }
            temp[0] = number;
            numQueue = temp;

        }


    }
    public void dequeueFront(){
        if(numQueue == null){
            System.out.println("No Dequeuing from Front ---> Empty Array");
            return;
        }else if(numQueue.length==1){
            numQueue=null;
            return;
        }
        else{
            int temp[] = new int[numQueue.length-1];
            for (int i = 0; i < numQueue.length-1; i++) {
                temp[i] = numQueue[i];
            }
            numQueue = temp;
        }
    }
}
