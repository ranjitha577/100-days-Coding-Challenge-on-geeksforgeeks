Question:- Implement a Queue using an Array. Queries in the Queue are of the following type:
(i) 1 x   (a query of this type means  pushing 'x' into the queue)
(ii) 2     (a query of this type means to pop element from queue and print the poped element)

Example 1:-

Input:
Q = 5
Queries = 1 2 1 3 2 1 4 2
Output: 2 3

Example 2:-

Input:
Q = 4
Queries = 1 3 2 2 1 4   
Output: 3 -1

time complexity is O(N)

class MyQueue {
    int front, rear;
int arr[] = new int[100005];
 
    MyQueue()
{
front=0;
rear=0;
}
 
//Function to push an element x in a queue.
void push(int x)
{
    if(rear==0){
        front++;
    }
    else if(rear==arr.length-1){
        return;
    }
    rear++;
    arr[rear]=x;
} 
 
    //Function to pop an element from queue and return that element.
int pop()
{
if(front==0|| front>rear){
    return -1;
}
int t=arr[front];
front++;
return t;
} 
}
