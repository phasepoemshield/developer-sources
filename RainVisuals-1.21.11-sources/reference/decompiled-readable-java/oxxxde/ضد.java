/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.render.BuiltBuffer
 *  org.lwjgl.opengl.GL11
 */
package oxxxde;

import java.util.function.BiConsumer;
import kotakbaz.rain.client.render.main.vertex.DrawMode;
import kotakbaz.rain.client.render.main.vertex.mesh.IMesh;
import net.minecraft.client.render.BuiltBuffer;
import org.lwjgl.opengl.GL11;
import oxxxde.\u062a\u0638;
import oxxxde.\u062b\u0641;
import oxxxde.\u062d\u064b;
import oxxxde.\u062f\u0646;
import oxxxde.\u0634\u064e;
import oxxxde.\u0638\u062d;

public final class \u0636\u062f {
    public static final BiConsumer<IMesh, Boolean> CUSTOM_BUFFER;
    public static final BiConsumer<BuiltBuffer, Boolean> MINECRAFT_BUFFER;

    static {
        MINECRAFT_BUFFER = (builtBuffer, close) -> {
            if (close.booleanValue()) {
                builtBuffer.close();
            }
        };
        CUSTOM_BUFFER = (mesh, close) -> {
            int indexCount = mesh.getIndexCount();
            int vertexCount = mesh.getVertexCount();
            DrawMode drawMode = mesh.getDrawMode();
            if (vertexCount > 0) {
                \u0634\u064e.uploadFormatToBuffer(mesh.getVertexBuffer(), mesh.getVertexFormat());
                if (drawMode.useIndexBuffer()) {
                    \u062d\u064b indexBufferGenerator = mesh.getDrawMode().indexBufferGenerator();
                    \u062a\u0638 indexBuffer = mesh.getIndexBuffer();
                    if (indexBuffer.getTarget() != \u0638\u062d.ELEMENT_ARRAY_BUFFER) {
                        \u062f\u0646.printAndExit(new \u062b\u0641(indexBuffer.getTarget().glId, \u0638\u062d.ELEMENT_ARRAY_BUFFER.glId));
                    }
                    indexBuffer.bind();
                    GL11.glDrawElements((int)drawMode.glId(), (int)indexCount, (int)indexBufferGenerator.getIndexType().glId, (long)0L);
                } else {
                    GL11.glDrawArrays((int)drawMode.glId(), (int)0, (int)vertexCount);
                }
            }
            if (close.booleanValue()) {
                IMesh iMesh;
                iMesh.close();
            }
        };
    }

    private static void drawIndexed(int count, int drawMode, int indexType) {
        GL11.glDrawElements((int)drawMode, (int)count, (int)indexType, (long)0L);
    }
}

