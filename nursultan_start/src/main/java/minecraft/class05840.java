/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.systems.RenderSystem
 *  com.mojang.blaze3d.textures.GpuTexture
 *  minecraft.class05237
 *  minecraft.class08247
 *  minecraft.class08280
 *  org.lwjgl.util.freetype.FT_Face
 */
package minecraft;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.textures.GpuTexture;
import minecraft.class05237;
import minecraft.class05861;
import minecraft.class08247;
import minecraft.class08280;
import org.lwjgl.util.freetype.FT_Face;

class class05840
implements class05237 {
    final /* synthetic */ class05861 N;

    class05840(class05861 class058612) {
        this.N = class058612;
    }

    public float i() {
        return this.N.L;
    }

    public float R() {
        return this.N.u;
    }

    public int method_2031() {
        return this.N.N;
    }

    public int method_2032() {
        return this.N.y;
    }

    public void method_2030(int n, int n2, GpuTexture gpuTexture) {
        FT_Face fT_Face = this.N.R.y();
        try (class08280 class082802 = new class08280(class08247.field_4998, this.N.N, this.N.y, false);){
            if (class082802.N(fT_Face, this.N.i)) {
                RenderSystem.getDevice().createCommandEncoder().writeToTexture(gpuTexture, class082802, 0, 0, n, n2, this.N.N, this.N.y, 0, 0);
            }
        }
    }

    public boolean method_2033() {
        return false;
    }

    public float method_2035() {
        return this.N.R.N;
    }
}

