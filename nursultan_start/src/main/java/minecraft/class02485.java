/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00381
 *  minecraft.class00681
 *  minecraft.class02197
 *  minecraft.class02833
 *  minecraft.class02834
 *  minecraft.class04770
 *  minecraft.class04782
 *  minecraft.class04891
 *  minecraft.class04909
 *  minecraft.class05298
 *  minecraft.class06573
 *  minecraft.class06581
 *  minecraft.class06584
 *  minecraft.class06652
 *  minecraft.class06889
 *  minecraft.class07049
 *  minecraft.class07072
 *  minecraft.class07185
 *  minecraft.class07299
 *  minecraft.class07323
 *  minecraft.class07438
 *  minecraft.class07453
 *  minecraft.class07463
 *  minecraft.class07471
 *  minecraft.class08036
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.util.List;
import java.util.function.Predicate;
import minecraft.class00381;
import minecraft.class00681;
import minecraft.class02197;
import minecraft.class02833;
import minecraft.class02834;
import minecraft.class04770;
import minecraft.class04782;
import minecraft.class04891;
import minecraft.class04909;
import minecraft.class05298;
import minecraft.class06573;
import minecraft.class06581;
import minecraft.class06584;
import minecraft.class06652;
import minecraft.class06889;
import minecraft.class07049;
import minecraft.class07072;
import minecraft.class07185;
import minecraft.class07299;
import minecraft.class07323;
import minecraft.class07438;
import minecraft.class07453;
import minecraft.class07463;
import minecraft.class07471;
import minecraft.class08036;
import org.jspecify.annotations.Nullable;

public class class02485
extends class06581 {
    private static final int L = 5;
    private static final float m = -3.4f;
    public static final float N = 1.5f;
    private static final float P = 5.0f;
    public static final float y = 3.5f;
    private static final float s = 0.7f;

    public class02485(class06573 class065732) {
        super(class065732);
    }

    public void y(class06584 class065842, class07438 class074382, class07438 class074383) {
        if (class02485.y(class074383)) {
            class074383.method_38785();
        }
    }

    public static boolean y(class07438 class074382) {
        return class074382.field_6017 > 1.5 && !class074382.method_6128();
    }

    public static class02197 y() {
        return new class02197(List.of(), 1.0f, 2, false);
    }

    private static void N(class07299 class072992, class07049 class070492, class07049 class070493) {
        class072992.N(2013, class070493.method_23312(), 750);
        class072992.N(class07438.class, class070493.method_5829().M(3.5), class02485.N(class070492, class070493)).forEach(class074382 -> {
            class06889 class068892 = class074382.method_73189().u(class070493.method_73189());
            double d = class02485.N(class070492, class074382, class068892);
            class06889 class068893 = class068892.u().L(d);
            if (d > 0.0) {
                class074382.method_5762(class068893.M, (double)0.7f, class068893.Z);
                if (class074382 instanceof class04770) {
                    class04770 class047702 = (class04770)class074382;
                    class047702.field_13987.method_14364((class00381)new class06652((class07049)class047702));
                }
            }
        });
    }

    public static class02833 N() {
        return class02833.N().N(class05298.u, new class07471(M, 5.0, class07463.field_6328), class02834.field_49217).N(class05298.R, new class07471(B, (double)-3.4f, class07463.field_6328), class02834.field_49217).N();
    }

    private static double N(class07049 class070492, class07438 class074382, class06889 class068892) {
        return (3.5 - class068892.M()) * (double)0.7f * (double)(class070492.field_6017 > 5.0 ? 2 : 1) * (1.0 - class074382.method_45325(class05298.b));
    }

    public @Nullable class07072 N(class07438 class074382) {
        if (class02485.y(class074382)) {
            return class074382.method_48923().R((class07049)class074382);
        }
        return super.N(class074382);
    }

    /*
     * Unable to fully structure code
     */
    private static /* synthetic */ boolean N(class07049 var0, class07049 var1_1, class07438 var2_2) {
        var3_3 = var2_2.method_7325() == false;
        var4_4 = var2_2 != var0 && var2_2 != var1_1;
        v0 = var5_5 = var0.method_5722((class07049)var2_2) == false;
        if (!(var2_2 instanceof class07453)) ** GOTO lbl-1000
        var8_6 = (class07453)var2_2;
        if (!(var1_1 instanceof class07438)) ** GOTO lbl-1000
        var7_8 = (class07438)var1_1;
        if (var8_6.NQ() && var8_6.L(var7_8)) {
            v1 = true;
        } else lbl-1000:
        // 3 sources

        {
            v1 = false;
        }
        var6_10 = v1 == false;
        var7_9 = var2_2 instanceof class00681 == false || (var8_6 = (class00681)var2_2).i() == false;
        var8_7 = var1_1.method_5858((class07049)var2_2) <= Math.pow(3.5, 2.0);
        var9_12 = (var2_2 instanceof class08036 != false && (var10_11 = (class08036)var2_2).method_68878() != false && var10_11.method_31549().y != false) == false;
        return var3_3 != false && var4_4 != false && var5_5 != false && var6_10 != false && var7_9 != false && var8_7 != false && var9_12 != false;
    }

    private class06889 N(class04770 class047702) {
        if (class047702.method_61165() && class047702.fields_57fa3311b0e9d3e9b883d09222919bf5a_4 != null && class047702.fields_57fa3311b0e9d3e9b883d09222919bf5a_4.B <= class047702.method_73189().B) {
            return class047702.fields_57fa3311b0e9d3e9b883d09222919bf5a_4;
        }
        return class047702.method_73189();
    }

    public void N(class06584 class065842, class07438 class074382, class07438 class074383) {
        if (class02485.y(class074383)) {
            class04770 class047702;
            class04782 class047822 = (class04782)class074383.method_73183();
            class074383.method_18799(class074383.method_18798().N(class07185.field_11052, (double)0.01f));
            if (class074383 instanceof class04770) {
                class047702 = (class04770)class074383;
                class047702.fields_57fa3311b0e9d3e9b883d09222919bf5a_4 = this.N(class047702);
                class047702.method_60984(true);
                class047702.field_13987.method_14364((class00381)new class06652((class07049)class047702));
            }
            if (class074382.method_24828()) {
                if (class074383 instanceof class04770) {
                    class047702 = (class04770)class074383;
                    class047702.method_58143(true);
                }
                class047702 = class074383.field_6017 > 5.0 ? class04909.Tg : class04909.TO;
                class047822.method_43128(null, class074383.method_23317(), class074383.method_23318(), class074383.method_23321(), (class04891)class047702, class074383.method_5634(), 1.0f, 1.0f);
            } else {
                class047822.method_43128(null, class074383.method_23317(), class074383.method_23318(), class074383.method_23321(), class04909.TQ, class074383.method_5634(), 1.0f, 1.0f);
            }
            class02485.N((class07299)class047822, (class07049)class074383, (class07049)class074382);
        }
    }

    public float N(class07049 class070492, float f, class07072 class070722) {
        class07049 class070493 = class070722.L();
        if (!(class070493 instanceof class07438)) {
            return 0.0f;
        }
        class07438 class074382 = (class07438)class070493;
        if (!class02485.y(class074382)) {
            return 0.0f;
        }
        double d = 3.0;
        double d2 = 8.0;
        double d3 = class074382.field_6017;
        double d4 = d3 <= 3.0 ? 4.0 * d3 : (d3 <= 8.0 ? 12.0 + 2.0 * (d3 - 3.0) : 22.0 + d3 - 8.0);
        class07299 class072992 = class074382.method_73183();
        if (class072992 instanceof class04782) {
            class04782 class047822 = (class04782)class072992;
            return (float)(d4 + (double)class07323.y((class04782)class047822, (class06584)class074382.method_59958(), (class07049)class070492, (class07072)class070722, (float)0.0f) * d3);
        }
        return (float)d4;
    }

    private static Predicate<class07438> N(class07049 class070492, class07049 class070493) {
        return arg_0 -> class02485.N(class070492, class070493, arg_0);
    }
}

