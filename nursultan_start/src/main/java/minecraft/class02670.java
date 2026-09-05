/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  minecraft.class01894
 *  minecraft.class03556
 *  minecraft.class05235
 *  minecraft.class05483
 *  minecraft.class06386
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import minecraft.class01894;
import minecraft.class03556;
import minecraft.class05235;
import minecraft.class05483;
import minecraft.class06386;

public class class02670
implements class06386 {
    public static final Codec<class02670> N = RecordCodecBuilder.create(instance -> instance.group((App)class01894.N.listOf().fieldOf("fossil_structures").forGetter(class026702 -> class026702.y), (App)class01894.N.listOf().fieldOf("overlay_structures").forGetter(class026702 -> class026702.L), (App)class05235.u.fieldOf("fossil_processors").forGetter(class026702 -> class026702.u), (App)class05235.u.fieldOf("overlay_processors").forGetter(class026702 -> class026702.i), (App)Codec.intRange((int)0, (int)7).fieldOf("max_empty_corners_allowed").forGetter(class026702 -> class026702.M)).apply(instance, class02670::new));
    public final List<class01894> y;
    public final List<class01894> L;
    public final class03556<class05483> u;
    public final class03556<class05483> i;
    public final int M;

    public class02670(List<class01894> list, List<class01894> list2, class03556<class05483> class035562, class03556<class05483> class035563, int n) {
        if (list.isEmpty()) {
            throw new IllegalArgumentException("Fossil structure lists need at least one entry");
        }
        if (list.size() != list2.size()) {
            throw new IllegalArgumentException("Fossil structure lists must be equal lengths");
        }
        this.y = list;
        this.L = list2;
        this.u = class035562;
        this.i = class035563;
        this.M = n;
    }
}

