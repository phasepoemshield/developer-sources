/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.guard.mixin;

import kotakbaz.rain.guard.b_0;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.hud.InGameHud;
import net.minecraft.client.render.RenderTickCounter;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={InGameHud.class})
public abstract class GuardHudMixin {
    @Inject(method={"method_1753"}, at={@At(value="HEAD")})
    private void rain$guardMeshHud(DrawContext context, RenderTickCounter tickCounter, CallbackInfo ci) {
        b_0.probe(3, "1.21.8");
    }
}

