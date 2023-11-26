package stringprobleams;

public class ShortestTestPath {
    static int getShortestPath(String path){
        int x=0, y=0;
        for(int i=0; i<path.length(); i++){
            char dir = path.charAt(i);
            if (dir == 'S'){
                y--;
            } else if (dir == 'N') {
                y++;
            } else if (dir == 'w') {
                x--;
            } else {
                x++;
            }
        }

        int xSquare = x*x;
        int ySquare = y*y;
        return (int) Math.sqrt(xSquare + ySquare);
    }

    public static void main(String[] args) {
        String path = "NS";
        System.out.println(getShortestPath(path));
    }
}
