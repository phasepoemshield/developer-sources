/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.util.UndashedUuid
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.util.UndashedUuid;
import java.net.URI;
import java.util.UUID;
import org.jspecify.annotations.Nullable;

public class class03597 {
    public static final URI N = URI.create("https://aka.ms/MinecraftGDPR");
    public static final URI y = URI.create("https://aka.ms/MinecraftEULA");
    public static final URI L = URI.create("http://go.microsoft.com/fwlink/?LinkId=521839");
    public static final URI u = URI.create("https://aka.ms/MinecraftJavaAttribution");
    public static final URI i = URI.create("https://aka.ms/MinecraftJavaLicenses");
    public static final URI R = URI.create("https://aka.ms/BuyMinecraftJava");
    public static final URI M = URI.create("https://aka.ms/JavaAccountSettings");
    public static final URI B = URI.create("https://aka.ms/snapshotfeedback?ref=game");
    public static final URI Z = URI.create("https://aka.ms/javafeedback?ref=game");
    public static final URI z = URI.create("https://aka.ms/snapshotbugs?ref=game");
    public static final URI U = URI.create("https://aka.ms/Minecraft-Support");
    public static final URI E = URI.create("https://aka.ms/MinecraftJavaAccessibility");
    public static final URI W = URI.create("https://aka.ms/aboutjavareporting");
    public static final URI m = URI.create("https://aka.ms/mcjavamoderation");
    public static final URI P = URI.create("https://aka.ms/javablocking");
    public static final URI s = URI.create("https://aka.ms/MinecraftSymLinks");
    public static final URI T = URI.create("https://aka.ms/startjavarealmstrial");
    public static final URI b = URI.create("https://aka.ms/BuyJavaRealms");
    public static final URI j = URI.create("https://aka.ms/MinecraftRealmsTerms");
    public static final URI v = URI.create("https://aka.ms/MinecraftRealmsContentCreator");
    public static final String n = "https://aka.ms/ExtendJavaRealms";
    public static final String t = "MCPE-28723";
    public static final URI G = URI.create("https://bugs.mojang.com/browse/MCPE-28723");

    public static String N(@Nullable String string, UUID uUID, boolean bl) {
        if (string == null) {
            return n;
        }
        return class03597.N(string, uUID) + "&ref=" + (bl ? "expiredTrial" : "expiredRealm");
    }

    public static String N(@Nullable String string, UUID uUID) {
        if (string == null) {
            return n;
        }
        return "https://aka.ms/ExtendJavaRealms?subscriptionId=" + string + "&profileId=" + UndashedUuid.toString((UUID)uUID);
    }
}

