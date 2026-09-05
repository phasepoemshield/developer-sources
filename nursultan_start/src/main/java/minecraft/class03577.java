/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class01321
 *  minecraft.class01885
 *  minecraft.class02102
 *  minecraft.class03686
 *  minecraft.class04606
 *  minecraft.class05096
 *  minecraft.class05220
 *  minecraft.class05361
 *  minecraft.class05362
 */
package minecraft;

import java.net.URI;
import minecraft.class00392;
import minecraft.class01321;
import minecraft.class01885;
import minecraft.class02102;
import minecraft.class03597;
import minecraft.class03686;
import minecraft.class04606;
import minecraft.class05096;
import minecraft.class05220;
import minecraft.class05361;
import minecraft.class05362;

public class class03577
extends class05096 {
    private static final int field_43137 = 8;
    private static final int field_43138 = 210;
    private static final class00392 field_43139 = class00392.L((String)"credits_and_attribution.screen.title");
    private static final class00392 field_43140 = class00392.L((String)"credits_and_attribution.button.credits");
    private static final class00392 field_43141 = class00392.L((String)"credits_and_attribution.button.attribution");
    private static final class00392 field_43142 = class00392.L((String)"credits_and_attribution.button.licenses");
    private final class05096 field_43143;
    private final class03686 field_43144 = new class03686((class05096)this);

    public class03577(class05096 class050962) {
        super(field_43139);
        this.field_43143 = class050962;
    }

    public void method_25426() {
        this.field_43144.N(field_43139, this.field_22793);
        class01885 class018852 = ((class01885)this.field_43144.L((class02102)class01885.u())).N(8);
        class018852.L().y();
        class018852.N((class02102)class05362.method_46430((class00392)field_43140, class053622 -> this.method_49739()).N(210).N());
        class018852.N((class02102)class05362.method_46430((class00392)field_43141, (class05361)class01321.y((class05096)this, (URI)class03597.u)).N(210).N());
        class018852.N((class02102)class05362.method_46430((class00392)field_43142, (class05361)class01321.y((class05096)this, (URI)class03597.i)).N(210).N());
        this.field_43144.y((class02102)class05362.method_46430((class00392)class05220.u, class053622 -> this.method_25419()).N(200).N());
        this.field_43144.N();
        this.field_43144.method_48206(arg_0 -> ((class03577)this).method_37063(arg_0));
    }

    public void method_48640() {
        this.field_43144.N();
    }

    public void method_25419() {
        this.field_22787.N(this.field_43143);
    }

    private void method_49739() {
        this.field_22787.N((class05096)new class04606(false, () -> this.field_22787.N((class05096)this)));
    }
}

