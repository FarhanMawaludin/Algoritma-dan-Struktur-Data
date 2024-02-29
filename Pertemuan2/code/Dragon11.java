public class Dragon11 {
    int x;
    int y;
    int width;
    int height;

    public Dragon11(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    void moveLeft() {
        if (x > 0) {
            x--;
            printPosition();
        } else {
            detectCollision(x, y); 
        }
    }

    void moveRight() {
        if (x < width ) {
            x++;
            printPosition();
        } else {
            detectCollision(x, y); 
        }
    }

    void moveUp() {
        if (y > 0) {
            y--;
            printPosition();
        } else {
            detectCollision(x, y); 
        }
    }

    void moveDown() {
        if (y < height) {
            y++;
            printPosition();
        } else {
            detectCollision(x, y); 
        }
    }

    void printPosition() {
        System.out.println("posisi dragon: (" + x + ", " + y + ")");
    }

    void detectCollision(int x, int y) {
        System.out.println("Game Over");
    }


}