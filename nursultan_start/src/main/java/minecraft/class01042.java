/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09430
 *  Nursultan.class09431
 *  com.mojang.logging.LogUtils
 *  minecraft.class00751
 *  minecraft.class01929
 *  minecraft.class05946
 *  org.slf4j.Logger
 */
package minecraft;

import Nursultan.class09430;
import Nursultan.class09431;
import com.mojang.logging.LogUtils;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Stream;
import minecraft.class00751;
import minecraft.class01012;
import minecraft.class01014;
import minecraft.class01022;
import minecraft.class01929;
import minecraft.class05946;
import org.slf4j.Logger;

public interface class01042
extends class01929 {
    public static final Logger N = LogUtils.getLogger();
    public static final class01022 y = new class01014(Map.of()).method_40316();

    default public Stream<class05946<? extends class00751<?>>> y() {
        return this.method_40311().map(class010122 -> class010122.N());
    }

    public static class01022 N(class00751<? extends class00751<?>> class007512) {
        return new class09431(class007512);
    }

    default public <E> class00751<E> L(class05946<? extends class00751<? extends E>> class059462) {
        return this.method_46759(class059462).orElseThrow(() -> new IllegalStateException("Missing registry: " + String.valueOf(class059462)));
    }

    public <E> Optional<class00751<E>> method_46759(class05946<? extends class00751<? extends E>> var1);

    public Stream<class01012<?>> method_40311();

    default public class01022 method_40316() {
        return new class09430(this, this.method_40311().map(class01012::L));
    }
}

