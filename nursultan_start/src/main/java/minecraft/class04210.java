/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class01321
 *  minecraft.class01590
 *  minecraft.class01885
 *  minecraft.class02071
 *  minecraft.class02102
 *  minecraft.class03597
 *  minecraft.class03686
 *  minecraft.class04230
 *  minecraft.class04240
 *  minecraft.class04654
 *  minecraft.class05096
 *  minecraft.class05220
 *  minecraft.class05362
 *  minecraft.class05630
 *  minecraft.class05725
 *  minecraft.class06202
 *  minecraft.class06478
 *  minecraft.class07536
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.net.URI;
import java.util.Objects;
import minecraft.class00392;
import minecraft.class01321;
import minecraft.class01590;
import minecraft.class01885;
import minecraft.class02071;
import minecraft.class02102;
import minecraft.class03597;
import minecraft.class03686;
import minecraft.class04230;
import minecraft.class04240;
import minecraft.class04654;
import minecraft.class05096;
import minecraft.class05220;
import minecraft.class05362;
import minecraft.class05630;
import minecraft.class05725;
import minecraft.class06202;
import minecraft.class06478;
import minecraft.class07536;
import org.jspecify.annotations.Nullable;

public class class04210
extends class05096 {
    private static final class00392 N = class00392.L((String)"telemetry_info.screen.title");
    private static final class00392 y = class00392.L((String)"telemetry_info.screen.description").y(-4539718);
    private static final class00392 L = class00392.L((String)"telemetry_info.button.privacy_statement");
    private static final class00392 u = class00392.L((String)"telemetry_info.button.give_feedback");
    private static final class00392 i = class00392.L((String)"telemetry_info.button.show_data");
    private static final class00392 R = class00392.L((String)"telemetry_info.opt_in.description").y(-2039584);
    private static final int M = 8;
    private static final boolean B = class06202.Nq().Nk();
    private final class05096 Z;
    private final class05630 z;
    private final class03686 U;
    private @Nullable class04240 E;
    private @Nullable class04230 W;
    private @Nullable class05725 m;
    private double P;

    private void L(class05362 class053622) {
        class07536.m().N(this.field_22787.NI().y());
    }

    public class04210(class05096 class050962, class05630 class056302) {
        super(N);
        Objects.requireNonNull((class01590)class06202.Nq().i_3);
        this.U = new class03686((class05096)this, 16 + 45 + 20, B ? 33 + class05725.N((class01590)((class01590)class06202.Nq().i_3)) : 33);
        this.Z = class050962;
        this.z = class056302;
    }

    private void y(class05362 class053622) {
        class01321.N((class05096)this, (URI)class03597.Z);
    }

    private void N(class05362 class053622) {
        class01321.N((class05096)this, (URI)class03597.L);
    }

    private void N(class06478 class064782, boolean bl) {
        if (this.E != null) {
            this.E.N(bl);
        }
    }

    public void method_25426() {
        class01885 class018852 = (class01885)this.U.N((class02102)class01885.u().N(4));
        class018852.L().y();
        class018852.N((class02102)new class02071(N, this.field_22793));
        this.W = (class04230)class018852.N((class02102)new class04230(y, this.field_22793).N(true));
        class01885 class018853 = (class01885)class018852.N((class02102)class01885.i().N(8));
        class018853.N((class02102)class05362.method_46430((class00392)L, this::N).N());
        class018853.N((class02102)class05362.method_46430((class00392)u, this::y).N());
        class01885 class018854 = (class01885)this.U.y((class02102)class01885.u().N(4));
        class018854.L().y();
        if (B) {
            this.m = (class05725)class018854.N((class02102)class05725.y((class00392)R, (class01590)this.field_22793).N(this.field_22789 - 40).N(this.z.Nk()).N(this::N).N());
        }
        class01885 class018855 = (class01885)class018854.N((class02102)class01885.i().N(8));
        class018855.N((class02102)class05362.method_46430((class00392)i, this::L).N());
        class018855.N((class02102)class05362.method_46430((class00392)class05220.u, class053622 -> this.method_25419()).N());
        class01885 class018856 = (class01885)this.U.L((class02102)class01885.u().N(8));
        this.E = (class04240)class018856.N((class02102)new class04240(0, 0, this.field_22789 - 40, this.U.u(), this.field_22793));
        this.E.N(d -> {
            this.P = d;
        });
        this.U.method_48206(class046542 -> {
            class06478 cfr_ignored_0 = (class06478)this.method_37063((class04654)class046542);
        });
        this.method_48640();
    }

    protected void method_56131() {
        if (this.E != null) {
            this.method_48265((class04654)this.E);
        }
    }

    public void method_48640() {
        if (this.E != null) {
            this.E.method_44382(this.P);
            this.E.method_25358(this.field_22789 - 40);
            this.E.method_53533(this.U.u());
            this.E.y();
        }
        if (this.W != null) {
            this.W.N(this.field_22789 - 16);
        }
        if (this.m != null) {
            this.m.N(this.field_22789 - 40, this.field_22793);
        }
        this.U.N();
    }

    public void method_25419() {
        this.field_22787.N(this.Z);
    }

    public class00392 method_25435() {
        return class05220.N((class00392[])new class00392[]{super.method_25435(), y});
    }
}

