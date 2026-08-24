/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.gui.DrawContext
 *  net.minecraft.client.gui.Element
 *  net.minecraft.client.gui.screen.GameMenuScreen
 *  net.minecraft.client.gui.widget.ButtonWidget
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Unique
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package kotakbaz.rain.mixin;

import java.util.ArrayList;
import kotakbaz.rain.mixin.GameMenuScreenAccessor;
import kotakbaz.rain.mixin.ScreenWidgetInvoker;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.Element;
import net.minecraft.client.gui.screen.GameMenuScreen;
import net.minecraft.client.gui.widget.ButtonWidget;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import oxxxde.\u062b\u0648;
import oxxxde.\u0644;

@Mixin(value={GameMenuScreen.class})
public abstract class MixinPvpSafeGameMenuScreen {
    @Unique
    private boolean rain$disabledByPvpSafe;

    @Inject(method={"method_25426"}, at={@At(value="RETURN")})
    private void rain$updateButtonOnInit(CallbackInfo ci) {
        this.rain$removeFiguraPauseWidgets();
        this.rain$updateExitButton();
    }

    @Unique
    private void rain$updateExitButton() {
        ButtonWidget exitButton = ((GameMenuScreenAccessor)((Object)this)).rain$getExitButton();
        if (exitButton == null) {
            return;
        }
        boolean shouldBlock = \u062b\u0648.INSTANCE.shouldBlockDisconnectButton();
        if (shouldBlock) {
            exitButton.active = false;
            this.rain$disabledByPvpSafe = true;
            return;
        }
        if (this.rain$disabledByPvpSafe) {
            exitButton.active = true;
            this.rain$disabledByPvpSafe = false;
        }
    }

    @Unique
    private void rain$removeFiguraPauseWidgets() {
        GameMenuScreen screen = (GameMenuScreen)this;
        for (Element child : new ArrayList(screen.children())) {
            if (!\u0644.isFiguraPauseWidget(child)) continue;
            ((ScreenWidgetInvoker)((Object)this)).rain$invokeRemoveWidget(child);
        }
    }

    @Inject(method={"method_25393"}, at={@At(value="TAIL")})
    private void rain$updateButtonOnTick(CallbackInfo ci) {
        this.rain$removeFiguraPauseWidgets();
        this.rain$updateExitButton();
    }

    @Inject(method={"method_25394"}, at={@At(value="HEAD")})
    private void rain$removeFiguraButtonBeforeRender(DrawContext graphics, int mouseX, int mouseY, float delta, CallbackInfo ci) {
        this.rain$removeFiguraPauseWidgets();
    }
}

