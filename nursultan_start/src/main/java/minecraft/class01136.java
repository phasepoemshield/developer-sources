/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class07321
 */
package minecraft;

import java.io.IOException;
import java.util.concurrent.CompletableFuture;
import minecraft.class01130;
import minecraft.class07321;

public interface class01136<T>
extends AutoCloseable {
    @Override
    default public void close() throws IOException {
    }

    public CompletableFuture<class01130<T>> N(class07321 var1);

    public void N(boolean var1);

    public void N(class01130<T> var1);
}

