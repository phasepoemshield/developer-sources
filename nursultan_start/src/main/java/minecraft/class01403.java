/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.ImmutableList$Builder
 *  com.google.common.collect.Maps
 *  it.unimi.dsi.fastutil.objects.Object2BooleanMap
 *  it.unimi.dsi.fastutil.objects.Object2BooleanOpenHashMap
 *  minecraft.class00810
 *  minecraft.class00821
 *  minecraft.class00836
 *  minecraft.class01894
 *  minecraft.class02227
 *  minecraft.class03529
 *  minecraft.class04922
 *  minecraft.class05946
 *  minecraft.class06521
 *  minecraft.class08697
 */
package minecraft;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.objects.Object2BooleanMap;
import it.unimi.dsi.fastutil.objects.Object2BooleanOpenHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import minecraft.class00810;
import minecraft.class00821;
import minecraft.class00836;
import minecraft.class01385;
import minecraft.class01401;
import minecraft.class01406;
import minecraft.class01419;
import minecraft.class01432;
import minecraft.class01894;
import minecraft.class02227;
import minecraft.class03529;
import minecraft.class04922;
import minecraft.class05946;
import minecraft.class06521;
import minecraft.class08697;

public class class01403 {
    private class00836 N = class00836.L;
    private class02227 y = class02227.N;
    private final ImmutableList.Builder<class01419<?>> L = ImmutableList.builder();
    private final Object2BooleanMap<class05946<class06521<?>>> u = new Object2BooleanOpenHashMap();
    private final Map<class01894, class01385> i = Maps.newHashMap();
    private Optional<class00821> R = Optional.empty();
    private Optional<class08697> M = Optional.empty();

    public class01406 y() {
        return new class01406(this.N, this.y, (List<class01419<?>>)this.L.build(), this.u, this.i, this.R, this.M);
    }

    public class01403 N(class00810 class008102) {
        this.R = Optional.of(class008102.y());
        return this;
    }

    public class01403 N(class01894 class018942, boolean bl) {
        this.i.put(class018942, new class01401(bl));
        return this;
    }

    public class01403 N(class01894 class018942, Map<String, Boolean> map) {
        this.i.put(class018942, new class01432((Object2BooleanMap<String>)new Object2BooleanOpenHashMap(map)));
        return this;
    }

    public class01403 N(class08697 class086972) {
        this.M = Optional.of(class086972);
        return this;
    }

    public class01403 N(class02227 class022272) {
        this.y = class022272;
        return this;
    }

    public class01403 N(class00836 class008362) {
        this.N = class008362;
        return this;
    }

    public <T> class01403 N(class04922<T> class049222, class03529<T> class035292, class00836 class008362) {
        this.L.add(new class01419<T>(class049222, class035292, class008362));
        return this;
    }

    public class01403 N(class05946<class06521<?>> class059462, boolean bl) {
        this.u.put(class059462, bl);
        return this;
    }

    public static class01403 N() {
        return new class01403();
    }
}

