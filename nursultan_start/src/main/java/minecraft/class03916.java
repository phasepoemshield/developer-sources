/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.ImmutableList$Builder
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.Dynamic
 *  com.mojang.serialization.DynamicOps
 *  minecraft.class01042
 *  minecraft.class01929
 *  minecraft.class03519
 *  minecraft.class06584
 *  minecraft.class07536
 *  minecraft.class07709
 *  minecraft.class07713
 *  minecraft.class08044
 *  org.slf4j.Logger
 */
package minecraft;

import com.google.common.collect.ImmutableList;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import minecraft.class01042;
import minecraft.class01929;
import minecraft.class03519;
import minecraft.class06584;
import minecraft.class07536;
import minecraft.class07709;
import minecraft.class07713;
import minecraft.class08044;
import org.slf4j.Logger;

public class class03916 {
    private static final Logger y = LogUtils.getLogger();
    private static final int L = class08044.L();
    public static final Codec<class03916> N = Codec.PASSTHROUGH.listOf().validate(list -> class07536.N((List)list, (int)L)).xmap(class03916::new, class039162 -> class039162.R);
    private static final DynamicOps<class07709> u = class07713.N;
    private static final Dynamic<?> i = new Dynamic(u, (Object)((class07709)class06584.R.encodeStart(u, (Object)class06584.E).getOrThrow()));
    private List<Dynamic<?>> R;

    private class03916(List<Dynamic<?>> list) {
        this.R = list;
    }

    public class03916() {
        this(Collections.nCopies(L, i));
    }

    public void N(class08044 class080442, class01042 class010422) {
        class03519 var3 = class010422.N(u);
        ImmutableList.Builder builder = ImmutableList.builderWithExpectedSize((int)L);
        for (int i = 0; i < L; ++i) {
            class06584 class065842 = class080442.method_5438(i);
            Optional<Dynamic> optional = class06584.R.encodeStart((DynamicOps)var3, (Object)class065842).resultOrPartial(string -> y.warn("Could not encode hotbar item: {}", string)).map(class077092 -> new Dynamic(u, class077092));
            builder.add(optional.orElse(class03916.i));
        }
        this.R = builder.build();
    }

    public boolean N() {
        Iterator<Dynamic<?>> var1 = this.R.iterator();
        while (var1.hasNext()) {
            if (class03916.N(var1.next())) continue;
            return false;
        }
        return true;
    }

    private static boolean N(Dynamic<?> dynamic) {
        return i.equals(dynamic);
    }

    public List<class06584> N(class01929 class019292) {
        return this.R.stream().map(dynamic -> class06584.R.parse(class03519.N((Dynamic)dynamic, (class01929)class019292)).resultOrPartial(string -> y.warn("Could not parse hotbar item: {}", string)).orElse(class06584.E)).toList();
    }
}

