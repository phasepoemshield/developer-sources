/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class01321
 *  minecraft.class01885
 *  minecraft.class02077
 *  minecraft.class02102
 *  minecraft.class03255
 *  minecraft.class03597
 *  minecraft.class04230
 *  minecraft.class04654
 *  minecraft.class05096
 *  minecraft.class05153
 *  minecraft.class05216
 *  minecraft.class05220
 *  minecraft.class05361
 *  minecraft.class05362
 *  minecraft.class05407
 *  minecraft.class06478
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.net.URI;
import minecraft.class00392;
import minecraft.class01321;
import minecraft.class01885;
import minecraft.class02077;
import minecraft.class02102;
import minecraft.class03255;
import minecraft.class03597;
import minecraft.class04230;
import minecraft.class04654;
import minecraft.class05096;
import minecraft.class05153;
import minecraft.class05216;
import minecraft.class05220;
import minecraft.class05361;
import minecraft.class05362;
import minecraft.class05407;
import minecraft.class06478;
import org.jspecify.annotations.Nullable;

public class class04713
extends class05407 {
    private static final class00392 N = class00392.L((String)"mco.account.privacy.information");
    private static final int y = 15;
    private final class01885 L = class01885.u();
    private final class05096 u;
    private @Nullable class04230 i;

    public class04713(class05096 class050962) {
        super(class05153.N);
        this.u = class050962;
    }

    public void method_25426() {
        this.L.N(15).L().y();
        this.i = new class04230(N, this.field_22793).N(true);
        this.L.N((class02102)this.i);
        class01885 class018852 = (class01885)this.L.N((class02102)class01885.i().N(8));
        class05216 class052162 = class00392.L((String)"mco.account.privacy.info.button");
        class018852.N((class02102)class05362.method_46430((class00392)class052162, (class05361)class01321.y((class05096)this, (URI)class03597.N)).N());
        class018852.N((class02102)class05362.method_46430((class00392)class05220.U, class053622 -> this.method_25419()).N());
        this.L.method_48206(class046542 -> {
            class06478 cfr_ignored_0 = (class06478)this.method_37063((class04654)class046542);
        });
        this.method_48640();
    }

    public void method_48640() {
        if (this.i != null) {
            this.i.N(this.field_22789 - 15);
        }
        this.L.N();
        class02077.N((class02102)this.L, (class03255)this.method_48202());
    }

    public void method_25419() {
        this.field_22787.N(this.u);
    }

    public class00392 method_25435() {
        return N;
    }
}

