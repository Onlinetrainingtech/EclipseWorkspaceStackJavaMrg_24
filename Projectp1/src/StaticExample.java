class Levels
{
	static int gameScore=0;
	Levels()
	{
		gameScore++;
		System.out.println(gameScore);
	}
}
public class StaticExample {

	public static void main(String[] args) {
		
		new Levels();//Leve1-1
		new Levels();//Leve2-2

	}

}
