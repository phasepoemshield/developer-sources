/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  com.mojang.serialization.codecs.RecordCodecBuilder$Instance
 *  minecraft.class00765
 *  minecraft.class00780
 *  minecraft.class01042
 *  minecraft.class01146
 *  minecraft.class01224
 *  minecraft.class01281
 *  minecraft.class01834
 *  minecraft.class03291
 *  minecraft.class03299
 *  minecraft.class03300
 *  minecraft.class03543
 *  minecraft.class03556
 *  minecraft.class04084
 *  minecraft.class04206
 *  minecraft.class04227
 *  minecraft.class04367
 *  minecraft.class04426
 *  minecraft.class04932
 *  minecraft.class05163
 *  minecraft.class05324
 *  minecraft.class05474
 *  minecraft.class05946
 *  minecraft.class05974
 *  minecraft.class06040
 *  minecraft.class06069
 *  minecraft.class06993
 *  minecraft.class07209
 *  minecraft.class07299
 *  minecraft.class07321
 *  minecraft.class07428
 *  minecraft.class07830
 *  minecraft.class07852
 *  minecraft.class08088
 */
package minecraft;

import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import minecraft.class00765;
import minecraft.class00780;
import minecraft.class01042;
import minecraft.class01146;
import minecraft.class01224;
import minecraft.class01281;
import minecraft.class01834;
import minecraft.class03291;
import minecraft.class03299;
import minecraft.class03300;
import minecraft.class03543;
import minecraft.class03556;
import minecraft.class04084;
import minecraft.class04206;
import minecraft.class04227;
import minecraft.class04367;
import minecraft.class04426;
import minecraft.class04758;
import minecraft.class04764;
import minecraft.class04780;
import minecraft.class04932;
import minecraft.class05163;
import minecraft.class05324;
import minecraft.class05474;
import minecraft.class05946;
import minecraft.class05974;
import minecraft.class06040;
import minecraft.class06069;
import minecraft.class06993;
import minecraft.class07209;
import minecraft.class07299;
import minecraft.class07321;
import minecraft.class07428;
import minecraft.class07830;
import minecraft.class07852;
import minecraft.class08088;

public abstract class class04748 {
    public static final Codec<class04748> L = class04206.F.T().dispatch(class04748::N, class04367::codec);
    public static final Codec<class03556<class04748>> u = class01281.N((class05946)class04227.yj, L);
    protected final class04758 i;

    public Map<class07428, class04426> L() {
        return this.i.y();
    }

    private static int[] L(class04764 class047642, int n, int n2, int n3, int n4) {
        class08088 class080882 = class047642.y();
        class05474 class054742 = class047642.Z();
        class04084 class040842 = class047642.u();
        return new int[]{class080882.L(n, n3, class07830.field_13194, class054742, class040842), class080882.L(n, n3 + n4, class07830.field_13194, class054742, class040842), class080882.L(n + n2, n3, class07830.field_13194, class054742, class040842), class080882.L(n + n2, n3 + n4, class07830.field_13194, class054742, class040842)};
    }

    public class04748(class04758 class047582) {
        this.i = class047582;
    }

    public class06040 i() {
        return this.i.u();
    }

    public class07852 u() {
        return this.i.L();
    }

    public static int y(class04764 class047642, int n, int n2, int n3, int n4) {
        int[] nArray = class04748.L(class047642, n, n3, n2, n4);
        return Math.min(Math.min(nArray[0], nArray[1]), Math.min(nArray[2], nArray[3]));
    }

    public Optional<class04780> y(class04764 class047642) {
        return this.N(class047642).filter(class047802 -> class04748.N(class047802, class047642));
    }

    public class03543<class00780> y() {
        return this.i.N();
    }

    protected abstract Optional<class04780> N(class04764 var1);

    @Deprecated
    protected class07209 N(class04764 class047642, class06993 class069932) {
        int n = 5;
        int n2 = 5;
        if (class069932 == class06993.field_11463) {
            n = -5;
        } else if (class069932 == class06993.field_11464) {
            n = -5;
            n2 = -5;
        } else if (class069932 == class06993.field_11465) {
            n2 = -5;
        }
        class07321 class073212 = class047642.B();
        int n3 = class073212.N(7);
        int n4 = class073212.y(7);
        return new class07209(n3, class04748.y(class047642, n3, n4, n, n2), n4);
    }

    public abstract class04367<?> N();

    public static <S extends class04748> RecordCodecBuilder<S, class04758> N(RecordCodecBuilder.Instance<S> instance) {
        return class04758.R.forGetter(class047482 -> class047482.i);
    }

    private static boolean N(class04780 class047802, class04764 class047642) {
        class07209 class072092 = class047802.y();
        return class047642.z().test((class03556<class00780>)class047642.y().u().method_38109(class01146.N((int)class072092.method_10263()), class01146.N((int)class072092.method_10264()), class01146.N((int)class072092.method_10260()), class047642.u().y()));
    }

    protected static Optional<class04780> N(class04764 class047642, class07830 class078302, Consumer<class03291> consumer) {
        class07321 class073212 = class047642.B();
        int n = class073212.L();
        int n2 = class073212.u();
        int n3 = class047642.y().L(n, n2, class078302, class047642.Z(), class047642.u());
        return Optional.of(new class04780(new class07209(n, n3, n2), consumer));
    }

    public class04932 N(class03556<class04748> class035562, class05946<class07299> class059462, class01042 class010422, class08088 class080882, class00765 class007652, class04084 class040842, class01224 class012242, long l, class07321 class073212, int n, class05474 class054742, Predicate<class03556<class00780>> predicate) {
        class03291 class032912;
        class04932 class049322;
        class03299 class032992 = class01834.M.N(class073212, class059462, class035562);
        class04764 class047642 = new class04764(class010422, class080882, class007652, class040842, class012242, l, class073212, class054742, predicate);
        Optional<class04780> optional = this.y(class047642);
        if (optional.isPresent() && (class049322 = new class04932(this, class073212, n, (class032912 = optional.get().N()).N())).y()) {
            if (class032992 != null) {
                class032992.finish(true);
            }
            return class049322;
        }
        if (class032992 != null) {
            class032992.finish(false);
        }
        return class04932.y;
    }

    public class05163 N(class05163 class051632) {
        if (this.i() != class06040.field_28922) {
            return class051632.N(12);
        }
        return class051632;
    }

    protected static int N(class04764 class047642, int n, int n2) {
        class07321 class073212 = class047642.B();
        int n3 = class073212.i();
        int n4 = class073212.R();
        return class04748.y(class047642, n3, n4, n, n2);
    }

    public static int N(class04764 class047642, int n, int n2, int n3, int n4) {
        int[] nArray = class04748.L(class047642, n, n2, n3, n4);
        return (nArray[0] + nArray[1] + nArray[2] + nArray[3]) / 4;
    }

    public static <S extends class04748> MapCodec<S> N(Function<class04758, S> function) {
        return RecordCodecBuilder.mapCodec(instance -> instance.group(class04748.N(instance)).apply((Applicative)instance, function));
    }

    public void N(class05974 class059742, class05324 class053242, class08088 class080882, class06069 class060692, class05163 class051632, class07321 class073212, class03300 class033002) {
    }
}

