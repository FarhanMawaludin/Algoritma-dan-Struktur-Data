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
        } else {
            detectCollision(x, y); 
        }
    }

    void moveRight() {
        if (x < width - 1) {
            x++;
        } else {
            detectCollision(x, y); 
        }
    }

    void moveUp() {
        if (y > 0) {
            y--;
        } else {
            detectCollision(x, y); 
        }
    }

    void moveDown() {
        if (y < height - 1) {
            y++;
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