/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  minecraft.class03979
 *  minecraft.class04017
 *  minecraft.class04018
 *  minecraft.class04039
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import minecraft.class03979;
import minecraft.class04017;
import minecraft.class04018;
import minecraft.class04039;

final class class03017
extends Enum<class03017>
implements class04017 {
    public static final /* enum */ class03017 field_35260 = new class03017();
    static final class03979<class03017> field_35261;
    private static final /* synthetic */ class03017[] field_35262;

    public static class03017[] values() {
        return (class03017[])field_35262.clone();
    }

    public static class03017 valueOf(String string) {
        return Enum.valueOf(class03017.class, string);
    }

    private static /* synthetic */ class03017[] y() {
        return new class03017[]{field_35260};
    }

    public class04018 apply(class04039 class040392) {
        return class040392.y;
    }

    public class03979<? extends class04017> N() {
        return field_35261;
    }

    static {
        field_35262 = class03017.y();
        field_35261 = class03979.N((MapCodec)MapCodec.unit((Object)((Object)field_35260)));
    }
}

