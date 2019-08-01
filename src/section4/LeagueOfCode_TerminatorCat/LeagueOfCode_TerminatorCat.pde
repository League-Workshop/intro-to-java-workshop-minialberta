PImage catPic;
int lX=152;
int lY=227;
int rX=326;
int rY=230;
int acceleration=5;
void setup(){
size(500,500);
catPic=loadImage("gianteyescat.jpg");catPic.resize(500,500);
background(catPic);
}
void draw(){
                if(mousePressed){
println("Mouse’s x-position: " + mouseX + "\n" + "Mouse’s y-position: " + mouseY + "\n");}
fill(#E32525);
noStroke();
ellipse(lX,lY,50,50);
noStroke();
fill(#3AFF00);
ellipse(lX+174,lY,50,50);
}
                void keyPressed() {
                 lX+=2*acceleration;
lY+=2*acceleration; 

if(lX>500){
  background(catPic);
  
fill(#E32525);
noStroke();
ellipse(lX,lY,50,50);
noStroke();
fill(#3AFF00);
ellipse(lX+174,lY,50,50);;
  acceleration=1;
}
                }
