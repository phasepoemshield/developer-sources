/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00408
 *  minecraft.class01894
 *  minecraft.class07001
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;
import minecraft.class00408;
import minecraft.class01410;
import minecraft.class01894;
import minecraft.class07001;
import org.jspecify.annotations.Nullable;

public class class01418 {
    private static final String N = "command_storage_";
    private final Map<String, class01410> y = new HashMap<String, class01410>();
    private final class00408 L;

    private class01410 L(String string) {
        class01410 class014102 = this.y.get(string);
        if (class014102 != null) {
            return class014102;
        }
        class01410 class014103 = (class01410)this.L.N(class01410.N(string));
        this.y.put(string, class014103);
        return class014103;
    }

    public class01418(class00408 class004082) {
        this.L = class004082;
    }

    private @Nullable class01410 y(String string) {
        class01410 class014102 = this.y.get(string);
        if (class014102 != null) {
            return class014102;
        }
        class01410 class014103 = (class01410)this.L.y(class01410.N(string));
        if (class014103 != null) {
            this.y.put(string, class014103);
        }
        return class014103;
    }

    public Stream<class01894> N() {
        return this.y.entrySet().stream().flatMap(entry -> ((class01410)((Object)((Object)entry.getValue()))).L((String)entry.getKey()));
    }

    static String N(String string) {
        return N + string;
    }

    public void N(class01894 class018942, class07001 class070012) {
        this.L(class018942.y()).N(class018942.N(), class070012);
    }

    public class07001 N(class01894 class018942) {
        class01410 class014102 = this.y(class018942.y());
        if (class014102 != null) {
            return class014102.y(class018942.N());
        }
        return new class07001();
    }
}

