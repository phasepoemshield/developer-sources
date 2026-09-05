/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class04508
 *  minecraft.class04995
 *  minecraft.class05298
 *  minecraft.class05835
 *  minecraft.class05849
 *  minecraft.class05862
 *  minecraft.class06069
 *  minecraft.class06889
 *  minecraft.class07049
 *  minecraft.class07113
 *  minecraft.class07438
 */
package minecraft;

import minecraft.class04508;
import minecraft.class04995;
import minecraft.class05298;
import minecraft.class05835;
import minecraft.class05849;
import minecraft.class05862;
import minecraft.class06069;
import minecraft.class06889;
import minecraft.class07049;
import minecraft.class07113;
import minecraft.class07438;

public class class03847 {
    private static final double N = 50.0;

    private static double N(class04508 class045082) {
        return Math.max(50.0, class045082.method_45325(class05298.P));
    }

    public static boolean N(class04508 class045082, class06889 class068892) {
        class06889 class068893 = new class06889(class045082.method_23317(), class045082.method_23318(), class045082.method_23321());
        if (class068892.R(class068893) > class03847.N(class045082)) {
            return false;
        }
        return class045082.method_73183().N(new class05862(class068893, class068892, class05849.field_17558, class05835.field_1348, (class07049)class045082)).N() == class07113.field_1333;
    }

    public static class06889 N(class07438 class074382, class06069 class060692) {
        int n = 90;
        float f = class074382.fields_4212a028292fd3c078969e3ee4c71d9e8_2.floatValue() + 180.0f + (float)class060692.E() * 90.0f / 2.0f;
        float f2 = class04995.B((float)class060692.z(), (float)4.0f, (float)8.0f);
        class06889 class068892 = class06889.N((float)0.0f, (float)f).L((double)f2);
        return class074382.method_73189().i(class068892);
    }
}

