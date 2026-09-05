/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.suggestion.SuggestionProvider
 *  com.mojang.brigadier.tree.ArgumentCommandNode
 *  com.mojang.brigadier.tree.CommandNode
 *  minecraft.class01894
 *  minecraft.class06791
 *  minecraft.class07273
 *  minecraft.class07686
 *  minecraft.class07701
 *  minecraft.class08152
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.brigadier.suggestion.SuggestionProvider;
import com.mojang.brigadier.tree.ArgumentCommandNode;
import com.mojang.brigadier.tree.CommandNode;
import minecraft.class01894;
import minecraft.class06791;
import minecraft.class07273;
import minecraft.class07686;
import minecraft.class07701;
import minecraft.class08152;
import org.jspecify.annotations.Nullable;

class class07704
implements class07273<class07701> {
    private final class07701 N = class07686.N((class08152)class08152.M);

    class07704() {
    }

    public boolean y(CommandNode<class07701> commandNode) {
        return !commandNode.getRequirement().test(this.N);
    }

    public @Nullable class01894 N(ArgumentCommandNode<class07701, ?> argumentCommandNode) {
        SuggestionProvider suggestionProvider = argumentCommandNode.getCustomSuggestions();
        return suggestionProvider != null ? class06791.y((SuggestionProvider)suggestionProvider) : null;
    }

    public boolean N(CommandNode<class07701> commandNode) {
        return commandNode.getCommand() != null;
    }
}

