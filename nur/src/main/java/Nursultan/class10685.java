package Nursultan;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.sugar.ref.LocalRef;
import com.viaversion.viafabricplus.features.item.filter_creative_tabs.VersionedRegistries;
import com.viaversion.viafabricplus.settings.impl.GeneralSettings;
import java.util.Collection;
import java.util.Set;
import minecraft.class03767;
import minecraft.class03778;
import minecraft.class04206;
import minecraft.class06202;
import minecraft.class06581;
import minecraft.class06584;
import minecraft.class06908;
import minecraft.class06911;
import minecraft.class06934;

public class class10685 implements class06934 {
   public final Collection<class06584> N = class03778.N();
   public final Set<class06584> y = class03778.N();
   private final class06911 L;
   private final class03767 u;

   public class10685(class06911 var1, class03767 var2) {
      this.L = var1;
      this.u = var2;
   }

   private boolean N(class06581 var1, class03767 var2, Operation var3, LocalRef var4) {
      return this.N(var1, var2, var3, (class06584)var4.get());
   }

   private boolean N(class06581 var1, class03767 var2, Operation var3, class06584 var4) {
      boolean var5 = (Boolean)var3.call(new Object[]{var1, var2});
      int var6 = GeneralSettings.INSTANCE.removeNotAvailableItemsFromCreativeTab.getIndex();
      if (var6 != 2 && !class06202.Nq().q()) {
         return var6 == 1 && !class04206.Nz.y(this.L).y().equals("minecraft") ? var5 : VersionedRegistries.keepItem(var4) && var5;
      } else {
         return var5;
      }
   }

   public void method_45417(class06584 param1, class06908 param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.NullPointerException: Cannot read field "classStruct" because "classNode" is null
      //   at org.jetbrains.java.decompiler.modules.decompiler.SwitchHelper.simplifyNewEnumSwitch(SwitchHelper.java:319)
      //   at org.jetbrains.java.decompiler.modules.decompiler.SwitchHelper.simplify(SwitchHelper.java:41)
      //   at org.jetbrains.java.decompiler.modules.decompiler.SwitchHelper.simplifySwitches(SwitchHelper.java:30)
      //   at org.jetbrains.java.decompiler.modules.decompiler.SwitchHelper.simplifySwitches(SwitchHelper.java:34)
      //   at org.jetbrains.java.decompiler.modules.decompiler.SwitchHelper.simplifySwitches(SwitchHelper.java:34)
      //   at org.jetbrains.java.decompiler.modules.decompiler.SwitchHelper.simplifySwitches(SwitchHelper.java:34)
      //   at org.jetbrains.java.decompiler.modules.decompiler.SwitchHelper.simplifySwitches(SwitchHelper.java:34)
      //   at org.jetbrains.java.decompiler.modules.decompiler.SwitchHelper.simplifySwitches(SwitchHelper.java:34)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:376)
      //
      // Bytecode:
      // 00: aload 1
      // 01: invokevirtual minecraft/class06584.c ()I
      // 04: bipush 1
      // 05: if_icmpeq 12
      // 08: new java/lang/IllegalArgumentException
      // 0b: dup
      // 0c: ldc "Stack size must be exactly 1"
      // 0e: invokespecial java/lang/IllegalArgumentException.<init> (Ljava/lang/String;)V
      // 11: athrow
      // 12: aload 0
      // 13: getfield Nursultan/class10685.N Ljava/util/Collection;
      // 16: aload 1
      // 17: invokeinterface java/util/Collection.contains (Ljava/lang/Object;)Z 2
      // 1c: ifeq 2a
      // 1f: aload 2
      // 20: getstatic minecraft/class06908.field_40193 Lminecraft/class06908;
      // 23: if_acmpeq 2a
      // 26: bipush 1
      // 27: goto 2b
      // 2a: bipush 0
      // 2b: ifeq 50
      // 2e: new java/lang/IllegalStateException
      // 31: dup
      // 32: aload 1
      // 33: invokevirtual minecraft/class06584.V ()Lminecraft/class00392;
      // 36: invokeinterface minecraft/class00392.getString ()Ljava/lang/String; 1
      // 3b: aload 0
      // 3c: getfield Nursultan/class10685.L Lminecraft/class06911;
      // 3f: invokevirtual minecraft/class06911.N ()Lminecraft/class00392;
      // 42: invokeinterface minecraft/class00392.getString ()Ljava/lang/String; 1
      // 47: invokedynamic makeConcatWithConstants (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "Accidentally adding the same item stack twice \u0001 to a Creative Mode Tab: \u0001" ]
      // 4c: invokespecial java/lang/IllegalStateException.<init> (Ljava/lang/String;)V
      // 4f: athrow
      // 50: aload 1
      // 51: invokevirtual minecraft/class06584.B ()Lminecraft/class06581;
      // 54: aload 0
      // 55: getfield Nursultan/class10685.u Lminecraft/class03767;
      // 58: astore 5
      // 5a: astore 4
      // 5c: aload 0
      // 5d: aload 4
      // 5f: aload 5
      // 61: invokedynamic call ()Lcom/llamalad7/mixinextras/injector/wrapoperation/Operation; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ ([Ljava/lang/Object;)Ljava/lang/Object;, Nursultan/class10685.N ([Ljava/lang/Object;)Ljava/lang/Boolean;, ([Ljava/lang/Object;)Ljava/lang/Boolean; ]
      // 66: new com/llamalad7/mixinextras/sugar/impl/ref/generated/LocalRefImpl
      // 69: dup
      // 6a: invokespecial com/llamalad7/mixinextras/sugar/impl/ref/generated/LocalRefImpl.<init> ()V
      // 6d: astore 6
      // 6f: aload 6
      // 71: aload 6
      // 73: aload 1
      // 74: invokevirtual com/llamalad7/mixinextras/sugar/impl/ref/generated/LocalRefImpl.init (Ljava/lang/Object;)V
      // 77: invokespecial Nursultan/class10685.N (Lminecraft/class06581;Lminecraft/class03767;Lcom/llamalad7/mixinextras/injector/wrapoperation/Operation;Lcom/llamalad7/mixinextras/sugar/ref/LocalRef;)Z
      // 7a: aload 6
      // 7c: invokevirtual com/llamalad7/mixinextras/sugar/impl/ref/generated/LocalRefImpl.dispose ()Ljava/lang/Object;
      // 7f: checkcast minecraft/class06584
      // 82: astore 1
      // 83: ifeq d6
      // 86: aload 2
      // 87: invokevirtual minecraft/class06908.ordinal ()I
      // 8a: tableswitch 76 0 2 26 51 65
      // a4: aload 0
      // a5: getfield Nursultan/class10685.N Ljava/util/Collection;
      // a8: aload 1
      // a9: invokeinterface java/util/Collection.add (Ljava/lang/Object;)Z 2
      // ae: pop
      // af: aload 0
      // b0: getfield Nursultan/class10685.y Ljava/util/Set;
      // b3: aload 1
      // b4: invokeinterface java/util/Set.add (Ljava/lang/Object;)Z 2
      // b9: pop
      // ba: goto d6
      // bd: aload 0
      // be: getfield Nursultan/class10685.N Ljava/util/Collection;
      // c1: aload 1
      // c2: invokeinterface java/util/Collection.add (Ljava/lang/Object;)Z 2
      // c7: pop
      // c8: goto d6
      // cb: aload 0
      // cc: getfield Nursultan/class10685.y Ljava/util/Set;
      // cf: aload 1
      // d0: invokeinterface java/util/Set.add (Ljava/lang/Object;)Z 2
      // d5: pop
      // d6: return
   }
}
