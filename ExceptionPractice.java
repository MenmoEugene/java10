/*
��һ��Բ�κͳ����Ρ�
�����Ի�ȡ������������������ַǷ�����ֵ����Ϊ�ǻ�ȡ����������⡣
����ͨ���쳣����ʾ��
���ж����������л�����ơ�

*/
class NoValueException extends RuntimeException
{
	NoValueException(String message)
	{
		super(message);
	}
}

interface Shape
{
	void getArea();
}

class Rec implements Shape
{
	private int len,wid;
	Rec(int len,int wid)
	{
		if (len<=0||wid<=0)
			throw new NoValueException("���ַǷ�ֵ");
		this.len = len;
		this.wid = wid;
	}
	public void getArea()
	{
		System.out.println(len*wid);
	}
}
class Circle implements Shape
{
	private int radius;
	public static final double PI = 3.14;
	Circle(int radiuds)
	{
		if (radius<=0)
			throw new RuntimeException("�Ƿ���ֵ");
		this.radius = radius;
	}
	public void getArea()
	{
		System.out.println(radius*PI);
	}
}
class ExceptionPractice
{
	public static void main(String[] args) 
	{
		Rec r = new Rec(-3,4);
		r.getArea();
		System.out.println("over");

		Circle c = new Circle(-6);
		System.out.println("over");
	}
}
