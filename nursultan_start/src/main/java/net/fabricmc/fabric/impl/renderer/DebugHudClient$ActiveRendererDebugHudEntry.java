/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00570
 *  minecraft.class01285
 *  minecraft.class05834
 *  minecraft.class07299
 *  minecraft.class08944
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.api.renderer.v1.Renderer
 *  org.jspecify.annotations.Nullable
 */
package net.fabricmc.fabric.impl.renderer;

import minecraft.class00570;
import minecraft.class01285;
import minecraft.class05834;
import minecraft.class07299;
import minecraft.class08944;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.renderer.v1.Renderer;
import org.jspecify.annotations.Nullable;

@Environment(value=EnvType.CLIENT)
class DebugHudClient$ActiveRendererDebugHudEntry
implements class01285 {
    DebugHudClient$ActiveRendererDebugHudEntry() {
    }

    public class08944 method_72759() {
        return class08944.N;
    }

    public void method_72751(class05834 class058342, @Nullable class07299 class072992, @Nullable class00570 class005702, @Nullable class00570 class005703) {
        class058342.y("[Fabric] Active renderer: " + Renderer.get().getClass().getSimpleName());
    }

    public boolean method_72753(boolean bl) {
        return true;
    }
}

