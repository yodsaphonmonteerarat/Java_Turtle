public class Max implements Runnable {

    @Override
    public void run() {
        Turtle max = new Turtle();
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
