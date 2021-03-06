/*
 * Copyright 2017 Sören Brunk
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.brunk.tfjs.core.ops

import io.brunk.tfjs.core.TensorModule.TensorND
import io.brunk.tfjs.core.Types.TensorLike

import scala.scalajs.js
import js.annotation._
import js.|

@js.native
trait BinaryOps extends js.Object {
  def add[T <: TensorND](a: TensorND | TensorLike, b: TensorND | TensorLike): T               = js.native
  def addN[T <: TensorND](tensors: js.Array[T | TensorLike]): T                  = js.native
  def addStrict[T <: TensorND](a: T, b: T): T                       = js.native
  def sub[T <: TensorND](a: TensorND | TensorLike, b: TensorND | TensorLike): T               = js.native
  def subStrict[T <: TensorND](a: T, b: T): T                       = js.native
  def pow[T <: TensorND](base: T, exp: TensorND | TensorLike): T                 = js.native
  def powStrict[T <: TensorND](base: T, exp: TensorND | TensorLike): T           = js.native
  def mul[T <: TensorND](a: TensorND | TensorLike, b: TensorND | TensorLike): T               = js.native
  def mulStrict[T <: TensorND](a: T, b: T): T                       = js.native
  def div[T <: TensorND](a: TensorND | TensorLike, b: TensorND | TensorLike): T               = js.native
  def floorDiv_[T <: TensorND](a: TensorND | TensorLike, b: TensorND | TensorLike): T = js.native
  def divStrict[T <: TensorND](a: T, b: T): T                       = js.native
  def mod[T <: TensorND](a: TensorND | TensorLike, b: TensorND | TensorLike): T               = js.native
  def modStrict[T <: TensorND](a: T, b: T): T                       = js.native
  def minimum[T <: TensorND](a: TensorND | TensorLike, b: TensorND | TensorLike): T           = js.native
  def minimumStrict[T <: TensorND](a: T, b: T): T                   = js.native
  def maximum[T <: TensorND](a: TensorND | TensorLike, b: TensorND | TensorLike): T           = js.native
  def maximumStrict[T <: TensorND](a: T, b: T): T                   = js.native
  def squaredDifference[T <: TensorND](a: TensorND | TensorLike, b: TensorND | TensorLike): T = js.native
  def squaredDifferenceStrict[T <: TensorND](a: T, b: T): T         = js.native
  def atan2[T <: TensorND](a: TensorND | TensorLike, b: TensorND | TensorLike): T             = js.native
}
