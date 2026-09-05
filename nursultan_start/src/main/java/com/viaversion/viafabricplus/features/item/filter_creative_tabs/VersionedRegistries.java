/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator
 *  com.viaversion.viafabricplus.protocoltranslator.impl.ViaFabricPlusMappingDataLoader
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersionRange
 *  com.viaversion.viaversion.libs.gson.JsonObject
 *  it.unimi.dsi.fastutil.objects.Reference2ObjectMap
 *  it.unimi.dsi.fastutil.objects.Reference2ObjectOpenHashMap
 *  minecraft.class00412
 *  minecraft.class00751
 *  minecraft.class01683
 *  minecraft.class01894
 *  minecraft.class02477
 *  minecraft.class02484
 *  minecraft.class02708
 *  minecraft.class02710
 *  minecraft.class02717
 *  minecraft.class03556
 *  minecraft.class04206
 *  minecraft.class04227
 *  minecraft.class05946
 *  minecraft.class06202
 *  minecraft.class06517
 *  minecraft.class06581
 *  minecraft.class06584
 *  minecraft.class07055
 *  minecraft.class07084
 *  minecraft.class07304
 *  net.raphimc.vialegacy.api.LegacyProtocolVersion
 *  net.raphimc.vialegacy.protocol.classic.c0_30cpetoc0_28_30.data.ClassicProtocolExtension
 *  net.raphimc.vialegacy.protocol.classic.c0_30cpetoc0_28_30.storage.ExtensionProtocolMetadataStorage
 */
package com.viaversion.viafabricplus.features.item.filter_creative_tabs;

import com.viaversion.viafabricplus.features.classic.cpe_extension.CPEAdditions;
import com.viaversion.viafabricplus.injection.access.base.IConnection;
import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viafabricplus.protocoltranslator.impl.ViaFabricPlusMappingDataLoader;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersionRange;
import com.viaversion.viaversion.libs.gson.JsonObject;
import it.unimi.dsi.fastutil.objects.Reference2ObjectMap;
import it.unimi.dsi.fastutil.objects.Reference2ObjectOpenHashMap;
import java.util.Objects;
import minecraft.class00412;
import minecraft.class00751;
import minecraft.class01683;
import minecraft.class01894;
import minecraft.class02477;
import minecraft.class02484;
import minecraft.class02708;
import minecraft.class02710;
import minecraft.class02717;
import minecraft.class03556;
import minecraft.class04206;
import minecraft.class04227;
import minecraft.class05946;
import minecraft.class06202;
import minecraft.class06517;
import minecraft.class06581;
import minecraft.class06584;
import minecraft.class07055;
import minecraft.class07084;
import minecraft.class07304;
import net.raphimc.vialegacy.api.LegacyProtocolVersion;
import net.raphimc.vialegacy.protocol.classic.c0_30cpetoc0_28_30.data.ClassicProtocolExtension;
import net.raphimc.vialegacy.protocol.classic.c0_30cpetoc0_28_30.storage.ExtensionProtocolMetadataStorage;

public final class VersionedRegistries {
    public static final Reference2ObjectMap<class05946<class07304>, ProtocolVersionRange> ENCHANTMENT_DIFF = new Reference2ObjectOpenHashMap();
    public static final Reference2ObjectMap<class05946<class00412>, ProtocolVersionRange> PATTERN_DIFF = new Reference2ObjectOpenHashMap();
    public static final Reference2ObjectMap<class03556<class07084>, ProtocolVersionRange> EFFECT_DIFF = new Reference2ObjectOpenHashMap();
    public static final Reference2ObjectMap<class06581, ProtocolVersionRange> ITEM_DIFF = new Reference2ObjectOpenHashMap();

    public static void init() {
        JsonObject jsonObject = ViaFabricPlusMappingDataLoader.INSTANCE.loadData("versioned-registries.json");
        VersionedRegistries.fillKeys(jsonObject.getAsJsonObject("enchantments"), class04227.yR, ENCHANTMENT_DIFF);
        VersionedRegistries.fillKeys(jsonObject.getAsJsonObject("banner_patterns"), class04227.NF, PATTERN_DIFF);
        VersionedRegistries.fillEntries(jsonObject.getAsJsonObject("effects"), class04206.u, EFFECT_DIFF);
        VersionedRegistries.fillItems(jsonObject.getAsJsonObject("items"));
    }

    private static void fillItems(JsonObject jsonObject) {
        for (String string : jsonObject.keySet()) {
            ProtocolVersionRange protocolVersionRange = ProtocolVersionRange.fromString((String)jsonObject.get(string).getAsString());
            class06581 class065812 = class04206.B.y(class01894.N((String)string)).orElse(null);
            if (class065812 == null) {
                throw new IllegalStateException("Unknown item: " + string);
            }
            ITEM_DIFF.put((Object)class065812, (Object)protocolVersionRange);
        }
    }

    private static void fillKeys(JsonObject jsonObject, class05946 class059462, Reference2ObjectMap reference2ObjectMap) {
        for (String string : jsonObject.keySet()) {
            ProtocolVersionRange protocolVersionRange = ProtocolVersionRange.fromString((String)jsonObject.get(string).getAsString());
            class05946 class059463 = class05946.N((class05946)class059462, (class01894)class01894.N((String)string));
            reference2ObjectMap.put((Object)class059463, (Object)protocolVersionRange);
        }
    }

    public static boolean containsEffect(class03556<class07084> class035562, ProtocolVersion protocolVersion) {
        return !EFFECT_DIFF.containsKey(class035562) || ((ProtocolVersionRange)EFFECT_DIFF.get(class035562)).contains(protocolVersion);
    }

    public static boolean containsItem(class06581 class065812, ProtocolVersion protocolVersion) {
        return !ITEM_DIFF.containsKey((Object)class065812) || ((ProtocolVersionRange)ITEM_DIFF.get((Object)class065812)).contains(protocolVersion);
    }

    private static boolean filterEnchantments(class02477<class02710> class024772, class06584 class065842) {
        class02710 class027102 = (class02710)class065842.method_58694(class024772);
        if (class027102 != null) {
            for (class03556 class035562 : class027102.N()) {
                if (class035562.i().map(class059462 -> VersionedRegistries.containsEnchantment((class05946<class07304>)class059462, ProtocolTranslator.getTargetVersion())).orElse(true).booleanValue()) continue;
                return true;
            }
        }
        return false;
    }

    private static void fillEntries(JsonObject jsonObject, class00751<?> class007512, Reference2ObjectMap reference2ObjectMap) {
        for (String string : jsonObject.keySet()) {
            ProtocolVersionRange protocolVersionRange = ProtocolVersionRange.fromString((String)jsonObject.get(string).getAsString());
            class03556 class035562 = (class03556)class007512.L(class01894.N((String)string)).orElseThrow();
            reference2ObjectMap.put((Object)class035562, (Object)protocolVersionRange);
        }
    }

    public static boolean containsBannerPattern(class05946<class00412> class059462, ProtocolVersion protocolVersion) {
        return !PATTERN_DIFF.containsKey(class059462) || ((ProtocolVersionRange)PATTERN_DIFF.get(class059462)).contains(protocolVersion);
    }

    public static boolean containsEnchantment(class05946<class07304> class059462, ProtocolVersion protocolVersion) {
        return !ENCHANTMENT_DIFF.containsKey(class059462) || ((ProtocolVersionRange)ENCHANTMENT_DIFF.get(class059462)).contains(protocolVersion);
    }

    public static boolean keepItem(class06581 class065812) {
        if (ProtocolTranslator.getTargetVersion().equals((Object)LegacyProtocolVersion.c0_30cpe)) {
            class01683 class016832 = class06202.Nq().NE();
            if (class016832 == null) {
                return true;
            }
            ExtensionProtocolMetadataStorage extensionProtocolMetadataStorage = (ExtensionProtocolMetadataStorage)((IConnection)class016832.M()).viaFabricPlus$getUserConnection().get(ExtensionProtocolMetadataStorage.class);
            if (extensionProtocolMetadataStorage == null) {
                return false;
            }
            if (extensionProtocolMetadataStorage.hasServerExtension(ClassicProtocolExtension.CUSTOM_BLOCKS, new int[]{1}) && CPEAdditions.EXTENDED_CLASSIC_ITEMS.contains(class065812)) {
                return true;
            }
        }
        return VersionedRegistries.containsItem(class065812, ProtocolTranslator.getTargetVersion());
    }

    public static boolean keepItem(class06584 class065842) {
        class06517 class065172;
        if (!VersionedRegistries.keepItem(class065842.B())) {
            return false;
        }
        if (VersionedRegistries.filterEnchantments((class02477<class02710>)class02484.P, class065842)) {
            return false;
        }
        if (VersionedRegistries.filterEnchantments((class02477<class02710>)class02484.p, class065842)) {
            return false;
        }
        class02708 class027082 = (class02708)class065842.method_58694(class02484.Nv);
        if (class027082 != null) {
            class065172 = class027082.y().iterator();
            while (class065172.hasNext()) {
                class02717 class027172 = (class02717)class065172.next();
                if (class027172.y().i().map(class059462 -> VersionedRegistries.containsBannerPattern((class05946<class00412>)class059462, ProtocolTranslator.getTargetVersion())).orElse(true).booleanValue()) continue;
                return false;
            }
        }
        if ((class065172 = (class06517)class065842.method_58694(class02484.h)) != null) {
            for (class07055 class070552 : Objects.requireNonNull(class065172).N()) {
                if (VersionedRegistries.containsEffect((class03556<class07084>)class070552.L(), ProtocolTranslator.getTargetVersion())) continue;
                return false;
            }
        }
        return true;
    }
}

