/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01061
 *  minecraft.class01078
 *  minecraft.class02267
 *  minecraft.class04154
 */
package minecraft;

import java.io.File;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import minecraft.class01061;
import minecraft.class01078;
import minecraft.class01591;
import minecraft.class01597;
import minecraft.class01622;
import minecraft.class02267;
import minecraft.class04154;

public class class01613
implements class01061 {
    private final File N;

    public class01613(Path path) {
        this(path.toFile());
    }

    public class01613(File file) {
        this.N = file;
    }

    public class01622 method_52424(class02267 class022672) {
        class01591 class015912 = new class01591(this.N);
        return new class01597(class022672, class015912, "");
    }

    public class01622 method_52425(class02267 class022672, class01078 class010782) {
        class01591 class015912 = new class01591(this.N);
        class01597 class015972 = new class01597(class022672, class015912, "");
        List var5 = class010782.u();
        if (var5.isEmpty()) {
            return class015972;
        }
        ArrayList<class01597> arrayList = new ArrayList<class01597>(var5.size());
        for (String string : var5) {
            arrayList.add(new class01597(class022672, class015912, string));
        }
        return new class04154((class01622)class015972, arrayList);
    }
}

