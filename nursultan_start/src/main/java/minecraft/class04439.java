/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.serialization.MapCodec
 *  minecraft.class00405
 *  minecraft.class05216
 *  minecraft.class05935
 *  minecraft.class05977
 *  minecraft.class07049
 *  minecraft.class07701
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import minecraft.class00405;
import minecraft.class05216;
import minecraft.class05935;
import minecraft.class05977;
import minecraft.class07049;
import minecraft.class07701;
import org.jspecify.annotations.Nullable;

public interface class04439 {
    public MapCodec<? extends class04439> N();

    default public class05216 N(@Nullable class07701 class077012, @Nullable class07049 class070492, int n) throws CommandSyntaxException {
        return class05216.N((class04439)this);
    }

    default public <T> Optional<T> method_27660(class05935<T> class059352, class00405 class004052) {
        return Optional.empty();
    }

    default public <T> Optional<T> method_27659(class05977<T> class059772) {
        return Optional.empty();
    }
}

