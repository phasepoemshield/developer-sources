/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class11299
 *  Nursultan.class11329
 *  Nursultan.class11364
 *  Nursultan.class11493
 *  Nursultan.class11506
 *  Nursultan.class11514
 *  Nursultan.class11519
 *  Nursultan.class11537
 *  Nursultan.class11826
 *  Nursultan.class11938
 */
package Nursultan;

import Nursultan.class09341;
import Nursultan.class11299;
import Nursultan.class11329;
import Nursultan.class11364;
import Nursultan.class11493;
import Nursultan.class11506;
import Nursultan.class11514;
import Nursultan.class11519;
import Nursultan.class11537;
import Nursultan.class11826;
import Nursultan.class11938;

public class class09310
implements class11826<class11364> {
    static {
        class09310.N();
    }

    public void listen(class11364 class113642) {
        if (class11299.y()) {
            return;
        }
        class11938.M().N(class113642.N()).ifPresent(class115312 -> class115312.N(true));
        switch (((int[])class09341.N_0)[class113642.N().ordinal()]) {
            case 1: {
                class11519.y(class11493.class);
                break;
            }
            case 2: {
                class11519.y(class11329.class);
                break;
            }
            case 3: {
                class11519.y(class11506.class);
                break;
            }
            case 4: {
                class11519.y(class11537.class);
                break;
            }
            case 5: {
                class11519.y(class11514.class);
            }
        }
        class11938.d().N(class113642.N());
    }

    private static void N() {
    }
}

