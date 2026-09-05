/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class05031
 *  minecraft.class05033
 */
package minecraft;

import minecraft.class05031;
import minecraft.class05033;

public final class class06640
extends Enum<class06640>
implements class05033 {
    public static final /* enum */ class06640 field_1472 = new class06640("integer");
    public static final /* enum */ class06640 field_1471 = new class06640("hearts");
    private final String field_1469;
    public static final class05031<class06640> field_41683;
    private static final /* synthetic */ class06640[] field_1473;

    private class06640(String string2) {
        this.field_1469 = string2;
    }

    public static class06640[] values() {
        return (class06640[])field_1473.clone();
    }

    public static class06640 valueOf(String string) {
        return Enum.valueOf(class06640.class, string);
    }

    private static /* synthetic */ class06640[] y() {
        return new class06640[]{field_1472, field_1471};
    }

    public static class06640 N(String string) {
        return (class06640)field_41683.N(string, (Enum)field_1472);
    }

    public String N() {
        return this.field_1469;
    }

    public String method_15434() {
        return this.field_1469;
    }

    static {
        field_1473 = class06640.y();
        field_41683 = class05033.N(class06640::values);
    }
}

