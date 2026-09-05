/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00751
 *  minecraft.class05523
 *  minecraft.class05946
 */
package minecraft;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import minecraft.class00751;
import minecraft.class05523;
import minecraft.class05946;

public abstract class class00208 {
    private static final List<class00208> N = new ArrayList<class00208>();

    public static void y(class00751<Consumer<class05523>> class007512) {
        Iterator<class00208> var1 = N.iterator();
        while (var1.hasNext()) {
            var1.next().N((class059462, consumer) -> class00751.N((class00751)class007512, (class05946)class059462, (Object)consumer));
        }
    }

    public abstract void N(BiConsumer<class05946<Consumer<class05523>>, Consumer<class05523>> var1);

    public static void N(class00208 class002082) {
        N.add(class002082);
    }
}

