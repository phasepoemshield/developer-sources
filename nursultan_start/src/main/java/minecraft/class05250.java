/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.platform.TextureUtil
 *  com.mojang.blaze3d.systems.GpuDevice
 *  com.mojang.blaze3d.systems.RenderSystem
 *  com.mojang.blaze3d.textures.FilterMode
 *  com.mojang.blaze3d.textures.GpuTexture
 *  com.mojang.blaze3d.textures.TextureFormat
 *  minecraft.class01894
 *  minecraft.class03504
 *  minecraft.class03609
 *  minecraft.class08918
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.blaze3d.platform.TextureUtil;
import com.mojang.blaze3d.systems.GpuDevice;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.textures.FilterMode;
import com.mojang.blaze3d.textures.GpuTexture;
import com.mojang.blaze3d.textures.TextureFormat;
import java.nio.file.Path;
import java.util.function.Supplier;
import minecraft.class01894;
import minecraft.class03504;
import minecraft.class03609;
import minecraft.class05237;
import minecraft.class05247;
import minecraft.class05272;
import minecraft.class05276;
import minecraft.class08918;
import org.jspecify.annotations.Nullable;

public class class05250
extends class08918
implements class03609 {
    private static final int N = 256;
    private final class03504 y;
    private final boolean L;
    private final class05276 u;

    public class05250(Supplier<String> supplier, class03504 class035042, boolean bl) {
        this.L = bl;
        this.u = new class05276(0, 0, 256, 256);
        GpuDevice gpuDevice = RenderSystem.getDevice();
        this.field_56974 = gpuDevice.createTexture(supplier, 7, bl ? TextureFormat.RGBA8 : TextureFormat.RED8, 256, 256, 1, 1);
        this.field_63613 = RenderSystem.getSamplerCache().y(FilterMode.NEAREST);
        this.field_60597 = gpuDevice.createTextureView(this.field_56974);
        this.y = class035042;
    }

    public @Nullable class05272 N(class05247 class052472, class05237 class052372) {
        if (class052372.method_2033() != this.L) {
            return null;
        }
        class05276 class052762 = this.u.N(class052372);
        if (class052762 != null) {
            class052372.method_2030(class052762.N, class052762.y, this.method_68004());
            float f = 256.0f;
            float f2 = 256.0f;
            float f3 = 0.01f;
            return new class05272(class052472, this.y, this.method_71659(), ((float)class052762.N + 0.01f) / 256.0f, ((float)class052762.N - 0.01f + (float)class052372.method_2031()) / 256.0f, ((float)class052762.y + 0.01f) / 256.0f, ((float)class052762.y - 0.01f + (float)class052372.method_2032()) / 256.0f, class052372.N(), class052372.y(), class052372.L(), class052372.u());
        }
        return null;
    }

    public void method_49712(class01894 class018942, Path path) {
        if (this.field_56974 == null) {
            return;
        }
        String string = class018942.L();
        TextureUtil.writeAsPNG((Path)path, (String)string, (GpuTexture)this.field_56974, (int)0, n -> (n & 0xFF000000) == 0 ? -16777216 : n);
    }
}

