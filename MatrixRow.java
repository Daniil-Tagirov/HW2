public class MatrixRow implements Node, HeadNode {
    private Node nextInRow;
    private Node nextInColumn;

    public Node getNextInRow() {
        return nextInRow;
    }

    public void setNextInRow(Node next) {
        nextInRow = next;
    }

    public Node getNextInColumn() {
        return nextInColumn;
    }

    public void setNextInColumn(Node next) {
        nextInColumn = next;
    }

    public HeadNode getNext() {
        return (HeadNode)nextInColumn;
    }

    public ValueNode getFirst() {
        return (ValueNode)nextInRow;
    }

    public void insert(ValueNode value) {
        if (getFirst() == null) {
            setNextInRow(value);
        }
        else if(value.getColumn() < getFirst().getColumn()) {
            value.setNextInRow(getFirst());
            setNextInRow(value);
        }
        else {
            ValueNode prev = getFirst();
            ValueNode cur = (ValueNode)prev.getNextInRow();

            while(cur != null && cur.getColumn() < value.getColumn()) {
                prev = cur;
                cur = (ValueNode)prev.getNextInRow();
            }

            value.setNextInRow(cur);
            prev.setNextInRow(value);
        }
    }

    public int get(int position) {
        ValueNode cur = (ValueNode)nextInRow;

        while(cur != null && cur.getColumn() < position) {
            cur = (ValueNode)cur.getNextInRow();
        }

        if(cur == null || cur.getColumn() > position)
            return 0;
        else
            return cur.getValue();
    }

    public void print() {
        ValueNode cur = getFirst();

        while(cur != null) {
            System.out.print(cur.getValue() + "\t");
            cur=(ValueNode)cur.getNextInRow();
        }

        System.out.println();
    }
}