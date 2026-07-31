package fun.wonderful.api.utils.player;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import net.minecraft.client.MinecraftClient;

public final class ViaProtocolUtils {
    private static final int MC_1_17_PROTOCOL = 755;
    private static final int MC_1_17_1_PROTOCOL = 756;
    private static final int MC_1_18_PROTOCOL = 757;
    private static final int MC_1_18_2_PROTOCOL = 758;
    private static final int MC_1_19_PROTOCOL = 759;
    private static final int MC_1_19_3_PROTOCOL = 761;
    private static final int MC_1_19_4_PROTOCOL = 762;
    private static final int MC_1_20_PROTOCOL = 763;
    private static final int MC_1_20_2_PROTOCOL = 764;
    private static final int MC_1_20_3_PROTOCOL = 765;
    private static final int MC_1_20_5_PROTOCOL = 766;
    private static final int MC_1_21_PROTOCOL = 767;
    private static final int MC_1_21_2_PROTOCOL = 768;
    private static final int MC_1_21_4_PROTOCOL = 769;
    private static final long CACHE_TIME_MS = 1500L;
    private static final Pattern VERSION_PATTERN = Pattern.compile("1\\.(\\d+)(?:\\.(\\d+))?");
    private static long nextRefreshAt;
    private static int targetProtocol;
    private static boolean belowOneNineteen;
    private static boolean legacyWaterMovement;

    private ViaProtocolUtils() {
    }

    public static boolean isTargetProtocolBelowOneNineteen() {
        ViaProtocolUtils.refreshIfNeeded();
        return belowOneNineteen;
    }

    public static boolean usesLegacyWaterMovement() {
        ViaProtocolUtils.refreshIfNeeded();
        return legacyWaterMovement;
    }

    public static int getTargetProtocol() {
        ViaProtocolUtils.refreshIfNeeded();
        return targetProtocol;
    }

    public static boolean isLegacyWaterActive(MinecraftClient client) {
        return ViaProtocolUtils.usesLegacyWaterMovement() && client != null && client.player != null && (client.player.isTouchingWater() || client.player.isSubmergedInWater() || client.player.isSwimming());
    }

    private static void refreshIfNeeded() {
        long now = System.currentTimeMillis();
        if (now < nextRefreshAt) {
            return;
        }
        targetProtocol = ViaProtocolUtils.resolveTargetProtocol();
        belowOneNineteen = targetProtocol < 759;
        legacyWaterMovement = targetProtocol <= 758;
        nextRefreshAt = now + 1500L;
    }

    private static int resolveTargetProtocol() {
        try {
            Class<?> viaFabricPlusClass = Class.forName("com.viaversion.viafabricplus.ViaFabricPlus");
            Object impl = viaFabricPlusClass.getMethod("getImpl", new Class[0]).invoke(null, new Object[0]);
            if (impl == null) {
                return 769;
            }
            Object targetVersion = ViaProtocolUtils.invokeNoArg(impl, "getTargetVersion");
            if (targetVersion == null) {
                return 769;
            }
            Integer protocolId = ViaProtocolUtils.readProtocolId(targetVersion);
            return protocolId != null ? protocolId : 769;
        }
        catch (Throwable ignored) {
            return 769;
        }
    }

    private static Object invokeNoArg(Object instance, String methodName) {
        try {
            Method method = instance.getClass().getMethod(methodName, new Class[0]);
            if (!Modifier.isPublic(method.getModifiers()) || method.getParameterCount() != 0) {
                return null;
            }
            return method.invoke(instance, new Object[0]);
        }
        catch (Throwable ignored) {
            return null;
        }
    }

    private static Integer readProtocolId(Object targetVersion) {
        Integer parsedMethodString;
        try {
            Method[] getVersion = targetVersion.getClass().getMethod("getVersion", new Class[0]);
            Object value = getVersion.invoke(targetVersion, new Object[0]);
            if (value instanceof Number) {
                Number number = (Number)value;
                return number.intValue();
            }
        }
        catch (Throwable getVersion) {
            
        }
        try {
            for (Method method : targetVersion.getClass().getMethods()) {
                Object value;
                String name;
                Class<?> returnType;
                if (!Modifier.isPublic(method.getModifiers()) || method.getParameterCount() != 0 || (returnType = method.getReturnType()) != Integer.TYPE && returnType != Integer.class || !(name = method.getName().toLowerCase()).contains("version") && !name.contains("protocol") && !name.contains("id") || !((value = method.invoke(targetVersion, new Object[0])) instanceof Number)) continue;
                Number number = (Number)value;
                return number.intValue();
            }
        }
        catch (Throwable getVersion) {
            
        }
        if ((parsedMethodString = ViaProtocolUtils.readProtocolFromStringMethods(targetVersion)) != null) {
            return parsedMethodString;
        }
        return ViaProtocolUtils.protocolFromVersionString(String.valueOf(targetVersion));
    }

    private static Integer readProtocolFromStringMethods(Object targetVersion) {
        try {
            for (Method method : targetVersion.getClass().getMethods()) {
                Object value;
                Integer protocol;
                String name;
                if (!Modifier.isPublic(method.getModifiers()) || method.getParameterCount() != 0 || method.getReturnType() != String.class || !(name = method.getName().toLowerCase()).contains("name") && !name.contains("version") || (protocol = ViaProtocolUtils.protocolFromVersionString(String.valueOf(value = method.invoke(targetVersion, new Object[0])))) == null) continue;
                return protocol;
            }
        }
        catch (Throwable throwable) {
            
        }
        return null;
    }

    private static Integer protocolFromVersionString(String version) {
        Matcher matcher = VERSION_PATTERN.matcher(version);
        if (matcher.find()) {
            int minor = Integer.parseInt(matcher.group(1));
            int patch = matcher.group(2) != null ? Integer.parseInt(matcher.group(2)) : 0;
            return ViaProtocolUtils.protocolFromRelease(minor, patch);
        }
        return null;
    }

    private static int protocolFromRelease(int minor, int patch) {
        return switch (minor) {
            case 17 -> {
                if (patch >= 1) {
                    yield 756;
                }
                yield 755;
            }
            case 18 -> {
                if (patch >= 2) {
                    yield 758;
                }
                yield 757;
            }
            case 19 -> {
                if (patch >= 4) {
                    yield 762;
                }
                if (patch >= 3) {
                    yield 761;
                }
                yield 759;
            }
            case 20 -> {
                if (patch >= 5) {
                    yield 766;
                }
                if (patch >= 3) {
                    yield 765;
                }
                if (patch >= 2) {
                    yield 764;
                }
                yield 763;
            }
            case 21 -> {
                if (patch >= 4) {
                    yield 769;
                }
                if (patch >= 2) {
                    yield 768;
                }
                yield 767;
            }
            default -> minor > 21 ? 769 : 755;
        };
    }

    static {
        targetProtocol = 769;
    }
}