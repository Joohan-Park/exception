package chapter02;

import java.io.IOException;

public class MyClassTest {

	public static void main(String[] args) {
		MyClass myClass = new MyClass();
		
		try {
			myClass.dangerousMethod();
		}catch(IOException | MyException e){  //첫번째 방법
			e.printStackTrace();
		}
		
		
//			catch(Exception e){					//두번째 방법
//			e.printStackTrace();
//		}
		
		
		
//		catch (IOException e) {					//세번째 방법
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (MyException e){
//			e.printStackTrace();
//		}

	}

}