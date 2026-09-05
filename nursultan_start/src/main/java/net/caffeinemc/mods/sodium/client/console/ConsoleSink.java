/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.NonNull
 */
package net.caffeinemc.mods.sodium.client.console;

import net.caffeinemc.mods.sodium.client.console.message.MessageLevel;
import org.jspecify.annotations.NonNull;

public interface ConsoleSink {
    public void logMessage(@NonNull MessageLevel var1, @NonNull String var2, boolean var3, double var4);
}

