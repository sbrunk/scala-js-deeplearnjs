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

package io.brunk.tfjs.layers.engine

import io.brunk.tfjs.core.serialization
import io.brunk.tfjs.layers.Types.{Kwargs, Shape}
import io.brunk.tfjs.layers.{JsonDict, LayerVariable, NamedTensorMap}
import io.brunk.tfjs.tf.{Scalar, TensorND}

import scala.scalajs.js
import js.annotation._
import js.|

@js.native
@JSGlobalScope
object Container extends js.Object {

  @js.native
  trait ContainerConfig extends js.Object {
    var inputs: SymbolicTensor | js.Array[SymbolicTensor]  = js.native
    var outputs: SymbolicTensor | js.Array[SymbolicTensor] = js.native
    var name: String                                       = js.native
  }

  @js.native
  abstract class Container protected () extends Layer {
    def this(config: ContainerConfig) = this()
    var inputs: js.Array[SymbolicTensor]                = js.native
    var outputs: js.Array[SymbolicTensor]               = js.native
    var inputLayers: js.Array[Layer]                    = js.native
    var inputLayersNodeIndices: js.Array[Double]        = js.native
    var inputLayersTensorIndices: js.Array[Double]      = js.native
    var outputLayers: js.Array[Layer]                   = js.native
    var outputLayersNodeIndices: js.Array[Double]       = js.native
    var outputLayersTensorIndices: js.Array[Double]     = js.native
    var layers: js.Array[Layer]                         = js.native
    var layersByDepth: Container.LayersByDepth          = js.native
    var nodesByDepth: Container.NodesByDepth            = js.native
    var containerNodes: Set[String]                     = js.native
    var inputNames: js.Array[String]                    = js.native
    var outputNames: js.Array[String]                   = js.native
    var feedInputShapes: js.Array[Shape]                = js.native
    protected var internalInputShapes: js.Array[Shape]  = js.native
    protected var internalOutputShapes: js.Array[Shape] = js.native
    protected var feedInputNames: js.Array[String]      = js.native
    protected var feedOutputNames: js.Array[String]     = js.native
    // method trainableWeights cannot override a mutable variable
    // override def trainableWeights: js.Array[LayerVariable]       = js.native
    // method nonTrainableWeights cannot override a mutable variable
    // override def nonTrainableWeights: js.Array[LayerVariable]    = js.native
    override def weights: js.Array[LayerVariable]                = js.native
    def loadWeights(
        weightsJSON: JsonDict | NamedTensorMap,
        skipMismatch: Boolean = ???,
        isNamedTensorMap: Boolean = ???
    ): Unit                                                                          = js.native
    def toJSON(unused: js.Any = ???, returnString: Boolean = ???): String | JsonDict = js.native
    override def call(inputs: TensorND | js.Array[TensorND], kwargs: Kwargs): TensorND | js.Array[TensorND] =
      js.native
    override def computeMask(
        inputs: TensorND | js.Array[TensorND],
        mask: TensorND | js.Array[TensorND] = ???
    ): TensorND | js.Array[TensorND]                                                         = js.native
    override def computeOutputShape(inputShape: Shape | js.Array[Shape]): Shape | js.Array[Shape] = js.native
    def runInternalGraph(
        inputs: js.Array[TensorND],
        masks: js.Array[TensorND] = ???
    ): js.Tuple3[js.Array[TensorND], js.Array[TensorND], js.Array[Shape]] = js.native
    def getLayer(name: String = ???, index: Double = ???): Layer      = js.native
    override def calculateLosses(): js.Array[Scalar]                           = js.native
    override def getConfig(): serialization.ConfigDict                         = js.native
    override def stateful: Boolean                                             = js.native
  }

  @js.native
  object Container extends js.Object {

    @js.native
    trait LayersByDepth extends js.Object {
      @JSBracketAccess
      def apply(depth: String): js.Array[Layer] = js.native
      @JSBracketAccess
      def update(depth: String, v: js.Array[Layer]): Unit = js.native
    }

    @js.native
    trait NodesByDepth extends js.Object {
      @JSBracketAccess
      def apply(depth: String): js.Array[Node] = js.native
      @JSBracketAccess
      def update(depth: String, v: js.Array[Node]): Unit = js.native
    }
    def fromConfig[T <: serialization.Serializable](
        cls: serialization.SerializableConstructor[T],
        config: serialization.ConfigDict
    ): T = js.native
  }

  def loadWeightsFromJson(
      weightsJSON: JsonDict,
      layers: js.Array[Layer],
      skipMismatch: Boolean = ???
  ): Unit = js.native
  def loadWeightsFromNamedTensorMap(weights: NamedTensorMap, layers: js.Array[Layer]): Unit =
    js.native
}
