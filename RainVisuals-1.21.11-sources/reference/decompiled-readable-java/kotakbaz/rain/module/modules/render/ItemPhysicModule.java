/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.module.modules.render;

import kotakbaz.rain.module.Module;
import kotakbaz.rain.module.setting.ModeSetting;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import oxxxde.\u0638\u0646;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\u0007\u001a\u00020\u0004\u00a2\u0006\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b\u000b\u0010\nR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\r\u0010\u000e\u00a8\u0006\u000f"}, d2={"Loxxxde/\u062b\u0636;", "Loxxxde/\u062f\u0650;", "<init>", "()V", "", "is2DMode", "()Z", "isPhysicsMode", "", "MODE_PHYSICS", "Ljava/lang/String;", "MODE_2D", "Loxxxde/\u0638\u064a;", "modeSetting", "Loxxxde/\u0638\u064a;", "rain-visuals"})
public final class ItemPhysicModule
extends Module {
    @NotNull
    private static final String MODE_PHYSICS = "\u0424\u0438\u0437\u0438\u043a\u0430";
    @NotNull
    public static final ItemPhysicModule INSTANCE = new ItemPhysicModule();
    @NotNull
    private static final String MODE_2D = "2\u0414";
    @NotNull
    private static final ModeSetting modeSetting;

    public final boolean is2DMode() {
        return this.isEnabled() && Intrinsics.areEqual(modeSetting.getValue(), MODE_2D);
    }

    private ItemPhysicModule() {
        super("ItemPhysic", \u0638\u0646.getRENDER(), "\u0418\u0437\u043c\u0435\u043d\u044f\u0435\u0442 \u0441\u043f\u043e\u0441\u043e\u0431 \u043e\u0442\u043e\u0431\u0440\u0430\u0436\u0435\u043d\u0438\u044f \u043f\u0440\u0435\u0434\u043c\u0435\u0442\u043e\u0432");
    }

    static {
        String[] stringArray = new String[2];
        stringArray[0] = MODE_PHYSICS;
        stringArray[1] = MODE_2D;
        modeSetting = Module.mode$default(INSTANCE, "\u0420\u0435\u0436\u0438\u043c", CollectionsKt.listOf(stringArray), 0, null, 12, null);
    }

    public final boolean isPhysicsMode() {
        return this.isEnabled() && Intrinsics.areEqual(modeSetting.getValue(), MODE_PHYSICS);
    }
}

