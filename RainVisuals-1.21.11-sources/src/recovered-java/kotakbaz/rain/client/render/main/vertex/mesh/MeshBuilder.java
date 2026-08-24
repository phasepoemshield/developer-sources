/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 *  net.minecraft.client.util.BufferAllocator
 *  net.minecraft.client.util.BufferAllocator$CloseableBuffer
 *  org.joml.Matrix4f
 *  org.joml.Vector3f
 *  org.lwjgl.system.MemoryUtil
 */
package kotakbaz.rain.client.render.main.vertex.mesh;

import java.util.function.Consumer;
import java.util.stream.Collectors;
import kotakbaz.rain.client.render.main.vertex.DrawMode;
import kotakbaz.rain.client.render.main.vertex.element.A;
import kotakbaz.rain.client.render.main.vertex.element.VertexElement;
import kotakbaz.rain.client.render.main.vertex.format.VertexFormat;
import lombok.Generated;
import net.minecraft.client.util.BufferAllocator;
import org.joml.Matrix4f;
import org.joml.Vector3f;
import org.lwjgl.system.MemoryUtil;
import oxxxde.\u0627\u0650;
import oxxxde.\u062b\u0642;
import oxxxde.\u062c\u064a;
import oxxxde.\u062d\u0628;
import oxxxde.\u062f\u0646;
import oxxxde.\u0630\u062d;

public class MeshBuilder
implements \u062c\u064a<MeshBuilder, \u0627\u0650> {
    public static final int MAX_VERTICES = 0xFFFFFF;
    private DrawMode drawMode;
    private Consumer<BufferAllocator> allocatorFinalizer;
    private final Vector3f tempVector = new Vector3f();
    private VertexFormat vertexFormat;
    private long vertexPointer = -1L;
    private int vertexCount;
    private BufferAllocator bufferAllocator;
    private boolean closeAllocatorAfterBuild;
    private int requiredMask;
    private int currentMask;
    private int vertexSize;
    private int[] elementOffsets;
    private boolean closed = false;

    private void ensureBuilding() {
        if (this.closed) {
            String[] stringArray = new String[1];
            stringArray[0] = "You are trying to use MeshBuilder after it has been built.";
            String[] stringArray2 = new String[1];
            stringArray2[0] = "Check your build or usage MeshBuilder method and fix it.";
            \u062f\u0646.printAndExit(new \u0630\u062d("Attempt to interact with MeshBuilder, which does not building.", stringArray, stringArray2));
        }
    }

    public <T> MeshBuilder element(VertexElement element, A<T> elementType, T ... values2) {
        long pointer = this.beginElement(element);
        if (pointer != -1L) {
            elementType.uploadConsumer().accept(pointer, values2);
        }
        return this;
    }

    public MeshBuilder set(BufferAllocator bufferAllocator, DrawMode drawMode, VertexFormat vertexFormat, boolean closeAllocatorAfterBuild) {
        return this.set(bufferAllocator, drawMode, vertexFormat, closeAllocatorAfterBuild, null);
    }

    public MeshBuilder elementFloat(VertexElement element, float v0) {
        long pointer = this.beginElement(element);
        if (pointer != -1L) {
            MemoryUtil.memPutFloat((long)pointer, (float)v0);
        }
        return this;
    }

    public MeshBuilder elementFloat(VertexElement element, float v0, float v1, float v2, float v3) {
        long pointer = this.beginElement(element);
        if (pointer != -1L) {
            MemoryUtil.memPutFloat((long)pointer, (float)v0);
            MemoryUtil.memPutFloat((long)(pointer + 4L), (float)v1);
            MemoryUtil.memPutFloat((long)(pointer + 8L), (float)v2);
            MemoryUtil.memPutFloat((long)(pointer + 12L), (float)v3);
        }
        return this;
    }

    public MeshBuilder elementFloat(VertexElement element, float v0, float v1, float v2) {
        long pointer = this.beginElement(element);
        if (pointer != -1L) {
            MemoryUtil.memPutFloat((long)pointer, (float)v0);
            MemoryUtil.memPutFloat((long)(pointer + 4L), (float)v1);
            MemoryUtil.memPutFloat((long)(pointer + 8L), (float)v2);
        }
        return this;
    }

    public MeshBuilder elementFloat(VertexElement element, float v0, float v1) {
        long pointer = this.beginElement(element);
        if (pointer != -1L) {
            MemoryUtil.memPutFloat((long)pointer, (float)v0);
            MemoryUtil.memPutFloat((long)(pointer + 4L), (float)v1);
        }
        return this;
    }

    @Override
    public \u0627\u0650 buildNullable() {
        this.ensureBuilding();
        try {
            this.endVertex();
            \u0627\u0650 \u0627\u06502 = this.build();
            return \u0627\u06502;
        }
        finally {
            this.finishAllocator();
            this.closed = true;
            this.vertexPointer = -1L;
        }
    }

    private \u0627\u0650 build() {
        \u0627\u0650 \u0627\u06502;
        if (this.vertexCount == 0) {
            return null;
        }
        BufferAllocator.CloseableBuffer result = this.bufferAllocator.getAllocated();
        if (result == null) {
            return null;
        }
        BufferAllocator.CloseableBuffer closeableBuffer = result;
        try {
            int i = this.drawMode.indexCountFunction().applyAsInt(this.vertexCount);
            \u0627\u06502 = new \u0627\u0650(result.getBuffer(), this.vertexFormat, this.vertexCount, i, this.drawMode);
        }
        catch (Throwable throwable) {
            if (closeableBuffer != null) {
                try {
                    closeableBuffer.close();
                }
                catch (Throwable throwable2) {
                    throwable.addSuppressed(throwable2);
                }
            }
            throw throwable;
        }
        if (closeableBuffer != null) {
            closeableBuffer.close();
        }
        return \u0627\u06502;
    }

    @Override
    public <T> MeshBuilder element(String name, A<T> elementType, T ... values2) {
        return this.element(this.vertexFormat.getVertexElement(name), elementType, values2);
    }

    @Override
    public MeshBuilder vertex(float x, float y, float z) {
        long l = this.beginVertex() + (long)this.elementOffsets[0];
        this.currentMask = this.requiredMask;
        MemoryUtil.memPutFloat((long)l, (float)x);
        MemoryUtil.memPutFloat((long)(l + 4L), (float)y);
        MemoryUtil.memPutFloat((long)(l + 8L), (float)z);
        return this;
    }

    @Generated
    public BufferAllocator getBufferAllocator() {
        return this.bufferAllocator;
    }

    private void endVertex() {
        if (this.vertexCount != 0 && this.currentMask != 0) {
            String string = this.vertexFormat.getElementsFromMask(this.currentMask).map(this.vertexFormat::getVertexElementName).collect(Collectors.joining(", "));
            \u062f\u0646.printAndExit(new \u062b\u0642(string));
        }
    }

    private void finishAllocator() {
        if (this.bufferAllocator == null) {
            return;
        }
        if (this.allocatorFinalizer != null) {
            this.allocatorFinalizer.accept(this.bufferAllocator);
        } else if (this.closeAllocatorAfterBuild) {
            this.bufferAllocator.close();
        }
    }

    @Override
    public MeshBuilder vertex(Matrix4f matrix4f, float x, float y, float z) {
        matrix4f.transformPosition(x, y, z, this.tempVector);
        return this.vertex(this.tempVector.x, this.tempVector.y, this.tempVector.z);
    }

    /*
     * WARNING - void declaration
     */
    private long beginElement(VertexElement element) {
        void var1_1;
        int i = this.currentMask;
        int j = i & ~element.mask();
        if (j == i) {
            return -1L;
        }
        this.currentMask = j;
        long l = this.vertexPointer;
        if (l == -1L) {
            String[] stringArray = new String[1];
            stringArray[0] = "You are trying to add data to vertex that has already been built.";
            String[] stringArray2 = new String[1];
            stringArray2[0] = "Check your vertex building method and fix it.";
            \u062f\u0646.printAndExit(new \u0630\u062d("Not currently building vertex.", stringArray, stringArray2));
            return -1L;
        }
        return l + (long)this.elementOffsets[var1_1.getId()];
    }

    public MeshBuilder set(BufferAllocator bufferAllocator, DrawMode drawMode, VertexFormat vertexFormat, boolean closeAllocatorAfterBuild, Consumer<BufferAllocator> allocatorFinalizer) {
        this.bufferAllocator = bufferAllocator;
        this.drawMode = drawMode;
        this.vertexFormat = vertexFormat;
        this.vertexSize = vertexFormat.getVertexSize();
        this.elementOffsets = vertexFormat.getElementOffsets();
        this.requiredMask = vertexFormat.getElementsMask() & 0xFFFFFFFE;
        this.closeAllocatorAfterBuild = closeAllocatorAfterBuild;
        this.allocatorFinalizer = allocatorFinalizer;
        this.closed = false;
        this.vertexCount = 0;
        this.vertexPointer = -1L;
        this.currentMask = 0;
        return this;
    }

    /*
     * WARNING - void declaration
     */
    private long beginVertex() {
        void var1_1;
        long l;
        this.ensureBuilding();
        this.endVertex();
        if (this.vertexCount >= 0xFFFFFF) {
            \u062f\u0646.printAndExit(new \u062d\u0628());
            return -1L;
        }
        ++this.vertexCount;
        this.vertexPointer = l = this.bufferAllocator.allocate(this.vertexSize);
        return (long)var1_1;
    }

    /*
     * WARNING - void declaration
     */
    public MeshBuilder(BufferAllocator bufferAllocator, DrawMode drawMode, VertexFormat vertexFormat, boolean closeAllocatorAfterBuild, Consumer<BufferAllocator> allocatorFinalizer) {
        void var5_5;
        this.bufferAllocator = bufferAllocator;
        this.drawMode = drawMode;
        this.vertexFormat = vertexFormat;
        this.vertexSize = vertexFormat.getVertexSize();
        this.elementOffsets = vertexFormat.getElementOffsets();
        this.requiredMask = vertexFormat.getElementsMask() & 0xFFFFFFFE;
        this.closeAllocatorAfterBuild = closeAllocatorAfterBuild;
        this.allocatorFinalizer = var5_5;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public \u0627\u0650 buildOrThrow() {
        void var1_1;
        \u0627\u0650 builtBuffer = this.buildNullable();
        if (builtBuffer == null) {
            String[] stringArray = new String[1];
            stringArray[0] = "You haven't built any vertices in MeshBuilder and called MeshBuilder build via the 'buildThrowable' method, which throw an exception about the MeshBuilder being empty.";
            String[] stringArray2 = new String[1];
            stringArray2[0] = "If your rendering method assumes an empty MeshBuilder, call the builder via the 'buildNullable' method. If not, check your MeshBuilder method and fix it.";
            \u062f\u0646.printAndExit(new \u0630\u062d("MeshBuilder was empty.", stringArray, stringArray2));
            return null;
        }
        return var1_1;
    }

    public MeshBuilder(BufferAllocator bufferAllocator, DrawMode drawMode, VertexFormat vertexFormat, boolean closeAllocatorAfterBuild) {
        this(bufferAllocator, drawMode, vertexFormat, closeAllocatorAfterBuild, null);
    }
}

