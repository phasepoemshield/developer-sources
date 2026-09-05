/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.systems.GpuDevice
 *  com.mojang.blaze3d.systems.RenderSystem
 *  com.mojang.blaze3d.textures.TextureFormat
 *  minecraft.class01089
 *  minecraft.class01894
 *  minecraft.class06846
 *  minecraft.class08280
 *  minecraft.class08354
 *  minecraft.class08361
 *  minecraft.class08500
 */
package minecraft;

import com.mojang.blaze3d.systems.GpuDevice;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.textures.TextureFormat;
import java.io.IOException;
import minecraft.class01089;
import minecraft.class01894;
import minecraft.class06846;
import minecraft.class08280;
import minecraft.class08354;
import minecraft.class08361;
import minecraft.class08500;

public class class08998
extends class08361 {
    private static final String[] N = new String[]{"_1.png", "_3.png", "_5.png", "_4.png", "_0.png", "_2.png"};

    public class08998(class01894 class018942) {
        super(class018942);
    }

    public class08354 method_65809(class01089 class010892) throws IOException {
        class01894 class018942 = this.method_65859();
        try (class08354 class083542 = class08354.N((class01089)class010892, (class01894)class018942.M(N[0]));){
            int n = class083542.u().N();
            int n2 = class083542.u().y();
            class08280 class082802 = new class08280(n, n2 * 6, false);
            class083542.u().N(class082802, 0, 0, 0, 0, n, n2, false, true);
            for (int i = 1; i < 6; ++i) {
                try (class08354 class083543 = class08354.N((class01089)class010892, (class01894)class018942.M(N[i]));){
                    if (class083543.u().N() != n || class083543.u().y() != n2) {
                        throw new IOException("Image dimensions of cubemap '" + String.valueOf(class018942) + "' sides do not match: part 0 is " + n + "x" + n2 + ", but part " + i + " is " + class083543.u().N() + "x" + class083543.u().y());
                    }
                    class083543.u().N(class082802, 0, 0, 0, i * n2, n, n2, false, true);
                    continue;
                }
            }
            class08354 class083544 = new class08354(class082802, new class08500(true, false, class06846.field_64077, 0.0f));
            return class083544;
        }
    }

    protected void method_65856(class08280 class082802) {
        GpuDevice gpuDevice = RenderSystem.getDevice();
        int n = class082802.N();
        int n2 = class082802.y() / 6;
        this.close();
        this.field_56974 = gpuDevice.createTexture(() -> ((class01894)this.method_65859()).toString(), 21, TextureFormat.RGBA8, n, n2, 6, 1);
        this.field_60597 = gpuDevice.createTextureView(this.field_56974);
        for (int i = 0; i < 6; ++i) {
            gpuDevice.createCommandEncoder().writeToTexture(this.field_56974, class082802, 0, i, 0, 0, n, n2, 0, n2 * i);
        }
    }
}

