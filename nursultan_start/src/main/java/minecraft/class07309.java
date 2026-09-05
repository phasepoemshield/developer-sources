/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.ImmutableList$Builder
 *  minecraft.class00389
 *  minecraft.class00494
 *  minecraft.class00734
 *  minecraft.class01128
 *  minecraft.class07003
 *  minecraft.class07042
 *  minecraft.class07049
 *  minecraft.class08036
 *  net.caffeinemc.mods.lithium.common.world.WorldHelper
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.UUID;
import java.util.function.Predicate;
import minecraft.class00389;
import minecraft.class00494;
import minecraft.class00734;
import minecraft.class01128;
import minecraft.class07003;
import minecraft.class07042;
import minecraft.class07049;
import minecraft.class08036;
import net.caffeinemc.mods.lithium.common.world.WorldHelper;
import org.jspecify.annotations.Nullable;

public interface class07309 {
    default public List<class00494> method_20743(@Nullable class07049 class070492, class00734 class007342) {
        Predicate<class07049> var3;
        if (class007342.N() < 1.0E-7) {
            return List.of();
        }
        Predicate<class07049> var11 = var3 = class070492 == null ? class07042.M : class07042.R.and(arg_0 -> ((class07049)class070492).method_30949(arg_0));
        class07309 class073092 = this;
        class07049 class070493 = class070492;
        class00734 class007343 = class007342.M(1.0E-7);
        List list = this.N(class073092, class070493, class007343, var11);
        if (list.isEmpty()) {
            return List.of();
        }
        ImmutableList.Builder builder = ImmutableList.builderWithExpectedSize((int)list.size());
        for (class07049 class070494 : list) {
            builder.add((Object)class00389.N((class00734)class070494.method_5829()));
        }
        return builder.build();
    }

    public List<? extends class08036> method_18456();

    default public @Nullable class08036 N(class07049 class070492, double d) {
        return this.N(class070492.method_23317(), class070492.method_23318(), class070492.method_23321(), d, false);
    }

    default public @Nullable class08036 N(double d, double d2, double d3, double d4, @Nullable Predicate<class07049> predicate) {
        double d5 = -1.0;
        class08036 class080362 = null;
        for (class08036 class080363 : this.method_18456()) {
            if (predicate != null && !predicate.test((class07049)class080363)) continue;
            double d6 = class080363.method_5649(d, d2, d3);
            if (!(d4 < 0.0) && !(d6 < d4 * d4) || d5 != -1.0 && !(d6 < d5)) continue;
            d5 = d6;
            class080362 = class080363;
        }
        return class080362;
    }

    private List N(class07309 class073092, class07049 class070492, class00734 class007342, Predicate predicate) {
        return WorldHelper.getOtherEntitiesForCollision((class07309)class073092, (class00734)class007342, (class07049)class070492, (Predicate)predicate);
    }

    default public @Nullable class08036 N(double d, double d2, double d3, double d4, boolean bl) {
        Predicate var10 = bl ? class07042.i : class07042.R;
        return this.N(d, d2, d3, d4, var10);
    }

    default public boolean N(double d, double d2, double d3, double d4) {
        for (class08036 class080362 : this.method_18456()) {
            if (!class07042.R.test(class080362) || !class07042.y.test(class080362)) continue;
            double d5 = class080362.method_5649(d, d2, d3);
            if (!(d4 < 0.0) && !(d5 < d4 * d4)) continue;
            return true;
        }
        return false;
    }

    default public @Nullable class08036 N(UUID uUID) {
        for (int i = 0; i < this.method_18456().size(); ++i) {
            class08036 class080362 = this.method_18456().get(i);
            if (!uUID.equals(class080362.method_5667())) continue;
            return class080362;
        }
        return null;
    }

    default public <T extends class07049> List<T> N(Class<T> clazz, class00734 class007342, Predicate<? super T> predicate) {
        return this.method_18023(class01128.N(clazz), class007342, predicate);
    }

    default public List<class07049> N_70(@Nullable class07049 class070492, class00734 class007342) {
        return this.method_8333(class070492, class007342, class07042.R);
    }

    default public <T extends class07049> List<T> N(Class<T> clazz, class00734 class007342) {
        return this.N(clazz, class007342, class07042.R);
    }

    public List<class07049> method_8333(@Nullable class07049 var1, class00734 var2, Predicate<? super class07049> var3);

    public <T extends class07049> List<T> method_18023(class01128<class07049, T> var1, class00734 var2, Predicate<? super T> var3);

    default public boolean method_8611(@Nullable class07049 class070492, class00494 class004942) {
        if (class004942.method_1110()) {
            return true;
        }
        for (class07049 class070493 : this.N_70(class070492, class004942.method_1107())) {
            if (class070493.method_31481() || !class070493.field_23807 || class070492 != null && class070493.method_5794(class070492) || !class00389.L((class00494)class004942, (class00494)class00389.N((class00734)class070493.method_5829()), (class07003)class07003.Z)) continue;
            return false;
        }
        return true;
    }
}

