import javafx.print.PageLayout;

/**
 * Created by oksana.shcherban on 22.06.19.
 */
public class Client {

    public static void main(String[] args) {

        Player cdPlayer = new Player(PlayerType.CD);
        Player cassette = new Player(PlayerType.CASSETTE);
        String[] songs = {"Lala", "Unspoken", "Umbrella", "Crazy", "What Once Was Lost", "The Search for the Blue Fairy"};
        PlayData playData = new PlayData(songs);

        cdPlayer.insertPlayerData(playData);
        cdPlayer.play(3);

        cassette.insertPlayerData(playData);
        cassette.play(5);
    }
}
