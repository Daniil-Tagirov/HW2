import java.io.PrintStream;

public class SparseMatrix {

    private ValueNode firstRow;
    private ValueNode firstColumn;
    private int totalRows;
    private int totalColumns;

    public SparseMatrix(int rows, int columns) {
        // Create heads for amount of columns in matrix
        totalRows = rows;
        totalColumns = columns;
        ValueNode theFirstColumn = new ValueNode();
        this.firstColumn = theFirstColumn;


        for(int i = 1; i <= columns; i++) {
            theFirstColumn.setNextInColumn(new ValueNode());
            theFirstColumn = (ValueNode)theFirstColumn.getNextInColumn();
        }


        // Create heads for amount of rows in matrix
        ValueNode theFirstRow = new ValueNode();
        this.firstRow = theFirstRow;
        ValueNode currentRow = this.firstRow;

        for(int i = 1; i <= rows; i++) {
            theFirstRow.setNextInRow(new ValueNode());
            theFirstRow = (ValueNode)theFirstRow.getNextInRow();
        }

    }


    public void insert(int row, int column, int value) {
    	ValueNode nodeToInsert = new ValueNode(row, column, value);
    	ValueNode rowCount = firstRow;
    	for (int i = 0; i < nodeToInsert.getRow(); i++) {
    	rowCount = (ValueNode)rowCount.getNextInRow();
    	}
    	
    	ValueNode getTheRow = new ValueNode();
    	getTheRow = (ValueNode)rowCount.getNextInRow();
    	
    	//compare the row this node want to be in with the row the other node is in
    	while (rowCount.getColumn() > getTheRow.getColumn()) { 
    		rowCount = (ValueNode)rowCount.getNextInColumn();
    		getTheRow = (ValueNode)getTheRow.getNextInColumn();
    	}
    	if (rowCount.getNextInColumn() != null) {
    		nodeToInsert.setNextInColumn(rowCount.getNextInColumn());
    	}
    	rowCount.setNextInColumn(nodeToInsert);
    	
    	////////////////
    	ValueNode columnCount = firstColumn;
    	for (int i = 0; i < nodeToInsert.getColumn(); i++) {
    		columnCount = (ValueNode)columnCount.getNextInRow();
    	}
    	ValueNode getTheColumn = new ValueNode();
    	getTheColumn = (ValueNode)columnCount.getNextInColumn();
    	while (columnCount.getRow() > getTheColumn.getRow()) { //might need to see if this value exists
    		columnCount = (ValueNode)columnCount.getNextInRow();
    		getTheColumn = (ValueNode)getTheColumn.getNextInRow();
    	}
    	if (columnCount.getNextInRow() != null) {
    		nodeToInsert.setNextInRow(columnCount.getNextInRow());
    	}
    	columnCount.setNextInRow(nodeToInsert); 
    }


    public ValueNode getRow (int position) {
        ValueNode row = firstRow;

        for(int i = 1; i < position; i++) {
            row = (ValueNode)row.getNextInRow();
        }

        return row;
    }


    public ValueNode getColumn (int position) {
        ValueNode column = firstColumn;

        for (int i = 1; i < position; i++) {
            column = (ValueNode) column.getNextInColumn();
        }

        return column;
    }

    public int getValue(int row, int column) {
        ValueNode counter = new ValueNode();
        for (int i = 0; i <= row; i++) {
        	counter = (ValueNode) counter.getNextInRow();
        }
        for (int j = 0; j <= column; j++) {
        	if (counter.getColumn() > j) {
        		//do nothing
        	} else {
        		//iterate counter.getNext
            	if (counter.getNextInColumn() == null && counter.getColumn() != j) {
            		return 0;
            	} else if (counter.getColumn() == j) {
            		return counter.getValue();
            	}
            	counter = (ValueNode) counter.getNextInColumn();
        	}
       
        	if (counter.getNextInColumn() == null) {
        		return 0;
        	}
        
        }
        return 0;
    }


    public void print() {
        for(int i = 1; i <= totalRows; i++) {
            for(int j = 1; j <= totalColumns; j++) {
                int currentValue = getValue(i, j);
                System.out.print(currentValue + "\t");
            }
            System.out.println();
        }
    }


    public SparseMatrix transpose() {
        //FILL
        return new SparseMatrix(0, 0);
    }


    public SparseMatrix product(SparseMatrix other) {
        //FILL
        return new SparseMatrix(0, 0);
    }
}
