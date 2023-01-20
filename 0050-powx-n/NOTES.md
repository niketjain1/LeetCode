## Solution-

### Brute force Approach
Iterate the loop from 1 - n and multiply x by itself and if n is negative then simply take the reciprocal of the answer so the final answer would be 1/ans when n is negative.
T.C. - O(n)     
S.C. - O(1)

### Optimized approach
**_NOTE:_** Check if n is negative if so we have to assign n as a long data type because when we will make n positive it will get out of the range for int data type.     
Consider the example x = 2 and n = 10 

x can be written as $(2 * 2)^5 = 4^5$    
$4^5$ can be written as $(4 * 4^4)$  
now $4^4$ can be written as $(4 * 4)^2 = 16^2$ and so on..

if n is even we are just squarring x and $n = n/2$. If it is odd we are multiplying ans by x and $n = n - 1$    
T.C. - O(n)    
S.C. - O(1)
