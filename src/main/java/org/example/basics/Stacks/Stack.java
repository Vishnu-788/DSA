package org.example.basics.Stacks;

public class Stack {
    private int capacity = 2;
    private int[] arr = new int[capacity];
    private int top=-1;

    /*
    Stack operations
     */
    public void push(int data){
        if(size() == capacity){
            expand();
        }
        top++;
        arr[top]=data;
    }
    public int pop(){
        if((size()) < capacity/2){
            shrink();
        }
        int removed = arr[top];
        arr[top] = 0;
        top--;
        return removed;
    }
    public int peek(){
        return arr[top];
    }
    public int size(){
        return top+1;
    }

    public void show(){
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    /*
    In-built operations
     */
    private void expand(){
        int length = size();
        this.capacity*=2;
        int[] newArr = new int[capacity];
        System.arraycopy(arr,0,newArr,0,length);
        arr = newArr;
    }

    private void shrink(){
        int length = size();
        this.capacity/=2;
        int[] newArr = new int[capacity];
        System.arraycopy(arr,0,newArr,0,length);
        arr = newArr;
    }
}
