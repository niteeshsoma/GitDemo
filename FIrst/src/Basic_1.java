import java.util.Arrays;
import java.util.HashMap;
import java.util.Random;

public class Basic_1 {

	public static void main(String[] args) {
		//swap
		// a=a+b b=a-b a=a-b
		//a=a*b b=a/b a=a/b
		
		//2nd largest no
		int array[] = {10, 20, 25, 63, 96, 57};
	      int size = array.length;
	      Arrays.sort(array);
	      System.out.println("sorted Array ::"+Arrays.toString(array));
	      int res = array[size-2];
	      System.out.println("2nd largest element is ::"+res);
		
		//reverse no and palindrome no
		int num=12321,rev=0;
		int org=num;
		while(num!=0) {
			rev=rev*10+num%10;
			num=num/10;
		}
		System.out.println(rev);
		if(org==rev) 
		    System.out.println(org+"palindrome"); 
		  else System.out.println(org+"not a palindrome");
		
		//StringBuffer no
		int a=100;
		StringBuffer sbr = new StringBuffer(String.valueOf(a));
		StringBuffer revs= sbr.reverse();
		System.out.println(revs);
		
		//String Builder no
		int b=1213;
		StringBuilder sb = new StringBuilder();
		sb.append(b);
		System.out.println(sb.reverse());
		
		//reverse string and palindrome str
		String s = "MaDAM";
		String o=s;
		String re="";
		int len = s.length();
		for(int i=len-1;i>=0;i--) {
			re=re+s.charAt(i);
		}
		System.out.println(re);
		if(o.equalsIgnoreCase(re)){
			System.out.println("Plind");
		}
		else System.out.println("not");
		
		//StringBuffer string
		StringBuffer sb1=new StringBuffer(s);
		System.out.println(sb1.reverse());
		
		//count no of digits
		int numb=12345;
		int count=0;
		while(numb>0) {
			numb=numb/10;
			count++;
		}
		System.out.println(count);
		
		//count arr eve odd
		int zx[]= {1,2,3,4,3};
		int eve=0,odd=0;
		for(int i=0;i<zx.length;i++) {
			if(zx[i]%2==0) eve++;
			else odd++;
	}
	System.out.println("even"+eve+"\n"+odd);	
	
	//count eve odd
	int as=123434;
	int e=0,od=0;
	while(as!=0) {
		int rem=as%10;
		if(rem%2==0) e++;
		else od++;
		as=as/10;
	}
	System.out.println("eve"+e+"  od"+od);
	//sum of array
	int nit[]= {1,2,3,4};
	int sum12=0;
	System.out.println("sum of array");
	for(int i=0;i<nit.length;i++) {
		sum12=sum12+nit[i];
	}
	System.out.println(sum12);
	
	//sum of digits
	int asd=1234;
	int sum=0;
	while(asd!=0) {
		sum = sum+asd%10;
		asd=asd/10;
	}
	System.out.println("sum"+sum);
	
	//fibonnacci
	int n1=0,n2=1;
	int sum1=0;
	System.out.println(n1+"\n"+n2);
	for(int i=2;i<10;i++) {
		sum1=n1+n2;
		System.out.println(sum1);
		n1=n2;
		n2=sum1;
	}
	
//random no gen
	Random rand = new Random();
	int ra = rand.nextInt(100);
	System.out.println(ra);
	System.out.println(Math.random());

	//factorial
	int g=5,fact=1;
	for(int i=1;i<=g;i++) {
		fact=fact*i;
		System.out.println(fact);
	}
	
	//arrays are equal
	int an[]= {1,2,3,4,5,6};
	int bn[]= {1,2,3,4,5,6};
	boolean status = Arrays.equals(an, bn);
	if(status==true) {
		System.out.println("arrays equal");
	}
	else System.out.println("not equal");
	
	//find missing no in array
	int ad[]= {1,2,3,5,6};
	int sum2 = 0;
	for(int i=0;i<ad.length;i++) {
		
		sum2=sum2+ad[i];
	}
	System.out.println(sum2);
	int sum3=0;
	for(int i=0;i<=6;i++) {
		sum3=sum3+i;
	}
	System.out.println(sum3);
	System.out.println(sum3-sum2);
	//max of array
	int max=ad[0];
	for(int i=0;i<ad.length;i++) {
		if(ad[i]>max) {
			max=ad[i];
		}
	}
	System.out.println(max);
	
	//duplicates in array
	String ar[]= {"C","C++","java"};
	boolean flag=false;
	for(int i=0;i<ar.length;i++) {
		for(int j=i+1;j<ar.length;j++) {
			if(ar[i]==ar[j]) {
				System.out.println("Found Dup "+ar[i]);
				flag=true;
			}
		}
	}
	if(flag==false) {
		System.out.println("No dup");
	}
	
	//string duplicates
	String v1="aassddfsab";
	char[] strArr=v1.toCharArray();
	StringBuilder sb3 = new StringBuilder();
	//System.out.println("dup in strings");
	for(int i=0;i<strArr.length;i++) {
		boolean repeated= false;
		for(int j=i+1;j<strArr.length;j++) {
			if(strArr[i]==strArr[j]) {
				repeated=true;
				break;
			}
			
		}
		if(repeated==false) {
			sb3.append(strArr[i]);
		}
	}
	System.out.println(sb3);
	
	String af="^$^@*$56324afjhb";
	System.out.println(af);
	af=af.replaceAll(("[^a-zA-Z0-9]"),"");
	System.out.println(af);
	//without using replace method 
	String str= "valuelabs";
    char[] strArr2=str.toCharArray();
    int len2 = strArr2.length;
    for(int i=0;i<len2;i++){
        if(strArr2[i]=='a'){
            strArr2[i]='1';
            
        }
        
        System.out.println("without using replace method "+strArr2[i]);
    }
	
	
	//occurrences
	String sdf="niteesh";
	int tc=sdf.length();
	int toald=sdf.replace("e", "").length();
	System.out.println(toald);
	int cou = tc-toald;
	System.out.println(cou);
	
	//prime
	int ac=10;
	boolean isPrime = false;
	
	for(int i=2;i<ac;i++) {
		if(ac%i==0) {
			isPrime=false;
			break;
		} else {
			isPrime=true;
		}
	}
	if(isPrime) System.out.println(ac+" prime no");
	else System.out.println(ac+" is no prime\n");
	
	String gh[]= {"1","2","3","4"};
	System.out.println(gh.length);
	
	//string count
	String str1 = "amith";
    int cot = 0;
    System.out.println("String: "+str1);
    for (int i = 0; i < str1.length(); i++) {
       if (Character.isLetter(str1.charAt(i)))
    	   cot++;
    }
    System.out.println("Letters: "+cot);
    
	//string count
    char[] strArr3 = str1.toCharArray();
    System.out.println("String count"+strArr3.length);
    
    //count occurrences
    String jk="cccaaannnbb";
    char[] strArr1=jk.toCharArray();
    HashMap<Character, Integer> map = new HashMap<>();
    for(int i=0;i<strArr1.length;i++) {
    	if(map.get(strArr1[i])==null) {
    		map.put(strArr1[i],1);
    	}
    	else {
    		int count1=map.get(strArr1[i]);
    		map.put(strArr1[i], ++count1);
    	}
    }
    System.out.println(map);
    //largest word in array
    String arr[] = {"niteesh","soma","niteeshsoma"};
	int max1 = arr[0].length();
	int index=0;
	for(int i=1;i<arr.length;i++) {
		if(arr[i].length()>max1) {
		index=i;
		max1=arr[i].length();
		}
	}
	System.out.println(arr[index]);
	
	//divide string into half and rev
	String s1="niteesh",rev2="",rev3="";
	//int len2=s1.length();
    String s1a = s1.substring(0, (s1.length()/2));
    System.out.println(s1a.length());
    int len3=s1a.length();
    String s1b = s1.substring( (s1.length()/2));
    System.out.println(s1b);
    System.out.println(s1a);
    for(int i=len3-1;i>=0;i--) {
    	rev2=rev2+s1a.charAt(i);
    }
    System.out.println(rev2);
   // System.out.println(rev3);
    
//    int arr5[] = {1,1,0,1,1,0,1};
//    String s2="";
//    int flip=0;
//    for(int i=0;i<arr5.length;i++) {
//    	if(i%2==0) {
//    		{
//    			if(s2.charAt(i)==0) flip++;
//    		}
//    	}
//    }
    
    //First non repeted char
    System.out.println("First non repeted char in a string");
    
    String nm="strees";
  //  char[] arr1=nm.toCharArray();
    //for(int i=0;i<arr1.length;i++)
    for(char i:nm.toCharArray()){
    	if(nm.indexOf(i)==nm.lastIndexOf(i)) {
    		System.out.println(i);
    		break;
    	}
    }
    int  arr4[]= {1,0,1,1,0,0};
    Arrays.sort(arr);
    System.out.println("Modified arr[] : "+ Arrays.toString(arr));
    
    System.out.println("orginal arr");
    for(int nume:arr4) {
    	System.out.println(" "+nume);
    }
    Arrays.sort(arr4);
    System.out.println("\nThe sorted array is: ");
    for(int nume:arr4) {
    	System.out.println(" "+nume);
    }
    
    String s3="niteesh";
    int count4 =0;
    char[] arr5=s.toCharArray();
    for(int i=0;i<arr5.length;i++){
        count4++;
        
    }
   
	}
}
