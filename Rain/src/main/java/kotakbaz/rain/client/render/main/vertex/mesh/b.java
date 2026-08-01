/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.client.render.main.vertex.mesh;

import kotakbaz.rain.client.render.main.vertex.a_0;

public interface b
extends AutoCloseable {
    public int getVertexCount();

    public int getIndexCount();

    public kotakbaz.rain.client.render.main.buffer.b getVertexBuffer();

    public kotakbaz.rain.client.render.main.buffer.b getIndexBuffer();

    public a_0 getDrawMode();

    public kotakbaz.rain.client.render.main.vertex.format.a_0 getVertexFormat();

    @Override
    public void close();
}

