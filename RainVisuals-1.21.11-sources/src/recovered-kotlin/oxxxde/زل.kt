package oxxxde

import java.io.InputStream

// $VF: Compiled from heavy
public fun fromAssets(path: String): InputStream? {
   return صص.class.getClassLoader().getResourceAsStream(path)
}
