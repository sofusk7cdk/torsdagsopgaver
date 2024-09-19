void setup()
{
  Student student1 = new Student("Sofus", 20, false, 1);
  Student student2 = new Student("Nik", 22, false, 1);
  Teacher teacher = new Teacher("Jesper", 34, false);
  
  println(student1.toString());
  println(student2.toString());
  println(teacher.toString());
  
  teacher.changeName("Tess");
  println(teacher.name);
}
