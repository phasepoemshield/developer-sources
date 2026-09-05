/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01894
 *  minecraft.class01960
 *  minecraft.class04891
 *  minecraft.class04909
 *  minecraft.class05904
 *  minecraft.class07752
 */
package net.fabricmc.fabric.api.object.builder.v1.block.type;

import minecraft.class01894;
import minecraft.class01960;
import minecraft.class04891;
import minecraft.class04909;
import minecraft.class05904;
import minecraft.class07752;

public final class WoodTypeBuilder {
    private class07752 soundGroup = class07752.y;
    private class07752 hangingSignSoundGroup = class07752.NA;
    private class04891 fenceGateCloseSound = class04909.Ut;
    private class04891 fenceGateOpenSound = class04909.UG;

    public static WoodTypeBuilder copyOf(WoodTypeBuilder woodTypeBuilder) {
        WoodTypeBuilder woodTypeBuilder2 = new WoodTypeBuilder();
        woodTypeBuilder2.soundGroup(woodTypeBuilder.soundGroup);
        woodTypeBuilder2.hangingSignSoundGroup(woodTypeBuilder.hangingSignSoundGroup);
        woodTypeBuilder2.fenceGateCloseSound(woodTypeBuilder.fenceGateCloseSound);
        woodTypeBuilder2.fenceGateOpenSound(woodTypeBuilder.fenceGateOpenSound);
        return woodTypeBuilder2;
    }

    public static WoodTypeBuilder copyOf(class05904 class059042) {
        WoodTypeBuilder woodTypeBuilder = new WoodTypeBuilder();
        woodTypeBuilder.soundGroup(class059042.u());
        woodTypeBuilder.hangingSignSoundGroup(class059042.i());
        woodTypeBuilder.fenceGateCloseSound(class059042.R());
        woodTypeBuilder.fenceGateOpenSound(class059042.M());
        return woodTypeBuilder;
    }

    public class05904 register(class01894 class018942, class01960 class019602) {
        return class05904.N((class05904)this.build(class018942, class019602));
    }

    public class05904 build(class01894 class018942, class01960 class019602) {
        return new class05904(class018942.toString(), class019602, this.soundGroup, this.hangingSignSoundGroup, this.fenceGateCloseSound, this.fenceGateOpenSound);
    }

    public WoodTypeBuilder hangingSignSoundGroup(class07752 class077522) {
        this.hangingSignSoundGroup = class077522;
        return this;
    }

    public WoodTypeBuilder fenceGateCloseSound(class04891 class048912) {
        this.fenceGateCloseSound = class048912;
        return this;
    }

    public WoodTypeBuilder soundGroup(class07752 class077522) {
        this.soundGroup = class077522;
        return this;
    }

    public WoodTypeBuilder fenceGateOpenSound(class04891 class048912) {
        this.fenceGateOpenSound = class048912;
        return this;
    }
}

