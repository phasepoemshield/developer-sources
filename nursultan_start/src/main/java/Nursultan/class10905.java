/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.ElytraTarget
 *  Nursultan.class11807
 *  Nursultan.class11919
 *  Nursultan.class11938
 */
package Nursultan;

import Nursultan.ElytraTarget;
import Nursultan.class11807;
import Nursultan.class11919;
import Nursultan.class11938;
import java.util.function.BiConsumer;

public abstract class class10905
extends class11807<ElytraTarget> {
    public class10905(ElytraTarget elytraTarget, String string, boolean bl) {
        super((Object)elytraTarget, string, bl);
    }

    public boolean N(BiConsumer<Integer, Integer> biConsumer) {
        if (class11938.m().u()) {
            return false;
        }
        class11919.N(() -> class11938.u().d().N(10), biConsumer);
        return true;
    }
}

