/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class11067
 *  Nursultan.class11287
 *  Nursultan.class11288
 *  Nursultan.class11303
 *  Nursultan.class11910
 *  Nursultan.class11938
 */
package Nursultan;

import Nursultan.class11067;
import Nursultan.class11287;
import Nursultan.class11288;
import Nursultan.class11303;
import Nursultan.class11686;
import Nursultan.class11693;
import Nursultan.class11715;
import Nursultan.class11910;
import Nursultan.class11938;

public class class11706
implements class11686 {
    public Object N_0;
    public static Object y_0;

    private static void L() {
        y_0 = null;
    }

    public class11706(class11693 class116932) {
        this.u();
        this.N_0 = class116932;
    }

    static {
        class11706.L();
    }

    private void u() {
    }

    @Override
    public String[] N() {
        return (String[])y_0;
    }

    @Override
    public void N(String string) {
        class11910.N((String)("/register " + string + " " + string));
        try {
            ((class11693)this.N_0).N(class11715.N(), class11715.y(), string);
        }
        catch (Exception exception) {
            class11303.N((class11287)new class11288((class11067)class11938.u().Q()), (Object)("Register error: " + exception.getMessage()));
        }
    }
}

