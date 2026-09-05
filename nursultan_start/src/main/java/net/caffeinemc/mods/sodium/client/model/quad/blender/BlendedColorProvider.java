/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class04995
 *  minecraft.class07209
 *  minecraft.class07218
 *  net.caffeinemc.mods.sodium.api.util.ColorMixer
 *  net.caffeinemc.mods.sodium.client.world.LevelSlice
 */
package net.caffeinemc.mods.sodium.client.model.quad.blender;

import minecraft.class04995;
import minecraft.class07209;
import minecraft.class07218;
import net.caffeinemc.mods.sodium.api.util.ColorMixer;
import net.caffeinemc.mods.sodium.client.model.color.ColorProvider;
import net.caffeinemc.mods.sodium.client.model.quad.ModelQuadView;
import net.caffeinemc.mods.sodium.client.world.LevelSlice;

public abstract class BlendedColorProvider<T>
implements ColorProvider<T> {
    protected abstract int getColor(LevelSlice var1, T var2, class07209 var3);

    private int getVertexColor(LevelSlice levelSlice, class07209 class072092, class07218 class072182, ModelQuadView modelQuadView, T t, int n) {
        float f = modelQuadView.getX(n) - 0.5f;
        float f2 = modelQuadView.getY(n) - 0.5f;
        float f3 = modelQuadView.getZ(n) - 0.5f;
        int n2 = class04995.y((float)f);
        int n3 = class04995.y((float)f2);
        int n4 = class04995.y((float)f3);
        float f4 = f - (float)n2;
        float f5 = f2 - (float)n3;
        float f6 = f3 - (float)n4;
        int n5 = class072092.method_10263() + n2;
        int n6 = class072092.method_10264() + n3;
        int n7 = class072092.method_10260() + n4;
        int n8 = this.getColor(levelSlice, t, (class07209)class072182.N(n5 + 0, n6, n7 + 0));
        int n9 = this.getColor(levelSlice, t, (class07209)class072182.N(n5 + 0, n6, n7 + 1));
        int n10 = this.getColor(levelSlice, t, (class07209)class072182.N(n5 + 1, n6, n7 + 0));
        int n11 = this.getColor(levelSlice, t, (class07209)class072182.N(n5 + 1, n6, n7 + 1));
        return ColorMixer.mix2d((int)n8, (int)n9, (int)n10, (int)n11, (float)f4, (float)f6);
    }

    @Override
    public void getColors(LevelSlice levelSlice, class07209 class072092, class07218 class072182, T t, ModelQuadView modelQuadView, int[] nArray, boolean bl) {
        if (bl) {
            for (int i = 0; i < 4; ++i) {
                nArray[i] = this.getVertexColor(levelSlice, class072092, class072182, modelQuadView, t, i);
            }
        } else {
            int n = this.getColor(levelSlice, t, class072092);
            for (int i = 0; i < 4; ++i) {
                nArray[i] = n;
            }
        }
    }
}

