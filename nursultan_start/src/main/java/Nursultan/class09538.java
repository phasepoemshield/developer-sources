/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01866
 *  minecraft.class01869
 *  minecraft.class01874
 *  minecraft.class05096
 *  org.jspecify.annotations.Nullable
 */
package Nursultan;

import minecraft.class01866;
import minecraft.class01869;
import minecraft.class01874;
import minecraft.class05096;
import org.jspecify.annotations.Nullable;

public class class09538
extends class01869 {
    public class09538(class01874 class018742) {
        super((class01866)class018742);
    }

    public void N(String string, @Nullable class05096 class050962) {
        class01874.N.warn("Commands are not supported in configuration phase, trying to run '{}'", (Object)string);
    }
}

