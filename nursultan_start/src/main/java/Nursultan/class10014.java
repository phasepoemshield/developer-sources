/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.ImmutableList$Builder
 *  minecraft.class02824
 *  minecraft.class02831
 *  minecraft.class02833
 *  minecraft.class02834
 *  minecraft.class03556
 *  minecraft.class07468
 *  minecraft.class07471
 */
package Nursultan;

import com.google.common.collect.ImmutableList;
import java.util.List;
import minecraft.class02824;
import minecraft.class02831;
import minecraft.class02833;
import minecraft.class02834;
import minecraft.class03556;
import minecraft.class07468;
import minecraft.class07471;

public class class10014 {
    private final ImmutableList.Builder<class02824> N = ImmutableList.builder();

    public class02833 N() {
        return new class02833((List)this.N.build());
    }

    public class10014 N(class03556<class07468> class035562, class07471 class074712, class02834 class028342, class02831 class028312) {
        this.N.add((Object)new class02824(class035562, class074712, class028342, class028312));
        return this;
    }

    public class10014 N(class03556<class07468> class035562, class07471 class074712, class02834 class028342) {
        this.N.add((Object)new class02824(class035562, class074712, class028342));
        return this;
    }
}

