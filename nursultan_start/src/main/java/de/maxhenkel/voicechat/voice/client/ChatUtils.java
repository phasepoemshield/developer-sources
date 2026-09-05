/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.intercompatibility.CommonCompatibilityManager
 *  javax.annotation.Nullable
 *  minecraft.class00390
 *  minecraft.class00392
 *  minecraft.class00395
 *  minecraft.class00401
 *  minecraft.class01056
 *  minecraft.class05216
 *  minecraft.class06202
 *  minecraft.class06541
 */
package de.maxhenkel.voicechat.voice.client;

import de.maxhenkel.voicechat.intercompatibility.CommonCompatibilityManager;
import javax.annotation.Nullable;
import minecraft.class00390;
import minecraft.class00392;
import minecraft.class00395;
import minecraft.class00401;
import minecraft.class01056;
import minecraft.class05216;
import minecraft.class06202;
import minecraft.class06541;

public class ChatUtils {
    public static void sendModErrorMessage(String string) {
        ChatUtils.sendModErrorMessage(string, (String)null);
    }

    public static void sendModErrorMessage(String string, @Nullable Exception exception) {
        ChatUtils.sendModErrorMessage(string, exception == null ? null : exception.getMessage());
    }

    public static void sendModErrorMessage(String string, @Nullable String string2) {
        class05216 class052162 = ChatUtils.createModMessage((class00392)class00392.L((String)string).N(class06541.field_1061)).N(class004052 -> {
            if (string2 != null) {
                return class004052.N((class00395)new class00401((class00392)class00392.y((String)string2).N(class06541.field_1061)));
            }
            return class004052;
        });
        ChatUtils.sendPlayerMessage((class00392)class052162);
    }

    public static void sendModMessage(class00392 class003922) {
        ChatUtils.sendPlayerMessage((class00392)ChatUtils.createModMessage(class003922));
    }

    public static void sendPlayerMessage(class00392 class003922) {
        ((class01056)class06202.Nq().i_6).i().N(class003922);
    }

    public static class05216 createModMessage(class00392 class003922) {
        return class00392.i().y((class00392)class00390.N((class00392)class00392.y((String)CommonCompatibilityManager.INSTANCE.getModName())).N(class06541.field_1060)).i(" ").y(class003922);
    }
}

