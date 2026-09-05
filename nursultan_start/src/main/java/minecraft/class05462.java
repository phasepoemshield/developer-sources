/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 *  java.lang.MatchException
 *  minecraft.class00717
 *  minecraft.class01235
 *  minecraft.class02484
 *  minecraft.class02566
 *  minecraft.class02822
 *  minecraft.class02830
 *  minecraft.class04803
 *  minecraft.class04828
 *  minecraft.class04830
 *  minecraft.class04909
 *  minecraft.class04911
 *  minecraft.class04995
 *  minecraft.class05970
 *  minecraft.class06509
 *  minecraft.class06563
 *  minecraft.class06570
 *  minecraft.class06573
 *  minecraft.class06581
 *  minecraft.class06584
 *  minecraft.class06695
 *  minecraft.class06937
 *  minecraft.class07041
 *  minecraft.class07049
 *  minecraft.class07050
 *  minecraft.class07082
 *  minecraft.class07299
 *  minecraft.class07438
 *  minecraft.class07482
 *  minecraft.class08036
 *  minecraft.class08562
 *  org.apache.commons.lang3.math.Fraction
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package minecraft;

import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;
import minecraft.class00717;
import minecraft.class01235;
import minecraft.class02484;
import minecraft.class02566;
import minecraft.class02822;
import minecraft.class02830;
import minecraft.class04803;
import minecraft.class04828;
import minecraft.class04830;
import minecraft.class04909;
import minecraft.class04911;
import minecraft.class04995;
import minecraft.class05442;
import minecraft.class05970;
import minecraft.class06509;
import minecraft.class06563;
import minecraft.class06570;
import minecraft.class06573;
import minecraft.class06581;
import minecraft.class06584;
import minecraft.class06695;
import minecraft.class06937;
import minecraft.class07041;
import minecraft.class07049;
import minecraft.class07050;
import minecraft.class07082;
import minecraft.class07299;
import minecraft.class07438;
import minecraft.class07482;
import minecraft.class08036;
import minecraft.class08562;
import org.apache.commons.lang3.math.Fraction;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class05462
extends class06581 {
    public static final int N = 4;
    public static final int y = 3;
    public static final int L = 12;
    public static final int m = 11;
    private static final int P = class02566.N((float)1.0f, (float)1.0f, (float)0.33f, (float)0.33f);
    private static final int s = class02566.N((float)1.0f, (float)0.44f, (float)0.53f, (float)1.0f);
    private static final int T = 10;
    private static final int b = 2;
    private static final int j = 200;

    private static void L(class07049 class070492) {
        class070492.method_5783(class04909.uO, 1.0f, 1.0f);
    }

    public class05462(class06573 class065732) {
        super(class065732);
    }

    public boolean B(class06584 class065842) {
        return ((class02830)class065842.a_(class02484.D, (Object)class02830.N)).R().compareTo(Fraction.ZERO) > 0;
    }

    public int Z(class06584 class065842) {
        class02830 class028302 = (class02830)class065842.a_(class02484.D, (Object)class02830.N);
        return Math.min(1 + class04995.N((Fraction)class028302.R(), (int)12), 13);
    }

    public static boolean i(class06584 class065842) {
        class02830 class028302 = (class02830)class065842.method_58694(class02484.D);
        return class028302 != null && class028302.B() != -1;
    }

    public Optional<class04830> U(class06584 class065842) {
        if (!((class08562)class065842.a_(class02484.v, (Object)class08562.L)).N(class02484.D)) {
            return Optional.empty();
        }
        return Optional.ofNullable((class02830)class065842.method_58694(class02484.D)).map(class04828::new);
    }

    public int z(class06584 class065842) {
        return ((class02830)class065842.a_(class02484.D, (Object)class02830.N)).R().compareTo(Fraction.ONE) >= 0 ? P : s;
    }

    public static float u(class06584 class065842) {
        return ((class02830)class065842.a_(class02484.D, (Object)class02830.N)).R().floatValue();
    }

    private static void y(class07049 class070492) {
        class070492.method_5783(class04909.uQ, 0.8f, 0.8f + class070492.method_73183().method_8409().z() * 0.4f);
    }

    public class06509 y(class06584 class065842) {
        return class06509.field_55494;
    }

    private boolean y(class06584 class065842, class08036 class080362) {
        class02830 class028302 = (class02830)class065842.method_58694(class02484.D);
        if (class028302 == null || class028302.M()) {
            return false;
        }
        Optional<class06584> var4 = class05462.N(class065842, class080362, class028302);
        if (var4.isPresent()) {
            class080362.method_7328(var4.get(), true);
            return true;
        }
        return false;
    }

    public static class06584 E(class06584 class065842) {
        class02830 class028302 = (class02830)class065842.method_58694(class02484.D);
        if (class028302 != null && class028302.B() != -1) {
            return class028302.N(class028302.B());
        }
        return class06584.E;
    }

    public void N(class00717 class007172) {
        class02830 class028302 = (class02830)class007172.N().method_58694(class02484.D);
        if (class028302 == null) {
            return;
        }
        class007172.N().N(class02484.D, (Object)class02830.N);
        class05970.N((class00717)class007172, (Iterable)class028302.u());
    }

    public static List<class05462> N() {
        return Stream.of(class06570.jq, class06570.jK, class06570.jV, class06570.je, class06570.jH, class06570.jc, class06570.jX, class06570.ja, class06570.jp, class06570.jF, class06570.jA, class06570.jh, class06570.jS, class06570.jx, class06570.jD, class06570.jC, class06570.jf).map(class065812 -> (class05462)((Object)class065812)).toList();
    }

    public static class06581 N(class06563 class065632) {
        return switch (class065632) {
            default -> throw new MatchException(null, null);
            case class06563.field_7952 -> class06570.jK;
            case class06563.field_7946 -> class06570.jV;
            case class06563.field_7958 -> class06570.je;
            case class06563.field_7951 -> class06570.jH;
            case class06563.field_7947 -> class06570.jc;
            case class06563.field_7961 -> class06570.jX;
            case class06563.field_7954 -> class06570.ja;
            case class06563.field_7944 -> class06570.jp;
            case class06563.field_7967 -> class06570.jF;
            case class06563.field_7955 -> class06570.jA;
            case class06563.field_7966 -> class06570.jC;
            case class06563.field_7957 -> class06570.jS;
            case class06563.field_7942 -> class06570.jx;
            case class06563.field_7964 -> class06570.jD;
            case class06563.field_7963 -> class06570.jh;
            case class06563.field_7945 -> class06570.jf;
        };
    }

    private static void N(class07299 class072992, class07049 class070492) {
        class072992.method_8396(null, class070492.method_24515(), class04909.uY, class04911.field_15248, 0.8f, 0.8f + class070492.method_73183().method_8409().z() * 0.4f);
    }

    private void N(class07299 class072992, class08036 class080362, class07050 class070502, CallbackInfoReturnable callbackInfoReturnable) {
        if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_21)) {
            class02830 class028302 = (class02830)class080362.method_5998(class070502).method_58694(class02484.D);
            if (class028302 == null || class028302.M()) {
                callbackInfoReturnable.setReturnValue((Object)class07082.u);
            }
        } else if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_21_2)) {
            callbackInfoReturnable.setReturnValue((Object)class07082.L);
        }
    }

    private void N(class08036 class080362) {
        class07482 class074822 = (class07482)class080362.fields_07fa3311b0e9d3e9b883d09222919bf5a_3;
        if (class074822 != null) {
            class074822.y((class06695)class080362.method_31548());
        }
    }

    private static void N(class07049 class070492) {
        class070492.method_5783(class04909.ug, 0.8f, 0.8f + class070492.method_73183().method_8409().z() * 0.4f);
    }

    public static void N(class06584 class065842, int n) {
        class02830 class028302 = (class02830)class065842.method_58694(class02484.D);
        if (class028302 == null) {
            return;
        }
        class02822 class028222 = new class02822(class028302);
        class028222.N(n);
        class065842.N(class02484.D, (Object)class028222.u());
    }

    private void N(class07299 class072992, class08036 class080362, class06584 class065842) {
        if (this.y(class065842, class080362)) {
            class05462.N(class072992, (class07049)class080362);
            class080362.method_7259(class01235.L.y((Object)this));
        }
    }

    public class07082 N(class07299 class072992, class08036 class080362, class07050 class070502) {
        class080362.method_6019(class070502);
        class07041 class070412 = class07082.N;
        class07041 class070413 = class070412;
        class070413 = new CallbackInfoReturnable("", true, (Object)class070413);
        this.N(class072992, class080362, class070502, (CallbackInfoReturnable)class070413);
        if (class070413.isCancelled()) {
            return (class07082)class070413.getReturnValue();
        }
        return class070412;
    }

    public boolean N(class06584 class065842, class06584 class065843, class06937 class069372, class05442 class054422, class08036 class080362, class04803 class048032) {
        if (class054422 == class05442.field_27013 && class065843.R()) {
            class05462.N(class065842, -1);
            return false;
        }
        class02830 class028302 = (class02830)class065842.method_58694(class02484.D);
        if (class028302 == null) {
            return false;
        }
        class02822 class028222 = new class02822(class028302);
        if (class054422 == class05442.field_27013 && !class065843.R()) {
            if (class069372.y(class080362) && class028222.N(class065843) > 0) {
                class05462.y((class07049)class080362);
            } else {
                class05462.L((class07049)class080362);
            }
            class065842.N(class02484.D, (Object)class028222.u());
            this.N(class080362);
            return true;
        }
        if (class054422 == class05442.field_27014 && class065843.R()) {
            class06584 class065844;
            if (class069372.y(class080362) && (class065844 = class028222.y()) != null) {
                class05462.N((class07049)class080362);
                class048032.N(class065844);
            }
            class065842.N(class02484.D, (Object)class028222.u());
            this.N(class080362);
            return true;
        }
        class05462.N(class065842, -1);
        return false;
    }

    public boolean N(class06584 class065842, class06937 class069372, class05442 class054422, class08036 class080362) {
        class02830 class028302 = (class02830)class065842.method_58694(class02484.D);
        if (class028302 == null) {
            return false;
        }
        class06584 class065843 = class069372.i();
        class02822 class028222 = new class02822(class028302);
        if (class054422 == class05442.field_27013 && !class065843.R()) {
            if (class028222.N(class069372, class080362) > 0) {
                class05462.y((class07049)class080362);
            } else {
                class05462.L((class07049)class080362);
            }
            class065842.N(class02484.D, (Object)class028222.u());
            this.N(class080362);
            return true;
        }
        if (class054422 == class05442.field_27014 && class065843.R()) {
            class06584 class065844 = class028222.y();
            if (class065844 != null) {
                class06584 class065845 = class069372.R(class065844);
                if (class065845.c() > 0) {
                    class028222.N(class065845);
                } else {
                    class05462.N((class07049)class080362);
                }
            }
            class065842.N(class02484.D, (Object)class028222.u());
            this.N(class080362);
            return true;
        }
        return false;
    }

    public void N(class07299 class072992, class07438 class074382, class06584 class065842, int n) {
        if (class074382 instanceof class08036) {
            class08036 class080362 = (class08036)class074382;
            int n2 = this.N(class065842, class074382);
            if (n == n2 || n < n2 - 10 && n % 2 == 0) {
                this.N(class072992, class080362, class065842);
            }
        }
    }

    public int N(class06584 class065842, class07438 class074382) {
        return 200;
    }

    private static Optional<class06584> N(class06584 class065842, class08036 class080362, class02830 class028302) {
        class02822 class028222 = new class02822(class028302);
        class06584 class065843 = class028222.y();
        if (class065843 != null) {
            class05462.N((class07049)class080362);
            class065842.N(class02484.D, (Object)class028222.u());
            return Optional.of(class065843);
        }
        return Optional.empty();
    }

    public static int W(class06584 class065842) {
        return ((class02830)class065842.a_(class02484.D, (Object)class02830.N)).N();
    }

    public static int R(class06584 class065842) {
        return ((class02830)class065842.a_(class02484.D, (Object)class02830.N)).B();
    }
}

