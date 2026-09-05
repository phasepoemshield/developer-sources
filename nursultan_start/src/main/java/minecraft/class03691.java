/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  minecraft.class05033
 */
package minecraft;

import com.mojang.serialization.Codec;
import minecraft.class05033;

public final class class03691
extends Enum<class03691>
implements class05033 {
    public static final /* enum */ class03691 field_42285 = new class03691("never");
    public static final /* enum */ class03691 field_42286 = new class03691("when_caused_by_living_non_player");
    public static final /* enum */ class03691 field_42287 = new class03691("always");
    public static final Codec<class03691> field_42288;
    private final String field_42289;
    private static final /* synthetic */ class03691[] field_42290;

    private class03691(String string2) {
        this.field_42289 = string2;
    }

    public static class03691[] values() {
        return (class03691[])field_42290.clone();
    }

    public static class03691 valueOf(String string) {
        return Enum.valueOf(class03691.class, string);
    }

    private static /* synthetic */ class03691[] N() {
        return new class03691[]{field_42285, field_42286, field_42287};
    }

    public String method_15434() {
        return this.field_42289;
    }

    static {
        field_42290 = class03691.N();
        field_42288 = class05033.N(class03691::values);
    }
}

