/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  minecraft.class01019
 *  minecraft.class02136
 *  minecraft.class03146
 *  minecraft.class04206
 *  minecraft.class04540
 *  minecraft.class05281
 *  minecraft.class05946
 *  minecraft.class06069
 */
package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.stream.Stream;
import minecraft.class01019;
import minecraft.class02136;
import minecraft.class03120;
import minecraft.class03141;
import minecraft.class03146;
import minecraft.class04206;
import minecraft.class04540;
import minecraft.class05281;
import minecraft.class05946;
import minecraft.class06069;

public interface class03129 {
    public static final Codec<class03129> y = class04206.NB.T().dispatch(class03129::y, Function.identity());

    public MapCodec<? extends class03129> y();

    public static class03120 N(class05946<class05281> class059462, class04540<class05946<class05281>> class045402) {
        return new class03120(class059462, class045402);
    }

    public static class03146 N(class04540<List<class03129>> class045402) {
        return new class03146(class045402);
    }

    public void N(class06069 var1, BiConsumer<class05946<class05281>, class05946<class05281>> var2);

    public Stream<class05946<class05281>> N();

    public static class03141 N(String string, String string2) {
        return class03129.N((class05946<class05281>)class01019.N((String)string), (class05946<class05281>)class01019.N((String)string2));
    }

    public static class03141 N(class05946<class05281> class059462, class05946<class05281> class059463) {
        return new class03141(class059462, class059463);
    }

    public static class03120 N(String string, class04540<String> class045402) {
        class02136 class021362 = class04540.y();
        class045402.u().forEach(class045232 -> class021362.N((Object)class01019.N((String)((String)class045232.N())), class045232.y()));
        return class03129.N((class05946<class05281>)class01019.N((String)string), (class04540<class05946<class05281>>)class021362.N());
    }
}

