/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.ImmutableSet
 *  com.mojang.datafixers.util.Pair
 *  minecraft.class04142
 *  minecraft.class05367
 *  minecraft.class05378
 *  minecraft.class07438
 */
package minecraft;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Map;
import java.util.Set;
import minecraft.class04142;
import minecraft.class05367;
import minecraft.class05378;
import minecraft.class05736;
import minecraft.class05753;
import minecraft.class05769;
import minecraft.class07438;

public class class05747<E extends class07438>
extends class05736<E> {
    public class05747(List<Pair<? extends class04142<? super E>, Integer>> list) {
        this((Map<class05378<?>, class05367>)ImmutableMap.of(), (List<Pair<class04142<E>, Integer>>)list);
    }

    public class05747(Map<class05378<?>, class05367> map, List<Pair<? extends class04142<? super E>, Integer>> list) {
        super(map, (Set<class05378<?>>)ImmutableSet.of(), class05753.field_18349, class05769.field_18855, list);
    }
}

