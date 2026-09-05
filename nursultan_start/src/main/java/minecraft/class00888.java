/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00379
 *  minecraft.class06029
 *  minecraft.class06695
 *  minecraft.class06710
 */
package minecraft;

import java.util.Optional;
import minecraft.class00379;
import minecraft.class06029;
import minecraft.class06695;
import minecraft.class06710;

class class00888
implements class06029<class00379, Optional<class06695>> {
    class00888() {
    }

    public Optional<class06695> y() {
        return Optional.empty();
    }

    public Optional<class06695> N(class00379 class003792) {
        return Optional.of(class003792);
    }

    public Optional<class06695> N(class00379 class003792, class00379 class003793) {
        return Optional.of(new class06710((class06695)class003792, (class06695)class003793));
    }
}

