package InMemoryModel;

import ModelElements.Camera;
import ModelElements.Flash;
import ModelElements.PoligonalModel;
import ModelElements.Scene;

import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.List;

public class ModelStore implements iModelChanger {
    public List<PoligonalModel> models;
    public List<Scene> scenes;
    public List<Flash> flashes;
    public List<Camera> cameras;
    private iModelChangeObserver[] changeObservers;

    public Scene getScene() {
        for (int i = 0; i < scenes.size(); i++) {
            if (scenes.get(i).id == i) {
                return scenes.get(i);
            }
        }
        return null;
    }

    public ModelStore(iModelChangeObserver[] changeObservers) {
        this.changeObservers = changeObservers;

        this.models = new ArrayList<PoligonalModel>();
        this.scenes = new ArrayList<Scene>();
        this.flashes = new ArrayList<Flash>();
        this.cameras = new ArrayList<Camera>();
    }

    @Override
    public void NotifyChange(iModelChanger sender) {

    }
}
