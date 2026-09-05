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
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import minecraft.class00392;
import minecraft.class07701;

public class class05193
implements ArgumentType<UUID> {
    public static final SimpleCommandExceptionType N = new SimpleCommandExceptionType((Message)class00392.L((String)"argument.uuid.invalid"));
    private static final Collection<String> y = Arrays.asList("dd12be42-52a9-4a91-a8a1-11c01849e498");
    private static final Pattern L = Pattern.compile("^([-A-Fa-f0-9]+)");

    public UUID parse(StringReader stringReader) throws CommandSyntaxException {
        String string = stringReader.getRemaining();
        Matcher matcher = L.matcher(string);
        if (matcher.find()) {
            String string2 = matcher.group(1);
            try {
                UUID uUID = UUID.fromString(string2);
                stringReader.setCursor(stringReader.getCursor() + string2.length());
                return uUID;
            }
            catch (IllegalArgumentException illegalArgumentException) {
                // empty catch block
            }
        }
        throw N.createWithContext((ImmutableStringReader)stringReader);
    }

    public static UUID N(CommandContext<class07701> commandContext, String string) {
        return (UUID)commandContext.getArgument(string, UUID.class);
    }

    public static class05193 N() {
        return new class05193();
    }

    public Collection<String> getExamples() {
        return y;
    }
}

