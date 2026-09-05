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

final class class03035
extends Enum<class03035>
implements class04017 {
    public static final /* enum */ class03035 field_35600 = new class03035();
    static final class03979<class03035> field_35601;
    private static final /* synthetic */ class03035[] field_35602;

    public static class03035[] values() {
        return (class03035[])field_35602.clone();
    }

    public static class03035 valueOf(String string) {
        return Enum.valueOf(class03035.class, string);
    }

    private static /* synthetic */ class03035[] y() {
        return new class03035[]{field_35600};
    }

    public class04018 apply(class04039 class040392) {
        return class040392.i;
    }

    public class03979<? extends class04017> N() {
        return field_35601;
    }

    static {
        field_35602 = class03035.y();
        field_35601 = class03979.N((MapCodec)MapCodec.unit((Object)((Object)field_35600)));
    }
}

