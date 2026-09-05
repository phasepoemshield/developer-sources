/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10087
 *  com.google.common.base.Joiner
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.ImmutableList$Builder
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import Nursultan.class10087;
import com.google.common.base.Joiner;
import com.google.common.collect.ImmutableList;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.LinkOption;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.ProviderMismatchException;
import java.nio.file.WatchEvent;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import minecraft.class02960;
import minecraft.class02967;
import minecraft.class02985;
import minecraft.class02990;
import minecraft.class02993;
import minecraft.class02994;
import org.jspecify.annotations.Nullable;

class class02973
implements Path {
    private static final BasicFileAttributes N = new class02985();
    private static final BasicFileAttributes y = new class02967();
    private static final Comparator<class02973> L = Comparator.comparing(class02973::m);
    private final String u;
    private final class02993 i;
    private final @Nullable class02973 R;
    private @Nullable List<String> M;
    private @Nullable String B;
    private final class02960 Z;

    @Override
    public class02973 getFileName() {
        return this.N(null, this.u);
    }

    private class02973 L(@Nullable Path path) {
        if (path == null) {
            throw new NullPointerException();
        }
        if (path instanceof class02973) {
            class02973 class029732 = (class02973)path;
            if (class029732.i == this.i) {
                return class029732;
            }
        }
        throw new ProviderMismatchException();
    }

    public boolean M() {
        return this.W();
    }

    public class02973(class02993 class029932, String string, @Nullable class02973 class029732, class02960 class029602) {
        this.i = class029932;
        this.u = string;
        this.R = class029732;
        this.Z = class029602;
    }

    @Override
    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof class02973) {
            class02973 class029732 = (class02973)object;
            if (this.i != class029732.i) {
                return false;
            }
            boolean bl = this.W();
            if (bl != class029732.W()) {
                return false;
            }
            if (bl) {
                return this.Z == class029732.Z;
            }
            return Objects.equals(this.R, class029732.R) && Objects.equals(this.u, class029732.u);
        }
        return false;
    }

    @Override
    public String toString() {
        return this.m();
    }

    @Override
    public int hashCode() {
        return this.W() ? this.Z.hashCode() : this.u.hashCode();
    }

    @Override
    public int compareTo(Path path) {
        class02973 class029732 = this.L(path);
        return L.compare(this, class029732);
    }

    public @Nullable Path B() {
        class02960 class029602 = this.Z;
        return class029602 instanceof class10087 ? ((class10087)class029602).N() : null;
    }

    public @Nullable class02994 Z() {
        class02960 class029602 = this.Z;
        return class029602 instanceof class02994 ? (class02994)class029602 : null;
    }

    @Override
    public boolean startsWith(Path path) {
        if (path.isAbsolute() != this.isAbsolute()) {
            return false;
        }
        if (path instanceof class02973) {
            class02973 class029732 = (class02973)path;
            if (class029732.i != this.i) {
                return false;
            }
            List<String> var3 = this.E();
            List<String> var4 = class029732.E();
            int n = var4.size();
            if (n > var3.size()) {
                return false;
            }
            for (int i = 0; i < n; ++i) {
                if (var4.get(i).equals(var3.get(i))) continue;
                return false;
            }
            return true;
        }
        return false;
    }

    @Override
    public class02973 normalize() {
        return this;
    }

    @Override
    public boolean endsWith(Path path) {
        if (path.isAbsolute() && !this.isAbsolute()) {
            return false;
        }
        if (path instanceof class02973) {
            class02973 class029732 = (class02973)path;
            if (class029732.i != this.i) {
                return false;
            }
            List<String> var3 = this.E();
            List<String> var4 = class029732.E();
            int n = var4.size();
            int n2 = var3.size() - n;
            if (n2 < 0) {
                return false;
            }
            for (int i = n - 1; i >= 0; --i) {
                if (var4.get(i).equals(var3.get(n2 + i))) continue;
                return false;
            }
            return true;
        }
        return false;
    }

    private String m() {
        if (this.B == null) {
            StringBuilder stringBuilder = new StringBuilder();
            if (this.isAbsolute()) {
                stringBuilder.append("/");
            }
            Joiner.on((String)"/").appendTo(stringBuilder, this.E());
            this.B = stringBuilder.toString();
        }
        return this.B;
    }

    @Override
    public WatchKey register(WatchService watchService, WatchEvent.Kind<?>[] kindArray, WatchEvent.Modifier ... modifierArray) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean isAbsolute() {
        return this.Z != class02960.y;
    }

    public BasicFileAttributes U() throws IOException {
        if (this.Z instanceof class02994) {
            return N;
        }
        if (this.Z instanceof class10087) {
            return y;
        }
        throw new NoSuchFileException(this.m());
    }

    public BasicFileAttributeView z() {
        return new class02990(this);
    }

    @Override
    public @Nullable class02973 getParent() {
        return this.R;
    }

    @Override
    public File toFile() {
        class02960 class029602 = this.Z;
        if (class029602 instanceof class10087) {
            return ((class10087)class029602).N().toFile();
        }
        throw new UnsupportedOperationException("Path " + this.m() + " does not represent file");
    }

    @Override
    public @Nullable class02973 getRoot() {
        if (this.isAbsolute()) {
            return this.i.y();
        }
        return null;
    }

    @Override
    public class02973 relativize(Path path) {
        class02973 class029732 = this.L(path);
        if (this.isAbsolute() != class029732.isAbsolute()) {
            throw new IllegalArgumentException("absolute mismatch");
        }
        List<String> var3 = this.E();
        List<String> var4 = class029732.E();
        if (var3.size() >= var4.size()) {
            throw new IllegalArgumentException();
        }
        for (int i = 0; i < var3.size(); ++i) {
            if (var3.get(i).equals(var4.get(i))) continue;
            throw new IllegalArgumentException();
        }
        return class029732.subpath(var3.size(), var4.size());
    }

    private List<String> E() {
        if (this.u.isEmpty()) {
            return List.of();
        }
        if (this.M == null) {
            ImmutableList.Builder builder = ImmutableList.builder();
            if (this.R != null) {
                builder.addAll(this.R.E());
            }
            builder.add((Object)this.u);
            this.M = builder.build();
        }
        return this.M;
    }

    @Override
    public int getNameCount() {
        return this.E().size();
    }

    @Override
    public URI toUri() {
        try {
            return new URI("x-mc-link", this.i.N().name(), this.m(), null);
        }
        catch (URISyntaxException uRISyntaxException) {
            throw new AssertionError("Failed to create URI", uRISyntaxException);
        }
    }

    private class02973 N(List<String> list) {
        class02973 class029732 = this;
        for (String string : list) {
            class029732 = class029732.N(string);
        }
        return class029732;
    }

    class02973 N(String string) {
        if (class02973.N(this.Z)) {
            return new class02973(this.i, string, this, this.Z);
        }
        Object object = this.Z;
        if (object instanceof class02994) {
            return (object = ((class02994)object).N().get(string)) != null ? object : new class02973(this.i, string, this, class02960.N);
        }
        if (this.Z instanceof class10087) {
            return new class02973(this.i, string, this, class02960.N);
        }
        throw new AssertionError((Object)"All content types should be already handled");
    }

    @Override
    public class02973 resolve(Path path) {
        class02973 class029732 = this.L(path);
        if (path.isAbsolute()) {
            return class029732;
        }
        return this.N(class029732.E());
    }

    @Override
    public class02993 getFileSystem() {
        return this.i;
    }

    @Override
    public class02973 subpath(int n, int n2) {
        List<String> var3 = this.E();
        if (n < 0 || n2 > var3.size() || n >= n2) {
            throw new IllegalArgumentException();
        }
        class02973 class029732 = null;
        for (int i = n; i < n2; ++i) {
            class029732 = this.N(class029732, var3.get(i));
        }
        return class029732;
    }

    private static boolean N(class02960 class029602) {
        return class029602 == class02960.N || class029602 == class02960.y;
    }

    @Override
    public class02973 toRealPath(LinkOption ... linkOptionArray) {
        return this.toAbsolutePath();
    }

    @Override
    public class02973 getName(int n) {
        List<String> var2 = this.E();
        if (n < 0 || n >= var2.size()) {
            throw new IllegalArgumentException("Invalid index: " + n);
        }
        return this.N(null, var2.get(n));
    }

    private class02973 N(@Nullable class02973 class029732, String string) {
        return new class02973(this.i, string, class029732, class02960.y);
    }

    private boolean W() {
        return !class02973.N(this.Z);
    }

    @Override
    public class02973 toAbsolutePath() {
        if (this.isAbsolute()) {
            return this;
        }
        return this.i.y().resolve(this);
    }
}

