/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09743
 *  Nursultan.class09778
 *  Nursultan.class09784
 *  Nursultan.class09785
 *  Nursultan.class09788
 *  Nursultan.class09793
 *  Nursultan.class09798
 *  Nursultan.class09809
 *  Nursultan.class09904
 *  Nursultan.class09962
 *  Nursultan.class09991
 *  Nursultan.class09994
 *  Nursultan.class11292
 *  Nursultan.class11609
 *  Nursultan.class11613
 *  Nursultan.class11616
 *  Nursultan.class11633
 *  Nursultan.class11644
 *  Nursultan.class11938
 *  minecraft.class04995
 *  minecraft.class06202
 *  minecraft.class08844
 *  org.joml.Vector2f
 *  org.joml.Vector4f
 */
package Nursultan;

import Nursultan.class09743;
import Nursultan.class09778;
import Nursultan.class09784;
import Nursultan.class09785;
import Nursultan.class09788;
import Nursultan.class09793;
import Nursultan.class09798;
import Nursultan.class09809;
import Nursultan.class09904;
import Nursultan.class09962;
import Nursultan.class09991;
import Nursultan.class09994;
import Nursultan.class11292;
import Nursultan.class11609;
import Nursultan.class11613;
import Nursultan.class11616;
import Nursultan.class11633;
import Nursultan.class11644;
import Nursultan.class11748;
import Nursultan.class11753;
import Nursultan.class11760;
import Nursultan.class11761;
import Nursultan.class11763;
import Nursultan.class11938;
import java.util.Objects;
import minecraft.class04995;
import minecraft.class06202;
import minecraft.class08844;
import org.joml.Vector2f;
import org.joml.Vector4f;

public abstract class class11769 {
    public Object B_0;
    public Object B_1;
    public Object B_2;
    public Object Z_0;
    public Object Z_1;
    public Object Z_2;
    public Object Z_3;
    public Object Z_4;
    public Object Z_5;
    public Object Z_6;
    public Object Z_7;
    public boolean Z_init;
    public static Object z_0;
    public static Object z_1;
    public static Object z_2;
    public static Object z_3;
    public static Object z_4;

    public class11763 L() {
        return (class11763)((Object)this.Z_7) != null ? (class11763)((Object)this.Z_7) : class11763.LEFT;
    }

    public void M() {
        Vector2f vector2f = this.U();
        this.Z_7 = (Boolean)this.Z_1 != false ? class11763.N(vector2f.x, class11769.B()) : null;
        this.N(vector2f.x, vector2f.y);
    }

    public void P() {
        if ((class09785)this.Z_6 == null) {
            return;
        }
        int n = (Integer)z_4 + 1;
        z_4 = n;
        int n2 = n;
        if (((class09785)this.Z_6).L() != null && (Integer)((class09785)this.Z_6).L() == n2) {
            return;
        }
        ((class09785)this.Z_6).N((Object)n2);
    }

    public class11769(class09788<Void> class097882) {
        this.t();
        this.Z_2 = new class09793();
        this.Z_3 = new class09793();
        class11761 class117612 = Objects.requireNonNull(this.getClass().getAnnotation(class11761.class), "The hud component should be annotated @HudComponentTag");
        this.B_1 = class117612.u();
        float defX = class117612.i();
        float defY = class117612.N();
        if ("cooldowns".equals(this.B_1)) {
            defX = 10.0f;
            defY = 169.0f;
        } else if ("inventory".equals(this.B_1)) {
            defX = 10.0f;
            defY = 220.0f;
        } else if ("effects".equals(this.B_1)) {
            defX = 10.0f;
            defY = 118.0f;
        } else if ("hotkeys".equals(this.B_1)) {
            defX = 10.0f;
            defY = 65.0f;
        } else if ("targetInfo".equals(this.B_1)) {
            defX = 200.0f;
            defY = 40.0f;
        }
        this.B_2 = new Vector2f(defX, defY);
        this.Z_0 = class117612.y();
        this.Z_1 = class117612.L();
        this.B_0 = class097882;
        this.Z_4 = new class11760(class117612.u());
        class11938.L().y((Object)this);
    }

    static {
        class11769.j();
        z_0 = class09991.N().N(class09962.N()).y(class09962.N());
        class09991 class099912 = class09991.N().l(1.0f);
        z_1 = class09991.N((class09991[])new class09991[]{(class09991)z_0, class099912.N(class09994.s((class09743)((class09743)class11644.N_0)))});
        class09991 class099913 = class09991.N().l(0.0f);
        z_2 = class09991.N((class09991[])new class09991[]{(class09991)z_0, class099913.N(class09994.s((class09743)((class09743)class11644.N_0)))});
        z_3 = class09991.N().N(false);
    }

    public static float B() {
        class11753 class117532 = class11938.i();
        float f = class117532 != null ? class117532.u() : 1.0f;
        return (float)Math.max(1, class06202.Nq().Nt().U()) / f;
    }

    public class09788<Void> Z() {
        return this::N;
    }

    public class09793<class09904> i() {
        return (class09793)this.Z_3;
    }

    public boolean s() {
        return (class11616)this.Z_0 != class11616.NONE && class11753.y() && this.N();
    }

    public Vector2f m() {
        if ((class09785)this.Z_5 == null) {
            return null;
        }
        Vector4f vector4f = (Vector4f)((class09785)this.Z_5).L();
        return new Vector2f(vector4f.x(), vector4f.y());
    }

    private void t() {
        if (!this.Z_init) {
            this.Z_init = true;
            this.Z_1 = false;
        }
    }

    private static void j() {
        z_0 = null;
        z_1 = null;
        z_2 = null;
        z_3 = null;
        z_4 = 0;
    }

    public Vector2f U() {
        return (Vector2f)this.B_2;
    }

    public class09991 z() {
        return class09991.N;
    }

    public static float u() {
        class11753 class117532 = class11938.i();
        float f = class117532 != null ? class117532.u() : 1.0f;
        return (float)Math.max(1, class06202.Nq().Nt().E()) / f;
    }

    public boolean y() {
        return true;
    }

    private void y(boolean bl) {
        if (!((Boolean)this.Z_1).booleanValue() || (class09785)this.Z_5 == null) {
            return;
        }
        Vector4f vector4f = (Vector4f)((class09785)this.Z_5).L();
        if (vector4f == null) {
            return;
        }
        if ((class11763)((Object)this.Z_7) == null) {
            class11763 class117632 = ((class11292)class11938.M().N(class11292.class)).N((String)this.B_1);
            this.Z_7 = class117632 != null ? class117632 : class11763.N(vector4f.x, class11769.B());
            return;
        }
        if (!bl || !((class11616)this.Z_0).y()) {
            return;
        }
        class09904 class099042 = (class09904)((class09793)this.Z_2).N();
        if (class099042 == null || class099042.K() == null) {
            return;
        }
        float f = class099042.c().u();
        if (f <= 0.0f) {
            return;
        }
        class11763 class117633 = class11763.N(vector4f.x + (0.5f - ((class11763)((Object)this.Z_7)).N()) * f, class11769.B());
        if (class117633 == (class11763)((Object)this.Z_7)) {
            return;
        }
        float f2 = (class117633.N() - ((class11763)((Object)this.Z_7)).N()) * f;
        this.Z_7 = class117633;
        vector4f.x += f2;
        vector4f.z += f2;
        ((class09785)this.Z_5).N((Object)vector4f);
    }

    public String E() {
        return (String)this.B_1;
    }

    public boolean N() {
        return true;
    }

    public void N(float f, float f2) {
        if ((class09785)this.Z_5 != null) {
            ((class09785)this.Z_5).N((Object)((Vector4f)((class09785)this.Z_5).L()).set(f, f2, f, f2));
        }
    }

    private class09798 N(Void void_, class09809 class098093) {
        this.Z_5 = class098093.N((String)this.B_1 + "Position", () -> {
            Vector2f vector2f = ((class11292)class11938.M().N(class11292.class)).L((String)this.B_1);
            Vector2f vector2f2 = this.U();
            float f = vector2f != null && ((class11616)this.Z_0).y() ? vector2f.x : vector2f2.x;
            float f2 = vector2f != null && ((class11616)this.Z_0).N() ? vector2f.y : vector2f2.y;
            return new Vector4f(f, f2, f, f2);
        });
        this.Z_6 = class098093.N((String)this.B_1 + "ZIndex", (Object)0);
        class09785 class097852 = class098093.N((String)this.B_1 + "Dragging", (Object)false);
        class09785 class097853 = class098093.N((String)this.B_1 + "DragOffset", (Object)new Vector2f());
        this.y((Boolean)class097852.L());
        this.N((Boolean)class097852.L());
        if (!this.y()) {
            return class09778.N(class097842 -> ((class09784)class097842.N((String)this.B_1 + "Draggable")).N((class09991)z_3));
        }
        class098093.L("chatOpened", class11753::y);
        return class098093.N((String)this.B_1 + "Draggable", (class09788)class11609.N_0, (Object)new class11613((String)this.B_1, (class09793)this.Z_2, class11769.N((Integer)((class09785)this.Z_6).L(), this.N(), this.z(), this.L().y()), class11609.N((class09785)((class09785)this.Z_5)), class097852, class097853, class11633.N((class11616)((class11616)this.Z_0)), (class097842, class098092) -> {
            class097842.y(((class11760)this.Z_4).N((class09809)class098092, this, (class09785<Boolean>)class097852, class098092.N((String)this.B_1 + "Content", (class09788)this.B_0, (Void)null)));
            class097842.y(class11748.N(class098092, this));
        }));
    }

    private static class09991 N(int n, boolean bl, class09991 class099912, class09991 class099913) {
        class09991 class099914 = bl ? (class09991)z_1 : (class09991)z_2;
        return class09991.N((class09991[])new class09991[]{class099914, class099912, class099913, class09991.N().N(n)});
    }

    private void N(boolean bl) {
        if (bl || (class09785)this.Z_5 == null) {
            return;
        }
        Vector4f vector4f = (Vector4f)((class09785)this.Z_5).L();
        if (vector4f == null) {
            return;
        }
        class11753 class117532 = class11938.i();
        if (class117532 == null) {
            return;
        }
        class09904 class099042 = (class09904)((class09793)this.Z_2).N();
        if (class099042 == null || class099042.K() == null) {
            return;
        }
        float f = class099042.c().u();
        float f2 = class099042.c().i();
        if (f <= 0.0f || f2 <= 0.0f) {
            return;
        }
        class08844 class088442 = class06202.Nq().Nt();
        float f3 = class117532.u();
        float f4 = Math.max(0.0f, (float)Math.max(1, class088442.U()) / f3 - f);
        float f5 = Math.max(0.0f, (float)Math.max(1, class088442.E()) / f3 - f2);
        float f6 = this.L().N() * f;
        float f7 = class04995.N((float)vector4f.x, (float)f6, (float)(f4 + f6));
        float f8 = class04995.N((float)vector4f.y, (float)0.0f, (float)f5);
        if (f7 == vector4f.z && f8 == vector4f.w) {
            return;
        }
        vector4f.z = f7;
        vector4f.w = f8;
        ((class09785)this.Z_5).N((Object)vector4f);
    }

    public boolean W() {
        if (!this.s()) {
            return false;
        }
        class09904 class099042 = (class09904)((class09793)this.Z_2).N();
        return class099042 != null && class099042.E();
    }

    public Vector4f R() {
        if (!this.y() || !this.N()) {
            return null;
        }
        class09904 class099042 = (class09904)((class09793)this.Z_2).N();
        if (class099042 == null || class099042.K() == null) {
            return null;
        }
        float f = class099042.c().u();
        float f2 = class099042.c().i();
        if (f <= 0.0f || f2 <= 0.0f) {
            return null;
        }
        return new Vector4f(class099042.c().y(), class099042.c().L(), f, f2);
    }
}

