/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class03530
 *  minecraft.class03543
 *  minecraft.class03552
 */
package minecraft;

import java.util.Optional;
import minecraft.class02042;
import minecraft.class02055;
import minecraft.class03530;
import minecraft.class03543;
import minecraft.class03552;

public abstract class class02053<T>
implements class02055<T> {
    protected final class02042<T> u;

    protected class02053(class02042<T> class020422) {
        this.u = class020422;
    }

    @Override
    public Optional<class03552<T>> N(class03530<T> class035302) {
        return Optional.of(class03543.N(this.u, class035302));
    }
}

