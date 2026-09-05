/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.MatchException
 *  minecraft.class01894
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.loader.api.FabricLoader
 */
package dev.isxander.yacl3.platform;

import dev.isxander.yacl3.platform.Env;
import java.nio.file.Path;
import minecraft.class01894;
import net.fabricmc.api.EnvType;
import net.fabricmc.loader.api.FabricLoader;

public final class YACLPlatform {
    public static Path getConfigDir() {
        return FabricLoader.getInstance().getConfigDir();
    }

    public static class01894 rl(String string, String string2) {
        return class01894.N((String)string, (String)string2);
    }

    public static class01894 rl(String string) {
        return YACLPlatform.rl("yet_another_config_lib_v3", string);
    }

    public static boolean isDevelopmentEnv() {
        return FabricLoader.getInstance().isDevelopmentEnvironment();
    }

    public static class01894 parseRl(String string) {
        return class01894.N((String)string);
    }

    public static class01894 mcRl(String string) {
        return YACLPlatform.rl("minecraft", string);
    }

    public static Env getEnvironment() {
        return switch (FabricLoader.getInstance().getEnvironmentType()) {
            default -> throw new MatchException(null, null);
            case EnvType.CLIENT -> Env.CLIENT;
            case EnvType.SERVER -> Env.SERVER;
        };
    }
}

