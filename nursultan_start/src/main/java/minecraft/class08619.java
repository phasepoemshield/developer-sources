/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00471
 *  minecraft.class03543
 *  minecraft.class06378
 *  minecraft.class07304
 *  minecraft.class08122
 */
package minecraft;

import java.util.Optional;
import minecraft.class00471;
import minecraft.class03543;
import minecraft.class06378;
import minecraft.class07304;
import minecraft.class08122;
import minecraft.class08611;

public class class08619
extends class00471<class08619> {
    private final class06378 N;
    private Optional<class03543<class07304>> y = Optional.empty();

    public class08619(class06378 class063782) {
        this.N = class063782;
    }

    public class08122 y() {
        return new class08611(this.R(), this.N, this.y);
    }

    protected class08619 L() {
        return this;
    }

    public class08619 N(class03543<class07304> class035432) {
        this.y = Optional.of(class035432);
        return this;
    }
}

