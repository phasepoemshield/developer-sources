/*
 * Decompiled with CFR 0.152.
 */
package net.caffeinemc.mods.sodium.client.util;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

public class FileUtil {
    public static void writeTextRobustly(String string, Path path) throws IOException {
        Path path2 = path.resolveSibling(String.valueOf(path.getFileName()) + ".tmp");
        Files.writeString(path2, (CharSequence)string, new OpenOption[0]);
        Files.move(path2, path, StandardCopyOption.ATOMIC_MOVE, StandardCopyOption.REPLACE_EXISTING);
    }
}

