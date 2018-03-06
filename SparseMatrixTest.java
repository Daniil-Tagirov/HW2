
public class SparseMatrixTest {
    public void test() {
        int numberOfRows = 4;
        int numberOfColumns = 6;
        SparseMatrix matrixA = new SparseMatrix(numberOfRows, numberOfColumns);
        matrixA.insert(1,1,8);
        matrixA.insert(1,6,60);
        matrixA.insert(1,2,5);
        matrixA.insert(2,2,33);
        matrixA.insert(2,4,36);
        matrixA.print();
    }
}
