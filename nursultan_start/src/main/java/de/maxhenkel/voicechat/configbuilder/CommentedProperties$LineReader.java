/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package de.maxhenkel.voicechat.configbuilder;

import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import javax.annotation.Nullable;

public class CommentedProperties$LineReader
implements Closeable {
    private final BufferedReader reader;

    public CommentedProperties$LineReader(BufferedReader bufferedReader) {
        this.reader = bufferedReader;
    }

    @Override
    public void close() throws IOException {
        this.reader.close();
    }

    public static CommentedProperties$LineReader fromInputStream(InputStream inputStream) {
        return new CommentedProperties$LineReader(new BufferedReader(new InputStreamReader(inputStream)));
    }

    @Nullable
    public String nextLine() throws IOException {
        String string = this.reader.readLine();
        if (string == null) {
            return null;
        }
        if (string.endsWith("\\")) {
            string = string.substring(0, string.length() - 1);
            String string2 = this.nextLine();
            if (string2 == null) {
                return string;
            }
            return string + string2;
        }
        return string;
    }
}

