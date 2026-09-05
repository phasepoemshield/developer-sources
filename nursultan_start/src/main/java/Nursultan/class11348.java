/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class11777
 *  Nursultan.class11782
 *  Nursultan.class12002
 *  Nursultan.class12013
 */
package Nursultan;

import Nursultan.class11381;
import Nursultan.class11389;
import Nursultan.class11777;
import Nursultan.class11782;
import Nursultan.class12002;
import Nursultan.class12013;
import java.util.function.ObjIntConsumer;

public class class11348 {
    public Object N_0;
    public Object N_1;

    private static boolean L(class11389 class113892) {
        return class113892.Z().N(class11381.KEYBOARD) && (class113892.y(class12002.ESCAPE) || class113892.y(class12002.DELETE));
    }

    private void L() {
    }

    public class11348(ObjIntConsumer<class12002> objIntConsumer) {
        this.L();
        this.N_0 = objIntConsumer;
    }

    private void u(class11389 class113892) {
        if (class11348.L(class113892)) {
            this.N_1 = null;
            ((ObjIntConsumer)this.N_0).accept(class12002.UNKNOWN, 0);
            class113892.N();
            return;
        }
        class12002 class120022 = class12002.y((int)class113892.z());
        if (class12013.N((class12002)class120022)) {
            this.N_1 = class120022;
            class113892.N();
            return;
        }
        this.N_1 = null;
        ((ObjIntConsumer)this.N_0).accept(class120022, class120022.y() ? 0 : class12013.y((class12002)class120022, (int)class113892.R()));
        class113892.N();
    }

    private void y(class11389 class113892) {
        if ((class12002)this.N_1 == null || !((class12002)this.N_1).N(class113892.z())) {
            return;
        }
        class12002 class120022 = (class12002)this.N_1;
        this.N_1 = null;
        ((ObjIntConsumer)this.N_0).accept(class120022, class12013.y((class12002)class120022, (int)class113892.R()));
        class113892.N();
    }

    @class11782(y=class11777.BEFORE_ALL)
    public void N(class11389 class113892) {
        if (class113892.B()) {
            this.u(class113892);
            return;
        }
        if (class113892.M()) {
            this.y(class113892);
        }
    }
}

