/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class01079
 *  minecraft.class01089
 *  minecraft.class01894
 *  minecraft.class03069
 *  minecraft.class04233
 *  net.irisshaders.iris.pbr.texture.PBRType
 *  org.spongepowered.asm.mixin.injection.invoke.arg.Args
 *  org.spongepowered.asm.synthetic.args.ArgsN6
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Map;
import java.util.function.BiConsumer;
import minecraft.class01079;
import minecraft.class01089;
import minecraft.class01894;
import minecraft.class03069;
import minecraft.class04205;
import minecraft.class04233;
import net.irisshaders.iris.pbr.texture.PBRType;
import org.spongepowered.asm.mixin.injection.invoke.arg.Args;
import org.spongepowered.asm.synthetic.args.ArgsN6;

public final class class04221
extends Record
implements class04233 {
    private final String sourcePath;
    private final String idPrefix;
    public static final MapCodec<class04221> y = RecordCodecBuilder.mapCodec(instance -> instance.group((App)Codec.STRING.fieldOf("source").forGetter(class04221::y), (App)Codec.STRING.fieldOf("prefix").forGetter(class04221::L)).apply(instance, class04221::new));

    public String L() {
        return this.idPrefix;
    }

    public class04221(String string, String string2) {
        this.sourcePath = string;
        this.idPrefix = string2;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class04221.class, "sourcePath;idPrefix", "sourcePath", "idPrefix"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class04221.class, "sourcePath;idPrefix", "sourcePath", "idPrefix"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class04221.class, "sourcePath;idPrefix", "sourcePath", "idPrefix"}, this);
    }

    public String y() {
        return this.sourcePath;
    }

    private void N(Args args, class01089 class010892, class04205 class042052) {
        BiConsumer biConsumer = (BiConsumer)args.get(0);
        BiConsumer<class01894, class01079> biConsumer2 = (class018942, class010792) -> {
            class01894 class018943;
            String string = PBRType.removeSuffix((String)class018942.N());
            if (string != null && class010892.method_14486(class018943 = class018942.i(string)).isPresent()) {
                return;
            }
            biConsumer.accept(class018942, class010792);
        };
        args.set(0, biConsumer2);
    }

    public void N(class01089 class010892, class04205 class042052) {
        class03069 class030692 = new class03069("textures/" + this.sourcePath, ".png");
        Map map = class030692.N(class010892);
        ArgsN6 argsN6 = ArgsN6.of((class018942, class010792) -> {
            class01894 class018943 = class030692.y(class018942).R(this.idPrefix);
            class042052.N(class018943, (class01079)class010792);
        });
        this.N((Args)argsN6, class010892, class042052);
        map.forEach(argsN6.$0());
    }

    public MapCodec<class04221> N() {
        return y;
    }
}

