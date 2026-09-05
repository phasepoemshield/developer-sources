/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  minecraft.class00751
 *  minecraft.class05946
 *  net.fabricmc.fabric.impl.biome.modification.BiomeModificationMarker
 */
package minecraft;

import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import minecraft.class00751;
import minecraft.class01012;
import minecraft.class01042;
import minecraft.class05946;
import net.fabricmc.fabric.impl.biome.modification.BiomeModificationMarker;

public class class01014
implements class01042,
BiomeModificationMarker {
    private final Map<? extends class05946<? extends class00751<?>>, ? extends class00751<?>> L;
    private boolean u;

    public class01014(Stream<class01012<?>> stream) {
        this.L = (Map)stream.collect(ImmutableMap.toImmutableMap(class01012::N, class01012::y));
    }

    public class01014(Map<? extends class05946<? extends class00751<?>>, ? extends class00751<?>> map) {
        this.L = Map.copyOf(map);
    }

    public class01014(List<? extends class00751<?>> list) {
        this.L = list.stream().collect(Collectors.toUnmodifiableMap(class00751::i, class007512 -> class007512));
    }

    public void fabric_markModified() {
        if (this.u) {
            throw new IllegalStateException("This dynamic registries instance has already been modified");
        }
        this.u = true;
    }

    @Override
    public <E> Optional<class00751<E>> method_46759(class05946<? extends class00751<? extends E>> class059462) {
        return Optional.ofNullable(this.L.get(class059462)).map(class007512 -> class007512);
    }

    @Override
    public Stream<class01012<?>> method_40311() {
        return this.L.entrySet().stream().map(class01012::N);
    }
}

