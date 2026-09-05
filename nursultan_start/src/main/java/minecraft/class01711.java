/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.Message
 *  com.mojang.brigadier.ResultConsumer
 *  com.mojang.brigadier.exceptions.CommandExceptionType
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  minecraft.class03102
 *  minecraft.class08168
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.ResultConsumer;
import com.mojang.brigadier.exceptions.CommandExceptionType;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import minecraft.class01704;
import minecraft.class03102;
import minecraft.class08168;
import org.jspecify.annotations.Nullable;

public interface class01711<T extends class01711<T>>
extends class08168 {
    default public T w() {
        return this.y(class03102.N);
    }

    public class03102 T();

    public CommandDispatcher<T> l();

    public boolean d();

    public static <T extends class01711<T>> ResultConsumer<T> k() {
        return (commandContext, bl, n) -> ((class01711)commandContext.getSource()).T().onResult(bl, n);
    }

    public T y(class03102 var1);

    default public void N(CommandSyntaxException commandSyntaxException, boolean bl, @Nullable class01704 class017042) {
        this.N(commandSyntaxException.getType(), commandSyntaxException.getRawMessage(), bl, class017042);
    }

    public void N(CommandExceptionType var1, Message var2, boolean var3, @Nullable class01704 var4);
}

