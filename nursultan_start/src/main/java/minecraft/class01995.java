/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  minecraft.class00159
 *  minecraft.class00789
 *  minecraft.class00800
 *  minecraft.class00810
 *  minecraft.class00836
 *  minecraft.class00837
 *  minecraft.class00854
 *  minecraft.class01921
 *  minecraft.class01929
 *  minecraft.class02471
 *  minecraft.class02474
 *  minecraft.class02477
 *  minecraft.class02482
 *  minecraft.class02484
 *  minecraft.class02500
 *  minecraft.class02625
 *  minecraft.class03367
 *  minecraft.class03489
 *  minecraft.class03494
 *  minecraft.class03543
 *  minecraft.class03622
 *  minecraft.class03767
 *  minecraft.class04068
 *  minecraft.class04111
 *  minecraft.class04206
 *  minecraft.class04227
 *  minecraft.class04546
 *  minecraft.class04559
 *  minecraft.class05062
 *  minecraft.class05074
 *  minecraft.class05441
 *  minecraft.class05457
 *  minecraft.class05919
 *  minecraft.class05946
 *  minecraft.class05952
 *  minecraft.class06124
 *  minecraft.class06563
 *  minecraft.class07078
 *  minecraft.class07318
 *  minecraft.class07700
 *  minecraft.class08219
 *  net.fabricmc.fabric.api.datagen.v1.loot.FabricEntityLootTableGenerator
 *  net.fabricmc.fabric.mixin.datagen.loot.EntityLootSubProviderAccessor
 */
package minecraft;

import com.google.common.collect.Maps;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;
import minecraft.class00159;
import minecraft.class00789;
import minecraft.class00800;
import minecraft.class00810;
import minecraft.class00836;
import minecraft.class00837;
import minecraft.class00854;
import minecraft.class01921;
import minecraft.class01929;
import minecraft.class02013;
import minecraft.class02055;
import minecraft.class02471;
import minecraft.class02474;
import minecraft.class02477;
import minecraft.class02482;
import minecraft.class02484;
import minecraft.class02500;
import minecraft.class02625;
import minecraft.class03367;
import minecraft.class03489;
import minecraft.class03494;
import minecraft.class03543;
import minecraft.class03622;
import minecraft.class03767;
import minecraft.class04068;
import minecraft.class04111;
import minecraft.class04206;
import minecraft.class04227;
import minecraft.class04546;
import minecraft.class04559;
import minecraft.class05062;
import minecraft.class05074;
import minecraft.class05441;
import minecraft.class05457;
import minecraft.class05919;
import minecraft.class05946;
import minecraft.class05952;
import minecraft.class06124;
import minecraft.class06563;
import minecraft.class07078;
import minecraft.class07318;
import minecraft.class07700;
import minecraft.class08219;
import net.fabricmc.fabric.api.datagen.v1.loot.FabricEntityLootTableGenerator;
import net.fabricmc.fabric.mixin.datagen.loot.EntityLootSubProviderAccessor;

public abstract class class01995
implements class02013,
FabricEntityLootTableGenerator,
EntityLootSubProviderAccessor {
    protected final class01929 field_51846;
    private final class03767 field_42084;
    private final class03767 field_42085;
    public final Map<class07078<?>, Map<class05946<class05074>, class05062>> field_40615 = Maps.newHashMap();

    protected class01995(class03767 class037672, class03767 class037673, class01929 class019292) {
        this.field_42084 = class037672;
        this.field_42085 = class037673;
        this.field_51846 = class019292;
    }

    public class01995(class03767 class037672, class01929 class019292) {
        this(class037672, class037672, class019292);
    }

    public static class05457 method_46031(Map<class06563, class05946<class05074>> map) {
        class04546 class045462 = class04559.N((class04111[])new class04111[0]);
        for (Map.Entry<class06563, class05946<class05074>> entry : map.entrySet()) {
            class045462 = class045462.N(class03367.N(entry.getValue()).y(class07700.N((class05919)class05919.field_935, (class00810)class00810.N().N(class00159.N().N(class02471.N((class02477)class02484.Nr, (Object)entry.getKey())).y()).N((class03622)class08219.y()))));
        }
        return class05441.N().N((class04111)class045462);
    }

    protected final class03489 method_60394() {
        class01921 class019212 = this.field_51846.y(class04227.yR);
        return class03494.N((class05952[])new class05952[]{class07700.N((class05919)class05919.field_935, (class00810)class00810.N().N(class00854.N().y(Boolean.valueOf(true)))), class07700.N((class05919)class05919.field_939, (class00810)class00810.N().N(class06124.N().R(class00837.N().N(class00159.N().N(class02482.y, (class02500)class02474.N(List.of(new class00800((class03543)class019212.y(class02625.s), class00836.L)))).y()))))});
    }

    public abstract void method_10400();

    protected class05952 method_46034(class02055<class07078<?>> class020552) {
        return class07318.N((class00789)class00789.N().y(class00810.N().N(class020552, class07078.NR)));
    }

    public void method_46028(class07078<?> class070783, class05946<class05074> class059462, class05062 class050622) {
        this.field_40615.computeIfAbsent(class070783, class070782 -> new HashMap()).put(class059462, class050622);
    }

    protected class05952 method_46030(class02055<class07078<?>> class020552, class02055<class04068> class020553, class05946<class04068> class059462) {
        return class07318.N((class00789)class00789.N().y(class00810.N().N(class020552, class07078.NR).N(class00159.N().N(class02471.N((class02477)class02484.NA, class020553.y(class059462))).y())));
    }

    public /* synthetic */ class01929 getRegistries() {
        return this.field_51846;
    }

    public void method_46029(class07078<?> class070782, class05062 class050622) {
        this.method_46028(class070782, (class05946<class05074>)((class05946)class070782.Z().orElseThrow(() -> new IllegalStateException("Entity " + String.valueOf(class070782) + " has no loot table"))), class050622);
    }

    @Override
    public void method_10399(BiConsumer<class05946<class05074>, class05062> biConsumer) {
        this.method_10400();
        HashSet hashSet = new HashSet();
        class04206.M.z().forEach(class035292 -> {
            class07078 class070782 = (class07078)class035292.N();
            if (!class070782.N(this.field_42084)) {
                return;
            }
            Optional var5 = class070782.Z();
            if (var5.isPresent()) {
                Map<class05946<class05074>, class05062> var6 = this.field_40615.remove(class070782);
                if (class070782.N(this.field_42085) && (var6 == null || !var6.containsKey(var5.get()))) {
                    throw new IllegalStateException(String.format(Locale.ROOT, "Missing loottable '%s' for '%s'", var5.get(), class035292.B().N()));
                }
                if (var6 != null) {
                    var6.forEach((class059462, class050622) -> {
                        if (!hashSet.add(class059462)) {
                            throw new IllegalStateException(String.format(Locale.ROOT, "Duplicate loottable '%s' for '%s'", class059462, class035292.B().N()));
                        }
                        biConsumer.accept((class05946<class05074>)class059462, (class05062)class050622);
                    });
                }
            } else {
                Map<class05946<class05074>, class05062> map = this.field_40615.remove(class070782);
                if (map != null) {
                    throw new IllegalStateException(String.format(Locale.ROOT, "Weird loottables '%s' for '%s', not a LivingEntity so should not have loot", map.keySet().stream().map(class059462 -> class059462.N().toString()).collect(Collectors.joining(",")), class035292.B().N()));
                }
            }
        });
        if (!this.field_40615.isEmpty()) {
            throw new IllegalStateException("Created loot tables for entities not supported by datapack: " + String.valueOf(this.field_40615.keySet()));
        }
    }
}

