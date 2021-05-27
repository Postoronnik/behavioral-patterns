package iterator.start.point;

public class CustomList {
    private Integer[] values = new Integer[5];
    private int currentSize = 0;
    public Iterator iterator;

    public CustomList(){
        iterator = new Iterator();
    }

    public void add(Integer value){
        currentSize++;
        if(currentSize == values.length){
            values = increase();
        }
        values[currentSize] = value;
    }

    private Integer[] increase(){
        Integer tempContainer[] = new Integer[values.length * 2];
        for(int i = 0; i < values.length; i++){
            tempContainer[i] = values[i];
        }
        return tempContainer;
    }


    public class Iterator{
        private int i = 0;
        public boolean hasNext(){
            if(i < currentSize){
                i++;
                return true;
            }
            return false;
        }

        public Integer next(){
            return values[i];
        }
    }
}
