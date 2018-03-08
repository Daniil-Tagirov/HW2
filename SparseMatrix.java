
public class SparseMatrix {

    private HeadNode firstRow;
    private HeadNode firstColumn;
    private int totalRows;
    private int totalColumns;

    public SparseMatrix(int rows, int columns) {
        // Create heads for amount of columns in matrix
        totalRows = rows;
        totalColumns = columns;
        this.firstColumn = new MatrixColumn();
        HeadNode currentColumn = this.firstColumn;
        Node columnHead = (Node)currentColumn;

        for(int i = 1; i <= columns; i++) {
            columnHead.setNextInRow(new MatrixColumn());
            columnHead = columnHead.getNextInRow();
        }

        // Create rows for amount of columns in matrix
        this.firstRow = new MatrixRow();
        HeadNode currentRow = this.firstRow;
        Node rowHead = (Node)currentRow;

        for(int i = 1; i <= rows; i++) {
            rowHead.setNextInColumn(new MatrixRow());
            rowHead = rowHead.getNextInColumn();
        }

    }


    public void insert(int row, int column, int value) {
        ValueNode nodeToInsert = new ValueNode(row, column, value);

        HeadNode rowHead = getRow(row);
        rowHead.insert(nodeToInsert);

        HeadNode columnHead = getColumn(column);
        columnHead.insert(nodeToInsert);
    }


    public HeadNode getRow (int position) {
        HeadNode row = firstRow;

        for(int i = 1; i < position; i++) {
            row = row.getNext();
        }

        return row;
    }


    public HeadNode getColumn (int position) {
        HeadNode column = firstColumn;

        for (int i = 1; i < position; i++) {
            column = column.getNext();
        }

        return column;
    }

    public int getValue(int row, int column) {
        HeadNode r = getRow(row);
        int result = r.get(column);

        return result;
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