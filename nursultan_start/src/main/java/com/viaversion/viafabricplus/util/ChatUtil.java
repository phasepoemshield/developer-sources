/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00388
 *  minecraft.class00392
 *  minecraft.class01056
 *  minecraft.class06202
 *  minecraft.class06541
 */
package com.viaversion.viafabricplus.util;

import minecraft.class00388;
import minecraft.class00392;
import minecraft.class01056;
import minecraft.class06202;
import minecraft.class06541;

public final class ChatUtil {
    public static final String PREFIX = String.valueOf(class06541.field_1068) + "[" + String.valueOf(class06541.field_1065) + "ViaFabricPlus" + String.valueOf(class06541.field_1068) + "]";
    public static final class00392 PREFIX_TEXT = class00392.y((String)"[").N(class06541.field_1068).y((class00392)class00392.y((String)"ViaFabricPlus").N(class06541.field_1065)).i("]");

    public static String uncoverTranslationKey(class00392 class003922) {
        return ((class00388)class003922.method_10851()).y();
    }

    public static void sendPrefixedMessage(class00392 class003922) {
        if (class06202.Nq().E_()) {
            ((class01056)class06202.Nq().i_6).i().N(ChatUtil.prefixText(class003922));
        } else {
            class06202.Nq().execute(() -> ChatUtil.sendPrefixedMessage(class003922));
        }
    }

    public static class00392 prefixText(String string) {
        return ChatUtil.prefixText(class00392.N((String)string));
    }

    public static class00392 prefixText(class00392 class003922) {
        return class00392.i().y(PREFIX_TEXT).i(" ").y(class003922);
    }
}

