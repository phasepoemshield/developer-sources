package jnr.posix;

import java.util.ArrayList;
import java.util.List;
import jnr.ffi.Pointer;
import jnr.ffi.Runtime;
import jnr.ffi.StructLayout;

// $VF: Compiled from DefaultNativeGroup.java
public final class DefaultNativeGroup extends NativeGroup implements Group {
   static final DefaultNativeGroup.Layout layout = new DefaultNativeGroup.Layout(Runtime.getSystemRuntime());
   private final Pointer memory;

   @Override
   public String[] getMembers() {
      List<String> lst = new ArrayList<>();
      Pointer ptr = layout.gr_mem.get(this.memory);
      int ptrSize = this.runtime.addressSize();

      Pointer member;
      for (int i = 0; (member = ptr.getPointer(i)) != null; i += ptrSize) {
         lst.add(member.getString(0L));
      }

      return lst.toArray(new String[lst.size()]);
   }

   @Override
   public String getName() {
      return layout.gr_name.get(this.memory);
   }

   @Override
   public long getGID() {
      return layout.gr_gid.get(this.memory);
   }

   @Override
   public String getPassword() {
      return layout.gr_passwd.get(this.memory);
   }

   DefaultNativeGroup(Pointer memory) {
      super(memory.getRuntime(), layout);
      this.memory = memory;
   }

   // $VF: Compiled from DefaultNativeGroup.java
   static final class Layout extends StructLayout {
      public final StructLayout.UTF8StringRef gr_name = new StructLayout.UTF8StringRef();
      public final StructLayout.Signed32 gr_gid;
      public final StructLayout.Pointer gr_mem;
      public final StructLayout.UTF8StringRef gr_passwd = new StructLayout.UTF8StringRef();

      public Layout(Runtime runtime) {
         super(runtime);
         this.gr_gid = new StructLayout.Signed32();
         this.gr_mem = new StructLayout.Pointer();
      }
   }
}
