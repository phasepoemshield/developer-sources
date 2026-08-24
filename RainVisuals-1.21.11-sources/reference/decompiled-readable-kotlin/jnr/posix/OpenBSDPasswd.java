package jnr.posix;

import jnr.ffi.Pointer;
import jnr.ffi.Runtime;
import jnr.ffi.StructLayout;

// $VF: Compiled from OpenBSDPasswd.java
public class OpenBSDPasswd extends NativePasswd implements Passwd {
   private static final OpenBSDPasswd.Layout layout = new OpenBSDPasswd.Layout(Runtime.getSystemRuntime());

   @Override
   public int getExpire() {
      return layout.pw_expire.intValue(this.memory);
   }

   OpenBSDPasswd(Pointer memory) {
      super(memory);
   }

   @Override
   public String getGECOS() {
      return layout.pw_gecos.get(this.memory);
   }

   @Override
   public String getAccessClass() {
      return layout.pw_class.get(this.memory);
   }

   @Override
   public long getGID() {
      return layout.pw_gid.get(this.memory);
   }

   @Override
   public int getPasswdChangeTime() {
      return layout.pw_change.intValue(this.memory);
   }

   @Override
   public String getPassword() {
      return layout.pw_passwd.get(this.memory);
   }

   @Override
   public String getLoginName() {
      return layout.pw_name.get(this.memory);
   }

   @Override
   public long getUID() {
      return layout.pw_uid.get(this.memory);
   }

   @Override
   public String getHome() {
      return layout.pw_dir.get(this.memory);
   }

   @Override
   public String getShell() {
      return layout.pw_shell.get(this.memory);
   }

   // $VF: Compiled from OpenBSDPasswd.java
   private static final class Layout extends StructLayout {
      public final StructLayout.UTF8StringRef pw_shell;
      public final StructLayout.UTF8StringRef pw_name = new StructLayout.UTF8StringRef();
      public final StructLayout.Unsigned32 pw_uid;
      public final StructLayout.UTF8StringRef pw_dir;
      public final StructLayout.Signed64 pw_change;
      public final StructLayout.UTF8StringRef pw_class;
      public final StructLayout.Unsigned32 pw_gid;
      public final StructLayout.UTF8StringRef pw_gecos;
      public final StructLayout.UTF8StringRef pw_passwd = new StructLayout.UTF8StringRef();
      public final StructLayout.Signed64 pw_expire;

      private Layout(Runtime runtime) {
         super(runtime);
         this.pw_uid = new StructLayout.Unsigned32();
         this.pw_gid = new StructLayout.Unsigned32();
         this.pw_change = new StructLayout.Signed64();
         this.pw_class = new StructLayout.UTF8StringRef();
         this.pw_gecos = new StructLayout.UTF8StringRef();
         this.pw_dir = new StructLayout.UTF8StringRef();
         this.pw_shell = new StructLayout.UTF8StringRef();
         this.pw_expire = new StructLayout.Signed64();
      }
   }
}
