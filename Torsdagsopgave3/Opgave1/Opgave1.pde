int[] arr = {28, 230, 9, 310, 72};

void setup(){
  int randomIndex = getRandom(); 
  println(randomIndex);
}

int getRandom(){
  int arrLength = arr.length;
  int randomNumber = (int)random(0, arrLength);
  return arr[randomNumber];
}
