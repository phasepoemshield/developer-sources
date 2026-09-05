/*
 * Decompiled with CFR 0.152.
 */
package Nursultan;

import Nursultan.class11911;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Optional;

public class class11901
extends Enum<class11901> {
    public static Object[] staticFields_0ec612a2dc0263a258b66e8d510834aaf;
    private static String[] strings_0ec612a2dc0263a258b66e8d510834aaf;
    private static byte[] bytes_1ec612a2dc0263a258b66e8d510834aaf;
    public String fields_0ec612a2dc0263a258b66e8d510834aaf_0;

    private class11901(String string2) {
        this.y();
        this.fields_0ec612a2dc0263a258b66e8d510834aaf_0 = string2;
    }

    static {
        class11901.i();
        class11901.u();
        class11901.B();
        class11901.staticFields_0ec612a2dc0263a258b66e8d510834aaf[0] = new class11901(strings_0ec612a2dc0263a258b66e8d510834aaf[1]);
        class11901.staticFields_0ec612a2dc0263a258b66e8d510834aaf[1] = new class11901(strings_0ec612a2dc0263a258b66e8d510834aaf[3]);
        class11901.staticFields_0ec612a2dc0263a258b66e8d510834aaf[2] = new class11901(strings_0ec612a2dc0263a258b66e8d510834aaf[5]);
        class11901.staticFields_0ec612a2dc0263a258b66e8d510834aaf[3] = new class11901(strings_0ec612a2dc0263a258b66e8d510834aaf[7]);
        class11901.staticFields_0ec612a2dc0263a258b66e8d510834aaf[4] = class11901.R();
    }

    public static class11901[] values() {
        return (class11901[])((class11901[])staticFields_0ec612a2dc0263a258b66e8d510834aaf[4]).clone();
    }

    public static class11901 valueOf(String string) {
        return Enum.valueOf(class11901.class, string);
    }

    private static void B() {
        staticFields_0ec612a2dc0263a258b66e8d510834aaf = new Object[bytes_1ec612a2dc0263a258b66e8d510834aaf[0]];
    }

    private static void i() {
        bytes_1ec612a2dc0263a258b66e8d510834aaf = new byte[1];
        class11901.bytes_1ec612a2dc0263a258b66e8d510834aaf[0] = 5;
    }

    private static void u() {
        strings_0ec612a2dc0263a258b66e8d510834aaf = new String[8];
        class11901.strings_0ec612a2dc0263a258b66e8d510834aaf[0] = "ENABLE";
        class11901.strings_0ec612a2dc0263a258b66e8d510834aaf[1] = "enable.ogg";
        class11901.strings_0ec612a2dc0263a258b66e8d510834aaf[2] = "DISABLE";
        class11901.strings_0ec612a2dc0263a258b66e8d510834aaf[3] = "disable.ogg";
        class11901.strings_0ec612a2dc0263a258b66e8d510834aaf[4] = "IRC";
        class11901.strings_0ec612a2dc0263a258b66e8d510834aaf[5] = "irc.ogg";
        class11901.strings_0ec612a2dc0263a258b66e8d510834aaf[6] = "PLAYER_PING";
        class11901.strings_0ec612a2dc0263a258b66e8d510834aaf[7] = "playerping.ogg";
    }

    private void y() {
    }

    public static Optional<class11901> N(String string) {
        return Arrays.stream(class11901.values()).filter(class119012 -> class119012.fields_0ec612a2dc0263a258b66e8d510834aaf_0.startsWith(string)).findFirst().or(Optional::empty);
    }

    public InputStream N() throws IOException {
        return class11911.L("sounds/" + this.fields_0ec612a2dc0263a258b66e8d510834aaf_0).method_14482();
    }

    private static /* synthetic */ class11901[] R() {
        return new class11901[]{(class11901)((Object)staticFields_0ec612a2dc0263a258b66e8d510834aaf[0]), (class11901)((Object)staticFields_0ec612a2dc0263a258b66e8d510834aaf[1]), (class11901)((Object)staticFields_0ec612a2dc0263a258b66e8d510834aaf[2]), (class11901)((Object)staticFields_0ec612a2dc0263a258b66e8d510834aaf[3])};
    }
}

