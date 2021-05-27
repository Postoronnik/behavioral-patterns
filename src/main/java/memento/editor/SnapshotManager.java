package memento.editor;

import memento.Memento;

import java.util.ArrayList;
import java.util.List;

public class SnapshotManager{
    private List<Memento> snapshotsLog = new ArrayList<>();


    public void addSnapshot(Memento memento){
        snapshotsLog.add(memento);
    }

    public void undo(){
        Memento memento = snapshotsLog.get(snapshotsLog.size() - 2);
        memento.undo();
        snapshotsLog.remove(snapshotsLog.size() - 1);
    }

}
