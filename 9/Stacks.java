interface StackADT <T> {


    //public  void create(); This wont be need as we can do with the class constructor

    //Depend on the data type used under the hood this can run up 0(n).
    public  <T> T pop();

    public  void push( T t);

    public <T> T peek();

    public boolean isEmpty();

    public boolean isFull();



}


//Impementation of Stack Using Arrays
    public class Stacks <T> implements  StackADT {

    //Declaration of the Data Type to be used
    private T [ ] data;
    private int capacity = 30;
    private int stackTop;


    //Constuction of Stack using Stack constructor

    public Stacks(T []t){
        data = t;
        stackTop = -1;
    }


    public void push( T t){
        if(stackTop+1 == data.length){
            System.out.println("Stack is Full You can't add more data");
        }
        else{
            data[++stackTop] = t;
        }
    }

    public T pop(){
        T poped = data[stackTop];
        data[stackTop] = null; //Just make it 0(1)
        stackTop--;
        return poped;
    }

    public  T peek(){
        return data[stackTop];
    }

    public boolean isEmpty(){
        return stackTop == -1 ? true:false;
    }

    public boolean isFull(){
        return stackTop+1 == data.length ? true : false;
    }

    public static void main(String[] args) {
        String [] ary = {""};
        Stacks Name = new Stacks <String>(ary);
        Name.push("Simon");
        Name.push("Alex");
        Name.push("Abel");
        System.out.println(Name.isEmpty());
        System.out.println(Name.isFull());
    }

}