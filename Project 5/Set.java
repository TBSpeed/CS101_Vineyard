public class Set
{
   private int [] set;
   public Set()
   {
      makeEmpty();
   }
/* 
Algorithm for Set()		
   call makeEmpty()

Data Table for Set()				
Variable or Constant	Type	Purpose
____________________________________________
*/ 				

   public void makeEmpty()
   {
      set = new int[0];
   }
/*
Algorithm for makeEmpty()					
   set <- new int[0]	

Data Table for makeEmpty()				
Variable or Constant	Type	Purpose
____________________________________________		
set	               int[]	to make the instance variable set, empty				
*/  
   public boolean isEmpty()
   {
      if(size() == 0)
      {
         return true;
      }
      return false;
   }
/*
Algorithm for isEmpty() 
   if (size() == 0)
      return true
   return false
        
Data Table for isEmpty()				
Variable or Constant	Type	Purpose
____________________________________________
*/
   public void add(int value)
   {
      if(!elementOf(value))
      {
         int [] tempSet = new int[size() + 1];
         for(int index = 0; index < size(); index++)
         {
            tempSet[index] = set[index];
         }
         tempSet[size()] = value;
         set = tempSet;
      }
   }
/* 
Algorithm for add(value: int)		
   if !elementOf(value)					
        tempSet <- new int[size() +1]					
        for index <-0, index is less than size(), increment index by + 1					
             tempSet[index] <- set[index]					
        tempSet[size()] <- value					
        set <- tempSet	
        
Data Table for add(value: int)				
Variable or Constant	Type	Purpose
______________________________________________		
tempSet	            int[]	to hold value of original array	
index                int   to count loops				
value                int   the value to be added
*/

   public void remove(int value)
   {
      if(elementOf(value))
      {
         Set tempSet = new Set();
         for(int index = 0; index < size(); index ++)
         {
            if(set[index] != value)
            {
               tempSet.add(set[index]);
            }
         }
         set = tempSet.set;
      }
   }
/* 
Algorithm for remove(value: int)		
   if elementOf has value passing through it					
        tempSet <- new set					
        for index <- 0, index is less than size(), increment index by + 1					
             if set[index] is not value					
                  add set[index] to tempSet					
        set <- tempSet.set		
        
Data Table for remove(value: int)				
Variable or Constant	Type	Purpose
____________________________________________________
tempSet	            Set	empty set for getting rid of original array value		
index                int   to count loops						
value                int   the value to be removed
*/
   public boolean elementOf(int value)
   {
      for(int index = 0; index < size(); index ++)
      {
         if(set[index] == value)
         {   
            return true;
         }
      }
      return false;
   }
/* 
Algorithm for elementOf(value: int): boolean
   for index <- 0, index is less than size(), increment index by + 1					
        if set[index] is equal to value					
             return true					
   return false	
   
Data Table for elementOf()				
Variable or Constant	Type	Purpose
____________________________________________					
value                int   the value to be tested for		
*/
   public int size()
   {
      return set.length;
   }
/*
Algorithm for size()
   return set.length 

Data Table for makeEmpty()				
Variable or Constant	Type	Purpose
____________________________________________
*/
   public Set union(Set setObject)
   {
      Set unionSet = new Set();
      for(int index = 0; index < size(); index ++)
      {
         unionSet.add(set[index]);
      }
      for(int index = 0; index < setObject.size(); index ++)
      {
         unionSet.add(setObject.set[index]);
      }
      return unionSet;
   }
/* 
Algorithm for union(setObject: Set): Set	
   unionSet <- new set					
   for index <- 0, index is less than size(), increment index by + 1					
        add set[index] to unionSet by calling the add method					
   for index <- 0, index is less than setObject.size(), increment index by + 1					
        add setObject.set[index] to unionSet by calling the add method					
   return unionSet
   
Data Table for union(setObject: Set): Set			
Variable or Constant	Type	Purpose
___________________________________________________
unionSet	            Set	holds the whole range of values that is combined from the two original sets 
index                int   to count loops		
setObject            Set   the argument Set					
*/

   public Set intersection(Set setObject)
   {
      Set intersectionSet = new Set();
      for(int index = 0; index < setObject.size(); index ++)
      {
         if(elementOf(setObject.set[index]))
         {
            intersectionSet.add(setObject.set[index]);
         }
      }
      return intersectionSet;
   }
/* 
Algorithm for intersection(setObject: Set): Set	
   intersectionSet <- new set					
   for index <- 0, index is less than setObject.size(), increment index by + 1					
        if elementOf has setObject.size[index]					
             add setObject.size[index] to intersectionSet by calling the add method					
   return intersectionSet		
   
Data Table for intersection(setObject: Set): Set				
Variable or Constant	Type	Purpose		
__________________________________________________
intersectionSet    	Set	holds the values that both orignial sets have in common			
index                int   to count loops	
setObject            Set   the argument Set		
*/

   public Set setDifference(Set setObject)
   {
      
      Set differenceSet = new Set();
      for(int index = 0; index < size(); index++)
      {
         differenceSet.add(set[index]);
      }
      for(int index = 0; index < setObject.size(); index++)
      {
         differenceSet.remove(setObject.set[index]);
      }
      return differenceSet;
   }
/* 
Algorithm for setDifference(setObject: Set): Set	
   differanceSet <- setObject passed through union method					
   intersectionSet <- setObject passed through intersection method					
   differenceSet <- new set					
   for index <- 0, index is less than unionSet.size(), increment indexx by + 1					
        if !intersectionSet.elementOf(unionSet.set[index])					
             add unionSet.set[index] to differenceSet by calling the add method					
   return differenceSet		
   
 Data Table for setDifference(setObject: Set): Set				
Variable or Constant	Type	Purpose		
_________________________________________________
differenceSet	      Set	holds the values that neither of the original sets have in common with each other	
index                int   to count loops		
setObject            Set   the argument Set			
*/

   public String toString()
   {
      String string = "{";
      if (size() > 0)
      {
         string += set[0];
         for (int index = 1; index < size(); index++)
         {
            string += "," + set[index];
         }
      }
      return string + "}";
   }
/* 
Algorithm for toString(): String		
   string <- set to starting bracket					
   if size() is greater than 0					
        string <- set[0]					
        for index <- 1, index is less than size(), increment index by + 1					
             string <- string plus comma plus set[index]					
   return string plus ending bracket	
   
Data Table for toString(): String				
Variable or Constant	Type	Purpose
_________________________________________________	
string	            String	holds the beginning bracket for an array		
index                int   to count loops				
*/
}