/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00389
 *  minecraft.class00494
 *  minecraft.class00500
 *  minecraft.class00869
 *  minecraft.class01210
 *  minecraft.class01339
 *  minecraft.class04782
 *  minecraft.class06092
 *  minecraft.class06093
 *  minecraft.class07078
 *  minecraft.class07209
 *  minecraft.class07290
 *  minecraft.class07305
 */
package minecraft;

import minecraft.class00389;
import minecraft.class00494;
import minecraft.class00500;
import minecraft.class00869;
import minecraft.class01210;
import minecraft.class01339;
import minecraft.class04782;
import minecraft.class05879;
import minecraft.class06092;
import minecraft.class06093;
import minecraft.class07078;
import minecraft.class07209;
import minecraft.class07290;
import minecraft.class07305;

public final class class05849
extends Enum<class05849>
implements class05879 {
    public static final /* enum */ class05849 field_17558 = new class05849(class01339::y);
    public static final /* enum */ class05849 field_17559 = new class05849(class01339::N);
    public static final /* enum */ class05849 field_23142 = new class05849(class01339::L);
    public static final /* enum */ class05849 field_36337 = new class05849((class005002, class072902, class072092, class060922) -> {
        class06093 class060932;
        if (class005002.N(class01210.yi)) {
            return class00389.y();
        }
        if (class060922 instanceof class06093 && (class060932 = (class06093)class060922).R() != null && class060932.R().method_5864() == class07078.Ly) {
            if (class005002.N(class00869.EY) || class005002.N(class00869.MW)) {
                return class00389.y();
            }
            if (class072902 instanceof class04782) {
                class04782 class047822 = (class04782)class072902;
                if (class005002.N(class00869.iq) && (Integer)class047822.method_64395().N(class07305.K) == 0) {
                    return class00389.y();
                }
            }
        }
        return class00389.N();
    });
    private final class05879 field_17560;
    private static final /* synthetic */ class05849[] field_17561;

    private class05849(class05879 class058792) {
        this.field_17560 = class058792;
    }

    static {
        field_17561 = class05849.N();
    }

    @Override
    public class00494 get(class00500 class005002, class07290 class072902, class07209 class072092, class06092 class060922) {
        return this.field_17560.get(class005002, class072902, class072092, class060922);
    }

    public static class05849[] values() {
        return (class05849[])field_17561.clone();
    }

    public static class05849 valueOf(String string) {
        return Enum.valueOf(class05849.class, string);
    }

    private static /* synthetic */ class05849[] N() {
        return new class05849[]{field_17558, field_17559, field_23142, field_36337};
    }
}

