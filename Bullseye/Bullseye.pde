int x = 100;
int y = 100;
void setup(){
  
}
void draw(){
  if (x>9){
  if (x%20==0){
  fill(#F20707);
  ellipse(50,50,x,y);
  x=x-10;
  y=y-10;
  }
  else{
    fill(255,255,255);
    ellipse(50,50,x,y);
  x=x-10;
  y=y-10;
  }
}
}
