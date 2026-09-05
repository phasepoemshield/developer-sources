/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.StringReader
 *  com.mojang.brigadier.arguments.ArgumentType
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.suggestion.Suggestions
 *  com.mojang.brigadier.suggestion.SuggestionsBuilder
 *  minecraft.class00892
 *  minecraft.class00903
 *  minecraft.class00904
 *  minecraft.class01905
 *  minecraft.class04227
 *  minecraft.class04348
 *  minecraft.class07689
 */
package Nursultan;

import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.concurrent.CompletableFuture;
import minecraft.class00892;
import minecraft.class00903;
import minecraft.class00904;
import minecraft.class01905;
import minecraft.class04227;
import minecraft.class04348;
import minecraft.class07689;

public class class10747
implements ArgumentType<class00903> {
    public Object N_0;

    public class10747(class04348 class043482) {
        this.y();
        this.N_0 = class043482.y(class04227.Z);
    }

    private void y() {
    }

    public class00903 parse(StringReader stringReader) throws CommandSyntaxException {
        class00904 class009042 = class00892.N((class01905)((class01905)this.N_0), (StringReader)stringReader, (boolean)true);
        return new class00903(class009042.N(), class009042.y().keySet(), class009042.L());
    }

    public static class00903 N(CommandContext<class07689> commandContext, String string) {
        return (class00903)commandContext.getArgument(string, class00903.class);
    }

    public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> commandContext, SuggestionsBuilder suggestionsBuilder) {
        return class00892.N((class01905)((class01905)this.N_0), (SuggestionsBuilder)suggestionsBuilder, (boolean)false, (boolean)true);
    }
}

