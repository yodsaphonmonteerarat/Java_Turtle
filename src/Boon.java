public class Boon implements Runnable {

    @Override
    public void run() {
        Turtle boon =  new Turtle();
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
    }
    
}
