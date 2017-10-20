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

package io.brunk.deeplearnjs.graph

import scala.scalajs.js
import scala.scalajs.js.annotation._

@js.native
  @JSGlobal
  class PriorityQueue[T] protected () extends js.Object {
    def this(comparator: Comparator[T], indexObserver: IndexObserver[T] = ???) = this()
    def enqueue(t: T): Unit                  = js.native
    def dequeue(): T                         = js.native
    def update(newT: T, index: Double): Unit = js.native
    def empty(): Boolean                     = js.native
  }

  @js.native
  @JSGlobalScope
  object Priority_queue extends js.Object {
    def defaultCompare[T](a: T, b: T): Double = js.native
    type Comparator[T]    = js.Function2[T, T, Double]
    type IndexObserver[T] = js.Function2[T, Double, Unit]
  }
