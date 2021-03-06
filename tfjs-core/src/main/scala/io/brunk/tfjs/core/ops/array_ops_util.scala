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

import scala.scalajs.js
import js.annotation._

@js.native
@JSGlobalScope
object Array_ops_util extends js.Object {
  def getReshaped(
      inputShape: js.Array[Double],
      blockShape: js.Array[Double],
      prod: Double,
      batchToSpace: Boolean = ???
  ): js.Array[Double] = js.native
  def getPermuted(
      reshapedRank: Double,
      blockShapeRank: Double,
      batchToSpace: Boolean = ???
  ): js.Array[Double] = js.native
  def getReshapedPermuted(
      inputShape: js.Array[Double],
      blockShape: js.Array[Double],
      prod: Double,
      batchToSpace: Boolean = ???
  ): js.Array[Double] = js.native
  def getSliceBeginCoords(crops: js.Array[js.Array[Double]], blockShape: Double): js.Array[Double] =
    js.native
  def getSliceSize(
      uncroppedShape: js.Array[Double],
      crops: js.Array[js.Array[Double]],
      blockShape: Double
  ): js.Array[Double] = js.native
}
