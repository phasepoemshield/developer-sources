/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class05096
 *  net.fabricmc.api.ClientModInitializer
 *  net.fabricmc.fabric.api.client.screen.v1.ScreenEvents
 *  net.fabricmc.fabric.api.client.screen.v1.ScreenMouseEvents
 */
package Nursultan;

import Nursultan.class09678;
import Nursultan.class09690;
import minecraft.class05096;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.screen.v1.ScreenEvents;
import net.fabricmc.fabric.api.client.screen.v1.ScreenMouseEvents;

public class class09676
implements ClientModInitializer {
    public void onInitializeClient() {
        class09678.N();
        ScreenEvents.BEFORE_INIT.register((class062022, class050962, n, n2) -> {
            ScreenMouseEvents.allowMouseClick((class05096)class050962).register((class050963, class066132) -> {
                class09690 class096902 = class09690.N(class066132.v());
                if (class096902 != null) {
                    return !class09678.N(class050962, class066132.n(), class066132.t(), class096902);
                }
                return true;
            });
            ScreenMouseEvents.allowMouseRelease((class05096)class050962).register((class050963, class066132) -> {
                class09690 class096902 = class09690.N(class066132.v());
                if (class096902 != null) {
                    return !class09678.y(class050962, class066132.n(), class066132.t(), class096902);
                }
                return true;
            });
            ScreenMouseEvents.afterMouseScroll((class05096)class050962).register((class050963, d, d2, d3, d4, bl) -> class09678.N(class050962, d, d2, d4));
        });
    }
}

