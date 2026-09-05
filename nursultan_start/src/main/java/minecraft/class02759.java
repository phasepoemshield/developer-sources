/*
 * Decompiled with CFR 0.152.
 */
package minecraft;

public final class class02759
extends Enum<class02759> {
    public static final /* enum */ class02759 field_52681 = new class02759("left");
    public static final /* enum */ class02759 field_52682 = new class02759("right");
    private final String field_52683;
    private static final /* synthetic */ class02759[] field_52684;

    private class02759(String string2) {
        this.field_52683 = string2;
    }

    public String toString() {
        return this.field_52683;
    }

    public static class02759[] values() {
        return (class02759[])field_52684.clone();
    }

    public static class02759 valueOf(String string) {
        return Enum.valueOf(class02759.class, string);
    }

    private static /* synthetic */ class02759[] y() {
        return new class02759[]{field_52681, field_52682};
    }

    public class02759 N() {
        return this == field_52681 ? field_52682 : field_52681;
    }

    static {
        field_52684 = class02759.y();
    }
}

