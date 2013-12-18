import java.io.*;

public class BinaryOutputDemo 
{
	public static void main(String [] args)
	{
		try
		{
			ObjectOutputStream outputStream = 
				new ObjectOutputStream(new FileOutputStream("numbers.dat"));
			
			int i;
			for (i = 0; i < 5; i++)
				outputStream.writeInt(i);
			
			System.out.println("Numbers written to the file numbers.dat");
			outputStream.close();
		}
		catch(IOException e)
		{
			System.out.println("Problems with file output.");
		}
	}
}
