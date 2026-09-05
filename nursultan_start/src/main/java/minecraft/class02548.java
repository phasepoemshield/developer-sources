/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  minecraft.class00751
 *  minecraft.class02513
 *  minecraft.class02518
 *  minecraft.class02520
 *  minecraft.class02522
 *  minecraft.class02525
 *  minecraft.class02526
 *  minecraft.class02528
 *  minecraft.class02533
 *  minecraft.class02539
 *  minecraft.class02540
 *  minecraft.class02541
 *  minecraft.class02542
 *  minecraft.class04206
 *  minecraft.class04782
 *  minecraft.class06825
 *  minecraft.class06889
 *  minecraft.class07049
 *  minecraft.class08148
 */
package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.function.Function;
import minecraft.class00751;
import minecraft.class02513;
import minecraft.class02518;
import minecraft.class02520;
import minecraft.class02522;
import minecraft.class02525;
import minecraft.class02526;
import minecraft.class02528;
import minecraft.class02533;
import minecraft.class02539;
import minecraft.class02540;
import minecraft.class02541;
import minecraft.class02542;
import minecraft.class02551;
import minecraft.class02552;
import minecraft.class02559;
import minecraft.class04206;
import minecraft.class04782;
import minecraft.class06825;
import minecraft.class06889;
import minecraft.class07049;
import minecraft.class08148;

public interface class02548 {
    public static final Codec<class02548> L = class04206.Nn.T().dispatch(class02548::N, Function.identity());

    public static MapCodec<? extends class02548> y(class00751<MapCodec<? extends class02548>> class007512) {
        class00751.N(class007512, (String)"all_of", (Object)class02539.N);
        class00751.N(class007512, (String)"apply_mob_effect", class02559.N);
        class00751.N(class007512, (String)"attribute", (Object)class02541.N);
        class00751.N(class007512, (String)"change_item_damage", (Object)class02518.N);
        class00751.N(class007512, (String)"damage_entity", class02551.N);
        class00751.N(class007512, (String)"explode", (Object)class02528.N);
        class00751.N(class007512, (String)"ignite", (Object)class02526.N);
        class00751.N(class007512, (String)"apply_impulse", (Object)class08148.N);
        class00751.N(class007512, (String)"apply_exhaustion", (Object)class06825.N);
        class00751.N(class007512, (String)"play_sound", (Object)class02520.N);
        class00751.N(class007512, (String)"replace_block", class02552.N);
        class00751.N(class007512, (String)"replace_disk", (Object)class02522.N);
        class00751.N(class007512, (String)"run_function", (Object)class02533.N);
        class00751.N(class007512, (String)"set_block_properties", (Object)class02542.N);
        class00751.N(class007512, (String)"spawn_particles", (Object)class02540.N);
        return (MapCodec)class00751.N(class007512, (String)"summon_entity", (Object)class02513.N);
    }

    public void N(class04782 var1, int var2, class02525 var3, class07049 var4, class06889 var5, boolean var6);

    public MapCodec<? extends class02548> N();

    default public void N(class02525 class025252, class07049 class070492, class06889 class068892, int n) {
    }
}

