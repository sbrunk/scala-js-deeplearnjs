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

import scala.scalajs.js
import js.annotation._
import js.|

@js.native
@JSGlobal
class BinaryOpProgram protected () extends GPGPUProgram with SupportsBroadasting {
  def this(op: String, aShape: js.Array[Double], bShape: js.Array[Double]) = this()
  var variableNames: js.Array[String] = js.native
  var outputShape: js.Array[Double]   = js.native
  var userCode: String                = js.native
  //var supportsBroadcasting: Boolean   = js.native
  var startLoc: WebGLUniformLocation                                       = js.native
  def getCustomSetupFunc(): js.Function2[GPGPUContext, WebGLProgram, Unit] = js.native
}

@js.native
@JSGlobalScope
object Binaryop_gpu extends js.Object {
  val ADD: String                = js.native
  val SUB: String                = js.native
  val MUL: String                = js.native
  val DIV: String                = js.native
  val INT_DIV: String            = js.native
  val POW: String                = js.native
  val SQUARED_DIFFERENCE: String = js.native
  val EQUAL: String              = js.native
  val NOT_EQUAL: String          = js.native
  val LESS: String               = js.native
  val LESS_EQUAL: String         = js.native
  val GREATER: String            = js.native
  val GREATER_EQUAL: String      = js.native
  val LOGICAL_AND: String        = js.native
  val LOGICAL_OR: String         = js.native
  val MAX: String                = js.native
  val MIN: String                = js.native
  val MOD: String                = js.native
  val ATAN2: String              = js.native
  val ELU_DER: String            = js.native
}
