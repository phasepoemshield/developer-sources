/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00381
 *  minecraft.class00392
 *  minecraft.class01054
 *  minecraft.class01683
 *  minecraft.class01894
 *  minecraft.class02484
 *  minecraft.class04453
 *  minecraft.class04654
 *  minecraft.class04927
 *  minecraft.class04977
 *  minecraft.class05431
 *  minecraft.class05936
 *  minecraft.class06584
 *  minecraft.class06601
 *  minecraft.class06937
 *  minecraft.class07338
 *  minecraft.class07482
 *  minecraft.class07497
 *  minecraft.class08036
 *  minecraft.class08044
 *  minecraft.class08394
 */
package minecraft;

import minecraft.class00381;
import minecraft.class00392;
import minecraft.class01054;
import minecraft.class01683;
import minecraft.class01894;
import minecraft.class02484;
import minecraft.class04453;
import minecraft.class04654;
import minecraft.class04927;
import minecraft.class04977;
import minecraft.class05431;
import minecraft.class05936;
import minecraft.class06584;
import minecraft.class06601;
import minecraft.class06937;
import minecraft.class07338;
import minecraft.class07482;
import minecraft.class07497;
import minecraft.class08036;
import minecraft.class08044;
import minecraft.class08394;

public class class05889
extends class05431<class07497> {
    private static final class01894 N = class01894.y((String)"container/anvil/text_field");
    private static final class01894 y = class01894.y((String)"container/anvil/text_field_disabled");
    private static final class01894 L = class01894.y((String)"container/anvil/error");
    private static final class01894 u = class01894.y((String)"textures/gui/container/anvil.png");
    private static final class00392 n = class00392.L((String)"container.repair.expensive");
    private class04927 t;
    private final class08036 G;

    public class05889(class07497 class074972, class08044 class080442, class00392 class003922) {
        super((class04977)class074972, class080442, class003922, u);
        this.G = class080442.z;
        this.z = 60;
    }

    protected void i(class01054 class010542, int n, int n2) {
        if ((((class07497)this.m).L(0).R() || ((class07497)this.m).L(1).R()) && !((class07497)this.m).L(((class07497)this.m).m()).R()) {
            class010542.N(class08394.Na, L, n + 99, n2 + 45, 28, 21);
        }
    }

    protected void u(class01054 class010542, int n, int n2) {
        super.u(class010542, n, n2);
        int n3 = ((class07497)this.m).W();
        if (n3 > 0) {
            class00392 class003922;
            int n4 = -8323296;
            if (n3 >= 40 && !((class04453)this.field_22787.T_4).method_56992()) {
                class003922 = class05889.n;
                n4 = -40864;
            } else if (!((class07497)this.m).L(2).R()) {
                class003922 = null;
            } else {
                class003922 = class00392.N((String)"container.repair.cost", (Object[])new Object[]{n3});
                if (!((class07497)this.m).L(2).N(this.G)) {
                    n4 = -40864;
                }
            }
            if (class003922 != null) {
                int n5 = this.B - 8 - this.field_22793.N((class05936)class003922) - 2;
                int n6 = 69;
                class010542.N(n5 - 2, 67, this.B - 8, 79, 0x4F000000);
                class010542.y(this.field_22793, class003922, n5, 69, n4);
            }
        }
    }

    protected void u() {
        super.u();
        ((class04453)this.field_22787.T_4).L_5 = ((class04453)this.field_22787.T_4).field_6012;
    }

    public void N(class07482 class074822, int n, class06584 class065842) {
        if (n == 0) {
            this.t.method_1852(class065842.R() ? "" : class065842.d().getString());
            this.t.method_1888(!class065842.R());
            this.method_25395((class04654)this.t);
        }
    }

    private void N(String string) {
        class06937 class069372 = ((class07497)this.m).L(0);
        if (!class069372.R()) {
            return;
        }
        String string2 = string;
        if (!class069372.i().L(class02484.B) && string2.equals(class069372.i().d().getString())) {
            string2 = "";
        }
        if (((class07497)this.m).N(string2)) {
            ((class01683)((class04453)this.field_22787.T_4).y_0).N((class00381)new class07338(string2));
        }
    }

    protected void N() {
        int n = (this.field_22789 - this.B) / 2;
        int n2 = (this.field_22790 - this.Z) / 2;
        this.t = new class04927(this.field_22793, n + 62, n2 + 24, 103, 12, (class00392)class00392.L((String)"container.repair"));
        this.t.method_1856(false);
        this.t.method_1868(-1);
        this.t.method_1860(-1);
        this.t.method_75351(false);
        this.t.method_1858(false);
        this.t.method_1880(50);
        this.t.method_1863(this::N);
        this.t.method_1852("");
        this.method_37063((class04654)this.t);
        this.t.method_1888(((class07497)this.m).L(0).R());
    }

    protected void N(class01054 class010542, float f, int n, int n2) {
        super.N(class010542, f, n, n2);
        class010542.N(class08394.Na, ((class07497)this.m).L(0).R() ? N : y, this.T + 59, this.b + 20, 110, 16);
    }

    protected void method_56131() {
        this.method_48265((class04654)this.t);
    }

    public boolean method_25404(class06601 class066012) {
        if (class066012.i()) {
            ((class04453)this.field_22787.T_4).method_7346();
            return true;
        }
        if (this.t.method_25404(class066012) || this.t.method_20315()) {
            return true;
        }
        return super.method_25404(class066012);
    }

    public void method_25410(int n, int n2) {
        String string = this.t.method_1882();
        this.method_25423(n, n2);
        this.t.method_1852(string);
    }
}

