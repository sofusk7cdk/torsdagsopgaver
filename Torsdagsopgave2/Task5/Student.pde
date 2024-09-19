class Student
{
  String name;
  int age;
  boolean isFemale;
  String datamatikerTeam;


  String[] datamatikerTeamArray = {"Team 1", "Team 2"};

  Student(String tmpName, int tmpAge, boolean tmpIsFemale, int tmpTeamIndex)
  {  
    name = tmpName;
    age = tmpAge;
    isFemale = tmpIsFemale;
    datamatikerTeam = datamatikerTeamArray[tmpTeamIndex];
  }
  
  String toString(){
    return "My name is " + name + " i am " + age + " years old" + " i am " + isFemale + " my team is " + datamatikerTeam;
  }
}
