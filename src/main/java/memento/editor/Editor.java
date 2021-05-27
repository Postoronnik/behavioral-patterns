package memento.editor;

import lombok.AllArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import memento.Memento;

@ToString
@Setter
@AllArgsConstructor
public class Editor implements EditorInterface{
    private String text;
    private String textStyle;
    private int textSize;
    private String textColor;

    @Override
    public void setState(String text,
                         String textStyle,
                         int textSize,
                         String textColor)
    {
        this.text = text;
        this.textStyle = textStyle;
        this.textSize = textSize;
        this.textColor = textColor;
    }

    @Override
    public Memento save() {
        return new Snapshot(this,text,textStyle,textSize,textColor);
    }
}
