/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class07049
 *  minecraft.class07209
 *  minecraft.class07321
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.util.function.BiConsumer;
import minecraft.class00455;
import minecraft.class00467;
import minecraft.class07049;
import minecraft.class07209;
import minecraft.class07321;
import org.jspecify.annotations.Nullable;

public interface class00457 {
    public <T> void L(class00455<T> var1, BiConsumer<class07049, T> var2);

    public <T> void y(class00455<T> var1, BiConsumer<class07209, T> var2);

    public <T> @Nullable T N(class00455<T> var1, class07049 var2);

    public <T> void N(class00455<T> var1, class00467<T> var2);

    public <T> @Nullable T N(class00455<T> var1, class07209 var2);

    public <T> @Nullable T N(class00455<T> var1, class07321 var2);

    public <T> void N(class00455<T> var1, BiConsumer<class07321, T> var2);
}

