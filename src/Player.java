/**
 * Created by oksana.shcherban on 22.06.19.
 */
public class Player {

    IPlayerImplementation playerImplementation;

    Player(PlayerType type) {
    switch (type) {
        case CD:
            playerImplementation = new CDPlayer();
            break;
        case CASSETTE:
            playerImplementation = new CassettePlayer();
            break;
        }
    }

    public void play(int trackNumber) {
        playerImplementation.play(trackNumber);
    }

    public void insertPlayerData(PlayData playerData) {
        playerImplementation.insertPlayData(playerData);
    }
}
