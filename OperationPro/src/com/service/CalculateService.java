package com.service;

import java.util.ArrayList;
import java.util.List;

import com.model.Fraction;

public class CalculateService {
	
	public Fraction calculate(List l){
		
		int muldiv = MulDivExist(l);
		if(muldiv != -1){
			MulDiv(l,muldiv);
		}else {
			AddSub(l);
		}
		if (l.size() == 1) {
            return (Fraction) l.get(0);
        }
		return calculate(l);
	}
	
	
	public int MulDivExist(List list){
		for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals("*") || list.get(i).equals("/")) {
                return i;
            }
        }
        return -1;
		
	}
	
	public void MulDiv(List l,int muldiv){
		String fuhao = (String) l.remove(muldiv);
		Fraction first = (Fraction) l.get(muldiv-1);
        Fraction last = (Fraction) l.get(muldiv);
        l.remove(muldiv);
        if (fuhao.equals("*")) {
            l.set(muldiv - 1,first.muti(last));
        }
        if (fuhao.equals("/")) {
            l.set(muldiv - 1,first.div(last));
        }
	}
	
	public void AddSub(List list){
		for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals("+")) {
            	Fraction first = (Fraction) list.get(i-1);
                list.remove(i);
                Fraction last = (Fraction) list.get(i);
                list.remove(i);
                list.set(i - 1, first.add(last));
                i--;
            }
            if (list.get(i).equals("-")) {
            	Fraction first = (Fraction) list.get(i-1);
                list.remove(i);
                Fraction last = (Fraction) list.get(i);
                list.remove(i);
                list.set(i - 1, first.sub(last));
                i--;
            }
        }
	}
}
