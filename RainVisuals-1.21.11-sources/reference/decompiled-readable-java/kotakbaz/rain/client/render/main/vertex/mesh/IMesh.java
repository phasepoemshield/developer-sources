/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.client.render.main.vertex.mesh;

import kotakbaz.rain.client.render.main.vertex.DrawMode;
import kotakbaz.rain.client.render.main.vertex.format.VertexFormat;
import oxxxde.\u062a\u0638;

public interface IMesh
extends AutoCloseable {
    public DrawMode getDrawMode();

    public int getIndexCount();

    public VertexFormat getVertexFormat();

    public int getVertexCount();

    @Override
    public void close();

    public \u062a\u0638 getIndexBuffer();

    public \u062a\u0638 getVertexBuffer();
}

