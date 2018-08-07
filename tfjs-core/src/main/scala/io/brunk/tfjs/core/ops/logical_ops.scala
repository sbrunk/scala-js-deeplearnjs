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
trait LogicalOps extends js.Object {
  def logicalNot[T <: TensorND](x: T | TensorLike): T                       = js.native
  def logicalAnd[T <: TensorND](a: TensorND | TensorLike, b: TensorND | TensorLike): T   = js.native
  def logicalOr[T <: TensorND](a: TensorND | TensorLike, b: TensorND | TensorLike): T    = js.native
  def logicalXor[T <: TensorND](a: TensorND | TensorLike, b: TensorND | TensorLike): T   = js.native
  def where[T <: TensorND](condition: TensorND | TensorLike, a: T | TensorLike, b: T | TensorLike): T = js.native
}
