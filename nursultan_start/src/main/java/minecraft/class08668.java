/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.Message
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.SimpleCommandExceptionType
 *  minecraft.class00042
 *  minecraft.class00392
 *  minecraft.class06794
 *  minecraft.class07049
 *  minecraft.class07701
 */
package minecraft;

import com.mojang.brigadier.Message;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import minecraft.class00042;
import minecraft.class00392;
import minecraft.class06794;
import minecraft.class07049;
import minecraft.class07701;

public class class08668 {
    public static final SimpleCommandExceptionType N = new SimpleCommandExceptionType((Message)class00392.L((String)"argument.waypoint.invalid"));

    public static class00042 N(CommandContext<class07701> commandContext, String string) throws CommandSyntaxException {
        class07049 class070492 = ((class06794)commandContext.getArgument(string, class06794.class)).N((class07701)commandContext.getSource());
        if (class070492 instanceof class00042) {
            return (class00042)class070492;
        }
        throw N.create();
    }
}

