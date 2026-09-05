/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class03802
 *  minecraft.class03824
 *  minecraft.class03849
 */
package minecraft;

import java.util.UUID;
import minecraft.class00232;
import minecraft.class03802;
import minecraft.class03824;
import minecraft.class03849;

class class00224
implements class03802 {
    class00224() {
    }

    public void N(UUID uUID, class03849 class038492) {
        class00232.N.debug("Downloaded pack {} changed state to {}", (Object)uUID, (Object)class038492);
    }

    public void N(UUID uUID, class03824 class038242) {
        class00232.N.debug("Downloaded pack {} finished with state {}", (Object)uUID, (Object)class038242);
    }
}

