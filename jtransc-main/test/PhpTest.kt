/*
 * Copyright 2016 Carlos Ballesteros Velasco
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import big.BigTest
import com.jtransc.gen.php.PhpTarget
import jtransc.micro.MicroHelloWorld
import org.junit.Ignore
import org.junit.Test

class PhpTest : _Base() {
	override val DEFAULT_TARGET = PhpTarget()

	@Ignore
	@Test fun testMicroHelloWorld() = testClass(Params(clazz = MicroHelloWorld::class.java, minimize = false, log = false, treeShaking = true))

	@Ignore
	@Test fun testBig() = testClass(Params(clazz = BigTest::class.java, minimize = false, log = false, treeShaking = true))
}