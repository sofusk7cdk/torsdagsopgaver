int red = color(255, 0, 0);
int yellow = color(255, 255, 0);
int green = color(0, 255, 0);
int turnOff = color(0);

int lightColor = 1; 
int timer = 0;      
int delayTime = 120; 

void setup() {
  size(400, 400);
  background(70);
  fill(30);
  rect(width/2 - 30, height/2 - 75, 60, 150);
}

void draw() {
  background(70);
  fill(30);
  rect(width/2 - 30, height/2 - 75, 60, 150);

  timer++;

  if (timer > delayTime) {
    lightColor++;
    if (lightColor > 3) {
      lightColor = 1; 
    }
    timer = 0; 
  }

  switch (lightColor) {
    case 1:
      fill(red);
      ellipse(width/2, height/2 - 50, 45, 45);
      fill(turnOff);
      ellipse(width/2, height/2, 45, 45);
      fill(turnOff);
      ellipse(width/2, height/2 + 50, 45, 45);
      break;
    case 2:
      fill(turnOff);
      ellipse(width/2, height/2 - 50, 45, 45);
      fill(yellow);
      ellipse(width/2, height/2, 45, 45);
      fill(turnOff);
      ellipse(width/2, height/2 + 50, 45, 45);
      break;
    case 3:
      fill(turnOff);
      ellipse(width/2, height/2 - 50, 45, 45);
      fill(turnOff);
      ellipse(width/2, height/2, 45, 45);
      fill(green);
      ellipse(width/2, height/2 + 50, 45, 45);
      break;
  }
}
