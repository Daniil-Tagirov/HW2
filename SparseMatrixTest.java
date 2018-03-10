
public class SparseMatrixTest {
    public void test() {

        FileRead createMatrixA = new FileRead();
        SparseMatrix matrixA = createMatrixA.run("matrixA.dat");
        matrixA.print();

        SparseMatrix matrixAT = matrixA.transpose();
        System.out.println();

        matrixAT.print();

        System.out.println();


        FileRead createMatrixB = new FileRead();
        SparseMatrix matrixB = createMatrixB.run("matrixB.dat");
        matrixB.print();

        SparseMatrix matrixBT = matrixB.transpose();
        System.out.println();
        matrixBT.print();
   }
}
