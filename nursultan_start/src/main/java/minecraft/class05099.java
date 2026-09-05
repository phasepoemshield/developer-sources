/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class01054
 *  minecraft.class01590
 *  minecraft.class01894
 *  minecraft.class02566
 *  minecraft.class04141
 *  minecraft.class04602
 *  minecraft.class04981
 *  minecraft.class05216
 *  minecraft.class05220
 *  minecraft.class05361
 *  minecraft.class05362
 *  minecraft.class05685
 *  minecraft.class06202
 *  minecraft.class08394
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import minecraft.class00392;
import minecraft.class01054;
import minecraft.class01590;
import minecraft.class01894;
import minecraft.class02566;
import minecraft.class04141;
import minecraft.class04602;
import minecraft.class04981;
import minecraft.class05110;
import minecraft.class05119;
import minecraft.class05216;
import minecraft.class05220;
import minecraft.class05361;
import minecraft.class05362;
import minecraft.class05685;
import minecraft.class06202;
import minecraft.class08394;
import org.jspecify.annotations.Nullable;

public class class05099
extends class05362 {
    private static final class01894 R = class01894.y((String)"widget/slot_frame");
    public static final class01894 N = class01894.y((String)"textures/gui/realms/empty_frame.png");
    public static final class01894 y = class01894.y((String)"textures/gui/title/background/panorama_0.png");
    public static final class01894 L = class01894.y((String)"textures/gui/title/background/panorama_2.png");
    public static final class01894 u = class01894.y((String)"textures/gui/title/background/panorama_3.png");
    private static final class00392 M = class00392.L((String)"mco.configure.world.slot.tooltip.minigame");
    private static final class00392 B = class00392.L((String)"mco.configure.world.slot.tooltip");
    static final class00392 i = class00392.L((String)"mco.worldSlot.minigame");
    private static final int Z = 64;
    private static final String z = "...";
    private final int U;
    private class05119 E;

    public class05099(int n, int n2, int n3, int n4, int n5, class04981 class049812, class05361 class053612) {
        super(n, n2, n3, n4, class05220.N, class053612, field_40754);
        this.U = n5;
        this.E = this.N(class049812);
    }

    public class05119 y() {
        return this.E;
    }

    static class05110 N(boolean bl, boolean bl2, boolean bl3) {
        if (!(bl || bl2 && bl3)) {
            return class05110.field_19679;
        }
        return class05110.field_19678;
    }

    private void N(class05119 class051192, @Nullable String string) {
        class00392 class003922;
        switch (class051192.B.ordinal()) {
            case 1: {
                class00392 class003923;
                if (class051192.M) {
                    class003923 = M;
                    break;
                }
                class003923 = B;
                break;
            }
            default: {
                class00392 class003923 = class003922 = null;
            }
        }
        if (class003922 != null) {
            this.method_47400(class04141.N((class00392)class003922));
        }
        class05216 class052162 = class00392.y((String)class051192.N);
        if (class051192.M && string != null) {
            class052162 = class052162.y(class05220.l).i(string);
        }
        this.method_25355((class00392)class052162);
    }

    public class05119 N(class04981 class049812) {
        this.E = new class05119(class049812, this.U);
        this.N(this.E, class049812.b);
        return this.E;
    }

    public boolean method_37303() {
        return this.E.B != class05110.field_19678 && super.method_37303();
    }

    public void method_75752(class01054 class010542, int n, int n2, float f) {
        Object object;
        class01590 class015902;
        int n3 = this.method_46426();
        int n4 = this.method_46427();
        boolean bl = this.method_25367();
        class01894 class018942 = this.E.M ? class04602.N((String)String.valueOf(this.E.u), (String)this.E.i) : (this.E.R ? N : (this.E.i != null && this.E.u != -1L ? class04602.N((String)String.valueOf(this.E.u), (String)this.E.i) : (this.U == 1 ? y : (this.U == 2 ? L : (this.U == 3 ? u : N)))));
        int n5 = -1;
        if (!this.E.z) {
            n5 = class02566.N((float)1.0f, (float)0.56f, (float)0.56f, (float)0.56f);
        }
        class010542.N(class08394.Na, class018942, n3 + 1, n4 + 1, 0.0f, 0.0f, this.field_22758 - 2, this.field_22759 - 2, 74, 74, 74, 74, n5);
        if (bl && this.E.B != class05110.field_19678) {
            class010542.N(class08394.Na, R, n3, n4, this.field_22758, this.field_22759);
        } else if (this.E.z) {
            class010542.N(class08394.Na, R, n3, n4, this.field_22758, this.field_22759, class02566.N((float)1.0f, (float)0.8f, (float)0.8f, (float)0.8f));
        } else {
            class010542.N(class08394.Na, R, n3, n4, this.field_22758, this.field_22759, class02566.N((float)1.0f, (float)0.56f, (float)0.56f, (float)0.56f));
        }
        if (this.E.Z) {
            class010542.N(class08394.Na, class05685.M, n3 + 3, n4 + 4, 9, 8);
        }
        if ((class015902 = (class01590)class06202.Nq().i_3).y((String)(object = this.E.N)) > 64) {
            object = class015902.N((String)object, 64 - class015902.y(z)) + z;
        }
        class010542.N(class015902, (String)object, n3 + this.field_22758 / 2, n4 + this.field_22759 - 14, -1);
        if (this.E.z) {
            class010542.N(class015902, class05685.N((String)this.E.y, (boolean)this.E.L.N()), n3 + this.field_22758 / 2, n4 + this.field_22759 + 2, -1);
        }
    }
}

