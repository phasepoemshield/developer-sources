/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.client.render.main.vertex.mesh;

import kotakbaz.rain.client.render.main.buffer.b;
import kotakbaz.rain.client.render.main.vertex.A;
import kotakbaz.rain.client.render.main.vertex.format.a_0;

/*
 * Renamed from kotakbaz.rain.client.render.main.vertex.mesh.b
 */
public interface b_0
extends AutoCloseable {
    public int getVertexCount();

    public int getIndexCount();

    public b getVertexBuffer();

    public b getIndexBuffer();

    public A getDrawMode();

    public a_0 getVertexFormat();

    @Override
    public void close();
}

