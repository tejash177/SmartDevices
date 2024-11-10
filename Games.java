package Project;


public class Games {
    public static boolean playCasino = false;
    private static boolean playRPS = false;

    public static void playCasino() {
    }

    public static void playRPS() {
    }

    public void playGames() {
        System.out.println("1. Casino");
        System.out.println("2. Rock Paper Scissor");

        }
        
    public void casino() {

        if (!playCasino) {
            System.out.println("Playing Casino...");
            playCasino = true;
        } else {
            System.out.println("Media is already playing.");
        }
    }

    public void rps() {

        if (!playRPS) {
            System.out.println("Playing RPS...");
            playRPS = true;
        } else {
            System.out.println("Media is already playing.");
        }
    }

}
