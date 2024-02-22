package p2;

public class DragonMain {
    public static void main(String[] args) {
        Dragon fire = new Dragon(4, 1, 10, 10);
        
        fire.moveDown();
        fire.moveLeft();
        fire.moveUp();
        fire.moveRight();
    }
}
