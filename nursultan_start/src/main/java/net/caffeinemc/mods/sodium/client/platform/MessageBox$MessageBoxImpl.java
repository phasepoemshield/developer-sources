/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.caffeinemc.mods.sodium.client.compatibility.environment.OsUtils
 *  net.caffeinemc.mods.sodium.client.compatibility.environment.OsUtils$OperatingSystem
 *  org.jspecify.annotations.Nullable
 */
package net.caffeinemc.mods.sodium.client.platform;

import net.caffeinemc.mods.sodium.client.compatibility.environment.OsUtils;
import net.caffeinemc.mods.sodium.client.platform.MessageBox$IconType;
import net.caffeinemc.mods.sodium.client.platform.MessageBox$WindowsMessageBoxImpl;
import net.caffeinemc.mods.sodium.client.platform.NativeWindowHandle;
import org.jspecify.annotations.Nullable;

interface MessageBox$MessageBoxImpl {
    public static @Nullable MessageBox$MessageBoxImpl chooseImpl() {
        if (OsUtils.getOs() == OsUtils.OperatingSystem.WIN) {
            return new MessageBox$WindowsMessageBoxImpl();
        }
        return null;
    }

    public void showMessageBox(NativeWindowHandle var1, MessageBox$IconType var2, String var3, String var4, @Nullable String var5);
}

