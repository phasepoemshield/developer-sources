/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class03298
 *  minecraft.class07001
 */
package minecraft;

import minecraft.class03298;
import minecraft.class04878;
import minecraft.class04890;
import minecraft.class07001;

public interface class04880
extends class04878 {
    public class04890 load(class07001 var1);

    @Override
    default public class04890 load(class03298 class032982, class07001 class070012) {
        return this.load(class070012);
    }
}

