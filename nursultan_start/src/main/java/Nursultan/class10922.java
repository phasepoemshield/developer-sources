/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.NoSlow
 *  Nursultan.class11354
 *  java.lang.runtime.SwitchBootstraps
 */
package Nursultan;

import Nursultan.NoSlow;
import Nursultan.class10915;
import Nursultan.class10971;
import Nursultan.class11354;
import java.lang.runtime.SwitchBootstraps;
import java.util.Objects;

public class class10922
extends class10915 {
    public class10922(NoSlow noSlow, String string, boolean bl) {
        super(noSlow, string, bl);
    }

    public void y(Object object) {
        Object object2 = object;
        Objects.requireNonNull(object2);
        Object object3 = object2;
        int n = 0;
        switch (SwitchBootstraps.typeSwitch("typeSwitch", new Object[]{class11354.class, class10971.class}, (Object)object3, (int)n)) {
            case 0: {
                ((class11354)object3).N(1.0f);
                break;
            }
            case 1: {
                ((class10971)((Object)object3)).N();
                break;
            }
        }
    }
}

