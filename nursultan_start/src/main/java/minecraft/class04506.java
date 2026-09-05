/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class00404
 *  minecraft.class05220
 *  minecraft.class06069
 *  minecraft.class06541
 *  minecraft.class07078
 *  minecraft.class08983
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.util.function.Consumer;
import minecraft.class00392;
import minecraft.class00404;
import minecraft.class05220;
import minecraft.class06069;
import minecraft.class06541;
import minecraft.class07078;
import minecraft.class08983;
import org.jspecify.annotations.Nullable;

public interface class04506 {
    public void N(class07078<?> var1, class06069 var2);

    public static @Nullable class00392 N(@Nullable class08983<class00404<?>> class089832, String string) {
        if (class089832 == null) {
            return null;
        }
        return class089832.y().W(string).flatMap(class070012 -> class070012.W("entity")).flatMap(class070012 -> class070012.N_15("id", class07078.N)).map(class070782 -> class00392.L((String)class070782.R()).N(class06541.field_1080)).orElse(null);
    }

    public static void N(@Nullable class08983<class00404<?>> class089832, Consumer<class00392> consumer, String string) {
        class00392 class003922 = class04506.N(class089832, string);
        if (class003922 != null) {
            consumer.accept(class003922);
        } else {
            consumer.accept(class05220.N);
            consumer.accept((class00392)class00392.L((String)"block.minecraft.spawner.desc1").N(class06541.field_1080));
            consumer.accept((class00392)class05220.N().y((class00392)class00392.L((String)"block.minecraft.spawner.desc2").N(class06541.field_1078)));
        }
    }
}

