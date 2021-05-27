package state.radio_player.state;

import state.radio_player.Player;

public class StoppedState extends State{
    public StoppedState(Player player) {
        super(player);
    }

    @Override
    public void clickPlay() {
        player.changeState(new PlayingState(player));
    }

    @Override
    public void clickStop() {
       player.changeState(new PlayingState(player));
    }

    @Override
    public void clickNext() {
        //Do nothing
    }

    @Override
    public void clickPrevious() {
        //Do nothing
    }

    @Override
    public void clickLock() {
        player.changeState(new LockedState(player));
    }
}
