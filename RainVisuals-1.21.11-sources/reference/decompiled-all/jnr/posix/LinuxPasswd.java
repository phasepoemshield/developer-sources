package jnr.posix;

import jnr.ffi.Pointer;
import jnr.ffi.Runtime;
import jnr.ffi.StructLayout;

// $VF: Compiled from LinuxPasswd.java
public final class LinuxPasswd extends NativePasswd implements Passwd {
   private static final LinuxPasswd.Layout layout = new LinuxPasswd.Layout(Runtime.getSystemRuntime());

   LinuxPasswd(Pointer memory) {
      super(memory);
   }

   @Override
   public String getHome() {
      return layout.pw_dir.get(this.memory);
   }

   @Override
   public long getGID() {
      return layout.pw_gid.get(this.memory);
   }

   @Override
   public long getUID() {
      return layout.pw_uid.get(this.memory);
   }

   @Override
   public String getShell() {
      return layout.pw_shell.get(this.memory);
   }

   @Override
   public String getLoginName() {
      return layout.pw_name.get(this.memory);
   }

   @Override
   public int getPasswdChangeTime() {
      return 0;
   }

   @Override
   public int getExpire() {
      return Integer.MAX_VALUE;
   }

   @Override
   public String getAccessClass() {
      return "";
   }

   @Override
   public String getPassword() {
      return layout.pw_passwd.get(this.memory);
   }

   @Override
   public String getGECOS() {
      return layout.pw_gecos.get(this.memory);
   }

   // $VF: Compiled from LinuxPasswd.java
   private static final class Layout extends StructLayout {
      public final StructLayout.UTF8StringRef pw_shell;
      public final StructLayout.UTF8StringRef pw_name = new StructLayout.UTF8StringRef();
      public final StructLayout.UTF8StringRef pw_passwd = new StructLayout.UTF8StringRef();
      public final StructLayout.Signed32 pw_gid;
      public final StructLayout.UTF8StringRef pw_dir;
      public final StructLayout.Signed32 pw_uid = new StructLayout.Signed32();
      public final StructLayout.UTF8StringRef pw_gecos;

      private Layout(Runtime runtime) {
         super(runtime);
         this.pw_gid = new StructLayout.Signed32();
         this.pw_gecos = new StructLayout.UTF8StringRef();
         this.pw_dir = new StructLayout.UTF8StringRef();
         this.pw_shell = new StructLayout.UTF8StringRef();
      }
   }
}
