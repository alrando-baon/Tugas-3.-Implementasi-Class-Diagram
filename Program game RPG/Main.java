public class Main {
    public static void main(String[] args) {
        // 1. Inisialisasi Game
        Game_RPG myGame = new Game_RPG();
        myGame.title = "valo moibile";
        myGame.version = "1.1.2";

        // 2. Membuat Player
        Player player1 = new Player();
        player1.Name = "Melva psrb";
        player1.Health = 100;
        player1.Level = 1;

        // 3. Membuat Enemy
        Enemy person = new Enemy();
        person.Bot = "Anonymus";
        person.Health = 100;

        // 4. Membuat Map dan Battle
        Map forestMap = new Map();
        forestMap.mapName = "pochinki";
        
        Battle battle1 = new Battle();

        // --- Simulasi Alur Game ---
        System.out.println("=== " + myGame.title + " v" + myGame.version + " ===");
        forestMap.loadMap();
        
        battle1.StartBattle();
        player1.Move();
        player1.AttackEnemy();
        
        System.out.println("Musuh: " + person.Bot + " terdeteksi!");
        System.out.println(person.method("human"));

        battle1.Endbattle();
        myGame.save_progres();
    }
}