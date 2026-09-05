/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  minecraft.class00392
 *  minecraft.class03711
 *  minecraft.class04770
 *  minecraft.class05033
 *  minecraft.class05216
 *  minecraft.class06541
 *  minecraft.class07151
 */
package minecraft;

import com.mojang.serialization.Codec;
import minecraft.class00392;
import minecraft.class03711;
import minecraft.class04770;
import minecraft.class05033;
import minecraft.class05216;
import minecraft.class06541;
import minecraft.class07151;

public final class class07296
extends Enum<class07296>
implements class05033 {
    public static final /* enum */ class07296 field_1254 = new class07296("task", class06541.field_1060);
    public static final /* enum */ class07296 field_1250 = new class07296("challenge", class06541.field_1064);
    public static final /* enum */ class07296 field_1249 = new class07296("goal", class06541.field_1060);
    public static final Codec<class07296> field_47186;
    private final String field_1251;
    private final class06541 field_1255;
    private final class00392 field_26386;
    private static final /* synthetic */ class07296[] field_1253;

    private static /* synthetic */ class07296[] L() {
        return new class07296[]{field_1254, field_1250, field_1249};
    }

    private class07296(String string2, class06541 class065412) {
        this.field_1251 = string2;
        this.field_1255 = class065412;
        this.field_26386 = class00392.L((String)("advancements.toast." + string2));
    }

    static {
        field_1253 = class07296.L();
        field_47186 = class05033.N(class07296::values);
    }

    public static class07296[] values() {
        return (class07296[])field_1253.clone();
    }

    public static class07296 valueOf(String string) {
        return Enum.valueOf(class07296.class, string);
    }

    public class00392 y() {
        return this.field_26386;
    }

    public class06541 N() {
        return this.field_1255;
    }

    public class05216 N(class03711 class037112, class04770 class047702) {
        return class00392.N((String)("chat.type.advancement." + this.field_1251), (Object[])new Object[]{class047702.method_5476(), class07151.N((class03711)class037112)});
    }

    public String method_15434() {
        return this.field_1251;
    }
}

