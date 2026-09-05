/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  minecraft.class04942
 *  minecraft.class04968
 *  minecraft.class06202
 *  org.slf4j.Logger
 */
package minecraft;

import com.mojang.logging.LogUtils;
import java.io.File;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import minecraft.class04717;
import minecraft.class04942;
import minecraft.class04968;
import minecraft.class06202;
import org.slf4j.Logger;

public class class04714 {
    private static final String N = "realms_persistence.json";
    private static final class04968 y = new class04968();
    private static final Logger L = LogUtils.getLogger();

    private static Path L() {
        return ((File)class06202.Nq().l_1).toPath().resolve(N);
    }

    public static class04717 y() {
        Path path = class04714.L();
        try {
            String string = Files.readString(path, StandardCharsets.UTF_8);
            class04717 class047172 = (class04717)y.N(string, class04717.class);
            if (class047172 != null) {
                return class047172;
            }
        }
        catch (NoSuchFileException noSuchFileException) {
        }
        catch (Exception exception) {
            L.warn("Failed to read Realms storage {}", (Object)path, (Object)exception);
        }
        return new class04717();
    }

    public static void y(class04717 class047172) {
        Path path = class04714.L();
        try {
            Files.writeString(path, (CharSequence)y.N((class04942)class047172), StandardCharsets.UTF_8, new OpenOption[0]);
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    public void N(class04717 class047172) {
        class04714.y(class047172);
    }

    public class04717 N() {
        return class04714.y();
    }
}

