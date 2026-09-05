/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.ImmutableMap$Builder
 *  minecraft.class00471
 *  minecraft.class03556
 *  minecraft.class04815
 *  minecraft.class06378
 *  minecraft.class07304
 *  minecraft.class08122
 */
package minecraft;

import com.google.common.collect.ImmutableMap;
import java.util.Map;
import minecraft.class00471;
import minecraft.class03556;
import minecraft.class04815;
import minecraft.class06378;
import minecraft.class07304;
import minecraft.class08122;

public class class04829
extends class00471<class04829> {
    private final ImmutableMap.Builder<class03556<class07304>, class06378> N = ImmutableMap.builder();
    private final boolean y;

    public class04829() {
        this(false);
    }

    public class04829(boolean bl) {
        this.y = bl;
    }

    public class08122 y() {
        return new class04815(this.R(), (Map)this.N.build(), this.y);
    }

    public class04829 N(class03556<class07304> class035562, class06378 class063782) {
        this.N.put(class035562, (Object)class063782);
        return this;
    }

    protected class04829 L() {
        return this;
    }
}

