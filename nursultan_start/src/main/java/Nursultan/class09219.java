/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09778
 *  Nursultan.class09788
 *  Nursultan.class09798
 *  Nursultan.class09809
 *  Nursultan.class09991
 *  Nursultan.class11504
 *  Nursultan.class11507
 *  Nursultan.class11515
 *  Nursultan.class11517
 *  Nursultan.class11523
 *  Nursultan.class11525
 *  Nursultan.class11527
 *  Nursultan.class11532
 *  Nursultan.class11533
 *  Nursultan.class11536
 *  Nursultan.class11844
 *  Nursultan.class12018
 *  Nursultan.class12020
 *  java.lang.runtime.SwitchBootstraps
 */
package Nursultan;

import Nursultan.class09178;
import Nursultan.class09183;
import Nursultan.class09185;
import Nursultan.class09188;
import Nursultan.class09199;
import Nursultan.class09201;
import Nursultan.class09204;
import Nursultan.class09206;
import Nursultan.class09208;
import Nursultan.class09220;
import Nursultan.class09778;
import Nursultan.class09788;
import Nursultan.class09798;
import Nursultan.class09809;
import Nursultan.class09991;
import Nursultan.class11504;
import Nursultan.class11507;
import Nursultan.class11515;
import Nursultan.class11517;
import Nursultan.class11523;
import Nursultan.class11525;
import Nursultan.class11527;
import Nursultan.class11532;
import Nursultan.class11533;
import Nursultan.class11536;
import Nursultan.class11844;
import Nursultan.class12018;
import Nursultan.class12020;
import java.lang.runtime.SwitchBootstraps;
import java.util.Objects;

public class class09219 {
    public static Object N_0;

    private class09219() {
    }

    static {
        class09219.N();
        N_0 = new class09219()::N;
    }

    private class09798 N(class11844 class118442, class09809 class098092) {
        String string = class118442.y().P().N();
        class11536 class115362 = class118442.y();
        Objects.requireNonNull(class115362);
        class11536 var4 = class115362;
        int n = 0;
        return switch (SwitchBootstraps.typeSwitch("typeSwitch", new Object[]{class11507.class, class11533.class, class11527.class, class11532.class, class11504.class, class11525.class, class11515.class, class11523.class, class11517.class}, (Object)var4, (int)n)) {
            case 0 -> {
                class11507 var6_6 = (class11507)var4;
                yield class098092.N("$checkbox" + string, (class09788)class09188.N_0, (Object)class118442);
            }
            case 1 -> {
                class11533 var7_7 = (class11533)var4;
                yield class098092.N("$input" + string, (class09788)class09206.N_0, (Object)class118442);
            }
            case 2 -> {
                class11527 var8_8 = (class11527)var4;
                yield class098092.N("$hotkey" + string, (class09788)class09185.N_0, (Object)class118442);
            }
            case 3 -> {
                class11532 var9_9 = (class11532)var4;
                yield class098092.N("$button" + string, (class09788)class09220.N_0, (Object)class118442);
            }
            case 4 -> {
                class11504 var10_10 = (class11504)var4;
                yield class098092.N("$slider" + string, (class09788)class09178.N_0, (Object)class118442);
            }
            case 5 -> {
                class11525 var11_11 = (class11525)var4;
                yield class098092.N("$rangeSlider" + string, (class09788)class09201.N_0, (Object)class118442);
            }
            case 6 -> {
                class11515 var12_12 = (class11515)var4;
                yield class098092.N("$colorPicker" + string, (class09788)class09199.N_0, (Object)class118442);
            }
            case 7 -> {
                class11523 var13_13 = (class11523)var4;
                yield class098092.N("$combo" + string, (class09788)class09208.N_0, (Object)class118442);
            }
            case 8 -> {
                class11517 var14_14 = (class11517)var4;
                yield class098092.N("$selectable" + string, (class09788)class09204.N_0, (Object)class118442);
            }
            default -> class09778.N((String)class12020.N((class12018)class118442.y().P()), (class09991)((class09991)class09183.N_4));
        };
    }

    private static void N() {
    }
}

