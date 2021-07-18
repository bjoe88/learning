package Leetcode.algorithms;
/*
 * @lc app=leetcode id=232 lang=java
 *
 * [232] Implement Queue using Stacks
 */

import java.util.Stack;

// @lc code=start
class MyQueue {
    Stack<Integer> stk1 = new Stack<>();
    Stack<Integer> stk2 = new Stack<>();

    /** Initialize your data structure here. */
    public MyQueue() {
    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        this.stk2.push(x);
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        this.transferStk2to1();
        return this.stk1.pop();
    }

    private void transferStk2to1() {
        if (this.stk1.empty()) {
            while (!this.stk2.empty()) {
                this.stk1.push(this.stk2.pop());
            }
        }
    }

    /** Get the front element. */
    public int peek() {
        this.transferStk2to1();
        return this.stk1.peek();
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        this.transferStk2to1();

        return this.stk1.empty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such: MyQueue obj =
 * new MyQueue(); obj.push(x); int param_2 = obj.pop(); int param_3 =
 * obj.peek(); boolean param_4 = obj.empty();
 */
// @lc code=end
/*
21/21 cases passed (0 ms)
Your runtime beats 100 % of java submissions
Your memory usage beats 59.58 % of java submissions (36.9 MB)
*/