/*
 * Decompiled with CFR 0.152.
 */
package minecraft;

import java.io.IOException;
import java.nio.file.DirectoryIteratorException;
import java.nio.file.DirectoryStream;
import java.nio.file.Path;
import java.util.Iterator;
import minecraft.class02970;
import minecraft.class02994;

class class02975
implements DirectoryStream<Path> {
    final /* synthetic */ class02994 N;
    final /* synthetic */ DirectoryStream.Filter y;

    class02975(class02970 class029702, class02994 class029942, DirectoryStream.Filter filter) {
        this.N = class029942;
        this.y = filter;
    }

    @Override
    public Iterator<Path> iterator() {
        return this.N.N().values().stream().filter(class029732 -> {
            try {
                return this.y.accept(class029732);
            }
            catch (IOException iOException) {
                throw new DirectoryIteratorException(iOException);
            }
        }).map(class029732 -> class029732).iterator();
    }

    @Override
    public void close() {
    }
}

