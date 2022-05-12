public class life_game {
    public static void main(String[] args) {
        GameMap map = new GameMap(30, 30);
        GUI game = new GUI(map);
        game.startGame();
    }
}