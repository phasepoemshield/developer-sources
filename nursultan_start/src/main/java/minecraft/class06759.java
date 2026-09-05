/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  minecraft.class00384
 *  minecraft.class00394
 *  minecraft.class00402
 *  minecraft.class00500
 *  minecraft.class00517
 *  minecraft.class00869
 *  minecraft.class00891
 *  minecraft.class01137
 *  minecraft.class01362
 *  minecraft.class02484
 *  minecraft.class02733
 *  minecraft.class04782
 *  minecraft.class05018
 *  minecraft.class06069
 *  minecraft.class06183
 *  minecraft.class06584
 *  minecraft.class06665
 *  minecraft.class06667
 *  minecraft.class06942
 *  minecraft.class06993
 *  minecraft.class07082
 *  minecraft.class07111
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07218
 *  minecraft.class07299
 *  minecraft.class07305
 *  minecraft.class07327
 *  minecraft.class07438
 *  minecraft.class07796
 *  minecraft.class08036
 *  minecraft.class08064
 *  minecraft.class08092
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import minecraft.class00384;
import minecraft.class00394;
import minecraft.class00402;
import minecraft.class00500;
import minecraft.class00517;
import minecraft.class00869;
import minecraft.class00891;
import minecraft.class01137;
import minecraft.class01362;
import minecraft.class02484;
import minecraft.class02733;
import minecraft.class04782;
import minecraft.class05018;
import minecraft.class06069;
import minecraft.class06183;
import minecraft.class06584;
import minecraft.class06665;
import minecraft.class06667;
import minecraft.class06760;
import minecraft.class06942;
import minecraft.class06993;
import minecraft.class07082;
import minecraft.class07111;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07218;
import minecraft.class07299;
import minecraft.class07305;
import minecraft.class07327;
import minecraft.class07438;
import minecraft.class07796;
import minecraft.class08036;
import minecraft.class08064;
import minecraft.class08092;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class class06759
extends class07796
implements class01137 {
    public static final MapCodec<class06759> N = RecordCodecBuilder.mapCodec(instance -> instance.group((App)Codec.BOOL.fieldOf("automatic").forGetter(class067592 -> class067592.i), (App)class06759.t()).apply(instance, class06759::new));
    private static final Logger u = LogUtils.getLogger();
    public static final class08064<class07211> y = class06760.y;
    public static final class06667 L = class06665.R;
    private final boolean i;

    public class06759(boolean bl, class01362 class013622) {
        super(class013622);
        this.P((class00500)((class00500)((class00500)this.Q.y()).y(y, (Comparable)class07211.field_11043)).y((class08092)L, (Comparable)Boolean.valueOf(false)));
        this.i = bl;
    }

    protected void N(class00517<class00891, class00500> class005172) {
        class005172.N(new class08092[]{y, L});
    }

    protected class00500 N(class00500 class005002, class07111 class071112) {
        return class005002.N(class071112.N((class07211)class005002.L(y)));
    }

    public class00500 N(class06942 class069422) {
        return (class00500)this.W().y(y, (Comparable)class069422.L().b());
    }

    protected class00500 N(class00500 class005002, class06993 class069932) {
        return (class00500)class005002.y(y, (Comparable)class069932.N((class07211)class005002.L(y)));
    }

    public void N(class07299 class072992, class07209 class072092, class00500 class005002, @Nullable class07438 class074382, class06584 class065842) {
        class00394 class003942 = class072992.method_8321(class072092);
        if (!(class003942 instanceof class00402)) {
            return;
        }
        class00402 class004022 = (class00402)class003942;
        class07327 class073272 = class004022.N();
        if (class072992 instanceof class04782) {
            class04782 class047822 = (class04782)class072992;
            if (!class065842.L(class02484.NB)) {
                class073272.N(((Boolean)class047822.method_64395().N(class07305.F)).booleanValue());
                class004022.y(this.i);
            }
            boolean bl = class072992.W(class072092);
            this.N(class072992, class072092, class004022, bl);
        }
    }

    public MapCodec<class06759> N() {
        return N;
    }

    private static void N(class04782 class047822, class07209 class072092, class07211 class072112) {
        class07218 class072182 = class072092.method_25503();
        class07305 class073052 = class047822.method_64395();
        int n = (Integer)class073052.N(class07305.w);
        while (n-- > 0) {
            class00402 class004022;
            class00394 class003942;
            class072182.N(class072112);
            class00500 class005002 = class047822.method_8320((class07209)class072182);
            class00891 class008912 = class005002.i();
            if (!class005002.N(class00869.EO) || !((class003942 = class047822.method_8321((class07209)class072182)) instanceof class00402) || (class004022 = (class00402)class003942).Z() != class00384.field_11922) break;
            if (class004022.L() || class004022.u()) {
                class07327 class073272 = class004022.N();
                if (class004022.B()) {
                    if (!class073272.y(class047822)) break;
                    class047822.method_8455((class07209)class072182, class008912);
                } else if (class004022.z()) {
                    class073272.N(0);
                }
            }
            class072112 = (class07211)class005002.L(y);
        }
        if (n <= 0) {
            int n2 = Math.max((Integer)class073052.N(class07305.w), 0);
            u.warn("Command Block chain tried to execute more than {} steps!", (Object)n2);
        }
    }

    protected void N(class00500 class005002, class04782 class047822, class07209 class072092, class06069 class060692) {
        class00394 class003942 = class047822.method_8321(class072092);
        if (class003942 instanceof class00402) {
            class00402 class004022 = (class00402)class003942;
            class07327 class073272 = class004022.N();
            boolean bl = !class05018.y((String)class073272.u());
            class00384 class003842 = class004022.Z();
            boolean bl2 = class004022.M();
            if (class003842 == class00384.field_11923) {
                class004022.B();
                if (bl2) {
                    this.N(class005002, class047822, class072092, class073272, bl);
                } else if (class004022.z()) {
                    class073272.N(0);
                }
                if (class004022.L() || class004022.u()) {
                    class047822.N(class072092, (class00891)this, 1);
                }
            } else if (class003842 == class00384.field_11924) {
                if (bl2) {
                    this.N(class005002, class047822, class072092, class073272, bl);
                } else if (class004022.z()) {
                    class073272.N(0);
                }
            }
            class047822.method_8455(class072092, (class00891)this);
        }
    }

    private void N(class07299 class072992, class07209 class072092, class00402 class004022, boolean bl) {
        boolean bl2 = class004022.L();
        if (bl == bl2) {
            return;
        }
        class004022.N(bl);
        if (bl) {
            if (class004022.u() || class004022.Z() == class00384.field_11922) {
                return;
            }
            class004022.B();
            class072992.N(class072092, (class00891)this, 1);
        }
    }

    protected void N(class00500 class005002, class07299 class072992, class07209 class072092, class00891 class008912, @Nullable class02733 class027332, boolean bl) {
        if (class072992.method_8608()) {
            return;
        }
        class00394 class003942 = class072992.method_8321(class072092);
        if (class003942 instanceof class00402) {
            class00402 class004022 = (class00402)class003942;
            this.N(class072992, class072092, class004022, class072992.W(class072092));
        }
    }

    public class00394 N(class07209 class072092, class00500 class005002) {
        class00402 class004022 = new class00402(class072092, class005002);
        class004022.y(this.i);
        return class004022;
    }

    protected int N_24(class00500 class005002, class07299 class072992, class07209 class072092, class07211 class072112) {
        class00394 class003942 = class072992.method_8321(class072092);
        if (class003942 instanceof class00402) {
            return ((class00402)class003942).N().y();
        }
        return 0;
    }

    protected boolean N(class00500 class005002) {
        return true;
    }

    protected class07082 N(class00500 class005002, class07299 class072992, class07209 class072092, class08036 class080362, class06183 class061832) {
        class00394 class003942 = class072992.method_8321(class072092);
        if (class003942 instanceof class00402 && class080362.method_7338()) {
            class080362.method_7323((class00402)class003942);
            return class07082.N;
        }
        return class07082.i;
    }

    private void N(class00500 class005002, class04782 class047822, class07209 class072092, class07327 class073272, boolean bl) {
        if (bl) {
            class073272.y(class047822);
        } else {
            class073272.N(0);
        }
        class06759.N(class047822, class072092, (class07211)class005002.L(y));
    }
}

