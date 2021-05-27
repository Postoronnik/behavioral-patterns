package state.radio_player;

import lombok.Getter;
import state.radio_player.state.State;
import state.radio_player.state.LockedState;

import java.util.ArrayList;
import java.util.List;

@Getter
public class Player {

    private State state = new LockedState(this);

    private static List<String> songs = new ArrayList();
    private int currentSongNum = 0;
    static {
        songs.add("Song 1");
        songs.add("Song 2");
        songs.add("Song 3");
        songs.add("Song 4");
        songs.add("Song 5");
        songs.add("Song 6");
    }

    private boolean stopped = false;
    private boolean locked = true;

    public void nextSong(){
        currentSongNum++;
        if(currentSongNum == songs.size()){
            currentSongNum = 0;
        }
        System.out.println("Song " + songs.get(currentSongNum) + " is playing");
    }

    public void previousSong(){
        currentSongNum--;
        if(currentSongNum == -1){
            currentSongNum = songs.size() - 1;
        }
        System.out.println("Song " + songs.get(currentSongNum) + " is playing");
    }

    public void clickPlay(){
        stopped = false;
        state.clickPlay();
    }

    public void clickStop(){
        stopped = !stopped;
        state.clickStop();
        if(!stopped){
            System.out.println("Player unstopped");
        } else {
            System.out.println("Player stopped");
        }
    }

    public void clickLock(){
        locked = !locked;
        state.clickLock();
        if(!locked){
            System.out.println("Player unlocked");
        } else {
            System.out.println("Player locked");
        }

    }

    public void changeState(State state){
        this.state = state;
    }
}
