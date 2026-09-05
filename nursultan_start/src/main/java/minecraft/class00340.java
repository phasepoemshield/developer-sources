/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01237
 *  minecraft.class01421
 *  minecraft.class03662
 *  minecraft.class06584
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import minecraft.class00368;
import minecraft.class01237;
import minecraft.class01421;
import minecraft.class03662;
import minecraft.class06584;
import org.jspecify.annotations.Nullable;

public interface class00340
extends class00368<Void> {
    public void N(class03662 var1, class01421 var2, class01237 var3, int var4, int var5, boolean var6, int var7);

    @Override
    default public void N(@Nullable Void void_, class03662 class036622, class01421 class014212, class01237 class012372, int n, int n2, boolean bl, int n3) {
        this.N(class036622, class014212, class012372, n, n2, bl, n3);
    }

    @Override
    default public @Nullable Void y(class06584 class065842) {
        return null;
    }
}

