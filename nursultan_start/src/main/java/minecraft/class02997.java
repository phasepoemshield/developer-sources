/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.ImmutableMap$Builder
 *  com.mojang.logging.LogUtils
 *  minecraft.class01603
 *  minecraft.class01611
 *  minecraft.class02267
 *  minecraft.class07536
 *  minecraft.class08606
 *  org.slf4j.Logger
 */
package minecraft;

import com.google.common.collect.ImmutableMap;
import com.mojang.logging.LogUtils;
import java.io.IOException;
import java.net.URI;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumMap;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;
import minecraft.class01603;
import minecraft.class01611;
import minecraft.class02267;
import minecraft.class02955;
import minecraft.class07536;
import minecraft.class08606;
import org.slf4j.Logger;

public class class02997 {
    private static final Logger y = LogUtils.getLogger();
    public static Consumer<class02997> N = class029972 -> {};
    private static final Map<class01603, Path> L = (Map)class07536.N(() -> {
        Class<class01611> clazz = class01611.class;
        synchronized (class01611.class) {
            ImmutableMap.Builder builder = ImmutableMap.builder();
            for (class01603 class016032 : class01603.values()) {
                String string = "/" + class016032.N() + "/.mcassetsroot";
                URL uRL = class01611.class.getResource(string);
                if (uRL == null) {
                    y.error("File {} does not exist in classpath", (Object)string);
                    continue;
                }
                try {
                    URI uRI = uRL.toURI();
                    String string2 = uRI.getScheme();
                    if (!"jar".equals(string2) && !"file".equals(string2)) {
                        y.warn("Assets URL '{}' uses unexpected schema", (Object)uRI);
                    }
                    Path path = class08606.N((URI)uRI);
                    builder.put((Object)class016032, (Object)path.getParent());
                }
                catch (Exception exception) {
                    y.error("Couldn't resolve path to vanilla assets", (Throwable)exception);
                }
            }
            // ** MonitorExit[var0] (shouldn't be in output)
            return builder.build();
        }
    });
    private final Set<Path> u = new LinkedHashSet<Path>();
    private final Map<class01603, Set<Path>> i = new EnumMap<class01603, Set<Path>>(class01603.class);
    private class02955 R = class02955.N();
    private final Set<String> M = new HashSet<String>();

    private void L(Path path) {
        if (this.y(path)) {
            this.u.add(path);
        }
    }

    private void y(class01603 class016033, Path path) {
        if (this.y(path)) {
            this.i.computeIfAbsent(class016033, class016032 -> new LinkedHashSet()).add(path);
        }
    }

    private boolean y(Path path) {
        if (!Files.exists(path, new LinkOption[0])) {
            return false;
        }
        if (!Files.isDirectory(path, new LinkOption[0])) {
            throw new IllegalArgumentException("Path " + String.valueOf(path.toAbsolutePath()) + " is not directory");
        }
        return true;
    }

    public class02997 y() {
        N.accept(this);
        return this;
    }

    private static List<Path> N(Collection<Path> collection) {
        ArrayList<Path> arrayList = new ArrayList<Path>(collection);
        Collections.reverse(arrayList);
        return List.copyOf(arrayList);
    }

    public class02997 N(class02955 class029552) {
        this.R = class029552;
        return this;
    }

    public class02997 N(class01603 class016032, Class<?> clazz) {
        Enumeration<URL> enumeration = null;
        try {
            enumeration = clazz.getClassLoader().getResources(class016032.N() + "/");
        }
        catch (IOException iOException) {
            // empty catch block
        }
        while (enumeration != null && enumeration.hasMoreElements()) {
            URL uRL = enumeration.nextElement();
            try {
                URI uRI = uRL.toURI();
                if (!"file".equals(uRI.getScheme())) continue;
                Path path = Paths.get(uRI);
                this.L(path.getParent());
                this.y(class016032, path);
            }
            catch (Exception exception) {
                y.error("Failed to extract path from {}", (Object)uRL, (Object)exception);
            }
        }
        return this;
    }

    public class02997 N(Path path) {
        this.L(path);
        for (class01603 class016032 : class01603.values()) {
            this.y(class016032, path.resolve(class016032.N()));
        }
        return this;
    }

    public class02997 N(class01603 class016032, Path path) {
        this.L(path);
        this.y(class016032, path);
        return this;
    }

    public class02997 N() {
        L.forEach((class016032, path) -> {
            this.L(path.getParent());
            this.y((class01603)class016032, (Path)path);
        });
        return this;
    }

    public class02997 N(String ... stringArray) {
        this.M.addAll(Arrays.asList(stringArray));
        return this;
    }

    public class01611 N(class02267 class022672) {
        return new class01611(class022672, this.R, Set.copyOf(this.M), class02997.N(this.u), class07536.N_74(class01603.class, class016032 -> class02997.N(this.i.getOrDefault(class016032, Set.of()))));
    }
}

