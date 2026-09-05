/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00092
 *  minecraft.class00107
 *  minecraft.class00130
 *  minecraft.class08746
 *  minecraft.class08757
 *  minecraft.class08762
 *  minecraft.class08764
 *  minecraft.class08776
 */
package minecraft;

import java.util.function.Function;
import minecraft.class00092;
import minecraft.class00107;
import minecraft.class00130;
import minecraft.class08746;
import minecraft.class08757;
import minecraft.class08762;
import minecraft.class08764;
import minecraft.class08776;

public final class class08966
extends Enum<class08966> {
    public static final /* enum */ class08966 field_5650 = new class08966("movement", class00130::new);
    public static final /* enum */ class08966 field_5648 = new class08966("find_tree", class08757::new);
    public static final /* enum */ class08966 field_5649 = new class08966("punch_tree", class08776::new);
    public static final /* enum */ class08966 field_5652 = new class08966("open_inventory", class08746::new);
    public static final /* enum */ class08966 field_5655 = new class08966("craft_planks", class00092::new);
    public static final /* enum */ class08966 field_5653 = new class08966("none", class00107::new);
    private final String field_5651;
    private final Function<class08764, ? extends class08762> field_5647;
    private static final /* synthetic */ class08966[] field_5654;

    private <T extends class08762> class08966(String string2, Function<class08764, T> function) {
        this.field_5651 = string2;
        this.field_5647 = function;
    }

    static {
        field_5654 = class08966.y();
    }

    public static class08966[] values() {
        return (class08966[])field_5654.clone();
    }

    public static class08966 valueOf(String string) {
        return Enum.valueOf(class08966.class, string);
    }

    private static /* synthetic */ class08966[] y() {
        return new class08966[]{field_5650, field_5648, field_5649, field_5652, field_5655, field_5653};
    }

    public String N() {
        return this.field_5651;
    }

    public static class08966 N(String string) {
        for (class08966 class089662 : class08966.values()) {
            if (!class089662.field_5651.equals(string)) continue;
            return class089662;
        }
        return field_5653;
    }

    public class08762 N(class08764 class087642) {
        return this.field_5647.apply(class087642);
    }
}

