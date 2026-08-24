/*
 * Decompiled with CFR 0.152.
 */
package oxxxde;

import kotakbaz.rain.client.render.main.vertex.element.A;
import kotakbaz.rain.client.render.main.vertex.format.VertexFormat;

public final class \u0634\u0648 {
    public static final VertexFormat POSITION = VertexFormat.builder().build();
    public static final VertexFormat POSITION_TEXTURE;
    public static final VertexFormat POSITION_COLOR_TEXTURE;
    public static final VertexFormat POSITION_COLOR;
    public static final VertexFormat POSITION_TEXTURE_COLOR;

    static {
        POSITION_COLOR = VertexFormat.builder().element("Color", A.FLOAT, 4).build();
        POSITION_TEXTURE = VertexFormat.builder().element("Texture", A.FLOAT, 2).build();
        POSITION_COLOR_TEXTURE = VertexFormat.builder().element("Color", A.FLOAT, 4).element("Texture", A.FLOAT, 2).build();
        POSITION_TEXTURE_COLOR = VertexFormat.builder().element("Texture", A.FLOAT, 2).element("Color", A.FLOAT, 4).build();
    }
}

