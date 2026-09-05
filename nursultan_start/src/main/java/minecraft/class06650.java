/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00500
 *  minecraft.class00891
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.util.function.Predicate;
import minecraft.class00500;
import minecraft.class00891;
import org.jspecify.annotations.Nullable;

public class class06650
implements Predicate<class00500> {
    private final class00891 N;

    public class06650(class00891 class008912) {
        this.N = class008912;
    }

    public static class06650 N(class00891 class008912) {
        return new class06650(class008912);
    }

    @Override
    public boolean test(@Nullable class00500 class005002) {
        return class005002 != null && class005002.N(this.N);
    }
}

