/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class04770
 *  minecraft.class04995
 *  minecraft.class08036
 */
package minecraft;

import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.ToIntFunction;
import minecraft.class04770;
import minecraft.class04995;
import minecraft.class08036;

final class class01581
extends Enum<class01581> {
    public static final /* enum */ class01581 field_13644 = new class01581("points", class08036::method_7255, (class047702, n) -> {
        if (n >= class047702.method_7349()) {
            return false;
        }
        class047702.method_14228(n.intValue());
        return true;
    }, class047702 -> class04995.y((float)(class047702.fields_37fa3311b0e9d3e9b883d09222919bf5a_2.floatValue() * (float)class047702.method_7349())));
    public static final /* enum */ class01581 field_13641 = new class01581("levels", class04770::method_7316, (class047702, n) -> {
        class047702.method_14252(n.intValue());
        return true;
    }, class047702 -> class047702.fields_37fa3311b0e9d3e9b883d09222919bf5a_0);
    public final BiConsumer<class04770, Integer> field_13639;
    public final BiPredicate<class04770, Integer> field_13642;
    public final String field_13643;
    final ToIntFunction<class04770> field_13645;
    private static final /* synthetic */ class01581[] field_13640;

    private class01581(String string2, BiConsumer<class04770, Integer> biConsumer, BiPredicate<class04770, Integer> biPredicate, ToIntFunction<class04770> toIntFunction) {
        this.field_13639 = biConsumer;
        this.field_13643 = string2;
        this.field_13642 = biPredicate;
        this.field_13645 = toIntFunction;
    }

    static {
        field_13640 = class01581.N();
    }

    public static class01581[] values() {
        return (class01581[])field_13640.clone();
    }

    public static class01581 valueOf(String string) {
        return Enum.valueOf(class01581.class, string);
    }

    private static /* synthetic */ class01581[] N() {
        return new class01581[]{field_13644, field_13641};
    }
}

