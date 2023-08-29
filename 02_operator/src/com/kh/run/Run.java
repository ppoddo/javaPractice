package com.kh.run;

import com.kh.operater.A_LogicalNegation;
import com.kh.operater.B_InDecrease;
import com.kh.operater.C_Arithmetic;
import com.kh.operater.D_Comparison;
import com.kh.operater.E_Logical;
import com.kh.operater.F_Triple;

public class Run {

	public static void main(String[] args) {
			A_LogicalNegation aln = new A_LogicalNegation();
//			aln.method();
			
			B_InDecrease bid = new B_InDecrease();
//			bid.method1();
//			bid.method2();
//			bid.method3();
			
			C_Arithmetic ca = new C_Arithmetic();
//			ca.method();
			
			D_Comparison co = new D_Comparison();
//			co.method();
			
			E_Logical el = new E_Logical();
//			el.method1();
//			el.method2();
		
			F_Triple tr = new F_Triple();
			tr.method();
		
	}

}
