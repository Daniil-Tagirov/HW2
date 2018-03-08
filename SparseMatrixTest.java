
public class SparseMatrixTest {
    public void test() {
//        int numberOfRows = 4;
//        int numberOfColumns = 6;
//        SparseMatrix matrixA = new SparseMatrix(numberOfRows, numberOfColumns);
//        matrixA.insert(1,1,8);
//        matrixA.insert(1,6,60);
//        matrixA.insert(1,2,5);
//        matrixA.insert(2,2,33);
//        matrixA.insert(2,4,36);
//        matrixA.print();
        testRowInsert();
        testColumnInsert();
    }

    private void testRowInsert(){
        System.out.println("Testing Row Insert:");
        MatrixRow testRow = new MatrixRow();
        ValueNode r1 = new ValueNode(1,6,60);
        ValueNode r2= new ValueNode(1,1,1);
        ValueNode r3 = new ValueNode(1,2,5);
        ValueNode r4 = new ValueNode(1,4,7);
        ValueNode r5 = new ValueNode(1,8,19);

        testRow.insert(r1);
        testRow.print();
        testRow.insert(r2);
        testRow.print();
        testRow.insert(r3);
        testRow.print();
        testRow.insert(r4);
        testRow.print();
        testRow.insert(r5);
        testRow.print();
    }

    private void testColumnInsert() {
        System.out.println("Testing Column Insert:");
        MatrixColumn testColumn = new MatrixColumn();
        ValueNode c1 = new ValueNode(6,1,60);
        ValueNode c2= new ValueNode(1,1,1);
        ValueNode c3 = new ValueNode(2,1,5);
        ValueNode c4 = new ValueNode(4,1,7);
        ValueNode c5 = new ValueNode(8,1,19);

        testColumn.insert(c1);
        testColumn.print();
        testColumn.insert(c2);
        testColumn.print();
        testColumn.insert(c3);
        testColumn.print();
        testColumn.insert(c4);
        testColumn.print();
        testColumn.insert(c5);
        testColumn.print();
    }
}