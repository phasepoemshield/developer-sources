/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01079
 *  minecraft.class01894
 */
package minecraft;

import java.util.function.Predicate;
import minecraft.class01079;
import minecraft.class01894;
import minecraft.class04214;

public interface class04205 {
    public void N(Predicate<class01894> var1);

    public void N(class01894 var1, class04214 var2);

    default public void N(class01894 class018942, class01079 class010792) {
        this.N(class018942, class016402 -> class016402.loadSprite(class018942, class010792));
    }
}

