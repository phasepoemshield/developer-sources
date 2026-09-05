/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package Nursultan;

import Nursultan.class11731;
import Nursultan.class11752;
import java.util.HashMap;
import java.util.Map;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class11742 {
    public static Object N_0;
    public Object y_0;

    private static void L() {
        N_0 = null;
    }

    public class11742() {
        this.y();
        this.y_0 = new HashMap();
    }

    static {
        class11742.L();
        N_0 = LogManager.getLogger(String.class);
    }

    private void y() {
    }

    public void N(String string, String string2) {
        class11731 class117312 = (class11731)((Map)this.y_0).remove(string);
        if (class117312 != null) {
            class117312.N();
        }
        try {
            ((Map)this.y_0).put(string, class11752.N(string2));
        }
        catch (Exception exception) {
            ((Logger)N_0).error("Failed to register icon atlas '{}' at '{}': {}", (Object)string, (Object)string2, (Object)exception.getMessage(), (Object)exception);
        }
    }

    public class11731 N(String string) {
        return (class11731)((Map)this.y_0).get(string);
    }
}

