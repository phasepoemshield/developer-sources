/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10461
 *  minecraft.class00381
 *  minecraft.class00392
 *  minecraft.class00535
 *  minecraft.class00569
 *  minecraft.class01054
 *  minecraft.class01205
 *  minecraft.class01212
 *  minecraft.class01590
 *  minecraft.class01894
 *  minecraft.class02102
 *  minecraft.class03241
 *  minecraft.class03255
 *  minecraft.class03271
 *  minecraft.class03281
 *  minecraft.class03686
 *  minecraft.class04141
 *  minecraft.class04907
 *  minecraft.class05096
 *  minecraft.class05213
 *  minecraft.class05220
 *  minecraft.class05362
 *  minecraft.class06478
 *  minecraft.class06601
 *  minecraft.class08394
 *  minecraft.class08745
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import Nursultan.class10461;
import minecraft.class00381;
import minecraft.class00392;
import minecraft.class00535;
import minecraft.class00569;
import minecraft.class01054;
import minecraft.class01205;
import minecraft.class01212;
import minecraft.class01590;
import minecraft.class01894;
import minecraft.class02102;
import minecraft.class03241;
import minecraft.class03255;
import minecraft.class03271;
import minecraft.class03281;
import minecraft.class03686;
import minecraft.class04141;
import minecraft.class04597;
import minecraft.class04607;
import minecraft.class04611;
import minecraft.class04654;
import minecraft.class04907;
import minecraft.class05096;
import minecraft.class05213;
import minecraft.class05220;
import minecraft.class05362;
import minecraft.class06478;
import minecraft.class06601;
import minecraft.class08394;
import minecraft.class08745;
import org.jspecify.annotations.Nullable;

public class class04610
extends class05096 {
    private static final class00392 Z = class00392.L((String)"gui.stats");
    static final class01894 N = class01894.y((String)"container/slot");
    static final class01894 y = class01894.y((String)"statistics/header");
    static final class01894 L = class01894.y((String)"statistics/sort_up");
    static final class01894 u = class01894.y((String)"statistics/sort_down");
    private static final class00392 z = class00392.L((String)"multiplayer.downloadingStats");
    static final class00392 i = class00392.L((String)"stats.none");
    private static final class00392 U = class00392.L((String)"stat.generalButton");
    private static final class00392 E = class00392.L((String)"stat.itemsButton");
    private static final class00392 W = class00392.L((String)"stat.mobsButton");
    protected final class05096 R;
    private static final int m = 280;
    public final class03686 M = new class03686((class05096)this);
    private final class03271 P = new class03271(class046542 -> {
        class06478 cfr_ignored_0 = (class06478)this.method_37063((class04654)class046542);
    }, class046542 -> this.method_37066((class04654)class046542));
    private @Nullable class03281 s;
    final class01205 B;
    private boolean T = true;

    static /* synthetic */ class01590 L(class04610 class046102) {
        return class046102.field_22793;
    }

    static /* synthetic */ class01590 M(class04610 class046102) {
        return class046102.field_22793;
    }

    public class04610(class05096 class050962, class01205 class012052) {
        super(Z);
        this.R = class050962;
        this.B = class012052;
    }

    static /* synthetic */ class01590 B(class04610 class046102) {
        return class046102.field_22793;
    }

    static /* synthetic */ class01590 Z(class04610 class046102) {
        return class046102.field_22793;
    }

    static /* synthetic */ class01590 i(class04610 class046102) {
        return class046102.field_22793;
    }

    static /* synthetic */ class01590 m(class04610 class046102) {
        return class046102.field_22793;
    }

    static /* synthetic */ class01590 U(class04610 class046102) {
        return class046102.field_22793;
    }

    static /* synthetic */ class01590 z(class04610 class046102) {
        return class046102.field_22793;
    }

    static /* synthetic */ class01590 u(class04610 class046102) {
        return class046102.field_22793;
    }

    static /* synthetic */ class01590 y(class04610 class046102) {
        return class046102.field_22793;
    }

    static /* synthetic */ class01590 E(class04610 class046102) {
        return class046102.field_22793;
    }

    public void N() {
        if (this.T) {
            if (this.s != null) {
                this.method_37066((class04654)this.s);
            }
            this.s = class03281.method_48623((class03271)this.P, (int)this.field_22789).N(new class03241[]{new class10461(this, U, (class01212)new class04597(this, this.field_22787)), new class10461(this, E, (class01212)new class04611(this, this.field_22787)), new class10461(this, W, (class01212)new class04607(this, this.field_22787))}).N();
            this.method_25395((class04654)this.s);
            this.method_37063((class04654)this.s);
            this.N(1);
            this.N(2);
            this.s.method_48987(0, false);
            this.method_48640();
            this.T = false;
        }
    }

    static String N(class04907<class01894> class049072) {
        return "stat." + ((class01894)class049072.R()).toString().replace(':', '.');
    }

    static /* synthetic */ class01590 N(class04610 class046102) {
        return class046102.field_22793;
    }

    private void N(int n) {
        if (this.s == null) {
            return;
        }
        Object e = this.s.method_71284().get(n);
        boolean bl = e instanceof class10461 && !((class10461)e).N.method_25396().isEmpty();
        this.s.method_71522(n, bl);
        if (bl) {
            this.s.method_71521(n, null);
        } else {
            this.s.method_71521(n, class04141.N((class00392)class00392.L((String)"gui.stats.none_found")));
        }
    }

    public void method_25426() {
        class00392 class003922 = z;
        this.s = class03281.method_48623((class03271)this.P, (int)this.field_22789).N(new class03241[]{new class08745(this.method_64506(), U, class003922), new class08745(this.method_64506(), E, class003922), new class08745(this.method_64506(), W, class003922)}).N();
        this.method_37063((class04654)this.s);
        this.M.y((class02102)class05362.method_46430((class00392)class05220.u, class053622 -> this.method_25419()).N(200).N());
        this.s.method_71522(0, true);
        this.s.method_71522(1, false);
        this.s.method_71522(2, false);
        this.M.method_48206(class064782 -> {
            class064782.method_48591(1);
            this.method_37063((class04654)class064782);
        });
        this.s.method_48987(0, false);
        this.method_48640();
        this.field_22787.NE().N((class00381)new class00535(class00569.field_12775));
    }

    public boolean method_25404(class06601 class066012) {
        if (this.s != null && this.s.method_25404(class066012)) {
            return true;
        }
        return super.method_25404(class066012);
    }

    public void method_48640() {
        if (this.s == null) {
            return;
        }
        this.s.method_48618(this.field_22789);
        this.s.method_49613();
        int n = this.s.method_48202().L();
        class03255 class032552 = new class03255(0, n, this.field_22789, this.field_22790 - this.M.y() - n);
        this.s.method_71284().forEach(class032412 -> class032412.method_48612(class064782 -> class064782.method_53533(class032552.B())));
        this.P.N(class032552);
        this.M.y(n);
        this.M.N();
    }

    public void method_25394(class01054 class010542, int n, int n2, float f) {
        super.method_25394(class010542, n, n2, f);
        class010542.N(class08394.Na, class05096.field_49896, 0, this.field_22790 - this.M.y(), 0.0f, 0.0f, this.field_22789, 2, 32, 2);
    }

    public void method_25419() {
        this.field_22787.N(this.R);
    }

    protected void method_57735(class01054 class010542) {
        class010542.N(class08394.Na, class05213.i, 0, 0, 0.0f, 0.0f, this.field_22789, this.M.L(), 16, 16);
        this.method_57736(class010542, 0, this.M.L(), this.field_22789, this.field_22790);
    }

    static /* synthetic */ class01590 W(class04610 class046102) {
        return class046102.field_22793;
    }

    static /* synthetic */ class01590 R(class04610 class046102) {
        return class046102.field_22793;
    }
}

