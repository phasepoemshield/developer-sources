/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.MapMaker
 *  com.mojang.authlib.GameProfile
 *  minecraft.class00502
 *  minecraft.class01032
 *  minecraft.class03737
 *  minecraft.class04770
 *  minecraft.class04782
 *  minecraft.class04907
 *  minecraft.class06237
 *  minecraft.class06695
 *  minecraft.class07049
 *  minecraft.class07072
 *  minecraft.class07209
 *  minecraft.class07267
 *  minecraft.class07299
 *  minecraft.class07862
 *  net.fabricmc.fabric.impl.event.interaction.FakePlayerNetworkHandler
 *  org.jspecify.annotations.Nullable
 */
package net.fabricmc.fabric.api.entity;

import com.google.common.collect.MapMaker;
import com.mojang.authlib.GameProfile;
import java.util.Map;
import java.util.Objects;
import java.util.OptionalInt;
import java.util.UUID;
import minecraft.class00502;
import minecraft.class01032;
import minecraft.class03737;
import minecraft.class04770;
import minecraft.class04782;
import minecraft.class04907;
import minecraft.class06237;
import minecraft.class06695;
import minecraft.class07049;
import minecraft.class07072;
import minecraft.class07209;
import minecraft.class07267;
import minecraft.class07299;
import minecraft.class07862;
import net.fabricmc.fabric.api.entity.FakePlayer$FakePlayerKey;
import net.fabricmc.fabric.impl.event.interaction.FakePlayerNetworkHandler;
import org.jspecify.annotations.Nullable;

public class FakePlayer
extends class04770 {
    public static final UUID DEFAULT_UUID = UUID.fromString("41C82C87-7AfB-4024-BA57-13D2C99CAE77");
    private static final GameProfile DEFAULT_PROFILE = new GameProfile(DEFAULT_UUID, "[Minecraft]");
    private static final Map<FakePlayer$FakePlayerKey, FakePlayer> FAKE_PLAYER_MAP = new MapMaker().weakValues().makeMap();

    public /* synthetic */ class07299 method_73183() {
        return super.method_51469();
    }

    public @Nullable class00502 method_5781() {
        return null;
    }

    public void method_5773() {
    }

    public boolean method_5873(class07049 class070492, boolean bl, boolean bl2) {
        return false;
    }

    public /* synthetic */ @Nullable class07049 method_5731(class01032 class010322) {
        return super.method_61275(class010322);
    }

    protected FakePlayer(class04782 class047822, GameProfile gameProfile) {
        super(class047822.method_8503(), class047822, gameProfile, class03737.N());
        this.field_13987 = new FakePlayerNetworkHandler((class04770)this);
    }

    public static FakePlayer get(class04782 class047822) {
        return FakePlayer.get(class047822, DEFAULT_PROFILE);
    }

    public static FakePlayer get(class04782 class047822, GameProfile gameProfile) {
        Objects.requireNonNull(class047822, "World may not be null.");
        Objects.requireNonNull(gameProfile, "Game profile may not be null.");
        return FAKE_PLAYER_MAP.computeIfAbsent(new FakePlayer$FakePlayerKey(class047822, gameProfile), fakePlayer$FakePlayerKey -> new FakePlayer(fakePlayer$FakePlayerKey.world, fakePlayer$FakePlayerKey.profile));
    }

    public void method_7266(class04907<?> class049072) {
    }

    public void method_7291(class07862 class078622, class06695 class066952) {
    }

    public OptionalInt method_17355(@Nullable class06237 class062372) {
        return OptionalInt.empty();
    }

    public void method_7342(class04907<?> class049072, int n) {
    }

    public void method_7311(class07267 class072672, boolean bl) {
    }

    public boolean method_5679(class04782 class047822, class07072 class070722) {
        return true;
    }

    public void method_18403(class07209 class072092) {
    }

    public void method_14213(class03737 class037372) {
    }
}

