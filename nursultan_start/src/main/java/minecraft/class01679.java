/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.arguments.ArgumentType
 *  com.mojang.brigadier.builder.ArgumentBuilder
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.builder.RequiredArgumentBuilder
 *  minecraft.class01894
 *  minecraft.class03461
 *  minecraft.class06791
 *  minecraft.class07263
 *  minecraft.class07686
 *  minecraft.class08164
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import java.util.function.Predicate;
import minecraft.class01683;
import minecraft.class01894;
import minecraft.class03461;
import minecraft.class06791;
import minecraft.class07263;
import minecraft.class07686;
import minecraft.class08164;
import org.jspecify.annotations.Nullable;

class class01679
implements class07263<class03461> {
    class01679() {
    }

    public ArgumentBuilder<class03461, ?> N(ArgumentBuilder<class03461, ?> argumentBuilder, boolean bl, boolean bl2) {
        if (bl) {
            argumentBuilder.executes(commandContext -> 0);
        }
        if (bl2) {
            argumentBuilder.requires((Predicate)class07686.N((class08164)class01683.y));
        }
        return argumentBuilder;
    }

    public ArgumentBuilder<class03461, ?> N(String string, ArgumentType<?> argumentType, @Nullable class01894 class018942) {
        RequiredArgumentBuilder requiredArgumentBuilder = RequiredArgumentBuilder.argument((String)string, argumentType);
        if (class018942 != null) {
            requiredArgumentBuilder.suggests(class06791.N((class01894)class018942));
        }
        return requiredArgumentBuilder;
    }

    public ArgumentBuilder<class03461, ?> N(String string) {
        return LiteralArgumentBuilder.literal((String)string);
    }
}

