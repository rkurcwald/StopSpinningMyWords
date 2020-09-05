package com.github.rkurcwald;

public class SpinWords {
	 
	public String spinWords(String sentence) 
	{
		String end="", Space=" ";  
		String[] words = sentence.split(" ");
		    
		int howManyWords=words.length;
		for(int i=0;i<howManyWords;i++)
		{
			if(i==howManyWords-1)
			{
				Space="";
			}
		    if(words[i].length()>=5)
		    {
		    	StringBuilder sb=new StringBuilder(words[i]);
		    	end+=sb.reverse().toString()+Space;
		    }
		    else
		    {
		    	end+=words[i]+Space;
		    }
		}
		return end;
	}
}
