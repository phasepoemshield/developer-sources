/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  minecraft.class00471
 *  minecraft.class08122
 */
package minecraft;

import com.google.common.collect.Lists;
import java.util.List;
import minecraft.class00471;
import minecraft.class07965;
import minecraft.class07968;
import minecraft.class07986;
import minecraft.class08122;

public class class07992
extends class00471<class07992> {
    private final boolean N;
    private final List<class07965> y = Lists.newArrayList();

    public class07992(boolean bl) {
        this.N = bl;
    }

    public class07992() {
        this(false);
    }

    public class08122 y() {
        return new class07986(this.R(), this.y, this.N);
    }

    public class07992 N(class07968 class079682) {
        this.y.add(class079682.N());
        return this;
    }

    protected class07992 L() {
        return this;
    }
}

