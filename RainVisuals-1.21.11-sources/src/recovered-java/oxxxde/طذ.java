/*
 * Decompiled with CFR 0.152.
 */
package oxxxde;

import java.util.ArrayList;
import java.util.List;
import kotakbaz.rain.client.render.main.vertex.element.A;
import kotakbaz.rain.client.render.main.vertex.element.VertexElement;
import kotakbaz.rain.client.render.main.vertex.format.VertexFormat;

public final class \u0637\u0630 {
    private final List<String> elementNames;
    private final List<VertexElement> vertexElements = new ArrayList<VertexElement>();

    public \u0637\u0630 element(String name, A<?> type, int count) {
        int id = this.vertexElements.size();
        this.elementNames.add(name);
        this.vertexElements.add(new VertexElement(id, count, type));
        return this;
    }

    public VertexFormat build() {
        return new VertexFormat(this.vertexElements, this.elementNames);
    }

    public \u0637\u0630() {
        this.elementNames = new ArrayList<String>();
    }
}

