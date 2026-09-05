/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00891
 *  minecraft.class01894
 *  minecraft.class05388
 *  minecraft.class05428
 *  minecraft.class08819
 */
package minecraft;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import minecraft.class00891;
import minecraft.class01894;
import minecraft.class05388;
import minecraft.class05428;
import minecraft.class08819;

@FunctionalInterface
public interface class01343 {
    public class05428 get(class00891 var1);

    default public class01343 N(Consumer<class05388> consumer) {
        return class008912 -> this.get(class008912).N(consumer);
    }

    default public class01894 N(class00891 class008912, String string, BiConsumer<class01894, class08819> biConsumer) {
        return this.get(class008912).N(class008912, string, biConsumer);
    }

    default public class01894 N(class00891 class008912, BiConsumer<class01894, class08819> biConsumer) {
        return this.get(class008912).N(class008912, biConsumer);
    }
}

