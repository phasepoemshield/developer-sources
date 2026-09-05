/*
 * Decompiled with CFR 0.152.
 */
package minecraft;

public final class class04038
extends Enum<class04038> {
    public static final /* enum */ class04038 field_35174 = new class04038("Probably not.", false);
    public static final /* enum */ class04038 field_35175 = new class04038("Very likely;", true);
    public static final /* enum */ class04038 field_35176 = new class04038("Definitely;", true);
    final String field_35177;
    final boolean field_35178;
    private static final /* synthetic */ class04038[] field_35179;

    private class04038(String string2, boolean bl) {
        this.field_35177 = string2;
        this.field_35178 = bl;
    }

    public static class04038[] values() {
        return (class04038[])field_35179.clone();
    }

    public static class04038 valueOf(String string) {
        return Enum.valueOf(class04038.class, string);
    }

    private static /* synthetic */ class04038[] N() {
        return new class04038[]{field_35174, field_35175, field_35176};
    }

    static {
        field_35179 = class04038.N();
    }
}

