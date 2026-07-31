/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.client.render.main.vertex.mesh;

import kotakbaz.rain.client.render.main.vertex.element.a_0;
import kotakbaz.rain.client.render.main.vertex.mesh.b;
import org.joml.Matrix4f;

public interface a<T, G extends b> {
    public G buildNullable();

    public G buildOrThrow();

    public T vertex(float var1, float var2, float var3);

    public T vertex(Matrix4f var1, float var2, float var3, float var4);

    public <S> T element(String var1, a_0<S> var2, S ... var3);
}

