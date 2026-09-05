/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class07209
 *  minecraft.class07211
 */
package minecraft;

import minecraft.class04064;
import minecraft.class04070;
import minecraft.class04085;
import minecraft.class04089;
import minecraft.class07209;
import minecraft.class07211;

public abstract class class04072
extends Enum<class04072> {
    public static final /* enum */ class04072 field_37598 = new class04070("SAME_POSITION", 0);
    public static final /* enum */ class04072 field_37599 = new class04085("SAME_PLANE", 1);
    public static final /* enum */ class04072 field_37600 = new class04064("WRAP_AROUND", 2);
    private static final /* synthetic */ class04072[] field_37601;

    public static class04072[] values() {
        return (class04072[])field_37601.clone();
    }

    public static class04072 valueOf(String string) {
        return Enum.valueOf(class04072.class, string);
    }

    private static /* synthetic */ class04072[] N() {
        return new class04072[]{field_37598, field_37599, field_37600};
    }

    public abstract class04089 N(class07209 var1, class07211 var2, class07211 var3);

    static {
        field_37601 = class04072.N();
    }
}

