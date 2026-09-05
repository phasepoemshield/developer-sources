/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09253
 *  Nursultan.class09254
 *  Nursultan.class09256
 *  Nursultan.class09269
 *  Nursultan.class09276
 *  Nursultan.class09284
 *  Nursultan.class09294
 *  Nursultan.class09300
 *  Nursultan.class11285
 *  Nursultan.class11789
 *  Nursultan.class11790
 *  Nursultan.class11794
 *  Nursultan.class11857
 *  Nursultan.class11868
 *  Nursultan.class11938
 *  Nursultan.class11951
 *  Nursultan.class11957
 *  Nursultan.class12020
 *  minecraft.class06197
 *  minecraft.class06202
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package Nursultan;

import Nursultan.class09253;
import Nursultan.class09254;
import Nursultan.class09256;
import Nursultan.class09269;
import Nursultan.class09276;
import Nursultan.class09284;
import Nursultan.class09294;
import Nursultan.class09300;
import Nursultan.class11285;
import Nursultan.class11303;
import Nursultan.class11308;
import Nursultan.class11316;
import Nursultan.class11326;
import Nursultan.class11405;
import Nursultan.class11789;
import Nursultan.class11790;
import Nursultan.class11794;
import Nursultan.class11857;
import Nursultan.class11868;
import Nursultan.class11938;
import Nursultan.class11951;
import Nursultan.class11957;
import Nursultan.class12020;
import java.util.ArrayDeque;
import java.util.Base64;
import java.util.Deque;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import minecraft.class06197;
import minecraft.class06202;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class11324 {
    public static Object N_0;
    public static Object N_1;
    public static Object N_2;
    public Object y_0;
    public Object y_1;
    public Object y_2;
    public Object y_3;
    public Object y_4;
    public Object y_5;
    public boolean y_init;

    private static boolean L(class11789 class117892) {
        if (class117892 == null) {
            return false;
        }
        return class117892.i() == 0 || class117892.L() < class117892.i();
    }

    public synchronized void L(long l) {
        ((Map)this.y_1).remove(l);
    }

    public synchronized void L() {
        byte[] byArray = class11324.i(((class06197)class06202.Nq().L_3).N());
        if (byArray == null) {
            class11938.g().i().u().N((class11868)new class11857(class12020.N((String)"share.import.invalid"))).N();
            return;
        }
        class11405 class114052 = class11938.z();
        if (!class114052.R()) {
            class11938.g().i().u().N((class11868)new class11857(class12020.N((String)"share.import.offline"))).N();
            return;
        }
        if (((Boolean)this.y_5).booleanValue()) {
            return;
        }
        this.y_5 = true;
        class114052.N((class11951<class09276>)class11957.N((byte[])byArray));
    }

    public class11324() {
        this.B();
        this.y_0 = new ArrayDeque();
        this.y_1 = new HashMap();
        this.y_2 = Base64.getUrlEncoder().withoutPadding();
        this.y_3 = class11316.L();
    }

    static {
        class11324.i();
        N_0 = LogManager.getLogger(String.class);
    }

    private void B() {
        if (!this.y_init) {
            this.y_init = true;
            this.y_4 = 0L;
            this.y_5 = false;
        }
    }

    private static void i() {
        N_0 = null;
        N_1 = "https://nursultan.fun/config?id=";
        N_2 = "nursultan.fun/config?id=";
    }

    private void i(class11789 class117892) {
        ((Map)this.y_1).put(class117892.B(), class117892);
        this.N(class117892);
        this.N(class11308.CREATED, class117892.B());
    }

    private static byte[] i(String string) {
        int n;
        int n2;
        if (string == null) {
            return null;
        }
        int n3 = string.toLowerCase(Locale.ROOT).indexOf("nursultan.fun/config?id=");
        if (n3 < 0) {
            return null;
        }
        for (n2 = n = n3 + "nursultan.fun/config?id=".length(); n2 < string.length() && class11324.N(string.charAt(n2)); ++n2) {
        }
        if (n2 == n) {
            return null;
        }
        try {
            byte[] byArray = Base64.getUrlDecoder().decode(string.substring(n, n2));
            return (byte[])(byArray.length == 16 ? byArray : null);
        }
        catch (IllegalArgumentException illegalArgumentException) {
            return null;
        }
    }

    public synchronized class11789 i(long l) {
        class11789 class117892 = (class11789)((Map)this.y_1).get(l);
        return class11324.L(class117892) ? class117892 : null;
    }

    public synchronized void u() {
        ((Deque)this.y_0).add(class11326.y());
        this.R();
    }

    public synchronized void u(long l) {
        ((Deque)this.y_0).add(class11326.y(l));
        this.R();
    }

    private String u(class11789 class117892) {
        return "https://nursultan.fun/config?id=" + ((Base64.Encoder)this.y_2).encodeToString(class117892.u());
    }

    public synchronized void y() {
        ((Deque)this.y_0).clear();
        ((Map)this.y_1).clear();
        this.y_3 = class11316.L();
        this.y_5 = false;
        this.u();
    }

    public synchronized void y(long l) {
        ((Deque)this.y_0).add(class11326.N(l));
        this.R();
    }

    private void y(class11789 class117892) {
        ((Map)this.y_1).put(class117892.B(), class117892);
        class11938.g().i().B().N((class11868)new class11857(class12020.N((String)"share.notify.refreshed"))).N();
        this.N(class11308.REFRESHED, class117892.B());
    }

    private void N(class09284 class092842) {
        class11790 class117902;
        boolean bl;
        boolean bl2 = bl = (Boolean)this.y_5 != false && class092842.y() == 0L;
        if (bl) {
            this.y_5 = false;
        }
        if ((class117902 = class11790.N((int)class092842.N())) == null) {
            ((Logger)N_0).warn("share NACK with unknown error code {}", (Object)class092842.N());
            this.N(class11308.ERROR, class092842.y());
            return;
        }
        if (bl) {
            class11938.g().i().u().N((class11868)new class11857(class12020.N((String)class117902.y()))).N();
        } else {
            class11303.y(class12020.N((String)class117902.y()));
        }
        this.N(class11308.ERROR, class092842.y());
    }

    private void N(class09253 class092532) {
        this.y_5 = false;
        class11794 class117942 = class11794.N((int)class092532.L());
        if (class117942 == null) {
            ((Logger)N_0).warn("share activate response with unknown outcome {}", (Object)class092532.L());
            return;
        }
        switch (((int[])class11285.N_1)[class117942.ordinal()]) {
            case 1: {
                class11938.g().i().B().N((class11868)new class11857(class12020.N((String)"share.import.created").formatted(new Object[]{class092532.N()}))).N();
                break;
            }
            case 2: {
                class11938.g().i().B().N((class11868)new class11857(class12020.N((String)"share.import.updated").formatted(new Object[]{class092532.N()}))).N();
                break;
            }
            case 3: {
                class11938.g().i().L().N((class11868)new class11857(class12020.N((String)"share.import.already-activated"))).N();
                break;
            }
            case 4: {
                class11938.g().i().L().N((class11868)new class11857(class12020.N((String)"share.import.own-link"))).N();
            }
        }
    }

    private void N(class11308 class113082, long l) {
        long l2 = (Long)this.y_4 + 1L;
        this.y_4 = l2;
        this.y_3 = new class11316(class113082, l, l2);
    }

    public synchronized void N(class09256 class092562) {
        switch (((int[])class11285.N_0)[class092562.N().ordinal()]) {
            case 1: {
                this.N(((class09254)class092562.y()).N());
                break;
            }
            case 2: {
                this.i(((class09269)class092562.y()).N());
                break;
            }
            case 3: {
                this.R(((class09300)class092562.y()).N());
                break;
            }
            case 4: {
                this.N((class09284)class092562.y());
                break;
            }
            case 5: {
                this.N((class09253)class092562.y());
                break;
            }
            case 6: {
                this.y(((class09294)class092562.y()).N());
            }
        }
        this.R();
    }

    private static boolean N(char c) {
        return c >= 'A' && c <= 'Z' || c >= 'a' && c <= 'z' || c >= '0' && c <= '9' || c == '-' || c == '_' || c == '=';
    }

    public synchronized boolean N(long l) {
        return l > 0L && class11324.L((class11789)((Map)this.y_1).get(l));
    }

    public void N(class11789 class117892) {
        ((class06197)class06202.Nq().L_3).N(this.u(class117892));
        class11938.g().i().B().N((class11868)new class11857(class12020.N((String)"share.notify.copied"))).N();
    }

    public class11316 N() {
        return (class11316)((Object)this.y_3);
    }

    public synchronized void N(long l, long l2, int n) {
        ((Deque)this.y_0).add(class11326.N(l, l2, n));
        this.R();
    }

    private void N(List<class11789> list) {
        ((Map)this.y_1).clear();
        for (class11789 class117892 : list) {
            ((Map)this.y_1).put(class117892.B(), class117892);
        }
    }

    private void R(long l) {
        ((Map)this.y_1).remove(l);
        this.N(class11308.DELETED, l);
    }

    private void R() {
        class11405 class114052 = class11938.z();
        if (!class114052.R()) {
            return;
        }
        while (!((Deque)this.y_0).isEmpty()) {
            class11326 class113262 = (class11326)((Object)((Deque)this.y_0).poll());
            switch (((int[])class11285.N_2)[class113262.N().ordinal()]) {
                case 1: {
                    class114052.N((class11951<class09276>)class11957.y());
                    break;
                }
                case 2: {
                    class114052.N((class11951<class09276>)class11957.N((long)class113262.i(), (long)class113262.u(), (int)class113262.L()));
                    break;
                }
                case 3: {
                    class114052.N((class11951<class09276>)class11957.N((long)class113262.i()));
                    break;
                }
                case 4: {
                    class114052.N((class11951<class09276>)class11957.y((long)class113262.i()));
                }
            }
        }
    }
}

