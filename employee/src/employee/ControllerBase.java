package employee;

interface ControllerBase {
	VIEW=new View();
	DAO=new Dao();

	public abstract void selectAllEmpData() ;

	//selectOneEmpDataメソッド(オーバーライド)
	public abstract void selectOneEmpData() ;

	//insertOneEmpDataメソッド(オーバーライド)
	public abstract void insertOneEmpData() ;

	//updateOneEmpDataメソッド(オーバーライド)
	public abstract void updateOneEmpData() ;

	//deleteOneEmpDataメソッド（オーバーライド）：結果を表示させる
	public abstract void deleteOneEmpData() ;
}
