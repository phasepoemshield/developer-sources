/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Sets
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.datafixers.kinds.OptionalBox$Mu
 *  minecraft.class00143
 *  minecraft.class00500
 *  minecraft.class00737
 *  minecraft.class01210
 *  minecraft.class01289
 *  minecraft.class01763
 *  minecraft.class04137
 *  minecraft.class04139
 *  minecraft.class04142
 *  minecraft.class04782
 *  minecraft.class05378
 *  minecraft.class05946
 *  minecraft.class06289
 *  minecraft.class07049
 *  minecraft.class07196
 *  minecraft.class07209
 *  minecraft.class07299
 *  minecraft.class07438
 *  org.apache.commons.lang3.mutable.MutableInt
 *  org.apache.commons.lang3.mutable.MutableObject
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.google.common.collect.Sets;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.datafixers.kinds.OptionalBox;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import minecraft.class00143;
import minecraft.class00500;
import minecraft.class00737;
import minecraft.class01210;
import minecraft.class01289;
import minecraft.class01763;
import minecraft.class04137;
import minecraft.class04139;
import minecraft.class04142;
import minecraft.class04782;
import minecraft.class05378;
import minecraft.class05946;
import minecraft.class06289;
import minecraft.class07049;
import minecraft.class07196;
import minecraft.class07209;
import minecraft.class07299;
import minecraft.class07438;
import org.apache.commons.lang3.mutable.MutableInt;
import org.apache.commons.lang3.mutable.MutableObject;
import org.jspecify.annotations.Nullable;

public class class05758 {
    private static final int N = 20;
    private static final double y = 3.0;
    private static final double L = 2.0;

    private static Optional<Set<class06289>> N(class04139<OptionalBox.Mu, Set<class06289>> class041392, Optional<Set<class06289>> optional, class04782 class047822, class07209 class072092) {
        class06289 class062892 = class06289.N((class05946)class047822.method_27983(), (class07209)class072092);
        return Optional.of(optional.map(set -> {
            set.add(class062892);
            return set;
        }).orElseGet(() -> {
            HashSet hashSet = Sets.newHashSet((Object[])new class06289[]{class062892});
            class041392.N((Object)hashSet);
            return hashSet;
        }));
    }

    private static boolean N(class04782 class047822, class07438 class074382, class06289 class062892) {
        return class062892.N() != class047822.method_27983() || !class062892.y().method_19769((class00737)class074382.method_73189(), 3.0);
    }

    private static boolean N(class01289<?> class012892, class07209 class072092) {
        if (!class012892.N(class05378.n)) {
            return false;
        }
        class00143 class001432 = (class00143)class012892.L(class05378.n).get();
        if (class001432.L()) {
            return false;
        }
        class01763 class017632 = class001432.Z();
        if (class017632 == null) {
            return false;
        }
        class01763 class017633 = class001432.B();
        return class072092.equals((Object)class017632.u()) || class072092.equals((Object)class017633.u());
    }

    private static boolean N(class07438 class074384, class07209 class072092, Optional<List<class07438>> optional) {
        if (optional.isEmpty()) {
            return false;
        }
        return optional.get().stream().filter(class074383 -> class074383.method_5864() == class074384.method_5864()).filter(class074382 -> class072092.method_19769((class00737)class074382.method_73189(), 2.0)).anyMatch(class074382 -> class05758.N(class074382.method_18868(), class072092));
    }

    public static void N(class04782 class047822, class07438 class074382, @Nullable class01763 class017632, @Nullable class01763 class017633, Set<class06289> set, Optional<List<class07438>> optional) {
        Iterator<class06289> iterator = set.iterator();
        while (iterator.hasNext()) {
            class06289 class062892 = iterator.next();
            class07209 class072092 = class062892.y();
            if (class017632 != null && class017632.u().equals((Object)class072092) || class017633 != null && class017633.u().equals((Object)class072092)) continue;
            if (class05758.N(class047822, class074382, class062892)) {
                iterator.remove();
                continue;
            }
            class00500 class005002 = class047822.method_8320(class072092);
            if (!class005002.N(class01210.Nj, (T class013392) -> class013392.i() instanceof class07196)) {
                iterator.remove();
                continue;
            }
            class07196 class071962 = (class07196)class005002.i();
            if (!class071962.U(class005002)) {
                iterator.remove();
                continue;
            }
            if (class05758.N(class074382, class072092, optional)) {
                iterator.remove();
                continue;
            }
            class071962.N((class07049)class074382, (class07299)class047822, class005002, class072092, false);
            iterator.remove();
        }
    }

    public static class04142<class07438> N() {
        MutableObject mutableObject = new MutableObject();
        MutableInt mutableInt = new MutableInt(0);
        return class04137.N_42(class041282 -> class041282.group((App)class041282.y(class05378.n), (App)class041282.N(class05378.G), (App)class041282.N(class05378.M)).apply((Applicative)class041282, (class041392, class041393, class041394) -> (class047822, class074382, l) -> {
            class07196 class071962;
            class00500 class005002;
            Optional<Set<class06289>> var11;
            class07209 class072092;
            class00143 class001432 = (class00143)class041282.y(class041392);
            Optional optional = class041282.N(class041393);
            if (class001432.y() || class001432.L()) {
                return false;
            }
            if (Objects.equals(mutableObject.get(), class001432.B())) {
                mutableInt.setValue(20);
            } else if (mutableInt.decrementAndGet() > 0) {
                return false;
            }
            mutableObject.setValue((Object)class001432.B());
            class01763 class017632 = class001432.Z();
            class01763 class017633 = class001432.B();
            class07209 class072093 = class017632.u();
            class00500 class005003 = class047822.method_8320(class072093);
            if (class005003.N(class01210.Nj, (T class013392) -> class013392.i() instanceof class07196)) {
                class072092 = (class07196)class005003.i();
                if (!class072092.U(class005003)) {
                    class072092.N((class07049)class074382, (class07299)class047822, class005003, class072093, true);
                }
                var11 = class05758.N((class04139<OptionalBox.Mu, Set<class06289>>)class041393, optional, class047822, class072093);
            }
            if ((class005002 = class047822.method_8320(class072092 = class017633.u())).N(class01210.Nj, (T class013392) -> class013392.i() instanceof class07196) && !(class071962 = (class07196)class005002.i()).U(class005002)) {
                class071962.N((class07049)class074382, (class07299)class047822, class005002, class072092, true);
                var11 = class05758.N((class04139<OptionalBox.Mu, Set<class06289>>)class041393, var11, class047822, class072092);
            }
            var11.ifPresent(set -> class05758.N(class047822, class074382, class017632, class017633, set, class041282.N(class041394)));
            return true;
        }));
    }
}

