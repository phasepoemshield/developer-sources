/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.Message
 *  com.mojang.brigadier.exceptions.SimpleCommandExceptionType
 *  minecraft.class00392
 */
package minecraft;

import com.mojang.brigadier.Message;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Optional;
import minecraft.class00392;
import minecraft.class00819;

public interface class00850<T extends Number> {
    public static final SimpleCommandExceptionType N = new SimpleCommandExceptionType((Message)class00392.L((String)"argument.range.empty"));
    public static final SimpleCommandExceptionType y = new SimpleCommandExceptionType((Message)class00392.L((String)"argument.range.swapped"));

    default public Optional<T> L() {
        return this.N().M();
    }

    default public boolean u() {
        return this.N().N();
    }

    default public Optional<T> y() {
        return this.N().R();
    }

    public class00819<T> N();
}

