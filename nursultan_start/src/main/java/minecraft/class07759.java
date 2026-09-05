/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.mojang.brigadier.ImmutableStringReader
 *  com.mojang.brigadier.Message
 *  com.mojang.brigadier.StringReader
 *  com.mojang.brigadier.arguments.ArgumentType
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.DynamicCommandExceptionType
 *  com.mojang.brigadier.exceptions.SimpleCommandExceptionType
 *  it.unimi.dsi.fastutil.objects.Object2IntMap
 *  it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap
 *  minecraft.class00392
 *  minecraft.class07001
 *  minecraft.class07701
 */
package minecraft;

import com.google.common.collect.Lists;
import com.mojang.brigadier.ImmutableStringReader;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.function.Predicate;
import minecraft.class00392;
import minecraft.class07001;
import minecraft.class07701;
import minecraft.class07709;
import minecraft.class07717;
import minecraft.class07755;
import minecraft.class07762;
import minecraft.class07773;
import minecraft.class07777;
import minecraft.class07779;
import minecraft.class07782;
import minecraft.class07793;
import minecraft.class07799;
import minecraft.class07805;

public class class07759
implements ArgumentType<class07793> {
    private static final Collection<String> R = Arrays.asList("foo", "foo.bar", "foo[0]", "[0]", "[]", "{foo=bar}");
    public static final SimpleCommandExceptionType N = new SimpleCommandExceptionType((Message)class00392.L((String)"arguments.nbtpath.node.invalid"));
    public static final SimpleCommandExceptionType y = new SimpleCommandExceptionType((Message)class00392.L((String)"arguments.nbtpath.too_deep"));
    public static final DynamicCommandExceptionType L = new DynamicCommandExceptionType(object -> class00392.y((String)"arguments.nbtpath.nothing_found", (Object[])new Object[]{object}));
    static final DynamicCommandExceptionType u = new DynamicCommandExceptionType(object -> class00392.y((String)"commands.data.modify.expected_list", (Object[])new Object[]{object}));
    static final DynamicCommandExceptionType i = new DynamicCommandExceptionType(object -> class00392.y((String)"commands.data.modify.invalid_index", (Object[])new Object[]{object}));
    private static final char M = '[';
    private static final char B = ']';
    private static final char Z = '{';
    private static final char z = '}';
    private static final char U = '\"';
    private static final char E = '\'';

    private static String y(StringReader stringReader) throws CommandSyntaxException {
        int n = stringReader.getCursor();
        while (stringReader.canRead() && class07759.N(stringReader.peek())) {
            stringReader.skip();
        }
        if (stringReader.getCursor() == n) {
            throw N.createWithContext((ImmutableStringReader)stringReader);
        }
        return stringReader.getString().substring(n, stringReader.getCursor());
    }

    private static boolean N(char c) {
        return c != ' ' && c != '\"' && c != '\'' && c != '[' && c != ']' && c != '.' && c != '{' && c != '}';
    }

    public static class07759 N() {
        return new class07759();
    }

    public class07793 parse(StringReader stringReader) throws CommandSyntaxException {
        ArrayList arrayList = Lists.newArrayList();
        int n = stringReader.getCursor();
        Object2IntOpenHashMap object2IntOpenHashMap = new Object2IntOpenHashMap();
        boolean bl = true;
        while (stringReader.canRead() && stringReader.peek() != ' ') {
            char c;
            class07773 class077732 = class07759.N(stringReader, bl);
            arrayList.add(class077732);
            object2IntOpenHashMap.put((Object)class077732, stringReader.getCursor() - n);
            bl = false;
            if (!stringReader.canRead() || (c = stringReader.peek()) == ' ' || c == '[' || c == '{') continue;
            stringReader.expect('.');
        }
        return new class07793(stringReader.getString().substring(n, stringReader.getCursor()), arrayList.toArray(new class07773[0]), (Object2IntMap<class07773>)object2IntOpenHashMap);
    }

    private static class07773 N(StringReader stringReader, boolean bl) throws CommandSyntaxException {
        return switch (stringReader.peek()) {
            case '{' -> {
                if (!bl) {
                    throw N.createWithContext((ImmutableStringReader)stringReader);
                }
                class07001 var2_2 = class07755.L(stringReader);
                yield new class07799(var2_2);
            }
            case '[' -> {
                stringReader.skip();
                char var2_3 = stringReader.peek();
                if (var2_3 == '{') {
                    class07001 var3_4 = class07755.L(stringReader);
                    stringReader.expect(']');
                    yield new class07762(var3_4);
                }
                if (var2_3 == ']') {
                    stringReader.skip();
                    yield class07782.N;
                }
                int var3_5 = stringReader.readInt();
                stringReader.expect(']');
                yield new class07777(var3_5);
            }
            case '\"', '\'' -> class07759.N(stringReader, stringReader.readString());
            default -> class07759.N(stringReader, class07759.y(stringReader));
        };
    }

    private static class07773 N(StringReader stringReader, String string) throws CommandSyntaxException {
        if (string.isEmpty()) {
            throw N.createWithContext((ImmutableStringReader)stringReader);
        }
        if (stringReader.canRead() && stringReader.peek() == '{') {
            class07001 class070012 = class07755.L(stringReader);
            return new class07779(string, class070012);
        }
        return new class07805(string);
    }

    public static class07793 N(CommandContext<class07701> commandContext, String string) {
        return (class07793)commandContext.getArgument(string, class07793.class);
    }

    static Predicate<class07709> N(class07001 class070012) {
        return class077092 -> class07717.N((class07709)class070012, class077092, true);
    }

    public Collection<String> getExamples() {
        return R;
    }
}

