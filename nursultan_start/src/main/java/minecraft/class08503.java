/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01894
 *  minecraft.class03674
 */
package minecraft;

import java.util.function.UnaryOperator;
import minecraft.class01894;
import minecraft.class03674;
import minecraft.class08511;
import minecraft.class08536;

@FunctionalInterface
public interface class08503
extends UnaryOperator<class03674> {
    public static final class08536<class08511> N = class03674::N;
    public static final class08536<class08511> y = class03674::y;
    public static final class08536<class08511> L = class03674::L;
    public static final class08536<class01894> u = class03674::N;
    public static final class08536<Boolean> i = class03674::N;

    default public class08503 N(class08503 class085032) {
        return class036742 -> (class03674)class085032.apply((class03674)this.apply(class036742));
    }
}

