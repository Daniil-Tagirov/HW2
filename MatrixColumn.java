public class MatrixColumn implements Node{
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
    	/*MatrixColumn att = new MatrixColumn();
    	HeadNode attainHead = att;
    	for (int i = 1; i < value.getColumn(); i++) {
    		attainHead = attainHead.getNext();
    	} //gets us to the right column head
    	ValueNode column = attainHead.getFirst(); // makes a new node at column head to iterate
    	ValueNode getTheRow = (ValueNode)column.getNextInRow();
	while (column.getRow() > getTheRow.getRow()) { //compare the row this node want to be in with the row the other node is in
			column = (ValueNode)column.getNextInRow();
			getTheRow = (ValueNode)getTheRow.getNextInRow();
		}
		if (column.getNextInRow() != null) {
			value.setNextInRow(column.getNextInRow());
		}
		column.setNextInRow(value); 
        //insert along nextInColumn
		@Override
		public void setNextInColumn(ValueNode valuenode) {
			// TODO Auto-generated method stub
			*/
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


	public Node getNextInCollumn() {
		// TODO Auto-generated method stub
		return null;
	}


	public void setNextInCollumn(Node next) {
		// TODO Auto-generated method stub
		
	}
}
	
	

	
