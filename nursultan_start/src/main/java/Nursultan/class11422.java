/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class11784
 */
package Nursultan;

import Nursultan.class11417;
import Nursultan.class11784;

public class class11422
extends class11417 {
    public Object y_0;

    @SafeVarargs
    public class11422(String string, boolean bl, Class<? extends class11784> ... classArray) {
        super(string, bl);
        this.u();
        this.y_0 = classArray;
    }

    private void u() {
    }

    public void y(Object object) {
        this.u();
        Class[] classArray = (Class[])this.y_0;
        int n = classArray.length;
        for (int i = 0; i < n; ++i) {
            if (!classArray[i].isInstance(object)) continue;
            ((class11784)object).N();
            return;
        }
    }
}

