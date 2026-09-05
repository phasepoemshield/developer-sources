/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.util.Pair
 *  it.unimi.dsi.fastutil.objects.ObjectArrayList
 *  minecraft.class00737
 *  minecraft.class00808
 *  minecraft.class02136
 *  minecraft.class03556
 *  minecraft.class04160
 *  minecraft.class04162
 *  minecraft.class04782
 *  minecraft.class04995
 *  minecraft.class05074
 *  minecraft.class05946
 *  minecraft.class06069
 *  minecraft.class06113
 *  minecraft.class06584
 *  minecraft.class06837
 *  minecraft.class06925
 *  minecraft.class07001
 *  minecraft.class07047
 *  minecraft.class07049
 *  minecraft.class07055
 *  minecraft.class07062
 *  minecraft.class07078
 *  minecraft.class07079
 *  minecraft.class07084
 *  minecraft.class07209
 *  minecraft.class07299
 *  minecraft.class07536
 *  minecraft.class08036
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.datafixers.util.Pair;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;
import minecraft.class00737;
import minecraft.class00808;
import minecraft.class02136;
import minecraft.class03556;
import minecraft.class04160;
import minecraft.class04162;
import minecraft.class04481;
import minecraft.class04485;
import minecraft.class04500;
import minecraft.class04505;
import minecraft.class04513;
import minecraft.class04540;
import minecraft.class04782;
import minecraft.class04995;
import minecraft.class05074;
import minecraft.class05946;
import minecraft.class06069;
import minecraft.class06113;
import minecraft.class06584;
import minecraft.class06837;
import minecraft.class06925;
import minecraft.class07001;
import minecraft.class07047;
import minecraft.class07049;
import minecraft.class07055;
import minecraft.class07062;
import minecraft.class07078;
import minecraft.class07079;
import minecraft.class07084;
import minecraft.class07209;
import minecraft.class07299;
import minecraft.class07536;
import minecraft.class08036;
import org.jspecify.annotations.Nullable;

public class class04479 {
    private static final String z = "spawn_data";
    private static final String U = "next_mob_spawns_at";
    private static final int E = 20;
    private static final int W = 18000;
    final Set<UUID> N = new HashSet<UUID>();
    final Set<UUID> y = new HashSet<UUID>();
    long L;
    long u;
    int i;
    Optional<class00808> R = Optional.empty();
    Optional<class05946<class05074>> M = Optional.empty();
    private @Nullable class07049 m;
    private @Nullable class04540<class06584> P;
    double B;
    double Z;

    public void L() {
        this.N.clear();
        this.i = 0;
        this.u = 0L;
        this.L = 0L;
    }

    public double i() {
        return this.B;
    }

    public boolean u() {
        return this.y.isEmpty();
    }

    protected class00808 y(class04485 class044852, class06069 class060692) {
        if (this.R.isPresent()) {
            return this.R.get();
        }
        class04540<class00808> var3 = class044852.N().Z();
        Optional<class00808> var4 = var3.L() ? this.R : var3.N(class060692);
        this.R = Optional.of(var4.orElseGet(class00808::new));
        class044852.Z();
        return this.R.get();
    }

    public boolean y(class04782 class047822, float f, int n) {
        long l = this.L - (long)n;
        return (float)(class047822.N() - l) % f == 0.0f;
    }

    public void y() {
        this.y.clear();
        this.R = Optional.empty();
        this.L();
    }

    public @Nullable class07049 N(class04485 class044852, class07299 class072992, class04481 class044812) {
        class07001 class070012;
        if (!class044812.L()) {
            return null;
        }
        if (this.m == null && (class070012 = this.y(class044852, class072992.method_8409()).N()).Z("id").isPresent()) {
            this.m = class07078.N((class07001)class070012, (class07299)class072992, (class06113)class06113.field_47245, (class06837)class06837.N);
        }
        return this.m;
    }

    public boolean N(class04782 class047822) {
        return class047822.N() >= this.L;
    }

    private static long N(class04782 class047822, class07209 class072092) {
        class07209 class072093 = new class07209(class04995.y((float)((float)class072092.method_10263() / 30.0f)), class04995.y((float)((float)class072092.method_10264() / 20.0f)), class04995.y((float)((float)class072092.method_10260() / 30.0f)));
        return class047822.method_8412() + class072093.method_10063();
    }

    class04540<class06584> N(class04782 class047822, class04513 class045132, class07209 class072092) {
        long l;
        class04162 class041622;
        if (this.P != null) {
            return this.P;
        }
        class05074 class050742 = class047822.method_8503().yd().N(class045132.U());
        ObjectArrayList var8 = class050742.N(class041622 = new class04160(class047822).N(class06925.L), l = class04479.N(class047822, class072092));
        if (var8.isEmpty()) {
            return class04540.N();
        }
        class02136 class021362 = class04540.y();
        for (class06584 class065842 : var8) {
            class021362.N((Object)class065842.L(1), class065842.c());
        }
        this.P = class021362.N();
        return this.P;
    }

    public class07001 N(class04481 class044812) {
        class07001 class070012 = new class07001();
        if (class044812 == class04481.field_47385) {
            class070012.N(U, this.u);
        }
        this.R.ifPresent(class008082 -> class070012.N(z, class00808.y, class008082));
        return class070012;
    }

    public int N(class07209 class072092) {
        if (this.N.isEmpty()) {
            class07536.y((String)("Trial Spawner at " + String.valueOf(class072092) + " has no detected players"));
        }
        return Math.max(0, this.N.size() - 1);
    }

    public boolean N(class04782 class047822, class04513 class045132, int n) {
        return class047822.N() >= this.u && this.y.size() < class045132.y(n);
    }

    public boolean N(class04513 class045132, int n) {
        return this.i >= class045132.N(n);
    }

    public boolean N(class04485 class044852, class06069 class060692) {
        return this.y(class044852, class060692).N().Z("id").isPresent() || !class044852.N().Z().L();
    }

    public void N(class04505 class045052) {
        this.N.clear();
        this.N.addAll(class045052.N());
        this.y.clear();
        this.y.addAll(class045052.y());
        this.L = class045052.L();
        this.u = class045052.u();
        this.i = class045052.i();
        this.R = class045052.R();
        this.M = class045052.M();
    }

    public class04505 N() {
        return new class04505(Set.copyOf(this.N), Set.copyOf(this.y), this.L, this.u, this.i, this.R, this.M);
    }

    private static void N(class08036 class080362) {
        class07055 class070552 = class080362.method_6112(class07047.g);
        if (class070552 == null) {
            return;
        }
        int n = class070552.i() + 1;
        int n2 = 18000 * n;
        class080362.method_6016(class07047.g);
        class080362.method_6092(new class07055(class07047.o, n2, 0));
    }

    public boolean N(class04782 class047822, float f, int n) {
        long l = this.L - (long)n;
        return (float)class047822.N() >= (float)l + f;
    }

    private static Optional<Pair<class08036, class03556<class07084>>> N(class04782 class047822, List<UUID> list) {
        class08036 class080363 = null;
        for (UUID uUID : list) {
            class08036 class080364 = class047822.N(uUID);
            if (class080364 == null) continue;
            class03556 var6 = class07047.o;
            if (class080364.method_6059(var6)) {
                return Optional.of(Pair.of((Object)class080364, (Object)var6));
            }
            if (!class080364.method_6059(class07047.g)) continue;
            class080363 = class080364;
        }
        return Optional.ofNullable(class080363).map(class080362 -> Pair.of((Object)class080362, (Object)class07047.g));
    }

    public void N(class04782 class047822, class07209 class072092, class04485 class044852) {
        List<UUID> var8;
        boolean bl;
        if ((class072092.method_10063() + class047822.N()) % 20L != 0L) {
            return;
        }
        if (class044852.M().equals((Object)class04481.field_47388) && class044852.u()) {
            return;
        }
        List<UUID> var5 = class044852.z().detect(class047822, class044852.U(), class072092, class044852.R(), true);
        if (class044852.u() || var5.isEmpty()) {
            bl = false;
        } else {
            Optional<Pair<class08036, class03556<class07084>>> var7 = class04479.N(class047822, var5);
            var7.ifPresent(pair -> {
                class08036 class080362 = (class08036)pair.getFirst();
                if (pair.getSecond() == class07047.g) {
                    class04479.N(class080362);
                }
                class047822.N(3020, class07209.method_49638((class00737)class080362.method_33571()), 0);
                class044852.N(class047822, class072092);
            });
            bl = var7.isPresent();
        }
        if (class044852.M().equals((Object)class04481.field_47388) && !bl) {
            return;
        }
        boolean bl2 = class044852.B().N.isEmpty();
        List<UUID> list = var8 = bl2 ? var5 : class044852.z().detect(class047822, class044852.U(), class072092, class044852.R(), false);
        if (this.N.addAll(var8)) {
            this.u = Math.max(class047822.N() + 40L, this.u);
            if (!bl) {
                int n = class044852.u() ? 3019 : 3013;
                class047822.N(n, class072092, this.N.size());
            }
        }
    }

    public void N(class04485 class044852, class04782 class047822) {
        this.y.stream().map(arg_0 -> ((class04782)class047822).method_66347(arg_0)).forEach(class070492 -> {
            if (class070492 == null) {
                return;
            }
            class047822.N(3012, class070492.method_24515(), class04500.field_50186.N());
            if (class070492 instanceof class07079) {
                ((class07079)class070492).y_3(class047822);
            }
            class070492.method_5650(class07062.field_26999);
        });
        if (!class044852.L().Z().L()) {
            this.R = Optional.empty();
        }
        this.i = 0;
        this.y.clear();
        this.u = class047822.N() + (long)class044852.L().B();
        class044852.Z();
        this.L = class047822.N() + class044852.L().N();
    }

    public double R() {
        return this.Z;
    }
}

