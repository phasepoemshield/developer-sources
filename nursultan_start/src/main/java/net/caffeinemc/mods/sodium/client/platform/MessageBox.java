/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
package net.caffeinemc.mods.sodium.client.platform;

import net.caffeinemc.mods.sodium.client.platform.MessageBox$IconType;
import net.caffeinemc.mods.sodium.client.platform.MessageBox$MessageBoxImpl;
import net.caffeinemc.mods.sodium.client.platform.NativeWindowHandle;
import org.jspecify.annotations.Nullable;

public class MessageBox {
    private static final @Nullable MessageBox$MessageBoxImpl IMPL = MessageBox$MessageBoxImpl.chooseImpl();

    public static void showMessageBox(NativeWindowHandle nativeWindowHandle, MessageBox$IconType messageBox$IconType, String string, String string2, @Nullable String string3) {
        if (IMPL != null) {
            IMPL.showMessageBox(nativeWindowHandle, messageBox$IconType, string, string2, string3);
        }
    }
}

