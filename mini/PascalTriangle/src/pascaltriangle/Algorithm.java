
package pascaltriangle;

public class Algorithm {
    // the number of columns the triangle will have
    public int columns;
    public Algorithm(int setColumns){
        columns = setColumns;
        
    }
    public void generating(){
        // the second set of array are for rows, it dosen't have a value because in every columns the numbers of rows are differents.
   int[][] numbers = new int[columns][];
   // c stands for columns and r stand for rows
        for (int c = 0; c < columns; c++) {
            numbers[c][0] = 1;
           
            for (int r = 1; r < c - 2 ; r++) {
                numbers [c][r] = numbers [c - 1 ][r -1] + numbers [c - 1][r];
                
            }
            if ( c > 0){
                numbers[columns][c] = 1;
               
                
                
            }
            
        }
   
}
    
}
