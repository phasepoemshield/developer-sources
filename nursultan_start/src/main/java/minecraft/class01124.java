/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00734
 *  minecraft.class04197
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.util.UUID;
import java.util.function.Consumer;
import minecraft.class00734;
import minecraft.class01128;
import minecraft.class01135;
import minecraft.class04197;
import org.jspecify.annotations.Nullable;

public interface class01124<T extends class01135> {
    public <U extends T> void N(class01128<T, U> var1, class00734 var2, class04197<U> var3);

    public void N(class00734 var1, Consumer<T> var2);

    public <U extends T> void N(class01128<T, U> var1, class04197<U> var2);

    public Iterable<T> N();

    public @Nullable T N(UUID var1);

    public @Nullable T N(int var1);
}

