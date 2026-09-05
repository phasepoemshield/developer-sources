/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.Maps
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.Keyable
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  minecraft.class04206
 *  minecraft.class04540
 *  minecraft.class05033
 *  minecraft.class07078
 *  minecraft.class07428
 *  minecraft.class07536
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package minecraft;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.datafixers.kinds.App;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Keyable;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.EnumMap;
import java.util.Map;
import minecraft.class01003;
import minecraft.class01016;
import minecraft.class01043;
import minecraft.class04206;
import minecraft.class04540;
import minecraft.class05033;
import minecraft.class07078;
import minecraft.class07428;
import minecraft.class07536;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class class01002 {
    private static final Logger M = LogUtils.getLogger();
    private static final float B = 0.1f;
    public static final class04540<class01016> N = class04540.N();
    public static final class01002 y = new class01003().N();
    public static final MapCodec<class01002> L = RecordCodecBuilder.mapCodec(instance -> instance.group((App)Codec.floatRange((float)0.0f, (float)0.9999999f).optionalFieldOf("creature_spawn_probability", (Object)Float.valueOf(0.1f)).forGetter(class010022 -> Float.valueOf(class010022.u)), (App)Codec.simpleMap((Codec)class07428.field_24655, (Codec)class04540.N(class01016.N).promotePartial(class07536.N((String)"Spawn data: ", arg_0 -> ((Logger)M).error(arg_0))), (Keyable)class05033.y((class05033[])class07428.values())).fieldOf("spawners").forGetter(class010022 -> class010022.i), (App)Codec.simpleMap((Codec)class04206.M.T(), class01043.N, (Keyable)class04206.M).fieldOf("spawn_costs").forGetter(class010022 -> class010022.R)).apply(instance, class01002::new));
    public float u;
    public Map<class07428, class04540<class01016>> i;
    public Map<class07078<?>, class01043> R;

    class01002(float f, Map<class07428, class04540<class01016>> map, Map<class07078<?>, class01043> map2) {
        this.u = f;
        this.i = ImmutableMap.copyOf(map);
        this.R = ImmutableMap.copyOf(map2);
        this.N(f, map, map2, null);
    }

    private void N(float f, Map map, Map map2, CallbackInfo callbackInfo) {
        EnumMap enumMap = Maps.newEnumMap(class07428.class);
        for (Map.Entry<class07428, class04540<class01016>> entry : this.i.entrySet()) {
            enumMap.put(entry.getKey(), entry.getValue());
        }
        this.i = enumMap;
    }

    public class04540<class01016> N(class07428 class074282) {
        return this.i.getOrDefault(class074282, N);
    }

    public @Nullable class01043 N(class07078<?> class070782) {
        return this.R.get(class070782);
    }

    public float N() {
        return this.u;
    }
}

