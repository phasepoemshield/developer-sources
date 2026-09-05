/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00381
 *  minecraft.class00667
 *  minecraft.class02362
 *  minecraft.class02897
 *  minecraft.class04248
 *  minecraft.class04782
 *  minecraft.class07049
 *  minecraft.class08051
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.util.UUID;
import minecraft.class00381;
import minecraft.class00667;
import minecraft.class02362;
import minecraft.class02897;
import minecraft.class04248;
import minecraft.class04782;
import minecraft.class07049;
import minecraft.class08051;
import org.jspecify.annotations.Nullable;

public class class07810
implements class00381<class08051> {
    public static final class02362<class00667, class07810> N = class00381.N(class07810::N, class07810::new);
    private final UUID y;

    public class07810(UUID uUID) {
        this.y = uUID;
    }

    private class07810(class00667 class006672) {
        this.y = class006672.m();
    }

    public void method_65081(class08051 class080512) {
        class080512.method_12073(this);
    }

    private void N(class00667 class006672) {
        class006672.N(this.y);
    }

    public @Nullable class07049 N(class04782 class047822) {
        return class047822.method_66347(this.y);
    }

    public class02897<class07810> method_65080() {
        return class04248.Lv;
    }
}

