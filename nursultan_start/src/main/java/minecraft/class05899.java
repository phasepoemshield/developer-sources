/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.vertex.VertexFormat
 *  com.mojang.blaze3d.vertex.VertexFormatElement
 *  minecraft.class01391
 *  minecraft.class08388
 *  net.caffeinemc.mods.sodium.api.vertex.attributes.common.TextureAttribute
 *  net.caffeinemc.mods.sodium.api.vertex.buffer.VertexBufferWriter
 *  org.lwjgl.system.MemoryStack
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package minecraft;

import com.mojang.blaze3d.vertex.VertexFormat;
import com.mojang.blaze3d.vertex.VertexFormatElement;
import minecraft.class01391;
import minecraft.class08388;
import net.caffeinemc.mods.sodium.api.vertex.attributes.common.TextureAttribute;
import net.caffeinemc.mods.sodium.api.vertex.buffer.VertexBufferWriter;
import org.lwjgl.system.MemoryStack;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class class05899
implements class01391,
VertexBufferWriter {
    private final class01391 N;
    private final class08388 y;
    private boolean L;
    private float u;
    private float i;
    private float R;
    private float M;

    public class05899(class01391 class013912, class08388 class083882) {
        this.N = class013912;
        this.y = class083882;
        this.N(class013912, class083882, null);
    }

    public void push(MemoryStack memoryStack, long l, int n, VertexFormat vertexFormat) {
        class05899.N(l, n, vertexFormat, this.u, this.i, this.R, this.M);
        VertexBufferWriter.of((class01391)this.N).push(memoryStack, l, n, vertexFormat);
    }

    public void N(float f, float f2, float f3, int n, float f4, float f5, int n2, int n3, float f6, float f7, float f8) {
        this.N.N(f, f2, f3, n, this.y.method_4580(f4), this.y.method_4570(f5), n2, n3, f6, f7, f8);
    }

    private static void N(long l, int n, VertexFormat vertexFormat, float f, float f2, float f3, float f4) {
        long l2 = vertexFormat.getVertexSize();
        long l3 = vertexFormat.getOffset(VertexFormatElement.UV0);
        float f5 = f3 - f;
        float f6 = f4 - f2;
        for (int i = 0; i < n; ++i) {
            float f7 = TextureAttribute.getU((long)(l + l3));
            float f8 = TextureAttribute.getV((long)(l + l3));
            float f9 = f + f5 * f7;
            float f10 = f2 + f6 * f8;
            TextureAttribute.put((long)(l + l3), (float)f9, (float)f10);
            l += l2;
        }
    }

    private void N(class01391 class013912, class08388 class083882, CallbackInfo callbackInfo) {
        this.u = class083882.method_4594();
        this.i = class083882.method_4593();
        this.R = class083882.method_4577();
        this.M = class083882.method_4575();
        this.L = VertexBufferWriter.tryOf((class01391)this.N) != null;
    }

    public class01391 method_1336(int n, int n2, int n3, int n4) {
        return this.N.method_1336(n, n2, n3, n4);
    }

    public class01391 method_22913(float f, float f2) {
        return this.N.method_22913(this.y.method_4580(f), this.y.method_4570(f2));
    }

    public boolean canUseIntrinsics() {
        return this.L;
    }

    public class01391 method_22912(float f, float f2, float f3) {
        return this.N.method_22912(f, f2, f3);
    }

    public class01391 method_39415(int n) {
        return this.N.method_39415(n);
    }

    public class01391 method_22914(float f, float f2, float f3) {
        return this.N.method_22914(f, f2, f3);
    }

    public class01391 method_60796(int n, int n2) {
        return this.N.method_60796(n, n2);
    }

    public class01391 method_22921(int n, int n2) {
        return this.N.method_22921(n, n2);
    }

    public class01391 method_75298(float f) {
        this.N.method_75298(f);
        return this;
    }
}

