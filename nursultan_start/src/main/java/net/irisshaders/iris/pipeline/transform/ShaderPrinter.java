/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.irisshaders.iris.Iris
 */
package net.irisshaders.iris.pipeline.transform;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.attribute.FileAttribute;
import java.util.stream.Stream;
import net.irisshaders.iris.Iris;
import net.irisshaders.iris.pipeline.transform.ShaderPrinter$ProgramPrintBuilder;
import net.irisshaders.iris.platform.IrisPlatformHelpers;

public class ShaderPrinter {
    static final Path debugOutDir = IrisPlatformHelpers.getInstance().getGameDir().resolve("patched_shaders");
    static boolean outputLocationCleared = false;
    static int programCounter = 0;

    public static void deleteIfClearing() {
        if (!outputLocationCleared) {
            try {
                if (Files.exists(debugOutDir, new LinkOption[0])) {
                    try (Stream<Path> stream = Files.list(debugOutDir);){
                        stream.forEach(path -> {
                            try {
                                Files.delete(path);
                            }
                            catch (IOException iOException) {
                                throw new RuntimeException(iOException);
                            }
                        });
                    }
                }
                Files.createDirectories(debugOutDir, new FileAttribute[0]);
            }
            catch (IOException iOException) {
                Iris.logger.warn("Failed to initialize debug patched shader source location", (Throwable)iOException);
            }
            outputLocationCleared = true;
        }
    }

    public static ShaderPrinter$ProgramPrintBuilder printProgram(String string) {
        return new ShaderPrinter$ProgramPrintBuilder(string);
    }

    public static void resetPrintState() {
        outputLocationCleared = false;
        programCounter = 0;
    }
}

