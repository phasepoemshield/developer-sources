/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 *  minecraft.class00392
 *  minecraft.class00649
 *  minecraft.class03926
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  org.jspecify.annotations.Nullable
 */
package net.fabricmc.fabric.api.client.message.v1;

import com.mojang.authlib.GameProfile;
import java.time.Instant;
import minecraft.class00392;
import minecraft.class00649;
import minecraft.class03926;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import org.jspecify.annotations.Nullable;

@FunctionalInterface
@Environment(value=EnvType.CLIENT)
public interface ClientReceiveMessageEvents$ChatCanceled {
    public void onReceiveChatMessageCanceled(class00392 var1, @Nullable class03926 var2, @Nullable GameProfile var3, class00649 var4, Instant var5);
}

