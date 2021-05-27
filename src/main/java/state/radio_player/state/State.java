package state.radio_player.state;

import state.radio_player.Player;

public abstract class State {

    protected Player player;

    public State(Player player){
        this.player = player;
    }

    public abstract void clickPlay();
    public abstract void clickStop();
    public abstract void clickNext();
    public abstract void clickLock();
    public abstract void clickPrevious();

}
