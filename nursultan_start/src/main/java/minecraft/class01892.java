/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class01022
 *  minecraft.class02090
 *  minecraft.class02243
 *  minecraft.class03458
 *  minecraft.class03767
 *  minecraft.class04568
 *  minecraft.class05096
 *  minecraft.class05384
 *  minecraft.class06467
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.authlib.GameProfile;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Map;
import java.util.UUID;
import minecraft.class01022;
import minecraft.class01894;
import minecraft.class02090;
import minecraft.class02243;
import minecraft.class03458;
import minecraft.class03767;
import minecraft.class04568;
import minecraft.class05096;
import minecraft.class05384;
import minecraft.class06467;
import org.jspecify.annotations.Nullable;

public final class class01892
extends Record {
    private final class05384 levelLoadTracker;
    private final GameProfile localGameProfile;
    private final class02090 telemetryManager;
    private final class01022 receivedRegistries;
    private final class03767 enabledFeatures;
    private final @Nullable String serverBrand;
    private final @Nullable class04568 serverData;
    private final @Nullable class05096 postDisconnectScreen;
    private final Map<class01894, byte[]> serverCookies;
    private final @Nullable class06467 chatState;
    private final Map<String, String> customReportDetails;
    private final class02243 serverLinks;
    private final Map<UUID, class03458> seenPlayers;
    private final boolean seenInsecureChatWarning;

    public class02090 L() {
        return this.telemetryManager;
    }

    public @Nullable class04568 M() {
        return this.serverData;
    }

    public class01892(class05384 class053842, GameProfile gameProfile, class02090 class020902, class01022 class010222, class03767 class037672, @Nullable String string, @Nullable class04568 class045682, @Nullable class05096 class050962, Map<class01894, byte[]> map, @Nullable class06467 class064672, Map<String, String> map2, class02243 class022432, Map<UUID, class03458> map3, boolean bl) {
        this.levelLoadTracker = class053842;
        this.localGameProfile = gameProfile;
        this.telemetryManager = class020902;
        this.receivedRegistries = class010222;
        this.enabledFeatures = class037672;
        this.serverBrand = string;
        this.serverData = class045682;
        this.postDisconnectScreen = class050962;
        this.serverCookies = map;
        this.chatState = class064672;
        this.customReportDetails = map2;
        this.serverLinks = class022432;
        this.seenPlayers = map3;
        this.seenInsecureChatWarning = bl;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class01892.class, "levelLoadTracker;localGameProfile;telemetryManager;receivedRegistries;enabledFeatures;serverBrand;serverData;postDisconnectScreen;serverCookies;chatState;customReportDetails;serverLinks;seenPlayers;seenInsecureChatWarning", "levelLoadTracker", "localGameProfile", "telemetryManager", "receivedRegistries", "enabledFeatures", "serverBrand", "serverData", "postDisconnectScreen", "serverCookies", "chatState", "customReportDetails", "serverLinks", "seenPlayers", "seenInsecureChatWarning"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class01892.class, "levelLoadTracker;localGameProfile;telemetryManager;receivedRegistries;enabledFeatures;serverBrand;serverData;postDisconnectScreen;serverCookies;chatState;customReportDetails;serverLinks;seenPlayers;seenInsecureChatWarning", "levelLoadTracker", "localGameProfile", "telemetryManager", "receivedRegistries", "enabledFeatures", "serverBrand", "serverData", "postDisconnectScreen", "serverCookies", "chatState", "customReportDetails", "serverLinks", "seenPlayers", "seenInsecureChatWarning"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class01892.class, "levelLoadTracker;localGameProfile;telemetryManager;receivedRegistries;enabledFeatures;serverBrand;serverData;postDisconnectScreen;serverCookies;chatState;customReportDetails;serverLinks;seenPlayers;seenInsecureChatWarning", "levelLoadTracker", "localGameProfile", "telemetryManager", "receivedRegistries", "enabledFeatures", "serverBrand", "serverData", "postDisconnectScreen", "serverCookies", "chatState", "customReportDetails", "serverLinks", "seenPlayers", "seenInsecureChatWarning"}, this);
    }

    public @Nullable class05096 B() {
        return this.postDisconnectScreen;
    }

    public Map<class01894, byte[]> Z() {
        return this.serverCookies;
    }

    public class03767 i() {
        return this.enabledFeatures;
    }

    public boolean m() {
        return this.seenInsecureChatWarning;
    }

    public Map<String, String> U() {
        return this.customReportDetails;
    }

    public @Nullable class06467 z() {
        return this.chatState;
    }

    public class01022 u() {
        return this.receivedRegistries;
    }

    public GameProfile y() {
        return this.localGameProfile;
    }

    public class02243 E() {
        return this.serverLinks;
    }

    public class05384 N() {
        return this.levelLoadTracker;
    }

    public Map<UUID, class03458> W() {
        return this.seenPlayers;
    }

    public @Nullable String R() {
        return this.serverBrand;
    }
}

