/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01894
 *  minecraft.class02834
 *  minecraft.class03556
 *  minecraft.class06378
 *  minecraft.class07463
 *  minecraft.class07468
 */
package minecraft;

import java.util.EnumSet;
import java.util.List;
import java.util.Set;
import minecraft.class01894;
import minecraft.class02834;
import minecraft.class03556;
import minecraft.class06378;
import minecraft.class07463;
import minecraft.class07468;
import minecraft.class07965;

public class class07968 {
    private final class01894 N;
    private final class03556<class07468> y;
    private final class07463 L;
    private final class06378 u;
    private final Set<class02834> i = EnumSet.noneOf(class02834.class);

    public class07968(class01894 class018942, class03556<class07468> class035562, class07463 class074632, class06378 class063782) {
        this.N = class018942;
        this.y = class035562;
        this.L = class074632;
        this.u = class063782;
    }

    public class07968 N(class02834 class028342) {
        this.i.add(class028342);
        return this;
    }

    public class07965 N() {
        return new class07965(this.N, this.y, this.L, this.u, List.copyOf(this.i));
    }
}

