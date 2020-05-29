package fix

import firrtl._
import firrtl.ir._

object Firrtl {
  def matchIR(node: FirrtlNode): FirrtlNode = node match {
    case Reference(name, tpe, _, _) => Reference(name, tpe)
    case SubField(e, field, tpe, _) => SubField(e, field, tpe)
    case SubIndex(e, idx, tpe, _) => SubIndex(e, idx, tpe)
    case SubAccess(e, idxer, tpe, _) => SubAccess(e, idxer, tpe)
    case DefInstance(info, name, mod, _) => DefInstance(info, name, mod)
    case ir.Reference(name, tpe, _, _) => ir.Reference(name, tpe)
    case ir.SubField(e, field, tpe, _) => ir.SubField(e, field, tpe)
    case ir.SubIndex(e, idx, tpe, _) => ir.SubIndex(e, idx, tpe)
    case ir.SubAccess(e, idxer, tpe, _) => ir.SubAccess(e, idxer, tpe)
    case ir.DefInstance(info, name, mod, _) => ir.DefInstance(info, name, mod)
    case firrtl.ir.Reference(name, tpe, _, _) => firrtl.ir.Reference(name, tpe)
    case firrtl.ir.SubField(e, field, tpe, _) => firrtl.ir.SubField(e, field, tpe)
    case firrtl.ir.SubIndex(e, idx, tpe, _) => firrtl.ir.SubIndex(e, idx, tpe)
    case firrtl.ir.SubAccess(e, idxer, tpe, _) => firrtl.ir.SubAccess(e, idxer, tpe)
    case firrtl.ir.DefInstance(info, name, mod, _) => firrtl.ir.DefInstance(info, name, mod)
    case n => n
  }
}
