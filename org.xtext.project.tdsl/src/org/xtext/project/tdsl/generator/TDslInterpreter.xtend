/*
 * generated by Xtext 2.34.0
 */
package org.xtext.project.tdsl.generator

import thymio_DSL.ArithmeticExpression

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class TDslInterpreter {

	def Object interpret(ArithmeticExpression e) {
//		if (e.left == null || e.right == null) {
//			throw new IllegalArgumentException("Arithmetic expression cannot have null operands")
//		}

		val left = e.left
		val right = e.right

		switch (e.operator) {
			case '+': {
//            if (left instanceof String || right instanceof String) {
//                left.toString + right.toString
//            } else if (left instanceof Integer && right instanceof Integer) {
//                (left as Integer) + (right as Integer)
//            } else {
//                throw new IllegalArgumentException("Unsupported operand types for +: " + left.getClass().getSimpleName() + " and " + right.getClass().getSimpleName())
//            }
				left + right
			}
			case '-': {
//            if (left instanceof Integer && right instanceof Integer) {
//                (left as Integer) - (right as Integer)
//            } else {
//                throw new IllegalArgumentException("Unsupported operand types for -: " + left.getClass().getSimpleName() + " and " + right.getClass().getSimpleName())
//            }
				left - right
			}
			case '*': {
//            if (left instanceof Integer && right instanceof Integer) {
//                (left as Integer) * (right as Integer)
//            } else {
//                throw new IllegalArgumentException("Unsupported operand types for *: " + left.getClass().getSimpleName() + " and " + right.getClass().getSimpleName())
//            }
				left * right

			}
			case '/': {
//            if (left instanceof Integer && right instanceof Integer) {
//                (left as Integer) / (right as Integer)
//            } else {
//                throw new IllegalArgumentException("Unsupported operand types for /: " + left.getClass().getSimpleName() + " and " + right.getClass().getSimpleName())
//            }
				left / right

			}
			case 'mod': {
//            if (left instanceof Integer && right instanceof Integer) {
//                (left as Integer) % (right as Integer)
//            } else {
//                throw new IllegalArgumentException("Unsupported operand types for mod: " + left.getClass().getSimpleName() + " and " + right.getClass().getSimpleName())
//            }
				left % right

			}
			default: {
				throw new IllegalArgumentException("Unsupported operator: " + e.operator)
			}
		}
	}

}
