/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DataFixer
 *  com.mojang.logging.LogUtils
 *  minecraft.class01929
 *  minecraft.class03804
 *  minecraft.class04490
 *  minecraft.class04495
 *  minecraft.class04785
 *  minecraft.class05071
 *  minecraft.class05715
 *  minecraft.class07001
 *  minecraft.class07536
 *  minecraft.class07717
 *  minecraft.class07726
 *  minecraft.class07742
 *  minecraft.class08036
 *  minecraft.class08303
 *  minecraft.class08329
 *  minecraft.class08774
 *  org.slf4j.Logger
 */
package minecraft;

import com.mojang.datafixers.DataFixer;
import com.mojang.logging.LogUtils;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.FileAttribute;
import java.time.ZonedDateTime;
import java.util.Optional;
import minecraft.class01929;
import minecraft.class03804;
import minecraft.class04490;
import minecraft.class04495;
import minecraft.class04785;
import minecraft.class05071;
import minecraft.class05715;
import minecraft.class07001;
import minecraft.class07536;
import minecraft.class07717;
import minecraft.class07726;
import minecraft.class07742;
import minecraft.class08036;
import minecraft.class08303;
import minecraft.class08329;
import minecraft.class08774;
import org.slf4j.Logger;

public class class07842 {
    private static final Logger y = LogUtils.getLogger();
    private final File L;
    protected final DataFixer N;

    public class07842(class04785 class047852, DataFixer dataFixer) {
        this.N = dataFixer;
        this.L = class047852.N(class05071.L).toFile();
        this.L.mkdirs();
    }

    private Optional<class07001> y(class08774 class087742, String string) {
        File file = new File(this.L, String.valueOf(class087742.N()) + string);
        if (file.exists() && file.isFile()) {
            try {
                return Optional.of(class07742.N((Path)file.toPath(), (class07726)class07726.L()));
            }
            catch (Exception exception) {
                y.warn("Failed to load player data for {}", (Object)class087742.y());
            }
        }
        return Optional.empty();
    }

    public Optional<class07001> N(class08774 class087742) {
        Optional<class07001> var2 = this.y(class087742, ".dat");
        if (var2.isEmpty()) {
            this.N(class087742, ".dat");
        }
        return var2.or(() -> this.y(class087742, ".dat_old")).map(class070012 -> {
            int n = class07717.R((class07001)class070012);
            class070012 = class05715.field_19213.N(this.N, class070012, n);
            return class070012;
        });
    }

    public void N(class08036 class080362) {
        try (class04495 class044952 = new class04495(class080362.method_71370(), y);){
            class08303 class083032 = class08303.N((class04490)class044952, (class01929)class080362.method_56673());
            class080362.method_5647((class08329)class083032);
            Path path = this.L.toPath();
            Path path2 = Files.createTempFile(path, class080362.method_5845() + "-", ".dat", new FileAttribute[0]);
            class07742.N((class07001)class083032.y(), (Path)path2);
            Path path3 = path.resolve(class080362.method_5845() + ".dat");
            Path path4 = path.resolve(class080362.method_5845() + ".dat_old");
            class07536.N((Path)path3, (Path)path2, (Path)path4);
        }
        catch (Exception exception) {
            y.warn("Failed to save player data for {}", (Object)class080362.method_74861());
        }
    }

    private void N(class08774 class087742, String string) {
        Path path = this.L.toPath();
        String string2 = class087742.N().toString();
        Path path2 = path.resolve(string2 + string);
        Path path3 = path.resolve(string2 + "_corrupted_" + ZonedDateTime.now().format(class03804.N) + string);
        if (!Files.isRegularFile(path2, new LinkOption[0])) {
            return;
        }
        try {
            Files.copy(path2, path3, StandardCopyOption.REPLACE_EXISTING, StandardCopyOption.COPY_ATTRIBUTES);
        }
        catch (Exception exception) {
            y.warn("Failed to copy the player.dat file for {}", (Object)class087742.y(), (Object)exception);
        }
    }
}

