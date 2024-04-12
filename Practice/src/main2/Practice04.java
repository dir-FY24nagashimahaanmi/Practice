// int 型の変数 x、y にそれぞれ数値を入力し
// x が ｙ より大きい場合には“xはyより大きい”
// x が y より小さい場合には“xはyより小さい”
// x と y が等しい場合には“xとyは等しい”と表示するプログラムを作成しなさい

package main2;

public class Practice04 {

	public static void main(String[] args) {
		int x = 10;
		int y = 10;
		
		if (x == y)
			System.out.println("xとyは等しい。");
		
		else if(x > y)
			System.out.println("xはyより大きい。");
		
		else
			System.out.println("xはyより小さい。");


	}

}
