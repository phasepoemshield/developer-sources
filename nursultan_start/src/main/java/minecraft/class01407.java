/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.Object2ObjectSortedMaps
 *  java.util.SequencedMap
 *  minecraft.class02579
 *  minecraft.class07311
 */
package minecraft;

import it.unimi.dsi.fastutil.objects.Object2ObjectSortedMaps;
import java.util.SequencedMap;
import minecraft.class01391;
import minecraft.class01422;
import minecraft.class02579;
import minecraft.class07311;

public interface class01407 {
    public static class01422 N(class02579 class025792) {
        return class01407.N((SequencedMap<class07311, class02579>)Object2ObjectSortedMaps.emptyMap(), class025792);
    }

    public static class01422 N(SequencedMap<class07311, class02579> sequencedMap, class02579 class025792) {
        return new class01422(class025792, sequencedMap);
    }

    public class01391 method_73477(class07311 var1);
}

