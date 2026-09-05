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

import java.util.HashSet;
import java.util.Set;
import minecraft.class00667;
import minecraft.class01659;
import minecraft.class01666;
import minecraft.class01894;
import minecraft.class02362;

public record CommonRegisterPayload(int version, String phase, Set<class01894> channels) implements class01659
{
    public static final class01666<CommonRegisterPayload> ID = new class01666(class01894.N((String)"c:register"));
    public static final class02362<class00667, CommonRegisterPayload> CODEC = class01659.N(CommonRegisterPayload::write, CommonRegisterPayload::new);
    public static final String PLAY_PHASE = "play";
    public static final String CONFIGURATION_PHASE = "configuration";

    private CommonRegisterPayload(class00667 class006672) {
        this(class006672.E(), class006672.s(), (Set)class006672.N_15(HashSet::new, class00667::T));
    }

    public void write(class00667 class006672) {
        class006672.L(this.version);
        class006672.N(this.phase);
        class006672.N_12(this.channels, class00667::N);
    }

    public class01666<CommonRegisterPayload> method_56479() {
        return ID;
    }
}

