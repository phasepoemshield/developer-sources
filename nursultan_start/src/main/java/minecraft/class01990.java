/*
 * Decompiled with CFR 0.152.
 */
package minecraft;

public final class class01990
extends Enum<class01990> {
    public static final /* enum */ class01990 field_40634 = new class01990("building_blocks");
    public static final /* enum */ class01990 field_40635 = new class01990("decorations");
    public static final /* enum */ class01990 field_40636 = new class01990("redstone");
    public static final /* enum */ class01990 field_40637 = new class01990("transportation");
    public static final /* enum */ class01990 field_40638 = new class01990("tools");
    public static final /* enum */ class01990 field_40639 = new class01990("combat");
    public static final /* enum */ class01990 field_40640 = new class01990("food");
    public static final /* enum */ class01990 field_40641 = new class01990("brewing");
    public static final /* enum */ class01990 field_40642 = new class01990("misc");
    private final String field_40643;
    private static final /* synthetic */ class01990[] field_40644;

    private class01990(String string2) {
        this.field_40643 = string2;
    }

    public static class01990[] values() {
        return (class01990[])field_40644.clone();
    }

    public static class01990 valueOf(String string) {
        return Enum.valueOf(class01990.class, string);
    }

    private static /* synthetic */ class01990[] y() {
        return new class01990[]{field_40634, field_40635, field_40636, field_40637, field_40638, field_40639, field_40640, field_40641, field_40642};
    }

    public String N() {
        return this.field_40643;
    }

    static {
        field_40644 = class01990.y();
    }
}

