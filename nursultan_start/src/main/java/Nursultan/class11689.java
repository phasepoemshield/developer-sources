/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.NoDelay
 */
package Nursultan;

import Nursultan.NoDelay;
import Nursultan.class11704;
import java.util.function.Consumer;

public class class11689
extends class11704 {
    public Object y_0;

    private void L() {
    }

    public class11689(NoDelay noDelay, String string, boolean bl, Consumer<Object> consumer) {
        super(noDelay, string, bl);
        this.L();
        this.y_0 = consumer;
    }

    public void y(Object object) {
        this.L();
        ((Consumer)this.y_0).accept(object);
    }
}

