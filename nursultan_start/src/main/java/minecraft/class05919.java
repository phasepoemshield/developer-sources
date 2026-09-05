/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class05031
 *  minecraft.class05033
 *  minecraft.class06551
 *  minecraft.class07049
 *  minecraft.class07491
 *  minecraft.class07611
 */
package minecraft;

import minecraft.class05031;
import minecraft.class05033;
import minecraft.class06551;
import minecraft.class07049;
import minecraft.class07491;
import minecraft.class07611;

public final class class05919
extends Enum<class05919>
implements class05033,
class07611<class07049> {
    public static final /* enum */ class05919 field_935 = new class05919("this", (class07491<? extends class07049>)class06551.N);
    public static final /* enum */ class05919 field_936 = new class05919("attacker", (class07491<? extends class07049>)class06551.R);
    public static final /* enum */ class05919 field_939 = new class05919("direct_attacker", (class07491<? extends class07049>)class06551.M);
    public static final /* enum */ class05919 field_937 = new class05919("attacking_player", (class07491<? extends class07049>)class06551.u);
    public static final /* enum */ class05919 field_61495 = new class05919("target_entity", (class07491<? extends class07049>)class06551.L);
    public static final /* enum */ class05919 field_61496 = new class05919("interacting_entity", (class07491<? extends class07049>)class06551.y);
    public static final class05031<class05919> field_45792;
    private final String field_941;
    private final class07491<? extends class07049> field_938;
    private static final /* synthetic */ class05919[] field_940;

    private class05919(String string2, class07491<? extends class07049> class074912) {
        this.field_941 = string2;
        this.field_938 = class074912;
    }

    public static class05919[] values() {
        return (class05919[])field_940.clone();
    }

    public static class05919 valueOf(String string) {
        return Enum.valueOf(class05919.class, string);
    }

    private static /* synthetic */ class05919[] y() {
        return new class05919[]{field_935, field_936, field_939, field_937, field_61495, field_61496};
    }

    public static class05919 N(String string) {
        class05919 class059192 = (class05919)field_45792.N(string);
        if (class059192 != null) {
            return class059192;
        }
        throw new IllegalArgumentException("Invalid entity target " + string);
    }

    public class07491<? extends class07049> N() {
        return this.field_938;
    }

    public String method_15434() {
        return this.field_941;
    }

    static {
        field_940 = class05919.y();
        field_45792 = class05033.N(class05919::values);
    }
}

