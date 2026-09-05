/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DataFixer
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.DynamicOps
 *  minecraft.class03916
 *  minecraft.class05715
 *  minecraft.class07001
 *  minecraft.class07709
 *  minecraft.class07713
 *  minecraft.class07717
 *  minecraft.class07742
 *  org.slf4j.Logger
 */
package minecraft;

import com.mojang.datafixers.DataFixer;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import java.nio.file.Path;
import minecraft.class03916;
import minecraft.class05715;
import minecraft.class07001;
import minecraft.class07709;
import minecraft.class07713;
import minecraft.class07717;
import minecraft.class07742;
import org.slf4j.Logger;

public class class06418 {
    private static final Logger y = LogUtils.getLogger();
    public static final int N = 9;
    private final Path L;
    private final DataFixer u;
    private final class03916[] i = new class03916[9];
    private boolean R;

    public class06418(Path path, DataFixer dataFixer) {
        this.L = path.resolve("hotbar.nbt");
        this.u = dataFixer;
        for (int i = 0; i < 9; ++i) {
            this.i[i] = new class03916();
        }
    }

    private void y() {
        try {
            class07001 class070012 = class07742.N((Path)this.L);
            if (class070012 == null) {
                return;
            }
            int n = class07717.y((class07001)class070012, (int)1343);
            class070012 = class05715.field_19215.N(this.u, class070012, n);
            for (int i = 0; i < 9; ++i) {
                this.i[i] = class03916.N.parse((DynamicOps)class07713.N, (Object)class070012.N(String.valueOf(i))).resultOrPartial(string -> y.warn("Failed to parse hotbar: {}", string)).orElseGet(class03916::new);
            }
        }
        catch (Exception exception) {
            y.error("Failed to load creative mode options", (Throwable)exception);
        }
    }

    public class03916 N(int n) {
        if (!this.R) {
            this.y();
            this.R = true;
        }
        return this.i[n];
    }

    public void N() {
        try {
            class07001 class070012 = class07717.i((class07001)new class07001());
            for (int i = 0; i < 9; ++i) {
                class03916 class039162 = this.N(i);
                DataResult dataResult = class03916.N.encodeStart((DynamicOps)class07713.N, (Object)class039162);
                class070012.N(String.valueOf(i), (class07709)dataResult.getOrThrow());
            }
            class07742.y((class07001)class070012, (Path)this.L);
        }
        catch (Exception exception) {
            y.error("Failed to save creative mode options", (Throwable)exception);
        }
    }
}

