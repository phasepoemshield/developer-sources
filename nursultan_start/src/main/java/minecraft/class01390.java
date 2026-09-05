/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.vertex.VertexFormat
 *  com.mojang.blaze3d.vertex.VertexFormatElement
 *  minecraft.class07211
 *  net.caffeinemc.mods.sodium.api.util.ColorABGR
 *  net.caffeinemc.mods.sodium.api.util.NormI8
 *  net.caffeinemc.mods.sodium.api.vertex.attributes.common.ColorAttribute
 *  net.caffeinemc.mods.sodium.api.vertex.attributes.common.TextureAttribute
 *  net.caffeinemc.mods.sodium.api.vertex.buffer.VertexBufferWriter
 *  org.joml.Matrix3f
 *  org.joml.Matrix3fc
 *  org.joml.Matrix4f
 *  org.joml.Matrix4fc
 *  org.joml.Quaternionfc
 *  org.joml.Vector3f
 *  org.joml.Vector4f
 *  org.lwjgl.system.MemoryStack
 *  org.lwjgl.system.MemoryUtil
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package minecraft;

import com.mojang.blaze3d.vertex.VertexFormat;
import com.mojang.blaze3d.vertex.VertexFormatElement;
import minecraft.class01391;
import minecraft.class01423;
import minecraft.class07211;
import net.caffeinemc.mods.sodium.api.util.ColorABGR;
import net.caffeinemc.mods.sodium.api.util.NormI8;
import net.caffeinemc.mods.sodium.api.vertex.attributes.common.ColorAttribute;
import net.caffeinemc.mods.sodium.api.vertex.attributes.common.TextureAttribute;
import net.caffeinemc.mods.sodium.api.vertex.buffer.VertexBufferWriter;
import org.joml.Matrix3f;
import org.joml.Matrix3fc;
import org.joml.Matrix4f;
import org.joml.Matrix4fc;
import org.joml.Quaternionfc;
import org.joml.Vector3f;
import org.joml.Vector4f;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class class01390
implements class01391,
VertexBufferWriter {
    private final class01391 N;
    private final Matrix4f y;
    private final Matrix3f L;
    private final float u;
    private final Vector3f i = new Vector3f();
    private final Vector3f R = new Vector3f();
    private float M;
    private float B;
    private float Z;
    private boolean z;

    public class01390(class01391 class013912, class01423 class014232, float f) {
        this.N = class013912;
        this.y = new Matrix4f((Matrix4fc)class014232.N()).invert();
        this.L = new Matrix3f((Matrix3fc)class014232.y()).invert();
        this.u = f;
        this.N(null);
    }

    public void push(MemoryStack memoryStack, long l, int n, VertexFormat vertexFormat) {
        class01390.N(l, n, vertexFormat, this.L, this.y, this.u);
        VertexBufferWriter.of((class01391)this.N).push(memoryStack, l, n, vertexFormat);
    }

    private static void N(long l, int n, VertexFormat vertexFormat, Matrix3f matrix3f, Matrix4f matrix4f, float f) {
        long l2 = vertexFormat.getVertexSize();
        int n2 = vertexFormat.getOffset(VertexFormatElement.POSITION);
        int n3 = vertexFormat.getOffset(VertexFormatElement.COLOR);
        int n4 = vertexFormat.getOffset(VertexFormatElement.NORMAL);
        int n5 = vertexFormat.getOffset(VertexFormatElement.UV0);
        int n6 = ColorABGR.pack((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        Vector3f vector3f = new Vector3f(Float.NaN);
        Vector4f vector4f = new Vector4f(Float.NaN);
        for (int i = 0; i < n; ++i) {
            vector4f.x = MemoryUtil.memGetFloat((long)(l + (long)n2 + 0L));
            vector4f.y = MemoryUtil.memGetFloat((long)(l + (long)n2 + 4L));
            vector4f.z = MemoryUtil.memGetFloat((long)(l + (long)n2 + 8L));
            vector4f.w = 1.0f;
            int n7 = MemoryUtil.memGetInt((long)(l + (long)n4));
            vector3f.x = NormI8.unpackX((int)n7);
            vector3f.y = NormI8.unpackY((int)n7);
            vector3f.z = NormI8.unpackZ((int)n7);
            Vector3f vector3f2 = matrix3f.transform(vector3f);
            class07211 class072112 = class07211.N((float)vector3f2.x(), (float)vector3f2.y(), (float)vector3f2.z());
            Vector4f vector4f2 = matrix4f.transform(vector4f);
            vector4f2.rotateY((float)Math.PI);
            vector4f2.rotateX(-1.5707964f);
            vector4f2.rotate((Quaternionfc)class072112.y());
            float f2 = -vector4f2.x() * f;
            float f3 = -vector4f2.y() * f;
            ColorAttribute.set((long)(l + (long)n3), (int)n6);
            TextureAttribute.put((long)(l + (long)n5), (float)f2, (float)f3);
            l += l2;
        }
    }

    private void N(CallbackInfo callbackInfo) {
        this.z = VertexBufferWriter.tryOf((class01391)this.N) != null;
    }

    @Override
    public class01391 method_1336(int n, int n2, int n3, int n4) {
        this.N.method_39415(-1);
        return this;
    }

    @Override
    public class01391 method_22913(float f, float f2) {
        return this;
    }

    public boolean canUseIntrinsics() {
        return this.z;
    }

    @Override
    public class01391 method_22912(float f, float f2, float f3) {
        this.M = f;
        this.B = f2;
        this.Z = f3;
        this.N.method_22912(f, f2, f3);
        return this;
    }

    @Override
    public class01391 method_39415(int n) {
        this.N.method_39415(-1);
        return this;
    }

    @Override
    public class01391 method_22914(float f, float f2, float f3) {
        this.N.method_22914(f, f2, f3);
        Vector3f vector3f = this.L.transform(f, f2, f3, this.R);
        class07211 class072112 = class07211.N((float)vector3f.x(), (float)vector3f.y(), (float)vector3f.z());
        Vector3f vector3f2 = this.y.transformPosition(this.M, this.B, this.Z, this.i);
        vector3f2.rotateY((float)Math.PI);
        vector3f2.rotateX(-1.5707964f);
        vector3f2.rotate((Quaternionfc)class072112.y());
        this.N.method_22913(-vector3f2.x() * this.u, -vector3f2.y() * this.u);
        return this;
    }

    @Override
    public class01391 method_60796(int n, int n2) {
        this.N.method_60796(n, n2);
        return this;
    }

    @Override
    public class01391 method_22921(int n, int n2) {
        this.N.method_22921(n, n2);
        return this;
    }

    @Override
    public class01391 method_75298(float f) {
        this.N.method_75298(f);
        return this;
    }
}

