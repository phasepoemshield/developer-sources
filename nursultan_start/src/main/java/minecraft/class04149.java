/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  minecraft.class03597
 *  minecraft.class07529
 *  org.slf4j.Logger
 */
package minecraft;

import com.mojang.logging.LogUtils;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.util.Properties;
import minecraft.class03597;
import minecraft.class07529;
import org.slf4j.Logger;

public class class04149 {
    private static final Logger N = LogUtils.getLogger();
    private final Path y;
    private final boolean L;

    private void L() {
        if (class07529.ND) {
            return;
        }
        try (OutputStream outputStream = Files.newOutputStream(this.y, new OpenOption[0]);){
            Properties properties = new Properties();
            properties.setProperty("eula", "false");
            properties.store(outputStream, "By changing the setting below to TRUE you are indicating your agreement to our EULA (" + String.valueOf(class03597.y) + ").");
        }
        catch (Exception exception) {
            N.warn("Failed to save {}", (Object)this.y, (Object)exception);
        }
    }

    public class04149(Path path) {
        this.y = path;
        this.L = class07529.ND || this.y();
    }

    private boolean y() {
        boolean bl;
        block8: {
            InputStream inputStream = Files.newInputStream(this.y, new OpenOption[0]);
            try {
                Properties properties = new Properties();
                properties.load(inputStream);
                bl = Boolean.parseBoolean(properties.getProperty("eula", "false"));
                if (inputStream == null) break block8;
            }
            catch (Throwable throwable) {
                try {
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        }
                        catch (Throwable throwable2) {
                            throwable.addSuppressed(throwable2);
                        }
                    }
                    throw throwable;
                }
                catch (Exception exception) {
                    N.warn("Failed to load {}", (Object)this.y);
                    this.L();
                    return false;
                }
            }
            inputStream.close();
        }
        return bl;
    }

    public boolean N() {
        return this.L;
    }
}

