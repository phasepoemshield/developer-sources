/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.ImmutableStringReader
 *  com.mojang.brigadier.StringReader
 *  minecraft.class01894
 *  minecraft.class02168
 *  minecraft.class02173
 *  minecraft.class08501
 */
package Nursultan;

import com.mojang.brigadier.ImmutableStringReader;
import com.mojang.brigadier.StringReader;
import java.util.stream.Stream;
import minecraft.class01894;
import minecraft.class02168;
import minecraft.class02173;
import minecraft.class08501;

public class class09653<T, C, P>
extends class02173<class02168<T, C, P>, T> {
    public class09653(class08501<StringReader, class01894> class085012, class02168<T, C, P> class021682) {
        super(class085012, class021682);
    }

    public Stream<class01894> y() {
        return ((class02168)this.N).N();
    }

    protected T N(ImmutableStringReader immutableStringReader, class01894 class018942) throws Exception {
        return (T)((class02168)this.N).B(immutableStringReader, class018942);
    }
}

