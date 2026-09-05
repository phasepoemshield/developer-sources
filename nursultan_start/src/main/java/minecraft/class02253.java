/*
 * Decompiled with CFR 0.152.
 */
package minecraft;

public final class class02253
extends Enum<class02253> {
    public static final /* enum */ class02253 field_33876 = new class02253("pathfinding");
    public static final /* enum */ class02253 field_29551 = new class02253("event-loops");
    public static final /* enum */ class02253 field_54068 = new class02253("consecutive-executors");
    public static final /* enum */ class02253 field_33877 = new class02253("ticking");
    public static final /* enum */ class02253 field_33878 = new class02253("jvm");
    public static final /* enum */ class02253 field_33879 = new class02253("chunk rendering");
    public static final /* enum */ class02253 field_33880 = new class02253("chunk rendering dispatching");
    public static final /* enum */ class02253 field_33881 = new class02253("cpu");
    public static final /* enum */ class02253 field_37416 = new class02253("gpu");
    private final String field_29553;
    private static final /* synthetic */ class02253[] field_29554;

    private class02253(String string2) {
        this.field_29553 = string2;
    }

    static {
        field_29554 = class02253.y();
    }

    public static class02253[] values() {
        return (class02253[])field_29554.clone();
    }

    public static class02253 valueOf(String string) {
        return Enum.valueOf(class02253.class, string);
    }

    private static /* synthetic */ class02253[] y() {
        return new class02253[]{field_33876, field_29551, field_54068, field_33877, field_33878, field_33879, field_33880, field_33881, field_37416};
    }

    public String N() {
        return this.field_29553;
    }
}

