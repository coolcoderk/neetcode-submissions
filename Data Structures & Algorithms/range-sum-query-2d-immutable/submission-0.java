class NumMatrix {
public int [][] matrix;
    public NumMatrix(int[][] matrix) {
        this.matrix=matrix;
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        int sum=0;
        // int vlen=row2-row1;
        // int hlen=col2-col1;
        // for(int i=row1;i<row1+vlen;i++){
        //     for(int j=col1;j<col1+hlen;j++){
        //        sum+=matrix[i][j];
        //     }

        // }
        for(int i=row1;i<=row2;i++){
            for(int j=col1;j<=col2;j++){
                sum+=matrix[i][j];
            }
        }
        return sum;
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */