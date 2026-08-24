package pulse.model;

public class ModelVertex {
    public ModelVertexUv[] keyCodec;
    public ModelVector elementCodec;

    public ModelVertex(ModelVertexUv[] modelVertexUvArr, ModelVector modelVector) {
        this.keyCodec = modelVertexUvArr;
        this.elementCodec = modelVector;
    }

    public ModelVertex(ModelVertexUv[] modelVertexUvArr, float f, float f2, float f3) {
        this(modelVertexUvArr, new ModelVector(f, f2, f3));
    }
}
