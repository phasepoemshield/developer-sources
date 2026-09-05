/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.system.MemoryUtil
 */
package net.caffeinemc.mods.sodium.client.platform.windows.api.version;

import org.lwjgl.system.MemoryUtil;

public record LanguageCodePage(int languageId, int codePage) {
    static final int STRIDE = 4;

    static LanguageCodePage decode(long l) {
        int n = MemoryUtil.memGetInt((long)l);
        int n2 = n & 0xFFFF;
        int n3 = (n & 0xFFFF0000) >> 16;
        return new LanguageCodePage(n2, n3);
    }
}

