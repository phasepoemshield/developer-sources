/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  minecraft.class00500
 *  minecraft.class03336
 *  minecraft.class03372
 *  minecraft.class05318
 *  minecraft.class05329
 *  minecraft.class06069
 *  minecraft.class07001
 *  minecraft.class07209
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import minecraft.class00500;
import minecraft.class03336;
import minecraft.class03372;
import minecraft.class05261;
import minecraft.class05318;
import minecraft.class05329;
import minecraft.class06069;
import minecraft.class07001;
import minecraft.class07209;
import org.jspecify.annotations.Nullable;

public class class05265 {
    public static final class03372 N = class03372.N;
    public static final Codec<class05265> y = RecordCodecBuilder.create(instance -> instance.group((App)class05261.L.fieldOf("input_predicate").forGetter(class052652 -> class052652.L), (App)class05261.L.fieldOf("location_predicate").forGetter(class052652 -> class052652.u), (App)class05318.L.lenientOptionalFieldOf("position_predicate", (Object)class05329.y).forGetter(class052652 -> class052652.i), (App)class00500.N.fieldOf("output_state").forGetter(class052652 -> class052652.R), (App)class03336.L.lenientOptionalFieldOf("block_entity_modifier", (Object)N).forGetter(class052652 -> class052652.M)).apply(instance, class05265::new));
    private final class05261 L;
    private final class05261 u;
    private final class05318 i;
    private final class00500 R;
    private final class03336 M;

    public class05265(class05261 class052612, class05261 class052613, class05318 class053182, class00500 class005002, class03336 class033362) {
        this.L = class052612;
        this.u = class052613;
        this.i = class053182;
        this.R = class005002;
        this.M = class033362;
    }

    public class05265(class05261 class052612, class05261 class052613, class05318 class053182, class00500 class005002) {
        this(class052612, class052613, class053182, class005002, (class03336)N);
    }

    public class05265(class05261 class052612, class05261 class052613, class00500 class005002) {
        this(class052612, class052613, (class05318)class05329.y, class005002);
    }

    public boolean N(class00500 class005002, class00500 class005003, class07209 class072092, class07209 class072093, class07209 class072094, class06069 class060692) {
        return this.L.N(class005002, class060692) && this.u.N(class005003, class060692) && this.i.N(class072092, class072093, class072094, class060692);
    }

    public class00500 N() {
        return this.R;
    }

    public @Nullable class07001 N(class06069 class060692, @Nullable class07001 class070012) {
        return this.M.N(class060692, class070012);
    }
}

