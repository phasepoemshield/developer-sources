/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.arguments.ArgumentType
 *  com.mojang.brigadier.builder.ArgumentBuilder
 *  com.mojang.brigadier.context.CommandContext
 *  minecraft.class05598
 *  minecraft.class05622
 *  minecraft.class07686
 *  minecraft.class07701
 *  minecraft.class07778
 */
package minecraft;

import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import java.util.function.Function;
import minecraft.class01413;
import minecraft.class05598;
import minecraft.class05622;
import minecraft.class07686;
import minecraft.class07701;
import minecraft.class07778;

class class01389
implements class05622 {
    final /* synthetic */ String N;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    class01389(String string) {
        this.N = string;
    }

    public class05598 N(CommandContext<class07701> commandContext) {
        return new class01413(class01413.N(commandContext), class07778.N(commandContext, (String)this.N));
    }

    public ArgumentBuilder<class07701, ?> N(ArgumentBuilder<class07701, ?> argumentBuilder, Function<ArgumentBuilder<class07701, ?>, ArgumentBuilder<class07701, ?>> function) {
        return argumentBuilder.then(class07686.y((String)"storage").then(function.apply((ArgumentBuilder<class07701, ?>)class07686.N((String)this.N, (ArgumentType)class07778.N()).suggests(class01413.N))));
    }
}

