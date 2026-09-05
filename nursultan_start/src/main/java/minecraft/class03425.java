/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 */
package minecraft;

import com.google.common.collect.Maps;
import java.util.Comparator;
import java.util.Map;
import java.util.function.Consumer;
import minecraft.class03428;
import minecraft.class03441;
import minecraft.class03444;
import minecraft.class03446;
import minecraft.class03456;

public class class03425 {
    int N;
    final Map<class03441, class03444> y = Maps.newTreeMap(Comparator.comparing(class034412 -> class034412.N()).thenComparing(class034412 -> class034412.y()));

    public void N(Consumer<class03428> consumer) {
        ++this.N;
        consumer.accept(new class03456(this, 0));
    }

    public String N(boolean bl) {
        StringBuilder stringBuilder = new StringBuilder();
        class03446 class034462 = new class03446(this, stringBuilder);
        this.y.forEach((class034412, class034442) -> {
            if (class034442.y == this.N && (bl || !class034442.L)) {
                class034442.N.N(class034462);
                class034442.L = true;
            }
        });
        return stringBuilder.toString();
    }
}

