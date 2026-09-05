/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class05033
 *  minecraft.class07211
 */
package minecraft;

import minecraft.class05033;
import minecraft.class07211;

public final class class08059
extends Enum<class08059>
implements class05033 {
    public static final /* enum */ class08059 field_12609 = new class08059(class07211.field_11033);
    public static final /* enum */ class08059 field_12607 = new class08059(class07211.field_11036);
    private final class07211 field_47101;
    private static final /* synthetic */ class08059[] field_12608;

    private static /* synthetic */ class08059[] L() {
        return new class08059[]{field_12609, field_12607};
    }

    private class08059(class07211 class072112) {
        this.field_47101 = class072112;
    }

    public String toString() {
        return this.method_15434();
    }

    public static class08059[] values() {
        return (class08059[])field_12608.clone();
    }

    public static class08059 valueOf(String string) {
        return Enum.valueOf(class08059.class, string);
    }

    public class08059 y() {
        return this == field_12609 ? field_12607 : field_12609;
    }

    public class07211 N() {
        return this.field_47101;
    }

    public String method_15434() {
        return this == field_12609 ? "upper" : "lower";
    }

    static {
        field_12608 = class08059.L();
    }
}

