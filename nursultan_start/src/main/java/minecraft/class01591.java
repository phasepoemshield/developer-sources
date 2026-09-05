/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.io.IOUtils
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.zip.ZipFile;
import minecraft.class01597;
import org.apache.commons.io.IOUtils;
import org.jspecify.annotations.Nullable;

class class01591
implements AutoCloseable {
    final File N;
    private @Nullable ZipFile y;
    private boolean L;

    class01591(File file) {
        this.N = file;
    }

    protected void finalize() throws Throwable {
        this.close();
        super.finalize();
    }

    @Override
    public void close() {
        if (this.y != null) {
            IOUtils.closeQuietly((Closeable)this.y);
            this.y = null;
        }
    }

    @Nullable ZipFile N() {
        if (this.L) {
            return null;
        }
        if (this.y == null) {
            try {
                this.y = new ZipFile(this.N);
            }
            catch (IOException iOException) {
                class01597.N.error("Failed to open pack {}", (Object)this.N, (Object)iOException);
                this.L = true;
                return null;
            }
        }
        return this.y;
    }
}

