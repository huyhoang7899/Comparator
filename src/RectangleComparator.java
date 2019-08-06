import java.util.Comparator;

public  class RectangleComparator implements Comparator<Rectangle> {
    @Override
    public int compare(Rectangle c1, Rectangle c2) {
        if (c1.getLength() > c2.getLength()) return 1;
        else if (c1.getLength() < c2.getLength()) return -1;
        else return 0;
    }
}