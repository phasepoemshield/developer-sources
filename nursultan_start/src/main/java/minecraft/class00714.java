/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.ImmutableList$Builder
 *  minecraft.class00471
 *  minecraft.class03556
 *  minecraft.class06378
 *  minecraft.class07084
 *  minecraft.class08122
 */
package minecraft;

import com.google.common.collect.ImmutableList;
import java.util.List;
import minecraft.class00471;
import minecraft.class00678;
import minecraft.class00709;
import minecraft.class03556;
import minecraft.class06378;
import minecraft.class07084;
import minecraft.class08122;

public class class00714
extends class00471<class00714> {
    private final ImmutableList.Builder<class00678> N = ImmutableList.builder();

    public class08122 y() {
        return new class00709(this.R(), (List<class00678>)this.N.build());
    }

    protected class00714 L() {
        return this;
    }

    public class00714 N(class03556<class07084> class035562, class06378 class063782) {
        this.N.add((Object)new class00678(class035562, class063782));
        return this;
    }
}

