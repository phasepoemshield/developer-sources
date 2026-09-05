/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09079
 *  Nursultan.class09692
 *  Nursultan.class09743
 *  Nursultan.class09777
 *  Nursultan.class09778
 *  Nursultan.class09798
 *  Nursultan.class09801
 *  Nursultan.class09804
 *  Nursultan.class09809
 *  Nursultan.class09860
 *  Nursultan.class09867
 *  Nursultan.class09962
 *  Nursultan.class09973
 *  Nursultan.class09983
 *  Nursultan.class09991
 *  Nursultan.class09994
 *  Nursultan.class11300
 *  Nursultan.class11644
 *  Nursultan.class11839
 *  Nursultan.class12020
 */
package Nursultan;

import Nursultan.class09079;
import Nursultan.class09211;
import Nursultan.class09221;
import Nursultan.class09227;
import Nursultan.class09692;
import Nursultan.class09743;
import Nursultan.class09777;
import Nursultan.class09778;
import Nursultan.class09798;
import Nursultan.class09801;
import Nursultan.class09804;
import Nursultan.class09809;
import Nursultan.class09860;
import Nursultan.class09867;
import Nursultan.class09962;
import Nursultan.class09973;
import Nursultan.class09983;
import Nursultan.class09991;
import Nursultan.class09994;
import Nursultan.class11300;
import Nursultan.class11644;
import Nursultan.class11839;
import Nursultan.class12020;

public class class09218 {
    public static Object N_0;
    public static Object N_1;
    public static Object N_2;
    public static Object N_3;
    public static Object N_4;
    public static Object N_5;

    private class09218() {
    }

    static {
        class09218.N();
        class09218.R();
        N_0 = new class09218()::N;
        N_1 = class09991.N().N(class09692.N((class09994[])new class09994[]{class09994.y((class09743)((class09743)class11644.N_0)), class09994.N((class09743)((class09743)class11644.N_0))}));
        N_2 = class09991.N().N(class09692.N((class09994[])new class09994[]{class09994.L((class09743)((class09743)class11644.N_0))}));
        class09991 class099912 = class09991.N().N(class09962.y((float)229.0f)).y(class09962.y((float)50.0f)).u(20.0f).B(20.0f).N(class09983.BORDER_BOX).Z(12.0f).u(class11300.L((int)10205439, (float)0.0f));
        N_3 = class09991.N((class09991[])new class09991[]{(class09991)N_1, class099912.y(class11300.L((int)4362239, (float)0.0f)).z(1.0f).y(class09973.CENTER)});
        N_4 = class09227.N((class09211 class092112) -> class09991.N((class09991[])new class09991[]{(class09991)N_3, (class09991)N_1, class09991.N().y(class092112.y()).Z(12.0f).u(class092112.u()).z(1.0f)}));
        N_5 = class09991.N().u(24.0f, 24.0f);
    }

    private class09798 N(class11839 class118392, class09809 class098092) {
        class09211 class092112 = (class09211)class098092.N((class09804)class09211.N_6);
        boolean bl = class118392.N() == class118392.y().L();
        class09991 class099912 = class09991.N().i(bl ? class092112.M() : class11300.L((int)0xDEDEDE, (float)76.0f));
        return class09778.N((class09991)(bl ? ((class09227)N_4).N(class092112) : (class09991)N_3), (T class097842) -> {
            class097842.N("tab" + class118392.N().name());
            class097842.N(class09867.POINTER_DOWN, class09860::T);
            class097842.N_1(class098602 -> class118392.y().N((Object)class118392.N()));
            class097842.L(class097772 -> ((class09777)class097772.N("texture" + class118392.u())).L("icon:menu/" + class118392.u()).N(class09991.N((class09991[])new class09991[]{class099912, (class09991)N_2, (class09991)N_5})));
            class097842.y(class098012 -> ((class09801)class098012.N("text" + class118392.N().name())).L(class12020.N((String)class118392.L())).N(class09991.N((class09991[])new class09991[]{class099912, (class09991)N_2, class09221.N(20, class09079.REGULAR)})));
        });
    }

    private static void N() {
    }

    private static void R() {
        N_0 = null;
        N_1 = null;
        N_2 = null;
        N_3 = null;
        N_4 = null;
        N_5 = null;
    }
}

