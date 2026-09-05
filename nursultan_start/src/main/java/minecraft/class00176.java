/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DataFixUtils
 *  minecraft.class02362
 *  minecraft.class02389
 *  minecraft.class03556
 *  minecraft.class04247
 *  minecraft.class06581
 *  minecraft.class06584
 */
package minecraft;

import com.mojang.datafixers.DataFixUtils;
import java.util.Optional;
import minecraft.class00146;
import minecraft.class00147;
import minecraft.class00148;
import minecraft.class00178;
import minecraft.class02362;
import minecraft.class02389;
import minecraft.class03556;
import minecraft.class04247;
import minecraft.class06581;
import minecraft.class06584;

public interface class00176 {
    public static final class00176 N = new class00178();
    public static final class02362<class04247, class00176> y = class02389.N(class00148.L).N_10(optional -> (class00176)DataFixUtils.orElse((Optional)optional, (Object)N), class001762 -> class001762 instanceof class00148 ? Optional.of((class00148)class001762) : Optional.empty());

    public static class00176 y(class06584 class065842, class00147 class001472) {
        if (class065842.R()) {
            return N;
        }
        return new class00148((class03556<class06581>)class065842.Z(), class065842.c(), class00146.N(class065842.u(), class001472));
    }

    public boolean N(class06584 var1, class00147 var2);
}

