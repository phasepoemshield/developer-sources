/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class02268
 */
package minecraft;

import java.util.List;
import java.util.function.Function;
import minecraft.class02268;

public final class class01090
extends Enum<class01090> {
    public static final /* enum */ class01090 field_14280 = new class01090();
    public static final /* enum */ class01090 field_14281 = new class01090();
    private static final /* synthetic */ class01090[] field_14282;

    public static class01090[] values() {
        return (class01090[])field_14282.clone();
    }

    public static class01090 valueOf(String string) {
        return Enum.valueOf(class01090.class, string);
    }

    private static /* synthetic */ class01090[] y() {
        return new class01090[]{field_14280, field_14281};
    }

    public class01090 N() {
        return this == field_14280 ? field_14281 : field_14280;
    }

    public <T> int N(List<T> list, T t, Function<T, class02268> function, boolean bl) {
        class02268 class022682;
        int n;
        if ((bl ? this.N() : this) == field_14281) {
            class02268 class022683;
            int n2;
            for (n2 = 0; n2 < list.size() && (class022683 = function.apply(list.get(n2))).L() && class022683.y() == this; ++n2) {
            }
            list.add(n2, t);
            return n2;
        }
        for (n = list.size() - 1; n >= 0 && (class022682 = function.apply(list.get(n))).L() && class022682.y() == this; --n) {
        }
        list.add(n + 1, t);
        return n + 1;
    }

    static {
        field_14282 = class01090.y();
    }
}

