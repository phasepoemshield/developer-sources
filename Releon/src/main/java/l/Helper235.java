package l;

import java.awt.AlphaComposite;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.Locale;
import java.util.Optional;
import javax.imageio.ImageIO;
import javax.imageio.ImageReader;
import javax.imageio.metadata.IIOMetadata;
import javax.imageio.stream.ImageInputStream;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.texture.NativeImage;
import net.minecraft.client.texture.NativeImageBackedTexture;
import net.minecraft.resource.Resource;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.MathHelper;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;

class Helper235 {
   final Identifier src;
   boolean loaded = false;
   int w = 0;
   int h = 0;
   long totalMs = 0L;
   long[] ends;
   Identifier[] frames;

   Helper235(Identifier var1) {
      this.src = var1;
   }

   void method2101(MinecraftClient var1) {
      if (!this.loaded || this.frames == null || this.frames.length <= 0) {
         this.loaded = true;

         try {
            if (var1 != null && var1.getResourceManager() != null) {
               InputStream var2 = null;

               try {
                  Optional var3 = var1.getResourceManager().getResource(this.src);
                  if (var3 == null || var3.isEmpty()) {
                     return;
                  }

                  var2 = ((Resource)var3.get()).getInputStream();
                  if (var2 != null) {
                     this.method2103(var1, var2);
                     return;
                  }
               } finally {
                  try {
                     if (var2 != null) {
                        var2.close();
                     }
                  } catch (Throwable var13) {
                  }
               }
            }
         } catch (Throwable var15) {
         }
      }
   }

   Identifier method2102(long var1) {
      if (this.frames != null && this.frames.length != 0) {
         if (this.frames.length == 1) {
            return this.frames[0];
         } else if (this.ends != null && this.totalMs > 0L) {
            long var3 = var1 % this.totalMs;
            int var5 = 0;
            int var6 = this.ends.length - 1;

            while (var5 < var6) {
               int var7 = var5 + var6 >>> 1;
               if (var3 < this.ends[var7]) {
                  var6 = var7;
               } else {
                  var5 = var7 + 1;
               }
            }

            int var9 = MathHelper.clamp(var5, 0, this.frames.length - 1);
            Identifier var8 = this.frames[var9];
            return var8 == null ? this.frames[0] : var8;
         } else {
            return this.frames[0];
         }
      } else {
         return null;
      }
   }

   private void method2103(MinecraftClient var1, InputStream var2) throws java.io.IOException {
      ImageInputStream var3 = null;

      try {
         var3 = ImageIO.createImageInputStream(var2);
         if (var3 == null) {
            return;
         }

         Iterator var4 = ImageIO.getImageReadersByFormatName("gif");
         ImageReader var5 = null;
         if (var4 != null && var4.hasNext()) {
            var5 = (ImageReader)var4.next();
         }

         if (var5 != null) {
            var5.setInput(var3, false, false);

            int var58;
            try {
               var58 = var5.getNumImages(true);
            } catch (Throwable var56) {
               var58 = 1;
            }

            if (var58 <= 0) {
               var58 = 1;
            }

            int[] var59 = this.method2108(var5);
            BufferedImage var60 = var5.read(0);
            if (var60 != null) {
               int var61 = var59 != null ? Math.max(1, var59[0]) : Math.max(1, var60.getWidth());
               int var63 = var59 != null ? Math.max(1, var59[1]) : Math.max(1, var60.getHeight());
               int var11 = var61;
               int var12 = var63;
               int var13 = Math.max(var61, var63);
               if (var13 > 256) {
                  float var14 = 256.0F / var13;
                  var11 = Math.max(1, Math.round(var61 * var14));
                  var12 = Math.max(1, Math.round(var63 * var14));
               }

               this.w = var11;
               this.h = var12;
               BufferedImage var64 = new BufferedImage(var61, var63, 2);
               Identifier[] var15 = new Identifier[var58];
               long[] var16 = new long[var58];
               long var17 = 0L;
               int var19 = 0;
               int var20 = 0;
               int var21 = 0;
               int var22 = 0;
               int var23 = 0;
               int[] var24 = null;

               for (int var25 = 0; var25 < var58; var25++) {
                  if (var25 > 0) {
                     if (var19 == 1) {
                        this.method2107(var64, var20, var21, var22, var23);
                     } else if (var19 == 2 && var24 != null) {
                        this.method2106(var64, var24);
                     }
                  }

                  Helper234 var26 = this.method2109(var5, var25);
                  BufferedImage var27 = var25 == 0 ? var60 : var5.read(var25);
                  if (var27 == null) {
                     var27 = var60;
                  }

                  int var28 = var26 != null ? var26.x : 0;
                  int var29 = var26 != null ? var26.y : 0;
                  int var30 = var26 != null ? var26.w : var27.getWidth();
                  int var31 = var26 != null ? var26.h : var27.getHeight();
                  int var32 = var26 != null ? var26.disposal : 0;
                  int[] var33 = var32 == 2 ? this.method2105(var64) : null;
                  Graphics2D var34 = var64.createGraphics();

                  try {
                     var34.drawImage(var27, var28, var29, null);
                  } finally {
                     var34.dispose();
                  }

                  BufferedImage var35 = this.method2104(var64);
                  if (var35.getWidth() != var11 || var35.getHeight() != var12) {
                     var35 = this.method2111(var35, var11, var12);
                  }

                  Identifier var36 = this.method2114(var1, this.src, var25, var35);
                  if (var36 == null) {
                     var36 = var25 > 0 ? var15[var25 - 1] : null;
                  }

                  var15[var25] = var36;
                  long var37 = this.method2112(var5, var25);
                  if (var37 <= 0L) {
                     var37 = 70L;
                  }

                  var17 += var37;
                  var16[var25] = var17;
                  var19 = var32;
                  var20 = var28;
                  var21 = var29;
                  var22 = var30;
                  var23 = var31;
                  var24 = var33;
               }

               this.frames = var15;
               this.ends = var16;
               this.totalMs = Math.max(1L, var17);
               return;
            }

            return;
         }

         BufferedImage var6 = ImageIO.read(var3);
         if (var6 != null) {
            int var7 = var6.getWidth();
            int var8 = var6.getHeight();
            int var9 = Math.max(var7, var8);
            if (var9 > 256) {
               float var10 = 256.0F / var9;
               var7 = Math.max(1, Math.round(var7 * var10));
               var8 = Math.max(1, Math.round(var8 * var10));
            }

            BufferedImage var62 = var6.getWidth() == var7 && var6.getHeight() == var8 ? var6 : this.method2111(var6, var7, var8);
            this.w = var62.getWidth();
            this.h = var62.getHeight();
            this.frames = new Identifier[]{this.method2114(var1, this.src, 0, var62)};
            if (this.frames[0] == null) {
               this.frames[0] = Identifier.of("mre", "gif/fallback");
            }

            this.ends = new long[]{1000L};
            this.totalMs = 1000L;
            return;
         }
      } finally {
         try {
            if (var3 != null) {
               var3.close();
            }
         } catch (Throwable var54) {
         }
      }
   }

   private BufferedImage method2104(BufferedImage var1) {
      if (var1 == null) {
         return null;
      } else {
         BufferedImage var2 = new BufferedImage(var1.getWidth(), var1.getHeight(), 2);
         Graphics2D var3 = var2.createGraphics();

         try {
            var3.drawImage(var1, 0, 0, null);
         } finally {
            var3.dispose();
         }

         return var2;
      }
   }

   private int[] method2105(BufferedImage var1) {
      try {
         int var2 = var1.getWidth();
         int var3 = var1.getHeight();
         int[] var4 = new int[var2 * var3];
         var1.getRGB(0, 0, var2, var3, var4, 0, var2);
         return var4;
      } catch (Throwable var5) {
         return null;
      }
   }

   private void method2106(BufferedImage var1, int[] var2) {
      try {
         if (var2 == null) {
            return;
         }

         int var3 = var1.getWidth();
         int var4 = var1.getHeight();
         if (var2.length < var3 * var4) {
            return;
         }

         var1.setRGB(0, 0, var3, var4, var2, 0, var3);
      } catch (Throwable var5) {
      }
   }

   private void method2107(BufferedImage var1, int var2, int var3, int var4, int var5) {
      try {
         if (var4 <= 0 || var5 <= 0) {
            return;
         }

         int var6 = Math.max(0, var2);
         int var7 = Math.max(0, var3);
         int var8 = Math.min(var1.getWidth(), var2 + var4);
         int var9 = Math.min(var1.getHeight(), var3 + var5);
         int var10 = var8 - var6;
         int var11 = var9 - var7;
         if (var10 <= 0 || var11 <= 0) {
            return;
         }

         Graphics2D var12 = var1.createGraphics();

         try {
            var12.setComposite(AlphaComposite.Clear);
            var12.fillRect(var6, var7, var10, var11);
         } finally {
            var12.dispose();
         }
      } catch (Throwable var17) {
      }
   }

   private int[] method2108(ImageReader var1) {
      try {
         IIOMetadata var2 = var1.getStreamMetadata();
         if (var2 == null) {
            return null;
         } else {
            String var3 = var2.getNativeMetadataFormatName();
            if (var3 == null) {
               return null;
            } else {
               Node var4 = var2.getAsTree(var3);
               if (var4 == null) {
                  return null;
               } else {
                  for (Node var5 = var4.getFirstChild(); var5 != null; var5 = var5.getNextSibling()) {
                     String var6 = var5.getNodeName();
                     if (var6 != null && var6.toLowerCase(Locale.ROOT).contains("logical")) {
                        NamedNodeMap var7 = var5.getAttributes();
                        if (var7 != null) {
                           Node var8 = var7.getNamedItem("logicalScreenWidth");
                           Node var9 = var7.getNamedItem("logicalScreenHeight");
                           if (var8 != null && var9 != null) {
                              int var10 = Integer.parseInt(var8.getNodeValue());
                              int var11 = Integer.parseInt(var9.getNodeValue());
                              if (var10 > 0 && var11 > 0) {
                                 return new int[]{var10, var11};
                              }
                           }
                        }
                     }
                  }

                  return null;
               }
            }
         }
      } catch (Throwable var12) {
         return null;
      }
   }

   private Helper234 method2109(ImageReader var1, int var2) {
      try {
         IIOMetadata var3 = var1.getImageMetadata(var2);
         if (var3 == null) {
            return null;
         } else {
            String var4 = var3.getNativeMetadataFormatName();
            if (var4 == null) {
               return null;
            } else {
               Node var5 = var3.getAsTree(var4);
               if (var5 == null) {
                  return null;
               } else {
                  int var6 = 0;
                  int var7 = 0;
                  int var8 = 0;
                  int var9 = 0;
                  byte var10 = 0;

                  for (Node var11 = var5.getFirstChild(); var11 != null; var11 = var11.getNextSibling()) {
                     String var12 = var11.getNodeName();
                     if (var12 != null) {
                        String var13 = var12.toLowerCase(Locale.ROOT);
                        if (var13.contains("imagedescriptor")) {
                           NamedNodeMap var14 = var11.getAttributes();
                           if (var14 != null) {
                              Node var15 = var14.getNamedItem("imageLeftPosition");
                              Node var16 = var14.getNamedItem("imageTopPosition");
                              Node var17 = var14.getNamedItem("imageWidth");
                              Node var18 = var14.getNamedItem("imageHeight");
                              if (var15 != null) {
                                 var6 = this.method2110(var15.getNodeValue());
                              }

                              if (var16 != null) {
                                 var7 = this.method2110(var16.getNodeValue());
                              }

                              if (var17 != null) {
                                 var8 = this.method2110(var17.getNodeValue());
                              }

                              if (var18 != null) {
                                 var9 = this.method2110(var18.getNodeValue());
                              }
                           }
                        }

                        if (var13.contains("graphiccontrolextension")) {
                           NamedNodeMap var20 = var11.getAttributes();
                           if (var20 != null) {
                              Node var21 = var20.getNamedItem("disposalMethod");
                              if (var21 != null) {
                                 String var22 = var21.getNodeValue();
                                 if (var22 != null) {
                                    String var23 = var22.toLowerCase(Locale.ROOT);
                                    if (var23.contains("restoretobackground")) {
                                       var10 = 1;
                                    } else if (var23.contains("restoret previous")
                                       || var23.contains("restoret oprevious")
                                       || var23.contains("restoret o")
                                       || var23.contains("restoretoprevious")) {
                                       var10 = 2;
                                    } else if (var23.contains("restoretoprevious")) {
                                       var10 = 2;
                                    } else {
                                       var10 = 0;
                                    }
                                 }
                              }
                           }
                        }
                     }
                  }

                  return var8 > 0 && var9 > 0
                     ? new Helper234(var6, var7, var8, var9, var10)
                     : new Helper234(var6, var7, Math.max(1, var8), Math.max(1, var9), var10);
               }
            }
         }
      } catch (Throwable var19) {
         return null;
      }
   }

   private int method2110(String var1) {
      try {
         return var1 == null ? 0 : Integer.parseInt(var1.trim());
      } catch (Throwable var3) {
         return 0;
      }
   }

   private BufferedImage method2111(BufferedImage var1, int var2, int var3) {
      try {
         if (var1 == null) {
            return null;
         } else if (var2 > 0 && var3 > 0) {
            if (var1.getWidth() == var2 && var1.getHeight() == var3) {
               return var1;
            } else {
               BufferedImage var4 = new BufferedImage(var2, var3, 2);
               Graphics2D var5 = var4.createGraphics();

               try {
                  var5.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
                  var5.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
                  var5.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
                  var5.drawImage(var1, 0, 0, var2, var3, null);
               } finally {
                  var5.dispose();
               }

               return var4;
            }
         } else {
            return var1;
         }
      } catch (Throwable var10) {
         return var1;
      }
   }

   private long method2112(ImageReader var1, int var2) {
      try {
         IIOMetadata var3 = var1.getImageMetadata(var2);
         if (var3 == null) {
            return 0L;
         } else {
            String var4 = var3.getNativeMetadataFormatName();
            if (var4 == null) {
               return 0L;
            } else {
               Node var5 = var3.getAsTree(var4);
               return var5 == null ? 0L : this.method2113(var5);
            }
         }
      } catch (Throwable var6) {
         return 0L;
      }
   }

   private long method2113(Node var1) {
      if (var1 == null) {
         return 0L;
      } else {
         String var2 = var1.getNodeName();
         if (var2 != null && var2.toLowerCase(Locale.ROOT).contains("graphic")) {
            NamedNodeMap var3 = var1.getAttributes();
            if (var3 != null) {
               Node var4 = var3.getNamedItem("delayTime");
               if (var4 != null) {
                  String var5 = var4.getNodeValue();
                  if (var5 != null) {
                     try {
                        int var6 = Integer.parseInt(var5.trim());
                        if (var6 < 0) {
                           var6 = 0;
                        }

                        return var6 * 10L;
                     } catch (Throwable var7) {
                     }
                  }
               }
            }
         }

         for (Node var8 = var1.getFirstChild(); var8 != null; var8 = var8.getNextSibling()) {
            long var9 = this.method2113(var8);
            if (var9 > 0L) {
               return var9;
            }
         }

         return 0L;
      }
   }

   private Identifier method2114(MinecraftClient var1, Identifier var2, int var3, BufferedImage var4) {
      try {
         if (var4 == null) {
            return null;
         } else {
            NativeImage var5 = this.method2116(var4);
            if (var5 == null) {
               return null;
            } else {
               NativeImageBackedTexture var6 = new NativeImageBackedTexture(var5);
               Identifier var7 = Identifier.of("mre", "gif/" + this.method2115(var2) + "/" + var3);
               var1.getTextureManager().registerTexture(var7, var6);
               return var7;
            }
         }
      } catch (Throwable var8) {
         return null;
      }
   }

   private String method2115(Identifier var1) {
      try {
         String var2 = var1.getPath();
         if (var2 == null) {
            return "gif";
         } else {
            int var3 = Math.max(var2.lastIndexOf(47), var2.lastIndexOf(92));
            String var4 = var3 >= 0 ? var2.substring(var3 + 1) : var2;
            int var5 = var4.lastIndexOf(46);
            if (var5 > 0) {
               var4 = var4.substring(0, var5);
            }

            var4 = var4.replaceAll("[^a-zA-Z0-9_\\-]+", "_");
            if (var4.isEmpty()) {
               var4 = "gif";
            }

            return var4;
         }
      } catch (Throwable var6) {
         return "gif";
      }
   }

   private NativeImage method2116(BufferedImage var1) {
      try {
         ByteArrayOutputStream var2 = new ByteArrayOutputStream(98304);
         ImageIO.write(var1, "png", var2);
         byte[] var3 = var2.toByteArray();
         return var3 != null && var3.length != 0 ? this.method2117(var3) : null;
      } catch (Throwable var4) {
         return null;
      }
   }

   private NativeImage method2117(byte[] var1) {
      if (var1 != null && var1.length != 0) {
         try {
            Method var2 = this.method2118(InputStream.class);
            if (var2.invoke(null, new ByteArrayInputStream(var1)) instanceof NativeImage var13) {
               return var13;
            }
         } catch (Throwable var7) {
         }

         try {
            Method var8 = this.method2118(byte[].class);
            if (var8.invoke(null, var1) instanceof NativeImage var12) {
               return var12;
            }
         } catch (Throwable var6) {
         }

         try {
            Method var9 = this.method2118(ByteBuffer.class);
            if (var9.invoke(null, ByteBuffer.wrap(var1)) instanceof NativeImage var4) {
               return var4;
            }
         } catch (Throwable var5) {
         }

         return null;
      } else {
         return null;
      }
   }

   private Method method2118(Class<?> var1) throws NoSuchMethodException {
      try {
         return NativeImage.class.getMethod("read", var1);
      } catch (NoSuchMethodException var7) {
         for (Method var6 : NativeImage.class.getMethods()) {
            if (Modifier.isStatic(var6.getModifiers())
               && var6.getParameterCount() == 1
               && var6.getParameterTypes()[0] == var1
               && NativeImage.class.isAssignableFrom(var6.getReturnType())) {
               return var6;
            }
         }

         throw var7;
      }
   }
}
