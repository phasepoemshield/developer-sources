/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class07211
 *  minecraft.class07536
 */
package minecraft;

import java.util.EnumMap;
import java.util.Map;
import minecraft.class03920;
import minecraft.class03956;
import minecraft.class07211;
import minecraft.class07536;

public final class class03941
extends Enum<class03941> {
    public static final /* enum */ class03941 field_3965 = new class03941(new class03920(class03956.field_64559, class03956.field_64560, class03956.field_64564), new class03920(class03956.field_64559, class03956.field_64560, class03956.field_64561), new class03920(class03956.field_64562, class03956.field_64560, class03956.field_64561), new class03920(class03956.field_64562, class03956.field_64560, class03956.field_64564));
    public static final /* enum */ class03941 field_3960 = new class03941(new class03920(class03956.field_64559, class03956.field_64563, class03956.field_64561), new class03920(class03956.field_64559, class03956.field_64563, class03956.field_64564), new class03920(class03956.field_64562, class03956.field_64563, class03956.field_64564), new class03920(class03956.field_64562, class03956.field_64563, class03956.field_64561));
    public static final /* enum */ class03941 field_3962 = new class03941(new class03920(class03956.field_64562, class03956.field_64563, class03956.field_64561), new class03920(class03956.field_64562, class03956.field_64560, class03956.field_64561), new class03920(class03956.field_64559, class03956.field_64560, class03956.field_64561), new class03920(class03956.field_64559, class03956.field_64563, class03956.field_64561));
    public static final /* enum */ class03941 field_3963 = new class03941(new class03920(class03956.field_64559, class03956.field_64563, class03956.field_64564), new class03920(class03956.field_64559, class03956.field_64560, class03956.field_64564), new class03920(class03956.field_64562, class03956.field_64560, class03956.field_64564), new class03920(class03956.field_64562, class03956.field_64563, class03956.field_64564));
    public static final /* enum */ class03941 field_3966 = new class03941(new class03920(class03956.field_64559, class03956.field_64563, class03956.field_64561), new class03920(class03956.field_64559, class03956.field_64560, class03956.field_64561), new class03920(class03956.field_64559, class03956.field_64560, class03956.field_64564), new class03920(class03956.field_64559, class03956.field_64563, class03956.field_64564));
    public static final /* enum */ class03941 field_3961 = new class03941(new class03920(class03956.field_64562, class03956.field_64563, class03956.field_64564), new class03920(class03956.field_64562, class03956.field_64560, class03956.field_64564), new class03920(class03956.field_64562, class03956.field_64560, class03956.field_64561), new class03920(class03956.field_64562, class03956.field_64563, class03956.field_64561));
    private static final Map<class07211, class03941> field_3958;
    private final class03920[] field_3959;
    private static final /* synthetic */ class03941[] field_3964;

    private class03941(class03920 ... class03920Array) {
        this.field_3959 = class03920Array;
    }

    public static class03941[] values() {
        return (class03941[])field_3964.clone();
    }

    public static class03941 valueOf(String string) {
        return Enum.valueOf(class03941.class, string);
    }

    public class03920 N(int n) {
        return this.field_3959[n];
    }

    private static /* synthetic */ class03941[] N() {
        return new class03941[]{field_3965, field_3960, field_3962, field_3963, field_3966, field_3961};
    }

    public static class03941 N(class07211 class072112) {
        return field_3958.get(class072112);
    }

    static {
        field_3964 = class03941.N();
        field_3958 = (Map)class07536.N(new EnumMap(class07211.class), enumMap -> {
            enumMap.put(class07211.field_11033, field_3965);
            enumMap.put(class07211.field_11036, field_3960);
            enumMap.put(class07211.field_11043, field_3962);
            enumMap.put(class07211.field_11035, field_3963);
            enumMap.put(class07211.field_11039, field_3966);
            enumMap.put(class07211.field_11034, field_3961);
        });
    }
}

