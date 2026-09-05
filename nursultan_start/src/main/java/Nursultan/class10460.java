/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  minecraft.class04594
 */
package Nursultan;

import com.google.common.collect.Lists;
import java.io.IOException;
import java.io.Writer;
import java.util.List;
import minecraft.class04594;

public class class10460 {
    private final List<String> N = Lists.newArrayList();

    public class10460 N(String string) {
        this.N.add(string);
        return this;
    }

    public class04594 N(Writer writer) throws IOException {
        return new class04594(writer, this.N);
    }
}

