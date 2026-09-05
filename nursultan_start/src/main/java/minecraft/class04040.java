/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  minecraft.class03979
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import minecraft.class03979;
import minecraft.class04017;
import minecraft.class04018;
import minecraft.class04039;

final class class04040
extends Enum<class04040>
implements class04017 {
    public static final /* enum */ class04040 field_35243 = new class04040();
    static final class03979<class04040> field_35244;
    private static final /* synthetic */ class04040[] field_35245;

    public static class04040[] values() {
        return (class04040[])field_35245.clone();
    }

    public static class04040 valueOf(String string) {
        return Enum.valueOf(class04040.class, string);
    }

    private static /* synthetic */ class04040[] y() {
        return new class04040[]{field_35243};
    }

    @Override
    public class04018 apply(class04039 class040392) {
        return class040392.u;
    }

    @Override
    public class03979<? extends class04017> N() {
        return field_35244;
    }

    static {
        field_35245 = class04040.y();
        field_35244 = class03979.N((MapCodec)MapCodec.unit((Object)field_35243));
    }
}

