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
import js.{ Promise, | }
import Engine.MemoryInfo
import _root_.io.brunk.tfjs.core
@js.native
trait Index
    extends TensorModule
    with ops.Ops
    with Train
    with Globals
    with VariableCompanion
    with EnvironmentCompanion
    with Version
    with BrowserUtil {
  type AdadeltaOptimizer = optimizers.AdadeltaOptimizer
  val AdadeltaOptimizer: optimizers.AdadeltaOptimizer.type = js.native
  type AdagradOptimizer    = optimizers.AdagradOptimizer
  type AdamOptimizer       = optimizers.AdamOptimizer
  type AdamaxOptimizer     = optimizers.AdamaxOptimizer
  type MomentumOptimizer   = optimizers.MomentumOptimizer
  type Optimizer           = optimizers.Optimizer
  type RMSPropOptimizer    = optimizers.RMSPropOptimizer
  type SGDOptimizer        = optimizers.SGDOptimizer
  type Tensor[R <: Rank]   = core.Tensor[R]
  type Variable[R <: Rank] = core.Variable[R]
  type DataType            = core.DataType
  type InferenceModel      = core.InferenceModel
  type ModelPredictConfig  = core.ModelPredictConfig
  type NamedTensorMap      = core.NamedTensorMap
  type Rank                = core.Rank
  // TODO LSTMCellFunc
  // TODO Reduction
  // Second level exports.
  val environment: EnvironmentModule.type    = js.native
  val io: core.io.io.type                    = js.native
  val serialization: core.serialization.type = js.native
  // TODO webgl
  // TODO backend
}

@js.native
@JSGlobalScope
object Index extends js.Object {
  def setBackend(backendType: String, safeMode: Boolean = ???): Unit = js.native
  def getBackend(): String                                           = js.native
  def disposeVariables(): Unit                                       = js.native
  def memory(): MemoryInfo                                           = js.native
  def nextFrame(): Promise[Unit]                                     = js.native
}
