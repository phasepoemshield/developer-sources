/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class06069
 *  minecraft.class06889
 *  minecraft.class07049
 *  minecraft.class08005
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import minecraft.class06069;
import minecraft.class06889;
import minecraft.class07049;
import minecraft.class08005;
import org.jspecify.annotations.Nullable;

@FunctionalInterface
public interface class04252 {
    public static final class04252 N = (class080052, class070492, class060692) -> {};
    public static final class04252 y = (class080052, class070492, class060692) -> {
        float f = 170.0f + class060692.z() * 20.0f;
        class080052.method_18799(class080052.method_18798().L(-0.5));
        class080052.method_36456(class080052.method_36454() + f);
        class080052.field_5982 += f;
        class080052.field_64356 = true;
    };
    public static final class04252 L = (class080052, class070492, class060692) -> {
        if (class070492 != null) {
            class06889 class068892 = class070492.method_5720();
            class080052.method_18799(class068892);
            class080052.field_64356 = true;
        }
    };
    public static final class04252 u = (class080052, class070492, class060692) -> {
        if (class070492 != null) {
            class06889 class068892 = class070492.method_18798().u();
            class080052.method_18799(class068892);
            class080052.field_64356 = true;
        }
    };

    public void deflect(class08005 var1, @Nullable class07049 var2, class06069 var3);
}

