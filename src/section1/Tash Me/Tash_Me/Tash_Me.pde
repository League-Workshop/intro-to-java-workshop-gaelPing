PImage mustache;
PImage robert;
void setup() {
robert= loadImage("robert");
size(800, 600);
robert.resize(width,height);
mustache = loadImage("stash.png");
mustache.resize(300,100);
}
void draw() {
  if (mousePressed){
background(robert);
image(mustache, 200, 250);
}
else background(robert);
}
