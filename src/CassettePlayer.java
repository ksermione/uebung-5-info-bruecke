/**
 * Created by oksana.shcherban on 22.06.19.
 */
public class CassettePlayer implements IPlayerImplementation {

    PlayData playData;
    int currentlyPlayingTrack = 0;

    public void insertPlayData(PlayData playData) {
        this.playData = playData;
    }

    public void play(int trackNumber) {
        if (playData != null && playData.getData().length >= trackNumber) {
            while(trackNumber != currentlyPlayingTrack) {
                System.out.println("CASSETTE Player: Fasting forward");
                fastForwardToNextTrack();
            }
            System.out.println("CASSETTE Player: Playing track number " + trackNumber + " \"" + playData.getData()[currentlyPlayingTrack] + "\"");
        }
        else {
            System.out.println("CASSETTE Player: There are not enough songs on this cassette to play the track you want");
        }
    }

    private void fastForwardToNextTrack() {
        currentlyPlayingTrack++;
    }
}
