import processing.core.PApplet;

public class FourBallsMoving extends PApplet {

    int WIDTH = 800;
    int HEIGHT = 600;
    int DIAMETER = 10;
    int[] heightPosition = {1,2,3,4};
    int[] speed = {1,2,3,4};
    int[] stateX ={0,0,0,0};

    public static void main(String[] args) {
        PApplet.main("FourBallsMoving",args);
    }

    @Override
    public void settings() {
        //super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void draw() {
        super.draw();
        for(int i=0;i<4;i++){
            moveTheBallForward(i);
        }

    }
    public void moveTheBallForward(int index) {
        ellipse(stateX[index],((heightPosition[index] *HEIGHT)/5), DIAMETER, DIAMETER);
        stateX[index] += speed[index];
    }
}
