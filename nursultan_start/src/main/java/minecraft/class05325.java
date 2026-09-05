/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class02121
 *  minecraft.class02126
 */
package minecraft;

import java.util.function.IntFunction;
import minecraft.class02121;
import minecraft.class02126;

public final class class05325
extends Enum<class05325> {
    public static final /* enum */ class05325 field_23808 = new class05325(0);
    public static final /* enum */ class05325 field_23809 = new class05325(1);
    public static final /* enum */ class05325 field_23810 = new class05325(2);
    public static final /* enum */ class05325 field_23811 = new class05325(3);
    public static final /* enum */ class05325 field_23812 = new class05325(4);
    private static final IntFunction<class05325> field_23813;
    private final int field_23814;
    private static final /* synthetic */ class05325[] field_23815;

    private class05325(int n2) {
        this.field_23814 = n2;
    }

    public static class05325[] values() {
        return (class05325[])field_23815.clone();
    }

    public static class05325 valueOf(String string) {
        return Enum.valueOf(class05325.class, string);
    }

    private static /* synthetic */ class05325[] y() {
        return new class05325[]{field_23808, field_23809, field_23810, field_23811, field_23812};
    }

    public static class05325 N(int n) {
        return field_23813.apply(n);
    }

    public int N() {
        return this.field_23814;
    }

    static {
        field_23815 = class05325.y();
        field_23813 = class02121.N(class05325::N, (Object[])class05325.values(), (class02126)class02126.field_41665);
    }
}

