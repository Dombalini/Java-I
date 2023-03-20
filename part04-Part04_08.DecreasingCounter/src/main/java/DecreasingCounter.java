
public class DecreasingCounter {

    private int value;  // an object variable for storing the value of the counter

    public DecreasingCounter(int initialValue) {
        this.value = initialValue;
    }

    public void printValue() {
        // Do not change this code!
        System.out.println("value: " + this.value);
    }

    public void decrement() {
        // write the method implementation here
        // the aim is to decrement the value of the counter by one
        for(value = 10; value <= 10; value--){
            if(value == 0){
                break;
            }else{
                System.out.println("value: " +this.value);
            }
        }
    }

    // the other methods go here
    
    public void reset(){
       this.value = 0;
    }
}
