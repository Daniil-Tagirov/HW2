
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
        //insert along nextInColumn
    }

    public int get(int position) {
        return 0;
    }

}
