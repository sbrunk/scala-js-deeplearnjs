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

import _root_.io.brunk.tfjs.core.io.Router_registry.IORouter
import _root_.io.brunk.tfjs.core.io.types.IOHandler
import org.scalajs.dom.File

import scala.scalajs.js
import js.annotation._
import js.|
import scala.concurrent.Promise

@js.native
@JSGlobal
class BrowserDownloads protected () extends IOHandler {
  def this(fileNamePrefix: String = ???) = this()
  //def save(modelArtifacts: ModelArtifacts): Promise[SaveResult] = js.native
}

@js.native
@JSGlobal
object BrowserDownloads extends js.Object {
  def URL_SCHEME: String = js.native
}

@js.native
trait Browser_files extends js.Object {
  val browserDownloadsRouter: IORouter                          = js.native
  def browserDownloads(fileNamePrefix: String = ???): IOHandler = js.native
  def browserFiles(files: js.Array[File]): IOHandler            = js.native
}
