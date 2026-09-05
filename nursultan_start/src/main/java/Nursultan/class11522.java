/*
 * Decompiled with CFR 0.152.
 */
package Nursultan;

public class class11522
extends Enum<class11522> {
    private static String[] strings_05ffa7eec8dd73e94b3c68970de658457;
    public Integer fields_05ffa7eec8dd73e94b3c68970de658457_0;
    public boolean fields_05ffa7eec8dd73e94b3c68970de658457_init;
    public static class11522 staticFields_05ffa7eec8dd73e94b3c68970de658457_0;
    public static class11522 staticFields_05ffa7eec8dd73e94b3c68970de658457_1;
    public static class11522 staticFields_05ffa7eec8dd73e94b3c68970de658457_2;
    public static class11522[] staticFields_05ffa7eec8dd73e94b3c68970de658457_3;

    private static /* synthetic */ class11522[] L() {
        return new class11522[]{staticFields_05ffa7eec8dd73e94b3c68970de658457_0, staticFields_05ffa7eec8dd73e94b3c68970de658457_1, staticFields_05ffa7eec8dd73e94b3c68970de658457_2};
    }

    private void M() {
        if (!this.fields_05ffa7eec8dd73e94b3c68970de658457_init) {
            this.fields_05ffa7eec8dd73e94b3c68970de658457_init = true;
            this.fields_05ffa7eec8dd73e94b3c68970de658457_0 = 0;
        }
    }

    private class11522(int n2) {
        this.M();
        this.fields_05ffa7eec8dd73e94b3c68970de658457_0 = n2;
    }

    static {
        class11522.R();
        class11522.y();
        staticFields_05ffa7eec8dd73e94b3c68970de658457_0 = new class11522(200);
        staticFields_05ffa7eec8dd73e94b3c68970de658457_1 = new class11522(0);
        staticFields_05ffa7eec8dd73e94b3c68970de658457_2 = new class11522(-200);
        staticFields_05ffa7eec8dd73e94b3c68970de658457_3 = class11522.L();
    }

    public static class11522[] values() {
        return (class11522[])staticFields_05ffa7eec8dd73e94b3c68970de658457_3.clone();
    }

    public static class11522 valueOf(String string) {
        return Enum.valueOf(class11522.class, string);
    }

    private static void y() {
    }

    public int N() {
        return this.fields_05ffa7eec8dd73e94b3c68970de658457_0;
    }

    private static void R() {
        strings_05ffa7eec8dd73e94b3c68970de658457 = new String[3];
        class11522.strings_05ffa7eec8dd73e94b3c68970de658457[0] = "NOW";
        class11522.strings_05ffa7eec8dd73e94b3c68970de658457[1] = "DEFAULT";
        class11522.strings_05ffa7eec8dd73e94b3c68970de658457[2] = "LATER";
    }
}

