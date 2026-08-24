package oxxxde;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// $VF: Compiled from heavy
public class ار implements طج {
   private long lastTime;
   private final String name;
   private int updateDelayMillis;
   private ض currentTexture;
   private final List<ض> textures = new ArrayList<>();
   private Iterator<ض> iterator;

   protected ار(String name) {
      this.name = name;
   }

   @Override
   public void unBind() {
      this.currentTexture.unBind();
   }

   @Override
   public void bind() {
      this.currentTexture.bind();
   }

   @Override
   public int getWidth() {
      return this.currentTexture.getWidth();
   }

   public void setUpdateDelayMillis(int updateDelayMillis) {
      this.updateDelayMillis = updateDelayMillis;
   }

   public String getName() {
      return this.name;
   }

   @Override
   public int getTexId() {
      return this.currentTexture.getTexId();
   }

   protected ار create(ذص info) {
      this.lastTime = System.currentTimeMillis();
      this.updateDelayMillis = info.getDelay();

      for (int i = 0; i < info.getTextures().size(); i++) {
         this.textures.add(ض.of(this.name.concat("_").concat(String.valueOf(i)), info.getTextures().get(i)));
      }

      this.iterator = this.textures.iterator();
      if (!this.textures.isEmpty()) {
         this.currentTexture = this.textures.get(0);
      }

      return this;
   }

   @Override
   public void delete() {
      for (ض glTexture : this.textures) {
         glTexture.delete();
      }

      this.textures.clear();
   }

   public int getUpdateDelayMillis() {
      return this.updateDelayMillis;
   }

   public void update() {
      if (System.currentTimeMillis() - this.lastTime >= this.updateDelayMillis) {
         if (!this.iterator.hasNext()) {
            this.iterator = this.textures.iterator();
         }

         this.currentTexture = this.iterator.next();
         this.lastTime = System.currentTimeMillis();
      }
   }

   @Override
   public int getHeight() {
      return this.currentTexture.getHeight();
   }

   public static ار of(String name, ذص info) {
      return new ار(name).create(info);
   }
}
