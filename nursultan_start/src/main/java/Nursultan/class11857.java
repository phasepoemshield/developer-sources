/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09079
 *  Nursultan.class09181
 *  Nursultan.class09221
 *  Nursultan.class09778
 *  Nursultan.class09798
 *  Nursultan.class09801
 *  Nursultan.class09809
 *  Nursultan.class09962
 *  Nursultan.class09969
 *  Nursultan.class09976
 *  Nursultan.class09991
 *  Nursultan.class11300
 *  Nursultan.class11938
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 */
package Nursultan;

import Nursultan.class09079;
import Nursultan.class09181;
import Nursultan.class09221;
import Nursultan.class09778;
import Nursultan.class09798;
import Nursultan.class09801;
import Nursultan.class09809;
import Nursultan.class09962;
import Nursultan.class09969;
import Nursultan.class09976;
import Nursultan.class09991;
import Nursultan.class11300;
import Nursultan.class11834;
import Nursultan.class11865;
import Nursultan.class11868;
import Nursultan.class11938;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.time.Duration;

public class class11857
extends Record
implements class11868 {
    public String text;
    public static Object y_0;
    public static Object y_1;
    public static Object y_2;
    public static Object y_3;
    public static Object y_4;
    public static Object y_5;

    private static void M() {
        y_0 = 14;
        y_1 = Float.valueOf(14.0f);
        y_2 = null;
        y_3 = null;
        y_4 = null;
        y_5 = null;
    }

    public class11857(String string) {
        this.text = string;
    }

    static {
        class11857.M();
        y_2 = Duration.ofMillis(180L);
        class09991 class099912 = class09991.N();
        y_3 = class09991.N((class09991[])new class09991[]{class099912.i(((Integer)class09181.N_0).intValue()), class09221.N((int)14, (class09079)class09079.REGULAR)});
        y_4 = class09991.N().N(class09962.N()).y(class09962.N()).N(class09976.PARENT);
        y_5 = class09991.N().N(class09969.FLOATING).N(0.0f, 0.0f);
    }

    public boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class11857.class, "text", "text"}, this, object);
    }

    public String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class11857.class, "text", "text"}, this);
    }

    public int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class11857.class, "text", "text"}, this);
    }

    public String y() {
        return this.text;
    }

    @Override
    public class09798 N(class09809 class098092, class11834 class118342) {
        String string = "notifyText-" + class118342.N();
        class11865 class118652 = (class11865)class098092.u(string + "-slide", class11865::new);
        class118652.N(this.text);
        float f = class118652.i();
        boolean bl = class118652.M();
        return class09778.N((class09991)((class09991)y_4), class097843 -> {
            class09991 class099912;
            class097843.N(string + "-clip");
            if (bl) {
                class099912 = class09991.N((class09991[])new class09991[]{(class09991)y_5, class09991.N().m(-14.0f * f)});
                class097843.N_3(class099912, class097842 -> {
                    class097842.N(string + "-old");
                    class097842.y(class098012 -> ((class09801)class098012.N(string + "-oldText")).L(class118652.y()).N(class11857.N(1.0f - f)));
                });
            }
            class099912 = bl ? class09991.N().m(14.0f * (1.0f - f)) : class09991.N();
            class097843.N_3(class099912, class097842 -> {
                class097842.N(string + "-current");
                class097842.y(class098012 -> ((class09801)class098012.N(string + "-currentText")).L(this.text).N(class11857.N(bl ? f : 1.0f)));
            });
        });
    }

    @Override
    public float N() {
        return class11938.i().N(this.text, 14.0f, class09079.REGULAR);
    }

    private static class09991 N(float f) {
        if (f >= 1.0f) {
            return (class09991)y_3;
        }
        return class09991.N((class09991[])new class09991[]{(class09991)y_3, class09991.N().i(class11300.u((int)((Integer)class09181.N_0), (float)f))});
    }
}

