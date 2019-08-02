package employee;

class Controller implements ControllerBase {

	//mainメソッド
	public void main() {

		boolean flag = true;
		while (flag) {

			//printInputMenuメソッドの呼び出し
			VIEW.printInputMenu();
			/*
			 * 1.全従業員表示  2.各従業員表示  3.従業員登録
			 *
			 * 4.従業員修正  5.従業員削除  0.終了
			 *
			 */
			switch(prinInputMenu()) {
			case 1 :
				selectAllEmpData();
				break;

			case 2 :
				selectOneEmpData();
				break;

			case 3 :
				insertOneEmpData();
				break;

			case 4 :
				updateOneEmpData();
				break;

			case 5 :
				deleteOneEmpData();
				break;

			case 0 :
				flag = false;

				break;
			}

		}

		//selectAllEmpDataメソッド(オーバーライド)
		@Override
		public abstract void selectAllEmpData() {

		};

		//selectOneEmpDataメソッド(オーバーライド)
		@Override
		public abstract void selectOneEmpData() {

		};

		//insertOneEmpDataメソッド(オーバーライド)
		@Override
		public abstract void insertOneEmpData() {

		};

		//updateOneEmpDataメソッド(オーバーライド)
		@Override
		public abstract void updateOneEmpData() {

		};

		//deleteOneEmpDataメソッド（オーバーライド）：結果を表示させる
		@Override
		public abstract void deleteOneEmpData() {

		};

	}

}
