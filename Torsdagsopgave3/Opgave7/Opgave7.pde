ArrayList<Integer> numbers = new ArrayList<Integer>();
ArrayList<String> letters = new ArrayList<String>();
ArrayList<Boolean> trueOrFalse = new ArrayList<Boolean>();

void setup(){

  numbers.add(10);
  numbers.add(5);
  numbers.add(20);
  
  letters.add("Victor");
  letters.add("Sofus");
  letters.add("Angelique");
  
  trueOrFalse.add(false);
  trueOrFalse.add(true);
  trueOrFalse.add(false);
  
  printArrayList();
  
  int totalSum = sumArrayList(numbers);
  
  println("Sum of all elements: " + totalSum);
}


void printArrayList(){
  for(int i = 0; i < letters.size(); i++){
    println(letters.get(i));
  }
}




int sumArrayList(ArrayList<Integer> numbers) {
  int sum = 0;
  for (int num : numbers) {
    sum += num;
  }
  return sum;
}

//
