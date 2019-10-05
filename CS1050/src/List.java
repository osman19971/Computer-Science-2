/**
 *A list class that implements MyCollectinoInterface for project 3 
 *Calvin Nguyen and Nestor Ayla
 *list class
 *Eclipse Java IDE
 *fulminate: denounce forcefully.
 *"You can't make decisions based on fear and the possibility of what might happen." - Michelle Obama, (1.1964)
 *@author Calvin Nguyen and Nestor Ayla
 *@version project 3 
 *@class CalvinNguyen_03
 */


public abstract class List<T> implements MyCollectionInterface<T>{
   
   private T[] list;
   private int numOfEntries = 0;
   private static final int DEFAULT_CAPACITY = 20;
 //************************************************************************
   // Start of add
   
   /**
    * Adds a new entry to this collection
    * 
    * @param newItem The object to be added to the collection
    * @return True if the addition is successful, or false if not.
    */
   
   public boolean add (T newItem) {
      
        try{
             newItem = list[numOfEntries + 1];
             numOfEntries++;
             return true;
             
        } // End try
        
        catch (Exception e) {
            
            System.err.println(e.getMessage());
            return false;
        } 
   } 
  // End of add
   
 //************************************************************************
   // Start of remove
   
   /**
    * Removes one unspecified entry from the collection, if possible.
    *
    * @return Either the removed entry, if the removal was successful, or null.
    */
     
   public T remove () {
	   
      T temp = null;
      
      if(isEmpty() == false && numOfEntries >= 0) {
         temp = list[numOfEntries];
         list[numOfEntries] = null;
         numOfEntries--;
      } 
      return temp;
   } 
   
  // End of remove

 //************************************************************************
   // Start of remove
   
   /**
    * Removes one occurrence of a given entry from this collection.
    *
    * @param anEntry The entry to be removed.
    * @return true if the removal was successful, false if not.
    */
 
   public boolean remove (T anEntry) {
	   
      boolean found = false;
      int location = 0;
      
      for(int i = 1; i <= numOfEntries && found == false; i++) {
         if(list[i] == anEntry) {
            location = i;
            found = true;
         } 
      } 
      for(int i = location; i <= numOfEntries; i++) {
         list[i] = list[i++];
      } 
      
      numOfEntries--;
      
      return found;
   } 
   
   // End of remove

//************************************************************************
   // Start clear
   
   /**
    * Removes all entries from this collection.
    */
   
   public void clear() {   
      numOfEntries = 0;
      
   } 
   
   // End of clear 

//************************************************************************
   // Start of getCurrentSize
   
   /**
    * Gets the current number of entries in this collection.
    *
    * @return The integer number of entries currently in the collection.
    */
   
   public int getCurrentSize() {   
      if(numOfEntries <= 0) {
         return 0; 
      }
      return numOfEntries;
   } 
   
   // End of getCurrentSize

//************************************************************************
   // Start of isEmpty
   
   /**
    * Check to see if the collection is empty.
    *
    * @return True if the collection is empty, or false if not.
    */

   public boolean isEmpty() {    
      if(getCurrentSize() > 0) {
         return false;
      } 
      return true;
   } 
   
   // End of isEmpty

//************************************************************************
   // Start of getFrequecyOf
   
   /**
    * Counts the number of times a given entry appears in this collection.
    *
    * @param anEntry The entry to be counted.
    * @return The number of times anEntry appears in the collection.
    */
 
   public int getFrequencyOf(T anEntry) {
	
      int frequency = 0;
      
      for(int i = 0; i < numOfEntries; i++) {
         if(list[i] == anEntry) {
            frequency++;
         } 
      } 
      
      return frequency;
      
   } 
   
   // End getFrequencyOf

//************************************************************************
   // Start of contains
   
   /**
    * Tests whether this collection contains a given entry.
    *
    * @param anEntry The entry to locate.
    * @return True if the collection contains anEntry, or false if not.
    */
  
   public boolean contains (T anEntry){
	 
	   
      boolean found = false; 
      int index = 1;
      while(!found && (index <= numOfEntries)) {
         if(list[index].equals(anEntry)) {
            found = true;
         } 
         
         index++;
      }
      
      return found;
      
   } 
   
   // End of contains

 //************************************************************************

   // Start of toArray
   
   /**
    * Retrieves all entries that are in this collection.
    *
    * @return A newly allocated array of all the entries in the collection. 
    * Note: If the collection is empty, the returned array is empty.
    */
   
    public Object[] toArray (T[] result) { 
    	
      for(int index = 0; index < numOfEntries; index++) { 
         result[index] = list[index + 1];
         
      } 
      
      return result;
   }   
    
   // End of toArray
    
}

// End List