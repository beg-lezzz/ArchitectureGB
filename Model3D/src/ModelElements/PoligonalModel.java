package ModelElements;

import Stuff.Point3D;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class PoligonalModel {
    public List<Poligon> poligons;
    public List<Texture> textures;

    public PoligonalModel(List<Texture> textures) {
        Point3D point = new Point3D();
        Poligon poligon = new Poligon(point);
        this.textures = textures;
        this.poligons = new ArrayList<Poligon>();
        poligons.add(poligon);
    }
}
