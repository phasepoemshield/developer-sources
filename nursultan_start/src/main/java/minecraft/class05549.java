/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class02477
 *  minecraft.class02484
 *  minecraft.class02666
 *  minecraft.class02837
 *  minecraft.class04770
 *  minecraft.class04891
 *  minecraft.class05970
 *  minecraft.class06570
 *  minecraft.class06584
 *  minecraft.class06912
 *  minecraft.class07001
 *  minecraft.class07050
 *  minecraft.class07079
 *  minecraft.class07082
 *  minecraft.class07438
 *  minecraft.class08036
 */
package minecraft;

import java.util.Optional;
import minecraft.class02477;
import minecraft.class02484;
import minecraft.class02666;
import minecraft.class02837;
import minecraft.class04770;
import minecraft.class04891;
import minecraft.class05970;
import minecraft.class06570;
import minecraft.class06584;
import minecraft.class06912;
import minecraft.class07001;
import minecraft.class07050;
import minecraft.class07079;
import minecraft.class07082;
import minecraft.class07438;
import minecraft.class08036;

public interface class05549 {
    public boolean B();

    public class04891 E();

    @Deprecated
    public static void N(class07079 class070792, class06584 class065842) {
        class065842.N(class02484.B, (class02666)class070792);
        class02837.N((class02477)class02484.NM, (class06584)class065842, class070012 -> {
            if (class070792.Nt()) {
                class070012.N("NoAI", class070792.Nt());
            }
            if (class070792.method_5701()) {
                class070012.N("Silent", class070792.method_5701());
            }
            if (class070792.method_5740()) {
                class070012.N("NoGravity", class070792.method_5740());
            }
            if (class070792.method_36361()) {
                class070012.N("Glowing", class070792.method_36361());
            }
            if (class070792.method_5655()) {
                class070012.N("Invulnerable", class070792.method_5655());
            }
            class070012.N("Health", class070792.method_6032());
        });
    }

    @Deprecated
    public static void N(class07079 class070792, class07001 class070012) {
        class070012.T("NoAI").ifPresent(arg_0 -> ((class07079)class070792).u(arg_0));
        class070012.T("Silent").ifPresent(arg_0 -> ((class07079)class070792).method_5803(arg_0));
        class070012.T("NoGravity").ifPresent(arg_0 -> ((class07079)class070792).method_5875(arg_0));
        class070012.T("Glowing").ifPresent(arg_0 -> ((class07079)class070792).method_5834(arg_0));
        class070012.T("Invulnerable").ifPresent(arg_0 -> ((class07079)class070792).method_5684(arg_0));
        class070012.M("Health").ifPresent(arg_0 -> ((class07079)class070792).method_6033(arg_0));
    }

    public static <T extends class07438> Optional<class07082> N(class08036 class080362, class07050 class070502, T t) {
        class06584 class065842 = class080362.method_5998(class070502);
        if (class065842.B() == class06570.jE && t.method_5805()) {
            t.method_5783(((class05549)t).E(), 1.0f, 1.0f);
            class06584 class065843 = ((class05549)t).Y();
            ((class05549)t).e_(class065843);
            class06584 class065844 = class05970.N((class06584)class065842, (class08036)class080362, (class06584)class065843, (boolean)false);
            class080362.method_6122(class070502, class065844);
            if (!t.method_73183().method_8608()) {
                class06912.U.N((class04770)class080362, class065843);
            }
            t.method_31472();
            return Optional.of(class07082.N);
        }
        return Optional.empty();
    }

    public void N(class07001 var1);

    public void N(boolean var1);

    public class06584 Y();

    public void e_(class06584 var1);
}

