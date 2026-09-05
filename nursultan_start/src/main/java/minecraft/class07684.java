/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.ParseResults
 *  com.mojang.brigadier.StringReader
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.context.ContextChain
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  minecraft.class01711
 *  minecraft.class01716
 *  minecraft.class01731
 *  minecraft.class01745
 *  minecraft.class01747
 *  minecraft.class01878
 *  minecraft.class01894
 *  minecraft.class07001
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.ParseResults;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.context.ContextChain;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.List;
import java.util.Optional;
import minecraft.class01711;
import minecraft.class01716;
import minecraft.class01731;
import minecraft.class01745;
import minecraft.class01747;
import minecraft.class01878;
import minecraft.class01894;
import minecraft.class07001;
import minecraft.class07686;
import org.jspecify.annotations.Nullable;

public interface class07684<T> {
    private static boolean y(CharSequence charSequence) {
        int n = charSequence.length();
        return n > 0 && charSequence.charAt(n - 1) == '\\';
    }

    public static <T extends class01711<T>> class07684<T> N(class01894 class018942, CommandDispatcher<T> commandDispatcher, T t, List<String> list) {
        class01745 class017452 = new class01745();
        for (int i = 0; i < list.size(); ++i) {
            String string;
            String string2;
            StringBuilder stringBuilder;
            int n = i + 1;
            String string3 = list.get(i).trim();
            if (class07684.y(string3)) {
                stringBuilder = new StringBuilder(string3);
                do {
                    if (++i == list.size()) {
                        throw new IllegalArgumentException("Line continuation at end of file");
                    }
                    stringBuilder.deleteCharAt(stringBuilder.length() - 1);
                    string2 = list.get(i).trim();
                    stringBuilder.append(string2);
                    class07684.N(stringBuilder);
                } while (class07684.y(stringBuilder));
                string = stringBuilder.toString();
            } else {
                string = string3;
            }
            class07684.N(string);
            stringBuilder = new StringReader(string);
            if (!stringBuilder.canRead() || stringBuilder.peek() == '#') continue;
            if (stringBuilder.peek() == '/') {
                stringBuilder.skip();
                if (stringBuilder.peek() == '/') {
                    throw new IllegalArgumentException("Unknown or invalid command '" + string + "' on line " + n + " (if you intended to make a comment, use '#' not '//')");
                }
                string2 = stringBuilder.readUnquotedString();
                throw new IllegalArgumentException("Unknown or invalid command '" + string + "' on line " + n + " (did you mean '" + string2 + "'? Do not use a preceding forwards slash.)");
            }
            if (stringBuilder.peek() == '$') {
                class017452.N(string.substring(1), n, t);
                continue;
            }
            try {
                class017452.N(class07684.N(commandDispatcher, t, (StringReader)stringBuilder));
                continue;
            }
            catch (CommandSyntaxException commandSyntaxException) {
                throw new IllegalArgumentException("Whilst parsing command on line " + n + ": " + commandSyntaxException.getMessage());
            }
        }
        return class017452.N(class018942);
    }

    public static <T extends class01711<T>> class01716<T> N(CommandDispatcher<T> commandDispatcher, T t, StringReader stringReader) throws CommandSyntaxException {
        ParseResults parseResults = commandDispatcher.parse(stringReader, t);
        class07686.N(parseResults);
        Optional optional = ContextChain.tryFlatten((CommandContext)parseResults.getContext().build(stringReader.getString()));
        if (optional.isEmpty()) {
            throw CommandSyntaxException.BUILT_IN_EXCEPTIONS.dispatcherUnknownCommand().createWithContext(parseResults.getReader());
        }
        return new class01731(stringReader.getString(), (ContextChain)optional.get());
    }

    public static void N(CharSequence charSequence) {
        if (charSequence.length() > 2000000) {
            CharSequence charSequence2 = charSequence.subSequence(0, Math.min(512, 2000000));
            throw new IllegalStateException("Command too long: " + charSequence.length() + " characters, contents: " + String.valueOf(charSequence2) + "...");
        }
    }

    public class01747<T> N(@Nullable class07001 var1, CommandDispatcher<T> var2) throws class01878;

    public class01894 N();
}

