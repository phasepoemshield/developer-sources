/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00752
 *  minecraft.class03530
 *  minecraft.class03552
 *  net.fabricmc.fabric.mixin.tag.SimpleRegistryTagLookup2Accessor
 */
package minecraft;

import java.util.Map;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.stream.Stream;
import minecraft.class00752;
import minecraft.class03530;
import minecraft.class03552;
import net.fabricmc.fabric.mixin.tag.SimpleRegistryTagLookup2Accessor;

class class00735<T>
implements class00752<T>,
SimpleRegistryTagLookup2Accessor {
    /* synthetic */ Map N;

    public /* synthetic */ void fabric_setTagMap(Map map) {
        this.N = map;
    }

    public /* synthetic */ Map fabric_getTagMap() {
        return this.N;
    }

    public Stream<class03552<T>> L() {
        return this.N.values().stream();
    }

    class00735(Map map) {
        this.N = map;
    }

    public boolean y() {
        return true;
    }

    public Optional<class03552<T>> N(class03530<T> class035302) {
        return Optional.ofNullable((class03552)this.N.get(class035302));
    }

    public void N(BiConsumer<? super class03530<T>, ? super class03552<T>> biConsumer) {
        this.N.forEach(biConsumer);
    }
}

