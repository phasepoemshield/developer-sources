/*
 * Decompiled with CFR 0.152.
 */
package Nursultan;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class class11296
extends Enum<class11296> {
    public String fields_02f6c99f84f9d30b495ee8f6f8aacc3b5_0;
    public static final /* enum */ class11296 SYNCED = new class11296("synced");
    public static final /* enum */ class11296 DIRTY = new class11296("dirty");
    public static final /* enum */ class11296 LOCAL = new class11296("local");
    public static final /* enum */ class11296 DELETING = new class11296("deleting");
    public static Object staticFields_02f6c99f84f9d30b495ee8f6f8aacc3b5_4;
    private static final /* synthetic */ class11296[] $VALUES;

    private void L() {
    }

    private class11296(String string2) {
        this.L();
        this.fields_02f6c99f84f9d30b495ee8f6f8aacc3b5_0 = string2;
    }

    static {
        $VALUES = class11296.R();
        Stream<class11296> stream = Arrays.stream(class11296.values());
        Function<class11296, String> function = class11296::N;
        staticFields_02f6c99f84f9d30b495ee8f6f8aacc3b5_4 = stream.collect(Collectors.toMap(function, Function.identity()));
    }

    public static class11296[] values() {
        return (class11296[])$VALUES.clone();
    }

    public static class11296 valueOf(String string) {
        return Enum.valueOf(class11296.class, string);
    }

    private static void u() {
        SYNCED = null;
        DIRTY = null;
        LOCAL = null;
        DELETING = null;
        staticFields_02f6c99f84f9d30b495ee8f6f8aacc3b5_4 = null;
        $VALUES = null;
    }

    public static class11296 N(String string) {
        return (class11296)((Object)((Map)staticFields_02f6c99f84f9d30b495ee8f6f8aacc3b5_4).get(string));
    }

    public String N() {
        return this.fields_02f6c99f84f9d30b495ee8f6f8aacc3b5_0;
    }

    private static /* synthetic */ class11296[] R() {
        return new class11296[]{SYNCED, DIRTY, LOCAL, DELETING};
    }
}

