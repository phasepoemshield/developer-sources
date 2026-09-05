/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  minecraft.class04891
 *  minecraft.class04909
 *  minecraft.class05033
 */
package minecraft;

import com.mojang.serialization.Codec;
import minecraft.class04891;
import minecraft.class04909;
import minecraft.class05033;

public final class class03699
extends Enum<class03699>
implements class05033 {
    public static final /* enum */ class03699 field_42275 = new class03699("hurt", class04909.GD);
    public static final /* enum */ class03699 field_42276 = new class03699("thorns", class04909.GD);
    public static final /* enum */ class03699 field_42277 = new class03699("drowning", class04909.Gh);
    public static final /* enum */ class03699 field_42278 = new class03699("burning", class04909.lN);
    public static final /* enum */ class03699 field_42279 = new class03699("poking", class04909.ly);
    public static final /* enum */ class03699 field_42280 = new class03699("freezing", class04909.Gr);
    public static final Codec<class03699> field_42281;
    private final String field_42282;
    private final class04891 field_42283;
    private static final /* synthetic */ class03699[] field_42284;

    private class03699(String string2, class04891 class048912) {
        this.field_42282 = string2;
        this.field_42283 = class048912;
    }

    public static class03699[] values() {
        return (class03699[])field_42284.clone();
    }

    public static class03699 valueOf(String string) {
        return Enum.valueOf(class03699.class, string);
    }

    private static /* synthetic */ class03699[] y() {
        return new class03699[]{field_42275, field_42276, field_42277, field_42278, field_42279, field_42280};
    }

    public class04891 N() {
        return this.field_42283;
    }

    public String method_15434() {
        return this.field_42282;
    }

    static {
        field_42284 = class03699.y();
        field_42281 = class05033.N(class03699::values);
    }
}

