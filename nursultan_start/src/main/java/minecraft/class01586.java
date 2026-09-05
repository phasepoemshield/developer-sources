/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01061
 *  minecraft.class02993
 *  minecraft.class04173
 *  minecraft.class04181
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import minecraft.class01061;
import minecraft.class01613;
import minecraft.class01620;
import minecraft.class01626;
import minecraft.class02993;
import minecraft.class04173;
import minecraft.class04181;
import org.jspecify.annotations.Nullable;

public class class01586
extends class04181<class01061> {
    public class01586(class04173 class041732) {
        super(class041732);
    }

    protected class01061 L(Path path) {
        return new class01620(path);
    }

    protected @Nullable class01061 u(Path path) {
        FileSystem fileSystem = path.getFileSystem();
        if (fileSystem == FileSystems.getDefault() || fileSystem instanceof class02993) {
            return new class01613(path);
        }
        class01626.N.info("Can't open pack archive at {}", (Object)path);
        return null;
    }
}

