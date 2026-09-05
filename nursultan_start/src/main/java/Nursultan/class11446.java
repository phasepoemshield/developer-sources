/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.Notifications
 *  Nursultan.class11067
 *  Nursultan.class11403
 *  Nursultan.class11807
 *  Nursultan.class11849
 *  Nursultan.class11857
 *  Nursultan.class11868
 *  Nursultan.class11875
 *  Nursultan.class11938
 *  Nursultan.class12020
 *  it.unimi.dsi.fastutil.objects.Object2IntMap
 *  it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap
 */
package Nursultan;

import Nursultan.Notifications;
import Nursultan.class11067;
import Nursultan.class11403;
import Nursultan.class11807;
import Nursultan.class11849;
import Nursultan.class11857;
import Nursultan.class11868;
import Nursultan.class11875;
import Nursultan.class11938;
import Nursultan.class12020;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;

public class class11446
extends class11807<Notifications> {
    public static Object y_0;
    public Object L_0;

    public class11446(Notifications notifications, String string, boolean bl) {
        super((Object)notifications, string, bl);
        this.N();
        this.L_0 = new Object2IntOpenHashMap();
    }

    static {
        class11446.R();
    }

    public void y(Object object) {
        this.N();
        if (object instanceof class11403) {
            class11067 class110672 = ((class11403)object).N();
            if (!class110672.R().N()) {
                return;
            }
            String string = class12020.N((String)(class110672.U() ? "module-enabled" : "module-disabled")).formatted(new Object[]{class110672.L()});
            int n = class11938.g().N(((Object2IntMap)this.L_0).getInt((Object)class110672), (T class118342) -> class118342.N((class11849)new class11875(() -> ((class11067)class110672).U())).y((class11868)new class11857(string)), (T class118522) -> class118522.y().N((class11849)new class11875(() -> ((class11067)class110672).U())).N((class11868)new class11857(string)).N(3000L));
            ((Object2IntMap)this.L_0).put((Object)class110672, n);
        }
    }

    private void N() {
    }

    private static void R() {
        y_0 = 3000L;
    }
}

