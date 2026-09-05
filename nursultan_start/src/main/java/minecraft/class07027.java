/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.MatchException
 *  minecraft.class00389
 *  minecraft.class00394
 *  minecraft.class00404
 *  minecraft.class00494
 *  minecraft.class00500
 *  minecraft.class00517
 *  minecraft.class00717
 *  minecraft.class00734
 *  minecraft.class00869
 *  minecraft.class00891
 *  minecraft.class01118
 *  minecraft.class01235
 *  minecraft.class01362
 *  minecraft.class01514
 *  minecraft.class01894
 *  minecraft.class04160
 *  minecraft.class04782
 *  minecraft.class06092
 *  minecraft.class06183
 *  minecraft.class06237
 *  minecraft.class06551
 *  minecraft.class06563
 *  minecraft.class06584
 *  minecraft.class06704
 *  minecraft.class06760
 *  minecraft.class06889
 *  minecraft.class06942
 *  minecraft.class07111
 *  minecraft.class07144
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07266
 *  minecraft.class07278
 *  minecraft.class07290
 *  minecraft.class07299
 *  minecraft.class07310
 *  minecraft.class07482
 *  minecraft.class07796
 *  minecraft.class08036
 *  minecraft.class08064
 *  minecraft.class08092
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import minecraft.class00389;
import minecraft.class00394;
import minecraft.class00404;
import minecraft.class00494;
import minecraft.class00500;
import minecraft.class00517;
import minecraft.class00717;
import minecraft.class00734;
import minecraft.class00869;
import minecraft.class00891;
import minecraft.class01118;
import minecraft.class01235;
import minecraft.class01362;
import minecraft.class01514;
import minecraft.class01894;
import minecraft.class04160;
import minecraft.class04782;
import minecraft.class06092;
import minecraft.class06183;
import minecraft.class06237;
import minecraft.class06551;
import minecraft.class06563;
import minecraft.class06584;
import minecraft.class06704;
import minecraft.class06760;
import minecraft.class06889;
import minecraft.class06942;
import minecraft.class06993;
import minecraft.class07049;
import minecraft.class07082;
import minecraft.class07111;
import minecraft.class07144;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07266;
import minecraft.class07278;
import minecraft.class07290;
import minecraft.class07299;
import minecraft.class07310;
import minecraft.class07482;
import minecraft.class07796;
import minecraft.class08036;
import minecraft.class08064;
import minecraft.class08092;
import org.jspecify.annotations.Nullable;

public class class07027
extends class07796 {
    public static final MapCodec<class07027> N = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class06563.field_41600.optionalFieldOf("color").forGetter(class070272 -> Optional.ofNullable(class070272.i)), (App)class07027.t()).apply(instance, (optional, class013622) -> new class07027(optional.orElse(null), (class01362)class013622)));
    public static final Map<class07211, class00494> y = class00389.u((class00494)class00891.L((double)16.0, (double)0.0, (double)1.0));
    public static final class08064<class07211> L = class06760.y;
    public static final class01894 u = class01894.y((String)"contents");
    private final @Nullable class06563 i;

    public class07027(@Nullable class06563 class065632, class01362 class013622) {
        super(class013622);
        this.i = class065632;
        this.P((class00500)((class00500)this.Q.y()).y(L, (Comparable)class07211.field_11036));
    }

    protected class00494 u(class00500 class005002, class07290 class072902, class07209 class072092) {
        class00394 class003942 = class072902.method_8321(class072092);
        if (class003942 instanceof class07278 && !((class07278)class003942).U()) {
            return y.get(((class07211)class005002.L(L)).b());
        }
        return class00389.y();
    }

    public static class06584 y(@Nullable class06563 class065632) {
        return new class06584((class07310)class07027.N(class065632));
    }

    protected boolean y(class00500 class005002) {
        return false;
    }

    public @Nullable class06563 y() {
        return this.i;
    }

    protected class00500 N(class00500 class005002, class07111 class071112) {
        return class005002.N(class071112.N((class07211)class005002.L(L)));
    }

    protected class00500 N(class00500 class005002, class06993 class069932) {
        return (class00500)class005002.y(L, (Comparable)class069932.N((class07211)class005002.L(L)));
    }

    public class00394 N(class07209 class072092, class00500 class005002) {
        return new class07278(this.i, class072092, class005002);
    }

    public <T extends class00394> @Nullable class01118<T> N(class07299 class072992, class00500 class005002, class00404<T> class004042) {
        return class07027.N(class004042, (class00404)class00404.field_11896, class07278::N);
    }

    public static class00891 N(@Nullable class06563 class065632) {
        if (class065632 == null) {
            return class00869.Ee;
        }
        return switch (class065632) {
            default -> throw new MatchException(null, null);
            case class06563.field_7952 -> class00869.EH;
            case class06563.field_7946 -> class00869.Ec;
            case class06563.field_7958 -> class00869.EX;
            case class06563.field_7951 -> class00869.Ea;
            case class06563.field_7947 -> class00869.Ep;
            case class06563.field_7961 -> class00869.EF;
            case class06563.field_7954 -> class00869.EA;
            case class06563.field_7944 -> class00869.Ef;
            case class06563.field_7967 -> class00869.EC;
            case class06563.field_7955 -> class00869.ES;
            case class06563.field_7966 -> class00869.ED;
            case class06563.field_7957 -> class00869.Eh;
            case class06563.field_7942 -> class00869.Er;
            case class06563.field_7964 -> class00869.WN;
            case class06563.field_7963 -> class00869.Wy;
            case class06563.field_7945 -> class00869.Ex;
        };
    }

    public MapCodec<class07027> N() {
        return N;
    }

    protected void N(class00500 class005002, class04782 class047822, class07209 class072092, boolean bl) {
        class06704.N((class00500)class005002, (class07299)class047822, (class07209)class072092);
    }

    protected List<class06584> N(class00500 class005002, class04160 class041602) {
        class00394 class003942 = (class00394)class041602.y(class06551.z);
        if (class003942 instanceof class07278) {
            class07278 class072782 = (class07278)class003942;
            class041602 = class041602.N(u, consumer -> {
                for (int i = 0; i < class072782.method_5439(); ++i) {
                    consumer.accept(class072782.method_5438(i));
                }
            });
        }
        return super.N(class005002, class041602);
    }

    public class00500 N(class07299 class072992, class07209 class072092, class00500 class005002, class08036 class080362) {
        class00394 class003942 = class072992.method_8321(class072092);
        if (class003942 instanceof class07278) {
            class07278 class072782 = (class07278)class003942;
            if (!class072992.method_8608() && class080362.method_66324() && !class072782.method_5442()) {
                class06584 class065842 = class07027.y(this.y());
                class065842.y(class003942.g());
                class00717 class007172 = new class00717(class072992, (double)class072092.method_10263() + 0.5, (double)class072092.method_10264() + 0.5, (double)class072092.method_10260() + 0.5, class065842);
                class007172.L();
                class072992.method_8649((class07049)class007172);
            } else {
                class072782.y(class080362);
            }
        }
        return super.N(class072992, class072092, class005002, class080362);
    }

    protected void N(class00517<class00891, class00500> class005172) {
        class005172.N(new class08092[]{L});
    }

    public class00500 N(class06942 class069422) {
        return (class00500)this.W().y(L, (Comparable)class069422.method_8038());
    }

    protected int N_24(class00500 class005002, class07299 class072992, class07209 class072092, class07211 class072112) {
        return class07482.N((class00394)class072992.method_8321(class072092));
    }

    protected boolean N(class00500 class005002) {
        return true;
    }

    protected class07082 N(class00500 class005002, class07299 class072992, class07209 class072092, class08036 class080362, class06183 class061832) {
        if (class072992 instanceof class04782) {
            class07278 class072782;
            class04782 class047822 = (class04782)class072992;
            class00394 class003942 = class072992.method_8321(class072092);
            if (class003942 instanceof class07278 && class07027.N(class005002, class072992, class072092, class072782 = (class07278)class003942)) {
                class080362.method_17355((class06237)class072782);
                class080362.method_7281(class01235.Nj);
                class01514.N((class04782)class047822, (class08036)class080362, (boolean)true);
            }
        }
        return class07082.N;
    }

    protected class00494 N(class00500 class005002, class07290 class072902, class07209 class072092, class06092 class060922) {
        class00394 class003942 = class072902.method_8321(class072092);
        if (class003942 instanceof class07278) {
            return class00389.N((class00734)((class07278)class003942).N(class005002));
        }
        return class00389.y();
    }

    private static boolean N(class00500 class005002, class07299 class072992, class07209 class072092, class07278 class072782) {
        if (class072782.u() != class07266.field_12065) {
            return true;
        }
        class00734 class007342 = class07144.N((float)1.0f, (class07211)((class07211)class005002.L(L)), (float)0.0f, (float)0.5f, (class06889)class072092.method_61082()).B(1.0E-6);
        return class072992.y(class007342);
    }
}

