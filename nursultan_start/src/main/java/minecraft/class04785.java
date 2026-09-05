/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10466
 *  Nursultan.class10469
 *  com.google.common.collect.Maps
 *  com.mojang.serialization.Dynamic
 *  minecraft.class01042
 *  minecraft.class03804
 *  minecraft.class05071
 *  minecraft.class05081
 *  minecraft.class05323
 *  minecraft.class05946
 *  minecraft.class06290
 *  minecraft.class06434
 *  minecraft.class07001
 *  minecraft.class07299
 *  minecraft.class07376
 *  minecraft.class07536
 *  minecraft.class07709
 *  minecraft.class07742
 *  minecraft.class07842
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import Nursultan.class10466;
import Nursultan.class10469;
import com.google.common.collect.Maps;
import com.mojang.serialization.Dynamic;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.nio.file.FileVisitor;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileAttribute;
import java.time.Instant;
import java.time.ZonedDateTime;
import java.util.Map;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.zip.ZipOutputStream;
import minecraft.class01042;
import minecraft.class03804;
import minecraft.class04777;
import minecraft.class04779;
import minecraft.class05071;
import minecraft.class05081;
import minecraft.class05323;
import minecraft.class05946;
import minecraft.class06290;
import minecraft.class06434;
import minecraft.class07001;
import minecraft.class07299;
import minecraft.class07376;
import minecraft.class07536;
import minecraft.class07709;
import minecraft.class07742;
import minecraft.class07842;
import org.jspecify.annotations.Nullable;

public class class04785
implements AutoCloseable {
    public final class05323 N;
    public final class04779 y;
    private final String u;
    private final Map<class05071, Path> i = Maps.newHashMap();
    final /* synthetic */ class04777 L;

    public void L() {
        try {
            this.close();
        }
        catch (IOException iOException) {
            class04777.N.warn("Failed to unlock access to level {}", (Object)this.R(), (Object)iOException);
        }
    }

    public class07842 M() {
        this.P();
        return new class07842(this, this.L.u);
    }

    private void P() {
        if (!this.N.N()) {
            throw new IllegalStateException("Lock is no longer valid");
        }
    }

    class04785(class04777 class047772, String string, Path path) throws IOException {
        this.L = class047772;
        this.u = string;
        this.y = new class04779(path);
        this.N = class05323.N((Path)path);
    }

    public Dynamic<?> B() throws IOException {
        return this.y(false);
    }

    public Dynamic<?> Z() throws IOException {
        return this.y(true);
    }

    public class04779 i() {
        return this.y;
    }

    public boolean m() {
        return class07536.N((Path)this.y.y(), (Path)this.y.L(), (Path)this.y.N(ZonedDateTime.now()), (boolean)true);
    }

    public void U() throws IOException {
        this.P();
        Path path = this.y.i();
        class04777.N.info("Deleting level {}", (Object)this.u);
        for (int i = 1; i <= 5; ++i) {
            class04777.N.info("Attempt {}...", (Object)i);
            try {
                Files.walkFileTree(this.y.R(), (FileVisitor<? super Path>)new class10466(this, path));
                break;
            }
            catch (IOException iOException) {
                if (i < 5) {
                    class04777.N.warn("Failed to delete {}", (Object)this.y.R(), (Object)iOException);
                    try {
                        Thread.sleep(500L);
                    }
                    catch (InterruptedException interruptedException) {}
                    continue;
                }
                throw iOException;
            }
        }
    }

    @Override
    public void close() throws IOException {
        this.N.close();
    }

    public Optional<Path> z() {
        if (!this.N.N()) {
            return Optional.empty();
        }
        return Optional.of(this.y.u());
    }

    public class04777 u() {
        return this.L;
    }

    private Dynamic<?> y(boolean bl) throws IOException {
        this.P();
        return class04777.N(bl ? this.y.L() : this.y.y(), this.L.u);
    }

    public void y(String string) throws IOException {
        this.N((class07001 class070012) -> {
            class070012.N_67("LevelName", string.trim());
            class070012.b("Player");
        });
    }

    public boolean y() {
        return this.N() < 0x4000000L;
    }

    public long E() throws IOException {
        this.P();
        String string = class03804.N.format(ZonedDateTime.now()) + "_" + this.u;
        Path path = this.L.u();
        try {
            class06290.L((Path)path);
        }
        catch (IOException iOException) {
            throw new RuntimeException(iOException);
        }
        Path path2 = path.resolve(class06290.N((Path)path, (String)string, (String)".zip"));
        try (ZipOutputStream zipOutputStream = new ZipOutputStream(new BufferedOutputStream(Files.newOutputStream(path2, new OpenOption[0])));){
            Path path3 = Paths.get(this.u, new String[0]);
            Files.walkFileTree(this.y.R(), (FileVisitor<? super Path>)new class10469(this, path3, zipOutputStream));
        }
        return Files.size(path2);
    }

    public long N() {
        try {
            return Files.getFileStore(this.y.R()).getUsableSpace();
        }
        catch (Exception exception) {
            return Long.MAX_VALUE;
        }
    }

    private void N(Consumer<class07001> consumer) throws IOException {
        this.P();
        class07001 class070012 = class04777.L(this.y.y());
        consumer.accept(class070012.m("Data"));
        this.N(class070012);
    }

    public @Nullable Instant N(boolean bl) {
        return class04777.u(bl ? this.y.L() : this.y.y());
    }

    public void N(class01042 class010422, class05081 class050812) {
        this.N(class010422, class050812, null);
    }

    public Path N(class05071 class050712) {
        return this.i.computeIfAbsent(class050712, this.y::N);
    }

    public class06434 N(Dynamic<?> dynamic) {
        this.P();
        return this.L.N(dynamic, this.y, false);
    }

    private void N(class07001 class070012) {
        Path path = this.y.R();
        try {
            Path path2 = Files.createTempFile(path, "level", ".dat", new FileAttribute[0]);
            class07742.N((class07001)class070012, (Path)path2);
            Path path3 = this.y.L();
            class07536.N((Path)this.y.y(), (Path)path2, (Path)path3);
        }
        catch (Exception exception) {
            class04777.N.error("Failed to save level {}", (Object)path, (Object)exception);
        }
    }

    public void N(class01042 class010422, class05081 class050812, @Nullable class07001 class070012) {
        class07001 class070013 = class050812.N(class010422, class070012);
        class07001 class070014 = new class07001();
        class070014.N("Data", (class07709)class070013);
        this.N(class070014);
    }

    public Path N(class05946<class07299> class059462) {
        return class07376.N(class059462, (Path)this.y.R());
    }

    public void N(String string) throws IOException {
        this.N((class07001 class070012) -> class070012.N_67("LevelName", string.trim()));
    }

    public boolean W() {
        return Files.exists(this.y.y(), new LinkOption[0]) || Files.exists(this.y.L(), new LinkOption[0]);
    }

    public String R() {
        return this.u;
    }
}

