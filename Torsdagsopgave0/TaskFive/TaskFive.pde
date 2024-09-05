/* 
The code in this sketch will not compile, as it referes to varables which have not yet been declared 
Please complete task 5 to get this to compile.
*/

int numberOfCircles;
int circleSize;
int x;
int y;
int counter = 0;
int rowCounter = 0;

int r, g, b;

void setup(){
   size(400,400);
   
   r = 255;
   g = 255;
   b = 255;
  
   numberOfCircles = 30;
   circleSize = width/numberOfCircles;
   ellipseMode(CORNER);
  
}
void draw(){
  
 
  x = circleSize*counter;
  y = circleSize*rowCounter;
   
   
  ellipse(x,y,circleSize,circleSize);
  
  fill(r,g,b);
  
  // Explaining conditional assignments. 
  // First part before the ?-mark, is a conditional. 
  // If this is true, the value after the ?-mark will be assigned. 
  // If not, the last value will.
  counter =  frameCount % numberOfCircles == 0 ? 0 : counter+1;
  rowCounter =  counter==0 ? rowCounter+1:rowCounter;
  
  
  // Explaining the modulus operator
  // Modulus is what is left when you divide one int with another int.
  // 1 % 3 = 1 (3 people can't share 1 apple without cutting it, so 1 apple is left)
  // 2 % 3 = 2
  // 3 % 3 = 0
 
  //Add the code for 6.c here
  r = counter==0 ? (int)random(255):r;
  g = counter==0 ? (int)random(255):g;
  b = counter==0 ? (int)random(255):b;
}
