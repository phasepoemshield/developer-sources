/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.lenni0451.reflect.ClassLoaders
 *  net.lenni0451.reflect.stream.RStream
 *  org.apache.logging.log4j.Logger
 */
package com.viaversion.viafabricplus.util;

import java.io.File;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.attribute.FileAttribute;
import net.lenni0451.reflect.ClassLoaders;
import net.lenni0451.reflect.stream.RStream;
import org.apache.logging.log4j.Logger;

public final class ClassLoaderPriorityUtil {
    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void loadOverridingJars(Path path, Logger logger) {
        block7: {
            try {
                Path path2 = path.resolve("jars");
                if (!Files.exists(path2, new LinkOption[0])) {
                    Files.createDirectory(path2, new FileAttribute[0]);
                    return;
                }
                File[] fileArray = path2.toFile().listFiles();
                if (fileArray == null || fileArray.length <= 0) break block7;
                ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
                try {
                    ClassLoader classLoader2 = (ClassLoader)RStream.of((Object)classLoader).fields().by("urlLoader").get();
                    Thread.currentThread().setContextClassLoader(classLoader2);
                    logger.warn("================================");
                    logger.warn("OVERRIDING JARS LOADING! THIS CAN CAUSE UNEXPECTED BEHAVIOR AND ISSUES!");
                    for (File file : fileArray) {
                        if (!file.getName().endsWith(".jar")) continue;
                        ClassLoaders.loadToFront((URL)file.toURI().toURL());
                        logger.warn(" -> {}", (Object)file.getName());
                    }
                    logger.warn("================================");
                }
                finally {
                    Thread.currentThread().setContextClassLoader(classLoader);
                }
            }
            catch (Throwable throwable) {
                logger.error("Failed to load overriding jars", throwable);
            }
        }
    }
}

