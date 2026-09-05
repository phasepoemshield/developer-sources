/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.io.IOException;
import java.nio.file.FileStore;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.FileAttributeView;
import java.nio.file.attribute.FileStoreAttributeView;
import org.jspecify.annotations.Nullable;

class class02958
extends FileStore {
    private final String N;

    public class02958(String string) {
        this.N = string;
    }

    @Override
    public String name() {
        return this.N;
    }

    @Override
    public String type() {
        return "index";
    }

    @Override
    public boolean isReadOnly() {
        return true;
    }

    @Override
    public Object getAttribute(String string) throws IOException {
        throw new UnsupportedOperationException();
    }

    @Override
    public long getTotalSpace() {
        return 0L;
    }

    @Override
    public long getUsableSpace() {
        return 0L;
    }

    @Override
    public long getUnallocatedSpace() {
        return 0L;
    }

    @Override
    public boolean supportsFileAttributeView(String string) {
        return "basic".equals(string);
    }

    @Override
    public boolean supportsFileAttributeView(Class<? extends FileAttributeView> clazz) {
        return clazz == BasicFileAttributeView.class;
    }

    @Override
    public <V extends FileStoreAttributeView> @Nullable V getFileStoreAttributeView(Class<V> clazz) {
        return null;
    }
}

