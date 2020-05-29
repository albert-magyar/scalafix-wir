/*
rule = FirrtlUnapplyOldIR
 */
package fix

import firrtl._
import firrtl.ir._

object Firrtl {
  def matchIR(node: FirrtlNode): FirrtlNode = node match {
    case Reference(name, tpe) => Reference(name, tpe)
    case SubField(e, field, tpe) => SubField(e, field, tpe)
    case SubIndex(e, idx, tpe) => SubIndex(e, idx, tpe)
    case SubAccess(e, idxer, tpe) => SubAccess(e, idxer, tpe)
    case DefInstance(info, name, mod) => DefInstance(info, name, mod)
    case ir.Reference(name, tpe) => ir.Reference(name, tpe)
    case ir.SubField(e, field, tpe) => ir.SubField(e, field, tpe)
    case ir.SubIndex(e, idx, tpe) => ir.SubIndex(e, idx, tpe)
    case ir.SubAccess(e, idxer, tpe) => ir.SubAccess(e, idxer, tpe)
    case ir.DefInstance(info, name, mod) => ir.DefInstance(info, name, mod)
    case firrtl.ir.Reference(name, tpe) => firrtl.ir.Reference(name, tpe)
    case firrtl.ir.SubField(e, field, tpe) => firrtl.ir.SubField(e, field, tpe)
    case firrtl.ir.SubIndex(e, idx, tpe) => firrtl.ir.SubIndex(e, idx, tpe)
    case firrtl.ir.SubAccess(e, idxer, tpe) => firrtl.ir.SubAccess(e, idxer, tpe)
    case firrtl.ir.DefInstance(info, name, mod) => firrtl.ir.DefInstance(info, name, mod)
    case n => n
  }
}
