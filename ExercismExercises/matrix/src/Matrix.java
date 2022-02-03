class Matrix {

    private int[][] matrix;

    Matrix(String matrixAsString) {

        String[] strRows = matrixAsString.split("\n");
        matrix = new int[strRows.length][];

        for (int i = 0; i < strRows.length; i++) {

            String[] strCols = strRows[i].split(" ");

            int[] rows = new int[strCols.length];

            for (int j = 0; j < strCols.length; j++) {

                rows[j] = Integer.parseInt(strCols[j]);
            }
            matrix[i] = rows;
        }

    }

    int[] getRow(int rowNumber) {
        return matrix[rowNumber - 1];
    }

    int[] getColumn(int columnNumber) {
        int[] column = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            column[i] = matrix[i][columnNumber - 1];
        }
        return column;
    }
}