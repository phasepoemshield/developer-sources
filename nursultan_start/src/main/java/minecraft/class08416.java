/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00780
 *  minecraft.class02136
 *  minecraft.class03556
 *  minecraft.class03557
 *  minecraft.class04540
 *  minecraft.class06069
 *  minecraft.class06563
 */
package minecraft;

import minecraft.class00780;
import minecraft.class02136;
import minecraft.class03556;
import minecraft.class03557;
import minecraft.class04540;
import minecraft.class06069;
import minecraft.class06563;
import minecraft.class08411;
import minecraft.class08414;

public class class08416 {
    private static final class08414 N = new class08414(class08416.N((class04540<class08411>)class08416.N().N((Object)class08416.y(class06563.field_7963), 5).N((Object)class08416.y(class06563.field_7944), 5).N((Object)class08416.y(class06563.field_7967), 5).N((Object)class08416.y(class06563.field_7957), 3).N((Object)class08416.N(class06563.field_7952), 82).N()));
    private static final class08414 y = new class08414(class08416.N((class04540<class08411>)class08416.N().N((Object)class08416.y(class06563.field_7944), 5).N((Object)class08416.y(class06563.field_7967), 5).N((Object)class08416.y(class06563.field_7952), 5).N((Object)class08416.y(class06563.field_7963), 3).N((Object)class08416.N(class06563.field_7957), 82).N()));
    private static final class08414 L = new class08414(class08416.N((class04540<class08411>)class08416.N().N((Object)class08416.y(class06563.field_7967), 5).N((Object)class08416.y(class06563.field_7944), 5).N((Object)class08416.y(class06563.field_7952), 5).N((Object)class08416.y(class06563.field_7957), 3).N((Object)class08416.N(class06563.field_7963), 82).N()));

    private static class08411 y(class06563 class065632) {
        return class060692 -> class065632;
    }

    private static class02136<class08411> N() {
        return class04540.y();
    }

    public static class06563 N(class03556<class00780> class035562, class06069 class060692) {
        return class08416.N(class035562).N().get(class060692);
    }

    private static class08411 N(class06563 class065632) {
        return class08416.N((class04540<class08411>)class08416.N().N((Object)class08416.y(class065632), 499).N((Object)class08416.y(class06563.field_7954), 1).N());
    }

    private static class08411 N(class04540<class08411> class045402) {
        if (class045402.L()) {
            throw new IllegalArgumentException("List must be non-empty");
        }
        return class060692 -> ((class08411)class045402.y(class060692)).get(class060692);
    }

    private static class08414 N(class03556<class00780> class035562) {
        if (class035562.N(class03557.NM)) {
            return y;
        }
        if (class035562.N(class03557.NR)) {
            return L;
        }
        return N;
    }
}

