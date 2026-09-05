/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01296
 *  minecraft.class05368
 *  minecraft.class05370
 *  minecraft.class05372
 *  minecraft.class05377
 *  minecraft.class07209
 *  minecraft.class07321
 */
package net.caffeinemc.mods.lithium.common.world.interests;

import java.util.List;
import java.util.Optional;
import minecraft.class01296;
import minecraft.class05368;
import minecraft.class05370;
import minecraft.class05372;
import minecraft.class05377;
import minecraft.class07209;
import minecraft.class07321;
import net.caffeinemc.mods.lithium.common.world.interests.PoiOrdering;

public record PoiOrdering$InChunk() implements PoiOrdering
{
    public static final PoiOrdering$InChunk INSTANCE = new PoiOrdering$InChunk();

    @Override
    public int compare(class07209 class072092, class05368 class053682, class07209 class072093, class07209 class072094) {
        int n;
        int n2;
        int n3;
        if (class072093.equals((Object)class072094)) {
            return 0;
        }
        int n4 = class072093.method_10260() >> 4;
        int n5 = Integer.compare(n4, n3 = class072094.method_10260() >> 4);
        if (n5 != 0) {
            throw new IllegalStateException("Positions are not in the same chunk: " + String.valueOf(class072093) + " in " + String.valueOf(new class07321(class072093)) + " vs " + String.valueOf(class072094) + " in " + String.valueOf(new class07321(class072094)));
        }
        int n6 = class072093.method_10263() >> 4;
        int n7 = Integer.compare(n6, n2 = class072094.method_10263() >> 4);
        if (n7 != 0) {
            throw new IllegalStateException("Positions are not in the same chunk: " + String.valueOf(class072093) + " in " + String.valueOf(new class07321(class072093)) + " vs " + String.valueOf(class072094) + " in " + String.valueOf(new class07321(class072094)));
        }
        int n8 = class072093.method_10264() >> 4;
        int n9 = Integer.compare(n8, n = class072094.method_10264() >> 4);
        if (n9 != 0) {
            return n9;
        }
        Optional optional = class053682.i(class01296.L((class07209)class072093));
        if (optional.isEmpty()) {
            throw new IllegalStateException("PoiManager " + String.valueOf(class053682) + " has no section at position " + String.valueOf(class072093));
        }
        class05370 class053702 = (class05370)optional.get();
        List list = class053702.N(class035562 -> true, class05372.field_18489).filter(class053772 -> class053772.M().equals((Object)class072093) || class053772.M().equals((Object)class072094)).toList();
        if (list.size() != 2) {
            throw new IllegalStateException("Expected two POI records at " + String.valueOf(class072093) + ", " + String.valueOf(class072094) + ", found " + list.size());
        }
        if (((class05377)list.getFirst()).M().equals((Object)class072093)) {
            return -1;
        }
        if (((class05377)list.getFirst()).M().equals((Object)class072094)) {
            return 1;
        }
        throw new IllegalStateException("Expected two differing poi positions matching " + String.valueOf(class072093) + ", " + String.valueOf(class072094) + ", found " + String.valueOf(list));
    }
}

