package com.hadoop.hive;

import org.apache.hadoop.hive.ql.exec.UDF;
import org.apache.hadoop.io.Text;

public class EmailContactUDF extends UDF{
   
	public Text evaluate(Text inp){
		char[] ch = inp.toString().toCharArray();
		if(inp.toString()==null){
			return inp;
		}
		else{
			for(int i=0;i<inp.toString().length();i++){
				ch[i]='*';
			}
			return new Text(String.valueOf(ch));
		}
 }
}
