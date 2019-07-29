PImage mustache;
PImage friend;

void setup(){
  friend = loadImage ("friend.jpeg");
  size (800, 600);
  friend.resize(width, height);
  
  mustache = loadImage("MOO.png");
  mustache.resize(500, 500);
  
}
void draw(){
  background (friend);
  if (mousePressed){
      background (friend);
  image (mustache, mouseX-250, mouseY-250);

  
  }  
}
