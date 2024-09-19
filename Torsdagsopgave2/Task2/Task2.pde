

void setup()
{
  int sum = sum(10, 10);
  println(sum);
  
  String text = textToUpper("text");
  println(text);
  
  println(checkFirstLettet("hello"));
  println(checkFirstLettet("Hello"));
}



int sum(int a, int b)
{
  return a+b;
}


String textToUpper(String textToUpperCase)
{
  return textToUpperCase.toUpperCase();
}

boolean checkFirstLettet(String input)
{
  char firstLetter = input.charAt(0);
  return Character.toUpperCase(firstLetter) == firstLetter;
 
}
