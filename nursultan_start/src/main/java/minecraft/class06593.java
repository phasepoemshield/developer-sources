/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01235
 *  minecraft.class02477
 *  minecraft.class02484
 *  minecraft.class02523
 *  minecraft.class02820
 *  minecraft.class04770
 *  minecraft.class04782
 *  minecraft.class04891
 *  minecraft.class04909
 *  minecraft.class04911
 *  minecraft.class04995
 *  minecraft.class06069
 *  minecraft.class06889
 *  minecraft.class06912
 *  minecraft.class07049
 *  minecraft.class07050
 *  minecraft.class07082
 *  minecraft.class07299
 *  minecraft.class07323
 *  minecraft.class07438
 *  minecraft.class08005
 *  minecraft.class08006
 *  minecraft.class08007
 *  minecraft.class08036
 *  org.joml.Quaternionf
 *  org.joml.Quaternionfc
 *  org.joml.Vector3f
 *  org.joml.Vector3fc
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import minecraft.class01235;
import minecraft.class02477;
import minecraft.class02484;
import minecraft.class02523;
import minecraft.class02820;
import minecraft.class04770;
import minecraft.class04782;
import minecraft.class04891;
import minecraft.class04909;
import minecraft.class04911;
import minecraft.class04995;
import minecraft.class06069;
import minecraft.class06509;
import minecraft.class06570;
import minecraft.class06573;
import minecraft.class06577;
import minecraft.class06584;
import minecraft.class06589;
import minecraft.class06889;
import minecraft.class06912;
import minecraft.class07049;
import minecraft.class07050;
import minecraft.class07082;
import minecraft.class07299;
import minecraft.class07323;
import minecraft.class07438;
import minecraft.class08005;
import minecraft.class08006;
import minecraft.class08007;
import minecraft.class08036;
import org.joml.Quaternionf;
import org.joml.Quaternionfc;
import org.joml.Vector3f;
import org.joml.Vector3fc;
import org.jspecify.annotations.Nullable;

public class class06593
extends class06577 {
    private static final float P = 1.25f;
    public static final int N = 8;
    private boolean s = false;
    private boolean T = false;
    private static final float b = 0.2f;
    private static final float j = 0.5f;
    private static final float v = 3.15f;
    private static final float n = 1.6f;
    public static final float y = 1.6f;
    private static final class06589 t = new class06589(Optional.of(class04909.BX), Optional.of(class04909.Bc), Optional.of(class04909.BH));

    @Override
    public Predicate<class06584> L() {
        return m;
    }

    @Override
    public boolean M(class06584 class065842) {
        return class065842.N(this);
    }

    public class06593(class06573 class065732) {
        super(class065732);
    }

    @Override
    protected int i(class06584 class065842) {
        return class065842.N(class06570.GJ) ? 3 : 1;
    }

    public static boolean u(class06584 class065842) {
        return !((class02820)class065842.a_(class02484.x, class02820.N)).y();
    }

    @Override
    public class06509 y(class06584 class065842) {
        return class06509.field_8947;
    }

    @Override
    public int y() {
        return 8;
    }

    public static int y(class06584 class065842, class07438 class074382) {
        return class04995.y((float)(class07323.N((class06584)class065842, (class07438)class074382, (float)1.25f) * 20.0f));
    }

    @Override
    public int N(class06584 class065842, class07438 class074382) {
        return 72000;
    }

    private static float N(int n, class06584 class065842, class07438 class074382) {
        float f = (float)n / (float)class06593.y(class065842, class074382);
        if (f > 1.0f) {
            f = 1.0f;
        }
        return f;
    }

    @Override
    public Predicate<class06584> N() {
        return L;
    }

    private static float N(class06069 class060692, int n) {
        if (n == 0) {
            return 1.0f;
        }
        return class06593.N((n & 1) == 1, class060692);
    }

    @Override
    public class07082 N(class07299 class072992, class08036 class080362, class07050 class070502) {
        class06584 class065842 = class080362.method_5998(class070502);
        class02820 class028202 = (class02820)class065842.method_58694(class02484.x);
        if (class028202 != null && !class028202.y()) {
            this.N(class072992, (class07438)class080362, class070502, class065842, class06593.N(class028202), 1.0f, null);
            return class07082.L;
        }
        if (!class080362.method_18808(class065842).R()) {
            this.s = false;
            this.T = false;
            class080362.method_6019(class070502);
            return class07082.L;
        }
        return class07082.u;
    }

    @Override
    protected class08005 N(class07299 class072992, class07438 class074382, class06584 class065842, class06584 class065843, boolean bl) {
        if (class065843.N(class06570.GJ)) {
            return new class08006(class072992, class065843, (class07049)class074382, class074382.method_23317(), class074382.method_23320() - (double)0.15f, class074382.method_23321(), true);
        }
        class08005 class080052 = super.N(class072992, class074382, class065842, class065843, bl);
        if (class080052 instanceof class08007) {
            ((class08007)class080052).N(class04909.Be);
        }
        return class080052;
    }

    private static Vector3f N(class07438 class074382, class06889 class068892, float f) {
        class06889 class068893;
        Vector3f vector3f = class068892.W().normalize();
        Vector3f vector3f2 = new Vector3f((Vector3fc)vector3f).cross((Vector3fc)new Vector3f(0.0f, 1.0f, 0.0f));
        if ((double)vector3f2.lengthSquared() <= 1.0E-7) {
            class068893 = class074382.method_18864(1.0f);
            vector3f2 = new Vector3f((Vector3fc)vector3f).cross((Vector3fc)class068893.W());
        }
        class068893 = new Vector3f((Vector3fc)vector3f).rotateAxis(1.5707964f, vector3f2.x, vector3f2.y, vector3f2.z);
        return new Vector3f((Vector3fc)vector3f).rotateAxis(f * ((float)Math.PI / 180), class068893.x, class068893.y, class068893.z);
    }

    @Override
    protected void N(class07438 class074382, class08005 class080052, int n, float f, float f2, float f3, @Nullable class07438 class074383) {
        Vector3f vector3f;
        if (class074383 != null) {
            double d = class074383.method_23317() - class074382.method_23317();
            double d2 = class074383.method_23321() - class074382.method_23321();
            double d3 = Math.sqrt(d * d + d2 * d2);
            double d4 = class074383.method_23323(0.3333333333333333) - class080052.method_23318() + d3 * (double)0.2f;
            vector3f = class06593.N(class074382, new class06889(d, d4, d2), f3);
        } else {
            class06889 class068892 = class074382.method_18864(1.0f);
            Quaternionf quaternionf = new Quaternionf().setAngleAxis((double)(f3 * ((float)Math.PI / 180)), class068892.M, class068892.B, class068892.Z);
            class06889 class068893 = class074382.method_5828(1.0f);
            vector3f = class068893.W().rotate((Quaternionfc)quaternionf);
        }
        class080052.N((double)vector3f.x(), (double)vector3f.y(), (double)vector3f.z(), f, f2);
        float f4 = class06593.N(class074382.method_59922(), n);
        class074382.method_73183().method_43128(null, class074382.method_23317(), class074382.method_23318(), class074382.method_23321(), class04909.BA, class074382.method_5634(), 1.0f, f4);
    }

    private static boolean N(class07438 class074382, class06584 class065842) {
        List<class06584> var2 = class06593.N(class065842, class074382.method_18808(class065842), class074382);
        if (!var2.isEmpty()) {
            class065842.N(class02484.x, class02820.N(var2));
            return true;
        }
        return false;
    }

    @Override
    public boolean N(class06584 class065842, class07299 class072992, class07438 class074382, int n) {
        return class06593.N(this.N(class065842, class074382) - n, class065842, class074382) >= 1.0f && class06593.u(class065842);
    }

    private static float N(boolean bl, class06069 class060692) {
        float f = bl ? 0.63f : 0.43f;
        return 1.0f / (class060692.z() * 0.5f + 1.8f) + f;
    }

    @Override
    public void N(class07299 class072992, class07438 class074382, class06584 class065842, int n) {
        if (!class072992.method_8608()) {
            class06589 class065892 = this.R(class065842);
            float f = (float)(class065842.N(class074382) - n) / (float)class06593.y(class065842, class074382);
            if (f < 0.2f) {
                this.s = false;
                this.T = false;
            }
            if (f >= 0.2f && !this.s) {
                this.s = true;
                class065892.N().ifPresent(class035562 -> class072992.method_43128(null, class074382.method_23317(), class074382.method_23318(), class074382.method_23321(), (class04891)class035562.N(), class04911.field_15248, 0.5f, 1.0f));
            }
            if (f >= 0.5f && !this.T) {
                this.T = true;
                class065892.y().ifPresent(class035562 -> class072992.method_43128(null, class074382.method_23317(), class074382.method_23318(), class074382.method_23321(), (class04891)class035562.N(), class04911.field_15248, 0.5f, 1.0f));
            }
            if (f >= 1.0f && !class06593.u(class065842) && class06593.N(class074382, class065842)) {
                class065892.L().ifPresent(class035562 -> class072992.method_43128(null, class074382.method_23317(), class074382.method_23318(), class074382.method_23321(), (class04891)class035562.N(), class074382.method_5634(), 1.0f, 1.0f / (class072992.method_8409().z() * 0.5f + 1.0f) + 0.2f));
            }
        }
    }

    private static float N(class02820 class028202) {
        if (class028202.N(class06570.GJ)) {
            return 1.6f;
        }
        return 3.15f;
    }

    public void N(class07299 class072992, class07438 class074382, class07050 class070502, class06584 class065842, float f, float f2, @Nullable class07438 class074383) {
        if (!(class072992 instanceof class04782)) {
            return;
        }
        class04782 class047822 = (class04782)class072992;
        class02820 class028202 = class065842.N(class02484.x, class02820.N);
        if (class028202 == null || class028202.y()) {
            return;
        }
        this.N(class047822, class074382, class070502, class065842, class028202.N(), f, f2, class074382 instanceof class08036, class074383);
        if (class074382 instanceof class04770) {
            class04770 class047702 = (class04770)class074382;
            class06912.J.N(class047702, class065842);
            class047702.method_7259(class01235.L.y((Object)class065842.B()));
        }
    }

    class06589 R(class06584 class065842) {
        return class07323.y((class06584)class065842, (class02477)class02523.Q).orElse(t);
    }
}

