/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00379
 *  minecraft.class00876
 *  minecraft.class06029
 *  minecraft.class06237
 *  minecraft.class06695
 *  minecraft.class06710
 */
package minecraft;

import java.util.Optional;
import minecraft.class00379;
import minecraft.class00876;
import minecraft.class06029;
import minecraft.class06237;
import minecraft.class06695;
import minecraft.class06710;

class class00861
implements class06029<class00379, Optional<class06237>> {
    class00861() {
    }

    public Optional<class06237> y() {
        return Optional.empty();
    }

    public Optional<class06237> N(class00379 class003792) {
        return Optional.of(class003792);
    }

    public Optional<class06237> N(class00379 class003792, class00379 class003793) {
        class06710 class067102 = new class06710((class06695)class003792, (class06695)class003793);
        return Optional.of(new class00876(this, class003792, class003793, (class06695)class067102));
    }
}

