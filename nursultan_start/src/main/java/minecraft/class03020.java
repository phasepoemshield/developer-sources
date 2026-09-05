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

final class class03020
extends Enum<class03020>
implements class04017 {
    public static final /* enum */ class03020 field_35254 = new class03020();
    static final class03979<class03020> field_35255;
    private static final /* synthetic */ class03020[] field_35256;

    public static class03020[] values() {
        return (class03020[])field_35256.clone();
    }

    public static class03020 valueOf(String string) {
        return Enum.valueOf(class03020.class, string);
    }

    private static /* synthetic */ class03020[] y() {
        return new class03020[]{field_35254};
    }

    public class04018 apply(class04039 class040392) {
        return class040392.L;
    }

    public class03979<? extends class04017> N() {
        return field_35255;
    }

    static {
        field_35256 = class03020.y();
        field_35255 = class03979.N((MapCodec)MapCodec.unit((Object)((Object)field_35254)));
    }
}

