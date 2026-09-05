/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.context.CommandContext
 *  minecraft.class06993
 *  minecraft.class07701
 */
package minecraft;

import com.mojang.brigadier.context.CommandContext;
import minecraft.class03940;
import minecraft.class06993;
import minecraft.class07701;

public class class03935
extends class03940<class06993> {
    private class03935() {
        super(class06993.field_39313, class06993::values);
    }

    public static class03935 N() {
        return new class03935();
    }

    public static class06993 N(CommandContext<class07701> commandContext, String string) {
        return (class06993)commandContext.getArgument(string, class06993.class);
    }
}

