/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  minecraft.class00751
 *  minecraft.class05946
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.serialization.Codec;
import java.util.HashMap;
import java.util.Map;
import minecraft.class00751;
import minecraft.class01801;
import minecraft.class05946;
import org.jspecify.annotations.Nullable;

public class class01794 {
    private final Map<class05946<? extends class00751<?>>, class01801<?>> N = new HashMap();

    public <T> class01794 N(class05946<? extends class00751<? extends T>> class059462, Codec<T> codec) {
        this.N.put(class059462, new class01801<T>(codec));
        return this;
    }

    public <T> @Nullable class01801<T> N(class05946<? extends class00751<? extends T>> class059462) {
        return this.N.get(class059462);
    }
}

