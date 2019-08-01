PImage catPic;
int x = 315;
int y= 210;
int acceleration = 5; 
void setup(){
  
size (500, 500);
catPic = loadImage ("cat.jpg");
catPic.resize(width, height);
background(catPic);

}
void draw(){
  if(mousePressed){
    println("Mouse's x-position:" + mouseX + "/n" + "Mouse's y-position:" + mouseY + "/n");
  }
  noStroke();
  ellipse (x, y, 35, 35);
  ellipse (x-45, y-20, 30, 30);
  fill(100, 10, 0);
  if (y>= 500){
    background(catPic);
    x =315;                                             
    y = 210;
    acceleration =5;
  }    

}
void keyPressed(){
  x-=2*acceleration;
  y+=2*acceleration;
  
}
