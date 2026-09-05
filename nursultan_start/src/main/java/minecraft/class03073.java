/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class03926
 *  minecraft.class04469
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.util.UUID;
import java.util.function.BooleanSupplier;
import minecraft.class03079;
import minecraft.class03083;
import minecraft.class03926;
import minecraft.class04469;
import org.jspecify.annotations.Nullable;

@FunctionalInterface
public interface class03073 {
    public class03926 unpack(@Nullable class04469 var1, class03079 var2) throws class03083;

    default public void N() {
    }

    public static class03073 N(UUID uUID, BooleanSupplier booleanSupplier) {
        return (class044692, class030792) -> {
            if (booleanSupplier.getAsBoolean()) {
                throw new class03083(class03083.N);
            }
            return class03926.N((UUID)uUID, (String)class030792.N());
        };
    }
}

