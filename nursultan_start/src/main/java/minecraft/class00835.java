/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  minecraft.class01396
 *  minecraft.class04770
 *  minecraft.class06584
 *  minecraft.class08044
 */
package minecraft;

import com.mojang.serialization.Codec;
import minecraft.class00843;
import minecraft.class01396;
import minecraft.class04770;
import minecraft.class06584;
import minecraft.class08044;

public class class00835
extends class01396<class00843> {
    private void N(class04770 class047702, class08044 class080442, class06584 class065842, int n, int n2, int n3) {
        this.N_27(class047702, class008432 -> class008432.N(class080442, class065842, n, n2, n3));
    }

    public void N(class04770 class047702, class08044 class080442, class06584 class065842) {
        int n = 0;
        int n2 = 0;
        int n3 = 0;
        for (int i = 0; i < class080442.method_5439(); ++i) {
            class06584 class065843 = class080442.method_5438(i);
            if (class065843.R()) {
                ++n2;
                continue;
            }
            ++n3;
            if (class065843.c() < class065843.U()) continue;
            ++n;
        }
        this.N(class047702, class080442, class065842, n, n2, n3);
    }

    public Codec<class00843> N() {
        return class00843.N;
    }
}

