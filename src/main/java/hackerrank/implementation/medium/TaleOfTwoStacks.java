package hackerrank.implementation.medium;

import java.util.Scanner;
import java.util.Stack;

public class TaleOfTwoStacks {

    public static void main(String[] args) {
        MyQueue<Integer> queue = new MyQueue<Integer>();

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for (int i = 0; i < n; i++) {
            int operation = scan.nextInt();
            if (operation == 1) { // enqueue
                queue.enqueue(scan.nextInt());
            } else if (operation == 2) { // dequeue
                queue.dequeue();
            } else if (operation == 3) { // print/peek
                System.out.println(queue.peek());
            }
        }
        scan.close();
    }



}

class MyQueue<T> {

    Stack<T> a = new Stack<>();
    Stack<T> b = new Stack<>();

    public void enqueue(T element) {
        a.push(element);
    }

    public T dequeue() {
        while (!a.empty()) {
            b.push(a.pop());
        }
        T result = b.pop();

        while(!b.empty()) {
            a.push(b.pop());
        }
        return result;
    }

    public T peek() {
        while (!a.empty()) {
            b.push(a.pop());
        }
        T result = b.peek();

        while(!b.empty()) {
            a.push(b.pop());
        }
        return result;
    }

}
