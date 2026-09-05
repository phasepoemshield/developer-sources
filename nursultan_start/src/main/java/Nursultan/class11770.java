/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class11911
 *  org.apache.commons.io.IOUtils
 */
package Nursultan;

import Nursultan.class11758;
import Nursultan.class11911;
import java.io.IOException;
import java.io.InputStream;
import org.apache.commons.io.IOUtils;

public class class11770
implements class11758 {
    class11770() {
    }

    @Override
    public byte[] N(String string) throws IOException {
        try (InputStream inputStream = class11911.L((String)string).method_14482();){
            byte[] byArray = IOUtils.toByteArray((InputStream)inputStream);
            return byArray;
        }
    }
}

