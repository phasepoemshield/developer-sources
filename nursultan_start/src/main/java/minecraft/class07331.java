/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.vertex.VertexFormat
 *  com.mojang.blaze3d.vertex.VertexFormat$class_5595
 *  com.mojang.blaze3d.vertex.VertexFormat$class_5596
 *  com.mojang.blaze3d.vertex.VertexFormatElement
 *  minecraft.class01391
 *  minecraft.class01423
 *  minecraft.class02022
 *  minecraft.class02566
 *  minecraft.class02579
 *  minecraft.class02583
 *  minecraft.class02609
 *  minecraft.class02613
 *  minecraft.class04995
 *  minecraft.class07835
 *  net.caffeinemc.mods.sodium.api.memory.MemoryIntrinsics
 *  net.caffeinemc.mods.sodium.api.texture.SpriteUtil
 *  net.caffeinemc.mods.sodium.api.util.ColorABGR
 *  net.caffeinemc.mods.sodium.api.vertex.buffer.VertexBufferWriter
 *  net.caffeinemc.mods.sodium.api.vertex.serializer.VertexSerializerRegistry
 *  net.caffeinemc.mods.sodium.client.model.quad.ModelQuadView
 *  net.caffeinemc.mods.sodium.client.render.immediate.model.BakedModelEncoder
 *  net.caffeinemc.mods.sodium.client.render.vertex.buffer.BufferBuilderExtension
 *  net.irisshaders.iris.Iris
 *  net.irisshaders.iris.shaderpack.materialmap.WorldRenderingSettings
 *  net.irisshaders.iris.uniforms.CapturedRenderingState
 *  net.irisshaders.iris.vertices.BufferBuilderPolygonView
 *  net.irisshaders.iris.vertices.ExtendedDataHelper
 *  net.irisshaders.iris.vertices.ImmediateState
 *  net.irisshaders.iris.vertices.IrisVertexFormats
 *  net.irisshaders.iris.vertices.MojangBufferAccessor
 *  net.irisshaders.iris.vertices.NormI8
 *  net.irisshaders.iris.vertices.NormalHelper
 *  net.irisshaders.iris.vertices.views.QuadView
 *  net.irisshaders.iris.vertices.views.TriView
 *  org.joml.Vector3f
 *  org.jspecify.annotations.Nullable
 *  org.lwjgl.system.MemoryStack
 *  org.lwjgl.system.MemoryUtil
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package minecraft;

import com.mojang.blaze3d.vertex.VertexFormat;
import com.mojang.blaze3d.vertex.VertexFormatElement;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.stream.Collectors;
import minecraft.class01391;
import minecraft.class01423;
import minecraft.class02022;
import minecraft.class02566;
import minecraft.class02579;
import minecraft.class02583;
import minecraft.class02609;
import minecraft.class02613;
import minecraft.class04995;
import minecraft.class07835;
import net.caffeinemc.mods.sodium.api.memory.MemoryIntrinsics;
import net.caffeinemc.mods.sodium.api.texture.SpriteUtil;
import net.caffeinemc.mods.sodium.api.util.ColorABGR;
import net.caffeinemc.mods.sodium.api.vertex.buffer.VertexBufferWriter;
import net.caffeinemc.mods.sodium.api.vertex.serializer.VertexSerializerRegistry;
import net.caffeinemc.mods.sodium.client.model.quad.ModelQuadView;
import net.caffeinemc.mods.sodium.client.render.immediate.model.BakedModelEncoder;
import net.caffeinemc.mods.sodium.client.render.vertex.buffer.BufferBuilderExtension;
import net.irisshaders.iris.Iris;
import net.irisshaders.iris.shaderpack.materialmap.WorldRenderingSettings;
import net.irisshaders.iris.uniforms.CapturedRenderingState;
import net.irisshaders.iris.vertices.BufferBuilderPolygonView;
import net.irisshaders.iris.vertices.ExtendedDataHelper;
import net.irisshaders.iris.vertices.ImmediateState;
import net.irisshaders.iris.vertices.IrisVertexFormats;
import net.irisshaders.iris.vertices.MojangBufferAccessor;
import net.irisshaders.iris.vertices.NormI8;
import net.irisshaders.iris.vertices.NormalHelper;
import net.irisshaders.iris.vertices.views.QuadView;
import net.irisshaders.iris.vertices.views.TriView;
import org.joml.Vector3f;
import org.jspecify.annotations.Nullable;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class07331
implements class01391,
VertexBufferWriter,
BufferBuilderExtension {
    private static final int N = 0xFFFFFF;
    private static final long y = -1L;
    private static final long L = -1L;
    private static final boolean u = ByteOrder.nativeOrder() == ByteOrder.LITTLE_ENDIAN;
    private final class02579 i;
    private long R = -1L;
    private int M;
    private final VertexFormat B;
    private final VertexFormat.class_5596 Z;
    private final boolean z;
    private final boolean U;
    private final int E;
    private final int W;
    private final int[] m;
    private int P;
    private boolean s = true;
    private final BufferBuilderPolygonView T = new BufferBuilderPolygonView();
    private final Vector3f b = new Vector3f();
    private final long[] j = new long[4];
    private boolean v;
    private boolean n;
    private boolean t;
    private int G;
    private int l = -1;
    private byte d = (byte)-1;
    private int w;
    private int k;
    private int Y;

    private void L() {
        if (!this.s) {
            throw new IllegalStateException("Not building!");
        }
    }

    public class07331(class02579 class025792, VertexFormat.class_5596 class_55962, VertexFormat vertexFormat) {
        VertexFormat vertexFormat2 = vertexFormat;
        vertexFormat = this.N(vertexFormat);
        if (!vertexFormat2.contains(VertexFormatElement.POSITION)) {
            throw new IllegalArgumentException("Cannot build mesh with no position element");
        }
        this.i = class025792;
        this.Z = class_55962;
        this.B = vertexFormat;
        this.E = vertexFormat.getVertexSize();
        this.W = vertexFormat.getElementsMask() & ~VertexFormatElement.POSITION.mask();
        this.m = vertexFormat.getOffsetsByElement();
        boolean bl = vertexFormat == class07835.L;
        boolean bl2 = vertexFormat == class07835.y;
        this.z = bl || bl2;
        this.U = bl;
    }

    private long i() {
        long l;
        this.L();
        this.R();
        if (this.M >= 0xFFFFFF) {
            throw new IllegalStateException("Trying to write too many vertices (>16777215) into BufferBuilder");
        }
        ++this.M;
        this.R = l = this.i.y(this.E);
        return l;
    }

    private @Nullable class02609 u() {
        if (this.M == 0) {
            return null;
        }
        class02613 class026132 = this.i.N();
        if (class026132 == null) {
            return null;
        }
        int n = this.Z.method_31973(this.M);
        VertexFormat.class_5595 class_55952 = VertexFormat.class_5595.method_31972((int)this.M);
        return new class02609(class026132, new class02583(this.B, this.M, n, this.Z, class_55952));
    }

    private static void y(long l, int n) {
        if (u) {
            MemoryUtil.memPutInt((long)l, (int)n);
        } else {
            MemoryUtil.memPutShort((long)l, (short)((short)(n & 0xFFFF)));
            MemoryUtil.memPutShort((long)(l + 2L), (short)((short)(n >> 16 & 0xFFFF)));
        }
    }

    private void y(CallbackInfo callbackInfo) {
        if (this.M == 0 || !this.n) {
            return;
        }
        this.P &= ~IrisVertexFormats.MID_TEXTURE_ELEMENT.mask();
        this.P &= ~IrisVertexFormats.TANGENT_ELEMENT.mask();
        if (this.t && this.P != (this.P & ~VertexFormatElement.NORMAL.mask())) {
            this.method_22914(0.0f, 1.0f, 0.0f);
        }
        if (this.v) {
            this.v = false;
            return;
        }
        if (this.Z != VertexFormat.class_5596.field_27382 && this.Z != VertexFormat.class_5596.field_27379) {
            return;
        }
        this.j[this.G] = this.R - ((MojangBufferAccessor)this.i).getPointer();
        ++this.G;
        if (this.Z == VertexFormat.class_5596.field_27382 && this.G == 4 || this.Z == VertexFormat.class_5596.field_27379 && this.G == 3) {
            this.N(this.G);
        }
    }

    public class02609 y() {
        class02609 class026092 = this.N();
        if (class026092 == null) {
            throw new IllegalStateException("BufferBuilder was empty");
        }
        return class026092;
    }

    public void push(MemoryStack memoryStack, long l, int n, VertexFormat vertexFormat) {
        int n2 = n * this.E;
        long l2 = this.i.y(n2);
        if (vertexFormat == this.B) {
            MemoryIntrinsics.copyMemory((long)l, (long)l2, (int)n2);
        } else {
            this.N(l, l2, n, vertexFormat);
        }
        this.M += n;
        this.R = l2 + (long)n2 - (long)this.E;
        this.P = 0;
        this.N((CallbackInfo)null);
    }

    private boolean N(class07331 class073312) {
        return this.z && !this.n;
    }

    private VertexFormat N(VertexFormat vertexFormat) {
        boolean bl = false;
        this.t = false;
        if (((Boolean)ImmediateState.skipExtension.get()).booleanValue() || !ImmediateState.isRenderingLevel || !Iris.isPackInUseQuick()) {
            return vertexFormat;
        }
        if (vertexFormat == class07835.y || vertexFormat == IrisVertexFormats.TERRAIN) {
            this.n = true;
            bl = true;
            this.t = false;
            return IrisVertexFormats.TERRAIN;
        }
        if (vertexFormat == class07835.L || vertexFormat == IrisVertexFormats.ENTITY) {
            this.n = true;
            bl = false;
            this.t = false;
            return IrisVertexFormats.ENTITY;
        }
        if (vertexFormat == class07835.U || vertexFormat == IrisVertexFormats.GLYPH) {
            this.n = true;
            bl = false;
            this.t = true;
            return IrisVertexFormats.GLYPH;
        }
        return vertexFormat;
    }

    public void N(class01423 class014232, class02022 class020222, float[] fArray, float f, float f2, float f3, float f4, int[] nArray, int n) {
        if (WorldRenderingSettings.INSTANCE.shouldUseSeparateAo()) {
            float[] fArray2 = fArray;
            boolean bl = false;
            fArray = new float[fArray.length];
            Arrays.fill(fArray, 1.0f);
        }
        super.N(class014232, class020222, fArray, f, f2, f3, f4, nArray, n);
    }

    public void N(float f, float f2, float f3, int n, float f4, float f5, int n2, int n3, float f6, float f7, float f8) {
        if (this.N(this)) {
            long l;
            long l2 = this.i();
            MemoryUtil.memPutFloat((long)(l2 + 0L), (float)f);
            MemoryUtil.memPutFloat((long)(l2 + 4L), (float)f2);
            MemoryUtil.memPutFloat((long)(l2 + 8L), (float)f3);
            class07331.N(l2 + 12L, n);
            MemoryUtil.memPutFloat((long)(l2 + 16L), (float)f4);
            MemoryUtil.memPutFloat((long)(l2 + 20L), (float)f5);
            if (this.U) {
                class07331.y(l2 + 24L, n2);
                l = l2 + 28L;
            } else {
                l = l2 + 24L;
            }
            class07331.y(l + 0L, n3);
            MemoryUtil.memPutByte((long)(l + 4L), (byte)class07331.N(f6));
            MemoryUtil.memPutByte((long)(l + 5L), (byte)class07331.N(f7));
            MemoryUtil.memPutByte((long)(l + 6L), (byte)class07331.N(f8));
            return;
        }
        super.N(f, f2, f3, n, f4, f5, n2, n3, f6, f7, f8);
    }

    private static byte N(float f) {
        return (byte)((int)(class04995.N((float)f, (float)-1.0f, (float)1.0f) * 127.0f) & 0xFF);
    }

    private void N(long l, long l2, int n, VertexFormat vertexFormat) {
        VertexSerializerRegistry.instance().get(vertexFormat, this.B).serialize(l, l2, n);
    }

    public void N(class01423 class014232, class02022 class020222, float f, float f2, float f3, float f4, int n, int n2) {
        if (!this.z) {
            super.N(class014232, class020222, f, f2, f3, f4, n, n2);
            if (class020222.E() != null) {
                SpriteUtil.INSTANCE.markSpriteActive(class020222.E());
            }
            return;
        }
        VertexBufferWriter vertexBufferWriter = VertexBufferWriter.of((class01391)this);
        ModelQuadView modelQuadView = (ModelQuadView)class020222;
        int n3 = ColorABGR.pack((float)f, (float)f2, (float)f3, (float)f4);
        BakedModelEncoder.writeQuadVertices((VertexBufferWriter)vertexBufferWriter, (class01423)class014232, (ModelQuadView)modelQuadView, (int)n3, (int)n, (int)n2, (boolean)false);
        if (modelQuadView.getSprite() != null) {
            SpriteUtil.INSTANCE.markSpriteActive(modelQuadView.getSprite());
        }
    }

    private void N(int n) {
        int n2;
        this.G = 0;
        int n3 = this.B.getVertexSize();
        this.T.setup(((MojangBufferAccessor)this.i).getPointer(), this.j, n3, n);
        float f = 0.0f;
        float f2 = 0.0f;
        for (n2 = 0; n2 < n; ++n2) {
            f += this.T.u(n2);
            f2 += this.T.v(n2);
        }
        f /= (float)n;
        f2 /= (float)n;
        n2 = this.m[IrisVertexFormats.MID_TEXTURE_ELEMENT.id()];
        int n4 = this.m[VertexFormatElement.NORMAL.id()];
        int n5 = this.m[IrisVertexFormats.TANGENT_ELEMENT.id()];
        if (n == 3) {
            for (int i = 0; i < n; ++i) {
                long l = ((MojangBufferAccessor)this.i).getPointer() + this.j[i];
                int n6 = MemoryUtil.memGetInt((long)(l + (long)n4));
                int n7 = NormalHelper.computeTangentSmooth((float)NormI8.unpackX((int)n6), (float)NormI8.unpackY((int)n6), (float)NormI8.unpackZ((int)n6), (TriView)this.T);
                MemoryUtil.memPutFloat((long)(l + (long)n2), (float)f);
                MemoryUtil.memPutFloat((long)(l + (long)n2 + 4L), (float)f2);
                MemoryUtil.memPutInt((long)(l + (long)n5), (int)n7);
            }
        } else {
            boolean bl = ImmediateState.isRenderingLevel;
            NormalHelper.computeFaceNormal((Vector3f)this.b, (QuadView)this.T);
            int n8 = 0;
            if (bl) {
                n8 = NormI8.pack((float)this.b.x, (float)this.b.y, (float)this.b.z, (float)0.0f);
            }
            int n9 = NormalHelper.computeTangent((float)this.b.x, (float)this.b.y, (float)this.b.z, (TriView)this.T);
            for (int i = 0; i < n; ++i) {
                long l = ((MojangBufferAccessor)this.i).getPointer() + this.j[i];
                MemoryUtil.memPutFloat((long)(l + (long)n2), (float)f);
                MemoryUtil.memPutFloat((long)(l + (long)n2 + 4L), (float)f2);
                if (bl) {
                    MemoryUtil.memPutInt((long)(l + (long)n4), (int)n8);
                }
                MemoryUtil.memPutInt((long)(l + (long)n5), (int)n9);
            }
        }
        Arrays.fill(this.j, 0L);
    }

    private void N(CallbackInfo callbackInfo) {
        this.v = true;
    }

    private void N(float f, float f2, float f3, CallbackInfoReturnable callbackInfoReturnable) {
        long l;
        if ((this.P & IrisVertexFormats.MID_BLOCK_ELEMENT.mask()) != 0) {
            l = this.N(IrisVertexFormats.MID_BLOCK_ELEMENT);
            MemoryUtil.memPutInt((long)l, (int)ExtendedDataHelper.computeMidBlock((float)f, (float)f2, (float)f3, (int)this.w, (int)this.k, (int)this.Y));
            byte by = -1;
            MemoryUtil.memPutByte((long)(l + 3L), (byte)by);
        }
        if ((this.P & IrisVertexFormats.ENTITY_ELEMENT.mask()) != 0) {
            l = this.N(IrisVertexFormats.ENTITY_ELEMENT);
            MemoryUtil.memPutShort((long)l, (short)((short)this.l));
            MemoryUtil.memPutShort((long)(l + 2L), (short)this.d);
        } else if ((this.P & IrisVertexFormats.ENTITY_ID_ELEMENT.mask()) != 0) {
            l = this.N(IrisVertexFormats.ENTITY_ID_ELEMENT);
            MemoryUtil.memPutShort((long)l, (short)((short)CapturedRenderingState.INSTANCE.getCurrentRenderedEntity()));
            MemoryUtil.memPutShort((long)(l + 2L), (short)((short)CapturedRenderingState.INSTANCE.getCurrentRenderedBlockEntity()));
            MemoryUtil.memPutShort((long)(l + 4L), (short)((short)CapturedRenderingState.INSTANCE.getCurrentRenderedItem()));
        }
    }

    private static void N(long l, int n) {
        int n2 = class02566.T((int)n);
        MemoryUtil.memPutInt((long)l, (int)(u ? n2 : Integer.reverseBytes(n2)));
    }

    private class01391 N(short s, short s2, VertexFormatElement vertexFormatElement) {
        long l = this.N(vertexFormatElement);
        if (l != -1L) {
            MemoryUtil.memPutShort((long)l, (short)s);
            MemoryUtil.memPutShort((long)(l + 2L), (short)s2);
        }
        return this;
    }

    private long N(VertexFormatElement vertexFormatElement) {
        int n = this.P;
        int n2 = n & ~vertexFormatElement.mask();
        if (n2 == n) {
            return -1L;
        }
        this.P = n2;
        long l = this.R;
        if (l == -1L) {
            throw new IllegalArgumentException("Not currently building vertex");
        }
        return l + (long)this.m[vertexFormatElement.id()];
    }

    public @Nullable class02609 N() {
        this.L();
        this.R();
        class02609 class026092 = this.u();
        this.s = false;
        this.R = -1L;
        return class026092;
    }

    public class01391 method_1336(int n, int n2, int n3, int n4) {
        long l = this.N(VertexFormatElement.COLOR);
        if (l != -1L) {
            MemoryUtil.memPutByte((long)l, (byte)((byte)n));
            MemoryUtil.memPutByte((long)(l + 1L), (byte)((byte)n2));
            MemoryUtil.memPutByte((long)(l + 2L), (byte)((byte)n3));
            MemoryUtil.memPutByte((long)(l + 3L), (byte)((byte)n4));
        }
        return this;
    }

    public void sodium$duplicateVertex() {
        if (this.M == 0) {
            return;
        }
        long l = this.i.y(this.E);
        MemoryIntrinsics.copyMemory((long)(l - (long)this.E), (long)l, (int)this.E);
        ++this.M;
    }

    public class01391 method_22922(int n) {
        long l = this.N(VertexFormatElement.UV1);
        if (l != -1L) {
            class07331.y(l, n);
        }
        return this;
    }

    public class01391 method_60803(int n) {
        long l = this.N(VertexFormatElement.UV2);
        if (l != -1L) {
            class07331.y(l, n);
        }
        return this;
    }

    public class01391 method_22913(float f, float f2) {
        long l = this.N(VertexFormatElement.UV0);
        if (l != -1L) {
            MemoryUtil.memPutFloat((long)l, (float)f);
            MemoryUtil.memPutFloat((long)(l + 4L), (float)f2);
        }
        return this;
    }

    private void R() {
        this.y(null);
        if (this.M == 0) {
            return;
        }
        if (this.P != 0) {
            String string = VertexFormatElement.elementsFromMask((int)this.P).map(arg_0 -> ((VertexFormat)this.B).getElementName(arg_0)).collect(Collectors.joining(", "));
            throw new IllegalStateException("Missing elements in vertex: " + string);
        }
        if (this.Z == VertexFormat.class_5596.field_27377) {
            long l = this.i.y(this.E);
            MemoryUtil.memCopy((long)(l - (long)this.E), (long)l, (long)this.E);
            ++this.M;
        }
    }

    public void beginBlock(int n, byte by, byte by2, int n2, int n3, int n4) {
        this.l = n;
        this.d = by;
        this.w = n2;
        this.k = n3;
        this.Y = n4;
    }

    public void endBlock() {
        this.l = -1;
        this.d = (byte)-1;
        this.w = 0;
        this.k = 0;
        this.Y = 0;
    }

    public class01391 method_22912(float f, float f2, float f3) {
        long l = this.i() + (long)this.m[VertexFormatElement.POSITION.id()];
        this.P = this.W;
        MemoryUtil.memPutFloat((long)l, (float)f);
        MemoryUtil.memPutFloat((long)(l + 4L), (float)f2);
        MemoryUtil.memPutFloat((long)(l + 8L), (float)f3);
        this.N(f, f2, f3, null);
        return this;
    }

    public class01391 method_39415(int n) {
        long l = this.N(VertexFormatElement.COLOR);
        if (l != -1L) {
            class07331.N(l, n);
        }
        return this;
    }

    public class01391 method_22914(float f, float f2, float f3) {
        long l = this.N(VertexFormatElement.NORMAL);
        if (l != -1L) {
            MemoryUtil.memPutByte((long)l, (byte)class07331.N(f));
            MemoryUtil.memPutByte((long)(l + 1L), (byte)class07331.N(f2));
            MemoryUtil.memPutByte((long)(l + 2L), (byte)class07331.N(f3));
        }
        return this;
    }

    public class01391 method_60796(int n, int n2) {
        return this.N((short)n, (short)n2, VertexFormatElement.UV1);
    }

    public class01391 method_22921(int n, int n2) {
        return this.N((short)n, (short)n2, VertexFormatElement.UV2);
    }

    public class01391 method_75298(float f) {
        long l = this.N(VertexFormatElement.LINE_WIDTH);
        if (l != -1L) {
            MemoryUtil.memPutFloat((long)l, (float)f);
        }
        return this;
    }
}

