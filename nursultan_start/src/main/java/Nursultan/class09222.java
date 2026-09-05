/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09064
 *  Nursultan.class09065
 *  Nursultan.class09079
 *  Nursultan.class09080
 *  Nursultan.class09086
 *  Nursultan.class09093
 *  Nursultan.class09097
 *  Nursultan.class09667
 *  Nursultan.class09770
 *  Nursultan.class09773
 *  Nursultan.class09778
 *  Nursultan.class09781
 *  Nursultan.class09784
 *  Nursultan.class09788
 *  Nursultan.class09791
 *  Nursultan.class09803
 *  Nursultan.class09804
 *  Nursultan.class09820
 *  Nursultan.class09832
 *  Nursultan.class09833
 *  Nursultan.class09843
 *  Nursultan.class09857
 *  Nursultan.class09868
 *  Nursultan.class09869
 *  Nursultan.class09898
 *  Nursultan.class09904
 *  Nursultan.class09936
 *  Nursultan.class09991
 *  Nursultan.class10049
 *  Nursultan.class10983
 *  Nursultan.class10989
 *  Nursultan.class11303
 *  Nursultan.class11307
 *  Nursultan.class11376
 *  Nursultan.class11381
 *  Nursultan.class11388
 *  Nursultan.class11389
 *  Nursultan.class11391
 *  Nursultan.class11403
 *  Nursultan.class11594
 *  Nursultan.class11725
 *  Nursultan.class11736
 *  Nursultan.class11742
 *  Nursultan.class11749
 *  Nursultan.class11777
 *  Nursultan.class11782
 *  Nursultan.class11887
 *  Nursultan.class11903
 *  Nursultan.class11905
 *  Nursultan.class11925
 *  Nursultan.class11934
 *  Nursultan.class11938
 *  minecraft.class00392
 *  minecraft.class00405
 *  minecraft.class00623
 *  minecraft.class00647
 *  minecraft.class05096
 *  minecraft.class06202
 *  minecraft.class06220
 *  minecraft.class06428
 *  minecraft.class07533
 *  minecraft.class07536
 *  minecraft.class08066
 *  minecraft.class08844
 *  org.joml.Vector2i
 */
package Nursultan;

import Nursultan.class09064;
import Nursultan.class09065;
import Nursultan.class09079;
import Nursultan.class09080;
import Nursultan.class09086;
import Nursultan.class09093;
import Nursultan.class09097;
import Nursultan.class09180;
import Nursultan.class09181;
import Nursultan.class09193;
import Nursultan.class09197;
import Nursultan.class09205;
import Nursultan.class09211;
import Nursultan.class09216;
import Nursultan.class09221;
import Nursultan.class09667;
import Nursultan.class09770;
import Nursultan.class09773;
import Nursultan.class09778;
import Nursultan.class09781;
import Nursultan.class09784;
import Nursultan.class09788;
import Nursultan.class09791;
import Nursultan.class09803;
import Nursultan.class09804;
import Nursultan.class09820;
import Nursultan.class09832;
import Nursultan.class09833;
import Nursultan.class09843;
import Nursultan.class09857;
import Nursultan.class09868;
import Nursultan.class09869;
import Nursultan.class09898;
import Nursultan.class09904;
import Nursultan.class09936;
import Nursultan.class09991;
import Nursultan.class10049;
import Nursultan.class10983;
import Nursultan.class10989;
import Nursultan.class11303;
import Nursultan.class11307;
import Nursultan.class11376;
import Nursultan.class11381;
import Nursultan.class11388;
import Nursultan.class11389;
import Nursultan.class11391;
import Nursultan.class11403;
import Nursultan.class11594;
import Nursultan.class11725;
import Nursultan.class11736;
import Nursultan.class11742;
import Nursultan.class11749;
import Nursultan.class11777;
import Nursultan.class11782;
import Nursultan.class11887;
import Nursultan.class11903;
import Nursultan.class11905;
import Nursultan.class11925;
import Nursultan.class11934;
import Nursultan.class11938;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.time.Duration;
import minecraft.class00392;
import minecraft.class00405;
import minecraft.class00623;
import minecraft.class00647;
import minecraft.class05096;
import minecraft.class06202;
import minecraft.class06220;
import minecraft.class06428;
import minecraft.class07533;
import minecraft.class07536;
import minecraft.class08066;
import minecraft.class08844;
import org.joml.Vector2i;

public class class09222 {
    public Object N_0;
    public Object N_1;
    public Object N_2;
    public Object N_3;
    public Object N_4;
    public Object N_5;
    public Object N_6;
    public Object N_7;
    public static Object y_0;
    public static Object y_1;
    public static Object y_2;
    public static Object y_3;
    public static Object y_4;
    public Object L_0;
    public Object L_1;
    public Object L_2;
    public boolean L_init;
    public static Object u_0;
    public static Object u_1;
    public static Object u_2;
    public static Object u_3;

    public static float L() {
        return ((class09781)class11938.w().N_6).u().N();
    }

    private boolean L(class11389 class113892) {
        class09904 class099042 = ((class09781)this.N_6).i().L();
        if (class099042 == null || class099042.y() != class10049.INPUT) {
            return false;
        }
        int n = class113892.z();
        if (n == 256 || n == 257 || n == 335) {
            boolean bl = class113892.L();
            ((class09781)this.N_6).i().N(class113892.z(), class113892.B() || bl, class11307.N((int)class113892.R()), bl);
            ((class09781)this.N_6).i().R();
            return true;
        }
        return false;
    }

    private void T() {
        Vector2i vector2i = class11307.N((double)((class06220)((class06202)this.N_0).L_2).i(), (double)((class06220)((class06202)this.N_0).L_2).R());
        ((class09781)this.N_6).i().N((float)vector2i.x(), (float)vector2i.y());
    }

    public class09222() {
        this.s();
        this.N_0 = class06202.Nq();
        this.N_1 = class09097.i(() -> Math.max(1, ((class06202)this.N_0).Nt().U()), () -> Math.max(1, ((class06202)this.N_0).Nt().E()));
        this.N_2 = new class11934(class11903.FORWARDS);
        this.N_3 = new class09205();
        class11742 class117422 = class11938.O();
        class117422.N("menu", "icons/atlases/menu");
        this.N_4 = new class11749(class117422);
        class11725 class117252 = new class11725();
        this.N_6 = new class09781((class09803)new class11594(), (class09868)class117252, (class09667)new class11736((class09868)class117252));
        class117252.N(((class09781)this.N_6).u());
        this.N_7 = new class09832((class09781)this.N_6);
        this.N_5 = class09843.N((class09832)((class09832)this.N_7), (String)"root", (void_, class098092) -> {
            int n = (Integer)class098092.L("accent", class09181::N);
            return class098092.N((class09804)class09211.N_6, (Object)class09211.N(n), () -> ((class09784)class09778.y().N((class09991)class09180.N_1)).N(new Object[]{class098092.N("menu", (class09788)class09193.N_2, null)}));
        }, null);
        ((class09781)this.N_6).i().N(((class09843)this.N_5).N().y());
        class11938.L().y((Object)this);
        this.u();
    }

    static {
        class09222.E();
        y_0 = Duration.ofMillis(250L);
        y_4 = new class09079[]{class09079.REGULAR, class09079.MEDIUM, class09079.SEMI_BOLD, class09079.BOLD};
    }

    private void B() {
        boolean bl = this.U();
        if ((Boolean)this.L_1 == bl) {
            return;
        }
        this.L_1 = bl;
        if (bl) {
            class06428.y();
        } else {
            class06428.N();
        }
    }

    private boolean i(class11389 class113892) {
        Object object;
        class09904 class099042;
        class09857 class098572 = class11307.N((int)class113892.R());
        if (!(class07536.m() == class07533.field_1137 ? class098572.u() : class098572.N())) {
            return false;
        }
        int n = class113892.z();
        if (n >= 49 && n <= 57) {
            class09193.N(n - 49);
            return true;
        }
        if (((Boolean)class11938.L_3).booleanValue() && n == 295) {
            try {
                class099042 = ((class09843)this.N_5).N().y(class09791.N().N(true));
                object = class09820.y((class09773)class099042);
                Path path = Path.of("ui_dump_" + System.currentTimeMillis() + ".json", new String[0]);
                Files.writeString(path, (CharSequence)object, StandardCharsets.UTF_8, new OpenOption[0]);
                class00405 class004052 = class00405.N.N((class00647)new class00623(path.toAbsolutePath().toString()));
                class11303.N((Object)class00392.y((String)"Menu dumped ").y((class00392)class00392.y((String)path.getFileName().toString()).L(class004052)));
            }
            catch (Exception exception) {
                // empty catch block
            }
        }
        if (n == 70) {
            class099042 = class09216.N();
            if (class099042 != null) {
                object = ((class09781)this.N_6).i();
                if (object.L() == class099042) {
                    object.R();
                } else {
                    object.L(class099042);
                }
            }
            return true;
        }
        if (n == 44) {
            class09193.L();
            return true;
        }
        return false;
    }

    public static boolean i() {
        class09222 class092222 = class11938.w();
        return class092222 != null && (Boolean)class092222.L_0 != false;
    }

    private void s() {
        if (!this.L_init) {
            this.L_init = true;
            this.L_0 = false;
            this.L_1 = false;
            this.L_2 = 0L;
        }
    }

    private void t() {
        ((class09781)this.N_6).i().N(0, false);
        this.L_0 = false;
        this.L_2 = 0L;
        ((class11934)this.N_2).N(0.0, (Duration)y_0, (class11887)class11905.u_4);
        if ((class05096)((class06202)this.N_0).v_3 == null) {
            ((class06220)((class06202)this.N_0).L_2).Z();
        }
    }

    private boolean U() {
        if (!((Boolean)this.L_0).booleanValue()) {
            return false;
        }
        class09904 class099042 = ((class09781)this.N_6).i().L();
        return class099042 != null && class099042.y() == class10049.INPUT;
    }

    private void z() {
        ((class09832)this.N_7).N(((class09832)this.N_7).y().N(240.0f).N(new class09833(true, 1100.0f, 16.0f, 4.0f)));
        this.L_2 = 0L;
        this.L_0 = true;
        ((class11934)this.N_2).N(1.0, (Duration)y_0, (class11887)class11905.u_4);
        ((class09843)this.N_5).y();
    }

    private boolean z(int n) {
        return switch (n) {
            case 256 -> {
                this.t();
                yield true;
            }
            case 301 -> {
                if (!((Boolean)class11938.L_3).booleanValue()) {
                    yield false;
                }
                this.W();
                yield true;
            }
            default -> false;
        };
    }

    public void u() {
        class09093 class090932 = class09080.u();
        for (class09079 class090792 : (class09079[])y_4) {
            class090932.N(1.0f, class090792, false);
        }
        class090932.u();
    }

    private void u(class11389 class113892) {
        class09869 class098692 = ((class09781)this.N_6).i();
        switch (((int[])class09197.N_0)[class113892.Z().ordinal()]) {
            case 1: {
                this.T();
                if (class113892.B()) {
                    class098692.N(class113892.z(), true);
                } else if (class113892.M()) {
                    class098692.N(class113892.z(), false);
                }
                class113892.N();
                break;
            }
            case 2: {
                boolean bl = class113892.L();
                class098692.N(class113892.z(), class113892.B() || bl, class11307.N((int)class113892.R()), bl);
                if (!class09222.y()) break;
                class113892.N();
            }
        }
    }

    public static boolean y() {
        class09222 class092222 = class11938.w();
        if (class092222 == null) {
            return false;
        }
        return class092222.U();
    }

    private boolean y(class11389 class113892) {
        if (!((Boolean)this.L_0).booleanValue()) {
            return false;
        }
        if (!class113892.B()) {
            return false;
        }
        if (this.L(class113892)) {
            class113892.N();
            return true;
        }
        if (this.i(class113892)) {
            class113892.N();
            return true;
        }
        if (this.z(class113892.z())) {
            class113892.N();
            return true;
        }
        return false;
    }

    private static void E() {
        u_0 = 240;
        u_1 = 1100;
        u_2 = 16;
        u_3 = 4;
        y_0 = null;
        y_1 = Float.valueOf(0.85f);
        y_2 = Float.valueOf(0.95f);
        y_3 = Float.valueOf(0.9f);
        y_4 = null;
    }

    @class11782(y=class11777.BEFORE)
    public void N(class11389 class113892) {
        if (class113892.y()) {
            return;
        }
        if (class113892.Z().N(class11381.KEYBOARD) && this.y(class113892)) {
            return;
        }
        if (((Boolean)this.L_0).booleanValue()) {
            this.u(class113892);
        }
    }

    @class11782
    public void N(class11391 class113912) {
        if (!((Boolean)this.L_0).booleanValue()) {
            return;
        }
        ((class09781)this.N_6).i().N(class113912.L());
        class113912.N();
    }

    @class11782
    public void N(class10983 class109832) {
        ((class09843)this.N_5).y();
    }

    public static void N() {
        class09222 class092222 = class11938.w();
        if (class092222 == null) {
            return;
        }
        if (((Boolean)class092222.L_0).booleanValue()) {
            class092222.t();
            return;
        }
        ((class06220)((class06202)class092222.N_0).L_2).z();
        class092222.z();
    }

    @class11782
    public void N(class11376 class113762) {
        if (!((Boolean)this.L_0).booleanValue()) {
            return;
        }
        ((class09781)this.N_6).i().N((float)class113762.L());
        class113762.N();
    }

    public static void N(float f) {
        class09222 class092222 = class11938.w();
        ((class09781)class092222.N_6).u().N(f);
        ((class09843)class092222.N_5).y();
    }

    public static float N(String string, float f, class09079 class090792) {
        return ((class09781)class11938.w().N_6).y().N(string, f, class09221.N(class090792));
    }

    @class11782
    public void N(class11403 class114032) {
        if (((Boolean)this.L_0).booleanValue()) {
            ((class09843)this.N_5).y();
        }
    }

    @class11782
    public void N(class11388 class113882) {
        if (((Boolean)this.L_0).booleanValue()) {
            class113882.N();
        }
    }

    @class11782(y=class11777.AFTER_ALL)
    public void N(class10989 class109892) {
        this.B();
        ((class11934)this.N_2).N();
        float f = ((class11934)this.N_2).E().floatValue();
        if (!((Boolean)this.L_0).booleanValue() && !((class11934)this.N_2).M()) {
            return;
        }
        class08844 class088442 = ((class06202)this.N_0).Nt();
        int n = Math.max(1, class088442.U());
        int n2 = Math.max(1, class088442.E());
        this.T();
        long l = System.nanoTime();
        float f2 = (Long)this.L_2 == 0L ? 0.0f : Math.max(0.0f, (float)(l - (Long)this.L_2) / 1.0E9f);
        this.L_2 = l;
        class09936 class099362 = ((class09843)this.N_5).N(n, n2, f2);
        class11938.k().N(class109892.y());
        float f3 = ((class09781)this.N_6).u().N();
        if (f < 0.999f) {
            class09086 class090862 = ((class09065)class09065.y_0).L((class09064)this.N_1);
            ((class11749)this.N_4).N(class109892.y(), class099362, f3, class090862);
            if (((Boolean)class11938.L_3).booleanValue()) {
                class09080.i().N(300.0f, 300.0f).N(32.0f).y(0x64000000).u(4.0f).N(class09079.REGULAR).i(-6305237).y("menu " + ((class11749)this.N_4).L()).L();
            }
            class11925.N((class08066)((class06202)this.N_0).e(), (boolean)true);
            float f4 = (float)n * 0.5f;
            float f5 = (float)n2 * 0.5f;
            class09904 class099042 = ((class09843)this.N_5).N().y();
            class09904 class099043 = class09193.u();
            if (class099043 != null && class099042.c().u() > 0.0f && class099042.c().i() > 0.0f) {
                class09898 class098982 = class099043.c();
                f4 = (class098982.y() + class098982.u() * 0.5f) / class099042.c().u() * (float)n;
                f5 = (class098982.L() + class098982.i() * 0.5f) / class099042.c().i() * (float)n2;
            }
            ((class09205)this.N_3).N(((class09064)this.N_1).U(), n, n2, f4, f5, f, 0.85f, 0.95f, 0.9f);
            return;
        }
        class11925.N((class08066)((class06202)this.N_0).e(), (boolean)false);
        ((class11749)this.N_4).N(class109892.y(), class099362, f3);
        if (((Boolean)class11938.L_3).booleanValue()) {
            class09080.i().N(300.0f, 300.0f).N(32.0f).y(0x64000000).u(4.0f).N(class09079.REGULAR).i(-6305237).y("menu " + ((class11749)this.N_4).L()).L();
        }
    }

    private void W() {
        boolean bl = !((class09832)this.N_7).y().i();
        ((class09832)this.N_7).N(((class09832)this.N_7).y().N(bl).N(bl ? class09770.L() : class09770.N));
    }
}

