package memento.editor;

import lombok.AllArgsConstructor;
import lombok.ToString;
import memento.Memento;

@ToString
@AllArgsConstructor
public class Snapshot implements Memento {
    private Editor editor;

    private String text;
    private String textStyle;
    private int textSize;
    private String textColor;

    @Override
    public void undo() {
        editor.setState(text,textStyle,textSize,textColor);
    }
}
