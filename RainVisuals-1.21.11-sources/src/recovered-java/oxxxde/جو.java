/*
 * Decompiled with CFR 0.152.
 */
package oxxxde;

import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Paths;
import java.util.function.Function;

public final class \u062c\u0648
extends Enum<\u062c\u0648> {
    private static final /* synthetic */ \u062c\u0648[] $VALUES;
    public static final /* enum */ \u062c\u0648 OUTSIDE_JAR;
    public static final /* enum */ \u062c\u0648 INSIDE_JAR;
    public final Function<String, InputStream> streamCreateFunction;

    public static \u062c\u0648[] values() {
        return (\u062c\u0648[])$VALUES.clone();
    }

    static {
        INSIDE_JAR = new \u062c\u0648(path -> \u062c\u0648.class.getClassLoader().getResourceAsStream((String)path));
        OUTSIDE_JAR = new \u062c\u0648(path -> {
            try {
                return Files.newInputStream(Paths.get(path, new String[0]), new OpenOption[0]);
            }
            catch (Exception e) {
                throw new RuntimeException(e);
            }
        });
        $VALUES = \u062c\u0648.$values();
    }

    private \u062c\u0648(Function<String, InputStream> streamCreateFunction) {
        this.streamCreateFunction = streamCreateFunction;
    }

    public static \u062c\u0648 valueOf(String name) {
        return Enum.valueOf(\u062c\u0648.class, name);
    }

    private static /* synthetic */ \u062c\u0648[] $values() {
        \u062c\u0648[] \u062c\u0648Array = new \u062c\u0648[2];
        \u062c\u0648Array[0] = INSIDE_JAR;
        \u062c\u0648Array[1] = OUTSIDE_JAR;
        return \u062c\u0648Array;
    }
}

