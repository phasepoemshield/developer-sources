package fun.wonderful.mixin;

import fun.wonderful.api.events.EventInvoker;
import fun.wonderful.api.events.implement.EventGameUpdate;
import fun.wonderful.api.events.implement.EventTickPost;
import fun.wonderful.api.events.implement.EventTickPre;
import fun.wonderful.api.storages.implement.helpertstorages.enumvar.ModuleClass;
import fun.wonderful.api.utils.player.Counter;
import fun.wonderful.client.modules.impl.misc.AutoJoin;
import fun.wonderful.client.modules.impl.render.Chams;
import fun.wonderful.client.ui.MenuPanel;
import fun.wonderful.client.ui.mainmenu.MainMenu;
import net.minecraft.entity.Entity;
import net.minecraft.util.Util;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.screen.TitleScreen;
import net.minecraft.client.gui.screen.ingame.HandledScreen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(value={MinecraftClient.class})
public abstract class MinecraftClientMixin {
    @Unique
    private long lastHookTime = Util.getMeasuringTimeNano();
    @Unique
    private int accumulatedCalls = 0;
    @Unique
    private boolean wonderful$replacingScreen = false;

    @Inject(method={"setScreen"}, at={@At(value="HEAD")}, cancellable=true)
    private void wonderful$replaceTitleScreen(Screen screen, CallbackInfo ci) {
        MinecraftClient client = (MinecraftClient)(Object)this;
        if (screen instanceof TitleScreen && !this.wonderful$replacingScreen) {
            if (client.currentScreen instanceof MainMenu) {
                ci.cancel();
                return;
            }
            this.wonderful$replacingScreen = true;
            ci.cancel();
            client.setScreen((Screen)new MainMenu());
            this.wonderful$replacingScreen = false;
            return;
        }
        if (client.currentScreen instanceof MenuPanel && screen instanceof HandledScreen && AutoJoin.INSTANCE.isJoining()) {
            ci.cancel();
        }
    }

    @Inject(method={"tick"}, at={@At(value="HEAD")})
    public void tick(CallbackInfo ci) {
        EventInvoker.invokeQuiet(new EventTickPre());
        Counter.updateFPS();
    }

    @Inject(method={"tick"}, at={@At(value="RETURN")})
    public void tickEnd(CallbackInfo ci) {
        if (EventInvoker.hasListeners(EventTickPost.class)) {
            EventInvoker.invokeQuiet(new EventTickPost());
        }
    }

    @Inject(method={"render"}, at={@At(value="HEAD")})
    private void render(boolean tick, CallbackInfo ci) {
        long now = Util.getMeasuringTimeNano();
        long delta = now - this.lastHookTime;
        this.accumulatedCalls += (int)(delta / 4166666L);
        this.lastHookTime += (long)this.accumulatedCalls * 4166666L;
        this.accumulatedCalls = Math.min(this.accumulatedCalls, 240);
        while (this.accumulatedCalls > 0) {
            EventInvoker.invokeQuiet(new EventGameUpdate());
            --this.accumulatedCalls;
        }
    }

    @Inject(method={"hasOutline"}, at={@At(value="HEAD")}, cancellable=true)
    private void wonderful$hasOutline(Entity entity, CallbackInfoReturnable<Boolean> cir) {
        PlayerEntity player;
        if (ModuleClass.INSTANCE == null) {
            return;
        }
        Chams chams = ModuleClass.chams;
        if (chams != null && entity instanceof PlayerEntity && chams.shouldUseOutlineAssist(player = (PlayerEntity)entity)) {
            cir.setReturnValue(true);
        }
    }
}
