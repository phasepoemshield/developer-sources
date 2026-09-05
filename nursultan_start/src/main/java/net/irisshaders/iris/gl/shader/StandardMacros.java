/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.mojang.blaze3d.opengl.GlStateManager
 *  com.mojang.blaze3d.systems.RenderSystem
 *  minecraft.class05630
 *  minecraft.class06202
 *  minecraft.class07533
 *  minecraft.class07536
 *  net.irisshaders.iris.helpers.StringPair
 *  net.irisshaders.iris.pbr.format.TextureFormat
 *  net.irisshaders.iris.pbr.format.TextureFormatLoader
 *  net.irisshaders.iris.pipeline.WorldRenderingPhase
 *  net.irisshaders.iris.platform.IrisPlatformHelpers
 */
package net.irisshaders.iris.gl.shader;

import com.google.common.collect.ImmutableList;
import com.mojang.blaze3d.opengl.GlStateManager;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import minecraft.class05630;
import minecraft.class06202;
import minecraft.class07533;
import minecraft.class07536;
import net.irisshaders.iris.Iris;
import net.irisshaders.iris.compat.dh.DHCompat;
import net.irisshaders.iris.gl.IrisRenderSystem;
import net.irisshaders.iris.helpers.StringPair;
import net.irisshaders.iris.pbr.format.TextureFormat;
import net.irisshaders.iris.pbr.format.TextureFormatLoader;
import net.irisshaders.iris.pipeline.WorldRenderingPhase;
import net.irisshaders.iris.platform.IrisPlatformHelpers;

public class StandardMacros {
    private static final Pattern SEMVER_PATTERN = Pattern.compile("(?<major>\\d+)\\.(?<minor>\\d+)\\.*(?<bugfix>\\d*)(.*)");

    public static String getVendor() {
        String string = Objects.requireNonNull(RenderSystem.getDevice().getVendor()).toLowerCase(Locale.ROOT);
        if (string.startsWith("ati")) {
            return "MC_GL_VENDOR_ATI";
        }
        if (string.startsWith("intel")) {
            return "MC_GL_VENDOR_INTEL";
        }
        if (string.startsWith("nvidia")) {
            return "MC_GL_VENDOR_NVIDIA";
        }
        if (string.startsWith("amd")) {
            return "MC_GL_VENDOR_AMD";
        }
        if (string.startsWith("x.org")) {
            return "MC_GL_VENDOR_XORG";
        }
        return "MC_GL_VENDOR_OTHER";
    }

    public static String getMcVersion() {
        String string = Iris.getReleaseTarget();
        if (string == null) {
            throw new IllegalStateException("Could not get the current Minecraft version!");
        }
        String string2 = StandardMacros.formatVersionString(string);
        if (string2 != null) {
            return string2;
        }
        Iris.logger.error("Could not parse game version \"" + string + "\"");
        String string3 = Iris.getBackupVersionNumber();
        String string4 = StandardMacros.formatVersionString(string3);
        if (string4 == null) {
            throw new IllegalArgumentException("Could not parse backup game version \"" + string + "\"");
        }
        return string4;
    }

    public static String group(Matcher matcher, String string) {
        try {
            return matcher.group(string);
        }
        catch (IllegalArgumentException | IllegalStateException runtimeException) {
            return null;
        }
    }

    public static String formatVersionString(String string) {
        Object object;
        String[] stringArray = string.split("\\.");
        if (stringArray.length < 2) {
            return null;
        }
        String string2 = stringArray[0];
        Object object2 = stringArray[1].length() == 1 ? "0" + stringArray[1] : stringArray[1];
        Object object3 = object = stringArray.length < 3 ? "00" : stringArray[2];
        if (((String)object).length() == 1) {
            object = "0" + (String)object;
        }
        return string2 + (String)object2 + (String)object;
    }

    public static String getFormattedIrisVersion() {
        String string = Iris.getVersion();
        if (string == null) {
            throw new IllegalArgumentException("Could not get current Iris version!");
        }
        Matcher matcher = SEMVER_PATTERN.matcher(string);
        if (!matcher.matches()) {
            throw new IllegalArgumentException("Could not parse semantic Iris version from \"" + string + "\"");
        }
        String string2 = matcher.group("major");
        String string3 = matcher.group("minor");
        String string4 = matcher.group("bugfix");
        if (string4 == null) {
            string4 = "0";
        }
        if (string2 == null || string3 == null) {
            throw new IllegalArgumentException("Could not parse semantic Iris version from \"" + string + "\"");
        }
        String string5 = "%s.%s.%s".formatted(new Object[]{string2, string3, string4});
        String string6 = StandardMacros.formatVersionString(string5);
        if (string6 == null) {
            throw new IllegalArgumentException("Could not get a valid semantic version string for Iris version \"" + string5 + "\"");
        }
        return string6;
    }

    public static ImmutableList<StringPair> createStandardEnvironmentDefines() {
        ArrayList<StringPair> arrayList = new ArrayList<StringPair>();
        StandardMacros.define(arrayList, "MC_VERSION", StandardMacros.getMcVersion());
        StandardMacros.define(arrayList, "MC_MIPMAP_LEVEL", String.valueOf(((class05630)class06202.Nq().i_7).V().method_41753()));
        StandardMacros.define(arrayList, "IRIS_VERSION", StandardMacros.getFormattedIrisVersion());
        StandardMacros.define(arrayList, "MC_GL_VERSION", StandardMacros.getGlVersion(7938));
        StandardMacros.define(arrayList, "MC_GLSL_VERSION", StandardMacros.getGlVersion(35724));
        StandardMacros.define(arrayList, StandardMacros.getOsString());
        StandardMacros.define(arrayList, StandardMacros.getVendor());
        StandardMacros.define(arrayList, StandardMacros.getRenderer());
        StandardMacros.define(arrayList, "IS_IRIS");
        StandardMacros.define(arrayList, "MAX_COLOR_BUFFERS", String.valueOf(32));
        StandardMacros.define(arrayList, "IRIS_HAS_TRANSLUCENCY_SORTING");
        StandardMacros.define(arrayList, "IRIS_TAG_SUPPORT", "2");
        if (IrisPlatformHelpers.getInstance().isModLoaded("distanthorizons") && DHCompat.hasRenderingEnabled()) {
            StandardMacros.define(arrayList, "DISTANT_HORIZONS");
        }
        if (IrisPlatformHelpers.getInstance().isModLoaded("continuity")) {
            StandardMacros.define(arrayList, "IRIS_HAS_CONNECTED_TEXTURES");
        }
        if (IrisPlatformHelpers.getInstance().isModLoaded("monocle")) {
            StandardMacros.define(arrayList, "IS_MONOCLE");
        }
        if (Iris.getIrisConfig().shouldAllowUnknownShaders()) {
            StandardMacros.define(arrayList, "ALLOWS_UNKNOWN_SHADERS");
        }
        StandardMacros.define(arrayList, "DH_BLOCK_UNKNOWN", String.valueOf(0));
        StandardMacros.define(arrayList, "DH_BLOCK_LEAVES", String.valueOf(1));
        StandardMacros.define(arrayList, "DH_BLOCK_STONE", String.valueOf(2));
        StandardMacros.define(arrayList, "DH_BLOCK_WOOD", String.valueOf(3));
        StandardMacros.define(arrayList, "DH_BLOCK_METAL", String.valueOf(4));
        StandardMacros.define(arrayList, "DH_BLOCK_DIRT", String.valueOf(5));
        StandardMacros.define(arrayList, "DH_BLOCK_LAVA", String.valueOf(6));
        StandardMacros.define(arrayList, "DH_BLOCK_DEEPSLATE", String.valueOf(7));
        StandardMacros.define(arrayList, "DH_BLOCK_SNOW", String.valueOf(8));
        StandardMacros.define(arrayList, "DH_BLOCK_SAND", String.valueOf(9));
        StandardMacros.define(arrayList, "DH_BLOCK_TERRACOTTA", String.valueOf(10));
        StandardMacros.define(arrayList, "DH_BLOCK_NETHER_STONE", String.valueOf(11));
        StandardMacros.define(arrayList, "DH_BLOCK_WATER", String.valueOf(12));
        StandardMacros.define(arrayList, "DH_BLOCK_GRASS", String.valueOf(13));
        StandardMacros.define(arrayList, "DH_BLOCK_AIR", String.valueOf(14));
        StandardMacros.define(arrayList, "DH_BLOCK_ILLUMINATED", String.valueOf(15));
        for (String iterator : StandardMacros.getGlExtensions()) {
            StandardMacros.define(arrayList, iterator);
        }
        StandardMacros.define(arrayList, "MC_NORMAL_MAP");
        StandardMacros.define(arrayList, "MC_SPECULAR_MAP");
        StandardMacros.define(arrayList, "MC_RENDER_QUALITY", "1.0");
        StandardMacros.define(arrayList, "MC_SHADOW_QUALITY", "1.0");
        StandardMacros.define(arrayList, "MC_HAND_DEPTH", Float.toString(0.125f));
        TextureFormat textureFormat = TextureFormatLoader.getFormat();
        if (textureFormat != null) {
            for (String string3 : textureFormat.getDefines()) {
                StandardMacros.define(arrayList, string3);
            }
        }
        StandardMacros.getRenderStages().forEach((string, string2) -> StandardMacros.define(arrayList, string, string2));
        for (String string3 : StandardMacros.getIrisDefines()) {
            StandardMacros.define(arrayList, string3);
        }
        return ImmutableList.copyOf(arrayList);
    }

    private static void define(List<StringPair> list, String string, String string2) {
        list.add(new StringPair(string, string2));
    }

    private static void define(List<StringPair> list, String string) {
        list.add(new StringPair(string, ""));
    }

    public static String getRenderer() {
        String string = Objects.requireNonNull(RenderSystem.getDevice().getRenderer()).toLowerCase(Locale.ROOT);
        if (string.startsWith("amd")) {
            return "MC_GL_RENDERER_RADEON";
        }
        if (string.startsWith("ati")) {
            return "MC_GL_RENDERER_RADEON";
        }
        if (string.startsWith("radeon")) {
            return "MC_GL_RENDERER_RADEON";
        }
        if (string.startsWith("gallium")) {
            return "MC_GL_RENDERER_GALLIUM";
        }
        if (string.startsWith("intel")) {
            return "MC_GL_RENDERER_INTEL";
        }
        if (string.startsWith("geforce")) {
            return "MC_GL_RENDERER_GEFORCE";
        }
        if (string.startsWith("nvidia")) {
            return "MC_GL_RENDERER_GEFORCE";
        }
        if (string.startsWith("quadro")) {
            return "MC_GL_RENDERER_QUADRO";
        }
        if (string.startsWith("nvs")) {
            return "MC_GL_RENDERER_QUADRO";
        }
        if (string.startsWith("mesa")) {
            return "MC_GL_RENDERER_MESA";
        }
        if (string.startsWith("apple")) {
            return "MC_GL_RENDERER_APPLE";
        }
        return "MC_GL_RENDERER_OTHER";
    }

    public static String getOsString() {
        return switch (class07536.m()) {
            case class07533.field_1137 -> "MC_OS_MAC";
            case class07533.field_1135 -> "MC_OS_LINUX";
            case class07533.field_1133 -> "MC_OS_WINDOWS";
            default -> "MC_OS_UNKNOWN";
        };
    }

    public static Set<String> getGlExtensions() {
        int n = GlStateManager._getInteger((int)33309);
        String[] stringArray = new String[n];
        for (int i = 0; i < n; ++i) {
            stringArray[i] = IrisRenderSystem.getStringi(7939, i);
        }
        return Arrays.stream(stringArray).map(string -> "MC_" + string).collect(Collectors.toSet());
    }

    public static List<String> getIrisDefines() {
        return new ArrayList<String>();
    }

    public static Map<String, String> getRenderStages() {
        HashMap<String, String> hashMap = new HashMap<String, String>();
        for (WorldRenderingPhase worldRenderingPhase : WorldRenderingPhase.values()) {
            hashMap.put("MC_RENDER_STAGE_" + worldRenderingPhase.name(), String.valueOf(worldRenderingPhase.ordinal()));
        }
        return hashMap;
    }

    public static String getGlVersion(int n) {
        String string = GlStateManager._getString((int)n);
        Matcher matcher = SEMVER_PATTERN.matcher(Objects.requireNonNull(string));
        if (!matcher.matches()) {
            throw new IllegalStateException("Could not parse GL version from \"" + string + "\"");
        }
        String string2 = StandardMacros.group(matcher, "major");
        String string3 = StandardMacros.group(matcher, "minor");
        String string4 = StandardMacros.group(matcher, "bugfix");
        if (string4 == null) {
            string4 = "0";
        }
        if (string2 == null || string3 == null) {
            throw new IllegalStateException("Could not parse GL version from \"" + string + "\"");
        }
        return string2 + string3 + string4;
    }
}

