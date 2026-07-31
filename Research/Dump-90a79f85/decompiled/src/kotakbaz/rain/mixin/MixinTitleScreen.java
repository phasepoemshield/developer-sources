/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_310
 *  net.minecraft.class_437
 *  net.minecraft.class_442
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package kotakbaz.rain.mixin;

import kotakbaz.rain.ui.mainmenu.RainMainMenuScreen;
import net.minecraft.class_310;
import net.minecraft.class_437;
import net.minecraft.class_442;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={class_442.class})
public class MixinTitleScreen {
    public MixinTitleScreen() {
        super();
    }

    @Inject(method={"method_25426"}, at={@At(value="RETURN")})
    private void rain$openMainMenu(CallbackInfo ci) {
        class_310 client = class_310.method_1551();
        class_437 screen = client.field_1755;
        if (screen instanceof class_442) {
            client.method_1507((class_437)new RainMainMenuScreen());
        }
    }
}

