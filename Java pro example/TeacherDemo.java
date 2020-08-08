/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

// overloading and overridding
class Teacher 
{
    int s = 0;
      
    int increment()
    {
        s = s + 1;
        return s;
    }
}
public class TeacherDemo
{	public static void main(String reddy[])	
	{
            Teacher t1;       // declaration 
            t1 = new Teacher();
            t1.s =Integer.parseInt(reddy[3]);
			
            System.out.println(t1.increment());     
	}
}
