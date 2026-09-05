/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.systems.GpuDevice
 *  com.mojang.blaze3d.systems.RenderSystem
 *  com.mojang.blaze3d.textures.FilterMode
 *  com.mojang.blaze3d.textures.TextureFormat
 *  com.mojang.logging.LogUtils
 *  minecraft.class01894
 *  minecraft.class03609
 *  minecraft.class08280
 *  minecraft.class08918
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
package minecraft;

import com.mojang.blaze3d.systems.GpuDevice;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.textures.FilterMode;
import com.mojang.blaze3d.textures.TextureFormat;
import com.mojang.logging.LogUtils;
import java.io.IOException;
import java.nio.file.Path;
import java.util.function.Supplier;
import minecraft.class01894;
import minecraft.class03609;
import minecraft.class08280;
import minecraft.class08918;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class class08829
extends class08918
implements class03609 {
    private static final Logger field_25794 = LogUtils.getLogger();
    private @Nullable class08280 field_5200;

    public class08829(Supplier<String> supplier, int n, int n2, boolean bl) {
        this.field_5200 = new class08280(n, n2, bl);
        this.method_71142(supplier);
    }

    public class08829(String string, int n, int n2, boolean bl) {
        this.field_5200 = new class08280(n, n2, bl);
        this.method_71141(string);
    }

    public class08829(Supplier<String> supplier, class08280 class082802) {
        this.field_5200 = class082802;
        this.method_71142(supplier);
        this.method_4524();
    }

    public void close() {
        if (this.field_5200 != null) {
            this.field_5200.close();
            this.field_5200 = null;
        }
        super.close();
    }

    public void method_4526(class08280 class082802) {
        if (this.field_5200 != null) {
            this.field_5200.close();
        }
        this.field_5200 = class082802;
    }

    public void method_49712(class01894 class018942, Path path) throws IOException {
        if (this.field_5200 != null) {
            String string = class018942.L() + ".png";
            Path path2 = path.resolve(string);
            this.field_5200.N(path2);
        }
    }

    private void method_71141(String string) {
        GpuDevice gpuDevice = RenderSystem.getDevice();
        this.field_56974 = gpuDevice.createTexture(string, 5, TextureFormat.RGBA8, this.field_5200.N(), this.field_5200.y(), 1, 1);
        this.field_63613 = RenderSystem.getSamplerCache().y(FilterMode.NEAREST);
        this.field_60597 = gpuDevice.createTextureView(this.field_56974);
    }

    private void method_71142(Supplier<String> supplier) {
        GpuDevice gpuDevice = RenderSystem.getDevice();
        this.field_56974 = gpuDevice.createTexture(supplier, 5, TextureFormat.RGBA8, this.field_5200.N(), this.field_5200.y(), 1, 1);
        this.field_63613 = RenderSystem.getSamplerCache().y(FilterMode.NEAREST);
        this.field_60597 = gpuDevice.createTextureView(this.field_56974);
    }

    public void method_4524() {
        if (this.field_5200 != null && this.field_56974 != null) {
            RenderSystem.getDevice().createCommandEncoder().writeToTexture(this.field_56974, this.field_5200);
        } else {
            field_25794.warn("Trying to upload disposed texture {}", (Object)this.method_68004().getLabel());
        }
    }

    public @Nullable class08280 method_4525() {
        return this.field_5200;
    }
}

