/*
 * Decompiled with CFR 0.152.
 */
package Nursultan;

public class class11829
extends Enum<class11829> {
    private static String[] strings_0242e1118e2fe3fc28eb8f4c8015ed8ab;
    public static class11829 staticFields_0242e1118e2fe3fc28eb8f4c8015ed8ab_0;
    public static class11829 staticFields_0242e1118e2fe3fc28eb8f4c8015ed8ab_1;
    public static class11829 staticFields_0242e1118e2fe3fc28eb8f4c8015ed8ab_2;
    public static class11829 staticFields_0242e1118e2fe3fc28eb8f4c8015ed8ab_3;
    public static class11829 staticFields_0242e1118e2fe3fc28eb8f4c8015ed8ab_4;
    public static class11829 staticFields_0242e1118e2fe3fc28eb8f4c8015ed8ab_5;
    public static class11829[] staticFields_0242e1118e2fe3fc28eb8f4c8015ed8ab_6;

    static {
        class11829.y();
        class11829.u();
        staticFields_0242e1118e2fe3fc28eb8f4c8015ed8ab_0 = new class11829();
        staticFields_0242e1118e2fe3fc28eb8f4c8015ed8ab_1 = new class11829();
        staticFields_0242e1118e2fe3fc28eb8f4c8015ed8ab_2 = new class11829();
        staticFields_0242e1118e2fe3fc28eb8f4c8015ed8ab_3 = new class11829();
        staticFields_0242e1118e2fe3fc28eb8f4c8015ed8ab_4 = new class11829();
        staticFields_0242e1118e2fe3fc28eb8f4c8015ed8ab_5 = new class11829();
        staticFields_0242e1118e2fe3fc28eb8f4c8015ed8ab_6 = class11829.R();
    }

    public static class11829[] values() {
        return (class11829[])staticFields_0242e1118e2fe3fc28eb8f4c8015ed8ab_6.clone();
    }

    public static class11829 valueOf(String string) {
        return Enum.valueOf(class11829.class, string);
    }

    private static void u() {
    }

    private static void y() {
        strings_0242e1118e2fe3fc28eb8f4c8015ed8ab = new String[6];
        class11829.strings_0242e1118e2fe3fc28eb8f4c8015ed8ab[0] = "IDLE";
        class11829.strings_0242e1118e2fe3fc28eb8f4c8015ed8ab[1] = "REQUESTING";
        class11829.strings_0242e1118e2fe3fc28eb8f4c8015ed8ab[2] = "WAITING";
        class11829.strings_0242e1118e2fe3fc28eb8f4c8015ed8ab[3] = "PROCESSING";
        class11829.strings_0242e1118e2fe3fc28eb8f4c8015ed8ab[4] = "SUCCESS";
        class11829.strings_0242e1118e2fe3fc28eb8f4c8015ed8ab[5] = "ERROR";
    }

    private static /* synthetic */ class11829[] R() {
        return new class11829[]{staticFields_0242e1118e2fe3fc28eb8f4c8015ed8ab_0, staticFields_0242e1118e2fe3fc28eb8f4c8015ed8ab_1, staticFields_0242e1118e2fe3fc28eb8f4c8015ed8ab_2, staticFields_0242e1118e2fe3fc28eb8f4c8015ed8ab_3, staticFields_0242e1118e2fe3fc28eb8f4c8015ed8ab_4, staticFields_0242e1118e2fe3fc28eb8f4c8015ed8ab_5};
    }
}

