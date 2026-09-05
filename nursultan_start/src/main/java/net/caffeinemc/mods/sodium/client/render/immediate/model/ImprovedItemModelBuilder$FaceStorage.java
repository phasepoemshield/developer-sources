/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.ints.Int2ObjectMap
 *  it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap
 *  it.unimi.dsi.fastutil.ints.IntIterator
 *  it.unimi.dsi.fastutil.objects.ReferenceArrayList
 *  minecraft.class01991
 *  minecraft.class02093
 *  minecraft.class02124
 */
package net.caffeinemc.mods.sodium.client.render.immediate.model;

import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.ints.IntIterator;
import it.unimi.dsi.fastutil.objects.ReferenceArrayList;
import java.util.BitSet;
import java.util.Collection;
import java.util.List;
import minecraft.class01991;
import minecraft.class02093;
import minecraft.class02124;
import net.caffeinemc.mods.sodium.client.render.immediate.model.ImprovedItemModelBuilder$SideFace;

public record ImprovedItemModelBuilder$FaceStorage(Int2ObjectMap<BitSet> up, Int2ObjectMap<BitSet> down, Int2ObjectMap<BitSet> left, Int2ObjectMap<BitSet> right) {
    public ImprovedItemModelBuilder$FaceStorage() {
        this((Int2ObjectMap<BitSet>)new Int2ObjectOpenHashMap(), (Int2ObjectMap<BitSet>)new Int2ObjectOpenHashMap(), (Int2ObjectMap<BitSet>)new Int2ObjectOpenHashMap(), (Int2ObjectMap<BitSet>)new Int2ObjectOpenHashMap());
    }

    private static void buildMergedFaces(Collection<ImprovedItemModelBuilder$SideFace> collection, Int2ObjectMap<BitSet> int2ObjectMap, class02124 class021242) {
        IntIterator intIterator = int2ObjectMap.keySet().iterator();
        while (intIterator.hasNext()) {
            int n = (Integer)intIterator.next();
            BitSet bitSet = (BitSet)int2ObjectMap.get(n);
            int n2 = 0;
            for (int i = bitSet.nextSetBit(0); i < bitSet.length() + 1; ++i) {
                if (bitSet.get(i)) {
                    ++n2;
                    continue;
                }
                if (n2 > 0) {
                    collection.add(new ImprovedItemModelBuilder$SideFace(class021242, i - n2, i - 1, n));
                }
                n2 = 0;
            }
        }
    }

    public List<ImprovedItemModelBuilder$SideFace> buildSideFaces() {
        ReferenceArrayList referenceArrayList = new ReferenceArrayList();
        ImprovedItemModelBuilder$FaceStorage.buildMergedFaces((Collection<ImprovedItemModelBuilder$SideFace>)referenceArrayList, this.up, class02124.field_4281);
        ImprovedItemModelBuilder$FaceStorage.buildMergedFaces((Collection<ImprovedItemModelBuilder$SideFace>)referenceArrayList, this.down, class02124.field_4277);
        ImprovedItemModelBuilder$FaceStorage.buildMergedFaces((Collection<ImprovedItemModelBuilder$SideFace>)referenceArrayList, this.left, class02124.field_4278);
        ImprovedItemModelBuilder$FaceStorage.buildMergedFaces((Collection<ImprovedItemModelBuilder$SideFace>)referenceArrayList, this.right, class02124.field_4283);
        return referenceArrayList;
    }

    public void tryInsertPixel(class01991 class019912, int n, int n2, int n3, int n4, int n5) {
        boolean bl;
        boolean bl2 = bl = !class02093.N((class01991)class019912, (int)n, (int)n2, (int)n3, (int)n4, (int)n5);
        if (bl) {
            ImprovedItemModelBuilder$FaceStorage.tryInsertFace(this.up, class02124.field_4281, class019912, n, n2, n3, n4, n5);
            ImprovedItemModelBuilder$FaceStorage.tryInsertFace(this.down, class02124.field_4277, class019912, n, n2, n3, n4, n5);
            ImprovedItemModelBuilder$FaceStorage.tryInsertFace(this.left, class02124.field_4278, class019912, n, n2, n3, n4, n5);
            ImprovedItemModelBuilder$FaceStorage.tryInsertFace(this.right, class02124.field_4283, class019912, n, n2, n3, n4, n5);
        }
    }

    private static void tryInsertFace(Int2ObjectMap<BitSet> int2ObjectMap, class02124 class021242, class01991 class019912, int n2, int n3, int n4, int n5, int n6) {
        boolean bl = class02093.N((class01991)class019912, (int)n2, (int)(n3 - class021242.N().P()), (int)(n4 - class021242.N().s()), (int)n5, (int)n6);
        if (bl) {
            int n7 = class021242.y() ? n4 : n3;
            int n8 = class021242.y() ? n3 : n4;
            ((BitSet)int2ObjectMap.computeIfAbsent(n7, n -> new BitSet())).set(n8);
        }
    }
}

