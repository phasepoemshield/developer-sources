/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class01028
 *  minecraft.class01079
 *  minecraft.class05197
 */
package Nursultan;

import Nursultan.class09061;
import Nursultan.class09070;
import Nursultan.class09071;
import Nursultan.class09074;
import Nursultan.class09079;
import Nursultan.class09082;
import Nursultan.class09090;
import Nursultan.class09099;
import Nursultan.class09100;
import Nursultan.class09102;
import Nursultan.class09106;
import java.io.IOException;
import java.io.InputStream;
import java.io.UncheckedIOException;
import minecraft.class00392;
import minecraft.class01028;
import minecraft.class01079;
import minecraft.class05197;

public class class09093 {
    public Object N_0;
    public Object N_1;
    public Object N_2;
    public Object N_3;
    public Object N_4;
    public Object N_5;
    public Object N_6;
    public boolean N_init;
    public static Object y_0;
    public static Object y_1;
    public static Object y_2;
    public static Object y_3;
    public static Object y_4;
    public Object L_0;
    public Object L_1;
    public Object L_2;
    public Object L_3;
    public Object L_4;
    public Object L_5;
    public Object u_0;
    public Object u_1;
    public Object u_2;
    public Object u_3;
    public Object u_4;
    public Object u_5;
    public boolean u_init;

    public int L(int n) {
        return ((class09082)this.L_4).L(n);
    }

    public void L() {
        if ((class00392)this.N_3 != null && !((class00392)this.N_3).getString().isEmpty()) {
            ((class09106)this.L_5).N(((class00392)this.N_3).method_30937(), ((Float)this.u_1).floatValue(), ((Float)this.u_2).floatValue(), (byte)((Float)this.N_4).floatValue(), (class09079)((Object)this.N_5), (boolean)((Boolean)this.u_5), (int)((Integer)this.N_6), (int)((Integer)this.u_0), (int)((Integer)this.u_3), (byte)((Float)this.u_4).floatValue());
            this.M();
            return;
        }
        if ((String)this.N_2 != null && !((String)this.N_2).isEmpty()) {
            ((class09106)this.L_5).N((String)this.N_2, ((Float)this.u_1).floatValue(), ((Float)this.u_2).floatValue(), (byte)((Float)this.N_4).floatValue(), (class09079)((Object)this.N_5), (boolean)((Boolean)this.u_5), (int)((Integer)this.N_6), (int)((Integer)this.u_0), (int)((Integer)this.u_3), (byte)((Float)this.u_4).floatValue());
        }
        this.M();
    }

    public float L(class00392 class003922) {
        return this.y(class003922, ((Float)this.N_4).floatValue(), (class09079)((Object)this.N_5), (boolean)((Boolean)this.u_5));
    }

    public float L(String string) {
        return this.N(string, ((Float)this.N_4).floatValue(), (class09079)((Object)this.N_5), (boolean)((Boolean)this.u_5));
    }

    public class09093 L(float f) {
        this.u_1 = Float.valueOf(f);
        return this;
    }

    private void M() {
        this.N_2 = "";
        this.N_3 = null;
        this.N_4 = Float.valueOf(12.0f);
        this.N_5 = class09079.REGULAR;
        this.u_5 = false;
        this.N_6 = -1;
        this.u_0 = 0;
        this.u_1 = Float.valueOf(0.0f);
        this.u_2 = Float.valueOf(0.0f);
        this.u_3 = 0;
        this.u_4 = Float.valueOf(0.0f);
    }

    public class09093(String string, class09082 class090822, class01079 class010792) {
        this.R();
        this.L_0 = new class09070();
        this.L_1 = new class09074();
        this.L_2 = new class09090();
        this.L_3 = new class09099();
        this.N_1 = string;
        this.L_4 = class090822;
        this.L_5 = new class09106();
        this.N_0 = new class09100(class090822, string, class09093.N(class010792));
        this.M();
    }

    static {
        class09093.B();
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof class09093)) {
            return false;
        }
        class09093 class090932 = (class09093)object;
        String string = (String)this.N_1;
        String string2 = (String)class090932.N_1;
        return !(string == null ? string2 != null : !string.equals(string2));
    }

    public int hashCode() {
        int n = 59;
        int n2 = 1;
        String string = (String)this.N_1;
        n2 = n2 * 59 + (string == null ? 43 : string.hashCode());
        return n2;
    }

    private static void B() {
        y_0 = 10;
        y_1 = 9;
        y_2 = 13;
        y_3 = 32;
        y_4 = 4;
    }

    public class09093 i(int n) {
        this.N_6 = n;
        return this;
    }

    public class09093 u(float f) {
        this.u_4 = Float.valueOf(f);
        return this;
    }

    public int u(int n) {
        return ((class09082)this.L_4).N(n);
    }

    public void u() {
        ((class09082)this.L_4).y();
    }

    public class09071 y(class09079 class090792) {
        return ((class09100)this.N_0).N(class090792 == null ? class09079.REGULAR : class090792);
    }

    public class09093 y(int n) {
        this.u_3 = n;
        return this;
    }

    public void y() {
        ((class09106)this.L_5).N(this);
    }

    public class09093 y(class00392 class003922) {
        this.N_3 = class003922;
        return this;
    }

    public float y(String string, float f, class09079 class090792, boolean bl) {
        if (string == null || string.isEmpty()) {
            return 0.0f;
        }
        return this.N(this.y(class090792), f, string);
    }

    public class09093 y(float f) {
        this.u_2 = Float.valueOf(f);
        return this;
    }

    private static float y(float f, float f2) {
        float f3 = f2 > 0.0f ? f2 : 1.0f;
        return Math.max(1.0f, (float)Math.round(f * f3));
    }

    public class09093 y(String string) {
        this.N_2 = string;
        return this;
    }

    public float y(class00392 class003922, float f, class09079 class090792, boolean bl) {
        if (class003922 == null) {
            return 0.0f;
        }
        if (class003922.getString().isEmpty()) {
            return 0.0f;
        }
        return this.N(this.y(class090792), f, class003922.method_30937());
    }

    public boolean N(String string, float f, float f2, float f3, float f4, class09079 class090792, boolean bl, int n, class09061 class090612) {
        if (string == null || string.isEmpty()) {
            return true;
        }
        float f5 = class09093.y(f3, f4);
        return ((class09074)this.L_1).N(this.y(class090792), f5, f4, string, f, f2, n, class090612);
    }

    public float N(float f, class09079 class090792, boolean bl, int n) {
        return this.y(class090792).N(n, f);
    }

    private float N(class09071 class090712, float f, String string) {
        ((class09099)this.L_3).N((class09090)this.L_2);
        ((class09090)this.L_2).N(class090712, f, 1.0f, string, 0.0f, 0.0f, (class09102)((class09099)this.L_3));
        return ((class09099)this.L_3).L();
    }

    public float N(float f, class09079 class090792, boolean bl) {
        return this.y(class090792).N(f);
    }

    private static byte[] N(class01079 class010792) {
        byte[] byArray;
        block8: {
            InputStream inputStream = class010792.method_14482();
            try {
                byArray = inputStream.readAllBytes();
                if (inputStream == null) break block8;
            }
            catch (Throwable throwable) {
                try {
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        }
                        catch (Throwable throwable2) {
                            throwable.addSuppressed(throwable2);
                        }
                    }
                    throw throwable;
                }
                catch (IOException iOException) {
                    throw new UncheckedIOException("Failed to read font resource", iOException);
                }
            }
            inputStream.close();
        }
        return byArray;
    }

    public float N(class00392 class003922) {
        return this.N(class003922, ((Float)this.N_4).floatValue(), (class09079)((Object)this.N_5), (boolean)((Boolean)this.u_5));
    }

    public class09093 N() {
        this.u_5 = true;
        return this;
    }

    public float N(class00392 class003922, float f, class09079 class090792, boolean bl) {
        if (class003922 == null || class003922.getString().isEmpty()) {
            return 0.0f;
        }
        ((class09070)this.L_0).N(this.y(class090792).N(f));
        class003922.method_30937().accept((class05197)((class09070)this.L_0));
        return ((class09070)this.L_0).L();
    }

    public class09093 N(float f, float f2) {
        this.u_1 = Float.valueOf(f);
        this.u_2 = Float.valueOf(f2);
        return this;
    }

    public void N(class00392 class003922, float f, float f2, float f3, float f4, class09079 class090792, boolean bl, int n, class09061 class090612) {
        if (class003922 == null || class003922.getString().isEmpty()) {
            return;
        }
        float f5 = class09093.y(f3, f4);
        ((class09074)this.L_1).N(this.y(class090792), f5, f4, class003922.method_30937(), f, f2, n, class090612);
    }

    public float N(float f, class09079 class090792, boolean bl, int n, int n2) {
        return this.y(class090792).N(n, n2, f);
    }

    public float N(String string, float f, class09079 class090792, boolean bl) {
        if (string == null || string.isEmpty()) {
            return 0.0f;
        }
        int n = 1;
        int n2 = 0;
        while (n2 < string.length()) {
            int n3 = string.codePointAt(n2);
            n2 += Character.charCount(n3);
            if (n3 != 10) continue;
            ++n;
        }
        return (float)n * this.y(class090792).N(f);
    }

    public void N(class01028 class010282, float f, float f2, float f3, float f4, class09079 class090792, boolean bl, int n, class09061 class090612) {
        if (class010282 == null) {
            return;
        }
        float f5 = class09093.y(f3, f4);
        ((class09074)this.L_1).N(this.y(class090792), f5, f4, class010282, f, f2, n, class090612);
    }

    public void N(class09061 class090612) {
        if ((class00392)this.N_3 != null && !((class00392)this.N_3).getString().isEmpty()) {
            ((class09074)this.L_1).N(this.y((class09079)((Object)this.N_5)), ((Float)this.N_4).floatValue(), 1.0f, ((class00392)this.N_3).method_30937(), ((Float)this.u_1).floatValue(), ((Float)this.u_2).floatValue(), (int)((Integer)this.N_6), class090612);
            this.M();
            return;
        }
        if ((String)this.N_2 != null && !((String)this.N_2).isEmpty()) {
            ((class09074)this.L_1).N(this.y((class09079)((Object)this.N_5)), ((Float)this.N_4).floatValue(), 1.0f, (String)this.N_2, ((Float)this.u_1).floatValue(), ((Float)this.u_2).floatValue(), (int)((Integer)this.N_6), class090612);
        }
        this.M();
    }

    public class09093 N(class09079 class090792) {
        this.N_5 = class090792;
        return this;
    }

    private float N(class09071 class090712, float f, class01028 class010282) {
        ((class09099)this.L_3).N((class09090)this.L_2);
        ((class09090)this.L_2).N(class090712, f, 1.0f, class010282, 0.0f, 0.0f, (class09102)((class09099)this.L_3));
        return ((class09099)this.L_3).L();
    }

    public class09093 N(float f) {
        this.N_4 = Float.valueOf(f);
        return this;
    }

    public float N(String string) {
        return this.y(string, ((Float)this.N_4).floatValue(), (class09079)((Object)this.N_5), (boolean)((Boolean)this.u_5));
    }

    public class09093 N(int n) {
        this.u_0 = n;
        return this;
    }

    public int R(int n) {
        return ((class09082)this.L_4).y(n);
    }

    private void R() {
        if (!this.N_init) {
            this.N_init = true;
            this.N_4 = Float.valueOf(0.0f);
            this.N_6 = 0;
        }
        if (!this.u_init) {
            this.u_init = true;
            this.u_0 = 0;
            this.u_1 = Float.valueOf(0.0f);
            this.u_2 = Float.valueOf(0.0f);
            this.u_3 = 0;
            this.u_4 = Float.valueOf(0.0f);
            this.u_5 = false;
        }
    }
}

