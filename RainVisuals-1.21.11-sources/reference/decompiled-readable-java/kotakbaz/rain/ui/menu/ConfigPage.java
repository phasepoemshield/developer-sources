/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.ui.menu;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005\u00a8\u0006\u0006"}, d2={"Loxxxde/\u0635\u0636;", "", "<init>", "(Ljava/lang/String;I)V", "LOCAL", "CLOUD", "rain-visuals"})
final class ConfigPage
extends Enum<ConfigPage> {
    public static final /* enum */ ConfigPage CLOUD;
    public static final /* enum */ ConfigPage LOCAL;
    private static final /* synthetic */ ConfigPage[] $VALUES;
    private static final /* synthetic */ EnumEntries $ENTRIES;

    private static final /* synthetic */ ConfigPage[] $values() {
        ConfigPage[] configPageArray = new ConfigPage[2];
        configPageArray[0] = LOCAL;
        configPageArray[1] = CLOUD;
        return configPageArray;
    }

    public static ConfigPage[] values() {
        return (ConfigPage[])$VALUES.clone();
    }

    public static ConfigPage valueOf(String value) {
        return Enum.valueOf(ConfigPage.class, value);
    }

    @NotNull
    public static EnumEntries<ConfigPage> getEntries() {
        return $ENTRIES;
    }

    static {
        LOCAL = new ConfigPage();
        CLOUD = new ConfigPage();
        $VALUES = ConfigPage.$values();
        $ENTRIES = EnumEntriesKt.enumEntries((Enum[])$VALUES);
    }
}

