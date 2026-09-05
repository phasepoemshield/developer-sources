/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.MatchException
 *  minecraft.class00457
 *  minecraft.class00734
 *  minecraft.class01296
 *  minecraft.class01383
 *  minecraft.class02566
 *  minecraft.class03448
 *  minecraft.class06202
 *  minecraft.class06724
 *  minecraft.class06747
 *  minecraft.class07209
 *  minecraft.class07321
 *  minecraft.class07830
 *  minecraft.class08050
 *  org.joml.Vector3f
 */
package minecraft;

import java.util.Iterator;
import java.util.Map;
import minecraft.class00457;
import minecraft.class00734;
import minecraft.class01296;
import minecraft.class01383;
import minecraft.class01857;
import minecraft.class02566;
import minecraft.class03448;
import minecraft.class06202;
import minecraft.class06724;
import minecraft.class06747;
import minecraft.class07209;
import minecraft.class07321;
import minecraft.class07830;
import minecraft.class08050;
import org.joml.Vector3f;

public class class01873
implements class01857 {
    private final class06202 N;
    private static final int y = 2;
    private static final float L = 0.09375f;

    public class01873(class06202 class062022) {
        this.N = class062022;
    }

    @Override
    public void N(double d, double d2, double d3, class00457 class004572, class01383 class013832, float f) {
        class03448 class034482 = (class03448)this.N.T_3;
        class07209 class072092 = class07209.method_49637((double)d, (double)0.0, (double)d3);
        for (int i = -2; i <= 2; ++i) {
            for (int j = -2; j <= 2; ++j) {
                class08050 class080502 = class034482.method_8500(class072092.method_10069(i * 16, 0, j * 16));
                Iterator var15 = class080502.i().iterator();
                while (var15.hasNext()) {
                    class07830 class078302 = (class07830)((Map.Entry)var15.next()).getKey();
                    class07321 class073212 = class080502.R();
                    Vector3f vector3f = this.N(class078302);
                    for (int k = 0; k < 16; ++k) {
                        for (int i2 = 0; i2 < 16; ++i2) {
                            int n = class01296.N((int)class073212.B, (int)k);
                            int n2 = class01296.N((int)class073212.Z, (int)i2);
                            float f2 = (float)class034482.method_8624(class078302, n, n2) + (float)class078302.ordinal() * 0.09375f;
                            class06724.N((class00734)new class00734((double)((float)n + 0.25f), (double)f2, (double)((float)n2 + 0.25f), (double)((float)n + 0.75f), (double)(f2 + 0.09375f), (double)((float)n2 + 0.75f)), (class06747)class06747.y((int)class02566.N((float)1.0f, (float)vector3f.x(), (float)vector3f.y(), (float)vector3f.z())));
                        }
                    }
                }
            }
        }
    }

    private Vector3f N(class07830 class078302) {
        return switch (class078302) {
            default -> throw new MatchException(null, null);
            case class07830.field_13194 -> new Vector3f(1.0f, 1.0f, 0.0f);
            case class07830.field_13195 -> new Vector3f(1.0f, 0.0f, 1.0f);
            case class07830.field_13202 -> new Vector3f(0.0f, 0.7f, 0.0f);
            case class07830.field_13200 -> new Vector3f(0.0f, 0.0f, 0.5f);
            case class07830.field_13197 -> new Vector3f(0.0f, 0.3f, 0.3f);
            case class07830.field_13203 -> new Vector3f(0.0f, 0.5f, 0.5f);
        };
    }
}

