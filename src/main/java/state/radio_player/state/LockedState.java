package state.radio_player.state;

import state.radio_player.Player;

public class LockedState extends State{


    public LockedState(Player player) {
        super(player);
    }

    @Override
    public void clickPlay() {
        //Do nothing
    }

    @Override
    public void clickStop() {
        //Do nothing
    }

    @Override
    public void clickLock() {
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
}
