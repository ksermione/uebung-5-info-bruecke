/**
 * Created by oksana.shcherban on 22.06.19.
 */
public class CDPlayer implements IPlayerImplementation {

    PlayData playData;
    int currentlyPlayingTrack = 0;

    public void insertPlayData(PlayData playData) {
        this.playData = playData;
    }

    public void play(int trackNumber) {
        if (playData != null && playData.getData().length >= trackNumber) {
            if (trackNumber != currentlyPlayingTrack) {
                System.out.println("CD Player: Skipping to track " + trackNumber);
                skipToTrack(trackNumber);
            }
            System.out.println("CD Player: Playing track number " + trackNumber + " \"" + playData.getData()[currentlyPlayingTrack] + "\"");
        }
        else {
            System.out.println("CD Player: There are not enough songs on this CD to play the track you want");
        }
    }

    private void skipToTrack(int trackNumber) {
        currentlyPlayingTrack = trackNumber - 1;
    }
}
