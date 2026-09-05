/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.vertex.VertexFormat
 *  com.mojang.blaze3d.vertex.VertexFormatElement
 *  net.caffeinemc.mods.sodium.api.util.ColorARGB
 *  net.caffeinemc.mods.sodium.api.vertex.attributes.common.ColorAttribute
 *  net.caffeinemc.mods.sodium.api.vertex.buffer.VertexBufferWriter
 *  org.lwjgl.system.MemoryStack
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package minecraft;

import com.mojang.blaze3d.vertex.VertexFormat;
import com.mojang.blaze3d.vertex.VertexFormatElement;
import java.util.Objects;
import minecraft.class01391;
import net.caffeinemc.mods.sodium.api.util.ColorARGB;
import net.caffeinemc.mods.sodium.api.vertex.attributes.common.ColorAttribute;
import net.caffeinemc.mods.sodium.api.vertex.buffer.VertexBufferWriter;
import org.lwjgl.system.MemoryStack;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

/*
 * Signature claims super is java.lang.Record, not java.lang.Object - discarding signature.
 */
final class class01456
implements class01391,
VertexBufferWriter {
    private class01391 delegate;
    private int color;
    private boolean L;

    class01456(class01391 class013912, int n) {
        this.delegate = class013912;
        this.color = n;
        this.N(null);
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        return object instanceof class01456 && Objects.equals(this.delegate, ((class01456)object).delegate) && this.color == ((class01456)object).color;
    }

    public final String toString() {
        return "class01456[delegate=" + Objects.toString(this.delegate) + ", color=" + Integer.toString(this.color) + "]";
    }

    public final int hashCode() {
        return (0 * 31 + Objects.hashCode(this.delegate)) * 31 + Integer.hashCode(this.color);
    }

    public int y() {
        return this.color;
    }

    public void push(MemoryStack memoryStack, long l, int n, VertexFormat vertexFormat) {
        class01456.N(l, n, vertexFormat, this.color);
        VertexBufferWriter.of((class01391)this.delegate).push(memoryStack, l, n, vertexFormat);
    }

    private static void N(long l, int n, VertexFormat vertexFormat, int n2) {
        long l2 = vertexFormat.getVertexSize();
        long l3 = vertexFormat.getOffset(VertexFormatElement.COLOR);
        for (int i = 0; i < n; ++i) {
            ColorAttribute.set((long)(l + l3), (int)ColorARGB.toABGR((int)n2));
            l += l2;
        }
    }

    public class01391 N() {
        return this.delegate;
    }

    private void N(CallbackInfo callbackInfo) {
        this.L = VertexBufferWriter.tryOf((class01391)this.delegate) != null;
    }

    @Override
    public class01391 method_1336(int n, int n2, int n3, int n4) {
        return this;
    }

    @Override
    public class01391 method_22913(float f, float f2) {
        this.delegate.method_22913(f, f2);
        return this;
    }

    public boolean canUseIntrinsics() {
        return this.L;
    }

    @Override
    public class01391 method_22912(float f, float f2, float f3) {
        this.delegate.method_22912(f, f2, f3).method_39415(this.color);
        return this;
    }

    @Override
    public class01391 method_39415(int n) {
        return this;
    }

    @Override
    public class01391 method_22914(float f, float f2, float f3) {
        return this;
    }

    @Override
    public class01391 method_60796(int n, int n2) {
        return this;
    }

    @Override
    public class01391 method_22921(int n, int n2) {
        return this;
    }

    @Override
    public class01391 method_75298(float f) {
        return this;
    }
}

