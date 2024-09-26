int[][] board = new int[8][8];  
int sideLength = 40;            

void setup() {
  size(320, 320);  
  for (int x = 0; x < board.length; x++) {
    for (int y = 0; y < board[x].length; y++) {
      board[x][y] = (x + y) % 2;
    }
  }
}

void draw() {
  for (int x = 0; x < board.length; x++) {
    for (int y = 0; y < board[x].length; y++) {
      if (board[x][y] == 0) {
        fill(0); 
      } else {
        fill(255); 
      }
      rect(x * sideLength, y * sideLength, sideLength, sideLength);
    }
  }
}
