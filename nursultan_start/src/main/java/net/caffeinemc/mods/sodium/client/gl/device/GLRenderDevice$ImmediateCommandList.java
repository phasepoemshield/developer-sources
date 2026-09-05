/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL20C
 *  org.lwjgl.opengl.GL30C
 *  org.lwjgl.opengl.GL31C
 *  org.lwjgl.opengl.GL32C
 */
package net.caffeinemc.mods.sodium.client.gl.device;

import java.nio.ByteBuffer;
import net.caffeinemc.mods.sodium.client.gl.array.GlVertexArray;
import net.caffeinemc.mods.sodium.client.gl.buffer.GlBuffer;
import net.caffeinemc.mods.sodium.client.gl.buffer.GlBufferMapFlags;
import net.caffeinemc.mods.sodium.client.gl.buffer.GlBufferMapping;
import net.caffeinemc.mods.sodium.client.gl.buffer.GlBufferStorageFlags;
import net.caffeinemc.mods.sodium.client.gl.buffer.GlBufferTarget;
import net.caffeinemc.mods.sodium.client.gl.buffer.GlBufferUsage;
import net.caffeinemc.mods.sodium.client.gl.buffer.GlImmutableBuffer;
import net.caffeinemc.mods.sodium.client.gl.buffer.GlMutableBuffer;
import net.caffeinemc.mods.sodium.client.gl.device.CommandList;
import net.caffeinemc.mods.sodium.client.gl.device.DrawCommandList;
import net.caffeinemc.mods.sodium.client.gl.device.GLRenderDevice;
import net.caffeinemc.mods.sodium.client.gl.state.GlStateTracker;
import net.caffeinemc.mods.sodium.client.gl.sync.GlFence;
import net.caffeinemc.mods.sodium.client.gl.tessellation.GlPrimitiveType;
import net.caffeinemc.mods.sodium.client.gl.tessellation.GlTessellation;
import net.caffeinemc.mods.sodium.client.gl.tessellation.GlVertexArrayTessellation;
import net.caffeinemc.mods.sodium.client.gl.tessellation.TessellationBinding;
import net.caffeinemc.mods.sodium.client.gl.util.EnumBitField;
import org.lwjgl.opengl.GL20C;
import org.lwjgl.opengl.GL30C;
import org.lwjgl.opengl.GL31C;
import org.lwjgl.opengl.GL32C;

class GLRenderDevice$ImmediateCommandList
implements CommandList {
    private final GlStateTracker stateTracker;
    final /* synthetic */ GLRenderDevice this$0;

    GLRenderDevice$ImmediateCommandList(GLRenderDevice gLRenderDevice, GlStateTracker glStateTracker) {
        this.this$0 = gLRenderDevice;
        this.stateTracker = glStateTracker;
    }

    @Override
    public void flush() {
    }

    @Override
    public GlFence createFence() {
        return new GlFence(GL32C.glFenceSync((int)37143, (int)0));
    }

    @Override
    public void unmap(GlBufferMapping glBufferMapping) {
        this.checkMapDisposed(glBufferMapping);
        GlBuffer glBuffer = glBufferMapping.getBufferObject();
        this.bindBuffer(GlBufferTarget.ARRAY_BUFFER, glBuffer);
        GL32C.glUnmapBuffer((int)GlBufferTarget.ARRAY_BUFFER.getTargetParameter());
        glBuffer.setActiveMapping(null);
        glBufferMapping.dispose();
    }

    @Override
    public GlImmutableBuffer createImmutableBuffer(long l, EnumBitField<GlBufferStorageFlags> enumBitField) {
        GlImmutableBuffer glImmutableBuffer = new GlImmutableBuffer(enumBitField);
        this.bindBuffer(GlBufferTarget.ARRAY_BUFFER, glImmutableBuffer);
        this.this$0.functions.getBufferStorageFunctions().createBufferStorage(GlBufferTarget.ARRAY_BUFFER, l, enumBitField);
        return glImmutableBuffer;
    }

    @Override
    public GlMutableBuffer createMutableBuffer() {
        return new GlMutableBuffer();
    }

    @Override
    public void uploadData(GlMutableBuffer glMutableBuffer, ByteBuffer byteBuffer, GlBufferUsage glBufferUsage) {
        this.bindBuffer(GlBufferTarget.ARRAY_BUFFER, glMutableBuffer);
        GL20C.glBufferData((int)GlBufferTarget.ARRAY_BUFFER.getTargetParameter(), (ByteBuffer)byteBuffer, (int)glBufferUsage.getId());
        glMutableBuffer.setSize(byteBuffer.remaining());
    }

    @Override
    public void bindBuffer(GlBufferTarget glBufferTarget, GlBuffer glBuffer) {
        if (this.stateTracker.makeBufferActive(glBufferTarget, glBuffer)) {
            GL20C.glBindBuffer((int)glBufferTarget.getTargetParameter(), (int)glBuffer.handle());
        }
    }

    @Override
    public GlBufferMapping mapBuffer(GlBuffer glBuffer, long l, long l2, EnumBitField<GlBufferMapFlags> enumBitField) {
        Object object;
        if (glBuffer.getActiveMapping() != null) {
            throw new IllegalStateException("Buffer is already mapped");
        }
        if (enumBitField.contains(GlBufferMapFlags.PERSISTENT) && !(glBuffer instanceof GlImmutableBuffer)) {
            throw new IllegalStateException("Tried to map mutable buffer as persistent");
        }
        if (glBuffer instanceof GlImmutableBuffer) {
            object = ((GlImmutableBuffer)glBuffer).getFlags();
            if (enumBitField.contains(GlBufferMapFlags.PERSISTENT) && !((EnumBitField)object).contains((GlBufferStorageFlags)GlBufferStorageFlags.PERSISTENT)) {
                throw new IllegalArgumentException("Tried to map non-persistent buffer as persistent");
            }
            if (enumBitField.contains(GlBufferMapFlags.WRITE) && !((EnumBitField)object).contains(GlBufferStorageFlags.MAP_WRITE)) {
                throw new IllegalStateException("Tried to map non-writable buffer as writable");
            }
            if (enumBitField.contains(GlBufferMapFlags.READ) && !((EnumBitField)object).contains(GlBufferStorageFlags.MAP_READ)) {
                throw new IllegalStateException("Tried to map non-readable buffer as readable");
            }
        }
        this.bindBuffer(GlBufferTarget.ARRAY_BUFFER, glBuffer);
        object = GL32C.glMapBufferRange((int)GlBufferTarget.ARRAY_BUFFER.getTargetParameter(), (long)l, (long)l2, (int)enumBitField.getBitField());
        if (object == null) {
            throw new RuntimeException("Failed to map buffer");
        }
        GlBufferMapping glBufferMapping = new GlBufferMapping(glBuffer, (ByteBuffer)object);
        glBuffer.setActiveMapping(glBufferMapping);
        return glBufferMapping;
    }

    @Override
    public void copyBufferSubData(GlBuffer glBuffer, GlBuffer glBuffer2, long l, long l2, long l3) {
        this.bindBuffer(GlBufferTarget.COPY_READ_BUFFER, glBuffer);
        this.bindBuffer(GlBufferTarget.COPY_WRITE_BUFFER, glBuffer2);
        GL31C.glCopyBufferSubData((int)36662, (int)36663, (long)l, (long)l2, (long)l3);
    }

    @Override
    public void uploadDataToOffset(GlMutableBuffer glMutableBuffer, int n, long l, int n2) {
        this.bindBuffer(GlBufferTarget.ARRAY_BUFFER, glMutableBuffer);
        GL20C.nglBufferSubData((int)GlBufferTarget.ARRAY_BUFFER.getTargetParameter(), (long)n, (long)n2, (long)l);
    }

    @Override
    public void deleteBuffer(GlBuffer glBuffer) {
        if (glBuffer.getActiveMapping() != null) {
            this.unmap(glBuffer.getActiveMapping());
        }
        this.stateTracker.notifyBufferDeleted(glBuffer);
        int n = glBuffer.handle();
        glBuffer.invalidateHandle();
        GL20C.glDeleteBuffers((int)n);
    }

    @Override
    public void allocateStorage(GlMutableBuffer glMutableBuffer, long l, GlBufferUsage glBufferUsage) {
        this.bindBuffer(GlBufferTarget.ARRAY_BUFFER, glMutableBuffer);
        GL20C.glBufferData((int)GlBufferTarget.ARRAY_BUFFER.getTargetParameter(), (long)l, (int)glBufferUsage.getId());
        glMutableBuffer.setSize(l);
    }

    @Override
    public GlTessellation createTessellation(GlPrimitiveType glPrimitiveType, TessellationBinding[] tessellationBindingArray) {
        GlVertexArrayTessellation glVertexArrayTessellation = new GlVertexArrayTessellation(new GlVertexArray(), glPrimitiveType, tessellationBindingArray);
        glVertexArrayTessellation.init(this);
        return glVertexArrayTessellation;
    }

    @Override
    public void bindVertexArray(GlVertexArray glVertexArray) {
        if (this.stateTracker.makeVertexArrayActive(glVertexArray)) {
            GL30C.glBindVertexArray((int)glVertexArray.handle());
        }
    }

    @Override
    public void unbindVertexArray() {
        if (this.stateTracker.makeVertexArrayActive(null)) {
            GL30C.glBindVertexArray((int)0);
        }
    }

    @Override
    public DrawCommandList beginTessellating(GlTessellation glTessellation) {
        this.this$0.activeTessellation = glTessellation;
        this.this$0.activeTessellation.bind(this.this$0.commandList);
        return this.this$0.drawCommandList;
    }

    @Override
    public void flushMappedRange(GlBufferMapping glBufferMapping, int n, int n2) {
        this.checkMapDisposed(glBufferMapping);
        GlBuffer glBuffer = glBufferMapping.getBufferObject();
        this.bindBuffer(GlBufferTarget.COPY_READ_BUFFER, glBuffer);
        GL32C.glFlushMappedBufferRange((int)GlBufferTarget.COPY_READ_BUFFER.getTargetParameter(), (long)n, (long)n2);
    }

    @Override
    public void deleteVertexArray(GlVertexArray glVertexArray) {
        this.stateTracker.notifyVertexArrayDeleted(glVertexArray);
        int n = glVertexArray.handle();
        glVertexArray.invalidateHandle();
        GL30C.glDeleteVertexArrays((int)n);
    }

    private void checkMapDisposed(GlBufferMapping glBufferMapping) {
        if (glBufferMapping.isDisposed()) {
            throw new IllegalStateException("Buffer mapping is already disposed");
        }
    }

    @Override
    public void deleteTessellation(GlTessellation glTessellation) {
        glTessellation.delete(this);
    }
}

