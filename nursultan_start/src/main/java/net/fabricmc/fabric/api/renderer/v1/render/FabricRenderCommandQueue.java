/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00500
 *  minecraft.class01421
 *  minecraft.class05885
 *  minecraft.class07209
 *  minecraft.class07295
 *  minecraft.class07311
 *  minecraft.class07926
 *  minecraft.class08743
 *  minecraft.class08887
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 */
package net.fabricmc.fabric.api.renderer.v1.render;

import java.util.function.Function;
import minecraft.class00500;
import minecraft.class01421;
import minecraft.class05885;
import minecraft.class07209;
import minecraft.class07295;
import minecraft.class07311;
import minecraft.class07926;
import minecraft.class08743;
import minecraft.class08887;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(value=EnvType.CLIENT)
public interface FabricRenderCommandQueue {
    default public void submitBlock(class01421 class014212, class00500 class005002, int n, int n2, int n3, class07295 class072952, class07209 class072092) {
        ((class07926)this).N(class014212, class005002, n, n2, n3);
    }

    default public void submitBlockStateModel(class01421 class014212, Function<class08743, class07311> function, class08887 class088872, float f, float f2, float f3, int n, int n2, int n3, class07295 class072952, class07209 class072092, class00500 class005002) {
        ((class07926)this).N(class014212, function.apply(class05885.N((class00500)class005002)), class088872, f, f2, f3, n, n2, n3);
    }
}

