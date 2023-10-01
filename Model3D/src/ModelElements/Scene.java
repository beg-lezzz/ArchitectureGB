package ModelElements;

import java.util.List;

public class Scene {
    public int id;
    public List<PoligonalModel> models;
    public List<Flash> flashes;
    public List<Camera> cameras;

    public Scene(int id, List<PoligonalModel> models, List<Flash> flashes, List<Camera> cameras) throws Exception {

        this.id = id;
        this.flashes = flashes;

        if (models.size() > 0) {
            this.models = models;
        } else {
            throw new RuntimeException("Must be at least one model");
        }

        if (cameras.size() > 0) {
            this.cameras = cameras;
        } else {
            throw new RuntimeException("Must be at least one camera");
        }
    }

    public <T> T Method1(T type1) {
        return type1;
    }

    public <T, T1> T Method2(T type2, T1 type3) {
        return type2;
    }
}
