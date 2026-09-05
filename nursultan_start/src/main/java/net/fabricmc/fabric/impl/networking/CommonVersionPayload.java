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
package net.fabricmc.fabric.impl.networking;

import minecraft.class00667;
import minecraft.class01659;
import minecraft.class01666;
import minecraft.class01894;
import minecraft.class02362;

public record CommonVersionPayload(int[] versions) implements class01659
{
    public static final class02362<class00667, CommonVersionPayload> CODEC = class01659.N(CommonVersionPayload::write, CommonVersionPayload::new);
    public static final class01666<CommonVersionPayload> ID = new class01666(class01894.N((String)"c:version"));

    private CommonVersionPayload(class00667 class006672) {
        this(class006672.L());
    }

    public void write(class00667 class006672) {
        class006672.N(this.versions);
    }

    public class01666<? extends class01659> method_56479() {
        return ID;
    }
}

