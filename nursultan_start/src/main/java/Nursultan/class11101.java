/*
 * Decompiled with CFR 0.152.
 */
package Nursultan;

public class class11101
extends Enum<class11101> {
    public static final /* enum */ class11101 DEFAULT;
    public static final /* enum */ class11101 DEVELOPMENT;
    private static final /* synthetic */ class11101[] $VALUES;
    public String fields_0bb3ac43ebb203194805c7ef037790ad8_0;

    private void L() {
    }

    private static /* synthetic */ class11101[] M() {
        return new class11101[]{DEFAULT, DEVELOPMENT};
    }

    private class11101(String string2) {
        this.L();
        this.fields_0bb3ac43ebb203194805c7ef037790ad8_0 = string2;
    }

    static {
        class11101.R();
        DEFAULT = new class11101("access.default");
        DEVELOPMENT = new class11101("access.development");
        $VALUES = class11101.M();
    }

    public static class11101[] values() {
        return (class11101[])$VALUES.clone();
    }

    public static class11101 valueOf(String string) {
        return Enum.valueOf(class11101.class, string);
    }

    public boolean N(class11101 class111012) {
        return this == class111012;
    }

    public String N() {
        return this.fields_0bb3ac43ebb203194805c7ef037790ad8_0;
    }

    private static void R() {
    }
}

