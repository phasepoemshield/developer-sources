/*
 * Decompiled with CFR 0.152.
 */
package jnr.posix.util;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;

public interface ProcessMaker {
    public File directory();

    public ProcessMaker redirectInput(File var1);

    public ProcessMaker inheritIO();

    public ProcessMaker redirectOutput(File var1);

    public ProcessMaker redirectInput(Redirect var1);

    public Redirect redirectOutput();

    public List<String> command();

    public Redirect redirectInput();

    public ProcessMaker redirectErrorStream(boolean var1);

    public Map<String, String> environment();

    public boolean redirectErrorStream();

    public ProcessMaker redirectOutput(Redirect var1);

    public Process start() throws IOException;

    public ProcessMaker environment(String[] var1);

    public ProcessMaker command(String ... var1);

    public ProcessMaker command(List<String> var1);

    public Redirect redirectError();

    public ProcessMaker directory(File var1);

    public ProcessMaker redirectError(File var1);

    public ProcessMaker redirectError(Redirect var1);

    public static class Redirect {
        public static final Redirect INHERIT = new Redirect(Type.INHERIT);
        private final File file;
        private final Type type;
        public static final Redirect PIPE = new Redirect(Type.PIPE);

        private Redirect(Type type, File file) {
            this.type = type;
            this.file = file;
        }

        private Redirect(Type type) {
            this(type, null);
        }

        public static Redirect appendTo(File file) {
            return new Redirect(Type.APPEND, file);
        }

        public static Redirect from(File file) {
            return new Redirect(Type.READ, file);
        }

        public File file() {
            return this.file;
        }

        public Type type() {
            return this.type;
        }

        public static Redirect to(File file) {
            return new Redirect(Type.WRITE, file);
        }

        private static final class Type
        extends Enum<Type> {
            private static final /* synthetic */ Type[] $VALUES;
            public static final /* enum */ Type APPEND = new Type();
            public static final /* enum */ Type PIPE;
            public static final /* enum */ Type INHERIT;
            public static final /* enum */ Type WRITE;
            public static final /* enum */ Type READ;

            public static Type[] values() {
                return (Type[])$VALUES.clone();
            }

            static {
                INHERIT = new Type();
                PIPE = new Type();
                READ = new Type();
                WRITE = new Type();
                $VALUES = Type.$values();
            }

            private static /* synthetic */ Type[] $values() {
                Type[] typeArray = new Type[5];
                typeArray[0] = APPEND;
                typeArray[1] = INHERIT;
                typeArray[2] = PIPE;
                typeArray[3] = READ;
                typeArray[4] = WRITE;
                return typeArray;
            }

            public static Type valueOf(String name) {
                return Enum.valueOf(Type.class, name);
            }
        }
    }
}

