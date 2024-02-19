package p2;
public class Dragon {
    int x, y, width, height;
    
    void moveLeft(){
        x -= 1;
        printPosition();
    }

    void moveRight(){
        x += 1;
        printPosition();
    }

    void moveUp(){
        y -= 1;
    }

    void moveDown(){
        y += 1;
    }

    void printPosition(){
        System.out.println("Posisi Dragon: "+ x + ", " + y);

    }

    void detectCollision(int x, int y){
        if (x < 0 || x == width || y == height || y > 0 ) {
            System.out.println("Game Over");
        }
    }

    public Dragon(int xdragon, int ydragon, int mapwidht, int mapheight){
        x = xdragon;
        y = ydragon;
        width = mapwidht;
        height = mapheight;
    }
}