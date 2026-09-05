/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Dynamic
 *  com.mojang.serialization.DynamicOps
 *  minecraft.class03448
 *  minecraft.class03519
 *  minecraft.class04909
 *  minecraft.class04911
 *  minecraft.class06202
 *  minecraft.class06584
 *  minecraft.class07001
 *  minecraft.class07709
 *  minecraft.class07713
 *  minecraft.class07742
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package Nursultan;

import Nursultan.class11917;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;
import java.io.File;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.attribute.FileAttribute;
import minecraft.class03448;
import minecraft.class03519;
import minecraft.class04909;
import minecraft.class04911;
import minecraft.class06202;
import minecraft.class06584;
import minecraft.class07001;
import minecraft.class07709;
import minecraft.class07713;
import minecraft.class07742;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class11894 {
    public static Object N_0;

    public static void L(Path path) {
        if (!Files.isDirectory(path, new LinkOption[0])) {
            ((Logger)N_0).error("Path {} is not a directory", (Object)path);
            return;
        }
        if (!Files.exists(path, new LinkOption[0])) {
            ((Logger)N_0).error("Path {} does not exist", (Object)path);
            return;
        }
        try (DirectoryStream<Path> var1 = Files.newDirectoryStream(path);){
            for (Path path2 : var1) {
                if (!path2.getFileName().toString().endsWith(".nbt")) {
                    ((Logger)N_0).info("Skipping non-NBT file: {}", (Object)path2);
                    continue;
                }
                class07001 class070013 = class11894.u(path2);
                if (class070013 == null) continue;
                if (class070013.y("count")) {
                    class070013.b("count");
                }
                if (class070013.y("components")) {
                    class070013.W("components").ifPresent(class070012 -> {
                        if (class070012.y("minecraft:damage")) {
                            class070012.b("minecraft:damage");
                        }
                        if (class070012.y("minecraft:repair_cost")) {
                            class070012.b("minecraft:repair_cost");
                        }
                        if (class070012.y("minecraft:tooltip_display")) {
                            class070012.b("minecraft:tooltip_display");
                        }
                        if (class070012.y("minecraft:custom_data")) {
                            class070012.b("minecraft:custom_data");
                        }
                    });
                }
                class07742.y((class07001)class070013, (Path)path2);
                ((Logger)N_0).info("Cleaned NBT file: {}", (Object)path2);
            }
        }
        catch (Exception exception) {
            ((Logger)N_0).error("Error cleaning parsed items", (Throwable)exception);
        }
    }

    private static void L() {
    }

    public static Path L(class06584 class065842) {
        return class11894.y(class11894.y(class065842));
    }

    private class11894() {
        throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
    }

    static {
        class11894.L();
        class11894.y();
        N_0 = LogManager.getLogger(String.class);
    }

    public static class07001 u(Path path) {
        return class07742.N((Path)path);
    }

    public static Path y(class07001 class070012) {
        Path path = ((File)class06202.Nq().l_1).toPath().resolve("parsed-item");
        if (Files.notExists(path, new LinkOption[0])) {
            Files.createDirectories(path, new FileAttribute[0]);
        }
        Path path2 = Path.of(path.toString(), "item0.nbt");
        int n = 0;
        while (Files.exists(path2, new LinkOption[0])) {
            path2 = Path.of(path.toString(), "item%s.nbt".formatted(new Object[]{++n}));
        }
        class07742.y((class07001)class070012, (Path)path2);
        ((class03448)class06202.Nq().T_3).method_67392(class04909.yx, class04911.field_15250, 2.0f, 0.5f);
        return path2;
    }

    public static class07001 y(class06584 class065842) {
        return (class07001)class06584.R.encodeStart(class11917.y(), (Object)class065842).getOrThrow();
    }

    public static class06584 y(Path path) {
        return (class06584)class06584.R.parse(new Dynamic(class11894.N(), (Object)class07742.N((Path)path))).getOrThrow();
    }

    private static void y() {
        N_0 = null;
    }

    public static class06584 N(Path path) {
        return class11894.N(class07742.N((Path)path));
    }

    public static class03519<class07709> N() {
        return ((class03448)class06202.Nq().T_3).method_30349().N((DynamicOps)class07713.N);
    }

    public static class07001 N(class06584 class065842) {
        return (class07001)class06584.R.encodeStart(class11894.N(), (Object)class065842).getOrThrow();
    }

    public static class06584 N(class07001 class070012) {
        return (class06584)class06584.R.parse(new Dynamic(class11917.y(), (Object)class070012)).getOrThrow();
    }
}

