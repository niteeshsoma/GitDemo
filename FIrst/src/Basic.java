import java.util.Arrays;

public class Basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//reverse()palind string
		String str="mada",rev="";
		String s=str;
		int len=str.length();
		for(int i=len-1;i>=0;i--) {
			rev=rev+str.charAt(i);
		}
		if(s.equalsIgnoreCase(rev)) {
			System.out.println("Palindrom");
		}
		else System.out.println("not palind");
		
		//reverse no (palind)
		int num=1232,re = 0;
		int a=num;
		while(num!=0) {
			re=re*10+num%10;
			num=num/10;
		}
		if(a==re) System.out.println(a+"palindrome");
		else System.out.println(a+"not palind");
		
		//count
		int n=1232;
		int count=0;
		while(n>0) {
			n=n/10;
			count++;
		}
		System.out.println(count);
		
		//replace
		String x="29348*&$^@#*abcA";
		System.out.println(x);
		String sn=x.replaceAll("[^a-zA-Z0-9]","");
		System.out.println(sn);
		
		//array duplicate
		String arr[]= {"C","java","C++"};
		boolean flag=false;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i].equalsIgnoreCase(arr[j])) {
					System.out.println(arr[i]+"Duplicate found");
					flag=true;
				}
			}
		}
		if(flag==false) {
			System.out.println("No duplicate");
		}
		
		//no missing
		int ar[]= {1,2,3,4,6,7};
		int sum=0;
		int sum2=0;
		for(int i=0;i<=7;i++) {
			sum=sum+i;
		}
		System.out.println("Full sum"+sum);
		for(int i=0;i<ar.length;i++) {
			sum2=sum2+ar[i];
		}
		System.out.println("del sum"+sum2);
		int sf=0;
		sf=sum-sum2;
		System.out.println("missing no"+sf);
		
		//occurrences
		//Input:  ccccOddEEEccABA

		//Output: c4O1d2E3c2A1B1A1
		for (int i = 0; i < s.length(); i++) 
		{
	 
	            // Counting occurrences of s[i]
	            int coun = 1;
	            while (i + 1 < s.length() && s.charAt(i)== s.charAt(i + 1))
			 {
	                	i++;
	                	count++;
	            	}
	            System.out.print(s.charAt(i) + "" + coun + " ");
        
		}

		//sort dropdown
	/*	public class TestDrpdownSorted {
		    @Test
		    public void runTestOnDocker() throws Exception {
					String driverPath = "D:PATHchromedriver.exe";
					System.setProperty("webdriver.chrome.driver", driverPath);

					WebDriver driver = new ChromeDriver();
					driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");

					WebElement element = driver.findElement(By.xpath("//select[@id='animals']"));
					Select se = new Select(element);
					List<String> originalList = new ArrayList();
					for (WebElement e : se.getOptions()) {
						originalList.add(e.getText());
					}
					//----logic block starts
					List<String> tempList= originalList;
					Collections.sort(tempList);
					Assert.assertEquals(tempList, originalList);
					//----logic ends starts
		    }
		}*/
		
	
	
		
	}

}
