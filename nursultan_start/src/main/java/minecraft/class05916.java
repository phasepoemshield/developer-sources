/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  minecraft.class00429
 *  minecraft.class00432
 *  minecraft.class00433
 *  minecraft.class00447
 *  minecraft.class00452
 *  minecraft.class00457
 *  minecraft.class00737
 *  minecraft.class00753
 *  minecraft.class01383
 *  minecraft.class01445
 *  minecraft.class01857
 *  minecraft.class01861
 *  minecraft.class02566
 *  minecraft.class03386
 *  minecraft.class04453
 *  minecraft.class05363
 *  minecraft.class06202
 *  minecraft.class06724
 *  minecraft.class06747
 *  minecraft.class07049
 *  minecraft.class07209
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.google.common.collect.Lists;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import java.util.stream.Collectors;
import minecraft.class00429;
import minecraft.class00432;
import minecraft.class00433;
import minecraft.class00447;
import minecraft.class00452;
import minecraft.class00457;
import minecraft.class00737;
import minecraft.class00753;
import minecraft.class01383;
import minecraft.class01445;
import minecraft.class01857;
import minecraft.class01861;
import minecraft.class02566;
import minecraft.class03386;
import minecraft.class04453;
import minecraft.class05363;
import minecraft.class06202;
import minecraft.class06724;
import minecraft.class06747;
import minecraft.class07049;
import minecraft.class07209;
import org.jspecify.annotations.Nullable;

public class class05916
implements class01857 {
    private static final boolean N = true;
    private static final boolean y = true;
    private static final boolean L = true;
    private static final boolean u = true;
    private static final boolean i = true;
    private static final boolean R = true;
    private static final boolean M = true;
    private static final boolean B = true;
    private static final boolean Z = true;
    private static final boolean z = true;
    private static final boolean U = true;
    private static final boolean E = true;
    private static final int W = 30;
    private static final int m = 30;
    private static final int P = 8;
    private static final float s = 0.32f;
    private static final int T = -23296;
    private static final int b = -3355444;
    private static final int j = -98404;
    private final class06202 v;
    private @Nullable UUID n;

    private void L(class00457 class004572) {
        HashMap<class07209, Set> hashMap = new HashMap<class07209, Set>();
        class004572.L(class00429.y, (class070492, class004332) -> {
            if (class004332.y().isPresent()) {
                hashMap.computeIfAbsent((class07209)class004332.y().get(), class072092 -> new HashSet()).add(class070492.method_5667());
            }
        });
        hashMap.forEach((class072092, set) -> {
            Set set2 = set.stream().map(class01445::N).collect(Collectors.toSet());
            int n = 1;
            class06724.N((String)set2.toString(), (class07209)class072092, (int)n++, (int)-256, (float)0.32f);
            class06724.N((String)"Flower", (class07209)class072092, (int)n++, (int)-1, (float)0.32f);
            class06724.N((class07209)class072092, (float)0.05f, (class06747)class06747.y((int)class02566.N((float)0.3f, (float)0.8f, (float)0.8f, (float)0.0f)));
        });
    }

    public class05916(class06202 class062022) {
        this.v = class062022;
    }

    private Map<class07209, List<String>> u(class00457 class004572) {
        HashMap<class07209, List<String>> hashMap = new HashMap<class07209, List<String>>();
        class004572.L(class00429.y, (class070492, class004332) -> {
            if (class004332.N().isPresent() && class004572.N(class00429.B, (class07209)class004332.N().get()) == null) {
                hashMap.computeIfAbsent((class07209)class004332.N().get(), class072092 -> Lists.newArrayList()).add(class01445.N((class07049)class070492));
            }
        });
        return hashMap;
    }

    private void y() {
        class01861.N((class07049)this.v.F(), (int)8).ifPresent(class070492 -> {
            this.n = class070492.method_5667();
        });
    }

    private Map<class07209, Set<UUID>> y(class00457 class004572) {
        HashMap<class07209, Set<UUID>> hashMap = new HashMap<class07209, Set<UUID>>();
        class004572.L(class00429.y, (class070492, class004332) -> {
            for (class07209 class072093 : class004332.u()) {
                hashMap.computeIfAbsent(class072093, class072092 -> new HashSet()).add(class070492.method_5667());
            }
        });
        return hashMap;
    }

    private void N(class07209 class072092, class00447 class004472, Collection<UUID> collection, class00457 class004572) {
        int n = 0;
        if (!collection.isEmpty()) {
            class05916.N("Blacklisted by " + class05916.N(collection), class072092, n++, -65536);
        }
        class05916.N("Out: " + class05916.N(this.N(class072092, class004572)), class072092, n++, -3355444);
        if (class004472.y() == 0) {
            class05916.N("In: -", class072092, n++, -256);
        } else if (class004472.y() == 1) {
            class05916.N("In: 1 bee", class072092, n++, -256);
        } else {
            class05916.N("In: " + class004472.y() + " bees", class072092, n++, -256);
        }
        class05916.N("Honey: " + class004472.L(), class072092, n++, -23296);
        class05916.N(class004472.N().M().getString() + (class004472.u() ? " (sedated)" : ""), class072092, n++, -1);
    }

    private void N(class07209 class072092, List<String> list) {
        float f = 0.05f;
        class06724.N((class07209)class072092, (float)0.05f, (class06747)class06747.y((int)class02566.N((float)0.3f, (float)0.2f, (float)0.2f, (float)1.0f)));
        class06724.N((String)list.toString(), (class07209)class072092, (int)0, (int)-256, (float)0.32f);
        class06724.N((String)"Ghost Hive", (class07209)class072092, (int)1, (int)-65536, (float)0.32f);
    }

    private static void N(class07209 class072092) {
        float f = 0.05f;
        class06724.N((class07209)class072092, (float)0.05f, (class06747)class06747.y((int)class02566.N((float)0.3f, (float)0.2f, (float)0.2f, (float)1.0f)));
    }

    private static String N(Collection<UUID> collection) {
        if (collection.isEmpty()) {
            return "-";
        }
        if (collection.size() > 3) {
            return collection.size() + " bees";
        }
        return collection.stream().map(class01445::N).collect(Collectors.toSet()).toString();
    }

    private void N(class00457 class004572) {
        class07209 class072092 = this.N().u();
        class004572.L(class00429.y, (class070492, class004332) -> {
            if (((class04453)this.v.T_4).method_24516(class070492, 30.0)) {
                class00432 class004322 = (class00432)class004572.N(class00429.i, class070492);
                this.N((class07049)class070492, (class00433)class004332, class004322);
            }
        });
        this.L(class004572);
        Map<class07209, Set<UUID>> var3 = this.y(class004572);
        class004572.y(class00429.B, (class072093, class004472) -> {
            if (class072092.method_19771((class00753)class072093, 30.0)) {
                class05916.N(class072093);
                Set<UUID> set = var3.getOrDefault(class072093, Set.of());
                this.N((class07209)class072093, (class00447)class004472, (Collection<UUID>)set, class004572);
            }
        });
        this.u(class004572).forEach((class072093, list) -> {
            if (class072092.method_19771((class00753)class072093, 30.0)) {
                this.N((class07209)class072093, (List<String>)list);
            }
        });
    }

    public void N(double d, double d2, double d3, class00457 class004572, class01383 class013832, float f) {
        this.N(class004572);
        if (!((class04453)this.v.T_4).method_7325()) {
            this.y();
        }
    }

    private Collection<UUID> N(class07209 class072092, class00457 class004572) {
        HashSet<UUID> hashSet = new HashSet<UUID>();
        class004572.L(class00429.y, (class070492, class004332) -> {
            if (class004332.N(class072092)) {
                hashSet.add(class070492.method_5667());
            }
        });
        return hashSet;
    }

    private boolean N(class07049 class070492) {
        return Objects.equals(this.n, class070492.method_5667());
    }

    private String N(class07049 class070492, class07209 class072092) {
        double d = (double)Math.round(class072092.method_19770((class00737)class070492.method_73189()) * 10.0) / 10.0;
        return class072092.method_23854() + " (dist " + d + ")";
    }

    private class05363 N() {
        return ((class03386)this.v.i_5).s();
    }

    private static void N(String string, class07209 class072092, int n, int n2) {
        class06724.N((String)string, (class07209)class072092, (int)n, (int)n2, (float)0.32f);
    }

    private void N(class07049 class070492, class00433 class004332, @Nullable class00432 class004322) {
        boolean bl = this.N(class070492);
        int n = 0;
        class06724.N((class07049)class070492, (int)n++, (String)class004332.toString(), (int)-1, (float)0.48f);
        if (class004332.N().isEmpty()) {
            class06724.N((class07049)class070492, (int)n++, (String)"No hive", (int)-98404, (float)0.32f);
        } else {
            class06724.N((class07049)class070492, (int)n++, (String)("Hive: " + this.N(class070492, (class07209)class004332.N().get())), (int)-256, (float)0.32f);
        }
        if (class004332.y().isEmpty()) {
            class06724.N((class07049)class070492, (int)n++, (String)"No flower", (int)-98404, (float)0.32f);
        } else {
            class06724.N((class07049)class070492, (int)n++, (String)("Flower: " + this.N(class070492, (class07209)class004332.y().get())), (int)-256, (float)0.32f);
        }
        if (class004322 != null) {
            for (class00452 class004522 : class004322.N()) {
                if (!class004522.y()) continue;
                class06724.N((class07049)class070492, (int)n++, (String)class004522.L(), (int)-16711936, (float)0.32f);
            }
        }
        if (class004332.L() > 0) {
            int n2 = class004332.L() < 2400 ? -3355444 : -23296;
            class06724.N((class07049)class070492, (int)n++, (String)("Travelling: " + class004332.L() + " ticks"), (int)n2, (float)0.32f);
        }
    }
}

