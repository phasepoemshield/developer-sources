/*
 * Decompiled with CFR 0.152.
 */
package minecraft;

import java.util.Collection;
import java.util.Locale;
import minecraft.class08387;

public class class08383
extends RuntimeException {
    private final Collection<class08387> N;

    public class08383(class08387 class083872, Collection<class08387> collection) {
        super(String.format(Locale.ROOT, "Unable to fit: %s - size: %dx%d - Maybe try a lower resolution resourcepack?", class083872.method_45816(), class083872.method_45807(), class083872.method_45815()));
        this.N = collection;
    }

    public Collection<class08387> N() {
        return this.N;
    }
}

