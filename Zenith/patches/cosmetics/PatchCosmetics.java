import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.FieldInsnNode;
import org.objectweb.asm.tree.InsnList;
import org.objectweb.asm.tree.InsnNode;
import org.objectweb.asm.tree.JumpInsnNode;
import org.objectweb.asm.tree.LabelNode;
import org.objectweb.asm.tree.MethodInsnNode;
import org.objectweb.asm.tree.MethodNode;
import org.objectweb.asm.tree.VarInsnNode;

/**
 * Patches PathHolder setter so selecting a cosmetic immediately loads/unloads Figura avatar.
 */
public class PatchCosmetics implements Opcodes {
   public static void main(String[] args) throws Exception {
      Path classes = Path.of("build/classes/java/main");
      Path pathHolder = classes.resolve("zenith/ll1l1111ll1llII11llI11llIIII1.class");
      if (!Files.exists(pathHolder)) {
         throw new IOException("Missing " + pathHolder);
      }

      byte[] original = Files.readAllBytes(pathHolder);
      ClassReader reader = new ClassReader(original);
      ClassNode node = new ClassNode();
      reader.accept(node, 0);

      MethodNode setter = null;
      for (MethodNode m : node.methods) {
         if ("II1Il11l111II11IIl".equals(m.name) && "(Ljava/nio/file/Path;)V".equals(m.desc)) {
            setter = m;
            break;
         }
      }
      if (setter == null) {
         throw new IllegalStateException("PathHolder setter not found");
      }

      // Replace setter body with: store path; sync avatar immediately
      InsnList insns = new InsnList();
      LabelNode end = new LabelNode();
      LabelNode load = new LabelNode();

      // this.path = path
      insns.add(new VarInsnNode(ALOAD, 0));
      insns.add(new VarInsnNode(ALOAD, 1));
      insns.add(new FieldInsnNode(PUTFIELD, "zenith/ll1l1111ll1llII11llI11llIIII1", "l1l11l1llIIllIIII1lIl", "Ljava/nio/file/Path;"));

      // MinecraftClient mc = MinecraftClient.getInstance();
      insns.add(new MethodInsnNode(INVOKESTATIC, "net/minecraft/client/MinecraftClient", "getInstance", "()Lnet/minecraft/client/MinecraftClient;", false));
      insns.add(new VarInsnNode(ASTORE, 2));

      // if (mc == null || mc.player == null) return;
      insns.add(new VarInsnNode(ALOAD, 2));
      insns.add(new JumpInsnNode(IFNULL, end));
      insns.add(new VarInsnNode(ALOAD, 2));
      insns.add(new FieldInsnNode(GETFIELD, "net/minecraft/client/MinecraftClient", "player", "Lnet/minecraft/client/network/ClientPlayerEntity;"));
      insns.add(new JumpInsnNode(IFNULL, end));

      // UUID uuid = mc.player.getUuid();
      insns.add(new VarInsnNode(ALOAD, 2));
      insns.add(new FieldInsnNode(GETFIELD, "net/minecraft/client/MinecraftClient", "player", "Lnet/minecraft/client/network/ClientPlayerEntity;"));
      insns.add(new MethodInsnNode(INVOKEVIRTUAL, "net/minecraft/client/network/ClientPlayerEntity", "getUuid", "()Ljava/util/UUID;", false));
      insns.add(new VarInsnNode(ASTORE, 3));

      // Always clear previous entry first (also clears Figura via TrackingMap)
      insns.add(new FieldInsnNode(GETSTATIC, "zenith/l1ll111IIIl", "I11Il1lIIllII1l1I1I11", "Ljava/util/concurrent/ConcurrentHashMap;"));
      insns.add(new VarInsnNode(ALOAD, 3));
      insns.add(new MethodInsnNode(INVOKEVIRTUAL, "java/util/concurrent/ConcurrentHashMap", "remove", "(Ljava/lang/Object;)Ljava/lang/Object;", false));
      insns.add(new InsnNode(POP));

      // if (path != null) load
      insns.add(new VarInsnNode(ALOAD, 1));
      insns.add(new JumpInsnNode(IFNULL, end));
      insns.add(new VarInsnNode(ALOAD, 3));
      insns.add(new VarInsnNode(ALOAD, 1));
      insns.add(new MethodInsnNode(INVOKESTATIC, "zenith/l1ll111IIIl", "II1Il11l111II11IIl", "(Ljava/util/UUID;Ljava/nio/file/Path;)V", false));

      insns.add(end);
      insns.add(new InsnNode(RETURN));

      setter.instructions = insns;
      setter.tryCatchBlocks = null;
      setter.localVariables = null;
      setter.maxLocals = 4;
      setter.maxStack = 4;

      ClassWriter writer = new ClassWriter(ClassWriter.COMPUTE_MAXS | ClassWriter.COMPUTE_FRAMES) {
         @Override
         protected String getCommonSuperClass(String type1, String type2) {
            return "java/lang/Object";
         }
      };
      node.accept(writer);
      Files.write(pathHolder, writer.toByteArray());
      System.out.println("Patched PathHolder setter: " + pathHolder);
   }
}
