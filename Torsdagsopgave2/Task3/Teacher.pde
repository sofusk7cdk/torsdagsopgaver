class Teacher
{
  String name;
  int age;
  boolean isFemale;


  Teacher(String tmpName, int tmpAge, boolean tmpIsFemale)
  {
    name = tmpName;
    age = tmpAge;
    isFemale = tmpIsFemale;
  }
  
  String toString()
  {
    return "My name is " + name + " i am " + age + " i am " + isFemale;
  }
}
