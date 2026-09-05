/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Sets
 *  com.mojang.serialization.Codec
 *  minecraft.class01396
 *  minecraft.class04770
 *  minecraft.class06584
 *  minecraft.class07049
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.mojang.serialization.Codec;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import minecraft.class00821;
import minecraft.class00844;
import minecraft.class01396;
import minecraft.class04770;
import minecraft.class06584;
import minecraft.class07049;
import org.jspecify.annotations.Nullable;

public class class00856
extends class01396<class00844> {
    public void N(class04770 class047702, Collection<class07049> collection, @Nullable class06584 class065842) {
        ArrayList arrayList = Lists.newArrayList();
        HashSet hashSet = Sets.newHashSet();
        for (class07049 class070492 : collection) {
            hashSet.add(class070492.method_5864());
            arrayList.add(class00821.y(class047702, class070492));
        }
        this.N_27(class047702, class008442 -> class008442.N(arrayList, hashSet.size(), class065842));
    }

    public Codec<class00844> N() {
        return class00844.N;
    }
}

