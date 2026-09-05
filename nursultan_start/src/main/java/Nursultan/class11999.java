/*
 * Decompiled with CFR 0.152.
 */
package Nursultan;

import java.util.Arrays;

public class class11999
extends Enum<class11999> {
    public String fields_012b09a0b8db6387686aa0e4095e29f49_0;
    public static final /* enum */ class11999 RU;
    public static final /* enum */ class11999 EN;
    private static final /* synthetic */ class11999[] $VALUES;

    private static void L() {
    }

    private class11999(String string2) {
        this.u();
        this.fields_012b09a0b8db6387686aa0e4095e29f49_0 = string2;
    }

    static {
        class11999.L();
        RU = new class11999("ru");
        EN = new class11999("en");
        $VALUES = class11999.y();
    }

    public static class11999[] values() {
        return (class11999[])$VALUES.clone();
    }

    public static class11999 valueOf(String string) {
        return Enum.valueOf(class11999.class, string);
    }

    private void u() {
    }

    private static /* synthetic */ class11999[] y() {
        return new class11999[]{RU, EN};
    }

    public String N() {
        return this.fields_012b09a0b8db6387686aa0e4095e29f49_0;
    }

    public static class11999 N(String string) {
        return Arrays.stream(class11999.values()).filter(class119992 -> class119992.fields_012b09a0b8db6387686aa0e4095e29f49_0.equals(string)).findFirst().orElse(EN);
    }
}

