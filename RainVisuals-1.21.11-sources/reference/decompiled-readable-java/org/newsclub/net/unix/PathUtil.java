/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement
 */
package org.newsclub.net.unix;

import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

@IgnoreJRERequirement
final class PathUtil {
    private PathUtil() {
        throw new IllegalStateException("No instances");
    }

    static boolean isPathInDefaultFileSystem(Path p) {
        block3: {
            block2: {
                FileSystem fs = p.getFileSystem();
                if (fs != FileSystems.getDefault()) break block2;
                if (fs.getClass().getModule() == Object.class.getModule()) break block3;
            }
            return false;
        }
        return true;
    }
}

