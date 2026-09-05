/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class11882
 *  Nursultan.class11929
 *  Nursultan.class11938
 *  minecraft.class06584
 */
package Nursultan;

import Nursultan.class11882;
import Nursultan.class11929;
import Nursultan.class11938;
import java.util.Optional;
import minecraft.class06584;

public class class11278 {
    public Optional<class11882> N(class06584 class065842, String string, long l) {
        if (!string.matches("^[\\s\\S]{3,16}$")) {
            return Optional.empty();
        }
        for (class11882 class118822 : class11938.n().y().values()) {
            if (!class118822.M() || (float)l / (float)class065842.c() > (float)Long.parseLong(class118822.Z().i()) || class065842.c() < class118822.E() || class11929.M((class06584)class065842) < class118822.N() || !class118822.test(class065842)) continue;
            return Optional.of(class118822);
        }
        return Optional.empty();
    }
}

