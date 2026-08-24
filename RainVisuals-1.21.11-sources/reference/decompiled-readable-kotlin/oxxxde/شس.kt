package oxxxde

import java.io.Closeable
import java.io.InputStream
import java.util.HashMap
import kotakbaz.rain.client.render.texture.texture.GLTexture

// $VF: Compiled from heavy
public object شس {
   private final val loadQueue: MutableMap<String, String> = HashMap() as java.util.Map
   private final var bootstrapped: Boolean

   private fun loadSingle(name: String, path: String) {
      val stream: InputStream = زل.fromAssets("assets/${CLIENT_ID}/$path")
      if (stream == null) {
         System.err.println("Texture file not found: $path")
      } else {
         try {
            val e: Closeable = stream
            var var6: java.lang.Throwable = null

            try {
               System.out
                  .println(
                     (Object)("${if (ذَ.addTexture(name, GLTexture.of(name, ثُ.INPUT_STREAM.load(e as InputStream, ضو.RGBA, زآ.SMOOTH, جش.DEFAULT))))
                        "[SUCCESS]"
                        else
                        "[FAILED]"} Loaded texture: $name")
                  )
               } catch (var15: java.lang.Throwable) {
               var6 = var15
               throw var15
            } finally {
               CloseableKt.closeFinally(e, var6)
            }
         } catch (var17: Exception) {
            System.err.println("Failed to load texture: $name")
            var17.printStackTrace()
         }
      }
   }

   public fun get(name: String): ض? {
      return ذَ.getTexture(name)
   }

   public fun load() {
      if (!bootstrapped) {
         System.out.println((Object)"Starting texture loading...")

         for (`element$iv` in loadQueue.entrySet()) {
            INSTANCE.loadSingle(`element$iv`.getKey() as java.lang.String, `element$iv`.getValue() as java.lang.String)
         }

         loadQueue.clear()
         bootstrapped = true
         System.out.println((Object)("Loaded textures in ${System.currentTimeMillis() - System.currentTimeMillis()} ms"))
      }
   }

   public fun register(name: String, path: String) {
      if (bootstrapped) {
         this.loadSingle(name, path)
      } else {
         loadQueue.put(name, path)
      }
   }
}
