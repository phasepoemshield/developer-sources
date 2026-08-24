package pulse.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

public class ModelDefinition {
    public List<ModelPart> keyCodec = new ArrayList<>();
    public int elementCodec = 64;
    public int c = 64;

    public Optional<ModelPart> a(String str) {
        Iterator<ModelPart> it = this.keyCodec.iterator();

        while (it.hasNext()) {
            ModelPart modelPartFindPart = this.findPart(str, it.next());
            if (modelPartFindPart != null) {
                return Optional.of(modelPartFindPart);
            }
        }

        return Optional.empty();
    }

    private ModelPart findPart(String str, ModelPart modelPart) {
        if (modelPart.d.equals(str)) {
            return modelPart;
        }

        Iterator<ModelPart> it = modelPart.elementCodec.iterator();

        while (it.hasNext()) {
            ModelPart modelPartFindPart = this.findPart(str, it.next());
            if (modelPartFindPart != null) {
                return modelPartFindPart;
            }
        }

        return null;
    }
}
