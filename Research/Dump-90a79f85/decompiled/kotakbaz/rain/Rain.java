/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.ClientModInitializer
 *  net.minecraft.class_304
 */
package kotakbaz.rain;

import kotakbaz.rain.client.discord.a;
import kotakbaz.rain.client.draggable.D;
import kotakbaz.rain.client.extensions.b;
import kotakbaz.rain.client.util.other.f;
import kotakbaz.rain.client.waypoint.c;
import kotakbaz.rain.command.A;
import kotakbaz.rain.friend.C;
import kotakbaz.rain.module.modules.render.o;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.SourceDebugExtension;
import net.fabricmc.api.ClientModInitializer;
import net.minecraft.class_304;
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
    private static f customScreen;

    private Rain() {
    }

    @Nullable
    public final f getCustomScreen() {
        return customScreen;
    }

    public final void setCustomScreen(@Nullable f value) {
        boolean closingCustomScreen;
        if (customScreen == value) {
            return;
        }
        boolean openingCustomScreen = customScreen == null && value != null;
        boolean bl = closingCustomScreen = customScreen != null && value == null;
        if (openingCustomScreen) {
            class_304.method_1437();
        }
        if (value != null) {
            wasCursorLock = b.getMc().field_1729.method_1613();
            b.getMc().field_1729.method_1610();
        } else if (wasCursorLock) {
            b.getMc().field_1729.method_1612();
        } else {
            b.getMc().field_1729.method_1610();
        }
        customScreen = value;
        if (openingCustomScreen) {
            value.init();
        }
        if (closingCustomScreen) {
            class_304.method_1424();
        }
    }

    public void onInitializeClient() {
        kotakbaz.rain.guard.a.requireValid((String)"1.21.8");
        kotakbaz.rain.guard.a.startWatchdog((String)"1.21.8");
        kotakbaz.rain.client.sound.a.INSTANCE.register();
        kotakbaz.rain.module.A.INSTANCE.load();
        kotakbaz.rain.client.liteapi.A.INSTANCE.load(kotakbaz.rain.module.A.INSTANCE.getModules());
        kotakbaz.rain.client.listener.a.INSTANCE.load();
        C.INSTANCE.load();
        c.INSTANCE.load();
        o.INSTANCE.applyLegacyBindIfNeeded(c.INSTANCE.legacyBindKey());
        A.INSTANCE.load();
        this.registerTextures();
        D.INSTANCE.load();
        kotakbaz.rain.config.a.INSTANCE.load("AutoLoad");
        Rain rain = this;
        try {
            Rain $this$onInitializeClient_u24lambda_u240 = rain;
            boolean bl = false;
            a.startup();
            Object object = Result.constructor-impl(Unit.INSTANCE);
        }
        catch (Throwable throwable) {
            Object object = Result.constructor-impl(ResultKt.createFailure(throwable));
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
            Object object = Result.constructor-impl(Unit.INSTANCE);
        }
        catch (Throwable throwable) {
            Object object = Result.constructor-impl(ResultKt.createFailure(throwable));
        }
        D.INSTANCE.save();
        kotakbaz.rain.config.a.INSTANCE.save("AutoLoad");
    }
}
