/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class11928
 *  Nursultan.class11931
 *  minecraft.class00381
 */
package Nursultan;

import Nursultan.class11889;
import Nursultan.class11912;
import Nursultan.class11928;
import Nursultan.class11931;
import java.util.function.Consumer;
import minecraft.class00381;

public class class11920
extends Enum<class11920> {
    private static String[] strings_024517ede86c7388489d2ebaa4ff49c2b;
    private static byte[] bytes_124517ede86c7388489d2ebaa4ff49c2b;
    public static Object[] staticFields_024517ede86c7388489d2ebaa4ff49c2b;
    public class11889 fields_024517ede86c7388489d2ebaa4ff49c2b_0;

    private static void L() {
        bytes_124517ede86c7388489d2ebaa4ff49c2b = new byte[1];
        class11920.bytes_124517ede86c7388489d2ebaa4ff49c2b[0] = 5;
    }

    private void M() {
    }

    private class11920(class11889 class118892) {
        this.M();
        this.fields_024517ede86c7388489d2ebaa4ff49c2b_0 = class118892;
    }

    static {
        class11920.L();
        class11920.Z();
        class11920.u();
        class11920.staticFields_024517ede86c7388489d2ebaa4ff49c2b[0] = new class11920((class11889)new class11931());
        class11920.staticFields_024517ede86c7388489d2ebaa4ff49c2b[1] = new class11920(new class11912());
        class11920.staticFields_024517ede86c7388489d2ebaa4ff49c2b[2] = new class11920((class11889)new class11928());
        class11920.staticFields_024517ede86c7388489d2ebaa4ff49c2b[3] = new class11920(null);
        class11920.staticFields_024517ede86c7388489d2ebaa4ff49c2b[4] = class11920.R();
    }

    public static class11920[] values() {
        return (class11920[])((class11920[])staticFields_024517ede86c7388489d2ebaa4ff49c2b[4]).clone();
    }

    public static class11920 valueOf(String string) {
        return Enum.valueOf(class11920.class, string);
    }

    private static void Z() {
        strings_024517ede86c7388489d2ebaa4ff49c2b = new String[4];
        class11920.strings_024517ede86c7388489d2ebaa4ff49c2b[0] = "HUB";
        class11920.strings_024517ede86c7388489d2ebaa4ff49c2b[1] = "GRIEF";
        class11920.strings_024517ede86c7388489d2ebaa4ff49c2b[2] = "ANARCHY";
        class11920.strings_024517ede86c7388489d2ebaa4ff49c2b[3] = "NONE";
    }

    private static void u() {
        staticFields_024517ede86c7388489d2ebaa4ff49c2b = new Object[bytes_124517ede86c7388489d2ebaa4ff49c2b[0]];
    }

    public class11889 y() {
        return this.fields_024517ede86c7388489d2ebaa4ff49c2b_0;
    }

    public static void N(class00381<?> class003812, Consumer<class11920> consumer) {
        for (class11920 class119202 : class11920.values()) {
            if (class119202 == (class11920)((Object)staticFields_024517ede86c7388489d2ebaa4ff49c2b[3]) || !class119202.fields_024517ede86c7388489d2ebaa4ff49c2b_0.N(class003812)) continue;
            consumer.accept(class119202);
            break;
        }
    }

    public boolean N() {
        return this == (class11920)((Object)staticFields_024517ede86c7388489d2ebaa4ff49c2b[0]);
    }

    private static /* synthetic */ class11920[] R() {
        return new class11920[]{(class11920)((Object)staticFields_024517ede86c7388489d2ebaa4ff49c2b[0]), (class11920)((Object)staticFields_024517ede86c7388489d2ebaa4ff49c2b[1]), (class11920)((Object)staticFields_024517ede86c7388489d2ebaa4ff49c2b[2]), (class11920)((Object)staticFields_024517ede86c7388489d2ebaa4ff49c2b[3])};
    }
}

