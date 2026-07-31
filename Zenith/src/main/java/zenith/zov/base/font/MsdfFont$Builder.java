package zenith.zov.base.font;

import com.mojang.blaze3d.systems.RenderSystem;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import net.minecraft.client.texture.AbstractTexture;
import net.minecraft.util.Identifier;
import zenith.ZenithClient;
import zenith.ZenithInternal076;

public class MsdfFont$Builder {
   private String name = "?";
   private Identifier dataIdentifer;
   private Identifier atlasIdentifier;

   private MsdfFont$Builder() {
   }

   public MsdfFont$Builder name(String s) {
      this.name = s;
      return this;
   }

   public MsdfFont$Builder data(String s) {
      this.dataIdentifer = ZenithClient.StringHolder_10("fonts/msdf/" + s + ".json");
      return this;
   }

   public MsdfFont$Builder atlas(String s) {
      this.atlasIdentifier = ZenithClient.StringHolder_10("fonts/msdf/" + s + ".png");
      return this;
   }

   public MsdfFont build() {
      FontData fontdata = ResourceProvider.fromJsonToInstance(this.dataIdentifer, FontData.class);
      AbstractTexture AbstractTexture = ZenithInternal076.l11I1I1ll1Illll1I1l1111l1II.getTextureManager().getTexture(this.atlasIdentifier);
      if (fontdata == null) {
         throw new RuntimeException(
            "Failed to read font data file: " + this.dataIdentifer.toString() + "; Are you sure this is json file? Try to check the correctness of its syntax."
         );
      } else {
         RenderSystem.recordRenderCall(() -> AbstractTexture.setFilter(true, false));
         float f = fontdata.atlas().width();
         float f1 = fontdata.atlas().height();
         Map map = fontdata.glyphs()
            .stream()
            .collect(Collectors.toMap(FontData$GlyphData::unicode, fontdata$glyphdata -> new MsdfGlyph(fontdata$glyphdata, f, f1)));
         HashMap hashmap = new HashMap();
         fontdata.kernings().forEach(fontdata$kerningdata -> {
            Map map2 = hashmap.computeIfAbsent(fontdata$kerningdata.leftChar(), integer -> new HashMap());
            map2.put(fontdata$kerningdata.rightChar(), fontdata$kerningdata.advance());
         });
         return new MsdfFont(this.name, AbstractTexture, fontdata.atlas(), fontdata.metrics(), map, hashmap);
      }
   }
}
