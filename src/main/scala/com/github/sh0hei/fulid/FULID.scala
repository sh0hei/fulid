package com.github.sh0hei.fulid

import cats._
import cats.implicits._
import cats.effect.Sync
import net.petitviolet.ulid4s.ULID

final class FULID private (private val ulid: ULID) {

}

object FULID {

}