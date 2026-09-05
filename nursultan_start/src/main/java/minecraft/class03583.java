/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.serialization.Codec
 *  minecraft.class03940
 *  minecraft.class05033
 *  minecraft.class07701
 *  minecraft.class07830
 */
package minecraft;

import com.mojang.brigadier.context.CommandContext;
import com.mojang.serialization.Codec;
import java.util.Arrays;
import java.util.Locale;
import minecraft.class03940;
import minecraft.class05033;
import minecraft.class07701;
import minecraft.class07830;

public class class03583
extends class03940<class07830> {
    private static final Codec<class07830> N = class05033.N(class03583::y, (T string) -> string.toLowerCase(Locale.ROOT));

    private class03583() {
        super(N, class03583::y);
    }

    private static class07830[] y() {
        return (class07830[])Arrays.stream(class07830.values()).filter(class07830::L).toArray(class07830[]::new);
    }

    protected String N(String string) {
        return string.toLowerCase(Locale.ROOT);
    }

    public static class03583 N() {
        return new class03583();
    }

    public static class07830 N(CommandContext<class07701> commandContext, String string) {
        return (class07830)commandContext.getArgument(string, class07830.class);
    }
}

