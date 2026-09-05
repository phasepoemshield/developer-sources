/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.ObjectArrayList
 *  minecraft.class01894
 *  minecraft.class02022
 *  minecraft.class03042
 *  minecraft.class04809
 *  minecraft.class07211
 *  minecraft.class08743
 *  minecraft.class08915
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.api.renderer.v1.mesh.MutableQuadView
 *  net.fabricmc.fabric.api.renderer.v1.mesh.QuadAtlas
 *  net.fabricmc.fabric.api.renderer.v1.mesh.QuadEmitter
 *  net.fabricmc.fabric.api.renderer.v1.mesh.QuadTransform
 *  net.fabricmc.fabric.api.renderer.v1.mesh.QuadView
 *  net.fabricmc.fabric.api.renderer.v1.mesh.ShadeMode
 *  net.fabricmc.fabric.api.util.TriState
 *  net.fabricmc.fabric.impl.client.indigo.renderer.helper.NormalHelper
 *  org.joml.Vector3fc
 *  org.jspecify.annotations.Nullable
 */
package net.fabricmc.fabric.impl.client.indigo.renderer.mesh;

import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.Objects;
import minecraft.class01894;
import minecraft.class02022;
import minecraft.class03042;
import minecraft.class04809;
import minecraft.class07211;
import minecraft.class08743;
import minecraft.class08915;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.renderer.v1.mesh.MutableQuadView;
import net.fabricmc.fabric.api.renderer.v1.mesh.QuadAtlas;
import net.fabricmc.fabric.api.renderer.v1.mesh.QuadEmitter;
import net.fabricmc.fabric.api.renderer.v1.mesh.QuadTransform;
import net.fabricmc.fabric.api.renderer.v1.mesh.QuadView;
import net.fabricmc.fabric.api.renderer.v1.mesh.ShadeMode;
import net.fabricmc.fabric.api.util.TriState;
import net.fabricmc.fabric.impl.client.indigo.renderer.helper.NormalHelper;
import net.fabricmc.fabric.impl.client.indigo.renderer.mesh.EncodingFormat;
import net.fabricmc.fabric.impl.client.indigo.renderer.mesh.MutableQuadViewImpl$1;
import net.fabricmc.fabric.impl.client.indigo.renderer.mesh.QuadViewImpl;
import org.joml.Vector3fc;
import org.jspecify.annotations.Nullable;

@Environment(value=EnvType.CLIENT)
public abstract class MutableQuadViewImpl
extends QuadViewImpl
implements QuadEmitter {
    private static final QuadTransform NO_TRANSFORM = mutableQuadView -> true;
    private static final int[] DEFAULT_QUAD_DATA = new int[EncodingFormat.TOTAL_STRIDE];
    private QuadTransform activeTransform = NO_TRANSFORM;
    private final ObjectArrayList<QuadTransform> transformStack = new ObjectArrayList();
    private final QuadTransform stackTransform = mutableQuadView -> {
        int n = this.transformStack.size() - 1;
        while (n >= 0) {
            if (((QuadTransform)this.transformStack.get(n--)).transform(mutableQuadView)) continue;
            return false;
        }
        return true;
    };

    public final MutableQuadViewImpl color(int n, int n2) {
        this.data[this.baseIndex + n * EncodingFormat.VERTEX_STRIDE + EncodingFormat.VERTEX_COLOR] = n2;
        return this;
    }

    public final MutableQuadViewImpl pos(int n, float f, float f2, float f3) {
        int n2 = this.baseIndex + n * EncodingFormat.VERTEX_STRIDE + EncodingFormat.VERTEX_X;
        this.data[n2] = Float.floatToRawIntBits(f);
        this.data[n2 + 1] = Float.floatToRawIntBits(f2);
        this.data[n2 + 2] = Float.floatToRawIntBits(f3);
        this.isGeometryInvalid = true;
        return this;
    }

    static {
        MutableQuadViewImpl$1 mutableQuadViewImpl$1 = new MutableQuadViewImpl$1();
        mutableQuadViewImpl$1.data = DEFAULT_QUAD_DATA;
        mutableQuadViewImpl$1.color(-1, -1, -1, -1);
        ((MutableQuadViewImpl)mutableQuadViewImpl$1).cullFace(null);
        ((MutableQuadViewImpl)mutableQuadViewImpl$1).renderLayer(null);
        ((MutableQuadViewImpl)mutableQuadViewImpl$1).diffuseShade(true);
        ((MutableQuadViewImpl)mutableQuadViewImpl$1).ambientOcclusion(TriState.DEFAULT);
        ((MutableQuadViewImpl)mutableQuadViewImpl$1).glint(null);
        ((MutableQuadViewImpl)mutableQuadViewImpl$1).tintIndex(-1);
    }

    public final void clear() {
        System.arraycopy(DEFAULT_QUAD_DATA, 0, this.data, this.baseIndex, EncodingFormat.TOTAL_STRIDE);
        this.isGeometryInvalid = true;
        this.nominalFace = null;
    }

    public final MutableQuadViewImpl normal(int n, float f, float f2, float f3) {
        this.normalFlags(this.normalFlags() | 1 << n);
        this.data[this.baseIndex + n * EncodingFormat.VERTEX_STRIDE + EncodingFormat.VERTEX_NORMAL] = NormalHelper.packNormal((float)f, (float)f2, (float)f3);
        return this;
    }

    public final MutableQuadViewImpl tag(int n) {
        this.data[this.baseIndex + 3] = n;
        return this;
    }

    public final MutableQuadViewImpl copyFrom(QuadView quadView) {
        QuadViewImpl quadViewImpl = (QuadViewImpl)quadView;
        System.arraycopy(quadViewImpl.data, quadViewImpl.baseIndex, this.data, this.baseIndex, EncodingFormat.TOTAL_STRIDE);
        this.nominalFace = quadViewImpl.nominalFace;
        this.isGeometryInvalid = quadViewImpl.isGeometryInvalid;
        if (!this.isGeometryInvalid) {
            this.faceNormal.set((Vector3fc)quadViewImpl.faceNormal);
        }
        return this;
    }

    public void popTransform() {
        this.transformStack.pop();
        if (this.transformStack.isEmpty()) {
            this.activeTransform = NO_TRANSFORM;
        } else if (this.transformStack.size() == 1) {
            this.activeTransform = (QuadTransform)this.transformStack.getFirst();
        }
    }

    public void pushTransform(QuadTransform quadTransform) {
        if (quadTransform == null) {
            throw new NullPointerException("QuadTransform cannot be null!");
        }
        this.transformStack.push((Object)quadTransform);
        if (this.transformStack.size() == 1) {
            this.activeTransform = quadTransform;
        } else if (this.transformStack.size() == 2) {
            this.activeTransform = this.stackTransform;
        }
    }

    public MutableQuadViewImpl glint(@Nullable class08915 class089152) {
        this.data[this.baseIndex + 0] = EncodingFormat.glint(this.data[this.baseIndex + 0], class089152);
        return this;
    }

    public MutableQuadViewImpl atlas(QuadAtlas quadAtlas) {
        this.data[this.baseIndex + 0] = EncodingFormat.quadAtlas(this.data[this.baseIndex + 0], quadAtlas);
        return this;
    }

    public final MutableQuadViewImpl emit() {
        this.transformAndEmit();
        this.clear();
        return this;
    }

    public final MutableQuadViewImpl uv(int n, float f, float f2) {
        int n2 = this.baseIndex + n * EncodingFormat.VERTEX_STRIDE + EncodingFormat.VERTEX_U;
        this.data[n2] = Float.floatToRawIntBits(f);
        this.data[n2 + 1] = Float.floatToRawIntBits(f2);
        return this;
    }

    public final void populateMissingNormals() {
        int n = this.normalFlags();
        if (n == 15) {
            return;
        }
        int n2 = this.packedFaceNormal();
        for (int i = 0; i < 4; ++i) {
            if ((n & 1 << i) != 0) continue;
            this.data[this.baseIndex + i * EncodingFormat.VERTEX_STRIDE + EncodingFormat.VERTEX_NORMAL] = n2;
        }
        this.normalFlags(15);
    }

    public MutableQuadViewImpl emissive(boolean bl) {
        this.data[this.baseIndex + 0] = EncodingFormat.emissive(this.data[this.baseIndex + 0], bl);
        return this;
    }

    public final MutableQuadViewImpl cullFace(@Nullable class07211 class072112) {
        this.data[this.baseIndex + 0] = EncodingFormat.cullFace(this.data[this.baseIndex + 0], class072112);
        this.nominalFace(class072112);
        return this;
    }

    public MutableQuadViewImpl shadeMode(ShadeMode shadeMode) {
        Objects.requireNonNull(shadeMode, "ShadeMode may not be null");
        this.data[this.baseIndex + 0] = EncodingFormat.shadeMode(this.data[this.baseIndex + 0], shadeMode);
        return this;
    }

    public final MutableQuadViewImpl lightmap(int n, int n2) {
        this.data[this.baseIndex + n * EncodingFormat.VERTEX_STRIDE + EncodingFormat.VERTEX_LIGHTMAP] = n2;
        return this;
    }

    public MutableQuadViewImpl renderLayer(@Nullable class08743 class087432) {
        this.data[this.baseIndex + 0] = EncodingFormat.renderLayer(this.data[this.baseIndex + 0], class087432);
        return this;
    }

    public final MutableQuadViewImpl nominalFace(@Nullable class07211 class072112) {
        this.nominalFace = class072112;
        return this;
    }

    public final MutableQuadViewImpl fromBakedQuad(class02022 class020222) {
        this.pos(0, class020222.y());
        this.pos(1, class020222.L());
        this.pos(2, class020222.u());
        this.pos(3, class020222.i());
        this.color(-1, -1, -1, -1);
        long l = class020222.R();
        long l2 = class020222.M();
        long l3 = class020222.B();
        long l4 = class020222.Z();
        this.uv(0, class04809.N((long)l), class04809.y((long)l));
        this.uv(1, class04809.N((long)l2), class04809.y((long)l2));
        this.uv(2, class04809.N((long)l3), class04809.y((long)l3));
        this.uv(3, class04809.N((long)l4), class04809.y((long)l4));
        int n = class020222.m();
        int n2 = class03042.N((int)n, (int)n);
        this.lightmap(n2, n2, n2, n2);
        this.normalFlags(0);
        this.nominalFace(class020222.U());
        this.emissive(n == 15);
        this.diffuseShade(class020222.W());
        QuadAtlas quadAtlas = QuadAtlas.of((class01894)class020222.E().method_45852());
        if (quadAtlas == null) {
            quadAtlas = QuadAtlas.BLOCK;
        }
        this.atlas(quadAtlas);
        this.tintIndex(class020222.z());
        return this;
    }

    protected abstract void emitDirectly();

    protected final void normalFlags(int n) {
        this.data[this.baseIndex + 0] = EncodingFormat.normalFlags(this.data[this.baseIndex + 0], n);
    }

    public MutableQuadViewImpl diffuseShade(boolean bl) {
        this.data[this.baseIndex + 0] = EncodingFormat.diffuseShade(this.data[this.baseIndex + 0], bl);
        return this;
    }

    public MutableQuadViewImpl ambientOcclusion(TriState triState) {
        Objects.requireNonNull(triState, "ambient occlusion TriState may not be null");
        this.data[this.baseIndex + 0] = EncodingFormat.ambientOcclusion(this.data[this.baseIndex + 0], triState);
        return this;
    }

    public final void transformAndEmit() {
        if (this.activeTransform.transform((MutableQuadView)this)) {
            this.emitDirectly();
        }
    }

    public final MutableQuadViewImpl tintIndex(int n) {
        this.data[this.baseIndex + 2] = n;
        return this;
    }
}

