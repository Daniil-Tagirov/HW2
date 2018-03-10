
public interface HeadNode {
    HeadNode getNext();
    ValueNode getFirst();
    void insert(ValueNode value);
    int get(int position);
}

