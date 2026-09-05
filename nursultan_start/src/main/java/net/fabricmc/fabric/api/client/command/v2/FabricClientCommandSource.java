/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class03448
 *  minecraft.class04453
 *  minecraft.class06202
 *  minecraft.class06889
 *  minecraft.class07049
 *  minecraft.class07109
 *  minecraft.class07689
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  org.jspecify.annotations.Nullable
 */
package net.fabricmc.fabric.api.client.command.v2;

import minecraft.class00392;
import minecraft.class03448;
import minecraft.class04453;
import minecraft.class06202;
import minecraft.class06889;
import minecraft.class07049;
import minecraft.class07109;
import minecraft.class07689;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import org.jspecify.annotations.Nullable;

@Environment(value=EnvType.CLIENT)
public interface FabricClientCommandSource
extends class07689 {
    default public class06889 getPosition() {
        return this.getPlayer().method_73189();
    }

    default public class07049 getEntity() {
        return this.getPlayer();
    }

    default public class07109 getRotation() {
        return this.getPlayer().method_5802();
    }

    public void sendError(class00392 var1);

    public class03448 getWorld();

    default public @Nullable Object getMeta(String string) {
        return null;
    }

    public void sendFeedback(class00392 var1);

    public class06202 getClient();

    public class04453 getPlayer();
}

