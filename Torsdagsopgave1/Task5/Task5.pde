void setup() {
  methodOne(); 
  methodTwo(); 
}

/*
  The following method has an error in it. Fix the error and run it. 
*/

void methodOne()
{
  int i = 1000; // You are not allowed to change this line. 
  
  int max = 10;
  
  if (i > max)
  {
     println("i is greater than "+max+".");   
  }
  

   
}

/* 
  Finish the following method so that we can change the number assigned 
  to the weekday and it prints the correct output.  
*/
void methodTwo() 
{
  String weekDay[] = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"}; // 0 = Monday, 6 = Sunday. 
  boolean weekend = false;
  
  int day = 6;
 
  if (day < 5)
  {
    weekend = false;
    println("Not weekend");
  }
  else 
  {
    weekend = true;
    println("It's weekend");
  }
  
  // Print the name of the weekday here: 
    println(weekDay[day]);
    
  // Print if it is weekend here:
  
}
