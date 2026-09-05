/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.hash.HashCode
 *  minecraft.class04476
 *  minecraft.class07096
 *  minecraft.class07097
 */
package minecraft;

import com.google.common.hash.HashCode;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.attribute.FileAttribute;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import minecraft.class04476;
import minecraft.class07096;
import minecraft.class07097;
import minecraft.class07129;

class class07120
implements class04476 {
    private final String y;
    private final class07096 L;
    private final class07097 u;
    private final AtomicInteger i = new AtomicInteger();
    private volatile boolean R;

    class07120(String string, String string2, class07096 class070962) {
        this.y = string;
        this.L = class070962;
        this.u = new class07097(string2);
    }

    public class07129 N() {
        this.R = true;
        return new class07129(this.y, this.u.N(), this.i.get());
    }

    private boolean N(Path path, HashCode hashCode) {
        return !Objects.equals(this.L.N(path), hashCode) || !Files.exists(path, new LinkOption[0]);
    }

    public void method_43346(Path path, byte[] byArray, HashCode hashCode) throws IOException {
        if (this.R) {
            throw new IllegalStateException("Cannot write to cache as it has already been closed");
        }
        if (this.N(path, hashCode)) {
            this.i.incrementAndGet();
            Files.createDirectories(path.getParent(), new FileAttribute[0]);
            Files.write(path, byArray, new OpenOption[0]);
        }
        this.u.N(path, hashCode);
    }
}

