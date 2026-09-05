/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Preconditions
 */
package minecraft;

import com.google.common.base.Preconditions;

public final class class04659
extends Enum<class04659> {
    public static final /* enum */ class04659 field_34759 = new class04659(0, 180);
    public static final /* enum */ class04659 field_34760 = new class04659(1, 220);
    public static final /* enum */ class04659 field_34761 = new class04659(2, 255);
    public static final /* enum */ class04659 field_34762 = new class04659(3, 135);
    private static final class04659[] field_34765;
    public final int field_34763;
    public final int field_34764;
    private static final /* synthetic */ class04659[] field_34766;

    private class04659(int n2, int n3) {
        this.field_34763 = n2;
        this.field_34764 = n3;
    }

    static {
        field_34766 = class04659.N();
        field_34765 = new class04659[]{field_34759, field_34760, field_34761, field_34762};
    }

    public static class04659[] values() {
        return (class04659[])field_34766.clone();
    }

    public static class04659 valueOf(String string) {
        return Enum.valueOf(class04659.class, string);
    }

    static class04659 y(int n) {
        return field_34765[n];
    }

    public static class04659 N(int n) {
        Preconditions.checkPositionIndex((int)n, (int)field_34765.length, (String)"brightness id");
        return class04659.y(n);
    }

    private static /* synthetic */ class04659[] N() {
        return new class04659[]{field_34759, field_34760, field_34761, field_34762};
    }
}

