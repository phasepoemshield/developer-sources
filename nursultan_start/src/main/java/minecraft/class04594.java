/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10460
 *  org.apache.commons.lang3.StringEscapeUtils
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import Nursultan.class10460;
import java.io.IOException;
import java.io.Writer;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.apache.commons.lang3.StringEscapeUtils;
import org.jspecify.annotations.Nullable;

public class class04594 {
    private static final String N = "\r\n";
    private static final String y = ",";
    private final Writer L;
    private final int u;

    public class04594(Writer writer, List<String> list) throws IOException {
        this.L = writer;
        this.u = list.size();
        this.N(list.stream());
    }

    private static String N(@Nullable Object object) {
        return StringEscapeUtils.escapeCsv((String)(object != null ? object.toString() : "[null]"));
    }

    private void N(Stream<? extends @Nullable Object> stream) throws IOException {
        this.L.write(stream.map(class04594::N).collect(Collectors.joining(y)) + N);
    }

    public void N(Object ... objectArray) throws IOException {
        if (objectArray.length != this.u) {
            throw new IllegalArgumentException("Invalid number of columns, expected " + this.u + ", but got " + objectArray.length);
        }
        this.N(Stream.of(objectArray));
    }

    public static class10460 N() {
        return new class10460();
    }
}

