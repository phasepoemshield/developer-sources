/*
 * Decompiled with CFR 0.152.
 */
package jnr.posix;

import java.io.File;
import java.io.InputStream;
import java.io.PrintStream;
import jnr.constants.platform.Errno;

public interface POSIXHandler {
    public int getPID();

    public boolean isVerbose();

    public void error(Errno var1, String var2, String var3);

    public void warn(WARNING_ID var1, String var2, Object ... var3);

    public PrintStream getOutputStream();

    public File getCurrentWorkingDirectory();

    public void unimplementedError(String var1);

    public void error(Errno var1, String var2);

    public String[] getEnv();

    public PrintStream getErrorStream();

    public InputStream getInputStream();

    public static final class WARNING_ID
    extends Enum<WARNING_ID> {
        public static final /* enum */ WARNING_ID DUMMY_VALUE_USED = new WARNING_ID("DUMMY_VALUE_USED");
        private String messageID;
        private static final /* synthetic */ WARNING_ID[] $VALUES;

        private static /* synthetic */ WARNING_ID[] $values() {
            WARNING_ID[] wARNING_IDArray = new WARNING_ID[1];
            wARNING_IDArray[0] = DUMMY_VALUE_USED;
            return wARNING_IDArray;
        }

        public static WARNING_ID[] values() {
            return (WARNING_ID[])$VALUES.clone();
        }

        static {
            $VALUES = WARNING_ID.$values();
        }

        public static WARNING_ID valueOf(String name) {
            return Enum.valueOf(WARNING_ID.class, name);
        }

        private WARNING_ID(String messageID) {
            this.messageID = messageID;
        }
    }
}

