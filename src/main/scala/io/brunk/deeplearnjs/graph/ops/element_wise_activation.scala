/*
 * Copyright (c) 2017 Sören Brunk
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of
 * this software and associated documentation files (the "Software"), to deal in
 * the Software without restriction, including without limitation the rights to
 * use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of
 * the Software, and to permit persons to whom the Software is furnished to do so,
 * subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS
 * FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR
 * COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER
 * IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN
 * CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package io.brunk.deeplearnjs.graph.ops

import scala.scalajs.js
import scala.scalajs.js.annotation._

@js.native
@JSGlobal
class ElementWiseActivation protected () extends Operation {
  def this(xTensor: Tensor, yTensor: Tensor, func: ActivationFunction) = this()
  protected var xTensor: Tensor                                             = js.native
  protected var yTensor: Tensor                                             = js.native
  def feedForward(math: NDArrayMath, inferenceArrays: TensorArrayMap): Unit = js.native
  def backProp(math: NDArrayMath,
               inferenceArrays: TensorArrayMap,
               gradientArrays: SummedTensorArrayMap): Unit = js.native
}

@js.native
@JSGlobal
class ReLU protected () extends ElementWiseActivation {
  def this(xTensor: Tensor, yTensor: Tensor) = this()
}

@js.native
@JSGlobal
class TanH protected () extends ElementWiseActivation {
  def this(xTensor: Tensor, yTensor: Tensor) = this()
}

@js.native
@JSGlobal
class Sigmoid protected () extends ElementWiseActivation {
  def this(xTensor: Tensor, yTensor: Tensor) = this()
}

@js.native
@JSGlobal
class Square protected () extends ElementWiseActivation {
  def this(xTensor: Tensor, yTensor: Tensor) = this()
}
