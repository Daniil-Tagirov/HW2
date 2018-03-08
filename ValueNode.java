
public class ValueNode implements Node {
    int row;
    int column;
    int value;
    Node nextInRow;
    Node nextInColumn;

    public ValueNode(){}

    public ValueNode(int row, int column) {
        this.row = row;
        this.column = column;
    }

    public ValueNode(int row, int column, int value) {
        this.row = row;
        this.column = column;
        this.value = value;
    }


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


    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}