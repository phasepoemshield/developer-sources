/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  minecraft.class01903
 *  minecraft.class01921
 *  minecraft.class03530
 *  minecraft.class03552
 *  net.fabricmc.fabric.impl.tag.TagAliasEnabledRegistryWrapper
 */
package minecraft;

import com.google.common.collect.ImmutableMap;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Stream;
import minecraft.class00731;
import minecraft.class01903;
import minecraft.class01921;
import minecraft.class03530;
import minecraft.class03552;
import net.fabricmc.fabric.impl.tag.TagAliasEnabledRegistryWrapper;

class class00726<T>
implements class01903<T>,
TagAliasEnabledRegistryWrapper {
    final /* synthetic */ ImmutableMap N;
    final /* synthetic */ class00731 y;

    class00726(class00731 class007312, ImmutableMap immutableMap) {
        this.y = class007312;
        this.N = immutableMap;
    }

    public Stream<class03552<T>> u() {
        return this.N.values().stream();
    }

    public Optional<class03552<T>> N(class03530<T> class035302) {
        return Optional.ofNullable((class03552)this.N.get(class035302));
    }

    public class01921<T> N() {
        return this.y;
    }

    public void fabric_loadTagAliases(Map map) {
        ((TagAliasEnabledRegistryWrapper)this.N()).fabric_loadTagAliases(map);
    }
}

