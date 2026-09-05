/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.suggestion.Suggestions
 *  com.mojang.brigadier.suggestion.SuggestionsBuilder
 *  minecraft.class02477
 *  minecraft.class03556
 *  minecraft.class06581
 */
package minecraft;

import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import minecraft.class02477;
import minecraft.class03556;
import minecraft.class06581;

public interface class06777 {
    default public void N(Function<SuggestionsBuilder, CompletableFuture<Suggestions>> function) {
    }

    default public <T> void N(class02477<T> class024772) {
    }

    default public <T> void N(class02477<T> class024772, T t) {
    }

    default public void N(class03556<class06581> class035562) {
    }
}

