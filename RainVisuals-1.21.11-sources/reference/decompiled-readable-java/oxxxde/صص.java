/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.ClientModInitializer
 *  net.minecraft.client.option.KeyBinding
 *  ru.ocz.protection.annotation.Compile
 *  ru.ocz.protection.annotation.VMProtect
 *  ru.ocz.protection.annotation.VMProtect$Type
 *  ru.ocz.protection.virtualmachine.annotation.RecompileFormat
 */
package oxxxde;

import kotakbaz.rain.Rain;
import kotakbaz.rain.client.liteapi.HolyWorldFeatureControl;
import kotakbaz.rain.client.util.other.CustomScreen;
import kotakbaz.rain.client.waypoint.WayPointManager;
import kotakbaz.rain.module.modules.render.WayPointModule;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import net.fabricmc.api.ClientModInitializer;
import net.minecraft.client.option.KeyBinding;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import oxxxde.\u0628\u0645;
import oxxxde.\u062a\u064e;
import oxxxde.\u062b\u062b;
import oxxxde.\u062c\u064d;
import oxxxde.\u062e\u0632;
import oxxxde.\u062e\u064b;
import oxxxde.\u062f\u0625;
import oxxxde.\u062f\u0633;
import oxxxde.\u062f\u0639;
import oxxxde.\u0632\u062f;
import oxxxde.\u0634\u063a;
import oxxxde.\u0634\u0652;
import oxxxde.\u0636\u0623;
import oxxxde.\u0636\u0643;
import oxxxde.\u0638\u0638;
import oxxxde.\u0639\u0632;
import ru.ocz.protection.annotation.Compile;
import ru.ocz.protection.annotation.VMProtect;
import ru.ocz.protection.virtualmachine.annotation.RecompileFormat;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u00c7\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\b\u0006\u0010\u0003J\r\u0010\u0007\u001a\u00020\u0004\u00a2\u0006\u0004\b\u0007\u0010\u0003J\r\u0010\b\u001a\u00020\u0004\u00a2\u0006\u0004\b\b\u0010\u0003R\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\n\u0010\u000bR.\u0010\u000e\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\f8\u0006@FX\u0086\u000e\u00a2\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013\u00a8\u0006\u0014"}, d2={"Loxxxde/\u0635\u0635;", "Lnet/fabricmc/api/ClientModInitializer;", "<init>", "()V", "", "onInitializeClient", "initializeClientLogic", "registerTextures", "closeCustomScreenImmediately", "", "wasCursorLock", "Z", "Loxxxde/\u062c\u0639;", "value", "customScreen", "Loxxxde/\u062c\u0639;", "getCustomScreen", "()Lkotakbaz/rain/client/util/other/CustomScreen;", "setCustomScreen", "(Lkotakbaz/rain/client/util/other/CustomScreen;)V", "rain-visuals"})
@RecompileFormat
public final class \u0635\u0635
implements ClientModInitializer {
    private static boolean wasCursorLock;
    @NotNull
    public static final \u0635\u0635 INSTANCE;
    @Nullable
    private static CustomScreen customScreen;

    static {
        INSTANCE = new \u0635\u0635();
    }

    public final void registerTextures() {
    }

    @VMProtect(value=VMProtect.Type.VIRTUALIZATION)
    @Compile(ops=10)
    public final void initializeClientLogic() {
        \u0636\u0623.INSTANCE.initialize();
        \u0632\u062f.INSTANCE.register();
        \u0638\u0638.INSTANCE.initialize();
        \u062b\u062b.INSTANCE.initialize();
        \u0628\u0645.INSTANCE.initialize();
        \u0634\u0652.INSTANCE.initialize();
        \u062e\u064b.INSTANCE.load();
        HolyWorldFeatureControl.INSTANCE.load(\u062e\u064b.INSTANCE.getModules());
        \u062f\u0639.INSTANCE.load();
        \u0634\u063a.INSTANCE.load();
        WayPointManager.INSTANCE.load();
        WayPointModule.INSTANCE.applyLegacyBindIfNeeded(WayPointManager.INSTANCE.legacyBindKey());
        \u062f\u0625.INSTANCE.load();
        \u062f\u0633.initializeRemoteCatalog();
        this.registerTextures();
        Rain.INSTANCE.initialize();
        \u062e\u0632.INSTANCE.initialize();
        \u0639\u0632.INSTANCE.initialize();
        \u062a\u064e.INSTANCE.initialize();
        try {
            Object object = this;
            boolean bl = false;
            \u062c\u064d.startup();
            object = Result.constructor-impl(Unit.INSTANCE);
        }
        catch (Throwable throwable) {
            Object object = Result.constructor-impl(ResultKt.createFailure(throwable));
        }
        Runtime.getRuntime().addShutdownHook(new Thread(\u0635\u0635.lamda$initializeClientLogic$1_628aea61()));
    }

    private static final void initializeClientLogic$lambda$1() {
        \u062e\u0632.INSTANCE.shutdown();
        \u0639\u0632.INSTANCE.shutdown();
        \u062a\u064e.INSTANCE.shutdown();
        \u0635\u0635 \u0635\u06352 = INSTANCE;
        try {
            \u0635\u0635 $this$initializeClientLogic_u24lambda_u241_u240 = \u0635\u06352;
            boolean bl = false;
            \u062c\u064d.shutdown();
            Object object = Result.constructor-impl(Unit.INSTANCE);
        }
        catch (Throwable throwable) {
            Object object = Result.constructor-impl(ResultKt.createFailure(throwable));
        }
        Rain.INSTANCE.saveCurrentState();
    }

    public final void setCustomScreen(@Nullable CustomScreen value) {
        if (!\u0636\u0643.getMc().isOnThread()) {
            \u0636\u0643.getMc().execute(() -> \u0635\u0635._set_customScreen_$lambda$0(value));
            return;
        }
        if (customScreen == value) {
            return;
        }
        boolean openingCustomScreen = customScreen == null && value != null;
        boolean closingCustomScreen = customScreen != null && value == null;
        if (openingCustomScreen) {
            KeyBinding.unpressAll();
        }
        if (value != null) {
            wasCursorLock = \u0636\u0643.getMc().mouse.isCursorLocked();
            \u0636\u0643.getMc().mouse.unlockCursor();
        } else if (wasCursorLock && \u0636\u0643.getMc().currentScreen == null && \u0636\u0643.getMc().world != null && \u0636\u0643.getMc().getNetworkHandler() != null) {
            \u0636\u0643.getMc().mouse.lockCursor();
        } else {
            \u0636\u0643.getMc().mouse.unlockCursor();
        }
        customScreen = value;
        if (openingCustomScreen) {
            value.init();
        }
        if (closingCustomScreen) {
            KeyBinding.updatePressedStates();
        }
    }

    public void onInitializeClient() {
        this.initializeClientLogic();
    }

    private static final void _set_customScreen_$lambda$0(CustomScreen $value) {
        INSTANCE.setCustomScreen($value);
    }

    private \u0635\u0635() {
    }

    public final void closeCustomScreenImmediately() {
        if (!\u0636\u0643.getMc().isOnThread()) {
            \u0636\u0643.getMc().execute(this::closeCustomScreenImmediately);
            return;
        }
        CustomScreen customScreen = \u0635\u0635.customScreen;
        if (customScreen == null) {
            return;
        }
        CustomScreen screen = customScreen;
        screen.close();
        this.setCustomScreen(null);
    }

    @Nullable
    public final CustomScreen getCustomScreen() {
        return customScreen;
    }

    static /* synthetic */ Runnable lamda$initializeClientLogic$1_628aea61() {
        return \u0635\u0635::initializeClientLogic$lambda$1;
    }
}

