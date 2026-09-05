/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class03138
 *  minecraft.class07536
 */
package Nursultan;

import java.io.DataOutput;
import java.io.IOException;
import java.io.UTFDataFormatException;
import minecraft.class03138;
import minecraft.class07536;

public class class10786
extends class03138 {
    public class10786(DataOutput dataOutput) {
        super(dataOutput);
    }

    public void writeUTF(String string) throws IOException {
        try {
            super.writeUTF(string);
        }
        catch (UTFDataFormatException uTFDataFormatException) {
            class07536.N((String)"Failed to write NBT String", (Throwable)uTFDataFormatException);
            super.writeUTF("");
        }
    }
}

