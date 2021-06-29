package org.straya

import org.straya.ast.RootNode


class StrayaGenerator extends ClassLoader {

  def generate(strayaCode: String, filename: String): (Array[Byte], RootNode) = {
    val parser = new StrayaParser
    val rootNode = parser.parse(strayaCode)
    (rootNode.generateByteCode(filename), rootNode)
  }
}
