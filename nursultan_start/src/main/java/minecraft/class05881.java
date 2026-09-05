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
import java.util.Objects;
import java.util.function.Consumer;
import minecraft.class01391;
import net.caffeinemc.mods.sodium.api.vertex.buffer.VertexBufferWriter;
import org.lwjgl.system.MemoryStack;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

/*
 * Signature claims super is java.lang.Record, not java.lang.Object - discarding signature.
 */
final class class05881
implements class01391,
VertexBufferWriter {
    private class01391[] delegates;
    private boolean y;

    class05881(class01391[] class01391Array) {
        for (int i = 0; i < class01391Array.length; ++i) {
            for (int j = i + 1; j < class01391Array.length; ++j) {
                if (class01391Array[i] != class01391Array[j]) continue;
                throw new IllegalArgumentException("Duplicate delegates");
            }
        }
        this.delegates = class01391Array;
        this.N((CallbackInfo)null);
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        return object instanceof class05881 && Objects.equals(this.delegates, ((class05881)object).delegates);
    }

    public final String toString() {
        return "class05881[delegates=" + Objects.toString(this.delegates) + "]";
    }

    public final int hashCode() {
        return 0 * 31 + Objects.hashCode(this.delegates);
    }

    private boolean y() {
        class01391[] class01391Array = this.delegates;
        int n = class01391Array.length;
        for (int i = 0; i < n; ++i) {
            if (VertexBufferWriter.tryOf((class01391)class01391Array[i]) != null) continue;
            return false;
        }
        return true;
    }

    public void push(MemoryStack memoryStack, long l, int n, VertexFormat vertexFormat) {
        class01391[] class01391Array = this.delegates;
        int n2 = class01391Array.length;
        for (int i = 0; i < n2; ++i) {
            VertexBufferWriter.copyInto((VertexBufferWriter)VertexBufferWriter.of((class01391)class01391Array[i]), (MemoryStack)memoryStack, (long)l, (int)n, (VertexFormat)vertexFormat);
        }
    }

    public class01391[] N() {
        return this.delegates;
    }

    private void N(Consumer<class01391> consumer) {
        for (class01391 class013912 : this.delegates) {
            consumer.accept(class013912);
        }
    }

    private void N(CallbackInfo callbackInfo) {
        this.y = this.y();
    }

    public void N(float f, float f2, float f3, int n, float f4, float f5, int n2, int n3, float f6, float f7, float f8) {
        this.N((class01391 class013912) -> class013912.N(f, f2, f3, n, f4, f5, n2, n3, f6, f7, f8));
    }

    public class01391 method_1336(int n, int n2, int n3, int n4) {
        this.N((class01391 class013912) -> class013912.method_1336(n, n2, n3, n4));
        return this;
    }

    public class01391 method_22913(float f, float f2) {
        this.N((class01391 class013912) -> class013912.method_22913(f, f2));
        return this;
    }

    public boolean canUseIntrinsics() {
        return this.y;
    }

    public class01391 method_22912(float f, float f2, float f3) {
        this.N((class01391 class013912) -> class013912.method_22912(f, f2, f3));
        return this;
    }

    public class01391 method_39415(int n) {
        this.N((class01391 class013912) -> class013912.method_39415(n));
        return this;
    }

    public class01391 method_22914(float f, float f2, float f3) {
        this.N((class01391 class013912) -> class013912.method_22914(f, f2, f3));
        return this;
    }

    public class01391 method_60796(int n, int n2) {
        this.N((class01391 class013912) -> class013912.method_60796(n, n2));
        return this;
    }

    public class01391 method_22921(int n, int n2) {
        this.N((class01391 class013912) -> class013912.method_22921(n, n2));
        return this;
    }

    public class01391 method_75298(float f) {
        this.N((class01391 class013912) -> class013912.method_75298(f));
        return this;
    }
}

