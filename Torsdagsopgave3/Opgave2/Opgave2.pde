void setup() {
  printPartOfWord("København", 0, 3);
  printLastFoorLetters("Sofus", 0, 0);
  printLastFoorLettersNoMatterWhat("Tes", 0, 0);
}


void printPartOfWord(String word, int startIndex, int endIndex) {
  String newWord = word.substring(startIndex, endIndex);
  println(newWord);
}

void printLastFoorLetters(String word, int startIndex, int endIndex) {
  startIndex = word.length() -4;
  endIndex = word.length();
  String newWord = word.substring(startIndex, endIndex);
  println(newWord);
}

void printLastFoorLettersNoMatterWhat(String word, int startIndex, int endIndex) {
  if (word.length()-4 >= 0) {
    startIndex = word.length() -4;
    endIndex = word.length();
    String newWord = word.substring(startIndex, endIndex);
    println(newWord);
  } else {
    println("Your word does not have enough letters");
  }
}
