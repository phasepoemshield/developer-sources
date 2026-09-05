/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01894
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import minecraft.class01894;
import org.jspecify.annotations.Nullable;

public final class class00073
extends Enum<class00073> {
    public static final /* enum */ class00073 field_60233 = new class00073(1, "icon/ping_5");
    public static final /* enum */ class00073 field_60234 = new class00073(2, "icon/ping_4");
    public static final /* enum */ class00073 field_60235 = new class00073(3, "icon/ping_3");
    public static final /* enum */ class00073 field_60236 = new class00073(4, "icon/ping_2");
    public static final /* enum */ class00073 field_60237 = new class00073(5, "icon/ping_unknown");
    final int field_60238;
    private final class01894 field_60239;
    private static final /* synthetic */ class00073[] field_60240;

    private static /* synthetic */ class00073[] L() {
        return new class00073[]{field_60233, field_60234, field_60235, field_60236, field_60237};
    }

    private class00073(int n2, String string2) {
        this.field_60238 = n2;
        this.field_60239 = class01894.y((String)string2);
    }

    static {
        field_60240 = class00073.L();
    }

    public static class00073[] values() {
        return (class00073[])field_60240.clone();
    }

    public static class00073 valueOf(String string) {
        return Enum.valueOf(class00073.class, string);
    }

    public class01894 y() {
        return this.field_60239;
    }

    public int N() {
        return this.field_60238;
    }

    public static @Nullable class00073 N(int n) {
        for (class00073 class000732 : class00073.values()) {
            if (class000732.N() != n) continue;
            return class000732;
        }
        return null;
    }
}

