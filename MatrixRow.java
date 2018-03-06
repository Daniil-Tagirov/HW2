
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
        //insert along nextInRow
        ValueNode next = (ValueNode)getNextInColumn();

        int nodeValue = value.getValue();

        ValueNode cur = (ValueNode)nextInRow;
        while (cur != null && nodeValue < next.getNextInColumn(next.getValue());

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
}
