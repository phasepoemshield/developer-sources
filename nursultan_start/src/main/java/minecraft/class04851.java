/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01224
 *  minecraft.class03298
 *  minecraft.class07001
 */
package minecraft;

import minecraft.class01224;
import minecraft.class03298;
import minecraft.class04878;
import minecraft.class04890;
import minecraft.class07001;

public interface class04851
extends class04878 {
    public class04890 load(class01224 var1, class07001 var2);

    @Override
    default public class04890 load(class03298 class032982, class07001 class070012) {
        return this.load(class032982.L(), class070012);
    }
}

