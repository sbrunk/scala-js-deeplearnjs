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

package io.brunk.tfjs.core.kernels.webgl

import io.brunk.tfjs.core.Tensor
import io.brunk.tfjs.core.TensorModule.TensorND
import io.brunk.tfjs.core.kernels.webgl.Shader_compiler.ShapeInfo

import scala.scalajs.js
import js.annotation._
import js.|
import org.scalajs.dom.webgl
@js.native
trait GPGPUProgram extends js.Object {
  var variableNames: js.Array[String]
  var outputShape: js.Array[Double]
  var userCode: String
  //var supportsBroadcasting: Boolean | Unit = js.native
}

@js.native
trait SupportsBroadasting extends js.Object {
  var supportsBroadcasting: Boolean = js.native
}

@js.native
trait GPGPUBinary extends js.Object {
  var webGLProgram: webgl.Program
  var program: GPGPUProgram
  var uniformLocations: GPGPUBinary.UniformLocations
  var gpgpu: GPGPUContext
  var source: String
  var inShapeInfos: js.Array[ShapeInfo]
  var outShapeInfo: ShapeInfo
}

object GPGPUBinary {

  @js.native
  trait UniformLocations extends js.Object {
    @JSBracketAccess
    def apply(name: String): webgl.UniformLocation = js.native
    @JSBracketAccess
    def update(name: String, v: webgl.UniformLocation): Unit = js.native
  }
}

@js.native
trait TensorData[T <: TensorND] extends js.Object {
  var tensor: T
  var texData: TextureData
  var isUniform: Boolean
}

@js.native
@JSGlobalScope
object Gpgpu_math extends js.Object {
  def compileProgram[T <: TensorND, K <: TensorND](
      gpgpu: GPGPUContext,
      program: GPGPUProgram,
      inputs: js.Array[TensorData[T]],
      output: TensorData[K]
  ): GPGPUBinary = js.native
  def runProgram[T <: TensorND, K <: TensorND](
      binary: GPGPUBinary,
      inputs: js.Array[TensorData[T]],
      output: TensorData[K],
      customSetup: js.Function2[GPGPUContext, webgl.Program, Unit] = ???
  ): Unit = js.native
  def makeShaderKey(
      program: GPGPUProgram,
      inputs: js.Array[TensorData[TensorND]],
      output: TensorData[TensorND]
  ): String = js.native
}
