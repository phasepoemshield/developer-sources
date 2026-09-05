/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Iterables
 *  com.mojang.brigadier.ImmutableStringReader
 *  com.mojang.brigadier.Message
 *  com.mojang.brigadier.StringReader
 *  com.mojang.brigadier.arguments.ArgumentType
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.SimpleCommandExceptionType
 *  com.mojang.brigadier.suggestion.Suggestions
 *  com.mojang.brigadier.suggestion.SuggestionsBuilder
 *  minecraft.class00392
 *  minecraft.class04770
 *  minecraft.class06790
 *  minecraft.class06794
 *  minecraft.class07049
 *  minecraft.class08162
 */
package minecraft;

import com.google.common.collect.Iterables;
import com.mojang.brigadier.ImmutableStringReader;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import minecraft.class00392;
import minecraft.class04770;
import minecraft.class06790;
import minecraft.class06794;
import minecraft.class07049;
import minecraft.class07689;
import minecraft.class07701;
import minecraft.class08162;

public class class07680
implements ArgumentType<class06794> {
    private static final Collection<String> Z = Arrays.asList("Player", "0123", "@e", "@e[type=foo]", "dd12be42-52a9-4a91-a8a1-11c01849e498");
    public static final SimpleCommandExceptionType N = new SimpleCommandExceptionType((Message)class00392.L((String)"argument.entity.toomany"));
    public static final SimpleCommandExceptionType y = new SimpleCommandExceptionType((Message)class00392.L((String)"argument.player.toomany"));
    public static final SimpleCommandExceptionType L = new SimpleCommandExceptionType((Message)class00392.L((String)"argument.player.entities"));
    public static final SimpleCommandExceptionType u = new SimpleCommandExceptionType((Message)class00392.L((String)"argument.entity.notfound.entity"));
    public static final SimpleCommandExceptionType i = new SimpleCommandExceptionType((Message)class00392.L((String)"argument.entity.notfound.player"));
    public static final SimpleCommandExceptionType R = new SimpleCommandExceptionType((Message)class00392.L((String)"argument.entity.selector.not_allowed"));
    final boolean M;
    final boolean B;

    public static Collection<? extends class07049> L(CommandContext<class07701> commandContext, String string) throws CommandSyntaxException {
        return ((class06794)commandContext.getArgument(string, class06794.class)).y((class07701)commandContext.getSource());
    }

    public static class07680 L() {
        return new class07680(true, true);
    }

    protected class07680(boolean bl, boolean bl2) {
        this.M = bl;
        this.B = bl2;
    }

    public static class04770 i(CommandContext<class07701> commandContext, String string) throws CommandSyntaxException {
        return ((class06794)commandContext.getArgument(string, class06794.class)).L((class07701)commandContext.getSource());
    }

    public static class07680 u() {
        return new class07680(false, true);
    }

    public static Collection<class04770> u(CommandContext<class07701> commandContext, String string) throws CommandSyntaxException {
        return ((class06794)commandContext.getArgument(string, class06794.class)).u((class07701)commandContext.getSource());
    }

    public static class07680 y() {
        return new class07680(false, false);
    }

    public static Collection<? extends class07049> y(CommandContext<class07701> commandContext, String string) throws CommandSyntaxException {
        Collection<? extends class07049> var2 = class07680.L(commandContext, string);
        if (var2.isEmpty()) {
            throw u.create();
        }
        return var2;
    }

    private class06794 N(StringReader stringReader, boolean bl) throws CommandSyntaxException {
        boolean bl2 = false;
        class06794 class067942 = new class06790(stringReader, bl).v();
        if (class067942.N() > 1 && this.M) {
            if (this.B) {
                stringReader.setCursor(0);
                throw y.createWithContext((ImmutableStringReader)stringReader);
            }
            stringReader.setCursor(0);
            throw N.createWithContext((ImmutableStringReader)stringReader);
        }
        if (class067942.y() && this.B && !class067942.L()) {
            stringReader.setCursor(0);
            throw L.createWithContext((ImmutableStringReader)stringReader);
        }
        return class067942;
    }

    public static class07049 N(CommandContext<class07701> commandContext, String string) throws CommandSyntaxException {
        return ((class06794)commandContext.getArgument(string, class06794.class)).N((class07701)commandContext.getSource());
    }

    public static class07680 N() {
        return new class07680(true, false);
    }

    public class06794 parse(StringReader stringReader) throws CommandSyntaxException {
        return this.N(stringReader, true);
    }

    public <S> class06794 parse(StringReader stringReader, S s) throws CommandSyntaxException {
        return this.N(stringReader, class06790.N(s));
    }

    public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> commandContext, SuggestionsBuilder suggestionsBuilder2) {
        Object object = commandContext.getSource();
        if (object instanceof class07689) {
            class07689 class076892 = (class07689)object;
            object = new StringReader(suggestionsBuilder2.getInput());
            object.setCursor(suggestionsBuilder2.getStart());
            class06790 class067902 = new class06790((StringReader)object, class076892.N().hasPermission(class08162.i));
            try {
                class067902.v();
            }
            catch (CommandSyntaxException commandSyntaxException) {
                // empty catch block
            }
            return class067902.N(suggestionsBuilder2, (T suggestionsBuilder) -> {
                Collection<String> var3 = class076892.b();
                class07689.y(this.B ? var3 : Iterables.concat(var3, class076892.ag_()), suggestionsBuilder);
            });
        }
        return Suggestions.empty();
    }

    public Collection<String> getExamples() {
        return Z;
    }

    public static Collection<class04770> R(CommandContext<class07701> commandContext, String string) throws CommandSyntaxException {
        List var2 = ((class06794)commandContext.getArgument(string, class06794.class)).u((class07701)commandContext.getSource());
        if (var2.isEmpty()) {
            throw i.create();
        }
        return var2;
    }
}

