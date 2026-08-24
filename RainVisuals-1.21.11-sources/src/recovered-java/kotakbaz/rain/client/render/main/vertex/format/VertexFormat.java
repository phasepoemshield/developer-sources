/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package kotakbaz.rain.client.render.main.vertex.format;

import java.util.HashMap;
import java.util.List;
import java.util.stream.Stream;
import kotakbaz.rain.client.render.main.vertex.element.VertexElement;
import kotakbaz.rain.client.render.main.vertex.format.A;
import lombok.Generated;
import oxxxde.\u062f\u062a;
import oxxxde.\u062f\u0646;
import oxxxde.\u0637\u0630;

public class VertexFormat {
    private final int elementsMask;
    private final int[] elementOffsets;
    private final List<VertexElement> vertexElements;
    private final HashMap<String, VertexElement> vertexMap = new HashMap();
    private A vertexFormatBuffer = null;
    private final int vertexSize;
    private final HashMap<VertexElement, String> namesMap = new HashMap();

    @Generated
    public int getVertexSize() {
        return this.vertexSize;
    }

    public int getElementOffset(VertexElement vertexElement) {
        return this.elementOffsets[vertexElement.getId()];
    }

    /*
     * WARNING - void declaration
     */
    public VertexElement getVertexElement(String name) {
        void var2_2;
        VertexElement vertexElement = this.vertexMap.get(name);
        if (vertexElement == null) {
            \u062f\u0646.printAndExit(new \u062f\u062a(name));
        }
        return var2_2;
    }

    public Stream<VertexElement> getElementsFromMask(int mask) {
        return this.vertexElements.stream().filter(element -> element != null && (mask & element.mask()) != 0);
    }

    public static \u0637\u0630 builder() {
        return new \u0637\u0630().element("Position", kotakbaz.rain.client.render.main.vertex.element.A.FLOAT, 3);
    }

    @Generated
    public int getElementsMask() {
        return this.elementsMask;
    }

    /*
     * WARNING - void declaration
     */
    public VertexFormat(List<VertexElement> vertexElements, List<String> elementNames2) {
        void var3_3;
        this.vertexElements = vertexElements;
        this.elementOffsets = new int[this.vertexElements.size()];
        this.elementsMask = vertexElements.stream().mapToInt(VertexElement::mask).reduce(0, (a2, b2) -> a2 | b2);
        int size = 0;
        int elementOffset = 0;
        int i = 0;
        while (i < vertexElements.size()) {
            void var5_5;
            VertexElement vertexElement = vertexElements.get(i);
            size += vertexElement.getSize();
            this.elementOffsets[i] = i > 0 ? elementOffset : 0;
            elementOffset += vertexElement.getSize();
            this.vertexMap.put(elementNames2.get(i), vertexElement);
            this.namesMap.put(vertexElement, elementNames2.get(i));
            ++var5_5;
        }
        this.vertexSize = var3_3;
    }

    @Generated
    public int[] getElementOffsets() {
        return this.elementOffsets;
    }

    public String getVertexElementName(VertexElement vertexElement) {
        return this.namesMap.get(vertexElement);
    }

    @Generated
    public List<VertexElement> getVertexElements() {
        return this.vertexElements;
    }

    public void setVertexFormatBuffer(A vertexFormatBuffer) {
        this.vertexFormatBuffer = vertexFormatBuffer;
    }

    public A getVertexFormatBuffer() {
        return this.vertexFormatBuffer;
    }
}

