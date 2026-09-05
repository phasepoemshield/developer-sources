/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10511
 *  com.google.common.collect.Lists
 *  minecraft.class00392
 *  minecraft.class00405
 *  minecraft.class00577
 *  minecraft.class00580
 *  minecraft.class00604
 *  minecraft.class00647
 *  minecraft.class00652
 *  minecraft.class00937
 *  minecraft.class01054
 *  minecraft.class01065
 *  minecraft.class01894
 *  minecraft.class03448
 *  minecraft.class04453
 *  minecraft.class04654
 *  minecraft.class04705
 *  minecraft.class05096
 *  minecraft.class05216
 *  minecraft.class05220
 *  minecraft.class06202
 *  minecraft.class06541
 *  minecraft.class06613
 *  minecraft.class08394
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import Nursultan.class10511;
import com.google.common.collect.Lists;
import java.net.URI;
import java.util.Iterator;
import java.util.List;
import minecraft.class00392;
import minecraft.class00405;
import minecraft.class00577;
import minecraft.class00580;
import minecraft.class00604;
import minecraft.class00647;
import minecraft.class00652;
import minecraft.class00937;
import minecraft.class01054;
import minecraft.class01065;
import minecraft.class01894;
import minecraft.class03448;
import minecraft.class04453;
import minecraft.class04654;
import minecraft.class04705;
import minecraft.class05096;
import minecraft.class05216;
import minecraft.class05220;
import minecraft.class05362;
import minecraft.class06202;
import minecraft.class06541;
import minecraft.class06613;
import minecraft.class08394;
import org.jspecify.annotations.Nullable;

public class class05345
extends class05096 {
    private static final int N = 2;
    private static final class01894 y = class01894.y((String)"icon/draft_report");
    private int L;
    private final @Nullable class00392 u;
    private final boolean i;
    private final class04453 R;
    private final class00392 M;
    private final List<class05362> B = Lists.newArrayList();
    private @Nullable class05362 Z;

    public class05345(@Nullable class00392 class003922, boolean bl, class04453 class044532) {
        super((class00392)class00392.L((String)(bl ? "deathScreen.title.hardcore" : "deathScreen.title")));
        this.u = class003922;
        this.i = bl;
        this.R = class044532;
        class05216 class052162 = class00392.y((String)Integer.toString(class044532.method_7272())).N(class06541.field_1054);
        this.M = class00392.N((String)"deathScreen.score.value", (Object[])new Object[]{class052162});
    }

    private void y() {
        if ((class03448)this.field_22787.T_3 != null) {
            ((class03448)this.field_22787.T_3).N(class03448.N);
        }
        this.field_22787.Nj();
        this.field_22787.N((class05096)new class04705());
    }

    public static void N(class01054 class010542, int n, int n2) {
        class010542.N(0, 0, n, n2, 0x60500000, -1602211792);
    }

    private void N(boolean bl) {
        Iterator<class05362> var2 = this.B.iterator();
        while (var2.hasNext()) {
            var2.next().field_22763 = bl;
        }
    }

    private void N(class00580 class005802) {
        class00577 class005772 = class005802.N();
        int n = this.field_22789 / 2;
        class005802.N(class005772.N(2.0f));
        class005802.N(class00937.field_62010, n / 2, 30, this.field_22785);
        class005802.N(class005772);
        if (this.u != null) {
            class005802.N(class00937.field_62010, n, 85, this.u);
        }
        class005802.N(class00937.field_62010, n, 100, this.M);
    }

    private void N() {
        if (this.i) {
            this.y();
            return;
        }
        class10511 class105112 = new class10511(bl -> {
            if (bl) {
                this.y();
            } else {
                this.R.K();
                this.field_22787.N(null);
            }
        }, (class00392)class00392.L((String)"deathScreen.quit.confirm"), class05220.N, (class00392)class00392.L((String)"deathScreen.titleScreen"), (class00392)class00392.L((String)"deathScreen.respawn"));
        this.field_22787.N((class05096)class105112);
        class105112.method_2125(20);
    }

    public void method_25426() {
        this.L = 0;
        this.B.clear();
        class05216 class052162 = this.i ? class00392.L((String)"deathScreen.spectate") : class00392.L((String)"deathScreen.respawn");
        this.B.add((class05362)this.method_37063((class04654)class05362.method_46430((class00392)class052162, class053622 -> {
            this.R.K();
            class053622.field_22763 = false;
        }).N(this.field_22789 / 2 - 100, this.field_22790 / 4 + 72, 200, 20).N()));
        this.Z = (class05362)this.method_37063((class04654)class05362.method_46430((class00392)class00392.L((String)"deathScreen.titleScreen"), class053622 -> this.field_22787.R().N(this.field_22787, (class05096)this, this::N, true)).N(this.field_22789 / 2 - 100, this.field_22790 / 4 + 96, 200, 20).N());
        this.B.add(this.Z);
        this.N(false);
    }

    public boolean method_25422() {
        return false;
    }

    public void method_25393() {
        super.method_25393();
        ++this.L;
        if (this.L == 20) {
            this.N(true);
        }
    }

    public void method_25420(class01054 class010542, int n, int n2, float f) {
        class05345.N(class010542, this.field_22789, this.field_22790);
    }

    public void method_25394(class01054 class010542, int n, int n2, float f) {
        super.method_25394(class010542, n, n2, f);
        this.N(class010542.N(class01065.field_63852));
        if (this.Z != null && this.field_22787.R().L()) {
            class010542.N(class08394.Na, y, this.Z.method_46426() + this.Z.method_25368() - 17, this.Z.method_46427() + 3, 15, 15);
        }
    }

    public boolean method_25421() {
        return false;
    }

    public boolean method_73217() {
        return true;
    }

    public boolean method_25402(class06613 class066132, boolean bl) {
        class00647 class006472;
        class00604 class006042 = new class00604(this.method_64506(), (int)class066132.n(), (int)class066132.t());
        this.N((class00580)class006042);
        class00405 class004052 = class006042.y();
        if (class004052 != null && (class006472 = class004052.Z()) instanceof class00652) {
            class00652 class006522 = (class00652)class006472;
            return class05345.method_71843((class06202)this.field_22787, (class05096)this, (URI)class006522.y());
        }
        return super.method_25402(class066132, bl);
    }
}

