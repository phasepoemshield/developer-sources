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
package squeek.appleskin.network;

import minecraft.class00667;
import minecraft.class01659;
import minecraft.class01666;
import minecraft.class01894;
import minecraft.class02362;

public record ExhaustionSyncPayload(float exhaustion) implements class01659
{
    public static final class02362<class00667, ExhaustionSyncPayload> CODEC = class01659.N(ExhaustionSyncPayload::write, ExhaustionSyncPayload::new);
    public static final class01666<ExhaustionSyncPayload> ID = new class01666(class01894.N((String)"appleskin", (String)"exhaustion"));

    public ExhaustionSyncPayload(class00667 class006672) {
        this(class006672.readFloat());
    }

    public void write(class00667 class006672) {
        class006672.writeFloat(this.exhaustion);
    }

    public class01666<? extends class01659> method_56479() {
        return ID;
    }

    public float getExhaustion() {
        return this.exhaustion;
    }
}

