class Missing{
    
    // function to find first positive missing number
    static int missingNumber(int A[], int size)
    {
        
       
        boolean[] present = new boolean[size + 1]; 
        for (int i = 0; i < size; i++) { 
  
            if (A[i] > 0 && A[i] <= size) 
                present[A[i]] = true; 
        } 
  
        for (int i = 1; i <= size; i++) 
            if (!present[i]) 
                return i; 
  
        
        return size + 1; 
        
    }
    
}
