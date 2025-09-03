package week3.day1;

public class RemoveDuplicateWords {

	public static void main(String[] args) {
		String text="We learn Java basics as part of java sessions in java week1";
		String[] words=text.split(" ");
		int count=0;
		    for(int i=0;i<words.length;i++) {
			     for(int j=i+1;j<words.length;j++) {
				     if(words[i].equalsIgnoreCase(words[j])&& !words[i].equals("")){
					 words[j]="";
					 count++;
				}
				
			}
		}
		if(count>0) {
			System.out.println("Modified String after removing Duplicates:");
			    for(String word:words)
			    {
			    	if(!word.equals(""))
			    	{
			    		System.out.println(word+" ");
			    		
			    	}
			    }
			 }
		   else {
			   System.out.println("No Duplicates found.");
		   }
		

	}

}
