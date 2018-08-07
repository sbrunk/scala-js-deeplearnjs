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

package io.brunk.tfjs.core

import scala.scalajs.js
import js.annotation._
import js.|
import Types.TensorContainer
import Engine.ScopeFn
import TensorModule.{ Scalar, TensorND }
import Engine.CustomGradientFunc


@js.native
@JSGlobal
object Gradients extends js.Object {
  def gradScope[T <: TensorContainer](
      nameOrScopeFn: String | ScopeFn[T],
      scopeFn: ScopeFn[T] = ???
  ): T                                                                                 = js.native
  def grad[I <: TensorND, O <: TensorND](f: js.Function1[I, O]): js.Function2[I, O, I] = js.native
  def grads[O <: TensorND](
      f: js.Function
  ): js.Function2[js.Array[TensorND], O, js.Array[TensorND]] =
    js.native
  def valueAndGrad[I <: TensorND, O <: TensorND](
      f: js.Function1[I, O]
  ): js.Function2[I, O, js.Any] =
    js.native
  def valueAndGrads[O <: TensorND](f: js.Function): js.Function2[js.Array[TensorND], O, js.Any] =
    js.native
  def variableGrads(f: js.Function0[Scalar], varList: js.Array[Variable[Rank]] = ???): js.Any =
    js.native
  def customGrad[T <: TensorND](f: CustomGradientFunc[T]): js.Function = js.native
}
