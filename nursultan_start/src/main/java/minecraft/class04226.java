/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  minecraft.class04199
 *  minecraft.class04220
 *  minecraft.class08214
 *  org.apache.commons.io.IOUtils
 *  org.slf4j.Logger
 */
package minecraft;

import com.mojang.logging.LogUtils;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.concurrent.Executor;
import minecraft.class04199;
import minecraft.class04220;
import minecraft.class04236;
import minecraft.class08214;
import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;

public class class04226
implements AutoCloseable {
    private static final Logger N = LogUtils.getLogger();
    private final class04220<class04199> y;
    private final class08214 L;

    public class04226(FileChannel fileChannel, Executor executor) {
        this.y = new class04220(class04199.N, fileChannel);
        this.L = new class08214(executor, "telemetry-event-log");
    }

    @Override
    public void close() {
        this.L.N(() -> IOUtils.closeQuietly(this.y));
        this.L.close();
    }

    public class04236 N() {
        return class041992 -> this.L.N(() -> {
            try {
                this.y.N((Object)class041992);
            }
            catch (IOException iOException) {
                N.error("Failed to write telemetry event to log", (Throwable)iOException);
            }
        });
    }
}

