/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class12018
 */
package Nursultan;

import Nursultan.class11106;
import Nursultan.class12018;
import java.util.Arrays;

public class class11072
extends Enum<class11072> {
    public class12018 fields_0537b6d18c54a384692f322b8728c3a85_0;
    public class11106[] fields_0537b6d18c54a384692f322b8728c3a85_1;
    public static final /* enum */ class11072 COMBAT;
    public static final /* enum */ class11072 MOVEMENT;
    public static final /* enum */ class11072 VISUAL;
    public static final /* enum */ class11072 PLAYER;
    public static final /* enum */ class11072 MISC;
    private static final /* synthetic */ class11072[] $VALUES;

    private class11072(String string2, class11106 ... class11106Array) {
        this.i();
        this.fields_0537b6d18c54a384692f322b8728c3a85_0 = new class12018("category").N(string2);
        this.fields_0537b6d18c54a384692f322b8728c3a85_1 = class11106Array;
    }

    static {
        class11072.B();
        COMBAT = new class11072("combat", class11106.FIGHTING, class11106.TOOLS, class11106.BASE, class11106.OTHER);
        MOVEMENT = new class11072("movement", class11106.BASE, class11106.TOOLS);
        VISUAL = new class11072("visual", class11106.INTERFACE, class11106.WORLD, class11106.SCREEN);
        PLAYER = new class11072("player", class11106.AUTO, class11106.BASE);
        MISC = new class11072("misc", class11106.BASE, class11106.CLIENT, class11106.TRACKERS, class11106.HELPER);
        $VALUES = class11072.R();
    }

    public static class11072[] values() {
        return (class11072[])$VALUES.clone();
    }

    public static class11072 valueOf(String string) {
        return Enum.valueOf(class11072.class, string);
    }

    private static void B() {
    }

    private void i() {
    }

    public class11106[] y() {
        return this.fields_0537b6d18c54a384692f322b8728c3a85_1;
    }

    public static class11072 N(String string) {
        return Arrays.stream(class11072.values()).filter(class110722 -> class110722.fields_0537b6d18c54a384692f322b8728c3a85_0.N().equals(string)).findFirst().orElse(null);
    }

    public class12018 N() {
        return this.fields_0537b6d18c54a384692f322b8728c3a85_0;
    }

    private static /* synthetic */ class11072[] R() {
        return new class11072[]{COMBAT, MOVEMENT, VISUAL, PLAYER, MISC};
    }
}

