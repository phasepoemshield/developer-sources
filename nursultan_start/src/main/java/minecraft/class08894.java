/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class02484
 *  minecraft.class02687
 *  minecraft.class03448
 *  minecraft.class06289
 *  minecraft.class06584
 *  minecraft.class08934
 *  minecraft.class08961
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import minecraft.class02484;
import minecraft.class02687;
import minecraft.class03448;
import minecraft.class06289;
import minecraft.class06584;
import minecraft.class08934;
import minecraft.class08961;
import org.jspecify.annotations.Nullable;

final class class08894
extends class08934 {
    class08894(String string, int n, String string2) {
        super(string, n, string2);
    }

    public @Nullable class06289 N(class03448 class034482, class06584 class065842, @Nullable class08961 class089612) {
        class02687 class026872 = (class02687)class065842.method_58694(class02484.NP);
        return class026872 != null ? (class06289)class026872.N().orElse(null) : null;
    }
}

