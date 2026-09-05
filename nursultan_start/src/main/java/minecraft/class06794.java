/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  it.unimi.dsi.fastutil.objects.ObjectArrayList
 *  minecraft.class00390
 *  minecraft.class00392
 *  minecraft.class00734
 *  minecraft.class00816
 *  minecraft.class01128
 *  minecraft.class03767
 *  minecraft.class04770
 *  minecraft.class04782
 *  minecraft.class06889
 *  minecraft.class07049
 *  minecraft.class07078
 *  minecraft.class07536
 *  minecraft.class07680
 *  minecraft.class07701
 *  minecraft.class08162
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.brigadier.exceptions.CommandSyntaxException;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.List;
import java.util.UUID;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.Predicate;
import minecraft.class00390;
import minecraft.class00392;
import minecraft.class00734;
import minecraft.class00816;
import minecraft.class01128;
import minecraft.class03767;
import minecraft.class04770;
import minecraft.class04782;
import minecraft.class06782;
import minecraft.class06889;
import minecraft.class07049;
import minecraft.class07078;
import minecraft.class07536;
import minecraft.class07680;
import minecraft.class07701;
import minecraft.class08162;
import org.jspecify.annotations.Nullable;

public class class06794 {
    public static final int N = Integer.MAX_VALUE;
    public static final BiConsumer<class06889, List<? extends class07049>> y = (class068892, list) -> {};
    private static final class01128<class07049, ?> L = new class06782();
    private final int u;
    private final boolean i;
    private final boolean R;
    private final List<Predicate<class07049>> M;
    private final @Nullable class00816 B;
    private final Function<class06889, class06889> Z;
    private final @Nullable class00734 z;
    private final BiConsumer<class06889, List<? extends class07049>> U;
    private final boolean E;
    private final @Nullable String W;
    private final @Nullable UUID m;
    private final class01128<class07049, ?> P;
    private final boolean s;

    public class04770 L(class07701 class077012) throws CommandSyntaxException {
        this.i(class077012);
        List<class04770> var2 = this.u(class077012);
        if (var2.size() != 1) {
            throw class07680.i.create();
        }
        return var2.get(0);
    }

    public boolean L() {
        return this.E;
    }

    public class06794(int n, boolean bl, boolean bl2, List<Predicate<class07049>> list, @Nullable class00816 class008162, Function<class06889, class06889> function, @Nullable class00734 class007342, BiConsumer<class06889, List<? extends class07049>> biConsumer, boolean bl3, @Nullable String string, @Nullable UUID uUID, @Nullable class07078<?> class070782, boolean bl4) {
        this.u = n;
        this.i = bl;
        this.R = bl2;
        this.M = list;
        this.B = class008162;
        this.Z = function;
        this.z = class007342;
        this.U = biConsumer;
        this.E = bl3;
        this.W = string;
        this.m = uUID;
        this.P = class070782 == null ? L : class070782;
        this.s = bl4;
    }

    private void i(class07701 class077012) throws CommandSyntaxException {
        if (this.s && !class077012.N().hasPermission(class08162.i)) {
            throw class07680.R.create();
        }
    }

    public boolean i() {
        return this.s;
    }

    public List<class04770> u(class07701 class077012) throws CommandSyntaxException {
        ObjectArrayList objectArrayList;
        this.i(class077012);
        if (this.W != null) {
            class04770 class047702 = class077012.W().Nm().N(this.W);
            if (class047702 == null) {
                return List.of();
            }
            return List.of(class047702);
        }
        if (this.m != null) {
            class04770 class047703 = class077012.W().Nm().y(this.m);
            if (class047703 == null) {
                return List.of();
            }
            return List.of(class047703);
        }
        class06889 class068892 = this.Z.apply(class077012.i());
        class00734 class007342 = this.N(class068892);
        Predicate<class07049> var4 = this.N(class068892, class007342, null);
        if (this.E) {
            class04770 class047704;
            class07049 class070492 = class077012.M();
            if (class070492 instanceof class04770 && var4.test((class07049)(class047704 = (class04770)class070492))) {
                return List.of(class047704);
            }
            return List.of();
        }
        int n = this.R();
        if (this.u()) {
            List var5 = class077012.R().method_47540(var4, n);
        } else {
            objectArrayList = new ObjectArrayList();
            for (class04770 class047705 : class077012.W().Nm().v()) {
                if (!var4.test((class07049)class047705)) continue;
                objectArrayList.add(class047705);
                if (objectArrayList.size() < n) continue;
                return objectArrayList;
            }
        }
        return this.N(class068892, (List)objectArrayList);
    }

    public boolean u() {
        return this.R;
    }

    public List<? extends class07049> y(class07701 class077012) throws CommandSyntaxException {
        this.i(class077012);
        if (!this.i) {
            return this.u(class077012);
        }
        if (this.W != null) {
            class04770 class047702 = class077012.W().Nm().N(this.W);
            if (class047702 == null) {
                return List.of();
            }
            return List.of(class047702);
        }
        if (this.m != null) {
            for (class04782 class047822 : class077012.W().NO()) {
                class07049 class070492 = class047822.method_66347(this.m);
                if (class070492 == null) continue;
                if (!class070492.method_5864().N(class077012.G())) break;
                return List.of(class070492);
            }
            return List.of();
        }
        class06889 class068892 = this.Z.apply(class077012.i());
        class00734 class007342 = this.N(class068892);
        if (this.E) {
            Predicate<class07049> var4 = this.N(class068892, class007342, null);
            if (class077012.M() != null && var4.test(class077012.M())) {
                return List.of(class077012.M());
            }
            return List.of();
        }
        Predicate<class07049> var4 = this.N(class068892, class007342, class077012.G());
        ObjectArrayList objectArrayList = new ObjectArrayList();
        if (this.u()) {
            this.N((List<class07049>)objectArrayList, class077012.R(), class007342, var4);
        } else {
            for (class04782 class047823 : class077012.W().NO()) {
                this.N((List<class07049>)objectArrayList, class047823, class007342, var4);
            }
        }
        return this.N(class068892, (List)objectArrayList);
    }

    public boolean y() {
        return this.i;
    }

    public static class00392 N(List<? extends class07049> list) {
        return class00390.y(list, class07049::method_5476);
    }

    public class07049 N(class07701 class077012) throws CommandSyntaxException {
        this.i(class077012);
        List<? extends class07049> var2 = this.y(class077012);
        if (var2.isEmpty()) {
            throw class07680.u.create();
        }
        if (var2.size() > 1) {
            throw class07680.N.create();
        }
        return var2.get(0);
    }

    private void N(List<class07049> list, class04782 class047822, @Nullable class00734 class007342, Predicate<class07049> predicate) {
        int n = this.R();
        if (list.size() >= n) {
            return;
        }
        if (class007342 != null) {
            class047822.method_47575(this.P, class007342, predicate, list, n);
        } else {
            class047822.method_47539(this.P, predicate, list, n);
        }
    }

    public int N() {
        return this.u;
    }

    private @Nullable class00734 N(class06889 class068892) {
        return this.z != null ? this.z.L(class068892) : null;
    }

    private Predicate<class07049> N(class06889 class068892, @Nullable class00734 class007342, @Nullable class03767 class037672) {
        ObjectArrayList objectArrayList;
        boolean bl;
        boolean bl2;
        boolean bl3 = class037672 != null;
        int n = (bl3 ? 1 : 0) + ((bl2 = class007342 != null) ? 1 : 0) + ((bl = this.B != null) ? 1 : 0);
        if (n == 0) {
            List<Predicate<class07049>> var8 = this.M;
        } else {
            ObjectArrayList objectArrayList2 = new ObjectArrayList(this.M.size() + n);
            objectArrayList2.addAll(this.M);
            if (bl3) {
                objectArrayList2.add(class070492 -> class070492.method_5864().N(class037672));
            }
            if (bl2) {
                objectArrayList2.add(class070492 -> class007342.L(class070492.method_5829()));
            }
            if (bl) {
                objectArrayList2.add(class070492 -> this.B.i(class070492.method_5707(class068892)));
            }
            objectArrayList = objectArrayList2;
        }
        return class07536.N((List)objectArrayList);
    }

    private <T extends class07049> List<T> N(class06889 class068892, List<T> list) {
        if (list.size() > 1) {
            this.U.accept(class068892, list);
        }
        return list.subList(0, Math.min(this.u, list.size()));
    }

    private int R() {
        return this.U == y ? this.u : Integer.MAX_VALUE;
    }
}

