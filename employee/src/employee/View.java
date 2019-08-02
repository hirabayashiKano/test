package employee;

import java.util.ArrayList;
import java.util.Scanner;

class View {

	//スキャナーを準備
	Scanner scanner = new Scanner(System.in);

	//メソッドを作成
	//メニュー表示と入力
	void printInputMenu(){

		System.out.println("目的を選択してください");
		System.out.println("1.全従業員表示、2.各従業員表示、3.従業員登録");
		System.out.println("4.従業員修正、5.従業員削除、0.終了");
		System.out.print("回答：");
		int answer = scanner.nextInt();

	}

	//終了表示
	void end(){

	}

	//結果表示
	void printResult(String resultWord,ArrayList<EmployeeData> list){

	}

	//エラー表示
	void printError(String errorWord){

	}

	//従業員ID表示
	String inputEmpld(){

		return;
	}

	//従業員情報表示
	EmployeeData inputEmpInfo(String info){

		return;
	}

}
