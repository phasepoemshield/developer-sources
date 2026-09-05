/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.arguments.ArgumentType
 *  com.mojang.brigadier.builder.ArgumentBuilder
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  minecraft.class07680
 *  minecraft.class07686
 *  minecraft.class07701
 */
package minecraft;

import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.function.Function;
import minecraft.class05598;
import minecraft.class05605;
import minecraft.class05622;
import minecraft.class07680;
import minecraft.class07686;
import minecraft.class07701;

class class05614
implements class05622 {
    final /* synthetic */ String N;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    class05614(String string) {
        this.N = string;
    }

    @Override
    public class05598 N(CommandContext<class07701> commandContext) throws CommandSyntaxException {
        return new class05605(class07680.N(commandContext, (String)this.N));
    }

    @Override
    public ArgumentBuilder<class07701, ?> N(ArgumentBuilder<class07701, ?> argumentBuilder, Function<ArgumentBuilder<class07701, ?>, ArgumentBuilder<class07701, ?>> function) {
        return argumentBuilder.then(class07686.y((String)"entity").then(function.apply((ArgumentBuilder<class07701, ?>)class07686.N((String)this.N, (ArgumentType)class07680.N()))));
    }
}

