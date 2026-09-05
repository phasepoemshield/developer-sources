/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  minecraft.class00394
 *  minecraft.class00404
 *  minecraft.class00494
 *  minecraft.class00500
 *  minecraft.class00517
 *  minecraft.class00891
 *  minecraft.class01118
 *  minecraft.class01162
 *  minecraft.class01164
 *  minecraft.class01193
 *  minecraft.class01194
 *  minecraft.class01210
 *  minecraft.class01362
 *  minecraft.class02142
 *  minecraft.class02151
 *  minecraft.class03481
 *  minecraft.class03493
 *  minecraft.class03502
 *  minecraft.class03508
 *  minecraft.class03556
 *  minecraft.class04651
 *  minecraft.class04684
 *  minecraft.class04688
 *  minecraft.class04782
 *  minecraft.class04909
 *  minecraft.class04911
 *  minecraft.class05487
 *  minecraft.class06069
 *  minecraft.class06084
 *  minecraft.class06092
 *  minecraft.class06584
 *  minecraft.class06665
 *  minecraft.class06667
 *  minecraft.class06867
 *  minecraft.class06942
 *  minecraft.class07049
 *  minecraft.class07078
 *  minecraft.class07126
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07290
 *  minecraft.class07299
 *  minecraft.class07536
 *  minecraft.class07796
 *  minecraft.class08064
 *  minecraft.class08071
 *  minecraft.class08092
 *  minecraft.class08713
 *  minecraft.class08791
 *  net.caffeinemc.mods.lithium.common.block.entity.SleepingBlockEntity
 *  org.jspecify.annotations.Nullable
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import minecraft.class00394;
import minecraft.class00404;
import minecraft.class00494;
import minecraft.class00500;
import minecraft.class00517;
import minecraft.class00891;
import minecraft.class01118;
import minecraft.class01162;
import minecraft.class01164;
import minecraft.class01193;
import minecraft.class01194;
import minecraft.class01210;
import minecraft.class01362;
import minecraft.class02142;
import minecraft.class02151;
import minecraft.class03481;
import minecraft.class03493;
import minecraft.class03502;
import minecraft.class03508;
import minecraft.class03556;
import minecraft.class04651;
import minecraft.class04684;
import minecraft.class04688;
import minecraft.class04782;
import minecraft.class04909;
import minecraft.class04911;
import minecraft.class05487;
import minecraft.class06069;
import minecraft.class06084;
import minecraft.class06092;
import minecraft.class06371;
import minecraft.class06584;
import minecraft.class06665;
import minecraft.class06667;
import minecraft.class06867;
import minecraft.class06942;
import minecraft.class07049;
import minecraft.class07078;
import minecraft.class07126;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07290;
import minecraft.class07299;
import minecraft.class07536;
import minecraft.class07796;
import minecraft.class08064;
import minecraft.class08071;
import minecraft.class08092;
import minecraft.class08713;
import minecraft.class08791;
import net.caffeinemc.mods.lithium.common.block.entity.SleepingBlockEntity;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class class06361
extends class07796
implements class06084 {
    public static final MapCodec<class06361> N = class06361.y(class06361::new);
    public static final int y = 30;
    public static final int L = 10;
    public static final class08064<class01193> u = class06665.yv;
    public static final class08071 i = class06665.ND;
    public static final class06667 R = class06665.q;
    private static final class00494 M = class00891.y((double)16.0, (double)0.0, (double)8.0);
    private static final float[] B = (float[])class07536.N((Object)new float[16], fArray -> {
        int[] nArray = new int[]{0, 0, 2, 4, 6, 7, 9, 10, 12, 14, 15, 18, 19, 21, 22, 24};
        for (int i = 0; i < 16; ++i) {
            fArray[i] = class06867.y((int)nArray[i]);
        }
    });

    public int L() {
        return 30;
    }

    public static boolean T(class00500 class005002) {
        return class06361.U(class005002) == class01193.field_28121;
    }

    public class06361(class01362 class013622) {
        super(class013622);
        this.P((class00500)((class00500)((class00500)((class00500)this.Q.y()).y(u, (Comparable)class01193.field_28121)).y((class08092)i, (Comparable)Integer.valueOf(0))).y((class08092)R, (Comparable)Boolean.valueOf(false)));
    }

    public static class01193 U(class00500 class005002) {
        return (class01193)class005002.L(u);
    }

    protected class04688 u(class00500 class005002) {
        if (((Boolean)class005002.L((class08092)R)).booleanValue()) {
            return class04684.L.N(false);
        }
        return super.u(class005002);
    }

    public int y(class00500 class005002, class07290 class072902, class07209 class072092, class07211 class072112) {
        if (class072112 == class07211.field_11036) {
            return class005002.N(class072902, class072092, class072112);
        }
        return 0;
    }

    private static void y(class07299 class072992, class07209 class072092, class00500 class005002) {
        class00891 class008912 = class005002.i();
        class072992.method_8408(class072092, class008912);
        class072992.method_8408(class072092.method_10074(), class008912);
    }

    public void N_20(class00500 class005002, class07299 class072992, class07209 class072092, class06069 class060692) {
        if (class06361.U(class005002) != class01193.field_28122) {
            return;
        }
        class07211 class072112 = class07211.y((class06069)class060692);
        if (class072112 == class07211.field_11036 || class072112 == class07211.field_11033) {
            return;
        }
        double d = (double)class072092.method_10263() + 0.5 + (class072112.P() == 0 ? 0.5 - class060692.U() : (double)class072112.P() * 0.6);
        double d2 = (double)class072092.method_10264() + 0.25;
        double d3 = (double)class072092.method_10260() + 0.5 + (class072112.T() == 0 ? 0.5 - class060692.U() : (double)class072112.T() * 0.6);
        double d4 = (double)class060692.z() * 0.04;
        class072992.method_8406((class07126)class01162.y, d, d2, d3, 0.0, d4, 0.0);
    }

    public static void N(@Nullable class07049 class070492, class07299 class072992, class07209 class072092, int n) {
        for (class07211 class072112 : class07211.values()) {
            class07209 class072093 = class072092.method_10093(class072112);
            class00500 class005002 = class072992.method_8320(class072093);
            if (!class005002.N(class01210.LU)) continue;
            class072992.N(class03502.y((int)n), class072093, class01164.N((class07049)class070492, (class00500)class005002));
            float f = B[n];
            class072992.method_8396(null, class072093, class04909.q, class04911.field_15245, 1.0f, f);
        }
    }

    private static void N(class07299 class072992, class07209 class072092, class00500 class005002, class06371 class063712, CallbackInfo callbackInfo) {
        class03508 class035082 = class063712.L();
        if (class035082.y() == null && class035082.N().N(Long.MAX_VALUE).isEmpty()) {
            ((SleepingBlockEntity)class063712).lithium$startSleeping();
        }
    }

    public void N(@Nullable class07049 class070492, class07299 class072992, class07209 class072092, class00500 class005002, int n, int n2) {
        class072992.method_8652(class072092, (class00500)((class00500)class005002.y(u, (Comparable)class01193.field_28122)).y((class08092)i, (Comparable)Integer.valueOf(n)), 3);
        class072992.N(class072092, class005002.i(), this.L());
        class06361.y(class072992, class072092, class005002);
        class06361.N(class070492, class072992, class072092, n2);
        class072992.N(class070492, (class03556)class01194.e, class072092);
        if (!((Boolean)class005002.L((class08092)R)).booleanValue()) {
            class072992.method_43128(null, (double)class072092.method_10263() + 0.5, (double)class072092.method_10264() + 0.5, (double)class072092.method_10260() + 0.5, class04909.wy, class04911.field_15245, 1.0f, class072992.field_9229.z() * 0.2f + 0.8f);
        }
    }

    protected void N(class00500 class005002, class04782 class047822, class07209 class072092, class06584 class065842, boolean bl) {
        super.N(class005002, class047822, class072092, class065842, bl);
        if (bl) {
            this.N(class047822, class072092, class065842, (class02142)class02151.N((int)5));
        }
    }

    protected boolean N(class00500 class005002, class08791 class087912) {
        return false;
    }

    protected int N_24(class00500 class005002, class07299 class072992, class07209 class072092, class07211 class072112) {
        class00394 class003942 = class072992.method_8321(class072092);
        if (class003942 instanceof class06371) {
            class06371 class063712 = (class06371)class003942;
            return class06361.U(class005002) == class01193.field_28122 ? class063712.R() : 0;
        }
        return 0;
    }

    protected boolean N(class00500 class005002) {
        return true;
    }

    public void N(class00517<class00891, class00500> class005172) {
        class005172.N(new class08092[]{u, i, R});
    }

    protected void N_23(class00500 class005002, class07299 class072992, class07209 class072092, class00500 class005003, boolean bl) {
        if (class072992.method_8608() || class005002.N(class005003.i())) {
            return;
        }
        if ((Integer)class005002.L((class08092)i) > 0 && !class072992.method_8397().N(class072092, (Object)this)) {
            class072992.method_8652(class072092, (class00500)class005002.y((class08092)i, (Comparable)Integer.valueOf(0)), 18);
        }
    }

    protected void N(class00500 class005002, class04782 class047822, class07209 class072092, boolean bl) {
        if (class06361.U(class005002) == class01193.field_28122) {
            class06361.y((class07299)class047822, class072092, class005002);
        }
    }

    protected class00500 N(class00500 class005002, class05487 class054872, class08713 class087132, class07209 class072092, class07211 class072112, class07209 class072093, class00500 class005003, class06069 class060692) {
        if (((Boolean)class005002.L((class08092)R)).booleanValue()) {
            class087132.N(class072092, (class04651)class04684.L, class04684.L.N(class054872));
        }
        return super.N(class005002, class054872, class087132, class072092, class072112, class072093, class005003, class060692);
    }

    public @Nullable class00394 N(class07209 class072092, class00500 class005002) {
        return new class06371(class072092, class005002);
    }

    public void N(class07299 class072992, class07209 class072092, class00500 class005002, class07049 class070492) {
        class00394 class003942;
        if (!class072992.method_8608() && class06361.T(class005002) && class070492.method_5864() != class07078.yX && (class003942 = class072992.method_8321(class072092)) instanceof class06371) {
            class06371 class063712 = (class06371)class003942;
            if (class072992 instanceof class04782) {
                class04782 class047822 = (class04782)class072992;
                if (class063712.u().N(class047822, class072092, (class03556)class01194.a, class01164.N((class00500)class005002))) {
                    class063712.B().y(class047822, (class03556)class01194.a, class01164.N((class07049)class070492), class070492.method_73189());
                }
            }
        }
        super.N(class072992, class072092, class005002, class070492);
    }

    protected void N(class00500 class005002, class04782 class047822, class07209 class072092, class06069 class060692) {
        if (class06361.U(class005002) != class01193.field_28122) {
            if (class06361.U(class005002) == class01193.field_44631) {
                class047822.method_8652(class072092, (class00500)class005002.y(u, (Comparable)class01193.field_28121), 3);
                if (!((Boolean)class005002.L((class08092)R)).booleanValue()) {
                    class047822.method_8396(null, class072092, class04909.wL, class04911.field_15245, 1.0f, class047822.field_9229.z() * 0.2f + 0.8f);
                }
            }
            return;
        }
        class06361.N((class07299)class047822, class072092, class005002);
    }

    public @Nullable class00500 N(class06942 class069422) {
        class07209 class072092 = class069422.method_8037();
        class04688 class046882 = class069422.method_8045().method_8316(class072092);
        return (class00500)this.W().y((class08092)R, (Comparable)Boolean.valueOf(class046882.N() == class04684.L));
    }

    public MapCodec<? extends class06361> N() {
        return N;
    }

    public int N_8(class00500 class005002, class07290 class072902, class07209 class072092, class07211 class072112) {
        return (Integer)class005002.L((class08092)i);
    }

    public static void N(class07299 class072992, class07209 class072092, class00500 class005002) {
        class072992.method_8652(class072092, (class00500)((class00500)class005002.y(u, (Comparable)class01193.field_44631)).y((class08092)i, (Comparable)Integer.valueOf(0)), 3);
        class072992.N(class072092, class005002.i(), 10);
        class06361.y(class072992, class072092, class005002);
    }

    public <T extends class00394> @Nullable class01118<T> N(class07299 class072993, class00500 class005003, class00404<T> class004042) {
        if (!class072993.method_8608()) {
            return class06361.N(class004042, (class00404)class00404.field_28117, (class072992, class072092, class005002, class063712) -> {
                class03493.N((class07299)class072992, (class03508)class063712.L(), (class03481)class063712.u());
                class06361.N(class072992, class072092, class005002, class063712, null);
            });
        }
        return null;
    }

    protected class00494 N(class00500 class005002, class07290 class072902, class07209 class072092, class06092 class060922) {
        return M;
    }

    protected boolean a_(class00500 class005002) {
        return true;
    }

    protected boolean i_(class00500 class005002) {
        return true;
    }
}

