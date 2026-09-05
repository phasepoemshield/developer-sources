/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.suggestion.SuggestionProvider
 *  com.mojang.brigadier.suggestion.SuggestionsBuilder
 *  minecraft.class00392
 *  minecraft.class01894
 *  minecraft.class05598
 *  minecraft.class05622
 *  minecraft.class07001
 *  minecraft.class07689
 *  minecraft.class07701
 *  minecraft.class07709
 *  minecraft.class07717
 *  minecraft.class07793
 */
package minecraft;

import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.suggestion.SuggestionProvider;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.Locale;
import java.util.function.Function;
import minecraft.class00392;
import minecraft.class01389;
import minecraft.class01418;
import minecraft.class01894;
import minecraft.class05598;
import minecraft.class05622;
import minecraft.class07001;
import minecraft.class07689;
import minecraft.class07701;
import minecraft.class07709;
import minecraft.class07717;
import minecraft.class07793;

public class class01413
implements class05598 {
    static final SuggestionProvider<class07701> N = (commandContext, suggestionsBuilder) -> class07689.N(class01413.N((CommandContext<class07701>)commandContext).N(), (SuggestionsBuilder)suggestionsBuilder);
    public static final Function<String, class05622> y = string -> new class01389((String)string);
    private final class01418 L;
    private final class01894 u;

    class01413(class01418 class014182, class01894 class018942) {
        this.L = class014182;
        this.u = class018942;
    }

    public class00392 y() {
        return class00392.N((String)"commands.data.storage.modified", (Object[])new Object[]{class00392.N((class01894)this.u)});
    }

    public class00392 N(class07793 class077932, double d, int n) {
        return class00392.N((String)"commands.data.storage.get", (Object[])new Object[]{class077932.N(), class00392.N((class01894)this.u), String.format(Locale.ROOT, "%.2f", d), n});
    }

    static class01418 N(CommandContext<class07701> commandContext) {
        return ((class07701)commandContext.getSource()).W().yZ();
    }

    public class00392 N(class07709 class077092) {
        return class00392.N((String)"commands.data.storage.query", (Object[])new Object[]{class00392.N((class01894)this.u), class07717.y((class07709)class077092)});
    }

    public class07001 N() {
        return this.L.N(this.u);
    }

    public void N(class07001 class070012) {
        this.L.N(this.u, class070012);
    }
}

