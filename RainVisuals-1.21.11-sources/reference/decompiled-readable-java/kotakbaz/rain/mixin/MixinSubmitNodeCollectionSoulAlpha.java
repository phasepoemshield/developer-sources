/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.render.command.BatchingRenderCommandQueue
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.ModifyVariable
 */
package kotakbaz.rain.mixin;

import net.minecraft.client.render.command.BatchingRenderCommandQueue;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;
import oxxxde.\u0635\u062f;

@Mixin(value={BatchingRenderCommandQueue.class})
public class MixinSubmitNodeCollectionSoulAlpha {
    @ModifyVariable(method={"method_73494"}, at=@At(value="HEAD"), argsOnly=true, ordinal=2)
    private int rain$applySoulModelPartAlpha(int color) {
        return \u0635\u062f.applyAlpha(color);
    }

    @ModifyVariable(method={"method_73490"}, at=@At(value="HEAD"), argsOnly=true, ordinal=2)
    private int rain$applySoulModelAlpha(int color) {
        return \u0635\u062f.applyAlpha(color);
    }
}

