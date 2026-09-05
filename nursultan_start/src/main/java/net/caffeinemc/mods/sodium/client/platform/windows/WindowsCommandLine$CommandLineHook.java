/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.system.MemoryUtil
 */
package net.caffeinemc.mods.sodium.client.platform.windows;

import java.nio.ByteBuffer;
import org.lwjgl.system.MemoryUtil;

class WindowsCommandLine$CommandLineHook {
    private final String cmdline;
    private final String cmdlineA;
    private final ByteBuffer cmdlineBuf;
    private final ByteBuffer cmdlineBufA;
    private boolean active = true;

    private WindowsCommandLine$CommandLineHook(String string, String string2, ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        this.cmdline = string;
        this.cmdlineA = string2;
        this.cmdlineBuf = byteBuffer;
        this.cmdlineBufA = byteBuffer2;
    }

    public void uninstall() {
        if (!this.active) {
            throw new IllegalStateException("Hook was already uninstalled");
        }
        MemoryUtil.memUTF16((CharSequence)this.cmdline, (boolean)true, (ByteBuffer)this.cmdlineBuf);
        MemoryUtil.memASCII((CharSequence)this.cmdlineA, (boolean)true, (ByteBuffer)this.cmdlineBufA);
        this.active = false;
    }
}

