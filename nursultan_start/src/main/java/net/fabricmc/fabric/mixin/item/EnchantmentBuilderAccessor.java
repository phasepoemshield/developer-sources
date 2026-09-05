/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class02477
 *  minecraft.class02676
 *  minecraft.class03543
 *  minecraft.class07286
 *  minecraft.class07304
 */
package net.fabricmc.fabric.mixin.item;

import java.util.List;
import minecraft.class02477;
import minecraft.class02676;
import minecraft.class03543;
import minecraft.class07286;
import minecraft.class07304;

public interface EnchantmentBuilderAccessor {
    public class07286 getDefinition();

    public class02676 getEffectMap();

    public class03543<class07304> getExclusiveSet();

    public <E> List<E> invokeGetEffectsList(class02477<List<E>> var1);
}

