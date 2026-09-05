/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.suggestion.SuggestionProvider
 *  com.mojang.brigadier.suggestion.SuggestionsBuilder
 *  minecraft.class01894
 *  minecraft.class04206
 *  minecraft.class07078
 *  minecraft.class07689
 */
package minecraft;

import com.mojang.brigadier.suggestion.SuggestionProvider;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;
import minecraft.class01894;
import minecraft.class04206;
import minecraft.class06801;
import minecraft.class07078;
import minecraft.class07689;

public class class06791 {
    private static final Map<class01894, SuggestionProvider<class07689>> u = new HashMap<class01894, SuggestionProvider<class07689>>();
    private static final class01894 i = class01894.y((String)"ask_server");
    public static final SuggestionProvider<class07689> N = class06791.N(i, (SuggestionProvider<class07689>)((SuggestionProvider)(commandContext, suggestionsBuilder) -> ((class07689)commandContext.getSource()).N(commandContext)));
    public static final SuggestionProvider<class07689> y = class06791.N(class01894.y((String)"available_sounds"), (SuggestionProvider<class07689>)((SuggestionProvider)(commandContext, suggestionsBuilder) -> class07689.N((Stream)((class07689)commandContext.getSource()).v(), (SuggestionsBuilder)suggestionsBuilder)));
    public static final SuggestionProvider<class07689> L = class06791.N(class01894.y((String)"summonable_entities"), (SuggestionProvider<class07689>)((SuggestionProvider)(commandContext, suggestionsBuilder) -> class07689.N(class04206.M.j().filter(class070782 -> class070782.N(((class07689)commandContext.getSource()).G()) && class070782.y()), (SuggestionsBuilder)suggestionsBuilder, class07078::N, class07078::M)));

    public static class01894 y(SuggestionProvider<?> suggestionProvider) {
        return suggestionProvider instanceof class06801 ? ((class06801)suggestionProvider).N() : i;
    }

    public static <S extends class07689> SuggestionProvider<S> N(class01894 class018942, SuggestionProvider<class07689> suggestionProvider) {
        if (u.putIfAbsent(class018942, suggestionProvider) != null) {
            throw new IllegalArgumentException("A command suggestion provider is already registered with the name '" + String.valueOf(class018942) + "'");
        }
        return new class06801(class018942, suggestionProvider);
    }

    public static <S extends class07689> SuggestionProvider<S> N(SuggestionProvider<class07689> suggestionProvider) {
        return suggestionProvider;
    }

    public static <S extends class07689> SuggestionProvider<S> N(class01894 class018942) {
        return class06791.N(u.getOrDefault(class018942, N));
    }
}

