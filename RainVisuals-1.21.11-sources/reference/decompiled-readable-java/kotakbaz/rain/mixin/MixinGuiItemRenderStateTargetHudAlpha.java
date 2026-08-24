/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.gui.render.state.ItemGuiElementRenderState
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Unique
 */
package kotakbaz.rain.mixin;

import net.minecraft.client.gui.render.state.ItemGuiElementRenderState;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import oxxxde.\u062a\u062b;

@Mixin(value={ItemGuiElementRenderState.class})
public class MixinGuiItemRenderStateTargetHudAlpha
implements \u062a\u062b {
    @Unique
    private float rain$targetHudAlpha = 1.0f;

    @Override
    public void rain$setTargetHudAlpha(float alpha) {
        this.rain$targetHudAlpha = alpha;
    }

    @Override
    public float rain$getTargetHudAlpha() {
        return this.rain$targetHudAlpha;
    }
}

