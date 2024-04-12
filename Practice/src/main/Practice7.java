// int 型の変数 x、y に任意の数値を代入し
// x の値を y に、y の値を x に入れ替えて 
// x と y の値を表示するプログラムを作成しなさい

package main;

public class Practice7 {

	public static void main(String[] args) {
		
		// xyだけだと、出力結果が全て7になってしまうため、tなどの文字を追加
		int x, y, t;
		
		x = 3;
		y = 7;
		
		t = x;
		x = y;
		y = t;
		
		System.out.println("x=" + x + ",y=" + y);

	}

}
