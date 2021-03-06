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

package io.brunk.tfjs.core.io

import scala.scalajs.js
import js.annotation._
import scala.scalajs.js.typedarray.ArrayBuffer
import _root_.io.brunk.tfjs.core.io.types.{
  IOHandler,
  ModelArtifacts,
  SaveResult,
  WeightsManifestEntry
}

@js.native
@JSGlobalScope
object Passthrough extends js.Object {
  def fromMemory(
      modelTopology: js.Any,
      weightSpecs: js.Array[WeightsManifestEntry] = ???,
      weightData: ArrayBuffer = ???
  ): IOHandler                                                                          = js.native
  def withSaveHandler(saveHandler: js.Function1[ModelArtifacts, SaveResult]): IOHandler = js.native
}
