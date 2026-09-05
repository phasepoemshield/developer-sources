/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class11802
 */
package Nursultan;

import Nursultan.class11802;
import java.util.Arrays;

public class class11828
extends Enum<class11828> {
    public static final /* enum */ class11828 HELPER;
    public static final /* enum */ class11828 MODERATOR;
    public static final /* enum */ class11828 ADMINISTRATOR;
    public static final /* enum */ class11828 DEVELOPER;
    private static final /* synthetic */ class11828[] $VALUES;
    public String fields_051d503ac1bdb307ba7adfe057adb8485_0;
    public Integer fields_051d503ac1bdb307ba7adfe057adb8485_1;
    public boolean fields_051d503ac1bdb307ba7adfe057adb8485_init;

    private void L() {
        if (!this.fields_051d503ac1bdb307ba7adfe057adb8485_init) {
            this.fields_051d503ac1bdb307ba7adfe057adb8485_init = true;
            this.fields_051d503ac1bdb307ba7adfe057adb8485_1 = 0;
        }
    }

    private class11828(String string2, int n2) {
        this.L();
        this.fields_051d503ac1bdb307ba7adfe057adb8485_0 = string2;
        this.fields_051d503ac1bdb307ba7adfe057adb8485_1 = n2;
    }

    static {
        class11828.R();
        HELPER = new class11828("helper", 1);
        MODERATOR = new class11828("moderator", 2);
        ADMINISTRATOR = new class11828("administrator", 3);
        DEVELOPER = new class11828("developer", 4);
        $VALUES = class11828.u();
    }

    public static class11828[] values() {
        return (class11828[])$VALUES.clone();
    }

    public static class11828 valueOf(String string) {
        return Enum.valueOf(class11828.class, string);
    }

    private static /* synthetic */ class11828[] u() {
        return new class11828[]{HELPER, MODERATOR, ADMINISTRATOR, DEVELOPER};
    }

    public String y() {
        return this.fields_051d503ac1bdb307ba7adfe057adb8485_0;
    }

    public int N() {
        return this.fields_051d503ac1bdb307ba7adfe057adb8485_1;
    }

    public boolean N(class11802 class118022) {
        return class118022.N() >= this.fields_051d503ac1bdb307ba7adfe057adb8485_1;
    }

    public static class11828 N(String string) {
        return Arrays.stream(class11828.values()).filter(class118282 -> class118282.fields_051d503ac1bdb307ba7adfe057adb8485_0.equals(string)).findFirst().orElse(null);
    }

    private static void R() {
    }
}

