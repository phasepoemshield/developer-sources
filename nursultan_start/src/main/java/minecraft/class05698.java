/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00040
 *  minecraft.class00044
 *  minecraft.class00392
 *  minecraft.class01054
 *  minecraft.class01631
 *  minecraft.class02590
 *  minecraft.class02689
 *  minecraft.class03255
 *  minecraft.class03556
 *  minecraft.class03933
 *  minecraft.class04141
 *  minecraft.class04282
 *  minecraft.class04601
 *  minecraft.class04909
 *  minecraft.class04961
 *  minecraft.class04981
 *  minecraft.class05096
 *  minecraft.class05132
 *  minecraft.class06601
 *  minecraft.class06613
 *  minecraft.class07923
 *  minecraft.class07949
 *  minecraft.class08394
 */
package minecraft;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.UUID;
import minecraft.class00040;
import minecraft.class00044;
import minecraft.class00392;
import minecraft.class01054;
import minecraft.class01631;
import minecraft.class02590;
import minecraft.class02689;
import minecraft.class03255;
import minecraft.class03556;
import minecraft.class03933;
import minecraft.class04141;
import minecraft.class04282;
import minecraft.class04601;
import minecraft.class04909;
import minecraft.class04961;
import minecraft.class04981;
import minecraft.class05096;
import minecraft.class05132;
import minecraft.class05685;
import minecraft.class05728;
import minecraft.class06601;
import minecraft.class06613;
import minecraft.class07923;
import minecraft.class07949;
import minecraft.class08394;

class class05698
extends class05728 {
    private static final class00392 M = class00392.L((String)"mco.onlinePlayers");
    private static final int B = 9;
    private static final int Z = 3;
    private static final int z = 36;
    final class04981 N;
    private final class04282 U;
    final /* synthetic */ class05685 y;

    private void L() {
        class05685.Q(this.y).Nr().N((class00044)class00040.N((class03556)class04909.OK, (float)1.0f));
        class05685.N(this.N, (class05096)this.y);
    }

    public class05698(class05685 class056852, class04981 class049812) {
        this.y = class056852;
        super(class056852);
        this.U = new class04282();
        this.N = class049812;
        boolean bl = class05685.N(class049812);
        if (class05685.N() && bl && class049812.Z()) {
            this.U.N(class04141.N((class00392)class00392.N((String)"mco.snapshot.paired", (Object[])new Object[]{class049812.t})));
        } else if (!bl && class049812.R()) {
            this.U.N(class04141.N((class00392)class00392.N((String)"mco.snapshot.friendsRealm.downgrade", (Object[])new Object[]{class049812.G})));
        }
    }

    private void u() {
        class05685.O(this.y).Nr().N((class00044)class00040.N((class03556)class04909.OK, (float)1.0f));
        class05132 class051322 = new class05132(this.y, this.N, this.N.Z());
        class05685.g(this.y).N((class05096)class051322);
    }

    public class04981 N() {
        return this.N;
    }

    private boolean N(class01054 class010542, int n, int n2, int n3, int n4, int n5, int n6, float f) {
        List var9 = this.y.n.N(this.N.y);
        int n7 = var9.size();
        if (n7 > 0) {
            int n8 = n2 + n3 - 21;
            int n9 = n + n4 - 9 - 2;
            int n10 = 9 * n7 + 3 * (n7 - 1);
            int n11 = n8 - n10;
            ArrayList<class07923> arrayList = n5 >= n11 && n5 <= n8 && n6 >= n9 && n6 <= n9 + 9 ? new ArrayList<class07923>(n7) : null;
            class07949 class079492 = class05685.k(this.y).Nn();
            for (int i = 0; i < var9.size(); ++i) {
                class02689 class026892 = (class02689)var9.get(i);
                class07923 class079232 = class079492.N(class026892);
                int n12 = n11 + 12 * i;
                class03933.N((class01054)class010542, (class01631)class079232.y(), (int)n12, (int)n9, (int)9);
                if (arrayList == null) continue;
                arrayList.add(class079232);
            }
            if (arrayList != null) {
                class010542.N(class05685.Y(this.y), List.of(M), Optional.of(new class02590(arrayList)), n5, n6);
                return true;
            }
        }
        return false;
    }

    public boolean method_25404(class06601 class066012) {
        if (class066012.L()) {
            if (this.N.R == class04961.field_19435) {
                this.u();
                return true;
            }
            if (this.N.M()) {
                this.L();
                return true;
            }
        }
        return super.method_25404(class066012);
    }

    @Override
    public boolean method_25402(class06613 class066132, boolean bl) {
        if (this.N.R == class04961.field_19435) {
            this.u();
        } else if (this.N.M() && bl && this.method_25370()) {
            this.L();
        }
        return true;
    }

    public void method_25343(class01054 class010542, int n, int n2, boolean bl, float f) {
        if (this.N.R == class04961.field_19435) {
            class010542.N(class08394.Na, class05685.y, this.method_73380() - 5, this.method_73385() - 10, 40, 20);
            int n3 = this.method_73385();
            Objects.requireNonNull(class05685.d(this.y));
            int n4 = n3 - 4;
            class010542.y(class05685.w(this.y), class05685.Z, this.method_73380() + 40 - 2, n4, -8388737);
            return;
        }
        class04601.N((class01054)class010542, (int)this.method_73380(), (int)this.method_73382(), (int)32, (UUID)this.N.B);
        this.N(class010542, this.method_73382(), this.method_73380(), this.method_73387(), -1, this.N);
        this.N(class010542, this.method_73382(), this.method_73380(), this.method_73387(), this.N);
        this.N(class010542, this.method_73382(), this.method_73380(), this.N);
        this.N(this.N, class010542, this.method_73389(), this.method_73382(), n, n2);
        boolean bl2 = this.N(class010542, this.method_73382(), this.method_73380(), this.method_73387(), this.method_73384(), n, n2, f);
        if (!bl2) {
            this.U.N(class010542, n, n2, bl, this.method_25370(), new class03255(this.method_73380(), this.method_73382(), this.method_73387(), this.method_73384()));
        }
    }

    @Override
    public class00392 method_37006() {
        if (this.N.R == class04961.field_19435) {
            return class05685.T;
        }
        return class00392.N((String)"narrator.select", (Object[])new Object[]{Objects.requireNonNullElse(this.N.u, "unknown server")});
    }
}

