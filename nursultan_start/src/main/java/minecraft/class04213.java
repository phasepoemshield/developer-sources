/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.util.zip.GZIPInputStream;
import minecraft.class04200;
import minecraft.class04215;
import org.jspecify.annotations.Nullable;

public final class class04213
extends Record
implements class04200 {
    private final Path path;
    private final class04215 id;

    @Override
    public Path L() {
        return this.path;
    }

    public class04213(Path path, class04215 class042152) {
        this.path = path;
        this.id = class042152;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class04213.class, "path;id", "path", "id"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class04213.class, "path;id", "path", "id"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class04213.class, "path;id", "path", "id"}, this);
    }

    @Override
    public class04215 u() {
        return this.id;
    }

    @Override
    public class04213 y() {
        return this;
    }

    @Override
    public @Nullable Reader N() throws IOException {
        if (!Files.exists(this.path, new LinkOption[0])) {
            return null;
        }
        return new BufferedReader(new InputStreamReader((InputStream)new GZIPInputStream(Files.newInputStream(this.path, new OpenOption[0])), StandardCharsets.UTF_8));
    }
}

