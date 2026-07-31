/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.joml.Matrix4f
 */
package kotakbaz.rain.client.render.main.vertex.mesh;

import kotakbaz.rain.client.render.main.vertex.element.A;
import kotakbaz.rain.client.render.main.vertex.mesh.b_0;
import org.joml.Matrix4f;

/*
 * Renamed from kotakbaz.rain.client.render.main.vertex.mesh.a
 */
public interface a_0<T, G extends b_0> {
    public G buildNullable();

    public G buildOrThrow();

    public T vertex(float var1, float var2, float var3);

    public T vertex(Matrix4f var1, float var2, float var3, float var4);

    public <S> T element(String var1, A<S> var2, S ... var3);
}

