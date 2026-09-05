/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class00500
 *  minecraft.class00999
 *  minecraft.class01028
 *  minecraft.class01421
 *  minecraft.class01583
 *  minecraft.class01686
 *  minecraft.class02022
 *  minecraft.class03662
 *  minecraft.class05436
 *  minecraft.class06271
 *  minecraft.class06889
 *  minecraft.class06959
 *  minecraft.class07311
 *  minecraft.class08141
 *  minecraft.class08388
 *  minecraft.class08453
 *  minecraft.class08800
 *  minecraft.class08804
 *  minecraft.class08887
 *  minecraft.class08915
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.api.renderer.v1.render.FabricRenderCommandQueue
 *  net.fabricmc.fabric.mixin.renderer.client.block.render.OrderedSubmitNodeCollectorMixin
 *  org.joml.Quaternionf
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.util.List;
import minecraft.class00392;
import minecraft.class00500;
import minecraft.class00999;
import minecraft.class01028;
import minecraft.class01421;
import minecraft.class01583;
import minecraft.class01686;
import minecraft.class02022;
import minecraft.class03662;
import minecraft.class05436;
import minecraft.class06271;
import minecraft.class06889;
import minecraft.class06959;
import minecraft.class07311;
import minecraft.class07942;
import minecraft.class08141;
import minecraft.class08388;
import minecraft.class08453;
import minecraft.class08800;
import minecraft.class08804;
import minecraft.class08887;
import minecraft.class08915;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.renderer.v1.render.FabricRenderCommandQueue;
import net.fabricmc.fabric.mixin.renderer.client.block.render.OrderedSubmitNodeCollectorMixin;
import org.joml.Quaternionf;
import org.jspecify.annotations.Nullable;

@Environment(value=EnvType.CLIENT)
public interface class07926
extends FabricRenderCommandQueue,
OrderedSubmitNodeCollectorMixin {
    public void N(class01421 var1, class07942 var2);

    public void N(class01421 var1, class00500 var2, int var3, int var4, int var5);

    public void N(class01686 var1, class01421 var2, class07311 var3, int var4, int var5, @Nullable class08388 var6, boolean var7, boolean var8, int var9, @Nullable class08141 var10, int var11);

    default public void N(class01686 class016862, class01421 class014212, class07311 class073112, int n, int n2, @Nullable class08388 class083882, boolean bl, boolean bl2) {
        this.N(class016862, class014212, class073112, n, n2, class083882, bl, bl2, -1, null, 0);
    }

    default public void N(class01686 class016862, class01421 class014212, class07311 class073112, int n, int n2, @Nullable class08388 class083882, int n3, @Nullable class08141 class081412) {
        this.N(class016862, class014212, class073112, n, n2, class083882, false, false, n3, class081412, 0);
    }

    public void N(class05436 var1);

    public void N(class01421 var1, class07311 var2, class00999 var3);

    public void N(class01421 var1, class03662 var2, int var3, int var4, int var5, int[] var6, List<class02022> var7, class07311 var8, class08915 var9);

    public void N(class01421 var1, class07311 var2, class08887 var3, float var4, float var5, float var6, int var7, int var8, int var9);

    public void N(class01421 var1, class08800 var2, Quaternionf var3);

    public void N(class01421 var1, float var2, float var3, class01028 var4, boolean var5, class01583 var6, int var7, int var8, int var9, int var10);

    public void N(class01421 var1, @Nullable class06889 var2, int var3, class00392 var4, boolean var5, int var6, double var7, class06959 var9);

    public void N(class01421 var1, float var2, List<class08453> var3);

    default public void N(class01686 class016862, class01421 class014212, class07311 class073112, int n, int n2, @Nullable class08388 class083882) {
        this.N(class016862, class014212, class073112, n, n2, class083882, false, false, -1, null, 0);
    }

    default public <S> void N(class06271<? super S> class062712, S s, class01421 class014212, class07311 class073112, int n, int n2, int n3, @Nullable class08141 class081412) {
        this.N(class062712, s, class014212, class073112, n, n2, -1, null, n3, class081412);
    }

    public <S> void N(class06271<? super S> var1, S var2, class01421 var3, class07311 var4, int var5, int var6, int var7, @Nullable class08388 var8, int var9, @Nullable class08141 var10);

    public void N(class01421 var1, class08804 var2);
}

