package com.service;

import java.util.Iterator;
import java.util.List;

import com.model.Fraction;

/*
 * 分数的工具类
 */
public class FractionService {

	//查重，若有重复那就返回ture
	public boolean isRepeat(List<List<String>> list, List<String> set) {

		if (list.size() <= 0) {
			return false;
		}
		
		Iterator<String> iterator = set.iterator();

		
		for (List l_set : list) {
			if (l_set == null || l_set.size() != set.size() || l_set.size() <= 0 || set.size() <= 0) {
				continue;
			}
			int i = 0;
			while(iterator.hasNext()){
				if(l_set.contains(iterator.next())){
					i = i+1;
				}
			}
			
			if(i == set.size()){
				return true;
			}
			
		}

		return false;
	}
	
	/*
	 * 判断除数是否为0，判断分数是否为0
	 * 不合规则返回false
	 */
	public boolean isrule(List list,int num){
		
		for(int i = 0;i<list.size();i++){
			if(i%2 == 0){
				Fraction fraction = (Fraction)list.get(i);
				if(fraction.getDenominator() == 0){
					return false;
				}
			}else{
				String flag = (String)list.get(i);
				if("/".equals(flag)){
					Fraction fraction = (Fraction)list.get(i+1); 
					if(fraction.getDenominator() ==0 || fraction.getNominator()==0){
						return false;
					}
				}
			}
		}
		return true;
		
	}
	
	
}
