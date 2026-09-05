/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.StringReader
 *  minecraft.class02325
 *  minecraft.class02350
 */
package minecraft;

import com.mojang.brigadier.StringReader;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import minecraft.class00164;
import minecraft.class00174;
import minecraft.class02325;
import minecraft.class02350;

class class00156
implements class02350<StringReader> {
    private final Set<String> N = Stream.concat(Stream.of("false", "true"), class00174.i.keySet().stream().map(class00164::N)).collect(Collectors.toSet());

    class00156() {
    }

    public Stream<String> possibleValues(class02325<StringReader> class023252) {
        return this.N.stream();
    }
}

