// 4 a
for (int i = 0; i < 20; i++) {
  println("Tæller alle tal "+ i);
}

// 4 b
for (int i = 0; i < 20; i+=2) {
  println("Tæller lige tal "+ i);
}

// 4 c
for (int start = 10; start > 0; start--) {

  if (start == 3) {
    println("Three");
  } else if (start == 2) {
    println("Two");
  } else if (start == 1) {
    println("One");
  } else {
    println(start);
  }
}
println("Take off");

// 4 d
int i = 0;
while (i < 20) {
  println(i);
  i+=2;
}

int start = 10;
while (0 < start) {
  if (start == 3) {
    println("Three");
  } else if (start == 2) {
    println("Two");
  } else if (start == 1) {
    println("One");
  } else {
    println(start);
  }
  start--;
}
println("Take off");
