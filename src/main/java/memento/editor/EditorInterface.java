package memento.editor;

import memento.Memento;

public interface EditorInterface {
     Memento save();
     void setState(String text,
                   String textStyle,
                   int textSize,
                   String textColor);
}
