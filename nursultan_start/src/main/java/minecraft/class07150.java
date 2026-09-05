/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00772
 *  minecraft.class01001
 *  minecraft.class04782
 *  minecraft.class04891
 *  minecraft.class04909
 *  minecraft.class04911
 *  minecraft.class05298
 *  minecraft.class05300
 *  minecraft.class05487
 *  minecraft.class06069
 *  minecraft.class06113
 *  minecraft.class06570
 *  minecraft.class06577
 *  minecraft.class06584
 *  minecraft.class07072
 *  minecraft.class07078
 *  minecraft.class07079
 *  minecraft.class07086
 *  minecraft.class07284
 *  minecraft.class07299
 *  minecraft.class07305
 *  minecraft.class07310
 *  minecraft.class07376
 *  minecraft.class07438
 *  minecraft.class07443
 *  minecraft.class07475
 *  minecraft.class07542
 *  minecraft.class08036
 */
package minecraft;

import java.util.function.Predicate;
import minecraft.class00772;
import minecraft.class01001;
import minecraft.class04782;
import minecraft.class04891;
import minecraft.class04909;
import minecraft.class04911;
import minecraft.class05298;
import minecraft.class05300;
import minecraft.class05487;
import minecraft.class06069;
import minecraft.class06113;
import minecraft.class06570;
import minecraft.class06577;
import minecraft.class06584;
import minecraft.class07072;
import minecraft.class07078;
import minecraft.class07079;
import minecraft.class07086;
import minecraft.class07209;
import minecraft.class07284;
import minecraft.class07299;
import minecraft.class07305;
import minecraft.class07310;
import minecraft.class07376;
import minecraft.class07438;
import minecraft.class07443;
import minecraft.class07475;
import minecraft.class07542;
import minecraft.class08036;

public abstract class class07150
extends class07475
implements class07542 {
    protected void w() {
        if (this.method_5718() > 0.5f) {
            ((class07438)this).fields_6212a028292fd3c078969e3ee4c71d9e8_2 = ((class07438)this).fields_6212a028292fd3c078969e3ee4c71d9e8_2 + 2;
        }
    }

    public static boolean L(class07078<? extends class07079> class070782, class01001 class010012, class06113 class061132, class07209 class072092, class06069 class060692) {
        return class07150.y(class070782, class010012, class061132, class072092, class060692) && (class06113.N((class06113)class061132) || class010012.N_17(class072092));
    }

    public static boolean L(class07078<? extends class07150> class070782, class07284 class072842, class06113 class061132, class07209 class072092, class06069 class060692) {
        return class072842.y() != class07086.field_5801 && class07150.y(class070782, (class07284)class072842, (class06113)class061132, (class07209)class072092, (class06069)class060692);
    }

    public class04911 method_5634() {
        return class04911.field_15251;
    }

    protected class04891 method_5737() {
        return class04909.PD;
    }

    protected class04891 method_5625() {
        return class04909.Px;
    }

    public class07150(class07078<? extends class07150> class070782, class07299 class072992) {
        super(class070782, class072992);
        this.J = 5;
    }

    public static boolean y(class07078<? extends class07079> class070782, class01001 class010012, class06113 class061132, class07209 class072092, class06069 class060692) {
        return class010012.y() != class07086.field_5801 && (class06113.y((class06113)class061132) || class07150.N(class010012, class072092, class060692)) && class07150.y(class070782, (class07284)class010012, (class06113)class061132, (class07209)class072092, (class06069)class060692);
    }

    public boolean N(class04782 class047822, class08036 class080362) {
        return true;
    }

    public static boolean N(class01001 class010012, class07209 class072092, class06069 class060692) {
        if (class010012.method_8314(class00772.field_9284, class072092) > class060692.y(32)) {
            return false;
        }
        class07376 class073762 = class010012.method_8597();
        int n = class073762.y();
        if (n < 15 && class010012.method_8314(class00772.field_9282, class072092) > n) {
            return false;
        }
        return (class010012.method_8410().method_8546() ? class010012.N(class072092, 10) : class010012.U(class072092)) <= class073762.N().N(class060692);
    }

    public float N(class07209 class072092, class05487 class054872) {
        return -class054872.B(class072092);
    }

    public static class05300 Y() {
        return class07079.H().N(class05298.u);
    }

    public class06584 method_18808(class06584 class065842) {
        if (class065842.B() instanceof class06577) {
            Predicate var2 = ((class06577)class065842.B()).L();
            class06584 class065843 = class06577.N((class07438)this, (Predicate)var2);
            return class065843.R() ? new class06584((class07310)class06570.sD) : class065843;
        }
        return class06584.E;
    }

    public class04891 method_6002() {
        return class04909.Pf;
    }

    public boolean method_27071(class04782 class047822) {
        return (Boolean)class047822.method_64395().N(class07305.O);
    }

    public void method_6007() {
        this.method_6119();
        this.w();
        super.method_6007();
    }

    public boolean method_6054() {
        return true;
    }

    public class07443 method_39760() {
        return new class07443(class04909.PS, class04909.PA);
    }

    public class04891 method_6011(class07072 class070722) {
        return class04909.PC;
    }
}

