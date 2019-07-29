PImage mustache;
  PImage friend;

void setup(){
  friend=
  loadImage("TimmyTurner.jpg");
  size(800,600);
  friend.resize(width,height);
  mustache=
  loadImage("Moustache.png");
  mustache.resize(400,200);
}

void draw(){
  background(friend);

   if (mousePressed) {background(friend);
       image(mustache,mouseX-200,mouseY-50);
   }
}
