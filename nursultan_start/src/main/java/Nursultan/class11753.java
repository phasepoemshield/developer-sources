/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09079
 *  Nursultan.class09080
 *  Nursultan.class09181
 *  Nursultan.class09211
 *  Nursultan.class09221
 *  Nursultan.class09667
 *  Nursultan.class09770
 *  Nursultan.class09773
 *  Nursultan.class09778
 *  Nursultan.class09781
 *  Nursultan.class09791
 *  Nursultan.class09803
 *  Nursultan.class09804
 *  Nursultan.class09820
 *  Nursultan.class09832
 *  Nursultan.class09833
 *  Nursultan.class09841
 *  Nursultan.class09843
 *  Nursultan.class09868
 *  Nursultan.class09869
 *  Nursultan.class09936
 *  Nursultan.class09962
 *  Nursultan.class09991
 *  Nursultan.class10982
 *  Nursultan.class10983
 *  Nursultan.class11303
 *  Nursultan.class11307
 *  Nursultan.class11376
 *  Nursultan.class11381
 *  Nursultan.class11389
 *  Nursultan.class11391
 *  Nursultan.class11594
 *  Nursultan.class11925
 *  Nursultan.class11938
 *  minecraft.class00392
 *  minecraft.class00623
 *  minecraft.class00647
 *  minecraft.class01311
 *  minecraft.class05096
 *  minecraft.class06202
 *  minecraft.class06220
 *  minecraft.class08066
 *  minecraft.class08844
 *  org.joml.Vector2i
 */
package Nursultan;

import Nursultan.class09079;
import Nursultan.class09080;
import Nursultan.class09181;
import Nursultan.class09211;
import Nursultan.class09221;
import Nursultan.class09667;
import Nursultan.class09770;
import Nursultan.class09773;
import Nursultan.class09778;
import Nursultan.class09781;
import Nursultan.class09791;
import Nursultan.class09803;
import Nursultan.class09804;
import Nursultan.class09820;
import Nursultan.class09832;
import Nursultan.class09833;
import Nursultan.class09841;
import Nursultan.class09843;
import Nursultan.class09868;
import Nursultan.class09869;
import Nursultan.class09936;
import Nursultan.class09962;
import Nursultan.class09991;
import Nursultan.class10982;
import Nursultan.class10983;
import Nursultan.class11303;
import Nursultan.class11307;
import Nursultan.class11376;
import Nursultan.class11381;
import Nursultan.class11389;
import Nursultan.class11391;
import Nursultan.class11594;
import Nursultan.class11725;
import Nursultan.class11730;
import Nursultan.class11736;
import Nursultan.class11738;
import Nursultan.class11742;
import Nursultan.class11749;
import Nursultan.class11772;
import Nursultan.class11777;
import Nursultan.class11782;
import Nursultan.class11925;
import Nursultan.class11938;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.util.List;
import minecraft.class00392;
import minecraft.class00623;
import minecraft.class00647;
import minecraft.class01311;
import minecraft.class05096;
import minecraft.class06202;
import minecraft.class06220;
import minecraft.class08066;
import minecraft.class08844;
import org.joml.Vector2i;

public class class11753 {
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
    public Object y_5;
    public Object y_6;
    public boolean y_init;

    public boolean L() {
        return class11753.y();
    }

    public class11753() {
        this.E();
        this.y_0 = class06202.Nq();
        class11742 class117422 = class11938.O();
        class117422.N("hud", "icons/atlases/hud");
        this.y_1 = new class11749(class117422);
        ((class11749)this.y_1).N(true);
        class11725 class117252 = new class11725();
        this.y_3 = new class09781((class09803)new class11594(), (class09868)class117252, (class09667)new class11736(class117252));
        class117252.N(((class09781)this.y_3).u());
        this.y_4 = new class09832((class09781)this.y_3);
        ((class09832)this.y_4).N(((class09832)this.y_4).y().N(240.0f).N(new class09833(true, 1100.0f, 16.0f, 4.0f)));
        this.y_2 = class09843.N((class09832)((class09832)this.y_4), (String)"hud", (void_, class098092) -> {
            int n = (Integer)class098092.L("accent", class09181::N);
            return class098092.N((class09804)class09211.N_6, (Object)class09211.N((int)n), () -> class09778.N((class09991)((class09991)N_4), class097842 -> {
                ((List)class11730.N_7).forEach(class117692_obj -> {
                    try {
                        class11769 class117692 = (class11769) class117692_obj;
                        class097842.y(class098092.N(class117692.E(), (class09788<Void>)class117692.Z(), (Void)null));
                    } catch (Throwable t) {
                        t.printStackTrace();
                    }
                });
                try {
                    class097842.y(class098092.N("snapGuides", (class09788<Void>)class11738::N, (Void)null));
                } catch (Throwable t) {
                    t.printStackTrace();
                }
            }));
        }, null);
        ((class09781)this.y_3).i().N(((class09843)this.y_2).N().y());
        ((class09843)this.y_2).y();
        class11938.L().y((Object)this);
    }

    static {
        class11753.R();
        N_4 = class09991.N().N(class09962.N((float)100.0f)).y(class09962.N((float)100.0f));
    }

    private void Z() {
        boolean bl = !((class09832)this.y_4).y().i();
        ((class09832)this.y_4).N(((class09832)this.y_4).y().N(bl).N(bl ? class09770.L() : class09770.N));
    }

    public class09841 i() {
        return ((class09843)this.y_2).N();
    }

    private void U() {
        Vector2i vector2i = class11307.N((double)((class06220)((class06202)this.y_0).L_2).i(), (double)((class06220)((class06202)this.y_0).L_2).R());
        ((class09781)this.y_3).i().N((float)vector2i.x(), (float)vector2i.y());
    }

    public float u() {
        return ((class09781)this.y_3).u().N();
    }

    public static boolean y() {
        return (class05096)class06202.Nq().v_3 instanceof class01311;
    }

    private void y(class11389 class113892) {
        class09869 class098692 = ((class09781)this.y_3).i();
        switch (((int[])class11772.N_0)[class113892.Z().ordinal()]) {
            case 1: {
                this.U();
                if (class113892.B()) {
                    class098692.N(class113892.z(), true);
                    break;
                }
                if (!class113892.M()) break;
                class098692.N(class113892.z(), false);
                break;
            }
            case 2: {
                boolean bl = class113892.L();
                class098692.N(class113892.z(), class113892.B() || bl, class11307.N((int)class113892.R()), bl);
            }
        }
    }

    private void E() {
        if (!this.y_init) {
            this.y_init = true;
            this.y_5 = 0L;
            this.y_6 = false;
        }
    }

    @class11782(y=class11777.AFTER_ALL)
    public void N(class11389 class113892) {
        if (class113892.y()) {
            return;
        }
        if (((Boolean)class11938.L_3).booleanValue() && class113892.Z().N(class11381.KEYBOARD) && class113892.L(301)) {
            this.Z();
            return;
        }
        if (((Boolean)class11938.L_3).booleanValue() && class113892.Z().N(class11381.KEYBOARD) && class113892.L(295)) {
            try {
                String string = class09820.y((class09773)((class09843)this.y_2).N().y(class09791.N().N(true)));
                Path path = Path.of("ui_dump_" + System.currentTimeMillis() + ".json", new String[0]);
                Files.writeString(path, (CharSequence)string, StandardCharsets.UTF_8, new OpenOption[0]);
                class11303.N((Object)class00392.y((String)"Hud dumped ").y((class00392)class00392.y((String)path.getFileName().toString()).N(class004052 -> class004052.N((class00647)new class00623(path.toAbsolutePath().toString())))));
            }
            catch (Exception exception) {
                // empty catch block
            }
            return;
        }
        if (!this.L()) {
            return;
        }
        this.y(class113892);
    }

    public float N(float f, class09079 class090792) {
        return ((class09781)this.y_3).y().N(f, class09221.N((class09079)class090792));
    }

    @class11782
    public void N(class10983 class109832) {
        ((class09843)this.y_2).y();
    }

    @class11782
    public void N(class11376 class113762) {
        if (!this.L()) {
            return;
        }
        ((class09781)this.y_3).i().N((float)class113762.L());
    }

    public void N() {
        ((class09843)this.y_2).y();
    }

    @class11782
    public void N(class10982 class109822) {
        try {
            boolean bl = this.L();
            if (!bl && ((Boolean)this.y_6).booleanValue()) {
                ((class09781)this.y_3).i().N(0, false);
            }
            this.y_6 = bl;
            if (bl) {
                this.U();
            }
            class08844 class088442 = ((class06202)this.y_0).Nt();
            int n = Math.max(1, class088442.U());
            int n2 = Math.max(1, class088442.E());
            long l = System.nanoTime();
            float f = (Long)this.y_5 == 0L ? 0.0f : Math.max(0.0f, (float)(l - (Long)this.y_5) / 1.0E9f);
            this.y_5 = l;
            class09936 class099362 = ((class09843)this.y_2).N(n, n2, f);
            if (class099362.y().isEmpty()) {
                return;
            }
            class11938.k().N(class109822.N());
            class11925.N((class08066)((class06202)this.y_0).e(), (boolean)false);
            ((class11749)this.y_1).N(class109822.N(), class099362, ((class09781)this.y_3).u().N());
            if (!((Boolean)class11938.L_3).booleanValue()) {
                return;
            }
            class09080.i().N(300.0f, 340.0f).N(32.0f).y(0x64000000).u(4.0f).N(class09079.REGULAR).i(-6305237).y("hud " + ((class11749)this.y_1).L()).L();
        } catch (Throwable t) {
            t.printStackTrace();
        }
    }

    public static void N(float f) {
        class11753 class117532 = class11938.i();
        ((class09781)class117532.y_3).u().N(f);
        ((class09843)class117532.y_2).y();
    }

    @class11782
    public void N(class11391 class113912) {
        if (!this.L()) {
            return;
        }
        ((class09781)this.y_3).i().N(class113912.L());
    }

    public float N(String string, float f, class09079 class090792) {
        return ((class09781)this.y_3).y().N(string, f, class09221.N((class09079)class090792));
    }

    private static void R() {
        N_0 = 240;
        N_1 = 1100;
        N_2 = 16;
        N_3 = 4;
        N_4 = null;
    }
}

