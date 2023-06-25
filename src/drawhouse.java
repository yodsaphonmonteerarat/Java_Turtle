public class drawhouse {     
    public static void main(String[] args) {
        Turtle boon =  new Turtle();
        Turtle max = new Turtle();
boon.bgcolor("light blue");
for (int i = 0; i<4; i++)
{
boon.forward(100);
boon.left(90);
} 
  boon.left(90);
  boon.forward(100);
  boon.right(45);
  boon.forward(71);
  boon.right(90);
  boon.forward(71);
  boon.left(180);
  boon.forward(71);
  boon.penColor("orange");
  boon.left(45);
  boon.backward(20);
  for (int i = 0; i<4; i++){
    boon.forward(100);
    boon.right(90);
    boon.forward(20);
    boon.right(90);
    boon.forward(100);
    boon.left(90);
    boon.forward(100);
    boon.left(90);
    boon.forward(20);
    boon.left(90);
    boon.forward(100);

  }
max.forward(25);
max.left(90);
max.forward(50);
max.right(90);
max.forward(25);
max.right(90);
max.forward(50);
max.up();
max.setPosition(70, 70);
max.down();
for (int i = 0; i<4; i++){
max.forward(25);
max.left(90);
}



  
}

}
