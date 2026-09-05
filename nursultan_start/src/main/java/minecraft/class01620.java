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

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import minecraft.class01061;
import minecraft.class01078;
import minecraft.class01592;
import minecraft.class01622;
import minecraft.class02267;
import minecraft.class04154;

public class class01620
implements class01061 {
    private final Path N;

    public class01620(Path path) {
        this.N = path;
    }

    public class01622 method_52424(class02267 class022672) {
        return new class01592(class022672, this.N);
    }

    public class01622 method_52425(class02267 class022672, class01078 class010782) {
        class01622 class016222 = this.method_52424(class022672);
        List var4 = class010782.u();
        if (var4.isEmpty()) {
            return class016222;
        }
        ArrayList<class01592> arrayList = new ArrayList<class01592>(var4.size());
        for (String string : var4) {
            Path path = this.N.resolve(string);
            arrayList.add(new class01592(class022672, path));
        }
        return new class04154(class016222, arrayList);
    }
}

