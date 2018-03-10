import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;

public class FileRead {
    public SparseMatrix run(String fileName) {
        try{
            File textFile = new File(fileName);
            Scanner input = new Scanner(textFile);


            int numberOfRows = 0;
            int numberOfColumns = 0;

            numberOfRows = input.nextInt();
            numberOfColumns = input.nextInt();

            SparseMatrix matrixA = new SparseMatrix(numberOfRows, numberOfColumns);

            String[] lineNoSpaces = null;
            int rowCount = 0;

            input.nextLine();
            while (input.hasNextLine()) {

                String line = input.nextLine();
                lineNoSpaces = line.split(" ");

                rowCount++;
                for (int i = 0; i < lineNoSpaces.length; i++) {
                  String[] colAndValue = lineNoSpaces[i].split(",");
                  int col = Integer.parseInt(colAndValue[0]);
                  int val = Integer.parseInt(colAndValue[1]);

                  matrixA.insert(rowCount, col, val);
                }
            }
            return matrixA;

        }
        catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }
        return null;
    }

}