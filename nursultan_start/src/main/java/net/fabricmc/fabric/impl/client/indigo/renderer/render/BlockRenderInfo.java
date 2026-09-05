/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00500
 *  minecraft.class00753
 *  minecraft.class00891
 *  minecraft.class01587
 *  minecraft.class05885
 *  minecraft.class06202
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07218
 *  minecraft.class07295
 *  minecraft.class08743
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.api.util.TriState
 *  org.jspecify.annotations.Nullable
 */
package net.fabricmc.fabric.impl.client.indigo.renderer.render;

import minecraft.class00500;
import minecraft.class00753;
import minecraft.class00891;
import minecraft.class01587;
import minecraft.class05885;
import minecraft.class06202;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07218;
import minecraft.class07295;
import minecraft.class08743;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.util.TriState;
import org.jspecify.annotations.Nullable;

@Environment(value=EnvType.CLIENT)
public class BlockRenderInfo {
    private final class01587 blockColorMap = class06202.Nq().d();
    private final class07218 searchPos = new class07218();
    public class07295 blockView;
    public class07209 blockPos;
    public class00500 blockState;
    private boolean useAo;
    private boolean defaultAo;
    private class08743 defaultLayer;
    private boolean enableCulling;
    private int cullCompletionFlags;
    private int cullResultFlags;

    public void release() {
        this.blockView = null;
        this.blockPos = null;
        this.blockState = null;
    }

    public class08743 effectiveRenderLayer(@Nullable class08743 class087432) {
        return class087432 == null ? this.defaultLayer : class087432;
    }

    public boolean shouldDrawSide(@Nullable class07211 class072112) {
        if (class072112 == null || !this.enableCulling) {
            return true;
        }
        int n = 1 << class072112.L();
        if ((this.cullCompletionFlags & n) == 0) {
            this.cullCompletionFlags |= n;
            if (class00891.N((class00500)this.blockState, (class00500)this.blockView.method_8320((class07209)this.searchPos.N((class00753)this.blockPos, class072112)), (class07211)class072112)) {
                this.cullResultFlags |= n;
                return true;
            }
            return false;
        }
        return (this.cullResultFlags & n) != 0;
    }

    public boolean effectiveAo(TriState triState) {
        return this.useAo && triState.orElse(this.defaultAo);
    }

    public boolean shouldCullSide(@Nullable class07211 class072112) {
        return !this.shouldDrawSide(class072112);
    }

    public void prepareForWorld(class07295 class072952, boolean bl) {
        this.blockView = class072952;
        this.enableCulling = bl;
    }

    public void prepareForBlock(class07209 class072092, class00500 class005002) {
        this.blockPos = class072092;
        this.blockState = class005002;
        this.useAo = class06202.yb();
        this.defaultAo = this.useAo && class005002.m() == 0;
        this.defaultLayer = class05885.N((class00500)class005002);
        this.cullCompletionFlags = 0;
        this.cullResultFlags = 0;
    }

    public int blockColor(int n) {
        return 0xFF000000 | this.blockColorMap.N(this.blockState, this.blockView, this.blockPos, n);
    }
}

