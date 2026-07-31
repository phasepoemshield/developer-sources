/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain;

import kotakbaz.rain.client.discord.a;
import kotakbaz.rain.client.draggable.D;
import kotakbaz.rain.client.extensions.b;
import kotakbaz.rain.client.liteapi.HolyWorldFeatureControl;
import kotakbaz.rain.client.sound.RainSoundEvents;
import kotakbaz.rain.client.util.other.CustomScreen;
import kotakbaz.rain.client.waypoint.WayPointManager;
import kotakbaz.rain.command.Command;
import kotakbaz.rain.config.ConfigManager;
import kotakbaz.rain.friend.FriendManager;
import kotakbaz.rain.guard.a_0;
import kotakbaz.rain.module.ModuleManager;
import kotakbaz.rain.module.modules.render.WayPointModule;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.SourceDebugExtension;
import net.fabricmc.api.ClientModInitializer;
import net.minecraft.client.option.KeyBinding;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\b\u0005\u0010\u0003J\r\u0010\u0006\u001a\u00020\u0004\u00a2\u0006\u0004\b\u0006\u0010\u0003R\u0016\u0010\b\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\b\u0010\tR.\u0010\f\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006@FX\u0086\u000e\u00a2\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011\u00a8\u0006\u0012"}, d2={"Lkotakbaz/rain/Rain;", "Lnet/fabricmc/api/ClientModInitializer;", "<init>", "()V", "", "onInitializeClient", "registerTextures", "", "wasCursorLock", "Z", "Lkotakbaz/rain/client/util/other/CustomScreen;", "value", "customScreen", "Lkotakbaz/rain/client/util/other/CustomScreen;", "getCustomScreen", "()Lkotakbaz/rain/client/util/other/CustomScreen;", "setCustomScreen", "(Lkotakbaz/rain/client/util/other/CustomScreen;)V", "rain-visuals"})
@SourceDebugExtension(value={"SMAP\nRain.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Rain.kt\nkotakbaz/rain/Rain\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,84:1\n1#2:85\n*E\n"})
public final class Rain
implements ClientModInitializer {
    @NotNull
    public static final Rain INSTANCE = new Rain();
    private static boolean wasCursorLock;
    @Nullable
    private static CustomScreen customScreen;

    private Rain() {
    }

    @Nullable
    public final CustomScreen getCustomScreen() {
        return customScreen;
    }

    public final void setCustomScreen(@Nullable CustomScreen value2) {
        boolean closingCustomScreen;
        if (customScreen == value2) {
            return;
        }
        boolean openingCustomScreen = customScreen == null && value2 != null;
        boolean bl = closingCustomScreen = customScreen != null && value2 == null;
        if (openingCustomScreen) {
            KeyBinding.unpressAll();
        }
        if (value2 != null) {
            wasCursorLock = b.getMc().mouse.isCursorLocked();
            b.getMc().mouse.unlockCursor();
        } else if (wasCursorLock) {
            b.getMc().mouse.lockCursor();
        } else {
            b.getMc().mouse.unlockCursor();
        }
        customScreen = value2;
        if (openingCustomScreen) {
            value2.init();
        }
        if (closingCustomScreen) {
            KeyBinding.updatePressedStates();
        }
    }

    public void onInitializeClient() {
        a_0.requireValid("1.21.8");
        a_0.startWatchdog("1.21.8");
        RainSoundEvents.INSTANCE.register();
        ModuleManager.INSTANCE.load();
        HolyWorldFeatureControl.INSTANCE.load(ModuleManager.INSTANCE.getModules());
        kotakbaz.rain.client.listener.a.INSTANCE.load();
        FriendManager.INSTANCE.load();
        WayPointManager.INSTANCE.load();
        WayPointModule.INSTANCE.applyLegacyBindIfNeeded(WayPointManager.INSTANCE.legacyBindKey());
        Command.INSTANCE.load();
        this.registerTextures();
        D.INSTANCE.load();
        ConfigManager.INSTANCE.load("AutoLoad");
        Rain rain = this;
        try {
            Rain $this$onInitializeClient_u24lambda_u240 = rain;
            boolean bl = false;
            a.startup();
            Object object = Result.cfr_renamed_1(Unit.INSTANCE);
        }
        catch (Throwable throwable) {
            Object object = Result.cfr_renamed_1(ResultKt.createFailure(throwable));
        }
        Runtime.getRuntime().addShutdownHook(new Thread(Rain::onInitializeClient$lambda$1));
    }

    public final void registerTextures() {
    }

    private static final void onInitializeClient$lambda$1() {
        Rain rain = INSTANCE;
        try {
            Rain $this$onInitializeClient_u24lambda_u241_u240 = rain;
            boolean bl = false;
            a.shutdown();
            Object object = Result.cfr_renamed_1(Unit.INSTANCE);
        }
        catch (Throwable throwable) {
            Object object = Result.cfr_renamed_1(ResultKt.createFailure(throwable));
        }
        D.INSTANCE.save();
        ConfigManager.INSTANCE.save("AutoLoad");
    }
}

