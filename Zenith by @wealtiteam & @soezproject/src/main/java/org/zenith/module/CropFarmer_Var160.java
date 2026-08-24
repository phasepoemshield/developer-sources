package org.zenith.module;

import org.zenith.ZenithClient;
import org.zenith.core.UiAnimation;
import org.zenith.core.BotFeatureRegistry;
import org.zenith.core.PermissionListCodec;
import org.zenith.core.EmotePlayback;
import org.zenith.core.BooleanValue;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.minecraft.util.math.BlockPos;

final class CropFarmer_Var160 {
   public final List<BlockPos> list30;
   public final List<BitSet> list31;
   public final List<List<Integer>> list32;
   public final Map<BitSet, Integer> map18 = new HashMap<>();
   public final long long86;
   public List<Integer> list33;

   public CropFarmer_Var160(List<BlockPos> var1, List<BitSet> var2, int var3, long var4) {
      this.list30 = var1;
      this.list31 = var2;
      this.long86 = var4;
      this.list32 = new ArrayList<>(var3);

      for (int i = 0; i < var3; i++) {
         this.list32.add(new ArrayList<>());
      }

      for (int k = 0; k < var2.size(); k++) {
         for (int j = ((BitSet)var2.get(k)).nextSetBit(0); j >= 0; j = ((BitSet)var2.get(k)).nextSetBit(j + 1)) {
            this.list32.get(j).add(k);
         }
      }
   }

   public List<BlockPos> float125() {
      BitSet bitset = new BitSet(this.list32.size());
      bitset.set(0, this.list32.size());
      this.list33 = this.on23(bitset);
      this.on23(bitset, new ArrayList<>());
      return this.list33.stream().map(this.list30::get).toList();
   }

   public void on23(BitSet var1, List<Integer> var2) {
      if (System.nanoTime() < this.long86 && var2.size() < this.list33.size()) {
         if (var1.isEmpty()) {
            this.list33 = new ArrayList<>(var2);
         } else {
            Integer integer = this.map18.get(var1);
            if (integer == null || integer > var2.size()) {
               this.map18.put((BitSet)var1.clone(), var2.size());
               int i = 0;

               for (BitSet bitset : this.list31) {
                  i = Math.max(i, this.on23(bitset, var1));
               }

               if (i != 0 && var2.size() + (var1.cardinality() + i - 1) / i < this.list33.size()) {
                  int k = this.UiAnimation(var1);
                  java.util.List<Integer> arraylist = new ArrayList<>(this.list32.get(k));
                  arraylist.sort(Comparator.<Integer>comparingInt(var2x -> this.on23(this.list31.get(var2x), var1)).reversed());

                  for (int j : arraylist) {
                     BitSet bitset1 = (BitSet)var1.clone();
                     bitset1.andNot(this.list31.get(j));
                     var2.add(j);
                     this.on23(bitset1, var2);
                     var2.remove(var2.size() - 1);
                     if (System.nanoTime() >= this.long86) {
                        return;
                     }
                  }
               }
            }
         }
      }
   }

   public List<Integer> on23(BitSet var1) {
      BitSet bitset = (BitSet)var1.clone();
      List<Integer> arraylist = new ArrayList<>();

      while (!bitset.isEmpty()) {
         int i = -1;
         int j = 0;

         for (int k = 0; k < this.list31.size(); k++) {
            int l = this.on23(this.list31.get(k), bitset);
            if (l > j) {
               j = l;
               i = k;
            }
         }

         if (i == -1) {
            break;
         }

         arraylist.add(i);
         bitset.andNot(this.list31.get(i));
      }

      return arraylist;
   }

   public int UiAnimation(BitSet var1) {
      int i = var1.nextSetBit(0);
      int j = Integer.MAX_VALUE;

      for (int k = i; k >= 0; k = var1.nextSetBit(k + 1)) {
         int l = this.list32.get(k).size();
         if (l < j) {
            j = l;
            i = k;
         }
      }

      return i;
   }

   public int on23(BitSet var1, BitSet var2) {
      BitSet bitset = (BitSet)var1.clone();
      bitset.and(var2);
      return bitset.cardinality();
   }
}
