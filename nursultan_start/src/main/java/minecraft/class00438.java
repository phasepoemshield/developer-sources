/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.buffers.GpuBuffer
 *  com.mojang.blaze3d.buffers.GpuBuffer$MappedView
 *  com.mojang.blaze3d.systems.RenderSystem
 *  minecraft.class00084
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.blaze3d.buffers.GpuBuffer;
import com.mojang.blaze3d.systems.RenderSystem;
import java.nio.ByteBuffer;
import minecraft.class00084;
import org.jspecify.annotations.Nullable;

public class class00438
implements AutoCloseable {
    private @Nullable class00084 N;

    @Override
    public void close() {
        if (this.N != null) {
            this.N.close();
        }
    }

    void y() {
        if (this.N != null) {
            this.N.L();
        }
    }

    public void N(ByteBuffer byteBuffer) {
        if (this.N == null || this.N.N() < byteBuffer.remaining()) {
            if (this.N != null) {
                this.N.close();
            }
            this.N = new class00084(() -> "Particle Vertices", 34, byteBuffer.remaining());
        }
        try (GpuBuffer.MappedView mappedView = RenderSystem.getDevice().createCommandEncoder().mapBuffer(this.N.y().slice(), false, true);){
            mappedView.data().put(byteBuffer);
        }
    }

    public GpuBuffer N() {
        if (this.N == null) {
            throw new IllegalStateException("Can't get buffer before it's made");
        }
        return this.N.y();
    }
}

