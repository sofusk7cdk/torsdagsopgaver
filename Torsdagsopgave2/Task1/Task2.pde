void setup()
{
  String hello = hello();
  println(hello);
  
  String recPar = receiveParameter("ReceivedParameter");
  println(recPar);
  
  String nameAge = name("Sofus", 20);
  println(nameAge);
}


String hello()
{
  return "Hello from the method";
}

String receiveParameter(String par)
{
  return par;
}


String name(String name, int age)
{
  return "My name is " + name + " i am " + age + " years old";
}
