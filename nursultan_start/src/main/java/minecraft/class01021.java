/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09429
 *  com.mojang.brigadier.ImmutableStringReader
 *  com.mojang.brigadier.Message
 *  com.mojang.brigadier.StringReader
 *  com.mojang.brigadier.arguments.ArgumentType
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.SimpleCommandExceptionType
 *  minecraft.class00392
 *  minecraft.class00883
 *  minecraft.class07701
 */
package minecraft;

import Nursultan.class09429;
import com.mojang.brigadier.ImmutableStringReader;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Arrays;
import java.util.Collection;
import minecraft.class00392;
import minecraft.class00883;
import minecraft.class07701;

public class class01021
implements ArgumentType<class09429> {
    private static final Collection<String> L = Arrays.asList("0", "~", "~-5");
    public static final SimpleCommandExceptionType N = new SimpleCommandExceptionType((Message)class00392.L((String)"argument.angle.incomplete"));
    public static final SimpleCommandExceptionType y = new SimpleCommandExceptionType((Message)class00392.L((String)"argument.angle.invalid"));

    public class09429 parse(StringReader stringReader) throws CommandSyntaxException {
        float f;
        if (!stringReader.canRead()) {
            throw N.createWithContext((ImmutableStringReader)stringReader);
        }
        boolean bl = class00883.y((StringReader)stringReader);
        float f2 = f = stringReader.canRead() && stringReader.peek() != ' ' ? stringReader.readFloat() : 0.0f;
        if (Float.isNaN(f) || Float.isInfinite(f)) {
            throw y.createWithContext((ImmutableStringReader)stringReader);
        }
        return new class09429(f, bl);
    }

    public static class01021 N() {
        return new class01021();
    }

    public static float N(CommandContext<class07701> commandContext, String string) {
        return ((class09429)commandContext.getArgument(string, class09429.class)).N((class07701)commandContext.getSource());
    }

    public Collection<String> getExamples() {
        return L;
    }
}

