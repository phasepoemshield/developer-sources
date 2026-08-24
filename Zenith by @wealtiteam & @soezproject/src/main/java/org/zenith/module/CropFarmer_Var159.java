package org.zenith.module;




import org.zenith.core.NpcCloneManager;
import org.zenith.core.BotFeatureRegistry;
import org.zenith.core.InventoryCodec;
import org.zenith.core.EmotePlayback;
import org.zenith.core.BooleanValue;
import org.zenith.core.ClickFxController;
import org.zenith.core.CloudResponse;


import java.util.Arrays;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.Items;

enum CropFarmer_Var159 {
   call406("module.cropFarmer.crop.beetroot", Items.BEETROOT_SEEDS, Items.BEETROOT, Blocks.FARMLAND, 3),
   call432("module.cropFarmer.crop.carrot", Items.CARROT, Items.CARROT, Blocks.FARMLAND, 7),
   call433("module.cropFarmer.crop.netherWart", Items.NETHER_WART, Items.NETHER_WART, Blocks.SOUL_SAND, 3),
   call434("module.cropFarmer.crop.pitcherPlant", Items.PITCHER_POD, Items.PITCHER_PLANT, Blocks.FARMLAND, 4),
   call435("module.cropFarmer.crop.potato", Items.POTATO, Items.POTATO, Blocks.FARMLAND, 7),
   call436("module.cropFarmer.crop.torchflower", Items.TORCHFLOWER_SEEDS, Items.TORCHFLOWER, Blocks.FARMLAND, 2),
   call407("module.cropFarmer.crop.wheat", Items.WHEAT_SEEDS, Items.WHEAT, Blocks.FARMLAND, 7);

   public final String string16;
   public final Item item;
   public final Item item2;
   public final Block block2;
   public final int int111;

   private CropFarmer_Var159(String var3, Item var4, Item var5, Block var6, int var7) {
      this.string16 = var3;
      this.item = var4;
      this.item2 = var5;
      this.block2 = var6;
      this.int111 = var7;
   }

   public static CropFarmer_Var159 InventoryCodec(String var0) {
      return Arrays.stream(values()).filter(var1 -> var1.string16.equals(var0)).findFirst().orElse(call406);
   }
}
