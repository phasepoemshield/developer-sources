/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.Message
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.SimpleCommandExceptionType
 *  com.mojang.brigadier.tree.CommandNode
 *  com.mojang.brigadier.tree.LiteralCommandNode
 *  minecraft.class00392
 *  minecraft.class06839
 *  minecraft.class07686
 *  minecraft.class07701
 *  net.fabricmc.fabric.mixin.gamerule.GameRuleCommandAccessor
 */
package net.fabricmc.fabric.impl.gamerule;

import com.mojang.brigadier.Message;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.tree.CommandNode;
import com.mojang.brigadier.tree.LiteralCommandNode;
import minecraft.class00392;
import minecraft.class06839;
import minecraft.class07686;
import minecraft.class07701;
import net.fabricmc.fabric.impl.gamerule.RuleTypeExtensions;
import net.fabricmc.fabric.mixin.gamerule.GameRuleCommandAccessor;

public final class EnumRuleCommand {
    public static <E extends Enum<E>> void register(LiteralArgumentBuilder<class07701> literalArgumentBuilder, class06839<E> class068392) {
        String string = class068392.toString();
        literalArgumentBuilder.then(class07686.y((String)string).executes(commandContext -> GameRuleCommandAccessor.invokeExecuteQuery((class07701)((class07701)commandContext.getSource()), (class06839)class068392)));
        LiteralCommandNode literalCommandNode = class07686.y((String)string).build();
        for (Enum enum_ : ((RuleTypeExtensions)class068392).fabric_getSupportedEnumValues()) {
            literalCommandNode.addChild((CommandNode)((LiteralArgumentBuilder)class07686.y((String)enum_.toString()).executes(commandContext -> EnumRuleCommand.executeAndSetEnum((CommandContext<class07701>)commandContext, enum_, class068392))).build());
        }
        literalArgumentBuilder.then((CommandNode)literalCommandNode);
    }

    public static <E extends Enum<E>> int executeAndSetEnum(CommandContext<class07701> commandContext, E e, class06839<E> class068392) throws CommandSyntaxException {
        class07701 class077012 = (class07701)commandContext.getSource();
        try {
            class077012.R().method_64395().N(class068392, e, class077012.W());
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw new SimpleCommandExceptionType((Message)class00392.y((String)illegalArgumentException.getMessage())).create();
        }
        class077012.N(() -> class00392.N((String)"commands.gamerule.set", (Object[])new Object[]{class068392.N(), class068392.N((Object)e)}), true);
        return class068392.y(e);
    }
}

