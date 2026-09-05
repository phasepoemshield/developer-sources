/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.MatchException
 *  org.jspecify.annotations.Nullable
 *  org.lwjgl.system.MemoryStack
 *  org.lwjgl.system.MemoryUtil
 */
package net.caffeinemc.mods.sodium.client.platform;

import java.nio.ByteBuffer;
import java.util.Objects;
import net.caffeinemc.mods.sodium.client.platform.MessageBox$IconType;
import net.caffeinemc.mods.sodium.client.platform.MessageBox$MessageBoxImpl;
import net.caffeinemc.mods.sodium.client.platform.NativeWindowHandle;
import net.caffeinemc.mods.sodium.client.platform.windows.api.Shell32;
import net.caffeinemc.mods.sodium.client.platform.windows.api.User32;
import net.caffeinemc.mods.sodium.client.platform.windows.api.msgbox.MsgBoxCallback;
import net.caffeinemc.mods.sodium.client.platform.windows.api.msgbox.MsgBoxParamSw;
import org.jspecify.annotations.Nullable;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;

class MessageBox$WindowsMessageBoxImpl
implements MessageBox$MessageBoxImpl {
    MessageBox$WindowsMessageBoxImpl() {
    }

    private static int getStyle(MessageBox$IconType messageBox$IconType, boolean bl) {
        int n;
        switch (messageBox$IconType.ordinal()) {
            default: {
                throw new MatchException(null, null);
            }
            case 0: {
                int n2 = 64;
                break;
            }
            case 1: {
                int n2 = 48;
                break;
            }
            case 2: {
                int n2 = n = 16;
            }
        }
        if (bl) {
            n |= 0x4000;
        }
        return n;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void showMessageBox(NativeWindowHandle nativeWindowHandle, MessageBox$IconType messageBox$IconType, String string, String string2, @Nullable String string3) {
        Objects.requireNonNull(string);
        Objects.requireNonNull(string2);
        Objects.requireNonNull(messageBox$IconType);
        MsgBoxCallback msgBoxCallback = string3 != null ? MsgBoxCallback.create(l -> Shell32.browseUrl(nativeWindowHandle, string3)) : null;
        long l2 = nativeWindowHandle != null ? nativeWindowHandle.getWin32Handle() : 0L;
        try (MemoryStack memoryStack = MemoryStack.stackPush();){
            ByteBuffer byteBuffer = memoryStack.malloc(MemoryUtil.memLengthUTF16((CharSequence)string2, (boolean)true));
            MemoryUtil.memUTF16((CharSequence)string2, (boolean)true, (ByteBuffer)byteBuffer);
            ByteBuffer byteBuffer2 = memoryStack.malloc(MemoryUtil.memLengthUTF16((CharSequence)string, (boolean)true));
            MemoryUtil.memUTF16((CharSequence)string, (boolean)true, (ByteBuffer)byteBuffer2);
            MsgBoxParamSw msgBoxParamSw = MsgBoxParamSw.allocate(memoryStack);
            msgBoxParamSw.setCbSize(MsgBoxParamSw.SIZEOF);
            msgBoxParamSw.setHWndOwner(l2);
            msgBoxParamSw.setText(byteBuffer);
            msgBoxParamSw.setCaption(byteBuffer2);
            msgBoxParamSw.setStyle(MessageBox$WindowsMessageBoxImpl.getStyle(messageBox$IconType, msgBoxCallback != null));
            msgBoxParamSw.setCallback(msgBoxCallback);
            User32.callMessageBoxIndirectW(msgBoxParamSw);
        }
        finally {
            if (msgBoxCallback != null) {
                msgBoxCallback.free();
            }
        }
    }
}

