package org.morphir.sdk

import scala.{Char => ScalaChar}
import scala.language.implicitConversions

trait MorphirConversions {
  implicit def asMorphir(ch: ScalaChar): Char.Char =
    Char.from(ch)
}

object MorphirConversions extends MorphirConversions