Student student1;
Student student2;

void setup()
{
  student1 = new Student("Sofus", 20, false, 1);
  student2 = new Student("Nik", 22, false, 1);
  Teacher teacher = new Teacher("Jesper", 34, false);
  
  println(student1.toString());
  println(student2.toString());
  println(teacher.toString());
  
  boolean isClassmatesVar = isClassmates(student1.datamatikerTeam, student2.datamatikerTeam);
  
  println(isClassmatesVar);
}


boolean isClassmates(String a, String b)
{
  if (a == b)
  {
    return true;
  }
  return false;
}
