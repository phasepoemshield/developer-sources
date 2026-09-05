/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10409
 *  minecraft.class00392
 *  minecraft.class00649
 *  minecraft.class02121
 *  minecraft.class02126
 *  minecraft.class02362
 *  minecraft.class02389
 *  minecraft.class05033
 *  minecraft.class05220
 */
package minecraft;

import Nursultan.class10409;
import java.util.function.IntFunction;
import minecraft.class00392;
import minecraft.class00649;
import minecraft.class02121;
import minecraft.class02126;
import minecraft.class02362;
import minecraft.class02389;
import minecraft.class05033;
import minecraft.class05220;

public class class04440
extends Enum<class04440>
implements class05033 {
    public Integer fields_0ec9e67d4a0683ab6bd6627d9711a269e_0;
    public String fields_0ec9e67d4a0683ab6bd6627d9711a269e_1;
    public class10409 fields_0ec9e67d4a0683ab6bd6627d9711a269e_2;
    public boolean fields_0ec9e67d4a0683ab6bd6627d9711a269e_init;
    public static final /* enum */ class04440 SENDER;
    public static final /* enum */ class04440 TARGET;
    public static final /* enum */ class04440 CONTENT;
    public static IntFunction staticFields_0ec9e67d4a0683ab6bd6627d9711a269e_3;
    public static Object staticFields_0ec9e67d4a0683ab6bd6627d9711a269e_4;
    public static class02362 staticFields_0ec9e67d4a0683ab6bd6627d9711a269e_5;
    private static final /* synthetic */ class04440[] $VALUES;

    private static void L() {
    }

    private static void M() {
        SENDER = null;
        TARGET = null;
        CONTENT = null;
        staticFields_0ec9e67d4a0683ab6bd6627d9711a269e_3 = null;
        staticFields_0ec9e67d4a0683ab6bd6627d9711a269e_4 = null;
        staticFields_0ec9e67d4a0683ab6bd6627d9711a269e_5 = null;
        $VALUES = null;
    }

    private class04440(int n2, String string2, class10409 class104092) {
        this.R();
        this.fields_0ec9e67d4a0683ab6bd6627d9711a269e_0 = n2;
        this.fields_0ec9e67d4a0683ab6bd6627d9711a269e_1 = string2;
        this.fields_0ec9e67d4a0683ab6bd6627d9711a269e_2 = class104092;
    }

    static {
        class04440.y();
        class04440.L();
        class04440.u();
        SENDER = new class04440(0, "sender", (class003922, class006492) -> class006492.y());
        TARGET = new class04440(1, "target", (class003922, class006492) -> class006492.L().orElse(class05220.N));
        CONTENT = new class04440(2, "content", (class003922, class006492) -> class003922);
        $VALUES = class04440.N();
        staticFields_0ec9e67d4a0683ab6bd6627d9711a269e_3 = class02121.N(class044402 -> class044402.fields_0ec9e67d4a0683ab6bd6627d9711a269e_0, (Object[])class04440.values(), (class02126)class02126.field_41664);
        staticFields_0ec9e67d4a0683ab6bd6627d9711a269e_4 = class05033.N(class04440::values);
        staticFields_0ec9e67d4a0683ab6bd6627d9711a269e_5 = class02389.N((IntFunction)staticFields_0ec9e67d4a0683ab6bd6627d9711a269e_3, class044402 -> class044402.fields_0ec9e67d4a0683ab6bd6627d9711a269e_0);
    }

    public static class04440[] values() {
        return (class04440[])$VALUES.clone();
    }

    public static class04440 valueOf(String string) {
        return Enum.valueOf(class04440.class, string);
    }

    private static void u() {
    }

    private static void y() {
    }

    private static /* synthetic */ class04440[] N() {
        return new class04440[]{SENDER, TARGET, CONTENT};
    }

    public class00392 N(class00392 class003922, class00649 class006492) {
        return this.fields_0ec9e67d4a0683ab6bd6627d9711a269e_2.select(class003922, class006492);
    }

    private void R() {
        if (!this.fields_0ec9e67d4a0683ab6bd6627d9711a269e_init) {
            this.fields_0ec9e67d4a0683ab6bd6627d9711a269e_init = true;
            this.fields_0ec9e67d4a0683ab6bd6627d9711a269e_0 = 0;
        }
    }

    public String method_15434() {
        return this.fields_0ec9e67d4a0683ab6bd6627d9711a269e_1;
    }
}

