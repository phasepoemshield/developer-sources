/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.joml.Matrix4f
 */
package oxxxde;

import kotakbaz.rain.client.render.main.vertex.element.A;
import kotakbaz.rain.client.render.main.vertex.mesh.IMesh;
import org.joml.Matrix4f;

public interface \u062c\u064a<T, G extends IMesh> {
    public T vertex(Matrix4f var1, float var2, float var3, float var4);

    public G buildNullable();

    public T vertex(float var1, float var2, float var3);

    public G buildOrThrow();

    public <S> T element(String var1, A<S> var2, S ... var3);
}

