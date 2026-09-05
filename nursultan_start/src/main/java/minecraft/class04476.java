/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.hash.HashCode
 *  minecraft.class06290
 */
package minecraft;

import com.google.common.hash.HashCode;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import minecraft.class06290;

public interface class04476 {
    public static final class04476 N = (path, byArray, hashCode) -> {
        class06290.L((Path)path.getParent());
        Files.write(path, byArray, new OpenOption[0]);
    };

    public void method_43346(Path var1, byte[] var2, HashCode var3) throws IOException;
}

