PImage catPic;
int x=244;
int y=261;
int acceleration=1;
void setup(){
 size(500,500);
 catPic = loadImage("kitten.jpeg");
   catPic.resize(500,500);
  background(catPic);
 
}
void draw(){
noStroke();
fill(#595A59);
ellipse (x,y,5,5);
ellipse (x-48,y-9,5,5);
if(mousePressed){
println 
("Mouse’s x-position: " + mouseX + "\n" + "Mouse’s y-position: " + mouseY + "\n");}
if(x>500){
 background(catPic);
 x=244;
 y=261;
 }
}
  
void keyPressed(){  
  x+=2*acceleration;
    y+=2*acceleration;
}
