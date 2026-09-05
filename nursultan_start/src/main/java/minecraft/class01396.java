/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  com.google.common.collect.Sets
 *  minecraft.class00821
 *  minecraft.class03704
 *  minecraft.class04770
 *  minecraft.class05196
 *  minecraft.class05908
 *  minecraft.class06583
 *  minecraft.class06588
 *  minecraft.class07049
 */
package minecraft;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;
import minecraft.class00821;
import minecraft.class01425;
import minecraft.class03704;
import minecraft.class04770;
import minecraft.class05196;
import minecraft.class05908;
import minecraft.class06583;
import minecraft.class06588;
import minecraft.class07049;

public abstract class class01396<T extends class01425>
implements class06583<T> {
    private final Map<class03704, Set<class06588<T>>> N = Maps.newIdentityHashMap();

    public final void y(class03704 class037042, class06588<T> class065882) {
        Set<class06588<T>> set = this.N.get(class037042);
        if (set != null) {
            set.remove(class065882);
            if (set.isEmpty()) {
                this.N.remove(class037042);
            }
        }
    }

    public final void N(class03704 class037043, class06588<T> class065882) {
        this.N.computeIfAbsent(class037043, class037042 -> Sets.newHashSet()).add(class065882);
    }

    protected void N_27(class04770 class047702, Predicate<T> predicate) {
        class03704 class037042 = class047702.method_14236();
        Set<class06588<T>> set = this.N.get(class037042);
        if (set == null || set.isEmpty()) {
            return;
        }
        class05908 class059082 = class00821.y((class04770)class047702, (class07049)class047702);
        List list = null;
        for (class06588<T> class065882 : set) {
            Optional<class05196> var10;
            class01425 class014252 = (class01425)class065882.N();
            if (!predicate.test(class014252) || !(var10 = class014252.N()).isEmpty() && !var10.get().N(class059082)) continue;
            if (list == null) {
                list = Lists.newArrayList();
            }
            list.add(class065882);
        }
        if (list != null) {
            for (class06588 class065882 : list) {
                class065882.N(class037042);
            }
        }
    }

    public final void N(class03704 class037042) {
        this.N.remove(class037042);
    }
}

