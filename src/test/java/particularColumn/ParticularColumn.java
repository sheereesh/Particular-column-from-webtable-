package particularColumn;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParticularColumn {

	public static void main(String[] args) {
		 WebDriverManager.chromedriver().setup();
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://omayo.blogspot.com/");
		 driver.manage().window().maximize();
		 int rows=driver.findElements(By.xpath("//table[@id=\"table1\"]//tbody//tr")).size();
		
		// System.out.println(rows);
		 
  
		 List<String> listData=new ArrayList<String>();
		  for(int i=1;i<=rows;i++) {
			  
			 for(int j=2;j<=2;j++) {
				String data=driver.findElement(By.xpath(" //table[@id=\"table1\"]//tbody//tr["+i+"]//td["+j+"]")).getText();
				 listData.add(data);
			 
			 }
		  }
			 
		  
		  int array[]=listData.stream().mapToInt(Integer::parseInt).toArray();
		  int max =array[0];
			 int min=array[0];
		  for(int i=0;i<array.length;i++) {
			  if(array[i]>max)  
				  max=array[i];
				 if(array[i]<min)
					 min=array[i];
			   
		  }
		  System.out.println("max number is "+max);
		  System.out.println("min number is "+min);
		  
		  
		 /* int array[]=listData.stream().mapToInt(Integer::parseInt).toArray();
		  for(int i=0;i<array.length;i++) {
			  System.out.println(array[i]);
		  }
		  /**
		  
		 /* int array[]=listData.stream().mapToInt(Integer::parseInt).toArray();
		  for(int arraynum:array) {
			  System.out.println(arraynum);
		  }**/
		 
		  /* for(int i=0;i<listData.size();i++) {
			  for(int j=i+1;j<listData.size();j++) {
				  if(array[i]>array[j]) {
					  temp=array[i];
					  array[i]=array[j];
					  array[j]=temp;
					  System.out.println(array[i]);
				  }
				  
			  }
		  }**/
		  
	/* String words=listData.toString();
		 char ch[]=words.toCharArray();
		  
		  for(int i=0;i<listData.size();i++) {
			  for(int j=0;j<listData.size();j++) {
				  if( ch[i]>ch[j]) {
					  
					  System.out.println(ch[i]);
				  }
				  
			  }
		  }**/
		 
/**for(String list:listData) {
	
	 char ch[]=list.toCharArray();
	 //Arrays.sort(ch);
	 System.out.println(ch);
	 }**/
	 
	/**int size =listData.size();
	//*	System.out.println(size);
		//8Object [] array=listData.toArray();
		 for(int i=array.length-1;i>=0;i--) {
		   System.out.println(array[i]);
		}**/
		  
		/*int [] array=new int [listData.size()];
	 for(int i=0;i<listData.size();i++) {
array[i]	= Integer.parseInt(listData.get(i));
if(array[i]>20) {
	System.out.println(array[i]);
}
 
	 }*/
		  
 /*int [] array=new int [listData.size()];
 listData.add(array);
 int temp=0;
 for(int i=0;i<listData.size();i++) {
	 for(int j=i+1;j<listData.size();j++)
		 
		 if(array[i]>array[j]) {
			 temp=array[i];
			 array[i]=array[j];
			 array[j]=temp;
			 System.out.println(array[i]);
		 }
 }*/
 
	 
 

	} 

	}

 
