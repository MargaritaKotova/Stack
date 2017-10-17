/**
 * Created by 11007139 on 16.10.2017.
 */
public class Main {
        public static void main(String[] args) {
            Stack myStack = new StackImpl(5);
            Integer var1 = 10;
            Integer var2 = 20;
            Integer var3 = 30;
            Integer var4 = 40;
            myStack.add(var1);
            myStack.add(var2);
            myStack.add(var3);
            myStack.add(var4);
            System.out.println(myStack.get());
            myStack.printstack();
        }
    }

