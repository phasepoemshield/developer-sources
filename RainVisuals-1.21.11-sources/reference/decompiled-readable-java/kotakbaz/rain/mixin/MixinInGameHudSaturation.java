/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.gl.RenderPipelines
 *  net.minecraft.client.gui.DrawContext
 *  net.minecraft.client.gui.hud.InGameHud
 *  net.minecraft.entity.effect.StatusEffects
 *  net.minecraft.entity.player.PlayerEntity
 *  net.minecraft.util.Identifier
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Unique
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.ModifyArg
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package kotakbaz.rain.mixin;

import net.minecraft.client.gl.RenderPipelines;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.hud.InGameHud;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.Identifier;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyArg;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import oxxxde.\u0631\u0639;

@Mixin(value={InGameHud.class})
public abstract class MixinInGameHudSaturation {
    @Unique
    private static final Identifier RAIN_FOOD_FULL_HUNGER;
    @Unique
    private static final Identifier RAIN_FOOD_EMPTY;
    @Unique
    private static final Identifier RAIN_FOOD_EMPTY_HUNGER;
    @Unique
    private static final Identifier RAIN_FOOD_FULL;
    @Unique
    private static final Identifier RAIN_FOOD_HALF;
    @Unique
    private static final Identifier RAIN_FOOD_HALF_HUNGER;
    @Unique
    private boolean rain$saturationRowRendered;

    static {
        RAIN_FOOD_EMPTY = Identifier.ofVanilla((String)"hud/food_empty");
        RAIN_FOOD_HALF = Identifier.ofVanilla((String)"hud/food_half");
        RAIN_FOOD_FULL = Identifier.ofVanilla((String)"hud/food_full");
        RAIN_FOOD_EMPTY_HUNGER = Identifier.ofVanilla((String)"hud/food_empty_hunger");
        RAIN_FOOD_HALF_HUNGER = Identifier.ofVanilla((String)"hud/food_half_hunger");
        RAIN_FOOD_FULL_HUNGER = Identifier.ofVanilla((String)"hud/food_full_hunger");
    }

    @ModifyArg(method={"method_1760"}, at=@At(value="INVOKE", target="Lnet/minecraft/class_329;method_65022(Lnet/minecraft/class_332;Lnet/minecraft/class_1657;III)V"), index=3)
    private int rain$moveAirBubblesAboveSaturation(int y) {
        return this.rain$saturationRowRendered ? y - 10 : y;
    }

    @Inject(method={"method_58477"}, at={@At(value="TAIL")})
    private void rain$renderSaturation(DrawContext graphics, PlayerEntity player, int foodY, int rightEdge, CallbackInfo ci) {
        if (!\u0631\u0639.INSTANCE.isEnabled()) {
            return;
        }
        int saturationLevel = Math.max(0, Math.min(20, Math.round(player.getHungerManager().getSaturationLevel())));
        boolean hasHunger = player.hasStatusEffect(StatusEffects.HUNGER);
        Identifier emptySprite = hasHunger ? RAIN_FOOD_EMPTY_HUNGER : RAIN_FOOD_EMPTY;
        Identifier halfSprite = hasHunger ? RAIN_FOOD_HALF_HUNGER : RAIN_FOOD_HALF;
        Identifier fullSprite = hasHunger ? RAIN_FOOD_FULL_HUNGER : RAIN_FOOD_FULL;
        boolean showEmpty = \u0631\u0639.INSTANCE.shouldRenderEmptySlots();
        int saturationY = foodY - 10;
        for (int index = 0; index < 10; ++index) {
            boolean half;
            int x = rightEdge - index * 8 - 9;
            int point = index * 2 + 1;
            boolean full = point < saturationLevel;
            boolean bl = half = point == saturationLevel;
            if (showEmpty || full || half) {
                graphics.drawGuiTexture(RenderPipelines.GUI_TEXTURED, emptySprite, x, saturationY, 9, 9);
            }
            if (full) {
                graphics.drawGuiTexture(RenderPipelines.GUI_TEXTURED, fullSprite, x, saturationY, 9, 9);
                continue;
            }
            if (!half) continue;
            graphics.drawGuiTexture(RenderPipelines.GUI_TEXTURED, halfSprite, x, saturationY, 9, 9);
        }
        this.rain$saturationRowRendered = showEmpty || saturationLevel > 0;
    }

    @Inject(method={"method_1760"}, at={@At(value="HEAD")})
    private void rain$resetSaturationRowState(DrawContext graphics, CallbackInfo ci) {
        this.rain$saturationRowRendered = false;
    }
}

