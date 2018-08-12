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

package io.brunk.tfjs.layers

import io.brunk.tfjs.layers.engine._
import io.brunk.tfjs.layers.layers._
import io.brunk.tfjs.tf._

import scala.scalajs.js
import js.annotation._
import js.{Promise, |}
import Container.ContainerConfig

@js.native
trait ModelExportsCompanion extends js.Object {
  def model(config: ContainerConfig): Model                             = js.native
  def sequential(config: SequentialConfig = ???): Sequential            = js.native
  def loadModel(pathOrIOHandler: String | io.IOHandler): Promise[Model] = js.native
  def input(config: InputConfig): SymbolicTensor                        = js.native
}

@js.native
@JSImport("@tensorflow/tfjs-layers", JSImport.Namespace)
object ModelExports extends ModelExportsCompanion

@js.native
@JSImport("@tensorflow/tfjs-layers", "layers")
object LayerExports extends js.Object {
  type Layer = engine.Layer
  val Layer: engine.Layer.type = js.native
  type RNN = layers.RNN
  val RNN: layers.RNN.type = js.native
  type RNNCell = layers.RNNCell
  def inputLayer(config: InputLayerConfig): Layer                       = js.native
  def input(config: InputConfig): SymbolicTensor                        = js.native
  def elu(config: ELULayerConfig = ???): Layer                          = js.native
  def leakyReLU(config: LeakyReLULayerConfig = ???): Layer              = js.native
  def softmax(config: SoftmaxLayerConfig = ???): Layer                  = js.native
  def thresholdedReLU(config: ThresholdedReLULayerConfig = ???): Layer  = js.native
  def conv1d(config: ConvLayerConfig): Layer                            = js.native
  def conv2d(config: ConvLayerConfig): Layer                            = js.native
  def conv2dTranspose(config: ConvLayerConfig): Layer                   = js.native
  def separableConv2d(config: SeparableConvLayerConfig): Layer          = js.native
  def cropping2D(config: Cropping2DLayerConfig): Layer                  = js.native
  def upSampling2d(config: UpSampling2DLayerConfig): Layer              = js.native
  def depthwiseConv2d(config: DepthwiseConv2DLayerConfig): Layer        = js.native
  def activation(config: ActivationLayerConfig): Layer                  = js.native
  def dense(config: DenseLayerConfig): Layer                            = js.native
  def dropout(config: DropoutLayerConfig): Layer                        = js.native
  def flatten(config: LayerConfig = ???): Layer                         = js.native
  def repeatVector(config: RepeatVectorLayerConfig): Layer              = js.native
  def reshape(config: ReshapeLayerConfig): Layer                        = js.native
  def embedding(config: EmbeddingLayerConfig): Layer                    = js.native
  def add(config: LayerConfig = ???): Layer                             = js.native
  def average(config: LayerConfig = ???): Layer                         = js.native
  def concatenate(config: ConcatenateLayerConfig = ???): Layer          = js.native
  def maximum(config: LayerConfig = ???): Layer                         = js.native
  def minimum(config: LayerConfig = ???): Layer                         = js.native
  def multiply(config: LayerConfig = ???): Layer                        = js.native
  def batchNormalization(config: BatchNormalizationLayerConfig): Layer  = js.native
  def zeroPadding2d(config: ZeroPadding2DLayerConfig = ???): Layer      = js.native
  def averagePooling1d(config: Pooling1DLayerConfig): Layer             = js.native
  def avgPool1d(config: Pooling1DLayerConfig): Layer                    = js.native
  def avgPooling1d(config: Pooling1DLayerConfig): Layer                 = js.native
  def averagePooling2d(config: Pooling2DLayerConfig): Layer             = js.native
  def avgPool2d(config: Pooling2DLayerConfig): Layer                    = js.native
  def avgPooling2d(config: Pooling2DLayerConfig): Layer                 = js.native
  def globalAveragePooling1d(config: LayerConfig): Layer                = js.native
  def globalAveragePooling2d(config: GlobalPooling2DLayerConfig): Layer = js.native
  def globalMaxPooling1d(config: LayerConfig): Layer                    = js.native
  def globalMaxPooling2d(config: GlobalPooling2DLayerConfig): Layer     = js.native
  def maxPooling1d(config: Pooling1DLayerConfig): Layer                 = js.native
  def maxPooling2d(config: Pooling2DLayerConfig): Layer                 = js.native
  def gru(config: GRULayerConfig): Layer                                = js.native
  def gruCell(config: GRUCellLayerConfig): RNNCell                      = js.native
  def lstm(config: LSTMLayerConfig): Layer                              = js.native
  def lstmCell(config: LSTMCellLayerConfig): RNNCell                    = js.native
  def simpleRNN(config: SimpleRNNLayerConfig): Layer                    = js.native
  def simpleRNNCell(config: SimpleRNNCellLayerConfig): RNNCell          = js.native
  def rnn(config: RNNLayerConfig): Layer                                = js.native
  def stackedRNNCells(config: StackedRNNCellsConfig): RNNCell           = js.native
  def bidirectional(config: BidirectionalLayerConfig): Wrapper          = js.native
  def timeDistributed(config: WrapperLayerConfig): Layer                = js.native
}

@js.native
@JSImport("@tensorflow/tfjs-layers", "constraints")
object ConstraintExports extends js.Object {
  def maxNorm(config: MaxNormConfig): Constraint       = js.native
  def unitNorm(config: UnitNormConfig): Constraint     = js.native
  def nonNeg(): Constraint                             = js.native
  def minMaxNorm(config: MinMaxNormConfig): Constraint = js.native
}

@js.native
@JSImport("@tensorflow/tfjs-layers", "constraints")
object InitializerExports extends js.Object {
  def zeros(): Zeros                                                = js.native
  def ones(): Initializer                                           = js.native
  def constant(config: ConstantConfig): Initializer                 = js.native
  def randomUniform(config: RandomUniformConfig): Initializer       = js.native
  def randomNormal(config: RandomNormalConfig): Initializer         = js.native
  def truncatedNormal(config: TruncatedNormalConfig): Initializer   = js.native
  def identity(config: IdentityConfig): Initializer                 = js.native
  def varianceScaling(config: VarianceScalingConfig): Initializer   = js.native
  def glorotUniform(config: SeedOnlyInitializerConfig): Initializer = js.native
  def glorotNormal(config: SeedOnlyInitializerConfig): Initializer  = js.native
  def heNormal(config: SeedOnlyInitializerConfig): Initializer      = js.native
  def leCunNormal(config: SeedOnlyInitializerConfig): Initializer   = js.native
  def orthogonal(config: OrthogonalConfig): Initializer             = js.native
}

@js.native
@JSImport("@tensorflow/tfjs-layers", "metrics")
class MetricExports extends js.Object {
  def meanAbsoluteError(yTrue: TensorND, yPred: TensorND): TensorND           = js.native
  def meanAbsolutePercentageError(yTrue: TensorND, yPred: TensorND): TensorND = js.native
  def MAPE(yTrue: TensorND, yPred: TensorND): TensorND                        = js.native
  def mape(yTrue: TensorND, yPred: TensorND): TensorND                        = js.native
}

@js.native
@JSImport("@tensorflow/tfjs-layers", "metrics")
object MetricExports extends js.Object {
  def binaryAccuracy(yTrue: TensorND, yPred: TensorND): TensorND          = js.native
  def binaryCrossentropy(yTrue: TensorND, yPred: TensorND): TensorND      = js.native
  def categoricalAccuracy(yTrue: TensorND, yPred: TensorND): TensorND     = js.native
  def categoricalCrossentropy(yTrue: TensorND, yPred: TensorND): TensorND = js.native
  def cosineProximity(yTrue: TensorND, yPred: TensorND): TensorND         = js.native
  def meanSquaredError(yTrue: TensorND, yPred: TensorND): TensorND        = js.native
  def MSE(yTrue: TensorND, yPred: TensorND): TensorND                     = js.native
  def mse(yTrue: TensorND, yPred: TensorND): TensorND                     = js.native
}

@js.native
@JSImport("@tensorflow/tfjs-layers", "regularizers")
object RegularizerExports extends js.Object {
  def l1l2(config: L1L2Config = ???): Regularizer = js.native
  def l1(config: L1Config = ???): Regularizer     = js.native
  def l2(config: L2Config = ???): Regularizer     = js.native
}
