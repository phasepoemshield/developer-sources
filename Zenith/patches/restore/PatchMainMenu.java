import java.nio.file.Files;
import java.nio.file.Path;
import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.FieldInsnNode;
import org.objectweb.asm.tree.InsnList;
import org.objectweb.asm.tree.InsnNode;
import org.objectweb.asm.tree.JumpInsnNode;
import org.objectweb.asm.tree.LabelNode;
import org.objectweb.asm.tree.MethodInsnNode;
import org.objectweb.asm.tree.MethodNode;
import org.objectweb.asm.tree.TypeInsnNode;
import org.objectweb.asm.tree.VarInsnNode;

/**
 * Restores TitleScreen → MainMenuScreen and wires Mods / AltManager / Multiplayer buttons.
 */
public class PatchMainMenu implements Opcodes {
   public static void main(String[] args) throws Exception {
      Path classes = Path.of("build/classes/java/main");
      patchMixin(classes.resolve("zenith/zov/utility/mixin/client_core/MixinMinecraftClient.class"));
      patchMainMenu(classes.resolve("zenith/zov/client/screens/override/main/MainMenuScreen.class"));
      System.out.println("Main menu restore patches applied");
   }

   private static void patchMixin(Path path) throws Exception {
      ClassNode node = read(path);
      MethodNode modify = null;
      for (MethodNode m : node.methods) {
         if ("mixin$modifySetScreenArg".equals(m.name)
            && "(Lnet/minecraft/client/gui/screen/Screen;)Lnet/minecraft/client/gui/screen/Screen;".equals(m.desc)) {
            modify = m;
            break;
         }
      }
      if (modify == null) {
         throw new IllegalStateException("MixinMinecraftClient.mixin$modifySetScreenArg not found");
      }

      // After EventBus dispatch: if result instanceof TitleScreen → return MainMenuScreen
      // Original ends with: aload_2; invokevirtual Nopush; areturn
      // We rewrite the whole method safely.
      InsnList insns = new InsnList();
      LabelNode notTitle = new LabelNode();
      // EventImpl_36 event = new EventImpl_36(screen);
      insns.add(new TypeInsnNode(NEW, "zenith/lllIl11lIl1l1l1l1"));
      insns.add(new InsnNode(DUP));
      insns.add(new VarInsnNode(ALOAD, 1));
      insns.add(new MethodInsnNode(INVOKESPECIAL, "zenith/lllIl11lIl1l1l1l1", "<init>", "(Lnet/minecraft/client/gui/screen/Screen;)V", false));
      insns.add(new VarInsnNode(ASTORE, 2));
      // EventBus.post(event)
      insns.add(new VarInsnNode(ALOAD, 2));
      insns.add(new MethodInsnNode(INVOKESTATIC, "zenith/l1I1IlllIlI", "II1Il11l111II11IIl", "(Lzenith/lIIl11l111lIIl1ll;)Lzenith/lIIl11l111lIIl1ll;", false));
      insns.add(new InsnNode(POP));
      // Screen result = event.getScreen();
      insns.add(new VarInsnNode(ALOAD, 2));
      insns.add(new MethodInsnNode(INVOKEVIRTUAL, "zenith/lllIl11lIl1l1l1l1", "lII1llI1Ill1lllIlll11ll11I1l", "()Lnet/minecraft/client/gui/screen/Screen;", false));
      insns.add(new VarInsnNode(ASTORE, 3));
      // if (result instanceof TitleScreen) return ZenithClient.getInstance().getMainMenu();
      insns.add(new VarInsnNode(ALOAD, 3));
      insns.add(new TypeInsnNode(INSTANCEOF, "net/minecraft/client/gui/screen/TitleScreen"));
      insns.add(new JumpInsnNode(IFEQ, notTitle));
      insns.add(new MethodInsnNode(
         INVOKESTATIC,
         "zenith/IIIl1llll1lIIlI1lIlII1l1lI1III",
         "lIll1l111l1l11II11I1II11II1",
         "()Lzenith/IIIl1llll1lIIlI1lIlII1l1lI1III;",
         false
      ));
      insns.add(new MethodInsnNode(
         INVOKEVIRTUAL,
         "zenith/IIIl1llll1lIIlI1lIlII1l1lI1III",
         "IllllI1lIIIIl1I1lll111",
         "()Lzenith/zov/client/screens/override/main/MainMenuScreen;",
         false
      ));
      insns.add(new InsnNode(ARETURN));
      insns.add(notTitle);
      insns.add(new VarInsnNode(ALOAD, 3));
      insns.add(new InsnNode(ARETURN));
      modify.instructions = insns;
      modify.tryCatchBlocks = null;
      write(path, node);
      System.out.println("Patched MixinMinecraftClient.mixin$modifySetScreenArg → MainMenuScreen");
   }

   private static void patchMainMenu(Path path) throws Exception {
      ClassNode node = read(path);
      boolean multi = false, mods = false, alts = false;
      for (MethodNode m : node.methods) {
         if ("lambda$new$1".equals(m.name) && "()V".equals(m.desc)) {
            // Multiplayer → custom MenuMultiPlayerScreen(mainMenu)
            InsnList insns = new InsnList();
            insns.add(new FieldInsnNode(GETSTATIC, "zenith/zov/client/screens/override/main/MainMenuScreen", "l11I1I1ll1Illll1I1l1111l1II", "Lnet/minecraft/client/MinecraftClient;"));
            insns.add(new TypeInsnNode(NEW, "zenith/zov/client/screens/override/server/MenuMultiPlayerScreen"));
            insns.add(new InsnNode(DUP));
            insns.add(new MethodInsnNode(
               INVOKESTATIC,
               "zenith/IIIl1llll1lIIlI1lIlII1l1lI1III",
               "lIll1l111l1l11II11I1II11II1",
               "()Lzenith/IIIl1llll1lIIlI1lIlII1l1lI1III;",
               false
            ));
            insns.add(new MethodInsnNode(
               INVOKEVIRTUAL,
               "zenith/IIIl1llll1lIIlI1lIlII1l1lI1III",
               "IllllI1lIIIIl1I1lll111",
               "()Lzenith/zov/client/screens/override/main/MainMenuScreen;",
               false
            ));
            insns.add(new MethodInsnNode(
               INVOKESPECIAL,
               "zenith/zov/client/screens/override/server/MenuMultiPlayerScreen",
               "<init>",
               "(Lnet/minecraft/client/gui/screen/Screen;)V",
               false
            ));
            insns.add(new MethodInsnNode(
               INVOKEVIRTUAL,
               "net/minecraft/client/MinecraftClient",
               "setScreen",
               "(Lnet/minecraft/client/gui/screen/Screen;)V",
               false
            ));
            insns.add(new InsnNode(RETURN));
            m.instructions = insns;
            multi = true;
         } else if ("lambda$new$2".equals(m.name) && "()V".equals(m.desc)) {
            // Mods
            InsnList insns = new InsnList();
            insns.add(new MethodInsnNode(
               INVOKESTATIC,
               "zenith/IIIl1llll1lIIlI1lIlII1l1lI1III",
               "lIll1l111l1l11II11I1II11II1",
               "()Lzenith/IIIl1llll1lIIlI1lIlII1l1lI1III;",
               false
            ));
            insns.add(new MethodInsnNode(
               INVOKEVIRTUAL,
               "zenith/IIIl1llll1lIIlI1lIlII1l1lI1III",
               "IllllI1lIIIIl1I1lll111",
               "()Lzenith/zov/client/screens/override/main/MainMenuScreen;",
               false
            ));
            insns.add(new MethodInsnNode(
               INVOKESTATIC,
               "zenith/zov/client/screens/override/main/ModsListScreen",
               "open",
               "(Lnet/minecraft/client/gui/screen/Screen;)V",
               false
            ));
            insns.add(new InsnNode(RETURN));
            m.instructions = insns;
            mods = true;
         } else if ("lambda$new$4".equals(m.name) && "()V".equals(m.desc)) {
            // AltManager
            InsnList insns = new InsnList();
            LabelNode end = new LabelNode();
            insns.add(new FieldInsnNode(GETSTATIC, "zenith/zov/client/screens/override/main/MainMenuScreen", "l11I1I1ll1Illll1I1l1111l1II", "Lnet/minecraft/client/MinecraftClient;"));
            insns.add(new TypeInsnNode(NEW, "zenith/zov/client/screens/override/main/AltManagerScreen"));
            insns.add(new InsnNode(DUP));
            insns.add(new MethodInsnNode(
               INVOKESTATIC,
               "zenith/IIIl1llll1lIIlI1lIlII1l1lI1III",
               "lIll1l111l1l11II11I1II11II1",
               "()Lzenith/IIIl1llll1lIIlI1lIlII1l1lI1III;",
               false
            ));
            insns.add(new MethodInsnNode(
               INVOKEVIRTUAL,
               "zenith/IIIl1llll1lIIlI1lIlII1l1lI1III",
               "IllllI1lIIIIl1I1lll111",
               "()Lzenith/zov/client/screens/override/main/MainMenuScreen;",
               false
            ));
            insns.add(new MethodInsnNode(
               INVOKESPECIAL,
               "zenith/zov/client/screens/override/main/AltManagerScreen",
               "<init>",
               "(Lnet/minecraft/client/gui/screen/Screen;)V",
               false
            ));
            insns.add(new MethodInsnNode(
               INVOKEVIRTUAL,
               "net/minecraft/client/MinecraftClient",
               "setScreen",
               "(Lnet/minecraft/client/gui/screen/Screen;)V",
               false
            ));
            insns.add(end);
            insns.add(new InsnNode(RETURN));
            m.instructions = insns;
            alts = true;
         }
      }
      if (!multi || !mods || !alts) {
         throw new IllegalStateException("Failed to patch MainMenuScreen lambdas multi=" + multi + " mods=" + mods + " alts=" + alts);
      }
      write(path, node);
      System.out.println("Patched MainMenuScreen Multiplayer/Mods/AltManager");
   }

   private static ClassNode read(Path path) throws Exception {
      ClassReader reader = new ClassReader(Files.readAllBytes(path));
      ClassNode node = new ClassNode();
      reader.accept(node, 0);
      return node;
   }

   private static void write(Path path, ClassNode node) throws Exception {
      ClassWriter writer = new ClassWriter(ClassWriter.COMPUTE_MAXS);
      node.accept(writer);
      Files.write(path, writer.toByteArray());
   }
}
