/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  minecraft.class01766
 *  minecraft.class07701
 */
package minecraft;

import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Collection;
import java.util.function.Supplier;
import minecraft.class01766;
import minecraft.class07701;

@FunctionalInterface
public interface class07765 {
    public Collection<class01766> getNames(class07701 var1, Supplier<Collection<class01766>> var2) throws CommandSyntaxException;
}

