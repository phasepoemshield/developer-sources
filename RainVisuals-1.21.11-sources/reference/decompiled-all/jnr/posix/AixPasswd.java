package jnr.posix;

import jnr.ffi.Pointer;
import jnr.ffi.Runtime;
import jnr.ffi.StructLayout;

// $VF: Compiled from AixPasswd.java
public class AixPasswd extends NativePasswd implements Passwd {
   private static final AixPasswd.Layout layout = new AixPasswd.Layout(Runtime.getSystemRuntime());

   @Override
   public String getShell() {
      return layout.pw_shell.get(this.memory);
   }

   @Override
   public String getLoginName() {
      return layout.pw_name.get(this.memory);
   }

   @Override
   public int getExpire() {
      return Integer.MAX_VALUE;
   }

   @Override
   public long getGID() {
      return layout.pw_gid.get(this.memory);
   }

   @Override
   public int getPasswdChangeTime() {
      return 0;
   }

   @Override
   public String getAccessClass() {
      return "unknown";
   }

   @Override
   public long getUID() {
      return layout.pw_uid.get(this.memory);
   }

   AixPasswd(Pointer memory) {
      super(memory);
   }

   @Override
   public String getPassword() {
      return layout.pw_passwd.get(this.memory);
   }

   @Override
   public String getGECOS() {
      return layout.pw_gecos.get(this.memory);
   }

   @Override
   public String getHome() {
      return layout.pw_dir.get(this.memory);
   }

   // $VF: Compiled from AixPasswd.java
   private static final class Layout extends StructLayout {
      public final StructLayout.gid_t pw_gid;
      public final StructLayout.UTF8StringRef pw_gecos;
      public final StructLayout.UTF8StringRef pw_passwd;
      public final StructLayout.UTF8StringRef pw_shell;
      public final StructLayout.UTF8StringRef pw_dir;
      public final StructLayout.uid_t pw_uid;
      public final StructLayout.UTF8StringRef pw_name = new StructLayout.UTF8StringRef();

      private Layout(Runtime runtime) {
         super(runtime);
         this.pw_passwd = new StructLayout.UTF8StringRef();
         this.pw_uid = new StructLayout.uid_t();
         this.pw_gid = new StructLayout.gid_t();
         this.pw_gecos = new StructLayout.UTF8StringRef();
         this.pw_dir = new StructLayout.UTF8StringRef();
         this.pw_shell = new StructLayout.UTF8StringRef();
      }
   }
}
