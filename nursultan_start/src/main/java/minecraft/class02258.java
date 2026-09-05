/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  minecraft.class05033
 *  minecraft.class07211
 */
package minecraft;

import com.mojang.serialization.Codec;
import minecraft.class05033;
import minecraft.class07211;

public final class class02258
extends Enum<class02258>
implements class05033 {
    public static final /* enum */ class02258 field_29313 = new class02258(class07211.field_11036, 1, "ceiling");
    public static final /* enum */ class02258 field_29314 = new class02258(class07211.field_11033, -1, "floor");
    public static final Codec<class02258> field_29315;
    private final class07211 field_29316;
    private final int field_29317;
    private final String field_29318;
    private static final /* synthetic */ class02258[] field_29320;

    private static /* synthetic */ class02258[] L() {
        return new class02258[]{field_29313, field_29314};
    }

    private class02258(class07211 class072112, int n2, String string2) {
        this.field_29316 = class072112;
        this.field_29317 = n2;
        this.field_29318 = string2;
    }

    public static class02258[] values() {
        return (class02258[])field_29320.clone();
    }

    public static class02258 valueOf(String string) {
        return Enum.valueOf(class02258.class, string);
    }

    public int y() {
        return this.field_29317;
    }

    public class07211 N() {
        return this.field_29316;
    }

    public String method_15434() {
        return this.field_29318;
    }

    static {
        field_29320 = class02258.L();
        field_29315 = class05033.N(class02258::values);
    }
}

