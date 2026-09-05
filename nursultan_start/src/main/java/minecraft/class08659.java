/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10954
 *  Nursultan.class11339
 *  Nursultan.class11938
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.ImmutableMap$Builder
 *  com.llamalad7.mixinextras.injector.wrapoperation.Operation
 *  com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime
 *  com.mojang.blaze3d.buffers.GpuBuffer
 *  com.mojang.blaze3d.buffers.GpuBuffer$MappedView
 *  com.mojang.blaze3d.buffers.GpuBufferSlice
 *  com.mojang.blaze3d.pipeline.RenderPipeline
 *  com.mojang.blaze3d.systems.CommandEncoder
 *  com.mojang.blaze3d.systems.GpuDevice
 *  com.mojang.blaze3d.systems.RenderPass
 *  com.mojang.blaze3d.systems.RenderSystem
 *  com.mojang.blaze3d.systems.RenderSystem$class_5590
 *  com.mojang.blaze3d.textures.FilterMode
 *  com.mojang.blaze3d.textures.GpuTexture
 *  com.mojang.blaze3d.textures.GpuTextureView
 *  com.mojang.blaze3d.textures.TextureFormat
 *  com.mojang.blaze3d.vertex.VertexFormat
 *  com.mojang.blaze3d.vertex.VertexFormat$class_5595
 *  com.mojang.blaze3d.vertex.VertexFormat$class_5596
 *  com.mojang.logging.LogUtils
 *  it.unimi.dsi.fastutil.objects.Object2IntMap
 *  it.unimi.dsi.fastutil.objects.Object2IntMap$Entry
 *  it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap
 *  it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap
 *  minecraft.class00056
 *  minecraft.class00084
 *  minecraft.class00312
 *  minecraft.class01237
 *  minecraft.class01384
 *  minecraft.class01391
 *  minecraft.class01421
 *  minecraft.class01422
 *  minecraft.class01540
 *  minecraft.class01609
 *  minecraft.class02579
 *  minecraft.class02583
 *  minecraft.class02609
 *  minecraft.class03255
 *  minecraft.class03386
 *  minecraft.class04790
 *  minecraft.class04995
 *  minecraft.class06202
 *  minecraft.class07331
 *  minecraft.class07529
 *  minecraft.class08066
 *  minecraft.class08133
 *  minecraft.class08188
 *  minecraft.class08394
 *  minecraft.class08669
 *  minecraft.class08672
 *  minecraft.class08673
 *  minecraft.class08677
 *  minecraft.class08679
 *  minecraft.class08763
 *  minecraft.class08766
 *  minecraft.class08778
 *  minecraft.class08844
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.impl.client.rendering.GuiRendererExtensions
 *  net.fabricmc.fabric.impl.client.rendering.SpecialGuiElementRegistryImpl
 *  net.fabricmc.fabric.impl.client.rendering.SpecialGuiElementRendererPool
 *  net.fabricmc.fabric.mixin.client.rendering.DrawAccessor
 *  org.apache.commons.lang3.mutable.MutableBoolean
 *  org.joml.Matrix3x2fc
 *  org.joml.Matrix4f
 *  org.joml.Matrix4fc
 *  org.joml.Vector3f
 *  org.joml.Vector3fc
 *  org.joml.Vector4f
 *  org.joml.Vector4fc
 *  org.jspecify.annotations.Nullable
 *  org.lwjgl.system.MemoryUtil
 *  org.slf4j.Logger
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package minecraft;

import Nursultan.class10954;
import Nursultan.class11339;
import Nursultan.class11938;
import com.google.common.collect.ImmutableMap;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime;
import com.mojang.blaze3d.buffers.GpuBuffer;
import com.mojang.blaze3d.buffers.GpuBufferSlice;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.systems.CommandEncoder;
import com.mojang.blaze3d.systems.GpuDevice;
import com.mojang.blaze3d.systems.RenderPass;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.textures.FilterMode;
import com.mojang.blaze3d.textures.GpuTexture;
import com.mojang.blaze3d.textures.GpuTextureView;
import com.mojang.blaze3d.textures.TextureFormat;
import com.mojang.blaze3d.vertex.VertexFormat;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.Set;
import java.util.function.Supplier;
import minecraft.class00056;
import minecraft.class00084;
import minecraft.class00312;
import minecraft.class01237;
import minecraft.class01384;
import minecraft.class01391;
import minecraft.class01421;
import minecraft.class01422;
import minecraft.class01540;
import minecraft.class01609;
import minecraft.class02579;
import minecraft.class02583;
import minecraft.class02609;
import minecraft.class03255;
import minecraft.class03386;
import minecraft.class04790;
import minecraft.class04995;
import minecraft.class06202;
import minecraft.class07331;
import minecraft.class07529;
import minecraft.class08066;
import minecraft.class08133;
import minecraft.class08188;
import minecraft.class08394;
import minecraft.class08646;
import minecraft.class08647;
import minecraft.class08650;
import minecraft.class08651;
import minecraft.class08652;
import minecraft.class08655;
import minecraft.class08661;
import minecraft.class08669;
import minecraft.class08672;
import minecraft.class08673;
import minecraft.class08677;
import minecraft.class08679;
import minecraft.class08763;
import minecraft.class08766;
import minecraft.class08778;
import minecraft.class08844;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.impl.client.rendering.GuiRendererExtensions;
import net.fabricmc.fabric.impl.client.rendering.SpecialGuiElementRegistryImpl;
import net.fabricmc.fabric.impl.client.rendering.SpecialGuiElementRendererPool;
import net.fabricmc.fabric.mixin.client.rendering.DrawAccessor;
import org.apache.commons.lang3.mutable.MutableBoolean;
import org.joml.Matrix3x2fc;
import org.joml.Matrix4f;
import org.joml.Matrix4fc;
import org.joml.Vector3f;
import org.joml.Vector3fc;
import org.joml.Vector4f;
import org.joml.Vector4fc;
import org.jspecify.annotations.Nullable;
import org.lwjgl.system.MemoryUtil;
import org.slf4j.Logger;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Environment(value=EnvType.CLIENT)
public class class08659
implements AutoCloseable,
GuiRendererExtensions {
    private static final Logger M = LogUtils.getLogger();
    private static final float B = 10000.0f;
    public static final float N = 0.0f;
    private static final float Z = 1000.0f;
    public static final int y = 1000;
    public static final int L = -1000;
    public static final int u = 16;
    private static final int z = 512;
    private static final int U = RenderSystem.getDevice().getMaxTextureSize();
    public static final int i = 0;
    private static final Comparator<class03255> E = Comparator.nullsFirst(Comparator.comparing(class03255::y).thenComparing(class03255::L).thenComparing(class03255::u).thenComparing(class03255::i));
    private static final Comparator<class08679> W = Comparator.nullsFirst(Comparator.comparing(class08679::y));
    private static final Comparator<class08669> m = Comparator.comparing(class08669::comp_4069, E).thenComparing(class08669::comp_4055, Comparator.comparing(RenderPipeline::getSortKey)).thenComparing(class08669::comp_4056, W);
    private final Map<Object, class11339> P;
    private final Map<Object, class08766> s;
    final class08651 R;
    private final List<class08673> T;
    private final List<class08655> b;
    private final class02579 j;
    private final Map<VertexFormat, class00084> v;
    private int n;
    private final class00056 t;
    private final class00056 G;
    private final class01422 l;
    private final class01237 d;
    private final class08133 w;
    private Map<Class<? extends class08647>, class08672<?>> k;
    private @Nullable GpuTexture Y;
    private @Nullable GpuTextureView Q;
    private @Nullable GpuTexture O;
    private @Nullable GpuTextureView g;
    private int I;
    private int J;
    private int o;
    private int q;
    private @Nullable class03255 K = null;
    private @Nullable RenderPipeline V = null;
    private @Nullable class08679 e = null;
    private @Nullable class07331 H = null;
    private boolean c = false;
    private final Map X = new HashMap();
    private class01237 a = null;

    private void L() {
        this.l.u();
        this.R();
        this.i();
        this.u();
        this.R.N(m);
        this.N(class08677.field_60316);
        this.n = this.b.size();
        this.N(class08677.field_60317);
        this.Z();
    }

    private GpuBufferSlice L(GpuBufferSlice gpuBufferSlice) {
        class10954 class109542 = class10954.N((GpuBufferSlice)gpuBufferSlice);
        class11938.L().L((Object)class109542);
        return class109542.N();
    }

    private void L(CallbackInfo callbackInfo) {
        this.X.values().forEach(SpecialGuiElementRendererPool::close);
    }

    private int M() {
        int n = class06202.Nq().Nt().j();
        if (n != this.o) {
            this.B();
            Iterator<class08766> var2 = this.s.values().iterator();
            while (var2.hasNext()) {
                var2.next().i();
            }
            this.o = n;
        }
        return n;
    }

    public class08659(class08651 class086512, class01422 class014222, class01237 class012372, class08133 class081332, List<class08672<?>> list) {
        this.P = new Object2ObjectOpenHashMap();
        this.s = new Object2ObjectOpenHashMap();
        this.T = new ArrayList<class08673>();
        this.b = new ArrayList<class08655>();
        this.j = new class02579(786432);
        this.v = new Object2ObjectOpenHashMap();
        this.n = Integer.MAX_VALUE;
        this.t = new class00056("gui", 1000.0f, 11000.0f, true);
        this.G = new class00056("items", -1000.0f, 1000.0f, true);
        this.R = class086512;
        this.l = class014222;
        this.d = class012372;
        this.w = class081332;
        ImmutableMap.Builder builder = ImmutableMap.builder();
        for (class08672<?> class086722 : list) {
            builder.put((Object)class086722.N(), class086722);
        }
        this.k = builder.buildOrThrow();
        this.N(class086512, class014222, class012372, class081332, list, null);
    }

    private void B() {
        this.I = 0;
        this.J = 0;
        this.P.clear();
        if (this.Y != null) {
            this.Y.close();
            this.Y = null;
        }
        if (this.Q != null) {
            this.Q.close();
            this.Q = null;
        }
        if (this.O != null) {
            this.O.close();
            this.O = null;
        }
        if (this.g != null) {
            this.g.close();
            this.g = null;
        }
    }

    private void Z() {
        this.z();
        CommandEncoder commandEncoder = RenderSystem.getDevice().createCommandEncoder();
        Object2IntOpenHashMap object2IntOpenHashMap = new Object2IntOpenHashMap();
        for (class08655 class086552 : this.b) {
            class02609 class026092 = class086552.N();
            class02583 class025832 = class026092.L();
            VertexFormat vertexFormat = class025832.N();
            class00084 class000842 = this.v.get(vertexFormat);
            if (!object2IntOpenHashMap.containsKey((Object)vertexFormat)) {
                object2IntOpenHashMap.put((Object)vertexFormat, 0);
            }
            ByteBuffer byteBuffer = class026092.N();
            int n = byteBuffer.remaining();
            int n2 = object2IntOpenHashMap.getInt((Object)vertexFormat);
            try (GpuBuffer.MappedView mappedView = commandEncoder.mapBuffer(class000842.y().slice((long)n2, (long)n), false, true);){
                MemoryUtil.memCopy((ByteBuffer)byteBuffer, (ByteBuffer)mappedView.data());
            }
            object2IntOpenHashMap.put((Object)vertexFormat, n2 + n);
            this.T.add(new class08673(class000842.y(), n2 / vertexFormat.getVertexSize(), class025832.u(), class025832.L(), class086552.y(), class086552.L(), class086552.u()));
            class086552.close();
        }
    }

    private void i() {
        if (this.R.u().isEmpty()) {
            return;
        }
        int n = this.M();
        int n2 = 16 * n;
        int n3 = this.y(n2);
        if (this.Y == null) {
            this.N(n3);
        }
        RenderSystem.outputColorTextureOverride = this.Q;
        RenderSystem.outputDepthTextureOverride = this.g;
        RenderSystem.setProjectionMatrix((GpuBufferSlice)this.G.y((float)n3, (float)n3), (class00312)class00312.field_54954);
        ((class03386)class06202.Nq().i_5).v().N(class01540.field_60027);
        class01421 class014212 = new class01421();
        MutableBoolean mutableBoolean = new MutableBoolean(false);
        MutableBoolean mutableBoolean2 = new MutableBoolean(false);
        this.R.N((class08650 class086502) -> {
            int n3;
            boolean bl;
            if (class086502.M() != null) {
                mutableBoolean2.setTrue();
                return;
            }
            class08763 class087632 = class086502.L();
            class11339 class113392 = this.P.get(class087632.Z());
            if (!(class113392 == null || class087632.u() && class113392.i != this.q)) {
                this.N((class08650)class086502, class113392.L, class113392.u, n2, n3);
                return;
            }
            if (this.I + n2 > n3) {
                this.I = 0;
                this.J += n2;
            }
            boolean bl2 = bl = class087632.u() && class113392 != null;
            if (!bl && this.J + n2 > n3) {
                if (mutableBoolean.isFalse()) {
                    M.warn("Trying to render too many items in GUI at the same time. Skipping some of them.");
                    mutableBoolean.setTrue();
                }
                return;
            }
            int n4 = bl ? class113392.N : this.I;
            int n5 = n3 = bl ? class113392.y : this.J;
            if (bl) {
                RenderSystem.getDevice().createCommandEncoder().clearColorAndDepthTextures(this.Y, 0, this.O, 1.0, n4, n3 - n3 - n2, n2, n2);
            }
            this.N(class087632, class014212, n4, n3, n2);
            float f = (float)n4 / (float)n3;
            float f2 = (float)(n3 - n3) / (float)n3;
            this.N((class08650)class086502, f, f2, n2, n3);
            if (bl) {
                class113392.i = this.q;
            } else {
                this.P.put(class086502.L().Z(), new class11339(this.I, this.J, f, f2, this.q));
                this.I += n2;
            }
        });
        RenderSystem.outputColorTextureOverride = null;
        RenderSystem.outputDepthTextureOverride = null;
        if (mutableBoolean2.booleanValue()) {
            this.R.N((class08650 class086502) -> {
                if (class086502.M() != null) {
                    class08763 class087632 = class086502.L();
                    class08766 class087662 = this.s.computeIfAbsent(class087632.Z(), object -> new class08766(this.l));
                    class03255 class032552 = class086502.M();
                    class08778 class087782 = new class08778(class086502, class032552.u(), class032552.y(), class032552.i(), class032552.L());
                    class087662.N((class08647)class087782, this.R, n);
                }
            });
        }
    }

    private Object2IntMap<VertexFormat> U() {
        Object2IntOpenHashMap object2IntOpenHashMap = new Object2IntOpenHashMap();
        Iterator<class08655> var2 = this.b.iterator();
        while (var2.hasNext()) {
            class02583 class025832 = var2.next().N().L();
            VertexFormat vertexFormat = class025832.N();
            if (!object2IntOpenHashMap.containsKey((Object)vertexFormat)) {
                object2IntOpenHashMap.put((Object)vertexFormat, 0);
            }
            object2IntOpenHashMap.put((Object)vertexFormat, object2IntOpenHashMap.getInt((Object)vertexFormat) + class025832.y() * vertexFormat.getVertexSize());
        }
        return object2IntOpenHashMap;
    }

    @Override
    public void close() {
        this.j.close();
        if (this.Y != null) {
            this.Y.close();
        }
        if (this.Q != null) {
            this.Q.close();
        }
        if (this.O != null) {
            this.O.close();
        }
        if (this.g != null) {
            this.g.close();
        }
        this.k.values().forEach(class08672::close);
        this.t.close();
        this.G.close();
        Iterator<class00084> var1 = this.v.values().iterator();
        while (var1.hasNext()) {
            var1.next().close();
        }
        this.s.values().forEach(class08672::close);
        this.L((CallbackInfo)null);
    }

    private void z() {
        for (Object2IntMap.Entry entry : this.U().object2IntEntrySet()) {
            VertexFormat vertexFormat = (VertexFormat)entry.getKey();
            int n = entry.getIntValue();
            class00084 class000842 = this.v.get(vertexFormat);
            if (class000842 != null && class000842.N() >= n) continue;
            if (class000842 != null) {
                class000842.close();
            }
            this.v.put(vertexFormat, new class00084(() -> "GUI vertex buffer for " + String.valueOf(vertexFormat), 34, n));
        }
    }

    private void u() {
        this.R.y((class08652 class086522) -> {
            Matrix3x2fc matrix3x2fc = class086522.L;
            class03255 class032552 = class086522.z;
            class086522.N().N((class01609)new class08646(this, matrix3x2fc, class032552));
        });
    }

    private int y(int n) {
        int n2;
        Set<Object> var2 = this.R.u();
        if (this.P.isEmpty()) {
            n2 = var2.size();
        } else {
            n2 = this.P.size();
            for (Object object : var2) {
                if (this.P.containsKey(object)) continue;
                ++n2;
            }
        }
        if (this.Y != null) {
            int n3 = this.Y.getWidth(0) / n;
            int n4 = n3 * n3;
            if (n2 < n4) {
                return this.Y.getWidth(0);
            }
            this.B();
        }
        int n5 = var2.size();
        int n6 = class04995.u((int)(n5 + n5 / 2));
        return Math.clamp((long)class04995.L((int)(n6 * n)), (int)512, (int)U);
    }

    private void y(GpuBufferSlice gpuBufferSlice) {
        class08673 class0867322;
        if (this.T.isEmpty()) {
            return;
        }
        class06202 class062022 = class06202.Nq();
        class08844 class088442 = class062022.Nt();
        RenderSystem.setProjectionMatrix((GpuBufferSlice)this.L(this.t.y((float)class088442.U() / (float)class088442.j(), (float)class088442.E() / (float)class088442.j())), (class00312)class00312.field_54954);
        class08066 class080662 = class062022.e();
        int n = 0;
        for (class08673 class0867322 : this.T) {
            if (class0867322.u() <= n) continue;
            n = class0867322.u();
        }
        RenderSystem.class_5590 class_55902 = RenderSystem.getSequentialBuffer((VertexFormat.class_5596)VertexFormat.class_5596.field_27382);
        class0867322 = class_55902.method_68274(n);
        VertexFormat.class_5595 class_55952 = class_55902.method_31924();
        GpuBufferSlice gpuBufferSlice2 = RenderSystem.getDynamicUniforms().N((Matrix4fc)new Matrix4f().setTranslation(0.0f, 0.0f, -11000.0f), (Vector4fc)new Vector4f(1.0f, 1.0f, 1.0f, 1.0f), (Vector3fc)new Vector3f(), (Matrix4fc)new Matrix4f());
        if (this.n > 0) {
            this.N(() -> "GUI before blur", class080662, gpuBufferSlice, gpuBufferSlice2, (GpuBuffer)class0867322, class_55952, 0, Math.min(this.n, this.T.size()));
        }
        if (this.T.size() <= this.n) {
            return;
        }
        RenderSystem.getDevice().createCommandEncoder().clearDepthTexture(class080662.i(), 1.0);
        ((class03386)class062022.i_5).Z();
        this.N(() -> "GUI after blur", class080662, gpuBufferSlice, gpuBufferSlice2, (GpuBuffer)class0867322, class_55952, this.n, this.T.size());
    }

    private void y() {
        Iterator<Map.Entry<Object, class08766>> var1 = this.s.entrySet().iterator();
        while (var1.hasNext()) {
            class08766 class087662 = var1.next().getValue();
            if (!class087662.L()) {
                class087662.close();
                var1.remove();
                continue;
            }
            class087662.u();
        }
    }

    private void y(CallbackInfo callbackInfo) {
        this.X.values().forEach(SpecialGuiElementRendererPool::cleanUpUnusedRenderers);
    }

    private void N(RenderPass renderPass, GpuBuffer gpuBuffer, VertexFormat.class_5595 class_55952, Operation operation, DrawAccessor drawAccessor) {
        RenderPipeline renderPipeline = drawAccessor.fabric$pipeline();
        if (renderPipeline.usePipelineDrawModeForGui() && renderPipeline.getVertexFormatMode() != VertexFormat.class_5596.field_27382) {
            RenderSystem.class_5590 class_55902 = RenderSystem.getSequentialBuffer((VertexFormat.class_5596)renderPipeline.getVertexFormatMode());
            gpuBuffer = class_55902.method_68274(drawAccessor.fabric$indexCount());
            class_55952 = class_55902.method_31924();
        }
        operation.call(new Object[]{renderPass, gpuBuffer, class_55952});
    }

    private boolean N(boolean bl, RenderPipeline renderPipeline) {
        return bl || renderPipeline.getVertexFormatMode().field_38878;
    }

    private class08672 N(class08672 class086722, class08647 class086472) {
        if (class086722 == null || !this.c) {
            return class086722;
        }
        return this.X.computeIfAbsent(class086722.N(), clazz -> new SpecialGuiElementRendererPool()).substitute(class086722, class086472, class06202.Nq(), this.l, Objects.requireNonNull(this.a, "renderDispatcher"));
    }

    private void N(CallbackInfo callbackInfo) {
        this.X.values().forEach(SpecialGuiElementRendererPool::newFrame);
    }

    private void N(class08651 class086512, class01422 class014222, class01237 class012372, class08133 class081332, List list, CallbackInfo callbackInfo) {
        this.k = new IdentityHashMap(this.k);
    }

    private void N(class08669 class086692) {
        RenderPipeline renderPipeline = class086692.comp_4055();
        class08679 class086792 = class086692.comp_4056();
        class03255 class032552 = class086692.comp_4069();
        if (renderPipeline != this.V || this.N(this.N(class032552, this.K), renderPipeline) || !class086792.equals((Object)this.e)) {
            if (this.H != null) {
                this.N(this.H, this.V, this.e, this.K);
            }
            this.H = this.N(renderPipeline);
            this.V = renderPipeline;
            this.e = class086792;
            this.K = class032552;
        }
        class086692.method_70917((class01391)this.H);
    }

    private <T extends class08647> void N(T t, int n) {
        class08672<?> var3 = this.k.get(t.getClass());
        class08672 class086722 = this.N(var3, t);
        if (class086722 != null) {
            class086722.N(t, this.R, n);
        }
    }

    private void N(class08763 class087632, class01421 class014212, int n, int n2, int n3) {
        class014212.N();
        class014212.N((float)n + (float)n3 / 2.0f, (float)n2 + (float)n3 / 2.0f, 0.0f);
        class014212.y((float)n3, (float)(-n3), (float)n3);
        if (!class087632.R()) {
            ((class03386)class06202.Nq().i_5).v().N(class01540.field_60026);
        } else {
            ((class03386)class06202.Nq().i_5).v().N(class01540.field_60027);
        }
        RenderSystem.enableScissorForRenderTypeDraws((int)n, (int)(this.Y.getHeight(0) - n2 - n3), (int)n3, (int)n3);
        class087632.N(class014212, this.d, 0xF000F0, class01384.u, 0);
        this.w.N();
        this.l.u();
        RenderSystem.disableScissorForRenderTypeDraws();
        class014212.y();
    }

    private void N(class08650 class086502, float f, float f2, int n, int n2) {
        float f3 = f + (float)n / (float)n2;
        float f4 = f2 + (float)(-n) / (float)n2;
        this.R.N(new class08661(class08394.Np, class08679.N((GpuTextureView)this.Q, (class08188)RenderSystem.getSamplerCache().y(FilterMode.NEAREST)), class086502.y(), class086502.u(), class086502.i(), class086502.u() + 16, class086502.i() + 16, f, f3, f2, f4, -1, class086502.R(), null));
    }

    public void N() {
        ++this.q;
    }

    public void N(GpuBufferSlice gpuBufferSlice) {
        this.L();
        this.y(gpuBufferSlice);
        Iterator<class00084> var2 = this.v.values().iterator();
        while (var2.hasNext()) {
            var2.next().L();
        }
        this.T.clear();
        this.b.clear();
        this.R.i();
        this.n = Integer.MAX_VALUE;
        this.y();
        if (class07529.l) {
            RenderPipeline.updateSortKeySeed();
            class08679.L();
        }
    }

    private void N(class08677 class086772) {
        this.K = null;
        this.V = null;
        this.e = null;
        this.H = null;
        this.R.N(this::N, class086772);
        if (this.H != null) {
            this.N(this.H, this.V, this.e, this.K);
        }
    }

    private void N(Supplier<String> supplier, class08066 class080662, GpuBufferSlice gpuBufferSlice, GpuBufferSlice gpuBufferSlice2, GpuBuffer gpuBuffer, VertexFormat.class_5595 class_55952, int n, int n2) {
        try (RenderPass renderPass = RenderSystem.getDevice().createCommandEncoder().createRenderPass(supplier, class080662.u(), OptionalInt.empty(), class080662.u ? class080662.R() : null, OptionalDouble.empty());){
            RenderSystem.bindDefaultUniforms((RenderPass)renderPass);
            renderPass.setUniform("Fog", gpuBufferSlice);
            renderPass.setUniform("DynamicTransforms", gpuBufferSlice2);
            for (int i = n; i < n2; ++i) {
                class08673 class086732 = this.T.get(i);
                this.N(class086732, renderPass, gpuBuffer, class_55952);
            }
        }
    }

    private class07331 N(RenderPipeline renderPipeline) {
        return new class07331(this.j, renderPipeline.getVertexFormatMode(), renderPipeline.getVertexFormat());
    }

    private boolean N(@Nullable class03255 class032552, @Nullable class03255 class032553) {
        if (class032552 == class032553) {
            return false;
        }
        if (class032552 != null) {
            return !class032552.equals((Object)class032553);
        }
        return true;
    }

    private void N(class03255 class032552, RenderPass renderPass) {
        class08844 class088442 = class06202.Nq().Nt();
        int n = class088442.E();
        int n2 = class088442.j();
        double d = class032552.u() * n2;
        double d2 = n - class032552.L() * n2;
        double d3 = class032552.M() * n2;
        double d4 = class032552.B() * n2;
        renderPass.enableScissor((int)d, (int)d2, Math.max(0, (int)d3), Math.max(0, (int)d4));
    }

    private void N(class07331 class073312, RenderPipeline renderPipeline, class08679 class086792, @Nullable class03255 class032552) {
        class02609 class026092 = class073312.N();
        if (class026092 != null) {
            this.b.add(new class08655(class026092, renderPipeline, class086792, class032552));
        }
    }

    private void N(class08673 class086732, RenderPass renderPass, GpuBuffer gpuBuffer, VertexFormat.class_5595 class_55952) {
        RenderPipeline renderPipeline = class086732.i();
        renderPass.setPipeline(renderPipeline);
        renderPass.setVertexBuffer(0, class086732.N());
        class03255 class032552 = class086732.M();
        if (class032552 != null) {
            this.N(class032552, renderPass);
        } else {
            renderPass.disableScissor();
        }
        if (class086732.R().u() != null) {
            renderPass.bindTexture("Sampler0", class086732.R().u(), class086732.R().M());
        }
        if (class086732.R().i() != null) {
            renderPass.bindTexture("Sampler1", class086732.R().i(), class086732.R().B());
        }
        if (class086732.R().R() != null) {
            renderPass.bindTexture("Sampler2", class086732.R().R(), class086732.R().Z());
        }
        VertexFormat.class_5595 class_55953 = class_55952;
        GpuBuffer gpuBuffer2 = gpuBuffer;
        RenderPass renderPass2 = renderPass;
        this.N(renderPass2, gpuBuffer2, class_55953, objectArray -> {
            WrapOperationRuntime.checkArgumentCount((Object[])objectArray, (int)3, (String)"[com.mojang.blaze3d.systems.RenderPass, com.mojang.blaze3d.buffers.GpuBuffer, com.mojang.blaze3d.vertex.VertexFormat$class_5595]");
            Object[] objectArray2 = objectArray;
            ((RenderPass)objectArray[0]).setIndexBuffer((GpuBuffer)objectArray2[1], (VertexFormat.class_5595)objectArray2[2]);
            return null;
        }, (DrawAccessor)class086732);
        renderPass.drawIndexed(class086732.y(), 0, class086732.u(), 1);
    }

    private void N(int n) {
        GpuDevice gpuDevice = RenderSystem.getDevice();
        this.Y = gpuDevice.createTexture("UI items atlas", 12, TextureFormat.RGBA8, n, n, 1, 1);
        this.Q = gpuDevice.createTextureView(this.Y);
        this.O = gpuDevice.createTexture("UI items atlas depth", 8, TextureFormat.DEPTH32, n, n, 1, 1);
        this.g = gpuDevice.createTextureView(this.O);
        gpuDevice.createCommandEncoder().clearColorAndDepthTextures(this.Y, 0, this.O, 1.0);
    }

    public void fabric_onReady(class04790 class047902) {
        this.a = class047902;
        SpecialGuiElementRegistryImpl.onReady((class06202)class06202.Nq(), (class01422)this.l, (class01237)class047902, this.k);
        this.c = true;
    }

    private void R() {
        this.N((CallbackInfo)null);
        int n = class06202.Nq().Nt().j();
        this.R.L((class08647 class086472) -> this.N(class086472, n));
        this.y((CallbackInfo)null);
    }
}

