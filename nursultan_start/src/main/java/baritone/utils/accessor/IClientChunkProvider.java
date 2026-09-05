/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01688
 */
package baritone.utils.accessor;

import baritone.utils.accessor.IChunkArray;
import minecraft.class01688;

public interface IClientChunkProvider {
    public IChunkArray extractReferenceArray();

    public class01688 createThreadSafeCopy();
}

