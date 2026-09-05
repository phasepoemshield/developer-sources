/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.buffers.GpuBuffer
 *  com.mojang.blaze3d.buffers.GpuBuffer$MappedView
 *  com.mojang.blaze3d.buffers.GpuBufferSlice
 *  com.mojang.blaze3d.buffers.Std140Builder
 *  com.mojang.blaze3d.buffers.Std140SizeCalculator
 *  com.mojang.blaze3d.pipeline.RenderPipeline
 *  com.mojang.blaze3d.systems.RenderPass
 *  com.mojang.blaze3d.systems.RenderSystem
 *  com.mojang.blaze3d.systems.RenderSystem$class_5590
 *  com.mojang.blaze3d.textures.GpuTextureView
 *  com.mojang.blaze3d.vertex.VertexFormat$class_5596
 *  com.mojang.logging.LogUtils
 *  minecraft.class00084
 *  minecraft.class00183
 *  minecraft.class00951
 *  minecraft.class01089
 *  minecraft.class01291
 *  minecraft.class01301
 *  minecraft.class01781
 *  minecraft.class01894
 *  minecraft.class01999
 *  minecraft.class02446
 *  minecraft.class02448
 *  minecraft.class02566
 *  minecraft.class03063
 *  minecraft.class03579
 *  minecraft.class04643
 *  minecraft.class04866
 *  minecraft.class04995
 *  minecraft.class05630
 *  minecraft.class06176
 *  minecraft.class06202
 *  minecraft.class06889
 *  minecraft.class07211
 *  minecraft.class08066
 *  minecraft.class08117
 *  minecraft.class08212
 *  minecraft.class08280
 *  minecraft.class08290
 *  minecraft.class08394
 *  minecraft.class08396
 *  minecraft.class08521
 *  minecraft.class08543
 *  minecraft.class08575
 *  minecraft.class08627
 *  minecraft.class08718
 *  minecraft.class09033
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.api.resource.v1.reloader.ResourceReloaderKeys$Client
 *  net.fabricmc.fabric.impl.resource.FabricResourceReloader
 *  net.irisshaders.iris.mixin.CloudRendererAccessor
 *  org.joml.Matrix4f
 *  org.joml.Matrix4fc
 *  org.joml.Vector3f
 *  org.joml.Vector3fc
 *  org.joml.Vector4f
 *  org.joml.Vector4fc
 *  org.jspecify.annotations.Nullable
 *  org.lwjgl.system.MemoryUtil
 *  org.slf4j.Logger
 */
package minecraft;

import com.mojang.blaze3d.buffers.GpuBuffer;
import com.mojang.blaze3d.buffers.GpuBufferSlice;
import com.mojang.blaze3d.buffers.Std140Builder;
import com.mojang.blaze3d.buffers.Std140SizeCalculator;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.systems.RenderPass;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.textures.GpuTextureView;
import com.mojang.blaze3d.vertex.VertexFormat;
import com.mojang.logging.LogUtils;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Locale;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import minecraft.class00084;
import minecraft.class00183;
import minecraft.class00951;
import minecraft.class01089;
import minecraft.class01291;
import minecraft.class01301;
import minecraft.class01781;
import minecraft.class01894;
import minecraft.class01999;
import minecraft.class02446;
import minecraft.class02448;
import minecraft.class02566;
import minecraft.class03063;
import minecraft.class03579;
import minecraft.class04643;
import minecraft.class04866;
import minecraft.class04995;
import minecraft.class05630;
import minecraft.class06176;
import minecraft.class06202;
import minecraft.class06889;
import minecraft.class07211;
import minecraft.class08066;
import minecraft.class08117;
import minecraft.class08212;
import minecraft.class08280;
import minecraft.class08290;
import minecraft.class08394;
import minecraft.class08396;
import minecraft.class08521;
import minecraft.class08543;
import minecraft.class08575;
import minecraft.class08627;
import minecraft.class08718;
import minecraft.class09033;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.resource.v1.reloader.ResourceReloaderKeys;
import net.fabricmc.fabric.impl.resource.FabricResourceReloader;
import net.irisshaders.iris.mixin.CloudRendererAccessor;
import org.joml.Matrix4f;
import org.joml.Matrix4fc;
import org.joml.Vector3f;
import org.joml.Vector3fc;
import org.joml.Vector4f;
import org.joml.Vector4fc;
import org.jspecify.annotations.Nullable;
import org.lwjgl.system.MemoryUtil;
import org.slf4j.Logger;

@Environment(value=EnvType.CLIENT)
public class class02416
extends class01291<Optional<class02448>>
implements AutoCloseable,
FabricResourceReloader,
CloudRendererAccessor {
    private static final int N = 16;
    private static final int y = 32;
    private static final float L = 12.0f;
    private static final int u = 400;
    private static final float i = 0.6f;
    private static final int R = new Std140SizeCalculator().putVec4().putVec3().putVec3().get();
    private static final Logger M = LogUtils.getLogger();
    private static final class01894 B = class01894.y((String)"textures/environment/clouds.png");
    private static final long Z = 0L;
    private static final int z = 4;
    private static final int U = 3;
    private static final int E = 2;
    private static final int W = 1;
    private static final int m = 0;
    private boolean P = true;
    private int s = Integer.MIN_VALUE;
    private int T = Integer.MIN_VALUE;
    private class02446 b = class02446.field_53061;
    private @Nullable class01301 j;
    private @Nullable class02448 v;
    private int n = 0;
    private final class00084 t = new class00084(() -> "Cloud UBO", 130, R);
    private @Nullable class00084 G;
    private class01894 l;

    private static boolean L(long l) {
        return (l >> 1 & 1L) != 0L;
    }

    @Override
    public void close() {
        this.t.close();
        if (this.G != null) {
            this.G.close();
        }
    }

    private static boolean u(long l) {
        return (l >> 0 & 1L) != 0L;
    }

    public void y() {
        this.t.L();
    }

    private static boolean y(long l) {
        return (l >> 2 & 1L) != 0L;
    }

    private static boolean y(int n) {
        return class02566.y((int)n) < 10;
    }

    private static int N(int n) {
        int n2 = 4;
        return ((n + 1) * 2 * ((n + 1) * 2) / 2 * 4 + 54) * 3;
    }

    /*
     * Enabled aggressive exception aggregation
     */
    protected Optional<class02448> y(class01089 class010892, class04643 class046432) {
        try (InputStream inputStream = class010892.u(B);){
            Optional<class02448> optional;
            block17: {
                class08280 class082802 = class08280.N((InputStream)inputStream);
                try {
                    int n = class082802.N();
                    int n2 = class082802.y();
                    long[] lArray = new long[n * n2];
                    for (int i = 0; i < n2; ++i) {
                        for (int j = 0; j < n; ++j) {
                            int n3 = class082802.N(j, i);
                            if (class02416.y(n3)) {
                                lArray[j + i * n] = 0L;
                                continue;
                            }
                            boolean bl = class02416.y(class082802.N(j, Math.floorMod(i - 1, n2)));
                            boolean bl2 = class02416.y(class082802.N(Math.floorMod(j + 1, n2), i));
                            boolean bl3 = class02416.y(class082802.N(j, Math.floorMod(i + 1, n2)));
                            boolean bl4 = class02416.y(class082802.N(Math.floorMod(j - 1, n2), i));
                            lArray[j + i * n] = class02416.N(n3, bl, bl2, bl3, bl4);
                        }
                    }
                    optional = Optional.of(new class02448(lArray, n, n2));
                    if (class082802 == null) break block17;
                }
                catch (Throwable throwable) {
                    if (class082802 != null) {
                        try {
                            class082802.close();
                        }
                        catch (Throwable throwable2) {
                            throwable.addSuppressed(throwable2);
                        }
                    }
                    throw throwable;
                }
                class082802.close();
            }
            return optional;
        }
        catch (IOException iOException) {
            M.error("Failed to load cloud texture", (Throwable)iOException);
            return Optional.empty();
        }
    }

    private static int N(long l, int n, long l2, @Nullable class02446 class024462, int n2, int n3) {
        int n4 = n;
        if (class024462 != class02446.field_53062) {
            class02416.N(l, (long)n4, n2, n3, class07211.field_11036, 0);
            ++n4;
        }
        if (class024462 != class02446.field_53060) {
            class02416.N(l, (long)n4, n2, n3, class07211.field_11033, 0);
            ++n4;
        }
        if (class02416.N(l2) && n3 > 0) {
            class02416.N(l, (long)n4, n2, n3, class07211.field_11043, 0);
            ++n4;
        }
        if (class02416.L(l2) && n3 < 0) {
            class02416.N(l, (long)n4, n2, n3, class07211.field_11035, 0);
            ++n4;
        }
        if (class02416.u(l2) && n2 > 0) {
            class02416.N(l, (long)n4, n2, n3, class07211.field_11039, 0);
            ++n4;
        }
        if (class02416.y(l2) && n2 < 0) {
            class02416.N(l, (long)n4, n2, n3, class07211.field_11034, 0);
            ++n4;
        }
        return n4;
    }

    protected void N(Optional<class02448> optional, class01089 class010892, class04643 class046432) {
        this.v = optional.orElse(null);
        this.P = true;
    }

    private static void N(long l, long l2, int n, int n2, class07211 class072112, int n3) {
        int n4 = class072112.L() | n3;
        n4 |= (n & 1) << 7;
        long l3 = l + l2 * 3L;
        MemoryUtil.memPutByte((long)l3, (byte)((byte)(n >> 1)));
        MemoryUtil.memPutByte((long)(l3 + 1L), (byte)((byte)(n2 >> 1)));
        MemoryUtil.memPutByte((long)(l3 + 2L), (byte)((byte)(n4 |= (n2 & 1) << 6)));
    }

    private static int N(long l, int n, int n2, int n3) {
        class02416.N(l, (long)n, n2, n3, class07211.field_11033, N);
        class02416.N(l, (long)(n + 1), n2, n3, class07211.field_11036, N);
        class02416.N(l, (long)(n + 2), n2, n3, class07211.field_11043, N);
        class02416.N(l, (long)(n + 3), n2, n3, class07211.field_11035, N);
        class02416.N(l, (long)(n + 4), n2, n3, class07211.field_11039, N);
        class02416.N(l, (long)(n + 5), n2, n3, class07211.field_11034, N);
        return n + 6;
    }

    private static int N(long l, int n, int n2, int n3, @Nullable class02446 class024462, boolean bl, int n4, int n5, long[] lArray, int n6, int n7) {
        int n8;
        int n9 = Math.floorMod(n4 + n2, n6);
        long l2 = lArray[n9 + (n8 = Math.floorMod(n5 + n3, n7)) * n6];
        if (l2 == 0L) {
            return n;
        }
        int n10 = n;
        if (bl) {
            n10 = class02416.N(l, n10, l2, class024462, n2, n3);
            if (class02416.N(n2, n3) <= 1) {
                n10 = class02416.N(l, n10, n2, n3);
            }
        } else {
            class02416.N(l, (long)n10, n2, n3, class07211.field_11033, y);
            ++n10;
        }
        return n10;
    }

    private static int N(int n, int n2) {
        return Math.abs(n) + Math.abs(n2);
    }

    private void N(class02446 class024462, ByteBuffer byteBuffer, int n, int n2, boolean bl, int n3) {
        if (this.v != null) {
            long[] lArray = this.v.N();
            int n4 = this.v.y();
            int n5 = this.v.L();
            long l = MemoryUtil.memAddress((ByteBuffer)byteBuffer);
            int n6 = byteBuffer.position() / 3;
            for (int i = 0; i <= 2 * n3; ++i) {
                for (int j = -i; j <= i; ++j) {
                    int n7 = i - Math.abs(j);
                    if (n7 < 0 || n7 > n3 || j * j + n7 * n7 > n3 * n3) continue;
                    if (n7 != 0) {
                        n6 = class02416.N(l, n6, j, -n7, class024462, bl, n, n2, lArray, n4, n5);
                    }
                    n6 = class02416.N(l, n6, j, n7, class024462, bl, n, n2, lArray, n4, n5);
                }
            }
            byteBuffer.position(n6 * 3);
        }
    }

    private void N(class02446 class024462, ByteBuffer byteBuffer, int n, int n2, long l) {
        if (class024462 != class02446.field_53062) {
            this.N(byteBuffer, n, n2, class07211.field_11036, 0);
        }
        if (class024462 != class02446.field_53060) {
            this.N(byteBuffer, n, n2, class07211.field_11033, 0);
        }
        if (class02416.N(l) && n2 > 0) {
            this.N(byteBuffer, n, n2, class07211.field_11043, 0);
        }
        if (class02416.L(l) && n2 < 0) {
            this.N(byteBuffer, n, n2, class07211.field_11035, 0);
        }
        if (class02416.u(l) && n > 0) {
            this.N(byteBuffer, n, n2, class07211.field_11039, 0);
        }
        if (class02416.y(l) && n < 0) {
            this.N(byteBuffer, n, n2, class07211.field_11034, 0);
        }
        if (Math.abs(n) <= 1 && Math.abs(n2) <= 1) {
            for (class07211 class072112 : class07211.values()) {
                this.N(byteBuffer, n, n2, class072112, 16);
            }
        }
    }

    private void N(ByteBuffer byteBuffer, int n, int n2, class07211 class072112, int n3) {
        int n4 = class072112.L() | n3;
        n4 |= (n & 1) << 7;
        byteBuffer.put((byte)(n >> 1)).put((byte)(n2 >> 1)).put((byte)(n4 |= (n2 & 1) << 6));
    }

    private void N(ByteBuffer byteBuffer, int n, int n2) {
        this.N(byteBuffer, n, n2, class07211.field_11033, 32);
    }

    private void N(class02446 class024462, ByteBuffer byteBuffer, int n, int n2, boolean bl, int n3, int n4, int n5, int n6, long[] lArray) {
        int n7;
        int n8 = Math.floorMod(n + n3, n4);
        long l = lArray[n8 + (n7 = Math.floorMod(n2 + n5, n6)) * n4];
        if (l == 0L) {
            return;
        }
        if (bl) {
            this.N(class024462, byteBuffer, n3, n5, l);
        } else {
            this.N(byteBuffer, n3, n5);
        }
    }

    public void N(int n, class01301 class013012, float f, class06889 class068892, long l, float f2) {
        GpuTextureView gpuTextureView;
        GpuTextureView gpuTextureView2;
        GpuBuffer.MappedView mappedView;
        RenderPipeline renderPipeline;
        float f3;
        if (this.v == null) {
            return;
        }
        int n2 = class04995.u((float)((float)((Integer)((class05630)class06202.Nq().i_7).E().method_41753() * 16) / 12.0f));
        int n3 = class02416.N(n2);
        if (this.G == null || this.G.y().size() != (long)n3) {
            if (this.G != null) {
                this.G.close();
            }
            this.G = new class00084(() -> "Cloud UTB", 258, n3);
        }
        class02446 class024462 = (f3 = (float)((double)f - class068892.B)) + 4.0f < 0.0f ? class02446.field_53060 : (f3 > 0.0f ? class02446.field_53062 : class02446.field_53061);
        float f4 = (float)(l % ((long)this.v.y() * 400L)) + f2;
        double d = class068892.M + (double)(f4 * 0.030000001f);
        double d2 = class068892.Z + (double)3.96f;
        double d3 = (double)this.v.y() * 12.0;
        double d4 = (double)this.v.L() * 12.0;
        d -= (double)class04995.N((double)(d / d3)) * d3;
        d2 -= (double)class04995.N((double)(d2 / d4)) * d4;
        int n4 = class04995.N((double)(d / 12.0));
        int n5 = class04995.N((double)(d2 / 12.0));
        float f5 = (float)(d - (double)((float)n4 * 12.0f));
        float f6 = (float)(d2 - (double)((float)n5 * 12.0f));
        boolean bl = class013012 == class01301.field_18164;
        RenderPipeline renderPipeline2 = renderPipeline = bl ? class08394.Nn : class08394.Nv;
        if (this.P || n4 != this.s || n5 != this.T || class024462 != this.b || class013012 != this.j) {
            this.P = false;
            this.s = n4;
            this.T = n5;
            this.b = class024462;
            this.j = class013012;
            this.G.L();
            mappedView = RenderSystem.getDevice().createCommandEncoder().mapBuffer(this.G.y(), false, true);
            try {
                this.N(class024462, mappedView.data(), n4, n5, bl, n2);
                this.n = mappedView.data().position() / 3;
            }
            finally {
                if (mappedView != null) {
                    mappedView.close();
                }
            }
        }
        if (this.n == 0) {
            return;
        }
        mappedView = RenderSystem.getDevice().createCommandEncoder().mapBuffer(this.t.y(), false, true);
        try {
            Std140Builder.intoBuffer((ByteBuffer)mappedView.data()).putVec4((Vector4fc)class02566.E((int)n)).putVec3(-f5, f3, -f6).putVec3(12.0f, 4.0f, 12.0f);
        }
        finally {
            if (mappedView != null) {
                mappedView.close();
            }
        }
        mappedView = RenderSystem.getDynamicUniforms().N((Matrix4fc)RenderSystem.getModelViewMatrix(), (Vector4fc)new Vector4f(1.0f, 1.0f, 1.0f, 1.0f), (Vector3fc)new Vector3f(), (Matrix4fc)new Matrix4f());
        class08066 class080662 = class06202.Nq().e();
        class08066 class080663 = ((class03063)class06202.Nq().B_2).j();
        RenderSystem.class_5590 class_55902 = RenderSystem.getSequentialBuffer((VertexFormat.class_5596)VertexFormat.class_5596.field_27382);
        GpuBuffer gpuBuffer = class_55902.method_68274(6 * this.n);
        if (class080663 != null) {
            gpuTextureView2 = class080663.u();
            gpuTextureView = class080663.R();
        } else {
            gpuTextureView2 = class080662.u();
            gpuTextureView = class080662.R();
        }
        try (RenderPass renderPass = RenderSystem.getDevice().createCommandEncoder().createRenderPass(() -> "Clouds", gpuTextureView2, OptionalInt.empty(), gpuTextureView, OptionalDouble.empty());){
            renderPass.setPipeline(renderPipeline);
            RenderSystem.bindDefaultUniforms((RenderPass)renderPass);
            renderPass.setUniform("DynamicTransforms", (GpuBufferSlice)mappedView);
            renderPass.setIndexBuffer(gpuBuffer, class_55902.method_31924());
            renderPass.setUniform("CloudInfo", this.t.y());
            renderPass.setUniform("CloudFaces", this.G.y());
            renderPass.drawIndexed(0, 0, 6 * this.n, 1);
        }
    }

    private static long N(int n, boolean bl, boolean bl2, boolean bl3, boolean bl4) {
        return (long)n << 4 | (long)((bl ? 1 : 0) << 3) | (long)((bl2 ? 1 : 0) << 2) | (long)((bl3 ? 1 : 0) << 1) | (long)((bl4 ? 1 : 0) << 0);
    }

    private static boolean N(long l) {
        return (l >> 3 & 1L) != 0L;
    }

    public void N() {
        this.P = true;
    }

    public class01894 fabric$getId() {
        if (this.l == null) {
            class02416 var1 = this;
            this.l = var1 instanceof class08117 ? ResourceReloaderKeys.Client.ATLAS : (var1 instanceof class00183 ? ResourceReloaderKeys.Client.MODELS : (var1 instanceof class03579 ? ResourceReloaderKeys.Client.BLOCK_ENTITY_RENDERERS : (var1 instanceof class01999 ? ResourceReloaderKeys.Client.BLOCK_RENDER_MANAGER : (var1 instanceof class02416 ? ResourceReloaderKeys.Client.CLOUD_CELLS : (var1 instanceof class08521 ? ResourceReloaderKeys.Client.DRY_FOLIAGE_COLORMAP : (var1 instanceof class08718 ? ResourceReloaderKeys.Client.EQUIPMENT_MODELS : (var1 instanceof class01781 ? ResourceReloaderKeys.Client.ENTITY_RENDERERS : (var1 instanceof class04866 ? ResourceReloaderKeys.Client.FONTS : (var1 instanceof class08575 ? ResourceReloaderKeys.Client.FOLIAGE_COLORMAP : (var1 instanceof class08543 ? ResourceReloaderKeys.Client.GRASS_COLORMAP : (var1 instanceof class08396 ? ResourceReloaderKeys.Client.LANGUAGES : (var1 instanceof class00951 ? ResourceReloaderKeys.Client.PARTICLES : (var1 instanceof class08212 ? ResourceReloaderKeys.Client.SHADERS : (var1 instanceof class06176 ? ResourceReloaderKeys.Client.SPLASH_TEXTS : (var1 instanceof class09033 ? ResourceReloaderKeys.Client.SOUNDS : (var1 instanceof class08627 ? ResourceReloaderKeys.Client.TEXTURES : (var1 instanceof class08290 ? ResourceReloaderKeys.Client.WAYPOINT_STYLE_ASSETS : class01894.y((String)("private/" + var1.getClass().getSimpleName().toLowerCase(Locale.ROOT))))))))))))))))))));
        }
        return this.l;
    }

    public /* synthetic */ class02448 getTexture() {
        return this.v;
    }
}

