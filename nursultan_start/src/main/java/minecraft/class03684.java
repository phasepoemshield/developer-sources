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

public final class class03684
extends Enum<class03684>
implements class05033 {
    public static final /* enum */ class03684 field_42450 = new class03684("center");
    public static final /* enum */ class03684 field_42451 = new class03684("left");
    public static final /* enum */ class03684 field_42452 = new class03684("right");
    public static final Codec<class03684> field_42453;
    private final String field_42454;
    private static final /* synthetic */ class03684[] field_42455;

    private class03684(String string2) {
        this.field_42454 = string2;
    }

    static {
        field_42455 = class03684.N();
        field_42453 = class05033.N(class03684::values);
    }

    public static class03684[] values() {
        return (class03684[])field_42455.clone();
    }

    public static class03684 valueOf(String string) {
        return Enum.valueOf(class03684.class, string);
    }

    private static /* synthetic */ class03684[] N() {
        return new class03684[]{field_42450, field_42451, field_42452};
    }

    public String method_15434() {
        return this.field_42454;
    }
}

