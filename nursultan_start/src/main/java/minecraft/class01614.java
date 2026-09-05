/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class04548
 *  minecraft.class06541
 *  minecraft.class08735
 */
package minecraft;

import minecraft.class00392;
import minecraft.class04548;
import minecraft.class06541;
import minecraft.class08735;

public final class class01614
extends Enum<class01614> {
    public static final /* enum */ class01614 field_14223 = new class01614("old");
    public static final /* enum */ class01614 field_14220 = new class01614("new");
    public static final /* enum */ class01614 field_61159 = new class01614("unknown");
    public static final /* enum */ class01614 field_14224 = new class01614("compatible");
    public static final int field_61160 = Integer.MAX_VALUE;
    private final class00392 field_14219;
    private final class00392 field_14222;
    private static final /* synthetic */ class01614[] field_14221;

    public class00392 L() {
        return this.field_14222;
    }

    private class01614(String string2) {
        this.field_14219 = class00392.L((String)("pack.incompatible." + string2)).N(class06541.field_1080);
        this.field_14222 = class00392.L((String)("pack.incompatible.confirm." + string2));
    }

    public static class01614[] values() {
        return (class01614[])field_14221.clone();
    }

    public static class01614 valueOf(String string) {
        return Enum.valueOf(class01614.class, string);
    }

    private static /* synthetic */ class01614[] u() {
        return new class01614[]{field_14223, field_14220, field_61159, field_14224};
    }

    public class00392 y() {
        return this.field_14219;
    }

    public static class01614 N(class04548<class08735> class045482, class08735 class087352) {
        if (((class08735)class045482.N()).y() == Integer.MAX_VALUE) {
            return field_61159;
        }
        if (((class08735)class045482.y()).compareTo(class087352) < 0) {
            return field_14223;
        }
        if (class087352.compareTo((class08735)class045482.N()) < 0) {
            return field_14220;
        }
        return field_14224;
    }

    public boolean N() {
        return this == field_14224;
    }

    static {
        field_14221 = class01614.u();
    }
}

