/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.vertex.VertexFormat
 *  minecraft.class01391
 *  net.caffeinemc.mods.sodium.api.vertex.buffer.VertexBufferWriter
 *  org.lwjgl.system.MemoryStack
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package minecraft;

import com.mojang.blaze3d.vertex.VertexFormat;
import minecraft.class01391;
import net.caffeinemc.mods.sodium.api.vertex.buffer.VertexBufferWriter;
import org.lwjgl.system.MemoryStack;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

class class05886
implements class01391,
VertexBufferWriter {
    private final class01391 N;
    private final class01391 y;
    private boolean L;

    public class05886(class01391 class013912, class01391 class013913) {
        if (class013912 == class013913) {
            throw new IllegalArgumentException("Duplicate delegates");
        }
        this.N = class013912;
        this.y = class013913;
        this.N(null);
    }

    public void push(MemoryStack memoryStack, long l, int n, VertexFormat vertexFormat) {
        VertexBufferWriter.copyInto((VertexBufferWriter)VertexBufferWriter.of((class01391)this.N), (MemoryStack)memoryStack, (long)l, (int)n, (VertexFormat)vertexFormat);
        VertexBufferWriter.copyInto((VertexBufferWriter)VertexBufferWriter.of((class01391)this.y), (MemoryStack)memoryStack, (long)l, (int)n, (VertexFormat)vertexFormat);
    }

    public void N(float f, float f2, float f3, int n, float f4, float f5, int n2, int n3, float f6, float f7, float f8) {
        this.N.N(f, f2, f3, n, f4, f5, n2, n3, f6, f7, f8);
        this.y.N(f, f2, f3, n, f4, f5, n2, n3, f6, f7, f8);
    }

    private void N(CallbackInfo callbackInfo) {
        this.L = VertexBufferWriter.tryOf((class01391)this.N) != null && VertexBufferWriter.tryOf((class01391)this.y) != null;
    }

    public class01391 method_1336(int n, int n2, int n3, int n4) {
        this.N.method_1336(n, n2, n3, n4);
        this.y.method_1336(n, n2, n3, n4);
        return this;
    }

    public class01391 method_22913(float f, float f2) {
        this.N.method_22913(f, f2);
        this.y.method_22913(f, f2);
        return this;
    }

    public boolean canUseIntrinsics() {
        return this.L;
    }

    public class01391 method_22912(float f, float f2, float f3) {
        this.N.method_22912(f, f2, f3);
        this.y.method_22912(f, f2, f3);
        return this;
    }

    public class01391 method_39415(int n) {
        this.N.method_39415(n);
        this.y.method_39415(n);
        return this;
    }

    public class01391 method_22914(float f, float f2, float f3) {
        this.N.method_22914(f, f2, f3);
        this.y.method_22914(f, f2, f3);
        return this;
    }

    public class01391 method_60796(int n, int n2) {
        this.N.method_60796(n, n2);
        this.y.method_60796(n, n2);
        return this;
    }

    public class01391 method_22921(int n, int n2) {
        this.N.method_22921(n, n2);
        this.y.method_22921(n, n2);
        return this;
    }

    public class01391 method_75298(float f) {
        this.N.method_75298(f);
        this.y.method_75298(f);
        return this;
    }
}

