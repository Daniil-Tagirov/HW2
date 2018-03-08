public class MatrixRow implements Node{
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
   /* 	MatrixRow att = new MatrixRow();
    	HeadNode attainHead = att;
    	for (int i = 1; i < value.getRow(); i++) {
    		attainHead = attainHead.getNext();
    	} //gets us to the right column head
    	ValueNode row = attainHead.getFirst(); // makes a new node at column head to iterate
    	if (row.nextInColumn == null) {
    		attainHead = (ValueNode)attainHead.setNextInColumn(value);
    	}
    	ValueNode getTheRow = (ValueNode)row.getNextInColumn(); // if no next node, unnecessary
	while (row.getColumn() > getTheRow.getColumn()) { //compare the row this node want to be in with the row the other node is in
			row = (ValueNode)row.getNextInColumn();
			getTheRow = (ValueNode)getTheRow.getNextInColumn();
		}
		if (row.getNextInColumn() != null) {
			value.setNextInColumn(row.getNextInColumn());
		}
		row.setNextInColumn(value); 
        //insert along nextInColumn
    	*/
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

}
