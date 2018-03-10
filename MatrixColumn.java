public class MatrixColumn implements Node, HeadNode{
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
        return (HeadNode)nextInRow;
    }

    public ValueNode getFirst() {
        return (ValueNode)nextInColumn;
    }

    public void insert(ValueNode value) {
        if (getFirst() == null)  {
            setNextInColumn(value);
        }

        else if (value.getRow() < getFirst().getRow() ) {
            value.setNextInColumn(getFirst());
            setNextInColumn(value);
        }

        else {
            ValueNode previous = getFirst();
            ValueNode cur = (ValueNode)previous.getNextInColumn();
            while (cur != null && cur.getRow() < value.getRow()) {
                previous = cur;
                cur = (ValueNode)previous.getNextInColumn();
            }
            value.setNextInColumn(cur);
            previous.setNextInColumn(value);
        }

    }


    public int get(int position) {
        ValueNode cur = (ValueNode)nextInColumn;

        while(cur != null && cur.getRow() < position) {
            cur = (ValueNode)cur.getNextInColumn();
        }

        if(cur == null || cur.getRow() > position)
            return 0;
        else
            return cur.getValue();
    }
}