/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00667
 *  minecraft.class01659
 *  minecraft.class01666
 *  minecraft.class01894
 *  minecraft.class02362
 */
package net.fabricmc.fabric.impl.registry.sync;

import minecraft.class00667;
import minecraft.class01659;
import minecraft.class01666;
import minecraft.class01894;
import minecraft.class02362;

public class SyncCompletePayload
implements class01659 {
    public static final SyncCompletePayload INSTANCE = new SyncCompletePayload();
    public static final class01666<SyncCompletePayload> ID = new class01666(class01894.N((String)"fabric", (String)"registry/sync/complete"));
    public static final class02362<class00667, SyncCompletePayload> CODEC = class02362.N((Object)INSTANCE);

    private SyncCompletePayload() {
    }

    public class01666<? extends class01659> method_56479() {
        return ID;
    }
}

