/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09662
 *  Nursultan.class09785
 *  Nursultan.class09788
 *  Nursultan.class09793
 *  Nursultan.class09798
 *  Nursultan.class09809
 *  Nursultan.class09904
 *  Nursultan.class09962
 *  Nursultan.class09975
 *  Nursultan.class09991
 *  Nursultan.class11292
 *  Nursultan.class11598
 *  Nursultan.class11609
 *  Nursultan.class11613
 *  Nursultan.class11623
 *  Nursultan.class11854
 *  Nursultan.class11938
 *  minecraft.class06202
 *  minecraft.class08844
 *  org.joml.Vector2f
 *  org.joml.Vector4f
 */
package Nursultan;

import Nursultan.class09181;
import Nursultan.class09182;
import Nursultan.class09194;
import Nursultan.class09203;
import Nursultan.class09210;
import Nursultan.class09222;
import Nursultan.class09228;
import Nursultan.class09662;
import Nursultan.class09785;
import Nursultan.class09788;
import Nursultan.class09793;
import Nursultan.class09798;
import Nursultan.class09809;
import Nursultan.class09904;
import Nursultan.class09962;
import Nursultan.class09975;
import Nursultan.class09991;
import Nursultan.class11292;
import Nursultan.class11598;
import Nursultan.class11609;
import Nursultan.class11613;
import Nursultan.class11623;
import Nursultan.class11854;
import Nursultan.class11938;
import java.util.Objects;
import minecraft.class06202;
import minecraft.class08844;
import org.joml.Vector2f;
import org.joml.Vector4f;

public class class09193 {
    public static Object N_0;
    public static Object N_1;
    public static Object N_2;
    public static Object N_3;
    public static Object N_4;
    public Object y_0;
    public Object y_1;
    public Object y_2;
    public Object y_3;
    public Object y_4;

    public static void L() {
        class09785 class097852 = (class09785)((class09193)class09193.N_1).y_3;
        if (class097852 == null) {
            return;
        }
        class097852.N((Object)((Boolean)class097852.L() == false ? 1 : 0));
    }

    private class09193() {
        this.W();
        this.y_0 = new class09793();
    }

    static {
        class09193.z();
        N_1 = new class09193();
        Objects.requireNonNull(N_1);
        N_2 = ((class09193)N_1)::N;
        N_3 = new class11854[]{class11854.COMBAT, class11854.MOVEMENT, class11854.VISUAL, class11854.PLAYER, class11854.MISC, class11854.CONFIGS, class11854.AUTO_BUY, class11854.ACCOUNTS};
        N_4 = class09991.N().N(class09962.y((float)1196.0f)).y(class09962.y((float)750.0f)).j(10.0f).y(((Integer)class09181.L_1).intValue()).v(20.0f).L(class09662.N((int)-16777216, (float)0.2f)).u(((Integer)class09181.L_2).intValue()).z(1.0f).N(class09975.ROW).Z(16.0f);
    }

    private static void z() {
        N_0 = "menu";
        N_1 = null;
        N_2 = null;
        N_3 = null;
        N_4 = null;
    }

    public static class09904 u() {
        class09904 class099042 = (class09904)((class09793)((class09193)class09193.N_1).y_0).N();
        if (class099042 == null || class099042.K() == null) {
            return null;
        }
        return class099042;
    }

    public static Vector2f y() {
        if ((class09785)((class09193)class09193.N_1).y_1 == null) {
            return null;
        }
        Vector4f vector4f = (Vector4f)((class09785)((class09193)class09193.N_1).y_1).L();
        if (vector4f == null) {
            return null;
        }
        return new Vector2f(vector4f.x(), vector4f.y());
    }

    private static void N(class09785<Vector4f> class097852, boolean bl) {
        if (bl) {
            return;
        }
        Vector4f vector4f = (Vector4f)class097852.L();
        if (vector4f == null) {
            return;
        }
        if (class11938.w() == null) {
            return;
        }
        class08844 class088442 = class06202.Nq().Nt();
        float f = class09222.L();
        float f2 = (float)Math.max(1, class088442.U()) / f;
        float f3 = (float)Math.max(1, class088442.E()) / f;
        float f4 = class11623.N((float)vector4f.x, (float)f2, (float)1196.0f);
        float f5 = class11623.N((float)vector4f.y, (float)f3, (float)750.0f);
        if (f4 == vector4f.z && f5 == vector4f.w) {
            return;
        }
        vector4f.z = f4;
        vector4f.w = f5;
        class097852.N((Object)vector4f);
    }

    public static boolean N() {
        class09785 class097852 = (class09785)((class09193)class09193.N_1).y_4;
        return class097852 != null && !((String)class097852.L()).isEmpty();
    }

    public static void N(int n) {
        class09785 class097852 = (class09785)((class09193)class09193.N_1).y_2;
        if (class097852 == null || n < 0 || n >= ((class11854[])N_3).length) {
            return;
        }
        class097852.N((Object)((class11854[])N_3)[n]);
    }

    private class09798 N(class09785<class11854> class097852, class09809 class098092) {
        class09785 class097853 = class098092.N("menuPos", () -> {
            Vector2f vector2f = ((class11292)class11938.M().N(class11292.class)).L();
            if (vector2f == null) {
                return null;
            }
            return new Vector4f(vector2f.x, vector2f.y, vector2f.x, vector2f.y);
        });
        this.y_1 = class097853;
        class09785 class097854 = class098092.N("menuDrag", (Object)false);
        class09785 class097855 = class098092.N("menuOffset", (Object)new Vector2f());
        class09785 class097856 = class098092.N("menuCategory", (Object)class11854.COMBAT);
        class09785 class097857 = class098092.y("nursultan:clientSettingsOpened", (Object)false);
        class09785 class097858 = class098092.y("nursultan:openModuleSettings", (Object)"");
        class09785 class097859 = class098092.y("nursultan:searchQuery", (Object)"");
        class09785 class0978510 = class098092.N("searchCategory", (Object)((class11854)class097856.L()));
        if (class0978510.L() != class097856.L()) {
            class0978510.N((Object)((class11854)class097856.L()));
            if (!((String)class097859.L()).isEmpty()) {
                class097859.N((Object)"");
            }
        }
        this.y_2 = class097856;
        this.y_3 = class097857;
        this.y_4 = class097858;
        class09193.N((class09785<Vector4f>)class097853, (Boolean)class097854.L());
        return class098092.N("draggableMenu", (class09788)class11609.N_0, (Object)new class11613("menu", (class09793)this.y_0, (class09991)N_4, class11609.N((class09785)class097853), class097854, class097855, (class11598)((class11623)class11623.L_0), (class097842, class098093) -> {
            class097842.y(class098092.N("sidebar", (class09788)class09210.N_0, (Object)class097856));
            class097842.y(class098092.N("main", (class09788)class09203.L_0, (Object)class097856));
            class097842.y(class098092.N("accountModal", (class09788)class09228.M_0, null));
            class097842.y(class098092.N("deleteAccountsModal", (class09788)class09182.R_0, null));
            class097842.y(class098092.N("sharePresetModal", (class09788)class09194.u_0, null));
        }));
    }

    private void W() {
    }
}

