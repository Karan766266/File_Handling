//**NOTE**
//File Handling="In File Handling File Class is used to handles the file by creating File class object"
//FileOutputStream(File f1) class is used to write the content in the file by creating object of this class we can write the content in file
//FileOutputStream(File f1,boolean append)this class is used to keep the previous content in the file as it is and add new content
//FileOutputStream(String filepath)
//FileOutputStream(String filepath boolean append)

import java.io.*;
class FileHandel
{
	public static void main(String []args) throws IOException
	{
		File f1 =new File ("a.txt");
		FileOutputStream fo1 = new  FileOutputStream(f1,true);
		
		String s1="Pune";
		char ch[]=s1.toCharArray();
	int i;
	for(i=0;i<ch.length;i++)
	{
		fo1.write(ch[i]);
	}
	fo1.close();
	}
}