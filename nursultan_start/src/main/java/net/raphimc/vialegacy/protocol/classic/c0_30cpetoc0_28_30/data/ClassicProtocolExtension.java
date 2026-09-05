/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viafabricplus.features.classic.cpe_extension.CPEAdditions
 *  com.viaversion.viaversion.libs.fastutil.ints.IntIterator
 *  com.viaversion.viaversion.libs.fastutil.ints.IntOpenHashSet
 *  com.viaversion.viaversion.libs.fastutil.ints.IntSet
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package net.raphimc.vialegacy.protocol.classic.c0_30cpetoc0_28_30.data;

import com.viaversion.viafabricplus.features.classic.cpe_extension.CPEAdditions;
import com.viaversion.viaversion.libs.fastutil.ints.IntIterator;
import com.viaversion.viaversion.libs.fastutil.ints.IntOpenHashSet;
import com.viaversion.viaversion.libs.fastutil.ints.IntSet;
import java.util.Arrays;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public enum ClassicProtocolExtension {
    CLICK_DISTANCE("ClickDistance", new int[0]),
    CUSTOM_BLOCKS("CustomBlocks", 1),
    HELD_BLOCK("HeldBlock", new int[0]),
    TEXT_HOT_KEY("TextHotKey", new int[0]),
    EXT_PLAYER_LIST("ExtPlayerList", new int[0]),
    ENV_COLORS("EnvColors", new int[0]),
    SELECTION_CUBOID("SelectionCuboid", new int[0]),
    BLOCK_PERMISSIONS("BlockPermissions", 1),
    CHANGE_MODEL("ChangeModel", new int[0]),
    ENV_MAP_APPEARANCE("EnvMapAppearance", new int[0]),
    ENV_WEATHER_TYPE("EnvWeatherType", new int[0]),
    HACK_CONTROL("HackControl", 1),
    EMOTE_FIX("EmoteFix", 1),
    MESSAGE_TYPES("MessageTypes", new int[0]),
    LONGER_MESSAGES("LongerMessages", 1),
    FULL_CP437("FullCP437", 1),
    BLOCK_DEFINITIONS("BlockDefinitions", new int[0]),
    BLOCK_DEFINITIONS_EXT("BlockDefinitionsExt", new int[0]),
    TEXT_COLORS("TextColors", new int[0]),
    BULK_BLOCK_UPDATE("BulkBlockUpdate", 1),
    ENV_MAP_ASPECT("EnvMapAspect", new int[0]),
    PLAYER_CLICK("PlayerClick", new int[0]),
    ENTITY_PROPERTY("EntityProperty", new int[0]),
    EXT_ENTITY_POSITIONS("ExtEntityPositions", new int[0]),
    TWO_WAY_PING("TwoWayPing", 1),
    INVENTORY_ORDER("InventoryOrder", new int[0]),
    INSTANT_MOTD("InstantMOTD", 1),
    EXTENDED_BLOCKS("ExtendedBlocks", new int[0]),
    FAST_MAP("FastMap", new int[0]),
    EXTENDED_TEXTURES("ExtendedTextures", new int[0]),
    SET_HOTBAR("SetHotbar", new int[0]),
    SET_SPAWNPOINT("SetSpawnpoint", new int[0]),
    VELOCITY_CONTROL("VelocityControl", new int[0]),
    CUSTOM_PARTICLES("CustomParticles", new int[0]),
    CUSTOM_MODELS("CustomModels", new int[0]),
    EXT_ENTITY_TELEPORT("ExtEntityTeleport", new int[0]);

    private final String name;
    private final IntSet supportedVersions;

    private ClassicProtocolExtension(String string2, int ... nArray) {
        this.name = string2;
        this.supportedVersions = new IntOpenHashSet();
        for (int n2 : nArray) {
            this.supportedVersions.add(n2);
        }
    }

    public String toString() {
        return this.name;
    }

    public String getName() {
        return this.name;
    }

    public boolean isSupported() {
        CallbackInfoReturnable callbackInfoReturnable = new CallbackInfoReturnable("", true);
        this.handler$dfi000$viafabricplus$allowExtensions_isSupported(callbackInfoReturnable);
        if (callbackInfoReturnable.isCancelled()) {
            return callbackInfoReturnable.getReturnValueZ();
        }
        return !this.supportedVersions.isEmpty();
    }

    public boolean supportsVersion(int n) {
        CallbackInfoReturnable callbackInfoReturnable = new CallbackInfoReturnable("", true);
        this.handler$dfi000$viafabricplus$allowExtensions_supportsVersion(n, callbackInfoReturnable);
        if (callbackInfoReturnable.isCancelled()) {
            return callbackInfoReturnable.getReturnValueZ();
        }
        return this.supportedVersions.contains(n);
    }

    public static ClassicProtocolExtension byNameAndVersion(String string, int n) {
        ClassicProtocolExtension classicProtocolExtension = ClassicProtocolExtension.byName(string);
        if (classicProtocolExtension == null || !classicProtocolExtension.supportsVersion(n)) {
            return null;
        }
        return classicProtocolExtension;
    }

    private void handler$dfi000$viafabricplus$allowExtensions_isSupported(CallbackInfoReturnable callbackInfoReturnable) {
        if (CPEAdditions.ALLOWED_EXTENSIONS.contains((Object)this)) {
            callbackInfoReturnable.setReturnValue((Object)true);
        }
    }

    private void handler$dfi000$viafabricplus$allowExtensions_supportsVersion(int n, CallbackInfoReturnable callbackInfoReturnable) {
        if (CPEAdditions.ALLOWED_EXTENSIONS.contains((Object)this)) {
            callbackInfoReturnable.setReturnValue((Object)true);
        }
    }

    public int getHighestSupportedVersion() {
        CallbackInfoReturnable callbackInfoReturnable = new CallbackInfoReturnable("", true);
        this.handler$dfi000$viafabricplus$allowExtensions_getHighestSupportedVersion(callbackInfoReturnable);
        if (callbackInfoReturnable.isCancelled()) {
            return callbackInfoReturnable.getReturnValueI();
        }
        int n = 0;
        IntIterator intIterator = this.supportedVersions.iterator();
        while (intIterator.hasNext()) {
            int n2 = (Integer)intIterator.next();
            if (n2 <= n) continue;
            n = n2;
        }
        return n;
    }

    public IntSet getSupportedVersions() {
        return this.supportedVersions;
    }

    private void handler$dfi000$viafabricplus$allowExtensions_getHighestSupportedVersion(CallbackInfoReturnable callbackInfoReturnable) {
        if (CPEAdditions.ALLOWED_EXTENSIONS.contains((Object)this)) {
            callbackInfoReturnable.setReturnValue((Object)1);
        }
    }

    public static ClassicProtocolExtension byName(String string) {
        return Arrays.stream(ClassicProtocolExtension.values()).filter(classicProtocolExtension -> classicProtocolExtension.name.equals(string)).findFirst().orElse(null);
    }
}

