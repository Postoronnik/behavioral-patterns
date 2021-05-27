package state.radio_player.state;

import state.radio_player.Player;

public class PlayingState extends State{
    public PlayingState(Player player) {
        super(player);
    }

    @Override
    public void clickPlay() {
        System.out.println("Player is playing");
    }

    @Override
    public void clickStop() {
        player.changeState(new StoppedState(player));
    }

    @Override
    public void clickLock() {
        player.changeState(new LockedState(player));
    }

    @Override
    public void clickNext() {
        player.nextSong();
    }

    @Override
    public void clickPrevious() {
        player.previousSong();
    }
}
