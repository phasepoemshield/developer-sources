/*
 * Decompiled with CFR 0.152.
 */
package oxxxde;

import kotakbaz.rain.module.Module;
import kotakbaz.rain.module.setting.Setting;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import oxxxde.\u0631\u063a;
import oxxxde.\u0636\u0647;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\b\u0005\u0010\u0006J+\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\t2\u0006\u0010\b\u001a\u00020\u00072\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\t\u00a2\u0006\u0004\b\u000b\u0010\fJ#\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\t2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\t\u00a2\u0006\u0004\b\r\u0010\u000eJ7\u0010\u0012\u001a\u00028\u0000\"\b\b\u0000\u0010\u0010*\u00020\u000f2\u0006\u0010\u0011\u001a\u00028\u00002\u0006\u0010\b\u001a\u00020\u00072\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\t\u00a2\u0006\u0004\b\u0012\u0010\u0013J/\u0010\u0014\u001a\u00028\u0000\"\b\b\u0000\u0010\u0010*\u00020\u000f2\u0006\u0010\u0011\u001a\u00028\u00002\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\t\u00a2\u0006\u0004\b\u0014\u0010\u0015J;\u0010\u0018\u001a\u00028\u0000\"\f\b\u0000\u0010\u0010*\u0006\u0012\u0002\b\u00030\u00162\u0006\u0010\u0017\u001a\u00028\u00002\u0006\u0010\b\u001a\u00020\u00072\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\t\u00a2\u0006\u0004\b\u0018\u0010\u0019J3\u0010\u001a\u001a\u00028\u0000\"\f\b\u0000\u0010\u0010*\u0006\u0012\u0002\b\u00030\u00162\u0006\u0010\u0017\u001a\u00028\u00002\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\t\u00a2\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\u00048\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\u00078\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b\u001e\u0010\u001f\u00a8\u0006 "}, d2={"Loxxxde/\u0627\u064f;", "", "<init>", "()V", "", "isActive", "()Z", "", "token", "Lkotlin/Function0;", "extra", "onlyOnServer", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;)Lkotlin/jvm/functions/Function0;", "onlyOnFuntime", "(Lkotlin/jvm/functions/Function0;)Lkotlin/jvm/functions/Function0;", "Loxxxde/\u062f\u0650;", "T", "module", "moduleOnServer", "(Lkotakbaz/rain/module/Module;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)Lkotakbaz/rain/module/Module;", "moduleOnFuntime", "(Lkotakbaz/rain/module/Module;Lkotlin/jvm/functions/Function0;)Lkotakbaz/rain/module/Module;", "Loxxxde/\u0631\u0641;", "setting", "settingOnServer", "(Lkotakbaz/rain/module/setting/Setting;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)Lkotakbaz/rain/module/setting/Setting;", "settingOnFuntime", "(Lkotakbaz/rain/module/setting/Setting;Lkotlin/jvm/functions/Function0;)Lkotakbaz/rain/module/setting/Setting;", "MODULE_RESTRICTIONS_ENABLED", "Z", "DEBUG_SERVER", "Ljava/lang/String;", "rain-visuals"})
public final class \u0627\u064f {
    @NotNull
    public static final \u0627\u064f INSTANCE = new \u0627\u064f();
    @NotNull
    private static final String DEBUG_SERVER = "176.100.37.54";
    private static final boolean MODULE_RESTRICTIONS_ENABLED = true;

    public static /* synthetic */ Function0 onlyOnServer$default(\u0627\u064f \u0627\u064f2, String string, Function0 function0, int n, Object object) {
        if ((n & 2) != 0) {
            function0 = \u0627\u064f::onlyOnServer$lambda$0;
        }
        return \u0627\u064f2.onlyOnServer(string, function0);
    }

    public static /* synthetic */ Function0 onlyOnFuntime$default(\u0627\u064f \u0627\u064f2, Function0 function0, int n, Object object) {
        if ((n & 1) != 0) {
            function0 = \u0627\u064f::onlyOnFuntime$lambda$0;
        }
        return \u0627\u064f2.onlyOnFuntime(function0);
    }

    @NotNull
    public final Function0<Boolean> onlyOnServer(@NotNull String token, @NotNull Function0<Boolean> extra) {
        Intrinsics.checkNotNullParameter(token, "token");
        Intrinsics.checkNotNullParameter(extra, "extra");
        return () -> \u0627\u064f.onlyOnServer$lambda$1(token, extra);
    }

    public static /* synthetic */ Module moduleOnServer$default(\u0627\u064f \u0627\u064f2, Module module, String string, Function0 function0, int n, Object object) {
        if ((n & 4) != 0) {
            function0 = \u0627\u064f::moduleOnServer$lambda$0;
        }
        return \u0627\u064f2.moduleOnServer(module, string, function0);
    }

    /*
     * WARNING - void declaration
     */
    @NotNull
    public final <T extends Setting<?>> T settingOnServer(@NotNull T setting, @NotNull String token, @NotNull Function0<Boolean> extra) {
        void var1_1;
        Intrinsics.checkNotNullParameter(setting, "setting");
        Intrinsics.checkNotNullParameter(token, "token");
        Intrinsics.checkNotNullParameter(extra, "extra");
        setting.addVisibleCondition(this.onlyOnServer(token, extra));
        return var1_1;
    }

    /*
     * WARNING - void declaration
     */
    @NotNull
    public final <T extends Setting<?>> T settingOnFuntime(@NotNull T setting, @NotNull Function0<Boolean> extra) {
        void var1_1;
        Intrinsics.checkNotNullParameter(setting, "setting");
        Intrinsics.checkNotNullParameter(extra, "extra");
        setting.addVisibleCondition(this.onlyOnFuntime(extra));
        return var1_1;
    }

    private static final boolean onlyOnServer$lambda$0() {
        return true;
    }

    private \u0627\u064f() {
    }

    private static final boolean moduleOnFuntime$lambda$0() {
        return true;
    }

    public final boolean isActive() {
        return \u0636\u0647.INSTANCE.isFunTimeContext() || \u0631\u063a.debugMode && \u0636\u0647.INSTANCE.isCurrentServerMatching(DEBUG_SERVER);
    }

    private static final boolean settingOnFuntime$lambda$0() {
        return true;
    }

    @NotNull
    public final Function0<Boolean> onlyOnFuntime(@NotNull Function0<Boolean> extra) {
        Intrinsics.checkNotNullParameter(extra, "extra");
        return () -> \u0627\u064f.onlyOnFuntime$lambda$1(extra);
    }

    private static final boolean onlyOnFuntime$lambda$0() {
        return true;
    }

    /*
     * WARNING - void declaration
     */
    @NotNull
    public final <T extends Module> T moduleOnServer(@NotNull T module, @NotNull String token, @NotNull Function0<Boolean> extra) {
        void var1_1;
        Intrinsics.checkNotNullParameter(module, "module");
        Intrinsics.checkNotNullParameter(token, "token");
        Intrinsics.checkNotNullParameter(extra, "extra");
        Function0<Boolean> condition = this.onlyOnServer(token, extra);
        module.addVisibleInGuiCondition(condition);
        module.addAvailabilityCondition(condition);
        return var1_1;
    }

    public static /* synthetic */ Setting settingOnFuntime$default(\u0627\u064f \u0627\u064f2, Setting setting, Function0 function0, int n, Object object) {
        if ((n & 2) != 0) {
            function0 = \u0627\u064f::settingOnFuntime$lambda$0;
        }
        return \u0627\u064f2.settingOnFuntime(setting, function0);
    }

    public static /* synthetic */ Module moduleOnFuntime$default(\u0627\u064f \u0627\u064f2, Module module, Function0 function0, int n, Object object) {
        if ((n & 2) != 0) {
            function0 = \u0627\u064f::moduleOnFuntime$lambda$0;
        }
        return \u0627\u064f2.moduleOnFuntime(module, function0);
    }

    private static final boolean settingOnServer$lambda$0() {
        return true;
    }

    public static /* synthetic */ Setting settingOnServer$default(\u0627\u064f \u0627\u064f2, Setting setting, String string, Function0 function0, int n, Object object) {
        if ((n & 4) != 0) {
            function0 = \u0627\u064f::settingOnServer$lambda$0;
        }
        return \u0627\u064f2.settingOnServer(setting, string, function0);
    }

    private static final boolean moduleOnServer$lambda$0() {
        return true;
    }

    /*
     * WARNING - void declaration
     */
    @NotNull
    public final <T extends Module> T moduleOnFuntime(@NotNull T module, @NotNull Function0<Boolean> extra) {
        void var1_1;
        Intrinsics.checkNotNullParameter(module, "module");
        Intrinsics.checkNotNullParameter(extra, "extra");
        Function0<Boolean> condition = this.onlyOnFuntime(extra);
        module.addVisibleInGuiCondition(condition);
        module.addAvailabilityCondition(condition);
        return var1_1;
    }

    private static final boolean onlyOnFuntime$lambda$1(Function0 $extra) {
        return INSTANCE.isActive() && ((Boolean)$extra.invoke()).booleanValue();
    }

    private static final boolean onlyOnServer$lambda$1(String $token, Function0 $extra) {
        return \u0636\u0647.INSTANCE.isCurrentServerMatching($token) && ((Boolean)$extra.invoke()).booleanValue();
    }
}

