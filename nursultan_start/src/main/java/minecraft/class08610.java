/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.MatchException
 *  minecraft.class00201
 *  minecraft.class00204
 *  minecraft.class00392
 *  minecraft.class00394
 *  minecraft.class00404
 *  minecraft.class00500
 *  minecraft.class00734
 *  minecraft.class00753
 *  minecraft.class00869
 *  minecraft.class01001
 *  minecraft.class01042
 *  minecraft.class01207
 *  minecraft.class01233
 *  minecraft.class01894
 *  minecraft.class01929
 *  minecraft.class02566
 *  minecraft.class03529
 *  minecraft.class03556
 *  minecraft.class04272
 *  minecraft.class04476
 *  minecraft.class04782
 *  minecraft.class05163
 *  minecraft.class05492
 *  minecraft.class05500
 *  minecraft.class05512
 *  minecraft.class05513
 *  minecraft.class05514
 *  minecraft.class05520
 *  minecraft.class05946
 *  minecraft.class06290
 *  minecraft.class06541
 *  minecraft.class06887
 *  minecraft.class06993
 *  minecraft.class07001
 *  minecraft.class07049
 *  minecraft.class07209
 *  minecraft.class07253
 *  minecraft.class07269
 *  minecraft.class07299
 *  minecraft.class07701
 *  minecraft.class08036
 *  minecraft.class08299
 *  minecraft.class08329
 */
package minecraft;

import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import minecraft.class00201;
import minecraft.class00204;
import minecraft.class00392;
import minecraft.class00394;
import minecraft.class00404;
import minecraft.class00500;
import minecraft.class00734;
import minecraft.class00753;
import minecraft.class00869;
import minecraft.class01001;
import minecraft.class01042;
import minecraft.class01207;
import minecraft.class01233;
import minecraft.class01894;
import minecraft.class01929;
import minecraft.class02566;
import minecraft.class03529;
import minecraft.class03556;
import minecraft.class04272;
import minecraft.class04476;
import minecraft.class04782;
import minecraft.class05163;
import minecraft.class05492;
import minecraft.class05500;
import minecraft.class05512;
import minecraft.class05513;
import minecraft.class05514;
import minecraft.class05520;
import minecraft.class05946;
import minecraft.class06290;
import minecraft.class06541;
import minecraft.class06887;
import minecraft.class06993;
import minecraft.class07001;
import minecraft.class07049;
import minecraft.class07209;
import minecraft.class07253;
import minecraft.class07269;
import minecraft.class07299;
import minecraft.class07701;
import minecraft.class08036;
import minecraft.class08299;
import minecraft.class08329;
import minecraft.class08592;
import minecraft.class08595;
import minecraft.class08597;
import minecraft.class08618;
import minecraft.class08623;
import minecraft.class08625;
import minecraft.class08633;
import minecraft.class08635;

public class class08610
extends class00394
implements class08597,
class08618 {
    private static final class00392 N = class00392.L((String)"test_instance_block.invalid_test");
    private static final List<class08633> y = List.of();
    private static final List<class08633> L = List.of(new class08633(class02566.N((int)128, (int)128, (int)128)));
    private static final List<class08633> u = List.of(new class08633(class02566.N((int)0, (int)255, (int)0)));
    private static final List<class08633> i = List.of(new class08633(class02566.N((int)255, (int)0, (int)0)));
    private static final List<class08633> R = List.of(new class08633(class02566.N((int)255, (int)128, (int)0)));
    private static final class00753 M = new class00753(0, 1, 1);
    private class08595 B;
    private final List<class08635> Z = new ArrayList<class08635>();

    @Override
    public class08623 L() {
        return new class08623(new class07209(M), this.q());
    }

    public boolean L(Consumer<class00392> consumer) {
        class07299 class072992;
        Optional<class01894> var2 = this.y(consumer);
        if (var2.isEmpty() || !((class072992 = this.z) instanceof class04782)) {
            return false;
        }
        class04782 class047822 = (class04782)class072992;
        return class08610.N(class047822, var2.get(), consumer);
    }

    public Optional<class05946<class00201>> M() {
        return this.B.N();
    }

    public class07269 i() {
        return class07269.N((class00394)this);
    }

    private void K() {
        this.z.N_70(null, this.R()).stream().filter(class070492 -> !(class070492 instanceof class08036)).forEach(class07049::method_31472);
    }

    public boolean T() {
        Object object = this.z;
        if (object instanceof class04782) {
            class04782 class047822 = (class04782)object;
            object = this.B.N().flatMap(class059462 -> class08610.y(class047822, (class05946<class00201>)class059462));
            if (((Optional)object).isPresent()) {
                this.N(class047822, (class01207)((Optional)object).get());
                return true;
            }
        }
        return false;
    }

    public class08610(class07209 class072092, class00500 class005002) {
        super(class00404.field_55993, class072092, class005002);
        this.B = new class08595(Optional.empty(), class00753.field_11176, class06993.field_11467, false, class08625.field_56014, Optional.empty());
    }

    public class00392 B() {
        return this.M().map(class059462 -> class00392.y((String)class059462.N().toString())).orElse(N);
    }

    public boolean Z() {
        return this.B.u();
    }

    private void V() {
        class07299 class072992 = this.z;
        if (class072992 instanceof class04782) {
            class04782 class047822 = (class04782)class072992;
            this.u().y().forEach(class073212 -> class047822.method_17988(class073212.B, class073212.Z, true));
        }
    }

    public void i(Consumer<class07209> consumer) {
        class00734 class007342 = this.R();
        boolean bl = this.o().map(class035292 -> ((class00201)class035292.N()).E()).orElse(false) == false;
        class07209 class072092 = class07209.method_49637((double)class007342.N, (double)class007342.y, (double)class007342.L).method_10069(-1, -1, -1);
        class07209 class072093 = class07209.method_49637((double)class007342.u, (double)class007342.i, (double)class007342.R);
        class07209.method_20437((class07209)class072092, (class07209)class072093).forEach(class072094 -> {
            boolean bl2;
            boolean bl3 = class072094.method_10263() == class072092.method_10263() || class072094.method_10263() == class072093.method_10263() || class072094.method_10260() == class072092.method_10260() || class072094.method_10260() == class072093.method_10260() || class072094.method_10264() == class072092.method_10264();
            boolean bl4 = bl2 = class072094.method_10264() == class072093.method_10264();
            if (bl3 || bl2 && bl) {
                consumer.accept((class07209)class072094);
            }
        });
    }

    public class07209 b() {
        class00753 class007532 = this.z();
        class06993 class069932 = this.U();
        class07209 class072092 = this.s();
        return switch (class069932) {
            default -> throw new MatchException(null, null);
            case class06993.field_11467 -> class072092;
            case class06993.field_11463 -> class072092.method_10069(class007532.method_10260() - 1, 0, 0);
            case class06993.field_11464 -> class072092.method_10069(class007532.method_10263() - 1, 0, class007532.method_10260() - 1);
            case class06993.field_11465 -> class072092.method_10069(0, 0, class007532.method_10263() - 1);
        };
    }

    public class07209 s() {
        return class08610.N(this.d());
    }

    public void n() {
        if (!this.Z.isEmpty()) {
            this.Z.clear();
            this.method_5431();
        }
    }

    public void m() {
        this.N(this.B.N(class08625.field_56015));
    }

    private Optional<class03529<class00201>> o() {
        return this.M().flatMap(arg_0 -> ((class01042)this.z.method_30349()).u(arg_0));
    }

    public List<class08635> t() {
        return this.Z;
    }

    public void v() {
        this.i(class072092 -> {
            if (this.z.method_8320(class072092).N(class00869.ZX)) {
                this.z.method_8501(class072092, class00869.N.W());
            }
        });
    }

    public void j() {
        this.i(class072092 -> {
            if (!this.z.method_8320(class072092).N(class00869.Ty)) {
                this.z.method_8501(class072092, class00869.ZX.W());
            }
        });
    }

    private class00753 q() {
        class00753 class007532 = this.z();
        class06993 class069932 = this.U();
        boolean bl = class069932 == class06993.field_11463 || class069932 == class06993.field_11465;
        int n = bl ? class007532.method_10260() : class007532.method_10263();
        int n2 = bl ? class007532.method_10263() : class007532.method_10260();
        return new class00753(n, class007532.method_10264(), n2);
    }

    public class06993 U() {
        return this.o().map(class03556::N).map(class00201::W).orElse(class06993.field_11467).N(this.B.L());
    }

    public class00753 z() {
        return this.B.y();
    }

    public void u(Consumer<class00392> consumer) {
        class07299 class072992 = this.z;
        if (!(class072992 instanceof class04782)) {
            return;
        }
        class04782 class047822 = (class04782)class072992;
        Optional<class03529<class00201>> var3 = this.o();
        class07209 class072092 = this.d();
        if (var3.isEmpty()) {
            consumer.accept((class00392)class00392.N((String)"test_instance_block.error.no_test", (Object[])new Object[]{class072092.method_10263(), class072092.method_10264(), class072092.method_10260()}).N(class06541.field_1061));
            return;
        }
        if (!this.T()) {
            consumer.accept((class00392)class00392.N((String)"test_instance_block.error.no_test_structure", (Object[])new Object[]{class072092.method_10263(), class072092.method_10264(), class072092.method_10260()}).N(class06541.field_1061));
            return;
        }
        this.n();
        class05492.N.N();
        class00204.y();
        consumer.accept((class00392)class00392.N((String)"test_instance_block.starting", (Object[])new Object[]{var3.get().M()}));
        class05513 class055132 = new class05513(var3.get(), this.B.L(), class047822, class04272.N());
        class055132.N(class072092);
        class05520 class055202 = class05500.y(List.of(class055132), (class04782)class047822).L();
        class05512.N((class07701)class047822.method_8503().yu(), (class05520)class055202);
    }

    public class05163 u() {
        class07209 class072092 = this.s();
        class07209 class072093 = class072092.method_10081(this.q()).method_10069(-1, -1, -1);
        return class05163.N((class00753)class072092, (class00753)class072093);
    }

    @Override
    public class08592 y() {
        return class08592.field_55995;
    }

    public Optional<class01894> y(Consumer<class00392> consumer) {
        Optional<class03529<class00201>> var2 = this.o();
        Optional<class01894> optional = var2.isPresent() ? Optional.of(((class00201)var2.get().N()).i()) : this.M().map(class05946::N);
        if (optional.isEmpty()) {
            class07209 class072092 = this.d();
            consumer.accept((class00392)class00392.N((String)"test_instance_block.error.unable_to_save", (Object[])new Object[]{class072092.method_10263(), class072092.method_10264(), class072092.method_10260()}).N(class06541.field_1061));
            return optional;
        }
        class07299 class072992 = this.z;
        if (class072992 instanceof class04782) {
            class04782 class047822 = (class04782)class072992;
            class07253.N((class04782)class047822, (class01894)optional.get(), (class07209)this.s(), (class00753)this.z(), (boolean)this.Z(), (String)"", (boolean)true, List.of(class00869.N));
        }
        return optional;
    }

    private static Optional<class01207> y(class04782 class047822, class05946<class00201> class059462) {
        return class047822.method_30349().u(class059462).map(class035292 -> ((class00201)class035292.N()).i()).flatMap(class018942 -> class047822.method_14183().y(class018942));
    }

    public Optional<class00392> E() {
        return this.B.R();
    }

    public static Optional<class00753> N(class04782 class047822, class05946<class00201> class059462) {
        return class08610.y(class047822, class059462).map(class01207::N);
    }

    public void N(class08595 class085952) {
        this.B = class085952;
        this.method_5431();
    }

    public static class07209 N(class07209 class072092) {
        return class072092.method_10081(M);
    }

    protected void N(class08329 class083292) {
        class083292.N("data", class08595.N, (Object)this.B);
        if (!this.Z.isEmpty()) {
            class083292.N("errors", class08635.y, this.Z);
        }
    }

    protected void N(class08299 class082992) {
        class082992.N("data", class08595.N).ifPresent(this::N);
        this.Z.clear();
        this.Z.addAll(class082992.N("errors", class08635.y).orElse(List.of()));
    }

    public class07001 N(class01929 class019292) {
        return this.u(class019292);
    }

    public void N(class00392 class003922) {
        this.N(this.B.N(class003922));
    }

    public void N(class07209 class072092, class00392 class003922) {
        this.Z.add(new class08635(class072092, class003922));
        this.method_5431();
    }

    private void N(class04782 class047822, class01207 class012072) {
        class01233 class012332 = new class01233().N(this.U()).N(this.B.u()).y(true);
        class07209 class072092 = this.b();
        this.V();
        class05514.N((class05163)this.u(), (class04782)class047822);
        this.K();
        class012072.N((class01001)class047822, class072092, class072092, class012332, class047822.method_8409(), 818);
    }

    public void N(Consumer<class00392> consumer) {
        this.v();
        this.n();
        if (this.T()) {
            consumer.accept((class00392)class00392.N((String)"test_instance_block.reset_success", (Object[])new Object[]{this.B()}).N(class06541.field_1060));
        }
        this.N(this.B.N(class08625.field_56014));
    }

    public static boolean N(class04782 class047822, class01894 class018942, Consumer<class00392> consumer) {
        Path path = class05514.L;
        Path path2 = class047822.method_14183().N(class018942, ".nbt");
        Path path3 = class06887.N((class04476)class04476.N, (Path)path2, (String)class018942.N(), (Path)path.resolve(class018942.y()).resolve("structure"));
        if (path3 == null) {
            consumer.accept((class00392)class00392.y((String)("Failed to export " + String.valueOf(path2))).N(class06541.field_1061));
            return true;
        }
        try {
            class06290.L((Path)path3.getParent());
        }
        catch (IOException iOException) {
            consumer.accept((class00392)class00392.y((String)("Could not create folder " + String.valueOf(path3.getParent()))).N(class06541.field_1061));
            return true;
        }
        consumer.accept((class00392)class00392.y((String)("Exported " + String.valueOf(class018942) + " to " + String.valueOf(path3.toAbsolutePath()))));
        return false;
    }

    @Override
    public List<class08633> N() {
        return switch (this.B.i().ordinal()) {
            default -> throw new MatchException(null, null);
            case 0 -> y;
            case 1 -> L;
            case 2 -> this.E().isEmpty() ? u : (this.o().map(class03556::N).map(class00201::B).orElse(true) != false ? i : R);
        };
    }

    public void method_5431() {
        super.method_5431();
        if (this.z instanceof class04782) {
            this.z.method_8413(this.d(), class00869.N.W(), this.w(), 3);
        }
    }

    public void W() {
        this.N(this.B.N(class08625.field_56016));
    }

    public class00734 R() {
        return class00734.N((class05163)this.u());
    }
}

