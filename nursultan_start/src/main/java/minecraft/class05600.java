/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.arguments.ArgumentType
 *  com.mojang.brigadier.builder.ArgumentBuilder
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  minecraft.class00394
 *  minecraft.class00894
 *  minecraft.class07209
 *  minecraft.class07686
 *  minecraft.class07701
 */
package minecraft;

import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.function.Function;
import minecraft.class00394;
import minecraft.class00894;
import minecraft.class05598;
import minecraft.class05608;
import minecraft.class05622;
import minecraft.class07209;
import minecraft.class07686;
import minecraft.class07701;

class class05600
implements class05622 {
    final /* synthetic */ String N;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    class05600(String string) {
        this.N = string;
    }

    @Override
    public class05598 N(CommandContext<class07701> commandContext) throws CommandSyntaxException {
        class07209 class072092 = class00894.N(commandContext, (String)(this.N + "Pos"));
        class00394 class003942 = ((class07701)commandContext.getSource()).R().method_8321(class072092);
        if (class003942 == null) {
            throw class05608.N.create();
        }
        return new class05608(class003942, class072092);
    }

    @Override
    public ArgumentBuilder<class07701, ?> N(ArgumentBuilder<class07701, ?> argumentBuilder, Function<ArgumentBuilder<class07701, ?>, ArgumentBuilder<class07701, ?>> function) {
        return argumentBuilder.then(class07686.y((String)"block").then(function.apply((ArgumentBuilder<class07701, ?>)class07686.N((String)(this.N + "Pos"), (ArgumentType)class00894.N()))));
    }
}

