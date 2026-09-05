/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  minecraft.class00392
 *  minecraft.class01054
 *  minecraft.class01127
 *  minecraft.class01463
 *  minecraft.class01894
 *  minecraft.class02566
 *  minecraft.class03443
 *  minecraft.class03448
 *  minecraft.class03556
 *  minecraft.class04227
 *  minecraft.class04453
 *  minecraft.class04802
 *  minecraft.class05216
 *  minecraft.class05220
 *  minecraft.class05936
 *  minecraft.class06069
 *  minecraft.class06541
 *  minecraft.class06584
 *  minecraft.class06608
 *  minecraft.class06613
 *  minecraft.class07304
 *  minecraft.class07482
 *  minecraft.class07500
 *  minecraft.class08036
 *  minecraft.class08044
 *  minecraft.class08394
 */
package minecraft;

import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import minecraft.class00392;
import minecraft.class01054;
import minecraft.class01127;
import minecraft.class01463;
import minecraft.class01894;
import minecraft.class02566;
import minecraft.class03443;
import minecraft.class03448;
import minecraft.class03556;
import minecraft.class04227;
import minecraft.class04453;
import minecraft.class04802;
import minecraft.class04975;
import minecraft.class04995;
import minecraft.class05216;
import minecraft.class05220;
import minecraft.class05936;
import minecraft.class06069;
import minecraft.class06541;
import minecraft.class06584;
import minecraft.class06608;
import minecraft.class06613;
import minecraft.class07304;
import minecraft.class07482;
import minecraft.class07500;
import minecraft.class08036;
import minecraft.class08044;
import minecraft.class08394;

public class class04946
extends class01463<class07500> {
    private static final class01894[] G = new class01894[]{class01894.y((String)"container/enchanting_table/level_1"), class01894.y((String)"container/enchanting_table/level_2"), class01894.y((String)"container/enchanting_table/level_3")};
    private static final class01894[] l = new class01894[]{class01894.y((String)"container/enchanting_table/level_1_disabled"), class01894.y((String)"container/enchanting_table/level_2_disabled"), class01894.y((String)"container/enchanting_table/level_3_disabled")};
    private static final class01894 d = class01894.y((String)"container/enchanting_table/enchantment_slot_disabled");
    private static final class01894 w = class01894.y((String)"container/enchanting_table/enchantment_slot_highlighted");
    private static final class01894 k = class01894.y((String)"container/enchanting_table/enchantment_slot");
    private static final class01894 Y = class01894.y((String)"textures/gui/container/enchanting_table.png");
    private static final class01894 Q = class01894.y((String)"textures/entity/enchanting_table_book.png");
    private final class06069 O = class06069.u();
    private class01127 g;
    public float N;
    public float y;
    public float L;
    public float u;
    public float n;
    public float t;
    private class06584 I = class06584.E;

    public class04946(class07500 class075002, class08044 class080442, class00392 class003922) {
        super((class07482)class075002, class080442, class003922);
    }

    private void i(class01054 class010542, int n, int n2) {
        float f = this.field_22787.NK().N(false);
        float f2 = class04995.B(f, this.t, this.n);
        float f3 = class04995.B(f, this.y, this.N);
        int n3 = n + 14;
        int n4 = n2 + 14;
        int n5 = n3 + 38;
        int n6 = n4 + 31;
        class010542.N(this.g, Q, 40.0f, f2, f3, n3, n4, n5, n6);
    }

    public void u() {
        super.u();
        ((class04453)this.field_22787.T_4).L_5 = ((class04453)this.field_22787.T_4).field_6012;
        this.N();
    }

    protected void N(class01054 class010542, float f, int n, int n2) {
        int n3 = (this.field_22789 - this.B) / 2;
        int n4 = (this.field_22790 - this.Z) / 2;
        class010542.N(class08394.Na, Y, n3, n4, 0.0f, 0.0f, this.B, this.Z, 256, 256);
        this.i(class010542, n3, n4);
        class04975.N().N(((class07500)this.m).W());
        int n5 = ((class07500)this.m).E();
        for (int i = 0; i < 3; ++i) {
            int n6 = n3 + 60;
            int n7 = n6 + 20;
            int n8 = ((class07500)this.m).y[i];
            if (n8 == 0) {
                class010542.N(class08394.Na, d, n6, n4 + 14 + 19 * i, 108, 19);
                continue;
            }
            String string = "" + n8;
            int n9 = 86 - this.field_22793.y(string);
            class05936 class059362 = class04975.N().N(this.field_22793, n9);
            int n10 = -9937334;
            if (!(n5 >= i + 1 && ((class04453)this.field_22787.T_4).fields_37fa3311b0e9d3e9b883d09222919bf5a_0 >= n8 || ((class04453)this.field_22787.T_4).method_56992())) {
                class010542.N(class08394.Na, d, n6, n4 + 14 + 19 * i, 108, 19);
                class010542.N(class08394.Na, l[i], n6 + 1, n4 + 15 + 19 * i, 16, 16);
                class010542.N(this.field_22793, class059362, n7, n4 + 16 + 19 * i, n9, class02566.M((int)((n10 & 0xFEFEFE) >> 1)), false);
                n10 = -12550384;
            } else {
                int n11 = n - (n3 + 60);
                int n12 = n2 - (n4 + 14 + 19 * i);
                if (n11 >= 0 && n12 >= 0 && n11 < 108 && n12 < 19) {
                    class010542.N(class08394.Na, w, n6, n4 + 14 + 19 * i, 108, 19);
                    class010542.N(class06608.u);
                    n10 = -128;
                } else {
                    class010542.N(class08394.Na, k, n6, n4 + 14 + 19 * i, 108, 19);
                }
                class010542.N(class08394.Na, G[i], n6 + 1, n4 + 15 + 19 * i, 16, 16);
                class010542.N(this.field_22793, class059362, n7, n4 + 16 + 19 * i, n9, n10, false);
                n10 = -8323296;
            }
            class010542.y(this.field_22793, string, n7 + 86 - this.field_22793.y(string), n4 + 16 + 19 * i + 7, n10);
        }
    }

    public void N() {
        class06584 class065842 = ((class07500)this.m).L(0).i();
        if (!class06584.N((class06584)class065842, (class06584)this.I)) {
            this.I = class065842;
            do {
                this.L += (float)(this.O.y(4) - this.O.y(4));
            } while (this.N <= this.L + 1.0f && this.N >= this.L - 1.0f);
        }
        this.y = this.N;
        this.t = this.n;
        boolean bl = false;
        for (int i = 0; i < 3; ++i) {
            if (((class07500)this.m).y[i] == 0) continue;
            bl = true;
            break;
        }
        this.n = bl ? (this.n += 0.2f) : (this.n -= 0.2f);
        this.n = class04995.N(this.n, 0.0f, 1.0f);
        float f = (this.L - this.N) * 0.4f;
        float f2 = 0.2f;
        f = class04995.N(f, -0.2f, 0.2f);
        this.u += (f - this.u) * 0.9f;
        this.N += this.u;
    }

    public void method_25426() {
        super.method_25426();
        this.g = new class01127(this.field_22787.yt().N(class04802.J));
    }

    public void method_25394(class01054 class010542, int n, int n2, float f) {
        float f2 = this.field_22787.NK().N(false);
        super.method_25394(class010542, n, n2, f2);
        this.a_(class010542, n, n2);
        boolean bl = ((class04453)this.field_22787.T_4).method_56992();
        int n3 = ((class07500)this.m).E();
        for (int i = 0; i < 3; ++i) {
            int n4 = ((class07500)this.m).y[i];
            Optional optional = ((class03448)this.field_22787.T_3).method_30349().L(class04227.yR).L(((class07500)this.m).L[i]);
            if (optional.isEmpty()) continue;
            int n5 = ((class07500)this.m).u[i];
            int n6 = i + 1;
            if (!this.N(60, 14 + 19 * i, 108, 17, n, n2) || n4 <= 0 || n5 < 0) continue;
            ArrayList arrayList = Lists.newArrayList();
            arrayList.add(class00392.N((String)"container.enchant.clue", (Object[])new Object[]{class07304.N((class03556)((class03556)optional.get()), (int)n5)}).N(class06541.field_1068));
            if (!bl) {
                arrayList.add(class05220.N);
                if (((class04453)this.field_22787.T_4).fields_37fa3311b0e9d3e9b883d09222919bf5a_0 < n4) {
                    arrayList.add(class00392.N((String)"container.enchant.level.requirement", (Object[])new Object[]{((class07500)this.m).y[i]}).N(class06541.field_1061));
                } else {
                    class05216 class052162 = n6 == 1 ? class00392.L((String)"container.enchant.lapis.one") : class00392.N((String)"container.enchant.lapis.many", (Object[])new Object[]{n6});
                    arrayList.add(class052162.N(n3 >= n6 ? class06541.field_1080 : class06541.field_1061));
                    class05216 class052163 = n6 == 1 ? class00392.L((String)"container.enchant.level.one") : class00392.N((String)"container.enchant.level.many", (Object[])new Object[]{n6});
                    arrayList.add(class052163.N(class06541.field_1080));
                }
            }
            class010542.N(this.field_22793, (List)arrayList, n, n2);
            break;
        }
    }

    public boolean method_25402(class06613 class066132, boolean bl) {
        int n = (this.field_22789 - this.B) / 2;
        int n2 = (this.field_22790 - this.Z) / 2;
        for (int i = 0; i < 3; ++i) {
            double d = class066132.n() - (double)(n + 60);
            double d2 = class066132.t() - (double)(n2 + 14 + 19 * i);
            if (!(d >= 0.0) || !(d2 >= 0.0) || !(d < 108.0) || !(d2 < 19.0) || !((class07500)this.m).y((class08036)((class04453)this.field_22787.T_4), i)) continue;
            ((class03443)this.field_22787.T_2).N(((class07500)this.m).b, i);
            return true;
        }
        return super.method_25402(class066132, bl);
    }
}

