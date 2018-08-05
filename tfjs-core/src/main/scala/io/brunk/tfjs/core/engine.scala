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

package engine {

@js.native
trait TimingInfo extends BackendTimingInfo {
  var wallMs: Double = js.native
}

@js.native
trait TensorManager extends js.Object {
  def registerTensor(a: Tensor): Unit = js.native
  def registerVariable(v: Variable): Unit = js.native
  def disposeTensor(a: Tensor): Unit = js.native
  def memory(): js.Any = js.native
}

@js.native
@JSGlobal
class Engine protected () extends TensorManager {
  def this(backend: KernelBackend, safeMode: Boolean, debugMode: js.Function0[Boolean]) = this()
  var safeMode: Boolean = js.native
  var registeredVariables: NamedVariableMap = js.native
  def tidy[T <: TensorContainer](nameOrFn: String | ScopeFn[T], fn: ScopeFn[T] = ???, gradMode: Boolean = ???): T = js.native
  def runKernel[T <: Tensor | js.Array[Tensor], I <: NamedTensorMap](forwardFunc: ForwardFunc[T], inputs: I, backwardsFunc: js.Function2[T, js.Array[Tensor], js.Any] = ???): T = js.native
  def registerTensor(a: Tensor | Variable): Unit = js.native
  def registerVariable(v: Variable): Unit = js.native
  def disposeTensor(a: Tensor): Unit = js.native
  def disposeVariables(): Unit = js.native
  def memory(): MemoryInfo = js.native
  def keep[T <: Tensor](result: T): T = js.native
  def startScope(name: String = ???, gradientsMode: Boolean = ???): Unit = js.native
  def endScope(result: TensorContainer = ???, gradientsMode: Boolean = ???): Unit = js.native
  def gradients[T <: Tensor](f: js.Function0[T], xs: js.Array[Tensor], dy: T = ???, allowNoGradients: Boolean = ???): js.Any = js.native
  def customGrad[T <: Tensor](f: CustomGradientFunc[T]): js.Function = js.native
  def write(dataId: DataId, values: TypedArray): Unit = js.native
  def readSync(dataId: DataId): TypedArray = js.native
  def read(dataId: DataId): Promise[TypedArray] = js.native
  def fromPixels(pixels: ImageData | HTMLImageElement | HTMLCanvasElement | HTMLVideoElement, numChannels: Double): Tensor3D = js.native
  def time(query: js.Function0[Unit]): Promise[TimingInfo] = js.native
}

@js.native
@JSGlobalScope
object Engine extends js.Object {
  type ForwardFunc[T] = js.Function2[KernelBackend, js.Function, T]
  type CustomGradientFunc[T <: Tensor] = js.Function
  type MemoryInfo = js.Any
  type ScopeFn[T <: TensorContainer] = js.Function0[T]
}

}
