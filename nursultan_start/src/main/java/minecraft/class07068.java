/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Sets
 *  minecraft.class00143
 *  minecraft.class00783
 *  minecraft.class01763
 *  minecraft.class02119
 *  minecraft.class02253
 *  minecraft.class04604
 *  minecraft.class04643
 *  minecraft.class05334
 *  minecraft.class07209
 *  minecraft.class08700
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.BooleanSupplier;
import java.util.function.Function;
import java.util.stream.Collectors;
import minecraft.class00143;
import minecraft.class00783;
import minecraft.class01763;
import minecraft.class02119;
import minecraft.class02253;
import minecraft.class04604;
import minecraft.class04643;
import minecraft.class05334;
import minecraft.class07079;
import minecraft.class07209;
import minecraft.class08700;
import org.jspecify.annotations.Nullable;

public class class07068 {
    private static final float N = 1.5f;
    private final class01763[] y = new class01763[32];
    private int L;
    private final class02119 u;
    private final class05334 i = new class05334();
    private BooleanSupplier R = () -> false;

    public class07068(class02119 class021192, int n) {
        this.u = class021192;
        this.L = n;
    }

    private class00143 N(class01763 class017632, class07209 class072092, boolean bl) {
        ArrayList arrayList = Lists.newArrayList();
        class01763 class017633 = class017632;
        arrayList.add(0, class017633);
        while (class017633.B != null) {
            class017633 = class017633.B;
            arrayList.add(0, class017633);
        }
        return new class00143((List)arrayList, class072092, bl);
    }

    public void N(BooleanSupplier booleanSupplier) {
        this.R = booleanSupplier;
    }

    public void N(int n) {
        this.L = n;
    }

    public @Nullable class00143 N(class00783 class007832, class07079 class070792, Set<class07209> set, float f, int n, float f2) {
        this.i.N();
        this.u.N(class007832, class070792);
        class01763 class017632 = this.u.y();
        if (class017632 == null) {
            return null;
        }
        Map<class04604, class07209> map = set.stream().collect(Collectors.toMap(class072092 -> this.u.N((double)class072092.method_10263(), (double)class072092.method_10264(), (double)class072092.method_10260()), Function.identity()));
        class00143 class001432 = this.N(class017632, map, f, n, f2);
        this.u.N();
        return class001432;
    }

    private @Nullable class00143 N(class01763 class017632, Map<class04604, class07209> map, float f, int n, float f2) {
        Object object;
        class04643 class046432 = class08700.N();
        class046432.N("find_path");
        class046432.N(class02253.field_33876);
        Set<class04604> set = map.keySet();
        class017632.i = 0.0f;
        class017632.M = class017632.R = this.N(class017632, set);
        this.i.N();
        this.i.N(class017632);
        boolean bl = this.R.getAsBoolean();
        HashSet<Object> hashSet = bl ? new HashSet<Object>() : Set.of();
        int n2 = 0;
        HashSet hashSet2 = Sets.newHashSetWithExpectedSize((int)set.size());
        int n3 = (int)((float)this.L * f2);
        while (!this.i.i() && ++n2 < n3) {
            object = this.i.L();
            ((class01763)object).Z = true;
            for (class04604 class046043 : set) {
                if (!(object.u((class01763)class046043) <= (float)n)) continue;
                class046043.y();
                hashSet2.add(class046043);
            }
            if (!hashSet2.isEmpty()) break;
            if (bl) {
                hashSet.add(object);
            }
            if (object.N(class017632) >= f) continue;
            int n4 = this.u.N(this.y, (class01763)object);
            for (int i = 0; i < n4; ++i) {
                class01763 class017633 = this.y[i];
                float f3 = this.N((class01763)object, class017633);
                class017633.z = ((class01763)object).z + f3;
                float f4 = ((class01763)object).i + f3 + class017633.U;
                if (!(class017633.z < f) || class017633.R() && !(f4 < class017633.i)) continue;
                class017633.B = object;
                class017633.i = f4;
                class017633.R = this.N(class017633, set) * 1.5f;
                if (class017633.R()) {
                    this.i.N(class017633, class017633.i + class017633.R);
                    continue;
                }
                class017633.M = class017633.i + class017633.R;
                this.i.N(class017633);
            }
        }
        object = !hashSet2.isEmpty() ? hashSet2.stream().map(class046042 -> this.N(class046042.N(), (class07209)map.get(class046042), true)).min(Comparator.comparingInt(class00143::i)) : set.stream().map(class046042 -> this.N(class046042.N(), (class07209)map.get(class046042), false)).min(Comparator.comparingDouble(class00143::W).thenComparingInt(class00143::i));
        class046432.L();
        if (((Optional)object).isEmpty()) {
            return null;
        }
        class00143 class001432 = (class00143)((Optional)object).get();
        if (bl) {
            class001432.N(this.i.R(), (class01763[])hashSet.toArray(class01763[]::new), set);
        }
        return class001432;
    }

    protected float N(class01763 class017632, class01763 class017633) {
        return class017632.N(class017633);
    }

    private float N(class01763 class017632, Set<class04604> set) {
        float f = Float.MAX_VALUE;
        for (class04604 class046042 : set) {
            float f2 = class017632.N((class01763)class046042);
            class046042.N(f2, class017632);
            f = Math.min(f2, f);
        }
        return f;
    }
}

