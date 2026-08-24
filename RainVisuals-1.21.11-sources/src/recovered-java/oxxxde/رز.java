/*
 * Decompiled with CFR 0.152.
 */
package oxxxde;

import java.util.Map;
import kotakbaz.rain.module.Module;
import kotakbaz.rain.module.setting.ModeSetting;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import org.jetbrains.annotations.NotNull;
import oxxxde.\u062d\u0643;
import oxxxde.\u0638\u0646;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0002\u00a2\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\b8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\b8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b\u000e\u0010\rR\u0014\u0010\u000f\u001a\u00020\b8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b\u000f\u0010\rR\u0014\u0010\u0010\u001a\u00020\b8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b\u0010\u0010\rR\u0014\u0010\u0011\u001a\u00020\b8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b\u0011\u0010\rR\u0014\u0010\u0012\u001a\u00020\b8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b\u0012\u0010\rR \u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u00138\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0017\u0010\u0018\u00a8\u0006\u0019"}, d2={"Loxxxde/\u0631\u0632;", "Loxxxde/\u062f\u0650;", "<init>", "()V", "", "original", "modifyTime", "(J)J", "", "mode", "displayNameForTime", "(Ljava/lang/String;)Ljava/lang/String;", "MODE_DAWN", "Ljava/lang/String;", "MODE_DAY", "MODE_NOON", "MODE_DUSK", "MODE_NIGHT", "MODE_MIDNIGHT", "", "timeLabels", "Ljava/util/Map;", "Loxxxde/\u0638\u064a;", "timeMode", "Loxxxde/\u0638\u064a;", "rain-visuals"})
public final class \u0631\u0632
extends Module {
    @NotNull
    private static final String MODE_NIGHT = "Night";
    @NotNull
    private static final Map<String, String> timeLabels;
    @NotNull
    private static final String MODE_DAY = "Day";
    @NotNull
    private static final String MODE_NOON = "Noon";
    @NotNull
    public static final \u0631\u0632 INSTANCE;
    @NotNull
    private static final String MODE_DAWN = "Dawn";
    @NotNull
    private static final String MODE_MIDNIGHT = "Midnight";
    @NotNull
    private static final String MODE_DUSK = "Dusk";
    @NotNull
    private static final ModeSetting timeMode;

    public final long modifyTime(long original) {
        if (!this.isEnabled()) {
            return original;
        }
        return switch ((String)timeMode.getValue()) {
            case MODE_DAWN -> 23041L;
            case MODE_DAY -> 1000L;
            case MODE_NOON -> 6000L;
            case MODE_DUSK -> 12610L;
            case MODE_NIGHT -> 13000L;
            case MODE_MIDNIGHT -> 18000L;
            default -> original;
        };
    }

    static {
        INSTANCE = new \u0631\u0632();
        Object[] objectArray = new Pair[6];
        objectArray[0] = TuplesKt.to(MODE_DAWN, "\u0420\u0430\u0441\u0441\u0432\u0435\u0442");
        objectArray[1] = TuplesKt.to(MODE_DAY, "\u0414\u0435\u043d\u044c");
        objectArray[2] = TuplesKt.to(MODE_NOON, "\u041f\u043e\u043b\u0434\u0435\u043d\u044c");
        objectArray[3] = TuplesKt.to(MODE_DUSK, "\u0421\u0443\u043c\u0435\u0440\u043a\u0438");
        objectArray[4] = TuplesKt.to(MODE_NIGHT, "\u041d\u043e\u0447\u044c");
        objectArray[5] = TuplesKt.to(MODE_MIDNIGHT, "\u041f\u043e\u043b\u043d\u043e\u0447\u044c");
        timeLabels = MapsKt.mapOf(objectArray);
        objectArray = new String[6];
        objectArray[0] = MODE_DAWN;
        objectArray[1] = MODE_DAY;
        objectArray[2] = MODE_NOON;
        objectArray[3] = MODE_DUSK;
        objectArray[4] = MODE_NIGHT;
        objectArray[5] = MODE_MIDNIGHT;
        timeMode = Module.mode$default(INSTANCE, "\u0412\u0440\u0435\u043c\u044f", CollectionsKt.listOf(objectArray), 1, null, 8, null);
        timeMode.withDisplayNameProvider(new \u062d\u0643(INSTANCE));
    }

    private \u0631\u0632() {
        super("TimeChanger", \u0638\u0646.getRENDER(), "\u0418\u0437\u043c\u0435\u043d\u0435\u043d\u0438\u0435 \u0432\u0438\u0437\u0443\u0430\u043b\u044c\u043d\u043e\u0433\u043e \u0432\u0440\u0435\u043c\u0435\u043d\u0438 \u0441\u0443\u0442\u043e\u043a");
    }

    public static final /* synthetic */ String access$displayNameForTime(\u0631\u0632 $this, String mode) {
        return $this.displayNameForTime(mode);
    }

    private final String displayNameForTime(String mode) {
        String string = timeLabels.get(mode);
        if (string == null) {
            string = mode;
        }
        return string;
    }
}

