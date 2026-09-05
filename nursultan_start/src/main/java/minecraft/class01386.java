/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.Object2ObjectLinkedOpenHashMap
 *  java.util.SequencedMap
 *  minecraft.class02579
 *  minecraft.class03130
 *  minecraft.class03950
 *  minecraft.class05911
 *  minecraft.class06851
 *  minecraft.class07311
 *  minecraft.class07536
 *  minecraft.class08743
 *  minecraft.class08874
 *  net.caffeinemc.mods.sodium.client.render.chunk.NonStoringBuilderPool
 */
package minecraft;

import it.unimi.dsi.fastutil.objects.Object2ObjectLinkedOpenHashMap;
import java.util.SequencedMap;
import minecraft.class01407;
import minecraft.class01422;
import minecraft.class01434;
import minecraft.class02579;
import minecraft.class03130;
import minecraft.class03950;
import minecraft.class05911;
import minecraft.class06851;
import minecraft.class07311;
import minecraft.class07536;
import minecraft.class08743;
import minecraft.class08874;
import net.caffeinemc.mods.sodium.client.render.chunk.NonStoringBuilderPool;

public class class01386 {
    private final class03950 N = new class03950();
    private final class03130 y;
    private final class01422 L;
    private final class01422 u;
    private final class01434 i;

    public class01422 L() {
        return this.L;
    }

    public class01386(int n) {
        int n2 = n;
        this.y = this.N(n2);
        SequencedMap sequencedMap = (SequencedMap)class07536.N((Object)new Object2ObjectLinkedOpenHashMap(), (T object2ObjectLinkedOpenHashMap) -> {
            object2ObjectLinkedOpenHashMap.put((Object)class05911.B(), (Object)this.N.N(class08743.field_60923));
            object2ObjectLinkedOpenHashMap.put((Object)class05911.Z(), (Object)this.N.N(class08743.field_60925));
            object2ObjectLinkedOpenHashMap.put((Object)class05911.z(), (Object)this.N.N(class08743.field_60926));
            class01386.N((Object2ObjectLinkedOpenHashMap<class07311, class02579>)object2ObjectLinkedOpenHashMap, class05911.U());
            class01386.N((Object2ObjectLinkedOpenHashMap<class07311, class02579>)object2ObjectLinkedOpenHashMap, class05911.y());
            class01386.N((Object2ObjectLinkedOpenHashMap<class07311, class02579>)object2ObjectLinkedOpenHashMap, class05911.L());
            class01386.N((Object2ObjectLinkedOpenHashMap<class07311, class02579>)object2ObjectLinkedOpenHashMap, class05911.u());
            class01386.N((Object2ObjectLinkedOpenHashMap<class07311, class02579>)object2ObjectLinkedOpenHashMap, class05911.i());
            class01386.N((Object2ObjectLinkedOpenHashMap<class07311, class02579>)object2ObjectLinkedOpenHashMap, class05911.R());
            object2ObjectLinkedOpenHashMap.put((Object)class05911.M(), (Object)new class02579(786432));
            class01386.N((Object2ObjectLinkedOpenHashMap<class07311, class02579>)object2ObjectLinkedOpenHashMap, class06851.R());
            class01386.N((Object2ObjectLinkedOpenHashMap<class07311, class02579>)object2ObjectLinkedOpenHashMap, class06851.B());
            class01386.N((Object2ObjectLinkedOpenHashMap<class07311, class02579>)object2ObjectLinkedOpenHashMap, class06851.M());
            class01386.N((Object2ObjectLinkedOpenHashMap<class07311, class02579>)object2ObjectLinkedOpenHashMap, class06851.Z());
            class01386.N((Object2ObjectLinkedOpenHashMap<class07311, class02579>)object2ObjectLinkedOpenHashMap, class06851.i());
        });
        this.L = class01407.N((SequencedMap<class07311, class02579>)sequencedMap, new class02579(786432));
        this.i = new class01434();
        SequencedMap sequencedMap2 = (SequencedMap)class07536.N((Object)new Object2ObjectLinkedOpenHashMap(), (T object2ObjectLinkedOpenHashMap) -> class08874.m.forEach(class073112 -> class01386.N((Object2ObjectLinkedOpenHashMap<class07311, class02579>)object2ObjectLinkedOpenHashMap, class073112)));
        this.u = class01407.N((SequencedMap<class07311, class02579>)sequencedMap2, new class02579(0));
    }

    public class01434 i() {
        return this.i;
    }

    public class01422 u() {
        return this.u;
    }

    public class03130 y() {
        return this.y;
    }

    private class03130 N(int n) {
        return new NonStoringBuilderPool();
    }

    private static void N(Object2ObjectLinkedOpenHashMap<class07311, class02579> object2ObjectLinkedOpenHashMap, class07311 class073112) {
        object2ObjectLinkedOpenHashMap.put((Object)class073112, (Object)new class02579(class073112.method_22722()));
    }

    public class03950 N() {
        return this.N;
    }
}

