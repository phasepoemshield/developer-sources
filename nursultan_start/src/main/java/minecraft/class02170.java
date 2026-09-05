/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.StringReader
 *  minecraft.class01894
 *  minecraft.class02325
 *  minecraft.class02350
 */
package minecraft;

import com.mojang.brigadier.StringReader;
import java.util.stream.Stream;
import minecraft.class01894;
import minecraft.class02325;
import minecraft.class02350;

public interface class02170
extends class02350<StringReader> {
    public Stream<class01894> y();

    default public Stream<String> possibleValues(class02325<StringReader> class023252) {
        return this.y().map(class01894::toString);
    }
}

