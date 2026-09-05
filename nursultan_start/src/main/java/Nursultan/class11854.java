/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class11072
 */
package Nursultan;

import Nursultan.class11072;

public class class11854
extends Enum<class11854> {
    public static final /* enum */ class11854 COMBAT;
    public static final /* enum */ class11854 MOVEMENT;
    public static final /* enum */ class11854 VISUAL;
    public static final /* enum */ class11854 PLAYER;
    public static final /* enum */ class11854 MISC;
    public static final /* enum */ class11854 CONFIGS;
    public static final /* enum */ class11854 AUTO_BUY;
    public class11072 fields_0f20a130fa3103c9f92e009459f1b1f98_0;
    public static final /* enum */ class11854 ACCOUNTS;
    private static final /* synthetic */ class11854[] $VALUES;

    private static void M() {
    }

    private class11854(class11072 class110722) {
        this.R();
        this.fields_0f20a130fa3103c9f92e009459f1b1f98_0 = class110722;
    }

    static {
        class11854.M();
        COMBAT = new class11854(class11072.COMBAT);
        MOVEMENT = new class11854(class11072.MOVEMENT);
        VISUAL = new class11854(class11072.VISUAL);
        PLAYER = new class11854(class11072.PLAYER);
        MISC = new class11854(class11072.MISC);
        CONFIGS = new class11854(null);
        AUTO_BUY = new class11854(null);
        ACCOUNTS = new class11854(null);
        $VALUES = class11854.B();
    }

    public static class11854[] values() {
        return (class11854[])$VALUES.clone();
    }

    public static class11854 valueOf(String string) {
        return Enum.valueOf(class11854.class, string);
    }

    private static /* synthetic */ class11854[] B() {
        return new class11854[]{COMBAT, MOVEMENT, VISUAL, PLAYER, MISC, CONFIGS, AUTO_BUY, ACCOUNTS};
    }

    public class11072 N() {
        return this.fields_0f20a130fa3103c9f92e009459f1b1f98_0;
    }

    public static class11854 N(class11072 class110722) {
        for (class11854 class118542 : class11854.values()) {
            if (class118542.fields_0f20a130fa3103c9f92e009459f1b1f98_0 != class110722) continue;
            return class118542;
        }
        return null;
    }

    private void R() {
    }
}

