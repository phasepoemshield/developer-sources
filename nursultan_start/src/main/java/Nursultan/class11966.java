/*
 * Decompiled with CFR 0.152.
 */
package Nursultan;

public class class11966
extends Enum<class11966> {
    private static String[] strings_0090476987a34349fa0f33a04d59e77da;
    public static class11966 staticFields_0090476987a34349fa0f33a04d59e77da_0;
    public static class11966 staticFields_0090476987a34349fa0f33a04d59e77da_1;
    public static class11966[] staticFields_0090476987a34349fa0f33a04d59e77da_2;

    static {
        class11966.N();
        class11966.y();
        staticFields_0090476987a34349fa0f33a04d59e77da_0 = new class11966();
        staticFields_0090476987a34349fa0f33a04d59e77da_1 = new class11966();
        staticFields_0090476987a34349fa0f33a04d59e77da_2 = class11966.i();
    }

    public static class11966[] values() {
        return (class11966[])staticFields_0090476987a34349fa0f33a04d59e77da_2.clone();
    }

    public static class11966 valueOf(String string) {
        return Enum.valueOf(class11966.class, string);
    }

    private static /* synthetic */ class11966[] i() {
        return new class11966[]{staticFields_0090476987a34349fa0f33a04d59e77da_0, staticFields_0090476987a34349fa0f33a04d59e77da_1};
    }

    private static void y() {
    }

    private static void N() {
        strings_0090476987a34349fa0f33a04d59e77da = new String[2];
        class11966.strings_0090476987a34349fa0f33a04d59e77da[0] = "IRC";
        class11966.strings_0090476987a34349fa0f33a04d59e77da[1] = "PARTY";
    }
}

