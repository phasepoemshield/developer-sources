/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Iterables
 *  com.google.common.collect.Maps
 *  minecraft.class00392
 *  minecraft.class00394
 *  minecraft.class00500
 *  minecraft.class01194
 *  minecraft.class01235
 *  minecraft.class02484
 *  minecraft.class03556
 *  minecraft.class03767
 *  minecraft.class04506
 *  minecraft.class04770
 *  minecraft.class04782
 *  minecraft.class05835
 *  minecraft.class06113
 *  minecraft.class06183
 *  minecraft.class06501
 *  minecraft.class06889
 *  minecraft.class07049
 *  minecraft.class07050
 *  minecraft.class07077
 *  minecraft.class07078
 *  minecraft.class07079
 *  minecraft.class07082
 *  minecraft.class07086
 *  minecraft.class07113
 *  minecraft.class07117
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07290
 *  minecraft.class07299
 *  minecraft.class07438
 *  minecraft.class08036
 *  minecraft.class08162
 *  minecraft.class08983
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.google.common.collect.Iterables;
import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import minecraft.class00392;
import minecraft.class00394;
import minecraft.class00500;
import minecraft.class01194;
import minecraft.class01235;
import minecraft.class02484;
import minecraft.class03556;
import minecraft.class03767;
import minecraft.class04506;
import minecraft.class04770;
import minecraft.class04782;
import minecraft.class05835;
import minecraft.class06113;
import minecraft.class06183;
import minecraft.class06501;
import minecraft.class06573;
import minecraft.class06581;
import minecraft.class06584;
import minecraft.class06889;
import minecraft.class07049;
import minecraft.class07050;
import minecraft.class07077;
import minecraft.class07078;
import minecraft.class07079;
import minecraft.class07082;
import minecraft.class07086;
import minecraft.class07113;
import minecraft.class07117;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07290;
import minecraft.class07299;
import minecraft.class07438;
import minecraft.class08036;
import minecraft.class08162;
import minecraft.class08983;
import org.jspecify.annotations.Nullable;

public class class06530
extends class06581 {
    private static final Map<class07078<?>, class06530> N = Maps.newIdentityHashMap();

    public class06530(class06573 class065732) {
        super(class065732);
        class08983 class089832 = (class08983)this.R().method_58694(class02484.NR);
        if (class089832 != null) {
            N.put((class07078)class089832.N(), this);
        }
    }

    public @Nullable class07078<?> u(class06584 class065842) {
        class08983 class089832 = (class08983)class065842.method_58694(class02484.NR);
        if (class089832 != null) {
            return (class07078)class089832.N();
        }
        return null;
    }

    private class07082 N(@Nullable class07438 class074382, class06584 class065842, class07299 class072992, class07209 class072092, boolean bl, boolean bl2) {
        class07078<?> var7 = this.u(class065842);
        if (var7 == null) {
            return class07082.u;
        }
        if (!var7.b() && class072992.y() == class07086.field_5801) {
            return class07082.u;
        }
        if (var7.N((class04782)class072992, class065842, class074382, class072092, class06113.field_16465, bl, bl2) != null) {
            class065842.N(1, class074382);
            class072992.N((class07049)class074382, (class03556)class01194.v, class072092);
        }
        return class07082.N;
    }

    public Optional<class07079> N(class08036 class080362, class07079 class070792, class07078<? extends class07079> class070782, class04782 class047822, class06889 class068892, class06584 class065842) {
        if (!this.N(class065842, class070782)) {
            return Optional.empty();
        }
        Object object = class070792 instanceof class07077 ? ((class07077)class070792).y(class047822, (class07077)class070792) : (class07079)class070782.N((class07299)class047822, class06113.field_16465);
        if (object == null) {
            return Optional.empty();
        }
        object.y(true);
        if (!object.method_6109()) {
            return Optional.empty();
        }
        object.method_5808(class068892.N(), class068892.y(), class068892.L(), 0.0f, 0.0f);
        object.method_66652(class065842);
        class047822.y((class07049)object);
        class065842.N(1, (class07438)class080362);
        return Optional.of(object);
    }

    @Override
    public boolean N(class06584 class065842, @Nullable class08036 class080362) {
        class08983 class089832;
        if (class080362 != null && class080362.method_75004().hasPermission(class08162.y) && (class089832 = (class08983)class065842.method_58694(class02484.NR)) != null) {
            return ((class07078)class089832.N()).j();
        }
        return false;
    }

    public static Iterable<class06530> N() {
        return Iterables.unmodifiableIterable(N.values());
    }

    @Override
    public class07082 N(class07299 class072992, class08036 class080362, class07050 class070502) {
        class06584 class065842 = class080362.method_5998(class070502);
        class06183 class061832 = class06530.N(class072992, class080362, class05835.field_1345);
        if (class061832.N() != class07113.field_1332) {
            return class07082.i;
        }
        if (!(class072992 instanceof class04782)) {
            return class07082.N;
        }
        class04782 class047822 = (class04782)class072992;
        class07209 class072092 = class061832.u();
        if (!(class072992.method_8320(class072092).i() instanceof class07117)) {
            return class07082.i;
        }
        if (!class072992.method_8505((class07049)class080362, class072092) || !class080362.method_7343(class072092, class061832.i(), class065842)) {
            return class07082.u;
        }
        class07082 class070822 = this.N((class07438)class080362, class065842, class072992, class072092, false, false);
        if (class070822 == class07082.N) {
            class080362.method_7259(class01235.L.y((Object)this));
        }
        return class070822;
    }

    public boolean N(class06584 class065842, class07078<?> class070782) {
        return Objects.equals(this.u(class065842), class070782);
    }

    public static @Nullable class06530 N(@Nullable class07078<?> class070782) {
        return N.get(class070782);
    }

    @Override
    public class07082 N(class06501 class065012) {
        class07299 class072992 = class065012.method_8045();
        if (!(class072992 instanceof class04782)) {
            return class07082.N;
        }
        class04782 class047822 = (class04782)class072992;
        class06584 class065842 = class065012.method_8041();
        class07209 class072092 = class065012.method_8037();
        class07211 class072112 = class065012.method_8038();
        class00500 class005002 = class072992.method_8320(class072092);
        class00394 class003942 = class072992.method_8321(class072092);
        if (class003942 instanceof class04506) {
            class04506 class045062 = (class04506)class003942;
            class07078<?> var9 = this.u(class065842);
            if (var9 == null) {
                return class07082.u;
            }
            if (!class047822.method_75001()) {
                class08036 class080362 = class065012.method_8036();
                if (class080362 instanceof class04770) {
                    ((class04770)class080362).method_64398((class00392)class00392.L((String)"advMode.notEnabled.spawner"));
                }
                return class07082.u;
            }
            class045062.N(var9, class072992.method_8409());
            class072992.method_8413(class072092, class005002, class005002, 3);
            class072992.N((class07049)class065012.method_8036(), (class03556)class01194.L, class072092);
            class065842.B(1);
            return class07082.N;
        }
        class07209 class072093 = class005002.M((class07290)class072992, class072092).method_1110() ? class072092 : class072092.method_10093(class072112);
        return this.N((class07438)class065012.method_8036(), class065842, class072992, class072093, true, !Objects.equals(class072092, class072093) && class072112 == class07211.field_11036);
    }

    @Override
    public class03767 method_45322() {
        return Optional.ofNullable((class08983)this.R().method_58694(class02484.NR)).map(class08983::N).map(class07078::method_45322).orElseGet(class03767::N);
    }
}

