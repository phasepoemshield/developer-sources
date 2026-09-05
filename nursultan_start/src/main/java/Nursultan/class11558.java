/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class11472
 *  Nursultan.class11938
 *  fun.crashsystem.jdrpc.entity.User
 *  fun.crashsystem.jdrpc.event.DiscordEventListener
 *  org.apache.logging.log4j.Logger
 */
package Nursultan;

import Nursultan.class11472;
import Nursultan.class11575;
import Nursultan.class11938;
import fun.crashsystem.jdrpc.entity.User;
import fun.crashsystem.jdrpc.event.DiscordEventListener;
import java.util.concurrent.atomic.AtomicBoolean;
import org.apache.logging.log4j.Logger;

public class class11558
implements DiscordEventListener {
    public Object N_0;

    private void L() {
    }

    public class11558(class11575 class115752) {
        this.L();
        this.N_0 = class115752;
    }

    public void onDisconnect(int n, String string) {
        ((Logger)class11575.N_0).info("Discord RPC disconnected: {} (code {})", (Object)string, (Object)n);
    }

    public void onError(int n, String string) {
        ((Logger)class11575.N_0).warn("Discord RPC error: {} (code {})", (Object)string, (Object)n);
    }

    public void onReady(User user) {
        try {
            ((class11472)class11938.L_2).N(user);
            if (((AtomicBoolean)((class11575)this.N_0).y_0).get()) {
                ((class11575)this.N_0).R();
            }
        }
        catch (Exception exception) {
            ((Logger)class11575.N_0).warn("Discord onReady handler failed: {}", (Object)exception.getMessage());
        }
    }
}

