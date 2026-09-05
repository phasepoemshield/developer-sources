/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.buffers.GpuBuffer
 *  com.mojang.blaze3d.buffers.GpuBufferSlice
 *  com.mojang.blaze3d.pipeline.RenderPipeline
 *  com.mojang.blaze3d.systems.RenderPass
 *  com.mojang.blaze3d.systems.RenderPass$class_10884
 *  com.mojang.blaze3d.textures.GpuTextureView
 *  com.mojang.blaze3d.vertex.VertexFormat$class_5595
 *  minecraft.class08188
 *  minecraft.class08193
 *  minecraft.class08495
 *  minecraft.class08681
 *  minecraft.class09006
 *  net.irisshaders.iris.mixinterface.CustomPass
 *  net.irisshaders.iris.mixinterface.RenderPassInterface
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.blaze3d.buffers.GpuBuffer;
import com.mojang.blaze3d.buffers.GpuBufferSlice;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.systems.RenderPass;
import com.mojang.blaze3d.textures.GpuTextureView;
import com.mojang.blaze3d.vertex.VertexFormat;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Supplier;
import minecraft.class08188;
import minecraft.class08193;
import minecraft.class08495;
import minecraft.class08681;
import minecraft.class08849;
import minecraft.class08870;
import minecraft.class09006;
import net.irisshaders.iris.mixinterface.CustomPass;
import net.irisshaders.iris.mixinterface.RenderPassInterface;
import org.jspecify.annotations.Nullable;

public class class08858
implements RenderPass,
RenderPassInterface {
    protected static final int N = 1;
    public static final boolean y;
    private final class08495 U;
    private final boolean E;
    private boolean W;
    public @Nullable class08870 L;
    protected final @Nullable GpuBuffer[] u = new GpuBuffer[1];
    protected @Nullable GpuBuffer i;
    protected VertexFormat.class_5595 R = VertexFormat.class_5595.field_27373;
    private final class08681 m = new class08681();
    protected final HashMap<String, GpuBufferSlice> M = new HashMap();
    public final HashMap<String, class08849> B = new HashMap();
    protected final Set<String> Z = new HashSet<String>();
    protected int z;
    private CustomPass P;

    public int L() {
        return this.m.L();
    }

    public class08858(class08495 class084952, boolean bl) {
        this.U = class084952;
        this.E = bl;
    }

    public int i() {
        return this.m.i();
    }

    public void close() {
        if (!this.W) {
            if (this.z > 0) {
                throw new IllegalStateException("Render pass had debug groups left open!");
            }
            this.W = true;
            this.U.N();
        }
    }

    public int u() {
        return this.m.u();
    }

    public boolean y() {
        return this.m.y();
    }

    public boolean N() {
        return this.E;
    }

    public void setUniform(String string, GpuBuffer gpuBuffer) {
        this.M.put(string, gpuBuffer.slice());
        this.Z.add(string);
    }

    public void setUniform(String string, GpuBufferSlice gpuBufferSlice) {
        int n = this.U.y().getUniformOffsetAlignment();
        if (gpuBufferSlice.offset() % (long)n > 0L) {
            throw new IllegalArgumentException("Uniform buffer offset must be aligned to " + n);
        }
        this.M.put(string, gpuBufferSlice);
        this.Z.add(string);
    }

    public void setPipeline(RenderPipeline renderPipeline) {
        if (this.L == null || this.L.N() != renderPipeline) {
            this.Z.addAll(this.M.keySet());
            this.Z.addAll(this.B.keySet());
        }
        this.L = this.U.y().N(renderPipeline);
    }

    public void setIndexBuffer(@Nullable GpuBuffer gpuBuffer, VertexFormat.class_5595 class_55952) {
        this.i = gpuBuffer;
        this.R = class_55952;
    }

    public void bindTexture(String string, @Nullable GpuTextureView gpuTextureView, @Nullable class08188 class081882) {
        if (class081882 == null) {
            this.B.remove(string);
        } else {
            this.B.put(string, new class08849((class09006)gpuTextureView, (class08193)class081882));
        }
        this.Z.add(string);
    }

    public void drawIndexed(int n, int n2, int n3, int n4) {
        if (this.W) {
            throw new IllegalStateException("Can't use a closed render pass");
        }
        this.U.N(this, n, n2, n3, this.R, n4);
    }

    public void setVertexBuffer(int n, GpuBuffer gpuBuffer) {
        if (n < 0 || n >= 1) {
            throw new IllegalArgumentException("Vertex buffer slot is out of range: " + n);
        }
        this.u[n] = gpuBuffer;
    }

    public void enableScissor(int n, int n2, int n3, int n4) {
        this.m.N(n, n2, n3, n4);
    }

    public int R() {
        return this.m.R();
    }

    public void disableScissor() {
        this.m.N();
    }

    public void iris$setCustomPass(CustomPass customPass) {
        this.P = customPass;
    }

    public void popDebugGroup() {
        if (this.W) {
            throw new IllegalStateException("Can't use a closed render pass");
        }
        if (this.z == 0) {
            throw new IllegalStateException("Can't pop more debug groups than was pushed!");
        }
        --this.z;
        this.U.y().N().N();
    }

    public void pushDebugGroup(Supplier<String> supplier) {
        if (this.W) {
            throw new IllegalStateException("Can't use a closed render pass");
        }
        ++this.z;
        this.U.y().N().N(supplier);
    }

    public CustomPass iris$getCustomPass() {
        return this.P;
    }

    public void draw(int n, int n2) {
        if (this.W) {
            throw new IllegalStateException("Can't use a closed render pass");
        }
        this.U.N(this, n, 0, n2, null, 1);
    }

    public <T> void drawMultipleIndexed(Collection<RenderPass.class_10884<T>> collection, @Nullable GpuBuffer gpuBuffer, // Could not load outer class - annotation placement on inner may be incorrect
     @Nullable VertexFormat.class_5595 class_55952, Collection<String> collection2, T t) {
        if (this.W) {
            throw new IllegalStateException("Can't use a closed render pass");
        }
        this.U.N(this, collection, gpuBuffer, class_55952, collection2, t);
    }
}

