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
import Nursultan.class11675;
import Nursultan.class11686;
import Nursultan.class11693;
import Nursultan.class11715;
import Nursultan.class11910;
import Nursultan.class11938;
import java.util.Optional;

public class class11698
implements class11686 {
    public Object N_0;
    public static Object y_0;

    public class11698(class11693 class116932) {
        this.R();
        this.N_0 = class116932;
    }

    static {
        class11698.i();
    }

    private static void i() {
        y_0 = null;
    }

    @Override
    public String[] N() {
        return (String[])y_0;
    }

    @Override
    public void N(String string) {
        String string2;
        String string3 = class11715.N();
        Optional<class11675> var4 = ((class11693)this.N_0).N(string3, string2 = class11715.y());
        if (var4.isEmpty()) {
            return;
        }
        String string4 = var4.get().y();
        class11910.N((String)("/login " + string4));
        try {
            ((class11693)this.N_0).N(string3, string2, string4);
        }
        catch (Exception exception) {
            class11303.N((class11287)new class11288((class11067)class11938.u().Q()), (Object)("Login update error: " + exception.getMessage()));
        }
    }

    private void R() {
    }
}

