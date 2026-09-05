/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class05113
 *  org.apache.commons.io.input.CountingInputStream
 */
package Nursultan;

import java.io.IOException;
import java.io.InputStream;
import minecraft.class05113;
import org.apache.commons.io.input.CountingInputStream;

public class class10490
extends CountingInputStream {
    private final class05113 N;

    public class10490(InputStream inputStream, class05113 class051132) {
        super(inputStream);
        this.N = class051132;
    }

    protected void afterRead(int n) throws IOException {
        super.afterRead(n);
        this.N.y(this.getByteCount());
    }
}

