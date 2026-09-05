/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09777
 *  Nursultan.class09778
 *  Nursultan.class09798
 *  Nursultan.class09809
 *  Nursultan.class09962
 *  Nursultan.class09991
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 */
package Nursultan;

import Nursultan.class09777;
import Nursultan.class09778;
import Nursultan.class09798;
import Nursultan.class09809;
import Nursultan.class09962;
import Nursultan.class09991;
import Nursultan.class11834;
import Nursultan.class11849;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public class class11877
extends Record
implements class11849 {
    public String icon;
    public static Object N_0;
    public static Object N_1;

    private static void L() {
        N_0 = 16;
    }

    public class11877(String string) {
        this.icon = string;
    }

    static {
        class11877.y();
        class11877.L();
        N_1 = class09991.N().N(class09962.N()).y(class09962.N());
    }

    public boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class11877.class, "icon", "icon"}, this, object);
    }

    public String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class11877.class, "icon", "icon"}, this);
    }

    public int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class11877.class, "icon", "icon"}, this);
    }

    private static void y() {
    }

    public String N() {
        return this.icon;
    }

    @Override
    public class09798 N(class09809 class098092, class11834 class118342) {
        String string = "notify-icon-" + class118342.N();
        class09991 class099912 = class09991.N().u(16.0f, 16.0f).i(class118342.B().color());
        return class09778.N((class09991)((class09991)N_1), class097842 -> {
            class097842.N(string);
            class097842.L(class097772 -> ((class09777)class097772.N(string + "-tex")).L(this.icon).N(class099912));
        });
    }
}

