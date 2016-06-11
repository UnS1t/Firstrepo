
package pascaltriangle;

public class Algorithm {
    // the number of columns the triangle will have
    public int columns;
    
    public Algorithm(int setColumns){
        columns = setColumns - 1 ;
        
    }
  
    public void generating(){
        // the second set of array are for rows, it dosen't have a value because in every columns the numbers of rows are differents.
     int[][] numbers = new int[columns][columns];
   // c stands for columns and r stand for rows
            numbers[0][0] = 1;
            numbers[1][0] = 1;
            numbers[1][1] = 1;
        for (int c = 2; c < columns; c++) {
            numbers [c][0] = 1;
           
            for (int r = 1; r < c - 1 ; r++) {
                
                numbers [c][r] = numbers [c - 1 ][r -1] + numbers [c - 1][r];
                
            }
                numbers[c][c] = 1;    
            
            
        }
   for (int c = 1; c < columns; c++) {
       for (int i = 0; i < columns - c + 1; i ++){
           System.out.print(" ");
       }
            for (int r = 0; r < c -1 ; r++) {
                System.out.print(numbers[c][r] + " ");
                
            }
            System.out.println("");
            
            
        }
}
    
    public void printing(){
        
        
   }
}
