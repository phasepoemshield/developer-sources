/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.ImmutableStringReader
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.serialization.Dynamic
 *  minecraft.class01894
 */
package minecraft;

import com.mojang.brigadier.ImmutableStringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.Dynamic;
import java.util.List;
import java.util.stream.Stream;
import minecraft.class01894;

public interface class02168<T, C, P> {
    public Stream<class01894> L();

    public T M(ImmutableStringReader var1, class01894 var2) throws CommandSyntaxException;

    public T B(ImmutableStringReader var1, class01894 var2) throws CommandSyntaxException;

    public P i(ImmutableStringReader var1, class01894 var2) throws CommandSyntaxException;

    public Stream<class01894> u();

    public T y(List<T> var1);

    public T y(ImmutableStringReader var1, C var2, Dynamic<?> var3) throws CommandSyntaxException;

    public Stream<class01894> y();

    public T N(ImmutableStringReader var1, P var2, Dynamic<?> var3) throws CommandSyntaxException;

    public Stream<class01894> N();

    public T N(T var1);

    public T N(ImmutableStringReader var1, C var2);

    public C R(ImmutableStringReader var1, class01894 var2) throws CommandSyntaxException;
}

