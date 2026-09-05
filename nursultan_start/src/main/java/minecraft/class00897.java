/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.ImmutableStringReader
 *  com.mojang.brigadier.Message
 *  com.mojang.brigadier.StringReader
 *  com.mojang.brigadier.arguments.ArgumentType
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.SimpleCommandExceptionType
 *  minecraft.class00392
 *  minecraft.class00863
 *  minecraft.class07701
 */
package minecraft;

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
import minecraft.class00863;
import minecraft.class00874;
import minecraft.class00883;
import minecraft.class07701;

public class class00897
implements ArgumentType<class00874> {
    private static final Collection<String> y = Arrays.asList("0 0", "~ ~", "~-5 ~5");
    public static final SimpleCommandExceptionType N = new SimpleCommandExceptionType((Message)class00392.L((String)"argument.rotation.incomplete"));

    public class00874 parse(StringReader stringReader) throws CommandSyntaxException {
        int n = stringReader.getCursor();
        if (!stringReader.canRead()) {
            throw N.createWithContext((ImmutableStringReader)stringReader);
        }
        class00883 class008832 = class00883.N(stringReader, false);
        if (!stringReader.canRead() || stringReader.peek() != ' ') {
            stringReader.setCursor(n);
            throw N.createWithContext((ImmutableStringReader)stringReader);
        }
        stringReader.skip();
        class00883 class008833 = class00883.N(stringReader, false);
        return new class00863(class008833, class008832, new class00883(true, 0.0));
    }

    public static class00897 N() {
        return new class00897();
    }

    public static class00874 N(CommandContext<class07701> commandContext, String string) {
        return (class00874)commandContext.getArgument(string, class00874.class);
    }

    public Collection<String> getExamples() {
        return y;
    }
}

