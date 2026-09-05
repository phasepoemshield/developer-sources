/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.Hash$Strategy
 *  it.unimi.dsi.fastutil.objects.ObjectLinkedOpenCustomHashSet
 *  minecraft.class06584
 */
package minecraft;

import it.unimi.dsi.fastutil.Hash;
import it.unimi.dsi.fastutil.objects.ObjectLinkedOpenCustomHashSet;
import java.util.Set;
import minecraft.class03799;
import minecraft.class06584;

public class class03778 {
    private static final Hash.Strategy<? super class06584> N = new class03799();

    public static Set<class06584> N() {
        return new ObjectLinkedOpenCustomHashSet(N);
    }
}

