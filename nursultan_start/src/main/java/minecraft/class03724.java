/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class01631
 *  minecraft.class01885
 *  minecraft.class02102
 *  minecraft.class03380
 *  minecraft.class03409
 *  minecraft.class03418
 *  minecraft.class03744
 *  minecraft.class03750
 *  minecraft.class03752
 *  minecraft.class03756
 *  minecraft.class03943
 *  minecraft.class05096
 *  minecraft.class05362
 *  minecraft.class06613
 */
package minecraft;

import java.util.Objects;
import java.util.UUID;
import java.util.function.Supplier;
import minecraft.class00392;
import minecraft.class01631;
import minecraft.class01885;
import minecraft.class02102;
import minecraft.class03380;
import minecraft.class03409;
import minecraft.class03418;
import minecraft.class03709;
import minecraft.class03725;
import minecraft.class03744;
import minecraft.class03750;
import minecraft.class03752;
import minecraft.class03756;
import minecraft.class03943;
import minecraft.class05096;
import minecraft.class05362;
import minecraft.class06613;

public class class03724
extends class03709<class03750> {
    private static final int m = 85;
    private static final int P = 178;
    private static final class00392 s = class00392.L((String)"gui.abuseReport.skin.title");
    private class03943 T;
    private class05362 b;

    public class03724(class05096 class050962, class03409 class034092, class03744 class037442) {
        this(class050962, class034092, new class03750(class037442, class034092.N().y()));
    }

    public class03724(class05096 class050962, class03409 class034092, UUID uUID, Supplier<class01631> supplier) {
        this(class050962, class034092, new class03750(uUID, supplier, class034092.N().y()));
    }

    private class03724(class05096 class050962, class03409 class034092, class03750 class037502) {
        super(s, class050962, class034092, class037502);
    }

    @Override
    protected void y() {
        class03380 class033802 = ((class03750)this.E).Z();
        if (class033802 != null) {
            this.b.method_25355(class033802.y());
        } else {
            this.b.method_25355(L);
        }
        super.y();
    }

    @Override
    protected void N() {
        class01885 class018852 = (class01885)this.U.N((class02102)class01885.i().N(8));
        class018852.L().i();
        class018852.N((class02102)new class03756(85, 120, this.field_22787.yt(), ((class03744)((class03750)this.E).i()).N()));
        class01885 class018853 = (class01885)class018852.N((class02102)class01885.u().N(8));
        this.b = class05362.method_46430((class00392)L, class053622 -> this.field_22787.N((class05096)new class03418((class05096)this, ((class03750)this.E).Z(), class03752.field_46065, class033802 -> {
            ((class03750)this.E).N(class033802);
            this.y();
        }))).N(178).N();
        class018853.N((class02102)class03725.N(this.field_22793, (class02102)this.b, y));
        Objects.requireNonNull(this.field_22793);
        this.T = this.N(178, 72, string -> {
            ((class03750)this.E).N(string);
            this.y();
        });
        class018853.N((class02102)class03725.N(this.field_22793, (class02102)this.T, u, class020722 -> class020722.i(12)));
    }

    public boolean method_25406(class06613 class066132) {
        if (super.method_25406(class066132)) {
            return true;
        }
        return this.T.method_25406(class066132);
    }
}

