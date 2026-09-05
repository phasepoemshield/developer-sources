/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09276
 *  Nursultan.class11849
 *  Nursultan.class11857
 *  Nursultan.class11868
 *  Nursultan.class11877
 *  Nursultan.class11938
 *  Nursultan.class11947
 *  Nursultan.class11951
 *  Nursultan.class12020
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package Nursultan;

import Nursultan.class09276;
import Nursultan.class11405;
import Nursultan.class11849;
import Nursultan.class11857;
import Nursultan.class11868;
import Nursultan.class11877;
import Nursultan.class11938;
import Nursultan.class11947;
import Nursultan.class11951;
import Nursultan.class12020;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class11327 {
    public static Object N_0;
    public static Object N_1;
    public Object y_0;
    public Object y_1;
    public boolean y_init;

    private static void M() {
        N_0 = null;
        N_1 = -1L;
    }

    public class11327() {
        this.y();
        this.y_0 = -1L;
    }

    static {
        class11327.M();
        N_0 = LogManager.getLogger(String.class);
    }

    private void y() {
        if (!this.y_init) {
            this.y_init = true;
            this.y_0 = 0L;
            this.y_1 = 0;
        }
    }

    public synchronized void N() {
        class11405 class114052 = class11938.z();
        if (class114052.R()) {
            class114052.N((class11951<class09276>)new class11947());
        }
    }

    public synchronized void N(long l) {
        if ((Long)this.y_0 == -1L) {
            this.y_0 = l;
            return;
        }
        if (l <= (Long)this.y_0) {
            return;
        }
        if (class11938.g().y(((Integer)this.y_1).intValue())) {
            return;
        }
        ((Logger)N_0).info("Client update revision {} is ahead of session baseline {}", (Object)l, (Object)((Long)this.y_0));
        this.y_1 = class11938.g().i().L().R().N((class11849)new class11877("icon:hud/arrows")).N((class11868)new class11857(class12020.N((String)"update.restart-required"))).N();
    }
}

