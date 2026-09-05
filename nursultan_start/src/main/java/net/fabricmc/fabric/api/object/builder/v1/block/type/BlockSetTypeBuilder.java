/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01894
 *  minecraft.class01960
 *  minecraft.class01963
 *  minecraft.class04891
 *  minecraft.class04909
 *  minecraft.class07752
 */
package net.fabricmc.fabric.api.object.builder.v1.block.type;

import minecraft.class01894;
import minecraft.class01960;
import minecraft.class01963;
import minecraft.class04891;
import minecraft.class04909;
import minecraft.class07752;

public final class BlockSetTypeBuilder {
    private boolean openableByHand = true;
    private boolean openableByWindCharge = true;
    private boolean buttonActivatedByArrows = true;
    private class01963 pressurePlateActivationRule = class01963.field_11361;
    private class07752 soundGroup = class07752.y;
    private class04891 doorCloseSound = class04909.Jz;
    private class04891 doorOpenSound = class04909.JU;
    private class04891 trapdoorCloseSound = class04909.JE;
    private class04891 trapdoorOpenSound = class04909.JW;
    private class04891 pressurePlateClickOffSound = class04909.Js;
    private class04891 pressurePlateClickOnSound = class04909.JT;
    private class04891 buttonClickOffSound = class04909.Jm;
    private class04891 buttonClickOnSound = class04909.JP;

    public static BlockSetTypeBuilder copyOf(BlockSetTypeBuilder blockSetTypeBuilder) {
        BlockSetTypeBuilder blockSetTypeBuilder2 = new BlockSetTypeBuilder();
        blockSetTypeBuilder2.openableByHand(blockSetTypeBuilder.openableByHand);
        blockSetTypeBuilder2.openableByWindCharge(blockSetTypeBuilder.openableByWindCharge);
        blockSetTypeBuilder2.buttonActivatedByArrows(blockSetTypeBuilder.buttonActivatedByArrows);
        blockSetTypeBuilder2.pressurePlateActivationRule(blockSetTypeBuilder.pressurePlateActivationRule);
        blockSetTypeBuilder2.soundGroup(blockSetTypeBuilder.soundGroup);
        blockSetTypeBuilder2.doorCloseSound(blockSetTypeBuilder.doorCloseSound);
        blockSetTypeBuilder2.doorOpenSound(blockSetTypeBuilder.doorOpenSound);
        blockSetTypeBuilder2.trapdoorCloseSound(blockSetTypeBuilder.trapdoorCloseSound);
        blockSetTypeBuilder2.trapdoorOpenSound(blockSetTypeBuilder.trapdoorOpenSound);
        blockSetTypeBuilder2.pressurePlateClickOffSound(blockSetTypeBuilder.pressurePlateClickOffSound);
        blockSetTypeBuilder2.pressurePlateClickOnSound(blockSetTypeBuilder.pressurePlateClickOnSound);
        blockSetTypeBuilder2.buttonClickOffSound(blockSetTypeBuilder.buttonClickOffSound);
        blockSetTypeBuilder2.buttonClickOnSound(blockSetTypeBuilder.buttonClickOnSound);
        return blockSetTypeBuilder2;
    }

    public static BlockSetTypeBuilder copyOf(class01960 class019602) {
        BlockSetTypeBuilder blockSetTypeBuilder = new BlockSetTypeBuilder();
        blockSetTypeBuilder.openableByHand(class019602.L());
        blockSetTypeBuilder.openableByWindCharge(class019602.u());
        blockSetTypeBuilder.buttonActivatedByArrows(class019602.i());
        blockSetTypeBuilder.pressurePlateActivationRule(class019602.R());
        blockSetTypeBuilder.soundGroup(class019602.M());
        blockSetTypeBuilder.doorCloseSound(class019602.B());
        blockSetTypeBuilder.doorOpenSound(class019602.Z());
        blockSetTypeBuilder.trapdoorCloseSound(class019602.z());
        blockSetTypeBuilder.trapdoorOpenSound(class019602.U());
        blockSetTypeBuilder.pressurePlateClickOffSound(class019602.E());
        blockSetTypeBuilder.pressurePlateClickOnSound(class019602.W());
        blockSetTypeBuilder.buttonClickOffSound(class019602.m());
        blockSetTypeBuilder.buttonClickOnSound(class019602.P());
        return blockSetTypeBuilder;
    }

    public class01960 register(class01894 class018942) {
        return class01960.N((class01960)this.build(class018942));
    }

    public class01960 build(class01894 class018942) {
        return new class01960(class018942.toString(), this.openableByHand, this.openableByWindCharge, this.buttonActivatedByArrows, this.pressurePlateActivationRule, this.soundGroup, this.doorCloseSound, this.doorOpenSound, this.trapdoorCloseSound, this.trapdoorOpenSound, this.pressurePlateClickOffSound, this.pressurePlateClickOnSound, this.buttonClickOffSound, this.buttonClickOnSound);
    }

    public BlockSetTypeBuilder pressurePlateClickOnSound(class04891 class048912) {
        this.pressurePlateClickOnSound = class048912;
        return this;
    }

    public BlockSetTypeBuilder openableByWindCharge(boolean bl) {
        this.openableByWindCharge = bl;
        return this;
    }

    public BlockSetTypeBuilder buttonActivatedByArrows(boolean bl) {
        this.buttonActivatedByArrows = bl;
        return this;
    }

    public BlockSetTypeBuilder buttonClickOffSound(class04891 class048912) {
        this.buttonClickOffSound = class048912;
        return this;
    }

    public BlockSetTypeBuilder pressurePlateClickOffSound(class04891 class048912) {
        this.pressurePlateClickOffSound = class048912;
        return this;
    }

    public BlockSetTypeBuilder pressurePlateActivationRule(class01963 class019632) {
        this.pressurePlateActivationRule = class019632;
        return this;
    }

    public BlockSetTypeBuilder soundGroup(class07752 class077522) {
        this.soundGroup = class077522;
        return this;
    }

    public BlockSetTypeBuilder doorCloseSound(class04891 class048912) {
        this.doorCloseSound = class048912;
        return this;
    }

    public BlockSetTypeBuilder doorOpenSound(class04891 class048912) {
        this.doorOpenSound = class048912;
        return this;
    }

    public BlockSetTypeBuilder openableByHand(boolean bl) {
        this.openableByHand = bl;
        return this;
    }

    public BlockSetTypeBuilder buttonClickOnSound(class04891 class048912) {
        this.buttonClickOnSound = class048912;
        return this;
    }

    public BlockSetTypeBuilder trapdoorOpenSound(class04891 class048912) {
        this.trapdoorOpenSound = class048912;
        return this;
    }

    public BlockSetTypeBuilder trapdoorCloseSound(class04891 class048912) {
        this.trapdoorCloseSound = class048912;
        return this;
    }
}

