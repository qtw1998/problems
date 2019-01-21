// import java.util.Stack;
import java.util.NoSuchElementException;
public class MyClass {
    public static void main(String args[]) {
        // Stack<Integer> stack = new Stack<>();
        // stack.push(10);
        // stack.push(20);
        // stack.push(30);
        // stack.push(40);
        
        // while(!stack.isEmpty()) {
        //     System.out.print(stack.peek() + " ");
        //     stack.pop();
        // }

        // System.out.println(a);
        
        
        //MyStack
        MyStack ms = new MyStack();
        ms.push(2);
        ms.push(3);
        
        System.out.println(ms.peek());
        
    }
    public class MyStack {
        private ListNode head;
        
        public void push(int val) {
            ListNode newNode = new ListNode(val);
            newNode.next = head;
            head = newNode;
        }
        public int pop() {
            if(isEmpty()) {
                throw new NoSuchElementException();
            }
            int res = head.val;
            head = head.next;
            return res;
        }
        public int peek() {
            if(isEmpty()) {
                throw new NoSuchElementException();
            }
            return head.val;
        }
        public boolean isEmpty() {
            return head == null;
        }
        public void clear() {
            head = null;
        }
    }
}
class ListNode {
    public int val;
    public ListNode next;
    
    ListNode(int val) {
        this.val = val;
    }
}
