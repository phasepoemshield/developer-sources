/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.ARBVertexAttribBinding
 *  org.lwjgl.opengl.GL30
 */
package oxxxde;

import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import kotakbaz.rain.client.render.main.vertex.element.VertexElement;
import kotakbaz.rain.client.render.main.vertex.format.A;
import kotakbaz.rain.client.render.main.vertex.format.VertexFormat;
import org.lwjgl.opengl.ARBVertexAttribBinding;
import org.lwjgl.opengl.GL30;
import oxxxde.\u062a\u0638;
import oxxxde.\u0643;

public class \u062f\u062c
extends \u0643 {
    private final boolean applyMesaWorkaround;

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
        if (vertexFormatBuffer.buffer().get() != vertexBuffer) {
            void var1_1;
            void var3_3;
            void var2_2;
            if (this.applyMesaWorkaround) {
                if (vertexFormatBuffer.buffer().get() != null) {
                    if (vertexFormatBuffer.buffer().get().getId() == vertexBuffer.getId()) {
                        ARBVertexAttribBinding.glBindVertexBuffer((int)0, (int)0, (long)0L, (int)0);
                    }
                }
            }
            ARBVertexAttribBinding.glBindVertexBuffer((int)0, (int)vertexBuffer.getId(), (long)0L, (int)var2_2.getVertexSize());
            var3_3.buffer().set((\u062a\u0638)var1_1);
        }
    }

    protected \u062f\u062c() {
        String string;
        this.applyMesaWorkaround = "Mesa".equals(GL30.glGetString((int)7936)) ? (string = GL30.glGetString((int)7938)).contains("25.0.0") || string.contains("25.0.1") || string.contains("25.0.2") : false;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public A createVertexFormatBuffer(VertexFormat vertexFormat) {
        int vertBuffId = GL30.glGenVertexArrays();
        GL30.glBindVertexArray((int)vertBuffId);
        List<VertexElement> vertexElements = vertexFormat.getVertexElements();
        int i = 0;
        while (i < vertexElements.size()) {
            void var4_4;
            VertexElement vertexElement = vertexElements.get(i);
            GL30.glEnableVertexAttribArray((int)i);
            if (vertexElement.getType().glId() == 5126) {
                ARBVertexAttribBinding.glVertexAttribFormat((int)i, (int)vertexElement.getCount(), (int)vertexElement.getType().glId(), (boolean)false, (int)vertexFormat.getElementOffset(vertexElement));
            } else {
                ARBVertexAttribBinding.glVertexAttribIFormat((int)i, (int)vertexElement.getCount(), (int)vertexElement.getType().glId(), (int)vertexFormat.getElementOffset(vertexElement));
            }
            ARBVertexAttribBinding.glVertexAttribBinding((int)i, (int)0);
            ++var4_4;
        }
        return new A(vertBuffId, vertexFormat, new AtomicReference<\u062a\u0638>());
    }
}

