/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  minecraft.class00696
 *  minecraft.class01396
 *  minecraft.class04770
 *  minecraft.class05908
 *  minecraft.class06584
 *  minecraft.class07049
 */
package minecraft;

import com.mojang.serialization.Codec;
import java.util.Collection;
import minecraft.class00696;
import minecraft.class00821;
import minecraft.class00824;
import minecraft.class01396;
import minecraft.class04770;
import minecraft.class05908;
import minecraft.class06584;
import minecraft.class07049;

public class class00846
extends class01396<class00824> {
    public void N(class04770 class047702, class06584 class065842, class00696 class006962, Collection<class06584> collection) {
        class05908 class059082 = class00821.y(class047702, (class07049)(class006962.u() != null ? class006962.u() : class006962));
        this.N_27(class047702, class008242 -> class008242.N(class065842, class059082, collection));
    }

    public Codec<class00824> N() {
        return class00824.N;
    }
}

