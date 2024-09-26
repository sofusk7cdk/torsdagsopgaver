void setup()
{
  recursion(2);
}


int recursion(int x)
{
  println(x);
  if (x <= 0)
  {
    return 0;
  } else
  {
    int substract = x - 1;
    return recursion(substract);
  }
}
