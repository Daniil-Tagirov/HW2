
public interface Node {
    Node getNextInRow();

    void setNextInRow(Node next);

    Node getNextInColumn();

    void setNextInColumn(Node next);
}
