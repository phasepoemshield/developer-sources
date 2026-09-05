/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00751
 *  minecraft.class01894
 *  minecraft.class04227
 *  minecraft.class05523
 *  minecraft.class05946
 */
package minecraft;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import minecraft.class00208;
import minecraft.class00751;
import minecraft.class01894;
import minecraft.class04227;
import minecraft.class05523;
import minecraft.class05946;

public class class00229
extends class00208 {
    public static final class05946<Consumer<class05523>> N = class00229.N("always_pass");
    public static final Consumer<class05523> y = class05523::u;

    private static class05946<Consumer<class05523>> N(String string) {
        return class05946.N((class05946)class04227.NJ, (class01894)class01894.y((String)string));
    }

    @Override
    public void N(BiConsumer<class05946<Consumer<class05523>>, Consumer<class05523>> biConsumer) {
        biConsumer.accept(N, y);
    }

    public static Consumer<class05523> N(class00751<Consumer<class05523>> class007512) {
        class00229.N(new class00229());
        class00229.y(class007512);
        return y;
    }
}

