package memento.start.point;

import memento.editor.Editor;
import memento.editor.EditorInterface;
import memento.editor.SnapshotManager;

public class Main {
    public static void main(String[] args) {
        SnapshotManager manager = new SnapshotManager();
        EditorInterface editor = new Editor("Hello to Bespala","Times New Roman",8,"Black");
        System.out.println(editor);

        manager.addSnapshot(editor.save());

        editor.setState("Some new text","King`s Indian",10,"Red");

        System.out.println(editor);

        manager.addSnapshot(editor.save());

        manager.undo();

        System.out.println(editor);


    }
}
