/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.MinecraftClient
 *  net.minecraft.client.gui.screen.Screen
 *  net.minecraft.client.gui.screen.TitleScreen
 *  net.minecraft.client.world.ClientWorld
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Unique
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.ModifyVariable
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package kotakbaz.rain.mixin;

import kotakbaz.rain.client.discord.a;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.screen.TitleScreen;
import net.minecraft.client.world.ClientWorld;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyVariable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import oxxxde.\u062c\u064d;
import oxxxde.\u062e\u064b;
import oxxxde.\u0631\u0622;
import oxxxde.\u0635\u0635;
import oxxxde.\u0644;

@Mixin(value={MinecraftClient.class})
public class MixinMinecraftClient {
    @Unique
    private boolean rain$restoreMainMenuAfterResize;

    @Inject(method={"method_1481"}, at={@At(value="TAIL")})
    private void rain$syncAvailabilityOnWorldChange(ClientWorld world, CallbackInfo ci) {
        \u062e\u064b.INSTANCE.syncAvailabilityStates();
    }

    @Inject(method={"method_15993"}, at={@At(value="TAIL")})
    private void rain$restoreMainMenuAfterResize(CallbackInfo ci) {
        \u0631\u0622.clearCache();
        if (!this.rain$restoreMainMenuAfterResize) {
            return;
        }
        this.rain$restoreMainMenuAfterResize = false;
        MinecraftClient client = (MinecraftClient)this;
        Screen screen = client.currentScreen;
        if (screen == null || screen instanceof TitleScreen || screen instanceof a) {
            client.setScreen((Screen)new a());
        }
    }

    @Inject(method={"method_20539"}, at={@At(value="HEAD")}, cancellable=true)
    public void onOpenGameMenu(boolean pauseOnly, CallbackInfo ci) {
        if (\u0635\u0635.INSTANCE.getCustomScreen() != null) {
            ci.cancel();
        }
    }

    @Inject(method={"method_15993"}, at={@At(value="HEAD")})
    private void rain$rememberMainMenuBeforeResize(CallbackInfo ci) {
        MinecraftClient client = (MinecraftClient)this;
        Screen screen = client.currentScreen;
        this.rain$restoreMainMenuAfterResize = client.world == null && (screen instanceof a || screen instanceof TitleScreen);
    }

    @ModifyVariable(method={"method_1507"}, at=@At(value="HEAD"), argsOnly=true)
    private Screen rain$replaceTitleScreen(Screen screen) {
        if (\u0644.isFiguraScreen(screen)) {
            return null;
        }
        if (screen instanceof TitleScreen) {
            return new a();
        }
        return screen;
    }

    @Inject(method={"close"}, at={@At(value="HEAD")})
    private void rain$shutdownDiscordRpc(CallbackInfo ci) {
        \u062c\u064d.shutdown();
    }
}

