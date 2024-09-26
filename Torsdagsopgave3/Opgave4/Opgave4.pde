Square[] squares = new Square[10]; 

void setup(){
  size(400,400);
  rectMode(CENTER);
  
  for(int i = 0; i < squares.length; i++){
    squares[i] = new Square((int)random(width),(int)random(height));
    squares[i].display();
  }
}
