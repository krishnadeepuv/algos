class MinStack {

    class StackNode {
        int val;
        int previousMin = 0;
        StackNode previousNode = null;

        StackNode(int val, StackNode prev, int prevMin) {
            this.val = val;
            this.previousNode = prev;
            this.previousMin = prevMin;
        }
    }

    StackNode head = null;

    public MinStack() {
        head = new StackNode(0, null, Integer.MAX_VALUE);
    }

    public void push(int val) {
        StackNode st = new StackNode(val, head, (val < head.previousMin ? val : head.previousMin));
        head = st;
    }

    public void pop() {
        head = head.previousNode;
    }

    public int top() {
        return head.val;
    }

    public int getMin() {
        return head.previousMin;
    }
}
