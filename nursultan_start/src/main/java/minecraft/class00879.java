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
 *  minecraft.class07185
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
import java.util.EnumSet;
import minecraft.class00392;
import minecraft.class07185;
import minecraft.class07701;

public class class00879
implements ArgumentType<EnumSet<class07185>> {
    private static final Collection<String> N = Arrays.asList("xyz", "x");
    private static final SimpleCommandExceptionType y = new SimpleCommandExceptionType((Message)class00392.L((String)"arguments.swizzle.invalid"));

    public EnumSet<class07185> parse(StringReader stringReader) throws CommandSyntaxException {
        EnumSet<class07185> var2 = EnumSet.noneOf(class07185.class);
        while (stringReader.canRead() && stringReader.peek() != ' ') {
            class07185 class071852 = switch (stringReader.read()) {
                case 'x' -> class07185.field_11048;
                case 'y' -> class07185.field_11052;
                case 'z' -> class07185.field_11051;
                default -> throw y.createWithContext((ImmutableStringReader)stringReader);
            };
            if (var2.contains(class071852)) {
                throw y.createWithContext((ImmutableStringReader)stringReader);
            }
            var2.add(class071852);
        }
        return var2;
    }

    public static class00879 N() {
        return new class00879();
    }

    public static EnumSet<class07185> N(CommandContext<class07701> commandContext, String string) {
        return (EnumSet)commandContext.getArgument(string, EnumSet.class);
    }

    public Collection<String> getExamples() {
        return N;
    }
}

