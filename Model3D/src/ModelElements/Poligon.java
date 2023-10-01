package ModelElements;

import Stuff.Point3D;
import java.util.List;

public class Poligon {
    public List<Point3D> points;

    public Poligon(Point3D point) {
        this.points.add(point);
    }

    public void AddPoint(Point3D point) {
        this.points.add(point);
    }
}
