package employee;

import java.time.LocalDate;

class EmployeeData {
	private int no; 				//no
	private String empld; 			// 従業員ID
	private String empName; 		//氏名
	private LocalDate empBirthday; 	//生年月日

	//noのgetter,setter
	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	//従業員IDのgetter,setter
	public String getEmpld() {
		return empld;
	}

	public void setEmpld(String empld) {
		this.empld = empld;
	}

	//氏名のgetter,setter
	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	//生年月日のgetter,setter
	public LocalDate getEmpBirthday() {
		return empBirthday;
	}
	public void setEmpBirthday(LocalDate empBirthday) {
		this.empBirthday = empBirthday;
	}

}
