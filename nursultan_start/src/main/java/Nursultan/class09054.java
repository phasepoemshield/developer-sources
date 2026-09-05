/*
 * Decompiled with CFR 0.152.
 */
package Nursultan;

public class class09054
extends Enum<class09054> {
    public String fields_0d2362c8367293aa29d38f22ed477286c_0;
    public static final /* enum */ class09054 OFFLINE_GENERATED;
    public static final /* enum */ class09054 OFFLINE;
    public static final /* enum */ class09054 MICROSOFT;
    private static final /* synthetic */ class09054[] $VALUES;

    private static /* synthetic */ class09054[] L() {
        return new class09054[]{OFFLINE_GENERATED, OFFLINE, MICROSOFT};
    }

    private static void M() {
    }

    private class09054(String string2) {
        this.y();
        this.fields_0d2362c8367293aa29d38f22ed477286c_0 = string2;
    }

    static {
        class09054.M();
        OFFLINE_GENERATED = new class09054("account.type.offline-generated");
        OFFLINE = new class09054("account.type.offline");
        MICROSOFT = new class09054("account.type.microsoft");
        $VALUES = class09054.L();
    }

    public static class09054[] values() {
        return (class09054[])$VALUES.clone();
    }

    public static class09054 valueOf(String string) {
        return Enum.valueOf(class09054.class, string);
    }

    private void y() {
    }

    public String N() {
        return this.fields_0d2362c8367293aa29d38f22ed477286c_0;
    }
}

