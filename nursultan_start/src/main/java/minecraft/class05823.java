/*
 * Decompiled with CFR 0.152.
 */
package minecraft;

import minecraft.class05790;
import minecraft.class05827;

public final class class05823
extends Enum<class05823> {
    public static final /* enum */ class05823 field_15858 = new class05823(class05790.field_15870, class05827.field_15866);
    public static final /* enum */ class05823 field_15863 = new class05823(class05790.field_15873, class05827.field_15866);
    public static final /* enum */ class05823 field_15859 = new class05823(class05790.field_15870, class05827.field_15867);
    public static final /* enum */ class05823 field_15862 = new class05823(class05790.field_15873, class05827.field_15867);
    public static final /* enum */ class05823 field_15857 = new class05823(class05790.field_15870, class05827.field_15869);
    public static final /* enum */ class05823 field_15860 = new class05823(class05790.field_15873, class05827.field_15869);
    private final class05827 field_15864;
    private final class05790 field_15861;
    private static final /* synthetic */ class05823[] field_15865;

    private static /* synthetic */ class05823[] L() {
        return new class05823[]{field_15858, field_15863, field_15859, field_15862, field_15857, field_15860};
    }

    private class05823(class05790 class057902, class05827 class058272) {
        this.field_15864 = class058272;
        this.field_15861 = class057902;
    }

    static {
        field_15865 = class05823.L();
    }

    public static class05823[] values() {
        return (class05823[])field_15865.clone();
    }

    public static class05823 valueOf(String string) {
        return Enum.valueOf(class05823.class, string);
    }

    public class05827 y() {
        return this.field_15864;
    }

    public class05790 N() {
        return this.field_15861;
    }
}

