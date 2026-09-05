/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.arguments.StringArgumentType$StringType
 */
package minecraft;

import com.mojang.brigadier.arguments.StringArgumentType;

class class07197 {
    static final /* synthetic */ int[] N;

    static {
        N = new int[StringArgumentType.StringType.values().length];
        try {
            class07197.N[StringArgumentType.StringType.SINGLE_WORD.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            class07197.N[StringArgumentType.StringType.QUOTABLE_PHRASE.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            class07197.N[StringArgumentType.StringType.GREEDY_PHRASE.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}

