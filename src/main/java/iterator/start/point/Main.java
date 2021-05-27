package iterator.start.point;


public class Main {
    public static void main(String[] args) {
        CustomList customList = new CustomList();
        customList.add(1);
        customList.add(2);
        customList.add(3);
        customList.add(4);
        customList.add(5);
        customList.add(6);

        while(customList.iterator.hasNext()){
            System.out.println(customList.iterator.next());
        }
    }
}
