/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DataFixer
 *  minecraft.class02277
 *  minecraft.class05715
 *  minecraft.class05918
 *  minecraft.class06172
 *  minecraft.class06820
 *  minecraft.class07001
 *  minecraft.class07321
 *  org.apache.commons.io.FileUtils
 */
package minecraft;

import com.mojang.datafixers.DataFixer;
import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;
import minecraft.class02277;
import minecraft.class05715;
import minecraft.class05918;
import minecraft.class06172;
import minecraft.class06820;
import minecraft.class07001;
import minecraft.class07321;
import org.apache.commons.io.FileUtils;

public class class02877
extends class06172 {
    private final class05918 N;
    private final Path y;

    public class02877(class02277 class022772, Path path, class02277 class022773, Path path2, DataFixer dataFixer, boolean bl, class05715 class057152, Supplier<class06820> supplier) {
        super(class022772, path, dataFixer, bl, class057152, supplier);
        this.y = path2;
        this.N = new class05918(class022773, path2, bl);
    }

    public void close() throws IOException {
        super.close();
        this.N.close();
        if (this.y.toFile().exists()) {
            FileUtils.deleteDirectory((File)this.y.toFile());
        }
    }

    public CompletableFuture<Void> N(class07321 class073212, Supplier<class07001> supplier) {
        this.i(class073212);
        return this.N.N(class073212, supplier);
    }
}

