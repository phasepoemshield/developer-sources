/*
 * Decompiled with CFR 0.152.
 */
package minecraft;

public final class class02024
extends Enum<class02024> {
    public static final /* enum */ class02024 field_39367 = new class02024("data");
    public static final /* enum */ class02024 field_39368 = new class02024("assets");
    public static final /* enum */ class02024 field_39369 = new class02024("reports");
    final String field_39370;
    private static final /* synthetic */ class02024[] field_39371;

    private class02024(String string2) {
        this.field_39370 = string2;
    }

    static {
        field_39371 = class02024.N();
    }

    public static class02024[] values() {
        return (class02024[])field_39371.clone();
    }

    public static class02024 valueOf(String string) {
        return Enum.valueOf(class02024.class, string);
    }

    private static /* synthetic */ class02024[] N() {
        return new class02024[]{field_39367, field_39368, field_39369};
    }
}

