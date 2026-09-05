/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class00891
 *  minecraft.class01210
 *  minecraft.class01226
 *  minecraft.class01235
 *  minecraft.class01590
 *  minecraft.class03448
 *  minecraft.class03556
 *  minecraft.class04206
 *  minecraft.class04453
 *  minecraft.class04680
 *  minecraft.class06090
 *  minecraft.class06128
 *  minecraft.class06183
 *  minecraft.class06202
 *  minecraft.class06584
 *  minecraft.class07089
 *  minecraft.class07113
 *  minecraft.class08966
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.util.Iterator;
import minecraft.class00392;
import minecraft.class00891;
import minecraft.class01210;
import minecraft.class01226;
import minecraft.class01235;
import minecraft.class01590;
import minecraft.class03448;
import minecraft.class03556;
import minecraft.class04206;
import minecraft.class04453;
import minecraft.class04680;
import minecraft.class06090;
import minecraft.class06128;
import minecraft.class06183;
import minecraft.class06202;
import minecraft.class06584;
import minecraft.class07089;
import minecraft.class07113;
import minecraft.class08762;
import minecraft.class08764;
import minecraft.class08966;
import org.jspecify.annotations.Nullable;

public class class08757
implements class08762 {
    private static final int N = 6000;
    private static final class00392 y = class00392.L((String)"tutorial.find_tree.title");
    private static final class00392 L = class00392.L((String)"tutorial.find_tree.description");
    private final class08764 u;
    private @Nullable class06128 i;
    private int R;

    public class08757(class08764 class087642) {
        this.u = class087642;
    }

    private static boolean y(class04453 class044532) {
        return class044532.method_31548().N_60(class065842 -> class065842.N(class01226.NM));
    }

    @Override
    public void y() {
        if (this.i != null) {
            this.i.B();
            this.i = null;
        }
    }

    @Override
    public void N(class06584 class065842) {
        if (class065842.N(class01226.NM)) {
            this.u.N(class08966.field_5655);
        }
    }

    public static boolean N(class04453 class044532) {
        Iterator var1 = class04206.i.u(class01210.NM).iterator();
        while (var1.hasNext()) {
            class00891 class008912 = (class00891)((class03556)var1.next()).N();
            if (class044532.O().N(class01235.N.y((Object)class008912)) <= 0) continue;
            return true;
        }
        return false;
    }

    @Override
    public void N(class03448 class034482, class07089 class070892) {
        if (class070892.N() == class07113.field_1332 && class034482.method_8320(((class06183)class070892).u()).N(class01210.NM)) {
            this.u.N(class08966.field_5649);
        }
    }

    @Override
    public void N() {
        class04453 class044532;
        ++this.R;
        if (!this.u.R()) {
            this.u.N(class08966.field_5653);
            return;
        }
        class06202 class062022 = this.u.i();
        if (this.R == 1 && (class044532 = (class04453)class062022.T_4) != null && (class08757.y(class044532) || class08757.N(class044532))) {
            this.u.N(class08966.field_5655);
            return;
        }
        if (this.R >= 6000 && this.i == null) {
            this.i = new class06128((class01590)class062022.i_3, class06090.field_2235, y, L, false);
            class062022.m().N((class04680)this.i);
        }
    }
}

