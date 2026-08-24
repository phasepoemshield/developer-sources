/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.gui.Click
 *  net.minecraft.client.gui.screen.ingame.InventoryScreen
 *  net.minecraft.client.gui.screen.ingame.RecipeBookScreen
 *  net.minecraft.client.input.CharInput
 *  net.minecraft.client.input.KeyInput
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Unique
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package kotakbaz.rain.mixin;

import net.minecraft.client.gui.Click;
import net.minecraft.client.gui.screen.ingame.InventoryScreen;
import net.minecraft.client.gui.screen.ingame.RecipeBookScreen;
import net.minecraft.client.input.CharInput;
import net.minecraft.client.input.KeyInput;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import oxxxde.\u0630\u0647;
import oxxxde.\u0638\u0638;

@Mixin(value={RecipeBookScreen.class})
public abstract class MixinRecipeBookScreenSorting {
    @Inject(method={"method_25402"}, at={@At(value="HEAD")}, cancellable=true)
    private void rain$lockRecipeBookClick(Click event, boolean doubled, CallbackInfoReturnable<Boolean> cir) {
        if (this.rain$isSorting() && !((\u0630\u0647)((Object)this)).rain$isSortButtonHovered(event.x(), event.y())) {
            cir.setReturnValue((Object)true);
        }
    }

    @Inject(method={"method_25403"}, at={@At(value="HEAD")}, cancellable=true)
    private void rain$lockRecipeBookDrag(Click event, double dragX, double dragY, CallbackInfoReturnable<Boolean> cir) {
        if (this.rain$isSorting()) {
            cir.setReturnValue((Object)true);
        }
    }

    @Unique
    private boolean rain$isSorting() {
        return this instanceof InventoryScreen && \u0638\u0638.INSTANCE.isSorting();
    }

    @Inject(method={"method_25404"}, at={@At(value="HEAD")}, cancellable=true)
    private void rain$lockRecipeBookKey(KeyInput event, CallbackInfoReturnable<Boolean> cir) {
        if (this.rain$isSorting()) {
            cir.setReturnValue((Object)true);
        }
    }

    @Inject(method={"method_25400"}, at={@At(value="HEAD")}, cancellable=true)
    private void rain$lockRecipeBookText(CharInput event, CallbackInfoReturnable<Boolean> cir) {
        if (this.rain$isSorting()) {
            cir.setReturnValue((Object)true);
        }
    }
}

