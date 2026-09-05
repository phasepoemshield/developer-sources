/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Sets
 *  minecraft.class03529
 */
package minecraft;

import com.google.common.collect.Sets;
import java.util.Set;
import java.util.stream.Stream;
import minecraft.class00201;
import minecraft.class03529;

public class class00204 {
    private static final Set<class03529<class00201>> N = Sets.newHashSet();

    public static void y() {
        N.clear();
    }

    public static Stream<class03529<class00201>> N() {
        return N.stream();
    }

    public static void N(class03529<class00201> class035292) {
        N.add(class035292);
    }
}

