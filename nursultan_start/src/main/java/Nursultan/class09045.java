/*
 * Decompiled with CFR 0.152.
 */
package Nursultan;

import java.util.Arrays;

public class class09045
extends Enum<class09045> {
    public String fields_0b9b15f5e167c3861902fa68eb25fbfed_0;
    public static final /* enum */ class09045 TOGGLE;
    public static final /* enum */ class09045 HOLD;
    private static final /* synthetic */ class09045[] $VALUES;

    private class09045(String string2) {
        this.R();
        this.fields_0b9b15f5e167c3861902fa68eb25fbfed_0 = string2;
    }

    static {
        class09045.B();
        TOGGLE = new class09045("toggle");
        HOLD = new class09045("hold");
        $VALUES = class09045.u();
    }

    public static class09045[] values() {
        return (class09045[])$VALUES.clone();
    }

    public static class09045 valueOf(String string) {
        return Enum.valueOf(class09045.class, string);
    }

    private static void B() {
    }

    private static /* synthetic */ class09045[] u() {
        return new class09045[]{TOGGLE, HOLD};
    }

    public static class09045 N(String string) {
        return Arrays.stream(class09045.values()).filter(class090452 -> class090452.fields_0b9b15f5e167c3861902fa68eb25fbfed_0.equalsIgnoreCase(string)).findFirst().orElse(null);
    }

    public String N() {
        return this.fields_0b9b15f5e167c3861902fa68eb25fbfed_0;
    }

    private void R() {
    }
}

