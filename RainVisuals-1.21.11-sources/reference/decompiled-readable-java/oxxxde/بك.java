/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL30
 */
package oxxxde;

import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import kotakbaz.rain.client.render.main.vertex.element.VertexElement;
import kotakbaz.rain.client.render.main.vertex.format.A;
import kotakbaz.rain.client.render.main.vertex.format.VertexFormat;
import org.lwjgl.opengl.GL30;
import oxxxde.\u062a\u0638;
import oxxxde.\u0643;

public class \u0628\u0643
extends \u0643 {
    /*
     * WARNING - void declaration
     */
    private void setupBuffer(VertexFormat format, boolean vbaIsNew) {
        int i = format.getVertexSize();
        List<VertexElement> list = format.getVertexElements();
        int j = 0;
        while (j < list.size()) {
            void var5_5;
            VertexElement vertexElement = list.get(j);
            if (vbaIsNew) {
                GL30.glEnableVertexAttribArray((int)j);
            }
            if (vertexElement.getType().glId() == 5126) {
                GL30.glVertexAttribPointer((int)j, (int)vertexElement.getCount(), (int)vertexElement.getType().glId(), (boolean)false, (int)i, (long)format.getElementOffset(vertexElement));
            } else {
                GL30.glVertexAttribIPointer((int)j, (int)vertexElement.getCount(), (int)vertexElement.getType().glId(), (int)i, (long)format.getElementOffset(vertexElement));
            }
            ++var5_5;
        }
    }

    @Override
    public A createVertexFormatBuffer(VertexFormat vertexFormat) {
        int i = GL30.glGenVertexArrays();
        GL30.glBindVertexArray((int)i);
        return new A(i, vertexFormat, new AtomicReference<\u062a\u0638>());
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void applyFormatToBuffer(\u062a\u0638 vertexBuffer, VertexFormat vertexFormat) {
        A vertexFormatBuffer = vertexFormat.getVertexFormatBuffer();
        if (vertexFormatBuffer == null) {
            vertexFormatBuffer = this.createVertexFormatBuffer(vertexFormat);
            vertexFormat.setVertexFormatBuffer(vertexFormatBuffer);
        }
        GL30.glBindVertexArray((int)vertexFormatBuffer.glId());
        \u062a\u0638 previousBuffer = vertexFormatBuffer.buffer().get();
        if (previousBuffer != vertexBuffer) {
            void var1_1;
            void var3_3;
            vertexBuffer.bind();
            this.setupBuffer(vertexFormat, previousBuffer == null);
            var3_3.buffer().set((\u062a\u0638)var1_1);
        }
    }
}

