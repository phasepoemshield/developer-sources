/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00500
 *  minecraft.class03787
 *  minecraft.class05033
 *  minecraft.class06665
 *  minecraft.class08092
 */
package minecraft;

import minecraft.class00500;
import minecraft.class03787;
import minecraft.class05033;
import minecraft.class06665;
import minecraft.class08092;

public final class class02019
extends Enum<class02019>
implements class05033 {
    public static final /* enum */ class02019 field_55158 = new class02019("wall");
    public static final /* enum */ class02019 field_55159 = new class02019("ceiling");
    public static final /* enum */ class02019 field_55160 = new class02019("ceiling_middle");
    private final String field_55161;
    private static final /* synthetic */ class02019[] field_55162;

    private class02019(String string2) {
        this.field_55161 = string2;
    }

    public static class02019[] values() {
        return (class02019[])field_55162.clone();
    }

    public static class02019 valueOf(String string) {
        return Enum.valueOf(class02019.class, string);
    }

    public static class02019 N(class00500 class005002) {
        if (class005002.i() instanceof class03787) {
            return (Boolean)class005002.L((class08092)class06665.N) != false ? field_55160 : field_55159;
        }
        return field_55158;
    }

    private static /* synthetic */ class02019[] N() {
        return new class02019[]{field_55158, field_55159, field_55160};
    }

    public String method_15434() {
        return this.field_55161;
    }

    static {
        field_55162 = class02019.N();
    }
}

