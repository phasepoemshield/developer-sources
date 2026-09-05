/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10518
 *  com.mojang.authlib.GameProfile
 *  io.netty.channel.ChannelHandler
 *  io.netty.channel.embedded.EmbeddedChannel
 *  minecraft.class00143
 *  minecraft.class00392
 *  minecraft.class00394
 *  minecraft.class00423
 *  minecraft.class00500
 *  minecraft.class00642
 *  minecraft.class00717
 *  minecraft.class00734
 *  minecraft.class00737
 *  minecraft.class00753
 *  minecraft.class00780
 *  minecraft.class00869
 *  minecraft.class00889
 *  minecraft.class00891
 *  minecraft.class01001
 *  minecraft.class01128
 *  minecraft.class01207
 *  minecraft.class01210
 *  minecraft.class01894
 *  minecraft.class03530
 *  minecraft.class03556
 *  minecraft.class03713
 *  minecraft.class04207
 *  minecraft.class04227
 *  minecraft.class04391
 *  minecraft.class04770
 *  minecraft.class04782
 *  minecraft.class05163
 *  minecraft.class05882
 *  minecraft.class05946
 *  minecraft.class06113
 *  minecraft.class06183
 *  minecraft.class06501
 *  minecraft.class06517
 *  minecraft.class06581
 *  minecraft.class06584
 *  minecraft.class06665
 *  minecraft.class06889
 *  minecraft.class06993
 *  minecraft.class07049
 *  minecraft.class07050
 *  minecraft.class07055
 *  minecraft.class07072
 *  minecraft.class07078
 *  minecraft.class07079
 *  minecraft.class07082
 *  minecraft.class07084
 *  minecraft.class07087
 *  minecraft.class07101
 *  minecraft.class07111
 *  minecraft.class07127
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07218
 *  minecraft.class07236
 *  minecraft.class07282
 *  minecraft.class07290
 *  minecraft.class07299
 *  minecraft.class07310
 *  minecraft.class07438
 *  minecraft.class07830
 *  minecraft.class08036
 *  minecraft.class08092
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import Nursultan.class10518;
import com.mojang.authlib.GameProfile;
import io.netty.channel.ChannelHandler;
import io.netty.channel.embedded.EmbeddedChannel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.LongStream;
import minecraft.class00143;
import minecraft.class00392;
import minecraft.class00394;
import minecraft.class00423;
import minecraft.class00500;
import minecraft.class00642;
import minecraft.class00717;
import minecraft.class00734;
import minecraft.class00737;
import minecraft.class00753;
import minecraft.class00780;
import minecraft.class00869;
import minecraft.class00889;
import minecraft.class00891;
import minecraft.class01001;
import minecraft.class01128;
import minecraft.class01207;
import minecraft.class01210;
import minecraft.class01894;
import minecraft.class03530;
import minecraft.class03556;
import minecraft.class03713;
import minecraft.class04207;
import minecraft.class04227;
import minecraft.class04391;
import minecraft.class04770;
import minecraft.class04782;
import minecraft.class05163;
import minecraft.class05511;
import minecraft.class05513;
import minecraft.class05519;
import minecraft.class05529;
import minecraft.class05882;
import minecraft.class05946;
import minecraft.class06113;
import minecraft.class06183;
import minecraft.class06501;
import minecraft.class06517;
import minecraft.class06581;
import minecraft.class06584;
import minecraft.class06665;
import minecraft.class06889;
import minecraft.class06993;
import minecraft.class07049;
import minecraft.class07050;
import minecraft.class07055;
import minecraft.class07072;
import minecraft.class07078;
import minecraft.class07079;
import minecraft.class07082;
import minecraft.class07084;
import minecraft.class07087;
import minecraft.class07101;
import minecraft.class07111;
import minecraft.class07127;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07218;
import minecraft.class07236;
import minecraft.class07282;
import minecraft.class07290;
import minecraft.class07299;
import minecraft.class07310;
import minecraft.class07438;
import minecraft.class07830;
import minecraft.class08036;
import minecraft.class08092;
import org.jspecify.annotations.Nullable;

public class class05523 {
    private final class05513 N;
    private boolean y;

    public void L(class07078<?> class070782, int n, int n2, int n3) {
        this.L(class070782, new class07209(n, n2, n3));
    }

    public void L(class07078<?> class070782, class07209 class072092) {
        class07209 class072093 = this.z(class072092);
        if (!this.N().method_74143(class070782, new class00734(class072093), class07049::method_5805)) {
            throw this.N(class072092, "test.error.expected_entity", new Object[]{class070782.M()});
        }
    }

    public <T extends class07049> List<T> L(class07078<T> class070782) {
        return this.N().method_18023(class070782, this.z(), class07049::method_5805);
    }

    public void L(class07209 class072092) {
        this.N(class072092, this.N(class07282.field_9220));
    }

    public void L(class00891 class008912, class07209 class072092) {
        this.y(() -> this.N(class008912, class072092));
    }

    public void L(class00891 class008912, int n, int n2, int n3) {
        this.L(class008912, new class07209(n, n2, n3));
    }

    @Deprecated(forRemoval=true)
    public class04770 L() {
        class03713 class037132 = class03713.N((GameProfile)new GameProfile(UUID.randomUUID(), "test-mock-player"), (boolean)false);
        class10518 class105182 = new class10518(this, this.N().method_8503(), this.N(), class037132.N(), class037132.L());
        class00642 class006422 = new class00642(class00423.field_11941);
        EmbeddedChannel embeddedChannel = new EmbeddedChannel(new ChannelHandler[]{class006422});
        this.N().method_8503().Nm().N(class006422, (class04770)class105182, class037132);
        return class105182;
    }

    public void L(Runnable runnable) {
        this.N.T().N(runnable).N(() -> this.N("test.error.fail", new Object[0]));
    }

    public class06993 M() {
        return this.N.n();
    }

    public void M(class07209 class072092) {
        class07209 class072093 = this.z(class072092);
        class04782 class047822 = this.N();
        class047822.method_8320(class072093).y(class047822, class072093, class047822.field_9229);
    }

    public class05523(class05513 class055132) {
        this.N = class055132;
    }

    public void B(class07209 class072092) {
        class07209 class072093 = this.z(class072092);
        class04782 class047822 = this.N();
        class047822.method_8320(class072093).N(class047822, class072093, class047822.field_9229);
    }

    public class07211 B() {
        return this.N.n().N(class07211.field_11035);
    }

    public void Z(class07209 class072092) {
        class07209 class072093 = this.z(class072092);
        this.N().method_52370(class072093);
    }

    public long Z() {
        return this.N.s();
    }

    public void i(Runnable runnable) {
        LongStream.range(this.N.s(), this.N.l()).forEach(l -> this.N.N(l, runnable::run));
    }

    public void i(class07078<?> class070782, int n, int n2, int n3) {
        this.i(class070782, new class07209(n, n2, n3));
    }

    public void i(class07078<?> class070782, class07209 class072092) {
        this.y(() -> this.L(class070782, class072092));
    }

    public void i() {
        class00734 class007342 = this.U();
        int n = (int)Math.floor(class007342.u);
        int n2 = (int)Math.floor(class007342.R);
        int n3 = (int)Math.floor(class007342.i);
        for (int i = (int)Math.floor(class007342.N); i < n; ++i) {
            for (int j = (int)Math.floor(class007342.L); j < n2; ++j) {
                this.Z(new class07209(i, n3, j));
            }
        }
    }

    public void i(class07209 class072092) {
        this.N().N(this.z(class072092), false, null);
    }

    public class07209 U(class07209 class072092) {
        class07209 class072093 = this.N.u();
        class06993 class069932 = this.N.n().N(class06993.field_11464);
        return class01207.N((class07209)class072092, (class07111)class07111.field_11302, (class06993)class069932, (class07209)class072093).method_10059((class00753)class072093);
    }

    public class00734 U() {
        class00734 class007342 = this.N.i();
        class06993 class069932 = this.N.n();
        switch (class069932) {
            case field_11465: 
            case field_11463: {
                return new class00734(0.0, 0.0, 0.0, class007342.u(), class007342.L(), class007342.y());
            }
        }
        return new class00734(0.0, 0.0, 0.0, class007342.y(), class007342.L(), class007342.u());
    }

    public class07209 z(class07209 class072092) {
        class07209 class072093 = this.N.u();
        return class01207.N((class07209)class072093.method_10081((class00753)class072092), (class07111)class07111.field_11302, (class06993)this.N.n(), (class07209)class072093);
    }

    public class00734 z() {
        return this.N.i();
    }

    public void u() {
        this.N.W();
    }

    public void u(class07209 class072092) {
        this.N(class00869.uD, class072092);
        class07209 class072093 = this.z(class072092);
        class00500 class005002 = this.N().method_8320(class072093);
        ((class07127)class005002.i()).y_8(class005002, (class07299)this.N(), class072093, null);
    }

    public void u(class07078<?> class070782) {
        List list = this.N().method_18023(class070782, this.z(), class07049::method_5805);
        if (!list.isEmpty()) {
            throw this.N(((class07049)list.getFirst()).method_24515(), "test.error.unexpected_entity", new Object[]{class070782.M()});
        }
    }

    public void u(Runnable runnable) {
        LongStream.range(this.N.s(), this.N.l()).forEach(l -> this.N.N(l, runnable::run));
    }

    public void u(class07078<?> class070782, int n, int n2, int n3) {
        this.u(class070782, new class07209(n, n2, n3));
    }

    public void u(class07078<?> class070782, class07209 class072092) {
        class07209 class072093 = this.z(class072092);
        if (this.N().method_74143(class070782, new class00734(class072093), class07049::method_5805)) {
            throw this.N(class072092, "test.error.unexpected_entity", new Object[]{class070782.M()});
        }
    }

    public void y(class07209 class072092, class00500 class005002) {
        class00500 class005003 = this.N(class072092);
        if (!class005003.equals((Object)class005002)) {
            throw this.N(class072092, "test.error.state_not_equal", class005002, class005003);
        }
    }

    public void y(class07209 class072092, class06581 class065812) {
        if (this.N(class072092, class07236.class).N_61(class065812) == 0) {
            throw this.N(class072092, "test.error.expected_container_contents", new Object[]{class065812.U()});
        }
    }

    public <E extends class07049> void y(class07209 class072092, class07078<E> class070782, class06581 class065812) {
        class07209 class072093 = this.z(class072092);
        List list = this.N().method_18023(class070782, new class00734(class072093), object -> ((class07049)object).method_5805());
        if (list.isEmpty()) {
            throw this.N(class072092, "test.error.expected_entity", new Object[]{class070782.M()});
        }
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            if (!((class04391)((class07049)iterator.next())).n().N_60(class065842 -> class065842.N(class065812))) continue;
            return;
        }
        throw this.N(class072092, "test.error.expected_entity_having", new Object[]{class065812.U()});
    }

    public void y(class07078<?> class070782) {
        if (!this.N().method_74143(class070782, this.z(), class07049::method_5805)) {
            throw this.N("test.error.expected_entity_in_test", class070782.M());
        }
    }

    public void y(class07209 class072092, Predicate<class00500> predicate, Function<class00500, class00392> function) {
        class00500 class005002 = this.N(class072092);
        if (!predicate.test(class005002)) {
            throw this.N(class072092, function.apply(class005002));
        }
    }

    public void y(class06581 class065812, class07209 class072092, double d) {
        class07209 class072093 = this.z(class072092);
        Predicate<class00717> predicate = class007172 -> class007172.method_5805() && class007172.N().N(class065812);
        if (this.N().method_74143((class01128)class07078.Nt, new class00734(class072093).M(d), predicate)) {
            throw this.N(class072092, "test.error.unexpected_item", new Object[]{class065812.U()});
        }
    }

    public <T extends class07049> List<T> y(class07078<T> class070782, class07209 class072092, double d) {
        class07209 class072093 = this.z(class072092);
        return this.N().method_18023(class070782, new class00734(class072093).M(d), class07049::method_5805);
    }

    public void y(class07078<?> class070782, class00734 class007342) {
        class00734 class007343 = this.N(class007342);
        List list = this.N().method_18023(class070782, class007343, class07049::method_5805);
        if (!list.isEmpty()) {
            throw this.N(((class07049)list.getFirst()).method_24515(), "test.error.unexpected_entity", new Object[]{class070782.M()});
        }
    }

    public void y(class06581 class065812) {
        Predicate<class00717> predicate = class007172 -> class007172.method_5805() && class007172.N().N(class065812);
        if (this.N().method_74143((class01128)class07078.Nt, this.z(), predicate)) {
            throw this.N("test.error.unexpected_item", class065812.U());
        }
    }

    public void y(class07078<?> class070782, double d, double d2, double d3) {
        class06889 class068892 = new class06889(d, d2, d3);
        class06889 class068893 = this.N(class068892);
        Predicate<class07049> predicate = class070492 -> !class070492.method_5829().N(class068893, class068893);
        if (!this.N().method_74143(class070782, this.z(), predicate)) {
            throw this.N("test.error.expected_entity_not_touching", class070782.M(), class068893.N(), class068893.y(), class068893.L(), d, d2, d3);
        }
    }

    public void y() {
        this.N(class07049.class);
    }

    public void y(boolean bl, String string) {
        this.y(bl, (class00392)class00392.y((String)string));
    }

    public void y(class00392 class003922) {
        throw this.N(class003922);
    }

    public void y(long l, Runnable runnable) {
        this.N((long)this.N.s() + l, runnable);
    }

    public void y(Runnable runnable) {
        this.E();
        this.N.T().N(runnable).N();
    }

    public class00734 y(class00734 class007342) {
        class06889 class068892 = this.y(class007342.B());
        class06889 class068893 = this.y(class007342.Z());
        return new class00734(class068892, class068893);
    }

    public class06889 y(class06889 class068892) {
        class06889 class068893 = class06889.N((class00753)this.N.u());
        return class01207.N((class06889)class068892.u(class068893), (class07111)class07111.field_11302, (class06993)this.N.n(), (class07209)this.N.u());
    }

    public void y(boolean bl, class00392 class003922) {
        this.N(!bl, class003922);
    }

    public <E extends class07079> E y(class07078<E> class070782, class06889 class068892) {
        class07079 class070792 = (class07079)this.N(class070782, class068892);
        class070792.Nd();
        return (E)class070792;
    }

    public void y(class00891 class008912, int n, int n2, int n3) {
        this.y(class008912, new class07209(n, n2, n3));
    }

    public class07438 y(class07438 class074382) {
        class074382.method_6033(0.25f);
        return class074382;
    }

    public void y(class07209 class072092) {
        this.N((class03530<class00891>)class01210.R, class072092);
        class07209 class072093 = this.z(class072092);
        class00500 class005002 = this.N().method_8320(class072093);
        ((class00889)class005002.i()).N(class005002, (class07299)this.N(), class072093, null);
    }

    public void y(int n, int n2, int n3) {
        this.u(new class07209(n, n2, n3));
    }

    public <E extends class07079> E y(class07078<E> class070782, int n, int n2, int n3) {
        return this.y(class070782, new class07209(n, n2, n3));
    }

    public <E extends class07049> List<E> y(class07078<E> class070782, int n, int n2, int n3, double d) {
        return this.N(class070782, class06889.L((class00753)new class07209(n, n2, n3)), d);
    }

    public <E extends class07079> E y(class07078<E> class070782, class07209 class072092) {
        class07079 class070792 = (class07079)this.N(class070782, class072092);
        class070792.Nd();
        return (E)class070792;
    }

    public <E extends class07049, T> void y(class07209 class072092, class07078<E> class070782, Function<E, T> function, T t) {
        this.y(() -> this.N(class072092, class070782, function, t));
    }

    public <E extends class07079> E y(class07078<E> class070782, float f, float f2, float f3) {
        return this.y(class070782, new class06889((double)f, (double)f2, (double)f3));
    }

    public void y(class00891 class008912, class07209 class072092) {
        this.N(class072092, (class00891 class008913) -> !this.N(class072092).N(class008912), (class00891 class008913) -> class00392.N((String)"test.error.unexpected_block", (Object[])new Object[]{class008912.M()}));
    }

    private void E() {
        if (this.y) {
            throw new IllegalStateException("This test already has final clause");
        }
        this.y = true;
    }

    public void N(class07079 class070792, float f, float f2, float f3) {
        class06889 class068892 = this.N(new class06889((double)f, (double)f2, (double)f3));
        class070792.method_5808(class068892.M, class068892.B, class068892.Z, class070792.method_36454(), class070792.method_36455());
    }

    public void N(class05946<class00780> class059462) {
        class00734 class007342 = this.z();
        class07209 class072092 = class07209.method_49637((double)class007342.N, (double)class007342.y, (double)class007342.L);
        class07209 class072093 = class07209.method_49637((double)class007342.u, (double)class007342.i, (double)class007342.R);
        if (class04207.N((class04782)this.N(), (class07209)class072092, (class07209)class072093, (class03556)this.N().method_30349().L(class04227.NA).y(class059462)).right().isPresent()) {
            throw this.N("test.error.set_biome", new Object[0]);
        }
    }

    public void N(class08036 class080362, class06584 class065842, class07209 class072092, class07211 class072112) {
        class07209 class072093 = this.z(class072092.method_10093(class072112));
        class06183 class061832 = new class06183(class06889.y((class00753)class072093), class072112, class072093, false);
        class06501 class065012 = new class06501(class080362, class07050.field_5808, class061832);
        class065842.N(class065012);
    }

    public <E extends class07049> E N(class07078<E> class070782, float f, float f2, float f3) {
        return this.N(class070782, new class06889((double)f, (double)f2, (double)f3));
    }

    public void N(Consumer<class07209> consumer) {
        class07218.method_29715((class00734)this.U().N(1.0, 1.0, 1.0)).forEach(consumer);
    }

    public <E extends class07049> E N(class07078<E> class070782, int n, int n2, int n3) {
        return this.N(class070782, new class07209(n, n2, n3));
    }

    public <E extends class07049> List<E> N(class07078<E> class070782, class06889 class068892, int n) {
        ArrayList<E> arrayList = new ArrayList<E>();
        for (int i = 0; i < n; ++i) {
            arrayList.add(this.N(class070782, class068892));
        }
        return arrayList;
    }

    public class00734 N(class00734 class007342) {
        class06889 class068892 = this.N(class007342.B());
        class06889 class068893 = this.N(class007342.Z());
        return new class00734(class068892, class068893);
    }

    public class06889 N(class06889 class068892) {
        return class01207.N((class06889)class06889.N((class00753)this.N.u()).i(class068892), (class07111)class07111.field_11302, (class06993)this.N.n(), (class07209)this.N.u());
    }

    public void N(int n, int n2, int n3) {
        this.y(new class07209(n, n2, n3));
    }

    public void N(class07209 class072092, class08036 class080362) {
        class07209 class072093 = this.z(class072092);
        this.N(class072092, class080362, new class06183(class06889.y((class00753)class072093), class07211.field_11043, class072093, true));
    }

    public void N(class07209 class072092, class08036 class080362, class06183 class061832) {
        class07050 class070502;
        class07209 class072093 = this.z(class072092);
        class00500 class005002 = this.N().method_8320(class072093);
        class07082 class070822 = class005002.N(class080362.method_5998(class070502 = class07050.field_5808), (class07299)this.N(), class080362, class070502, class061832);
        if (class070822.N()) {
            return;
        }
        if (class070822 instanceof class07087 && class005002.N((class07299)this.N(), class080362, class061832).N()) {
            return;
        }
        class06501 class065012 = new class06501(class080362, class070502, class061832);
        class080362.method_5998(class070502).N(class065012);
    }

    public class00500 N(class07209 class072092) {
        return this.N().method_8320(this.z(class072092));
    }

    public void N(boolean bl, class00392 class003922) {
        if (!bl) {
            throw this.N(class003922);
        }
    }

    public void N(boolean bl, String string) {
        this.N(bl, (class00392)class00392.y((String)string));
    }

    public <N> void N(N n, N n2, String string) {
        this.N(n, n2, (class00392)class00392.y((String)string));
    }

    public <N> void N(N n, N n2, class00392 class003922) {
        if (!n.equals(n2)) {
            throw this.N("test.error.value_not_equal", class003922, n, n2);
        }
    }

    public class07211 N(class07211 class072112) {
        return this.M().N(class072112);
    }

    public class05882 N(class07079 class070792, class07209 class072092, float f) {
        return this.R().N(2, () -> {
            class00143 class001432 = class070792.f().N(this.z(class072092), 0);
            class070792.f().N(class001432, (double)f);
        });
    }

    public class04782 N() {
        return this.N.M();
    }

    public void N(class07049 class070492) {
        class070492.method_5768(this.N());
    }

    public void N(class07049 class070492, class07072 class070722, float f) {
        class070492.method_64397(this.N(), class070722, f);
    }

    public <E extends class07049> E N_52(class07078<E> class070782, class06889 class068892, @Nullable class06113 class061132) {
        class07079 class070792;
        class04782 class047822 = this.N();
        class07049 class070492 = class070782.N((class07299)class047822, class06113.field_16474);
        if (class070492 == null) {
            throw this.N(class07209.method_49638((class00737)class068892), "test.error.spawn_failure", new Object[]{class070782.T().M()});
        }
        if (class070492 instanceof class07079) {
            class070792 = (class07079)class070492;
            class070792.NW();
        }
        class070792 = this.N(class068892);
        float f = class070492.method_5832(this.M());
        class070492.method_5808(class070792.M, class070792.B, class070792.Z, f, class070492.method_36455());
        class070492.method_5636(f);
        class070492.method_5847(f);
        if (class061132 != null && class070492 instanceof class07079) {
            class07079 class070793 = (class07079)class070492;
            class070793.N((class01001)this.N(), this.N().method_8404(class070793.method_24515()), class061132, null);
        }
        class047822.y(class070492);
        return (E)class070492;
    }

    public <E extends class07049> E N(class07078<E> class070782, class06889 class068892) {
        return this.N_52(class070782, class068892, null);
    }

    public <E extends class07079> E N(class07078<E> class070782, int n, int n2, int n3, class06113 class061132) {
        return (E)((class07079)this.N_52(class070782, new class06889((double)n, (double)n2, (double)n3), class061132));
    }

    public class05511 N(String string, Object ... objectArray) {
        return this.N((class00392)class00392.y((String)string, (Object[])objectArray));
    }

    public class05519 N(class07209 class072092, class00392 class003922) {
        return new class05519(class003922, this.z(class072092), class072092, this.N.s());
    }

    public <E extends class07049> List<E> N(class07078<E> class070782, class06889 class068892, double d) {
        class04782 class047822 = this.N();
        class06889 class068893 = this.N(class068892);
        class00734 class007342 = this.N.i();
        class00734 class007343 = new class00734(class068893.y(-d, -d, -d), class068893.y(d, d, d));
        return class047822.method_18023(class070782, class007342, class070492 -> class070492.method_5829().L(class007343) && class070492.method_5805());
    }

    public class05519 N(class07209 class072092, String string, Object ... objectArray) {
        return this.N(class072092, (class00392)class00392.y((String)string, (Object[])objectArray));
    }

    public class05511 N(class00392 class003922) {
        return new class05511(class003922, this.N.s());
    }

    public <E extends class07049> E N(class07078<E> class070782) {
        return this.N(class070782, 0, 0, 0, 2.147483647E9);
    }

    public <E extends class07049> E N(class07078<E> class070782, int n, int n2, int n3, double d) {
        List<E> list = this.y(class070782, n, n2, n3, d);
        if (list.isEmpty()) {
            throw this.N("test.error.expected_entity_around", class070782.M(), n, n2, n3);
        }
        if (list.size() > 1) {
            throw this.N("test.error.too_many_entities", class070782.B(), n, n2, n3, list.size());
        }
        class06889 class068892 = this.N(new class06889((double)n, (double)n2, (double)n3));
        list.sort((class070492, class070493) -> {
            double d = class070492.method_73189().R(class068892);
            double d2 = class070493.method_73189().R(class068892);
            return Double.compare(d, d2);
        });
        return (E)((class07049)list.get(0));
    }

    public void N(class06581 class065812) {
        Predicate<class00717> predicate = class007172 -> class007172.method_5805() && class007172.N().N(class065812);
        if (!this.N().method_74143((class01128)class07078.Nt, this.z(), predicate)) {
            throw this.N("test.error.expected_item", class065812.U());
        }
    }

    public <E extends class07049> E N(class07078<E> class070782, class07209 class072092) {
        return this.N(class070782, class06889.L((class00753)class072092));
    }

    public void N(class03530<class00891> class035302, class07209 class072092) {
        this.y(class072092, (class00500 class005002) -> class005002.N(class035302), (class00500 class005002) -> class00392.N((String)"test.error.expected_block_tag", (Object[])new Object[]{class00392.N((class01894)class035302.y()), class005002.i().M()}));
    }

    public void N(class00891 class008912, class07209 class072092) {
        class00500 class005002 = this.N(class072092);
        this.N(class072092, (class00891 class008913) -> class005002.N(class008912), (class00891 class008913) -> class00392.N((String)"test.error.expected_block", (Object[])new Object[]{class008912.M(), class008913.M()}));
    }

    public void N(class07049 class070492, class07209 class072092) {
        class07209 class072093 = this.z(class072092);
        this.N().method_18023((class01128)class070492.method_5864(), new class00734(class072093), class07049::method_5805).stream().filter(class070493 -> class070493 == class070492).findFirst().orElseThrow(() -> this.N(class072092, "test.error.expected_entity", new Object[]{class070492.method_5864().M()}));
    }

    public void N(class06581 class065812, class07209 class072092, double d, int n) {
        class07209 class072093 = this.z(class072092);
        List list = this.N().method_18023((class01128)class07078.Nt, new class00734(class072093).M(d), class07049::method_5805);
        int n2 = 0;
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            class06584 class065842 = ((class00717)iterator.next()).N();
            if (!class065842.N(class065812)) continue;
            n2 += class065842.c();
        }
        if (n2 != n) {
            throw this.N(class072092, "test.error.expected_items_count", n, class065812.U(), n2);
        }
    }

    public void N(class06581 class065812, class07209 class072092, double d) {
        class07209 class072093 = this.z(class072092);
        Predicate<class00717> predicate = class007172 -> class007172.method_5805() && class007172.N().N(class065812);
        if (!this.N().method_74143((class01128)class07078.Nt, new class00734(class072093).M(d), predicate)) {
            throw this.N(class072092, "test.error.expected_item", new Object[]{class065812.U()});
        }
    }

    public class00717 N(class06581 class065812, class07209 class072092) {
        return this.N(class065812, (float)class072092.method_10263(), (float)class072092.method_10264(), (float)class072092.method_10260());
    }

    public <E extends class07049, T> void N(class07209 class072092, class07078<E> class070782, Function<? super E, T> function, @Nullable T t) {
        this.N(new class00734(class072092), class070782, function, t);
    }

    public <E extends class07049, T> void N(class00734 class007342, class07078<E> class070782, Function<? super E, T> function, @Nullable T t) {
        List list = this.N().method_18023(class070782, this.N(class007342), class07049::method_5805);
        if (list.isEmpty()) {
            throw this.N(class07209.method_49638((class00737)class007342.M()), "test.error.expected_entity", new Object[]{class070782.M()});
        }
        for (class07049 class070492 : list) {
            T t2 = function.apply(class070492);
            if (Objects.equals(t2, t)) continue;
            throw this.N(class07209.method_49638((class00737)class007342.M()), "test.error.expected_entity_data", t, t2);
        }
    }

    public <E extends class07438> void N(class07209 class072092, class07078<E> class070782, class06581 class065812) {
        class07209 class072093 = this.z(class072092);
        List list = this.N().method_18023(class070782, new class00734(class072093), class07049::method_5805);
        if (list.isEmpty()) {
            throw this.N(class072092, "test.error.expected_entity", new Object[]{class070782.M()});
        }
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            if (!((class07438)iterator.next()).method_24518(class065812)) continue;
            return;
        }
        throw this.N(class072092, "test.error.expected_entity_holding", new Object[]{class065812.U()});
    }

    public void N(class07209 class072092, class00500 class005002, class07211 class072112) {
        class00500 class005003 = class005002;
        if (class005002.y((class08092)class07101.R)) {
            class005003 = (class00500)class005002.y((class08092)class07101.R, (Comparable)class072112);
        }
        if (class005002.y((class08092)class06665.F)) {
            class005003 = (class00500)class005002.y((class08092)class06665.F, (Comparable)class072112);
        }
        this.N().method_8652(this.z(class072092), class005003, 3);
    }

    public <E extends class07049, T> void N(class07209 class072092, class07078<E> class070782, Predicate<E> predicate) {
        class07209 class072093 = this.z(class072092);
        List list = this.N().method_18023(class070782, new class00734(class072093), class07049::method_5805);
        if (list.isEmpty()) {
            throw this.N(class072092, "test.error.expected_entity", new Object[]{class070782.M()});
        }
        for (class07049 class070492 : list) {
            if (predicate.test(class070492)) continue;
            throw this.N(class070492.method_24515(), "test.error.expected_entity_data_predicate", new Object[]{class070492.method_5477()});
        }
    }

    public void N(class00891 class008912, int n, int n2, int n3) {
        this.N(class008912, new class07209(n, n2, n3));
    }

    public void N(class07078<?> class070782, double d, double d2, double d3) {
        class06889 class068892 = new class06889(d, d2, d3);
        class06889 class068893 = this.N(class068892);
        Predicate<class07049> predicate = class070492 -> class070492.method_5829().N(class068893, class068893);
        if (!this.N().method_74143(class070782, this.z(), predicate)) {
            throw this.N("test.error.expected_entity_touching", class070782.M(), class068893.N(), class068893.y(), class068893.L(), d, d2, d3);
        }
    }

    public <T extends Comparable<T>> void N(class07209 class072092, class08092<T> class080922, T t) {
        class00500 class005002 = this.N(class072092);
        if (!class005002.y(class080922)) {
            throw this.N(class072092, "test.error.block_property_missing", class080922.R(), t);
        }
        if (!class005002.L(class080922).equals(t)) {
            throw this.N(class072092, "test.error.block_property_mismatch", class080922.R(), t, class005002.L(class080922));
        }
    }

    public class00717 N(class06581 class065812, float f, float f2, float f3) {
        return this.N(class065812, new class06889((double)f, (double)f2, (double)f3));
    }

    public class00717 N(class06581 class065812, class06889 class068892) {
        class04782 class047822 = this.N();
        class06889 class068893 = this.N(class068892);
        class00717 class007172 = new class00717((class07299)class047822, class068893.M, class068893.B, class068893.Z, new class06584((class07310)class065812, 1));
        class007172.method_18800(0.0, 0.0, 0.0);
        class047822.method_8649((class07049)class007172);
        return class007172;
    }

    public void N(class07078<?> class070782, class00734 class007342) {
        class00734 class007343 = this.N(class007342);
        if (!this.N().method_74143(class070782, class007343, class07049::method_5805)) {
            throw this.N(class07209.method_49638((class00737)class007342.R()), "test.error.expected_entity", new Object[]{class070782.M()});
        }
    }

    public void N(class07209 class072092, class07211 class072112, IntPredicate intPredicate, Supplier<class00392> supplier) {
        class07209 class072093 = this.z(class072092);
        class04782 class047822 = this.N();
        int n = class047822.method_8320(class072093).N((class07290)class047822, class072093, class072112);
        if (!intPredicate.test(n)) {
            throw this.N(class072092, supplier.get());
        }
    }

    public <T extends class00394> void N(class07209 class072092, Class<T> clazz, Predicate<T> predicate, Supplier<class00392> supplier) {
        T t = this.N(class072092, clazz);
        if (!predicate.test(t)) {
            throw this.N(class072092, supplier.get());
        }
    }

    public <T extends Comparable<T>> void N(class07209 class072092, class08092<T> class080922, Predicate<T> predicate, class00392 class003922) {
        this.y(class072092, (class00500 class005002) -> {
            if (!class005002.y(class080922)) {
                return false;
            }
            Comparable comparable = class005002.L(class080922);
            return predicate.test(comparable);
        }, (class00500 class005002) -> class003922);
    }

    public void N(class07078<?> class070782, class07209 class072092, double d) {
        if (this.y(class070782, class072092, d).isEmpty()) {
            class07209 class072093 = this.z(class072092);
            throw this.N(class072092, "test.error.expected_entity", new Object[]{class070782.M()});
        }
    }

    public void N(class07209 class072092, Predicate<class00891> predicate, Function<class00891, class00392> function) {
        this.y(class072092, (class00500 class005002) -> predicate.test(class005002.i()), (class00500 class005002) -> (class00392)function.apply(class005002.i()));
    }

    public void N(Class<? extends class07049> clazz) {
        class00734 class007342 = this.z();
        this.N().N(clazz, class007342.M(1.0), (T class070492) -> !(class070492 instanceof class08036)).forEach(class070492 -> class070492.method_5768(this.N()));
    }

    public void N(class07049 class070492, int n, int n2, int n3) {
        this.N(class070492, new class07209(n, n2, n3));
    }

    public void N(class07078<?> class070782, class07209 class072092, int n, double d) {
        class07209 class072093 = this.z(class072092);
        List<?> list = this.y(class070782, class072092, d);
        if (list.size() != n) {
            throw this.N(class072092, "test.error.expected_entity_count", n, class070782.M(), list.size());
        }
    }

    public void N(class07078<?> class070782, int n) {
        List list = this.N().method_18023(class070782, this.z(), class07049::method_5805);
        if (list.size() != n) {
            throw this.N("test.error.expected_entity_count", n, class070782.M(), list.size());
        }
    }

    public void N(class07078<?> class070782, class00734 class007342, class00392 class003922) {
        class00734 class007343 = this.N(class007342);
        if (!this.N().method_74143(class070782, class007343, class07049::method_5805)) {
            throw this.N(class07209.method_49638((class00737)class007342.R()), class003922);
        }
    }

    public void N(Runnable runnable) {
        this.E();
        this.N.T().N(0L, runnable).N();
    }

    public void N(class07209 class072092, long l) {
        this.N(class072092, class00869.BF);
        this.y(l, () -> this.N(class072092, class00869.N));
    }

    public void N(int n, Runnable runnable) {
        this.E();
        this.N.T().N((long)n, runnable).N();
    }

    public void N(long l, Runnable runnable) {
        this.N.N(l, runnable);
    }

    public void N(int n, int n2, int n3, class00891 class008912) {
        this.N(new class07209(n, n2, n3), class008912);
    }

    public class07438 N(class07438 class074382) {
        class074382.method_5855(0);
        class074382.method_6033(0.25f);
        return class074382;
    }

    public void N(int n, int n2, int n3, class00500 class005002) {
        this.N(new class07209(n, n2, n3), class005002);
    }

    public void N(class00392 class003922, class07049 class070492) {
        throw this.N(class070492.method_24515(), class003922);
    }

    public void N(class00392 class003922, class07209 class072092) {
        throw this.N(class072092, class003922);
    }

    public int N(class07830 class078302, int n, int n2) {
        class07209 class072092 = this.z(new class07209(n, 0, n2));
        return this.U(this.N().N(class078302, class072092)).method_10264();
    }

    public class08036 N(class07282 class072822) {
        return new class05529(this, (class07299)this.N(), new GameProfile(UUID.randomUUID(), "test-mock-player"), class072822);
    }

    public <E extends class07049> List<E> N(class07078<E> class070782, class07209 class072092, int n) {
        return this.N(class070782, class06889.L((class00753)class072092), n);
    }

    public <T extends class00394> T N(class07209 class072092, Class<T> clazz) {
        class00394 class003942 = this.N().method_8321(this.z(class072092));
        if (class003942 == null) {
            throw this.N(class072092, "test.error.missing_block_entity", new Object[0]);
        }
        if (clazz.isInstance(class003942)) {
            return (T)((class00394)clazz.cast(class003942));
        }
        throw this.N(class072092, "test.error.wrong_block_entity", new Object[]{class003942.O().method_53254().M()});
    }

    public void N(class05163 class051632, class07209 class072092) {
        class07209.method_23627((class05163)class051632).forEach(class072093 -> {
            class07209 class072094 = class072092.method_10069(class072093.method_10263() - class051632.B(), class072093.method_10264() - class051632.Z(), class072093.method_10260() - class051632.z());
            this.N((class07209)class072093, class072094);
        });
    }

    public void N(class07209 class072092, class07209 class072093) {
        class00500 class005002;
        class00500 class005003 = this.N(class072092);
        if (class005003 != (class005002 = this.N(class072093))) {
            throw this.N(class072092, "test.error.state_not_equal", class005002, class005003);
        }
    }

    public void N(long l, class07209 class072092, class06581 class065812) {
        this.N(l, () -> this.N(class072092, class065812));
    }

    public void N(long l, class07209 class072092) {
        this.N(l, () -> this.R(class072092));
    }

    public void N(class07209 class072092, class00891 class008912, class07211 class072112) {
        this.N(class072092, class008912.W(), class072112);
    }

    public void N(class07209 class072092, class06581 class065812) {
        if (this.N(class072092, class07236.class).N_61(class065812) != 1) {
            throw this.N(class072092, "test.error.expected_container_contents_single", new Object[]{class065812.U()});
        }
    }

    public void N(String string) {
        throw this.N((class00392)class00392.y((String)string));
    }

    public void N(class07438 class074382, class03556<class07084> class035562, int n) {
        class07055 class070552 = class074382.method_6112(class035562);
        if (class070552 == null || class070552.i() != n) {
            throw this.N("test.error.expected_entity_effect", class074382.method_5477(), class06517.N(class035562, (int)n));
        }
    }

    public void N(class07209 class072092, class00891 class008912) {
        this.N(class072092, class008912.W());
    }

    public <E extends class07049, T> void N(E e, Function<E, T> function, T t, class00392 class003922) {
        T t2 = function.apply(e);
        if (!t2.equals(t)) {
            throw this.N(e.method_24515(), "test.error.entity_property_details", e.method_5477(), class003922, t2, t);
        }
    }

    public void N(class07209 class072092, class00500 class005002) {
        this.N().method_8652(this.z(class072092), class005002, 3);
    }

    public <E extends class07049> void N(E e, Predicate<E> predicate, class00392 class003922) {
        if (!predicate.test(e)) {
            throw this.N(e.method_24515(), "test.error.entity_property", e.method_5477(), class003922);
        }
    }

    public void R(class07209 class072092) {
        if (!this.N(class072092, class07236.class).method_5442()) {
            throw this.N(class072092, "test.error.expected_empty_container", new Object[0]);
        }
    }

    public class05882 R() {
        return this.N.T();
    }

    public void R(class07078<?> class070782, class07209 class072092) {
        this.y(() -> this.u(class070782, class072092));
    }

    public void R(class07078<?> class070782, int n, int n2, int n3) {
        this.R(class070782, new class07209(n, n2, n3));
    }
}

