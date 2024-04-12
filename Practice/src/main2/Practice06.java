// 整数値を入力し
// 以下の４つの分類から該当するものを表示するプログラムを作成しなさい
// “正の偶数”、“正の奇数”、“負の偶数”、“負の奇数”

package main2;

public class Practice06 {

	public static void main(String[] args) {
		int x = 17;
		
	if((x % 2) == 0)
	{
	   if(x >= 0)
		   System.out.println("正の偶数");
	   else 
		   System.out.println("負の偶数");
	}
	
	if((x % 2)== 1)
	{
		if(x >= 0)
			System.out.println("正の奇数です");
		else
			System.out.println("負の奇数です");
	}
		
	

	}

}
