/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  minecraft.class00392
 *  minecraft.class05033
 */
package minecraft;

import com.mojang.serialization.Codec;
import minecraft.class00392;
import minecraft.class05033;

public final class class01301
extends Enum<class01301>
implements class05033 {
    public static final /* enum */ class01301 field_18162 = new class01301("false", "options.off");
    public static final /* enum */ class01301 field_18163 = new class01301("fast", "options.clouds.fast");
    public static final /* enum */ class01301 field_18164 = new class01301("true", "options.clouds.fancy");
    public static final Codec<class01301> field_45285;
    private final String field_45286;
    private final class00392 field_64421;
    private static final /* synthetic */ class01301[] field_18168;

    private class01301(String string2, String string3) {
        this.field_45286 = string2;
        this.field_64421 = class00392.L((String)string3);
    }

    public static class01301[] values() {
        return (class01301[])field_18168.clone();
    }

    public static class01301 valueOf(String string) {
        return Enum.valueOf(class01301.class, string);
    }

    private static /* synthetic */ class01301[] y() {
        return new class01301[]{field_18162, field_18163, field_18164};
    }

    public class00392 N() {
        return this.field_64421;
    }

    public String method_15434() {
        return this.field_45286;
    }

    static {
        field_18168 = class01301.y();
        field_45285 = class05033.N(class01301::values);
    }
}

