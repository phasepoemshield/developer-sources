/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  eu.pb4.placeholders.api.PlaceholderResult
 *  eu.pb4.placeholders.api.Placeholders
 *  it.unimi.dsi.fastutil.ints.IntIterator
 *  minecraft.class00392
 *  minecraft.class00760
 *  minecraft.class01894
 *  minecraft.class04782
 *  minecraft.class06541
 *  minecraft.class07428
 */
package eu.pb4.placeholders.impl.placeholder.builtin;

import eu.pb4.placeholders.api.PlaceholderResult;
import eu.pb4.placeholders.api.Placeholders;
import it.unimi.dsi.fastutil.ints.IntIterator;
import java.util.ArrayList;
import java.util.Locale;
import minecraft.class00392;
import minecraft.class00760;
import minecraft.class01894;
import minecraft.class04782;
import minecraft.class06541;
import minecraft.class07428;

public class WorldPlaceholders {
    static final int CHUNK_AREA = (int)Math.pow(17.0, 2.0);

    public static void register() {
        Placeholders.register((class01894)class01894.N((String)"world", (String)"time"), (placeholderContext, string) -> {
            class04782 class047822 = placeholderContext.player() != null ? placeholderContext.player().method_51469() : placeholderContext.server().NY();
            long l = (long)((double)class047822.method_8532() * 3.6 / 60.0);
            return PlaceholderResult.value((String)String.format("%02d:%02d", (l / 60L + 6L) % 24L, l % 60L));
        });
        Placeholders.register((class01894)class01894.N((String)"world", (String)"time_alt"), (placeholderContext, string) -> {
            class04782 class047822 = placeholderContext.player() != null ? placeholderContext.player().method_51469() : placeholderContext.server().NY();
            long l = (long)((double)class047822.method_8532() * 3.6 / 60.0);
            long l2 = (l / 60L + 6L) % 24L;
            long l3 = l2 % 12L;
            if (l3 == 0L) {
                l3 = 12L;
            }
            return PlaceholderResult.value((String)String.format("%02d:%02d %s", l3, l % 60L, l2 > 11L ? "PM" : "AM"));
        });
        Placeholders.register((class01894)class01894.N((String)"world", (String)"day"), (placeholderContext, string) -> {
            class04782 class047822 = placeholderContext.player() != null ? placeholderContext.player().method_51469() : placeholderContext.server().NY();
            return PlaceholderResult.value((String)("" + class047822.method_8532() / 24000L));
        });
        Placeholders.register((class01894)class01894.N((String)"world", (String)"id"), (placeholderContext, string) -> {
            class04782 class047822 = placeholderContext.player() != null ? placeholderContext.player().method_51469() : placeholderContext.server().NY();
            return PlaceholderResult.value((String)class047822.method_27983().N().toString());
        });
        Placeholders.register((class01894)class01894.N((String)"world", (String)"name"), (placeholderContext, string) -> {
            String[] stringArray;
            class04782 class047822 = placeholderContext.player() != null ? placeholderContext.player().method_51469() : placeholderContext.server().NY();
            ArrayList<String> arrayList = new ArrayList<String>();
            for (String string2 : stringArray = class047822.method_27983().N().N().split("_")) {
                CharSequence[] charSequenceArray = string2.split("", 2);
                charSequenceArray[0] = charSequenceArray[0].toUpperCase(Locale.ROOT);
                arrayList.add(String.join((CharSequence)"", charSequenceArray));
            }
            return PlaceholderResult.value((String)String.join((CharSequence)" ", arrayList));
        });
        Placeholders.register((class01894)class01894.N((String)"world", (String)"player_count"), (placeholderContext, string) -> {
            class04782 class047822 = placeholderContext.player() != null ? placeholderContext.player().method_51469() : placeholderContext.server().NY();
            return PlaceholderResult.value((String)("" + class047822.method_18456().size()));
        });
        Placeholders.register((class01894)class01894.N((String)"world", (String)"mob_count_colored"), (placeholderContext, string) -> {
            class04782 class047822 = placeholderContext.player() != null ? placeholderContext.player().method_51469() : placeholderContext.server().NY();
            class00760 class007602 = class047822.method_14178().b();
            class07428 class074282 = null;
            if (string != null) {
                class074282 = class07428.valueOf((String)string.toUpperCase(Locale.ROOT));
            }
            if (class074282 != null) {
                int n = class007602.y().getInt((Object)class074282);
                int n2 = class074282.y() * class007602.N() / CHUNK_AREA;
                return PlaceholderResult.value((class00392)(n > 0 ? class00392.y((String)("" + n)).N(n > n2 ? class06541.field_1076 : ((double)n > 0.8 * (double)n2 ? class06541.field_1061 : ((double)n > 0.5 * (double)n2 ? class06541.field_1065 : class06541.field_1060))) : class00392.y((String)"-").N(class06541.field_1080)));
            }
            int n = 0;
            for (class07428 class074283 : class07428.values()) {
                n += class074283.y();
            }
            n = n * class007602.N() / CHUNK_AREA;
            int n3 = 0;
            IntIterator intIterator = class007602.y().values().iterator();
            while (intIterator.hasNext()) {
                int n4 = (Integer)intIterator.next();
                n3 += n4;
            }
            return PlaceholderResult.value((class00392)(n3 > 0 ? class00392.y((String)("" + n3)).N(n3 > n ? class06541.field_1076 : ((double)n3 > 0.8 * (double)n ? class06541.field_1061 : ((double)n3 > 0.5 * (double)n ? class06541.field_1065 : class06541.field_1060))) : class00392.y((String)"-").N(class06541.field_1080)));
        });
        Placeholders.register((class01894)class01894.N((String)"world", (String)"mob_count"), (placeholderContext, string) -> {
            class04782 class047822 = placeholderContext.player() != null ? placeholderContext.player().method_51469() : placeholderContext.server().NY();
            class00760 class007602 = class047822.method_14178().b();
            class07428 class074282 = null;
            if (string != null) {
                class074282 = class07428.valueOf((String)string.toUpperCase(Locale.ROOT));
            }
            if (class074282 != null) {
                return PlaceholderResult.value((String)("" + class007602.y().getInt((Object)class074282)));
            }
            int n = 0;
            IntIterator intIterator = class007602.y().values().iterator();
            while (intIterator.hasNext()) {
                int n2 = (Integer)intIterator.next();
                n += n2;
            }
            return PlaceholderResult.value((String)("" + n));
        });
        Placeholders.register((class01894)class01894.N((String)"world", (String)"mob_cap"), (placeholderContext, string) -> {
            class04782 class047822 = placeholderContext.player() != null ? placeholderContext.player().method_51469() : placeholderContext.server().NY();
            class00760 class007602 = class047822.method_14178().b();
            class07428 class074282 = null;
            if (string != null) {
                class074282 = class07428.valueOf((String)string.toUpperCase(Locale.ROOT));
            }
            if (class074282 != null) {
                return PlaceholderResult.value((String)("" + class074282.y() * class007602.N() / CHUNK_AREA));
            }
            int n = 0;
            for (class07428 class074283 : class07428.values()) {
                n += class074283.y();
            }
            return PlaceholderResult.value((String)("" + n * class007602.N() / CHUNK_AREA));
        });
        Placeholders.register((class01894)class01894.N((String)"world", (String)"weather"), (placeholderContext, string) -> {
            Object object = placeholderContext.entity() != null ? placeholderContext.entity().method_73183() : placeholderContext.source().R();
            return PlaceholderResult.value((String)(object.method_8546() ? "rain & thunder" : (object.method_8419() ? "rain" : "clear")));
        });
    }
}

